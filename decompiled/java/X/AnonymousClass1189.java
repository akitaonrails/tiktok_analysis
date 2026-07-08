package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1189, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextMgr$effectTextDownloadMgr$2$1", f = "EffectTextMgr.kt", l = {68}, m = "invokeSuspend")
public final class AnonymousClass1189 extends C09AX implements Function2<C11UK, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass1231 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1189(AnonymousClass1231 anonymousClass1231, InterfaceC1364105Vn<? super AnonymousClass1189> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass1231;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass1189 anonymousClass1189 = new AnonymousClass1189(this.LLILLL, interfaceC1364105Vn);
        anonymousClass1189.LLILLJJLI = obj;
        return anonymousClass1189;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectTextMgr@68cf.effectTextDownloadMgr$2$1");
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
            C11UK c11uk = (C11UK) this.LLILLJJLI;
            AnonymousClass1231 anonymousClass1231 = this.LLILLL;
            C19EG c19eg = anonymousClass1231.LIZ;
            List<C2280608we> list = anonymousClass1231.LJII;
            this.LL = 1;
            c11uk.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C11UM(c11uk, list, c19eg, null)) == objLJFF) {
                C1C7U.LIZIZ("EffectTextMgr@68cf.effectTextDownloadMgr$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTextMgr@68cf.effectTextDownloadMgr$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C11UK c11uk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c11uk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
