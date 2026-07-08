package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$cleanupDir$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
public final class C492701vx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Uri LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492701vx(Uri uri, InterfaceC1364105Vn<? super C492701vx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492701vx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.cleanupDir$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String path = this.LL.getPath();
        boolean z2 = false;
        if (path == null) {
            C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.cleanupDir$2");
            return false;
        }
        try {
            C0VSJ c0vsj = new C0VSJ(path);
            if (c0vsj.exists() && c0vsj.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c0vsj = null;
            }
            if (c0vsj != null) {
                C2112608Pk.LIZIZ(c0vsj.getParent());
            }
            z2 = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.cleanupDir$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
