package X;

import com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel$toolbarState$2$invoke$$inlined$flatMapLatest$1", f = "ToolbarViewModel.kt", l = {193}, m = "invokeSuspend")
public final class C1660250tJ1 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C1661820tLY>, C1660260tJ2<? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends C1660340tJA>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ EditToolbarViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660250tJ1(InterfaceC1364105Vn interfaceC1364105Vn, EditToolbarViewModel editToolbarViewModel) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = editToolbarViewModel;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C1661820tLY> interfaceC346701Wf, C1660260tJ2<? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends C1660340tJA> c1660260tJ2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1660250tJ1 c1660250tJ1 = new C1660250tJ1(interfaceC1364105Vn, this.LLILZ);
        c1660250tJ1.LLILLJJLI = interfaceC346701Wf;
        c1660250tJ1.LLILLL = c1660260tJ2;
        return c1660250tJ1.invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c1698270uIL;
        InterfaceC346201Wa c1698270uIL2;
        C05YD state;
        C05YD state2;
        C1C7U.LIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$$inlined$flatMapLatest$1");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            C1660260tJ2 c1660260tJ2 = (C1660260tJ2) this.LLILLL;
            List list = (List) c1660260tJ2.LIZ;
            List list2 = (List) c1660260tJ2.LIZIZ;
            Set set = (Set) c1660260tJ2.LIZJ;
            C1660340tJA c1660340tJA = (C1660340tJA) c1660260tJ2.LIZLLL;
            ArrayList<C1661930tLj> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!set.contains(((C1661930tLj) obj2).LIZ)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1661930tLj c1661930tLj : arrayList) {
                InterfaceC1660130tIp interfaceC1660130tIpVQ2 = this.LLILZ.vQ2((AbstractC1678220tm0) c1661930tLj.LIZ);
                if (interfaceC1660130tIpVQ2 != null && (state2 = interfaceC1660130tIpVQ2.getState()) != null) {
                    arrayList2.add(new C1698260uIK(state2, c1661930tLj, 1));
                }
            }
            ArrayList<C1661930tLj> arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (!set.contains(((C1661930tLj) obj3).LIZ)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C1661930tLj c1661930tLj2 : arrayList3) {
                InterfaceC1660130tIp interfaceC1660130tIpVQ22 = this.LLILZ.vQ2((AbstractC1678220tm0) c1661930tLj2.LIZ);
                if (interfaceC1660130tIpVQ22 != null && (state = interfaceC1660130tIpVQ22.getState()) != null) {
                    arrayList4.add(new C1698260uIK(state, c1661930tLj2, 2));
                }
            }
            if (arrayList2.isEmpty()) {
                c1698270uIL = new C516501zn(C13BV.INSTANCE, 1);
            } else {
                c1698270uIL = new C1698270uIL((InterfaceC346201Wa[]) C13LP.LLIIII(arrayList2).toArray(new InterfaceC346201Wa[0]), 1);
            }
            if (arrayList4.isEmpty()) {
                c1698270uIL2 = new C516501zn(C13BV.INSTANCE, 1);
            } else {
                c1698270uIL2 = new C1698270uIL((InterfaceC346201Wa[]) C13LP.LLIIII(arrayList4).toArray(new InterfaceC346201Wa[0]), 2);
            }
            C414301jJ c414301jJ = new C414301jJ(c1698270uIL, c1698270uIL2, new C1660310tJ7(this.LLILZ, c1660340tJA, null));
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c414301jJ, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$$inlined$flatMapLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$$inlined$flatMapLatest$1");
        return unit;
    }
}
