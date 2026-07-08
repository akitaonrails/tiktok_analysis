package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.adcardcomponent.videocard.VideoCardViewHolder$bindCover$1", f = "VideoCardViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C06ZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1013300cTY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZG(String str, C1013300cTY c1013300cTY, InterfaceC1364105Vn<? super C06ZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1013300cTY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoCardViewHolder@2743.bindCover$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI.LLILZ);
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL("multi_video_card");
        c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI.LLILZ.getContext());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoCardViewHolder@2743.bindCover$1");
        return unit;
    }
}
