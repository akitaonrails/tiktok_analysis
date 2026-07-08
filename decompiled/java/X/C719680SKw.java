package X;

import Y.AgS292S0100000_11;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent$onViewCreated$18", f = "PhotoSlideViewPagerComponent.kt", l = {621}, m = "invokeSuspend")
public final class C719680SKw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PhotoSlideViewPagerComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C719680SKw(PhotoSlideViewPagerComponent photoSlideViewPagerComponent, InterfaceC1364105Vn<? super C719680SKw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = photoSlideViewPagerComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C719680SKw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<C0S5N> c05ydLJIIIZ;
        C1C7U.LIZ("PhotoSlideViewPagerComponent@2e84.onViewCreated$18");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            PhotoSlideViewPagerComponent photoSlideViewPagerComponent = this.LLILLJJLI;
            C0SBA c0sba = (C0SBA) photoSlideViewPagerComponent.LLJZIJLIL.getValue(photoSlideViewPagerComponent, PhotoSlideViewPagerComponent.LLLLLLL[7]);
            if (c0sba != null && (c05ydLJIIIZ = c0sba.LJIIIZ()) != null) {
                AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 13);
                this.LL = 1;
                if (c05ydLJIIIZ.collect(agS292S0100000_11, this) == objLJFF) {
                    C1C7U.LIZIZ("PhotoSlideViewPagerComponent@2e84.onViewCreated$18");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PhotoSlideViewPagerComponent@2e84.onViewCreated$18");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
