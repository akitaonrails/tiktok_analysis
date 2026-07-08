package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS655S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectAnimationMgr$displayEffect$2", f = "CameraEffectAnimationMgr.kt", l = {156}, m = "invokeSuspend")
public final class C445360HdG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC343480DdK>, Object> {
    public int LL;
    public final /* synthetic */ C1331670kl3 LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445360HdG(C1331670kl3 c1331670kl3, Effect effect, InterfaceC1364105Vn<? super C445360HdG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1331670kl3;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445360HdG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraEffectAnimationMgr@48bf.displayEffect$2");
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
            C1331670kl3 c1331670kl3 = this.LLILLJJLI;
            Effect effect = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1332130kln.LJFF(c1331670kl3, "camera_effect_icon", new C444040Hb8(new C445370HdH(c2252611DEt, effect), new AwS655S0100000_6(c2252611DEt, 0)), false, null, null, null, 60);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.displayEffect$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CameraEffectAnimationMgr@48bf.displayEffect$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC343480DdK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
