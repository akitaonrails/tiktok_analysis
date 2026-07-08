package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.LynxAnimaX;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294080jmQ {
    public static final C1294080jmQ LIZ = new C1294080jmQ();

    public static boolean LIZIZ(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            String string = a0.LJLIIIL((String) obj).toString();
            if (Intrinsics.LJFF(string, "1") || u.LJIJI(string, "true", true)) {
                return true;
            }
            if (!Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                u.LJIJI(string, "false", true);
                return false;
            }
            return false;
        }
        return false;
    }

    public final void LIZ(C1309760kBi c1309760kBi) {
        Object c098200Yq;
        Object obj;
        Object aBParamsValue;
        try {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null && (aBParamsValue = c1538050q7v.getABParamsValue("ENABLE_LOTTIE_TO_ANIMAX")) != null) {
                if (aBParamsValue instanceof Map) {
                    aBParamsValue = ((Map) aBParamsValue).get("ENABLE_LOTTIE_TO_ANIMAX");
                }
            } else {
                aBParamsValue = null;
            }
            c098200Yq = Boolean.valueOf(LIZIZ(aBParamsValue));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get ENABLE_LOTTIE_TO_ANIMAX fail. e: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LynxAnimaXHelper");
            c098200Yq = Boolean.FALSE;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            return;
        }
        try {
            C1490740otc.LIZ.LIZ("mapLottieToAnimaX cover lottie-view with AnimaX", EnumC1490770otf.I, "LynxAnimaXHelper");
            c1309760kBi.LIZJ.LIZ(new C1311670kEn() { // from class: X.0jmP
                {
                    super("lottie-view", false, false, false);
                }

                @Override // X.C1311670kEn
                public final LynxUI<?> LJFF(s sVar) {
                    Object c098200Yq2;
                    Object obj2;
                    this.LJFF.getClass();
                    try {
                        LynxAnimaX.inst().init();
                        c098200Yq2 = LynxAnimaX.inst().createUI(sVar);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (thM5exceptionOrNullimpl2 != null) {
                        C1490740otc c1490740otc2 = C1490740otc.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("createAnimaXUI fail. e: ");
                        sbLIZ2.append(thM5exceptionOrNullimpl2.getMessage());
                        c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "LynxAnimaXHelper");
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj2 = null;
                    } else {
                        obj2 = c098200Yq2;
                    }
                    LynxUI<?> lynxUI = (LynxUI) obj2;
                    if (C189200o6.m8isSuccessimpl(c098200Yq2) && lynxUI == null) {
                        C1490740otc.LIZ.LIZ("createAnimaXUI fail. createUI back with null", EnumC1490770otf.E, "LynxAnimaXHelper");
                    }
                    return lynxUI;
                }
            });
            C189200o6.m2constructorimpl(c1309760kBi);
            obj = c1309760kBi;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj = c098200Yq2;
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl2 != null) {
            C1490740otc c1490740otc2 = C1490740otc.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mapLottieToAnimaX fail. e: ");
            sbLIZ2.append(thM5exceptionOrNullimpl2.getMessage());
            c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "LynxAnimaXHelper");
        }
    }
}
