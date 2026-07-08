package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08rT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.EditorTabContainerScene$Companion$preloadEoyLottie$2", f = "EditorTabContainerScene.kt", l = {}, m = "invokeSuspend")
public final class C2248508rT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C2248508rT(InterfaceC1364105Vn<? super C2248508rT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2248508rT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EditorTabContainerScene$Companion@4fe1.preloadEoyLottie$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = true;
        if (C2248608rU.LIZIZ.LIZ.LIZJ("eoy_create_tab_lottie") != null) {
            C1C7U.LIZIZ("EditorTabContainerScene$Companion@4fe1.preloadEoyLottie$2");
            return true;
        }
        Object obj2 = null;
        try {
            C0LBG.LIZ.getClass();
            String strLIZIZ = C0LBG.LIZIZ();
            if (strLIZIZ == null) {
                c098200Yq = null;
            } else {
                C0VSP c0vsp = new C0VSP(strLIZIZ);
                try {
                    c098200Yq = C1294250jmh.LJFF(c0vsp, "eoy_create_tab_lottie");
                    C2107108Nh.LIZ(c0vsp, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) c098200Yq;
        if (c1292000jj4 != null) {
            obj2 = c1292000jj4.LIZ;
        }
        if (obj2 == null) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("EditorTabContainerScene$Companion@4fe1.preloadEoyLottie$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C2248508rT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
