package Y;

import X.C0V1I;
import X.C0V2K;
import X.C0V33;
import X.C0V3K;
import X.C0V41;
import X.C0V6R;
import X.C0VGA;
import X.C0WZX;
import X.C0XUE;
import X.C0XVC;
import X.C0XVI;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2257208ss;
import X.C791560V3i;
import X.C792310V6f;
import X.C792400V6o;
import X.C793550VAz;
import X.C793770VBv;
import X.C794230VDp;
import X.C794530VEt;
import X.C794620VFc;
import X.InterfaceC792320V6g;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.keepalive.KeepAliveReceiver;
import com.ss.android.ugc.aweme.login.ILoginUtilsService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS379S0200000_13;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS18S0100100_13 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0V41 c0v41 = (C0V41) this.l0;
        long j = this.j1;
        c0v41.getClass();
        try {
            int i = C0V2K.LIZ;
            String strLIZJ = C0V2K.LIZJ(SystemClock.uptimeMillis(), C0V2K.LIZIZ(0L, j));
            if (!TextUtils.isEmpty(strLIZJ)) {
                JSONObject jSONObjectLIZ = C791560V3i.LIZLLL().LIZ();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
                jSONObject.put("block_duration", Mp4ScreenVideoLoadTimeout.CONTROL);
                jSONObject.put("stack", strLIZJ);
                jSONObject.put("stack_key", "4194302\n");
                jSONObject.put(Scene.SCENE_SERVICE, "anr");
                jSONObject.put("cost_time", Mp4ScreenVideoLoadTimeout.CONTROL);
                jSONObject.put("method_time", Mp4ScreenVideoLoadTimeout.CONTROL);
                jSONObject.put("message", "anr");
                jSONObject.put("event_type", "lag_drop_frame");
                JSONObject jSONObjectLIZJ = C2257208ss.LIZ().LIZJ(true);
                jSONObjectLIZJ.put("crash_section", C792400V6o.LJII(System.currentTimeMillis()));
                jSONObjectLIZJ.put("trace_type", "ANR");
                jSONObject.put("custom", jSONObjectLIZ);
                jSONObject.put("filters", jSONObjectLIZJ);
                C792310V6f.LJIIIZ().LIZJ(new C0V1I("drop_frame_stack", jSONObject));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        for (C0V1I c0v1i : ((C0V41) this.l0).LJIILJJIL) {
            try {
                JSONObjectProtectorUtils.getJSONObject(c0v1i.LIZIZ, "filters").put("before_anr", "true");
                c0v1i.LIZJ = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            C792310V6f.LJIIIZ().LIZJ(c0v1i);
        }
        ((C0V41) this.l0).LJIILJJIL.clear();
    }

    public final void LIZ$1() {
        try {
            ((Function1) this.l0).invoke(Long.valueOf(this.j1));
            if (C0VGA.LJ) {
                int size = C0VGA.LIZIZ.size();
                Integer num = C0VGA.LIZ().logMaxSpanCount;
                if (size > (num != null ? num.intValue() : 400)) {
                    C0VGA.LJ = false;
                    C0V3K c0v3k = C0VGA.LIZLLL;
                    if (c0v3k != null) {
                        c0v3k.LIZ();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$2() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("looper_monitor", this.j1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", ((C0V33) this.l0).LIZ.LLJJIII);
            C793770VBv.LJII("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0280 A[Catch: JSONException -> 0x0322, all -> 0x03df, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0322, blocks: (B:35:0x01be, B:37:0x01e3, B:43:0x0203, B:47:0x0213, B:49:0x0280, B:58:0x02e9, B:57:0x02e6, B:41:0x01fe), top: B:86:0x01be, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02db A[Catch: all -> 0x02e5, TRY_LEAVE, TryCatch #5 {all -> 0x02e5, blocks: (B:50:0x029a, B:52:0x02b9, B:54:0x02c3, B:55:0x02db), top: B:96:0x029a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S0100100_13.LIZ$3():void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$4() {
        C794530VEt c794530VEt = ((C794620VFc) this.l0).LJ;
        long j = this.j1;
        if (!c794530VEt.LJI.get()) {
            c794530VEt.LJI.set(true);
            try {
                try {
                    c794530VEt.LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start_timestamp", c794530VEt.LIZ);
                    jSONObject.put("finish_timestamp", j);
                    jSONObject.put("is_finished", 1);
                    jSONObject.put("report_mode", 1);
                    jSONObject.put("insert_mode", 2);
                    jSONObject.put("log_type", "tracer");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trace_type", c794530VEt.LIZJ.LIZIZ);
                    jSONObject.put("movingline", jSONObject2);
                    c794530VEt.LIZJ(jSONObject, false);
                    Map<String, String> map = c794530VEt.LIZIZ;
                    if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
                        jSONObject.put("tags", new JSONObject(c794530VEt.LIZIZ));
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    Iterator it2 = ((CopyOnWriteArrayList) c794530VEt.LJ).iterator();
                    while (it2.hasNext()) {
                        jSONArray.put((JSONObject) it2.next());
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(new JSONObject().put("wrapper_array_data", jSONArray));
                    sbLIZ.append("");
                    C2188811AlT.LIZIZ(sbLIZ);
                    Context context = C792400V6o.LIZ;
                    final JSONObject jSONObjectPut = new JSONObject().put("wrapper_array_data", jSONArray);
                    C793550VAz c793550VAz = C793550VAz.LIZJ;
                    C794620VFc c794620VFc = c794530VEt.LIZJ;
                    if (c793550VAz.LIZ(c794620VFc.LIZ, c794620VFc.LJFF)) {
                        C0V6R c0v6r = new C0V6R(jSONObjectPut);
                        C794230VDp c794230VDp = c793550VAz.LIZ;
                        if (c794230VDp != null) {
                            C0VGA.LJIIIIZZ(new AwS379S0200000_13(c794230VDp.LIZ, c0v6r, 4));
                        }
                    } else {
                        C792310V6f c792310V6fLJIIIZ = C792310V6f.LJIIIZ();
                        C794620VFc c794620VFc2 = c794530VEt.LIZJ;
                        final String str = c794620VFc2.LIZ;
                        final boolean z = c794620VFc2.LJFF;
                        c792310V6fLJIIIZ.LIZJ(new InterfaceC792320V6g(str, jSONObjectPut, z) { // from class: X.0V6j
                            public final JSONObject LIZ;
                            public final String LIZIZ;
                            public final boolean LIZJ = false;
                            public final String LIZLLL = "batch_tracing";
                            public final boolean LJ;

                            @Override // X.InterfaceC792320V6g
                            public final boolean LIZIZ() {
                                return false;
                            }

                            @Override // X.InterfaceC792320V6g
                            public final String LIZLLL() {
                                return "tracing";
                            }

                            @Override // X.InterfaceC792320V6g
                            public final JSONObject LIZ() {
                                return this.LIZ;
                            }

                            @Override // X.InterfaceC792320V6g
                            public final String LJ() {
                                return this.LIZLLL;
                            }

                            @Override // X.InterfaceC792320V6g
                            public final boolean LIZJ(JSONObject jSONObject3) {
                                if ("app_launch_trace".equals(this.LIZIZ)) {
                                    return C790620Uzs.LIZ("start_trace");
                                }
                                if (!this.LJ) {
                                    if (C792750V7x.LIZIZ().LIZJ(this.LIZIZ, this.LIZJ) == 0) {
                                        return false;
                                    }
                                    return true;
                                }
                                return true;
                            }

                            {
                                this.LIZ = jSONObjectPut;
                                this.LIZIZ = str;
                                this.LJ = z;
                            }
                        });
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("error when BatchTracing end trace: ");
                    sbLIZ2.append(e.getLocalizedMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                ((CopyOnWriteArrayList) c794530VEt.LJ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((CopyOnWriteArrayList) c794530VEt.LJ).clear();
                throw th;
            }
        }
        ((C794620VFc) this.l0).LJ = null;
    }

    public static final void run$0(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("StackThread@c87f.forceReportLogData$1");
        try {
            aRunnableS18S0100100_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StackThread@c87f.forceReportLogData$1");
    }

    public static final void run$1(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("LoginRestartHook@566c.run$4");
        try {
            C0XVC.LIZIZ("LoginRestartHook", Long.valueOf(aRunnableS18S0100100_13.j1), (C0XVI) aRunnableS18S0100100_13.l0);
            ILoginUtilsService iLoginUtilsService = (ILoginUtilsService) PluggableExtentionKt.pluggableSpi$default(ILoginUtilsService.class, false, false, false, 14, null);
            if (iLoginUtilsService != null) {
                iLoginUtilsService.LIZ(((C0XVI) aRunnableS18S0100100_13.l0).LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginRestartHook@566c.run$4");
    }

    public static final void run$2(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("TraceKitManager@707.scheduleTaskSafety$1");
        try {
            aRunnableS18S0100100_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TraceKitManager@707.scheduleTaskSafety$1");
    }

    public static final void run$3(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("SlardarConfigFetcher@1ebb.updateCurrentConfig$1$reportCost$1");
        try {
            aRunnableS18S0100100_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlardarConfigFetcher@1ebb.updateCurrentConfig$1$reportCost$1");
    }

    public static final void run$4(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("RedBadgeController@5878.doSendRequest$1");
        try {
            aRunnableS18S0100100_13.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RedBadgeController@5878.doSendRequest$1");
    }

    public static final void run$5(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("TracingContext@bb15.endWithTime$1");
        try {
            aRunnableS18S0100100_13.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TracingContext@bb15.endWithTime$1");
    }

    public static final void run$6(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        Application application = (Application) aRunnableS18S0100100_13.l0;
        long j = aRunnableS18S0100100_13.j1;
        C1C7U.LIZ("KeepAliveBootstrap@815b.tryScheduleHint$1L");
        try {
            Intent intent = new Intent("com.ss.android.ugc.aweme.keepalive.action.HINT");
            intent.setClassName(application.getPackageName(), KeepAliveReceiver.class.getName());
            intent.putExtra("hold_ms", j);
            C2204961BRm.LJIL(application, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOGtZo/P0DsSaQDXmGqrLNSpKlFJ8oVrapnzMfg=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("KeepAliveBootstrap@815b.tryScheduleHint$1L");
    }

    public static final void run$7(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        long j = aRunnableS18S0100100_13.j1;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) aRunnableS18S0100100_13.l0;
        AtomicBoolean atomicBoolean = KeepAliveReceiver.LIZ;
        C1C7U.LIZ("KeepAliveReceiver@70ab.com_ss_android_ugc_aweme_keepalive_KeepAliveReceiver__onReceive$___twin___$1L");
        try {
            TimeUnit.MILLISECONDS.sleep(j);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        try {
            pendingResult.finish();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        KeepAliveReceiver.LIZ.set(false);
        C1C7U.LIZIZ("KeepAliveReceiver@70ab.com_ss_android_ugc_aweme_keepalive_KeepAliveReceiver__onReceive$___twin___$1L");
    }

    public static final void run$8(ARunnableS18S0100100_13 aRunnableS18S0100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("LoginMethodManager@cc23.updateLoginMethodsOnLogoutAsync$1");
        try {
            String uid = ((User) aRunnableS18S0100100_13.l0).getUid();
            if (uid != null && uid.length() != 0) {
                C0XUE c0xue = C0XUE.LIZ;
                c0xue.LJIIJJI(aRunnableS18S0100100_13.j1, ((User) aRunnableS18S0100100_13.l0).getUid());
                c0xue.LJIILJJIL((User) aRunnableS18S0100100_13.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginMethodManager@cc23.updateLoginMethodsOnLogoutAsync$1");
    }

    public ARunnableS18S0100100_13(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }

    public ARunnableS18S0100100_13(long j, long j2, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.$t = i;
        this.j1 = j2;
        this.l0 = pendingResult;
    }
}
