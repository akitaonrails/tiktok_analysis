package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VUW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUW {
    public static void LIZ(Context context) {
        C2407009bw.LIZ();
        if (!((Boolean) C305530ByJ.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        C0VUX c0vux = new C0VUX(context);
        AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(37);
        ArrayList<Pair> arrayList = new ArrayList();
        aFwS247S0000000_13.invoke(arrayList);
        for (Pair pair : arrayList) {
            String str = (String) pair.getFirst();
            if (c0vux.LIZ.put(str, (InterfaceC798580VUi) pair.getSecond()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot set two FluencyTracer.Factory with same scene ");
                sbLIZ.append(str);
                sbLIZ.append('.');
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        AFwS247S0000000_13 aFwS247S0000000_132 = AFwS247S0000000_13.get$arr$(38);
        ArrayList arrayList2 = new ArrayList();
        aFwS247S0000000_132.invoke(arrayList2);
        ((ArrayList) c0vux.LIZIZ).addAll(arrayList2);
        AFwS247S0000000_13 aFwS247S0000000_133 = AFwS247S0000000_13.get$arr$(39);
        ArrayList arrayList3 = new ArrayList();
        aFwS247S0000000_133.invoke(arrayList3);
        ((ArrayList) c0vux.LIZJ).addAll(arrayList3);
        AFwS247S0000000_13 aFwS247S0000000_134 = AFwS247S0000000_13.get$arr$(40);
        ArrayList arrayList4 = new ArrayList();
        aFwS247S0000000_134.invoke(arrayList4);
        ((ArrayList) c0vux.LIZLLL).addAll(arrayList4);
        c0vux.LJ = new Executor() { // from class: X.0V5U
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C0V1A c0v1aLIZJ = C0V1A.LIZJ();
                if (runnable != null) {
                    C786410Ut5.LJJZZIII(c0v1aLIZJ.LIZLLL(), runnable);
                } else {
                    c0v1aLIZJ.getClass();
                }
            }
        };
        ((ArrayList) c0vux.LJFF).add(new InterfaceC798600VUk() { // from class: X.0VEs
            public final Random LIZ = new Random();

            @Override // X.InterfaceC798600VUk
            public final boolean I0(String str2) {
                return true;
            }

            @Override // X.InterfaceC798600VUk
            public final boolean LIZ(String str2) {
                if (((Number) C308220C6i.LIZ.getValue()).floatValue() > 0.0f) {
                    if (!((Boolean) C308230C6j.LIZIZ.getValue()).booleanValue()) {
                        return false;
                    }
                    return C0V29.LJIILIIL;
                }
                C1602860roS.LIZ.getClass();
                if (C1602860roS.LJ()) {
                    return C790620Uzs.LIZIZ("fps", str2);
                }
                if (!Intrinsics.LJFF(str2, "system_launch_isolate_startup_to_first_frame") && !Intrinsics.LJFF(str2, "system_launch_isolate_after_first_frame")) {
                    return C790620Uzs.LIZIZ("fps", str2);
                }
                if (this.LIZ.nextFloat() > 0.05f) {
                    return false;
                }
                return true;
            }
        });
        ((ArrayList) c0vux.LIZJ).add(new C0VTW() { // from class: X.0VUm
            @Override // X.C0VTW
            public final Map<String, String> LIZ(C798630VUn c798630VUn) {
                String strValueOf;
                List<C798640VUo> list = c798630VUn.LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                for (C798640VUo c798640VUo : list) {
                    int i6 = c798640VUo.LIZ;
                    int i7 = c798640VUo.LIZIZ;
                    if (i7 > 0) {
                        if (i5 < i6) {
                            i5 = i6;
                        }
                        if (i6 >= 3) {
                            i += (int) (((double) (i7 * i6)) * 16.6d);
                            if (i6 < 7) {
                                i2 += i7;
                            } else if (i6 < 14) {
                                i3 += i7;
                            } else {
                                i4 += i7;
                            }
                        }
                    }
                }
                linkedHashMap.put("block_duration", String.valueOf(i));
                linkedHashMap.put("drop_x_count", String.valueOf(0 + i2 + i3 + i4));
                linkedHashMap.put("ui_scene", c798630VUn.LIZ);
                double d = c798630VUn.LIZIZ;
                if (d > 60.0d) {
                    strValueOf = "60";
                } else {
                    strValueOf = String.valueOf(((double) ((int) (d * ((double) 100)))) / 100.0d);
                }
                linkedHashMap.put("ui_fps", strValueOf);
                linkedHashMap.put("duration", String.valueOf(c798630VUn.LIZLLL));
                return linkedHashMap;
            }
        });
        List<InterfaceC798600VUk> list = c0vux.LJFF;
        final C19994613Lc c19994613LcLIZIZ = C19994513Lb.LIZIZ(System.currentTimeMillis());
        ((ArrayList) list).add(new InterfaceC798600VUk() { // from class: X.0VUY
            public final /* synthetic */ String LIZ = null;
            public final /* synthetic */ float LIZJ = 1.0f;

            @Override // X.InterfaceC798600VUk
            public final boolean I0(String str2) {
                String str3 = this.LIZ;
                if (str3 != null && !Intrinsics.LJFF(str3, str2)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC798600VUk
            public final boolean LIZ(String str2) {
                if (c19994613LcLIZIZ.nextFloat() <= this.LIZJ) {
                    return true;
                }
                return false;
            }
        });
        Map<String, ? extends InterfaceC798580VUi> mapUnmodifiableMap = Collections.unmodifiableMap(c0vux.LIZ);
        List listUnmodifiableList = Collections.unmodifiableList(c0vux.LIZIZ);
        List<? extends C0VTW> listUnmodifiableList2 = Collections.unmodifiableList(c0vux.LIZJ);
        List<? extends C0VUR> listUnmodifiableList3 = Collections.unmodifiableList(c0vux.LIZLLL);
        Executor executorLIZ = c0vux.LJ;
        if (executorLIZ == null) {
            executorLIZ = C807400Vlq.LIZ();
        }
        List<? extends InterfaceC798600VUk> listUnmodifiableList4 = Collections.unmodifiableList(c0vux.LJFF);
        AtomicBoolean atomicBoolean = C798520VUc.LIZIZ;
        if (!atomicBoolean.get()) {
            synchronized (C798520VUc.LIZ) {
                try {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        C798520VUc.LIZJ = mapUnmodifiableMap;
                        C798520VUc.LIZLLL = new C1957307lb(listUnmodifiableList);
                        C798520VUc.LJ = listUnmodifiableList2;
                        C798520VUc.LJFF = listUnmodifiableList3;
                        C798520VUc.LJI = executorLIZ;
                        C798520VUc.LJII = listUnmodifiableList4;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
