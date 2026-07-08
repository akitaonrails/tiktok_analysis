package X;

import Y.AgS73S0400000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.socialavatar.data.IMSocialAvatarStatusManager$startStateCombination$1$3", f = "IMSocialAvatarStatusManager.kt", l = {136}, m = "invokeSuspend")
public final class C438890HIx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C439110HJt LLILLJJLI;
    public final /* synthetic */ C259800zU<C439120HJu> LLILLL;
    public final /* synthetic */ C259800zU<C437560HDu> LLILZ;
    public final /* synthetic */ C259800zU<InterfaceC439080HJq> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438890HIx(C439110HJt c439110HJt, C259800zU<C439120HJu> c259800zU, C259800zU<C437560HDu> c259800zU2, C259800zU<InterfaceC439080HJq> c259800zU3, InterfaceC1364105Vn<? super C438890HIx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439110HJt;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438890HIx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSocialAvatarStatusManager@4f1f.startStateCombination$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C439110HJt c439110HJt = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c439110HJt.LJI;
            AgS73S0400000_6 agS73S0400000_6 = new AgS73S0400000_6(this.LLILLL, c439110HJt, this.LLILZ, this.LLILZIL, 3);
            this.LL = 1;
            if (c2252321DDq.collect(agS73S0400000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.startStateCombination$1$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
