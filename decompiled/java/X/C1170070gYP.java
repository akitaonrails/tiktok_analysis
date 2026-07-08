package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonComponent$handleSwitchFromPhotoMode$1", f = "ChildEffectButtonComponent.kt", l = {180}, m = "invokeSuspend")
public final class C1170070gYP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1631480sYc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170070gYP(C1631480sYc c1631480sYc, InterfaceC1364105Vn<? super C1170070gYP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1631480sYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1170070gYP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChildEffectButtonComponent@45ab.handleSwitchFromPhotoMode$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(350L, this) == objLJFF) {
                C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.handleSwitchFromPhotoMode$1");
                return objLJFF;
            }
        }
        C1631480sYc c1631480sYc = this.LLILLJJLI;
        Effect effect = c1631480sYc.LLJILLL;
        if (effect != null) {
            c1631480sYc.m3(effect);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.handleSwitchFromPhotoMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
