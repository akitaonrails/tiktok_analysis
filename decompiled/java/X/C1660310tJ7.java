package X;

import com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tJ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel$toolbarState$2$2$1", f = "ToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1660310tJ7 extends C09AX implements InterfaceC1631620sYq<List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, InterfaceC1364105Vn<? super C1661820tLY>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditToolbarViewModel LLILLL;
    public final /* synthetic */ C1660340tJA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660310tJ7(EditToolbarViewModel editToolbarViewModel, C1660340tJA c1660340tJA, InterfaceC1364105Vn<? super C1660310tJ7> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = editToolbarViewModel;
        this.LLILZ = c1660340tJA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditToolbarViewModel@1eb1.toolbarState$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        Collection collection = (Collection) this.LLILLJJLI;
        EditToolbarViewModel editToolbarViewModel = this.LLILLL;
        ArrayList arrayList = new ArrayList(collection);
        int i = -1;
        int size = editToolbarViewModel.LLILZ.LIZIZ - (list.size() - 1);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((C1661930tLj) it2.next()).LIZ, C1660350tJB.LIZJ)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (arrayList.size() <= size && i >= 0) {
            size = i;
        }
        Pair pair = new Pair(arrayList, Integer.valueOf(size));
        List list2 = (List) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        boolean z = this.LLILZ.LIZ;
        C1660300tJ6 c1660300tJ6 = new C1660300tJ6(this.LLILLL);
        C1683130ttv c1683130ttvXQ2 = this.LLILLL.xQ2();
        C1660340tJA c1660340tJA = this.LLILZ;
        C1661820tLY c1661820tLY = new C1661820tLY(z, list, list2, c1660300tJ6, iIntValue, c1683130ttvXQ2, c1660340tJA.LIZIZ, c1660340tJA.LIZJ);
        this.LLILLL.LLILLL.invoke(c1661820tLY);
        C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$2$1");
        return c1661820tLY;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list, List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list2, InterfaceC1364105Vn<? super C1661820tLY> interfaceC1364105Vn) {
        C1660310tJ7 c1660310tJ7 = new C1660310tJ7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1660310tJ7.LL = list;
        c1660310tJ7.LLILLJJLI = list2;
        return c1660310tJ7.invokeSuspend(Unit.LIZ);
    }
}
