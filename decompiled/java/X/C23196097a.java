package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.097a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectLoadingManager$loadingEventFlow$1", f = "EffectLoadingComponent.kt", l = {}, m = "invokeSuspend")
public final class C23196097a extends C09AX implements InterfaceC1631630sYr<Effect, Boolean, String, InterfaceC1364105Vn<? super C097X>, Object> {
    public /* synthetic */ Effect LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C23196097a(InterfaceC1364105Vn<? super C23196097a> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("EffectLoadingManager@bb2d.loadingEventFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL;
        boolean z = this.LLILLJJLI;
        Object obj3 = this.LLILLL;
        if (z && effect != null && !Intrinsics.LJFF(effect.getEffectId(), obj3)) {
            obj2 = C097Z.LIZ;
        } else {
            obj2 = C097Y.LIZ;
        }
        C1C7U.LIZIZ("EffectLoadingManager@bb2d.loadingEventFlow$1");
        return obj2;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Effect effect, Boolean bool, String str, InterfaceC1364105Vn<? super C097X> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C23196097a c23196097a = new C23196097a(interfaceC1364105Vn);
        c23196097a.LL = effect;
        c23196097a.LLILLJJLI = zBooleanValue;
        c23196097a.LLILLL = str;
        return c23196097a.invokeSuspend(Unit.LIZ);
    }
}
