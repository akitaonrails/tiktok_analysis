package X;

import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.nativemulticontentcomponent.AnoleMultiContentComponent$preloadFirstCover$1", f = "AnoleMultiContentComponent.kt", l = {}, m = "invokeSuspend")
public final class C1012740cSe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1013310cTZ LL;
    public final /* synthetic */ AnoleMultiContentItemModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012740cSe(C1013310cTZ c1013310cTZ, AnoleMultiContentItemModel anoleMultiContentItemModel, InterfaceC1364105Vn<? super C1012740cSe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1013310cTZ;
        this.LLILLJJLI = anoleMultiContentItemModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1012740cSe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnoleMultiContentComponent@c72b.preloadFirstCover$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLJLILLLLZIIL != null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AnoleMultiContentComponent@c72b.preloadFirstCover$1");
            return unit;
        }
        String cover = this.LLILLJJLI.getCover();
        if (cover == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AnoleMultiContentComponent@c72b.preloadFirstCover$1");
            return unit2;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(cover);
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL(EnumC1008920cMU.MULTI_CONTENT.getType());
        c1331670kl3LJIIIZ.LJJIJL(this.LL.LLILZ);
        c1331670kl3LJIIIZ.LJJII(new C1077120e8U(this.LLILLJJLI, this.LL, 2));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AnoleMultiContentComponent@c72b.preloadFirstCover$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
