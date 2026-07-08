package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridPageWithinPowerCell$loadMoreListenerWithStickerRepo$1$1$1", f = "StickerGridPageWithinPowerCell.kt", l = {}, m = "invokeSuspend")
public final class C450020Hkm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C450470HlV LLILLJJLI;
    public final /* synthetic */ List<C450730Hlv> LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450020Hkm(C013C c013c, C450470HlV c450470HlV, List<C450730Hlv> list, C013C c013c2, InterfaceC1364105Vn<? super C450020Hkm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = c450470HlV;
        this.LLILLL = list;
        this.LLILZ = c013c2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450020Hkm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C451030HmP> data;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD;
        C1C7U.LIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.element) {
            C450470HlV c450470HlV = this.LLILLJJLI;
            AbstractC450910HmD<C451030HmP> abstractC450910HmD2 = c450470HlV.LJIIL;
            if (abstractC450910HmD2 != null) {
                abstractC450910HmD2.showPullUpLoadMore(c450470HlV.LJ(), false);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1$1");
            return unit;
        }
        AbstractC450910HmD<C451030HmP> abstractC450910HmD3 = this.LLILLJJLI.LJIIL;
        if (abstractC450910HmD3 == null || (data = abstractC450910HmD3.getData()) == null) {
            data = C13BV.INSTANCE;
        }
        List<? extends C451030HmP> listLJLIL = C13LP.LJLIL(this.LLILLL, data);
        if ((!listLJLIL.isEmpty()) && (abstractC450910HmD = this.LLILLJJLI.LJIIL) != null) {
            abstractC450910HmD.setDataAfterLoadMore(new ArrayList(listLJLIL));
        }
        this.LLILLJJLI.LJIJ(listLJLIL);
        AbstractC450910HmD<C451030HmP> abstractC450910HmD4 = this.LLILLJJLI.LJIIL;
        if (abstractC450910HmD4 != null) {
            if (this.LLILZ.element) {
                abstractC450910HmD4.resetLoadMoreState();
            } else {
                abstractC450910HmD4.setLoadMoreListener((C0P6P) null);
                abstractC450910HmD4.setShowFooter(false);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerGridPageWithinPowerCell@1408.loadMoreListenerWithStickerRepo$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
