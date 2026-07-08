package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeRequestMessageActionHandler$handle$8", f = "KaraokeRequestMessageActionHandler.kt", l = {249}, m = "invokeSuspend")
public final class C765350U0n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C765320U0k LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765350U0n(C765320U0k c765320U0k, InterfaceC1364105Vn<? super C765350U0n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c765320U0k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765350U0n(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRequestMessageActionHandler@773c.handle$8");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI.LIZLLL);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLJJLI.LIZJ.LJIILL());
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLJJLI.LJIIIIZZ);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLILLJJLI.LJIIJ.invoke().booleanValue());
            C20441214yg.LIZIZ("KReddot", C2188811AlT.LIZIZ(sbLIZ));
            C765320U0k c765320U0k = this.LLILLJJLI;
            C097O c097o = c765320U0k.LIZ;
            C763910Txt c763910Txt = new C763910Txt((int) c765320U0k.LIZLLL, (int) this.LLILLJJLI.LJ);
            this.LL = 1;
            if (c097o.LIZ(c763910Txt, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$8");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
