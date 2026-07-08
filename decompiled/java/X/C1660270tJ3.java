package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel$toolbarState$2$1", f = "ToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1660270tJ3 extends C09AX implements InterfaceC1685420txc<List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, Set<? extends InterfaceC1660190tIv>, C1660340tJA, InterfaceC1364105Vn<? super C1660260tJ2<? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends C1660340tJA>>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ C1660340tJA LLILZ;

    public C1660270tJ3(InterfaceC1364105Vn<? super C1660270tJ3> interfaceC1364105Vn) {
        super(5, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditToolbarViewModel@1eb1.toolbarState$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1660260tJ2 c1660260tJ2 = new C1660260tJ2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$1");
        return c1660260tJ2;
    }

    @Override // X.InterfaceC1685420txc
    public final Object invoke(List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list, List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list2, Set<? extends InterfaceC1660190tIv> set, C1660340tJA c1660340tJA, InterfaceC1364105Vn<? super C1660260tJ2<? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends C1660340tJA>> interfaceC1364105Vn) {
        C1660270tJ3 c1660270tJ3 = new C1660270tJ3(interfaceC1364105Vn);
        c1660270tJ3.LL = list;
        c1660270tJ3.LLILLJJLI = list2;
        c1660270tJ3.LLILLL = set;
        c1660270tJ3.LLILZ = c1660340tJA;
        return c1660270tJ3.invokeSuspend(Unit.LIZ);
    }
}
