package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectVideoHelper$delDownloadVideos$2", f = "LikeEffectVideoHelper.kt", l = {}, m = "invokeSuspend")
public final class C361701ap extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1018170cbP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361701ap(C1018170cbP c1018170cbP, InterfaceC1364105Vn<? super C361701ap> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1018170cbP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361701ap(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LikeEffectVideoHelper@eac5.delDownloadVideos$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0VSJ c0vsj = new C0VSJ((String) this.LL.LIZJ.getValue());
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LikeEffectVideoHelper@eac5.delDownloadVideos$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
