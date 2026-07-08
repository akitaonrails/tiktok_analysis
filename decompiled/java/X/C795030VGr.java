package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795030VGr implements InterfaceC795090VGx {
    public static final /* synthetic */ int LLILZ = 0;
    public final Context LL;
    public final Map<String, InterfaceC795090VGx> LLILLJJLI = new HashMap();
    public final Object LLILLL = new Object();

    static {
        C0VI8.LIZIZ("CommandHandler");
    }

    public final boolean LIZJ() {
        boolean z;
        synchronized (this.LLILLL) {
            try {
                z = !((HashMap) this.LLILLJJLI).isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public C795030VGr(Context context) {
        this.LL = context;
    }

    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Intent LIZIZ(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        synchronized (this.LLILLL) {
            try {
                InterfaceC795090VGx interfaceC795090VGx = (InterfaceC795090VGx) ((HashMap) this.LLILLJJLI).remove(str);
                if (interfaceC795090VGx != null) {
                    interfaceC795090VGx.LIZLLL(str, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(int i, Intent intent, C795000VGo c795000VGo) throws Throwable {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Handling constraints changed %s", new Object[]{intent});
            c0vi8LIZ.getClass();
            Context context = this.LL;
            C795060VGu c795060VGu = new C795060VGu(context, i, c795000VGo);
            List<C0VIG> listLJ = ((C0VIH) c795000VGo.LLILZIL.LIZJ.LJIIIIZZ()).LJ();
            ArrayList<C0VIG> arrayList = (ArrayList) listLJ;
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it2.hasNext()) {
                C0VIK c0vik = ((C0VIG) it2.next()).LJIIIZ;
                z2 |= c0vik.LIZLLL;
                z3 |= c0vik.LIZIZ;
                z4 |= c0vik.LJ;
                if (c0vik.LIZ != EnumC794930VGh.NOT_REQUIRED) {
                    z = true;
                } else {
                    z = false;
                }
                z5 |= z;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            C2204961BRm.LJJJJI(context, intent2, new C0WZX("dTF6Tg0zW9KSQlgzTlyNa0aIFfXWYlAi1Tf//rVa1wWzM6QTUN9L/fkN9eJ3zAiPnlwXnGMLMMbj", new String[]{"01789"}));
            c795060VGu.LIZLLL.LIZJ(listLJ);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C0VIG c0vig : arrayList) {
                String str = c0vig.LIZ;
                if (jCurrentTimeMillis >= c0vig.LIZ() && (!c0vig.LIZIZ() || c795060VGu.LIZLLL.LIZ(str))) {
                    arrayList2.add(c0vig);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str2 = ((C0VIG) it3.next()).LIZ;
                Intent intentLIZIZ = LIZIZ(c795060VGu.LIZ, str2);
                C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                C786410Ut5.j4("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2});
                c0vi8LIZ2.getClass();
                C795000VGo c795000VGo2 = c795060VGu.LIZJ;
                c795000VGo2.LJFF(new RunnableC794990VGn(c795060VGu.LIZIZ, intentLIZIZ, c795000VGo2));
            }
            c795060VGu.LIZLLL.LIZLLL();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
            C786410Ut5.j4("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)});
            c0vi8LIZ3.getClass();
            c795000VGo.LLILZIL.LJIIJ();
            return;
        }
        Bundle bundleLIZ = LIZ(intent);
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (bundleLIZ != null && !bundleLIZ.isEmpty()) {
            try {
                if (bundleLIZ.get(strArr[0]) != null) {
                    if ("ACTION_SCHEDULE_WORK".equals(action)) {
                        String string = LIZ(intent).getString("KEY_WORKSPEC_ID");
                        C0VI8 c0vi8LIZ4 = C0VI8.LIZ();
                        C786410Ut5.j4("Handling schedule work for %s", new Object[]{string});
                        c0vi8LIZ4.getClass();
                        WorkDatabase workDatabase = c795000VGo.LLILZIL.LIZJ;
                        workDatabase.beginTransaction();
                        try {
                            C0VIG c0vigLJIIIIZZ = ((C0VIH) workDatabase.LJIIIIZZ()).LJIIIIZZ(string);
                            if (c0vigLJIIIIZZ == null) {
                                C0VI8 c0vi8LIZ5 = C0VI8.LIZ();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Skipping scheduling ");
                                sbLIZ.append(string);
                                sbLIZ.append(" because it's no longer in the DB");
                                C2188811AlT.LIZIZ(sbLIZ);
                                c0vi8LIZ5.getClass();
                            } else if (c0vigLJIIIIZZ.LIZIZ.isFinished()) {
                                C0VI8 c0vi8LIZ6 = C0VI8.LIZ();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Skipping scheduling ");
                                sbLIZ2.append(string);
                                sbLIZ2.append("because it is finished.");
                                C2188811AlT.LIZIZ(sbLIZ2);
                                c0vi8LIZ6.getClass();
                            } else {
                                long jLIZ = c0vigLJIIIIZZ.LIZ();
                                if (!c0vigLJIIIIZZ.LIZIZ()) {
                                    C0VI8 c0vi8LIZ7 = C0VI8.LIZ();
                                    C786410Ut5.j4("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(jLIZ)});
                                    c0vi8LIZ7.getClass();
                                    C795110VGz.LIZIZ(this.LL, c795000VGo.LLILZIL, string, jLIZ);
                                } else {
                                    C0VI8 c0vi8LIZ8 = C0VI8.LIZ();
                                    C786410Ut5.j4("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(jLIZ)});
                                    c0vi8LIZ8.getClass();
                                    C795110VGz.LIZIZ(this.LL, c795000VGo.LLILZIL, string, jLIZ);
                                    Intent intent3 = new Intent(this.LL, (Class<?>) SystemAlarmService.class);
                                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                                    c795000VGo.LJFF(new RunnableC794990VGn(i, intent3, c795000VGo));
                                }
                                workDatabase.setTransactionSuccessful();
                            }
                            workDatabase.endTransaction();
                            return;
                        } catch (Throwable th) {
                            workDatabase.endTransaction();
                            throw th;
                        }
                    }
                    if ("ACTION_DELAY_MET".equals(action)) {
                        Bundle bundleLIZ2 = LIZ(intent);
                        synchronized (this.LLILLL) {
                            try {
                                String string2 = bundleLIZ2.getString("KEY_WORKSPEC_ID");
                                C0VI8 c0vi8LIZ9 = C0VI8.LIZ();
                                C786410Ut5.j4("Handing delay met for %s", new Object[]{string2});
                                c0vi8LIZ9.getClass();
                                if (!((HashMap) this.LLILLJJLI).containsKey(string2)) {
                                    C795010VGp c795010VGp = new C795010VGp(this.LL, i, string2, c795000VGo);
                                    ((HashMap) this.LLILLJJLI).put(string2, c795010VGp);
                                    c795010VGp.LJFF();
                                } else {
                                    C0VI8 c0vi8LIZ10 = C0VI8.LIZ();
                                    C786410Ut5.j4("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string2});
                                    c0vi8LIZ10.getClass();
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        return;
                    }
                    if ("ACTION_STOP_WORK".equals(action)) {
                        String string3 = LIZ(intent).getString("KEY_WORKSPEC_ID");
                        C0VI8 c0vi8LIZ11 = C0VI8.LIZ();
                        C786410Ut5.j4("Handing stopWork work for %s", new Object[]{string3});
                        c0vi8LIZ11.getClass();
                        c795000VGo.LLILZIL.LJIIL(string3);
                        Context context2 = this.LL;
                        C0VI9 c0vi9 = (C0VI9) c795000VGo.LLILZIL.LIZJ.LIZJ();
                        C0VH0 c0vh0LIZ = c0vi9.LIZ(string3);
                        if (c0vh0LIZ != null) {
                            C795110VGz.LIZ(context2, c0vh0LIZ.LIZIZ, string3);
                            C0VI8 c0vi8LIZ12 = C0VI8.LIZ();
                            C786410Ut5.j4("Removing SystemIdInfo for workSpecId (%s)", new Object[]{string3});
                            c0vi8LIZ12.getClass();
                            c0vi9.LIZJ(string3);
                        }
                        c795000VGo.LIZLLL(string3, false);
                        return;
                    }
                    if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                        Bundle bundleLIZ3 = LIZ(intent);
                        String string4 = bundleLIZ3.getString("KEY_WORKSPEC_ID");
                        boolean z6 = bundleLIZ3.getBoolean("KEY_NEEDS_RESCHEDULE");
                        C0VI8 c0vi8LIZ13 = C0VI8.LIZ();
                        C786410Ut5.j4("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)});
                        c0vi8LIZ13.getClass();
                        LIZLLL(string4, z6);
                        return;
                    }
                    C0VI8 c0vi8LIZ14 = C0VI8.LIZ();
                    C786410Ut5.j4("Ignoring intent %s", new Object[]{intent});
                    c0vi8LIZ14.getClass();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError th2) {
            }
        }
        C0VI8 c0vi8LIZ15 = C0VI8.LIZ();
        C786410Ut5.j4("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"});
        c0vi8LIZ15.getClass();
    }
}
