package X;

import Y.AgS287S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.socialavatar.data.IMSocialAvatarStatusManager$initializeFlows$3", f = "IMSocialAvatarStatusManager.kt", l = {102}, m = "invokeSuspend")
public final class C438850HIt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C439110HJt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438850HIt(C439110HJt c439110HJt, InterfaceC1364105Vn<? super C438850HIt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c439110HJt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438850HIt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSocialAvatarStatusManager@4f1f.initializeFlows$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C439110HJt c439110HJt = this.LLILLJJLI;
            InterfaceC346201Wa<C439120HJu> interfaceC346201Wa = c439110HJt.LIZIZ;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(c439110HJt, 124);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.initializeFlows$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSocialAvatarStatusManager@4f1f.initializeFlows$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
