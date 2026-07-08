package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effect.EditEffectSceneV2$onShowEffectExtraInfoIfNeeded$1$1", f = "EditEffectSceneV2.kt", l = {}, m = "invokeSuspend")
public final class C361750EGf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C365100ETc LL;
    public final /* synthetic */ InterfaceC2257101DWa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361750EGf(C365100ETc c365100ETc, InterfaceC2257101DWa interfaceC2257101DWa, InterfaceC1364105Vn<? super C361750EGf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c365100ETc;
        this.LLILLJJLI = interfaceC2257101DWa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361750EGf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditEffectSceneV2@ba81.onShowEffectExtraInfoIfNeeded$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLLLLJ(this.LLILLJJLI.getAvatarThumb(), this.LLILLJJLI.getNickname());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditEffectSceneV2@ba81.onShowEffectExtraInfoIfNeeded$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
