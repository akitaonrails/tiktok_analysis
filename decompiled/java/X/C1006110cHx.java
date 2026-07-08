package X;

import Y.AgS204S0200000_16;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListHeaderViewHolder$1$1", f = "CommerceMusicSubstituteMusicListHeaderViewHolder.kt", l = {28}, m = "invokeSuspend")
public final class C1006110cHx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1006120cHy LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006110cHx(C1006120cHy c1006120cHy, TextView textView, InterfaceC1364105Vn<? super C1006110cHx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1006120cHy;
        this.LLILLL = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006110cHx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicListHeaderViewHolder@fd5d.<init>$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1077440e90(this.LLILLJJLI.LLILLL, 7));
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLL, this.LLILLJJLI, 14);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceMusicSubstituteMusicListHeaderViewHolder@fd5d.<init>$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicListHeaderViewHolder@fd5d.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
