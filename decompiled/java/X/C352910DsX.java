package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.layer.FreeLayerPanelUISlotComponent$refreshItemEffectIcon$1$updateList$1", f = "FreeLayerPanelUISlotComponent.kt", l = {}, m = "invokeSuspend")
public final class C352910DsX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Integer>>, Object> {
    public final /* synthetic */ List<C352950Dsb> LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352910DsX(List<C352950Dsb> list, List<String> list2, List<String> list3, InterfaceC1364105Vn<? super C352910DsX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352910DsX(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1$updateList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        List<C352950Dsb> list = this.LL;
        List<String> list2 = this.LLILLJJLI;
        List<String> list3 = this.LLILLL;
        int i = 0;
        for (C352950Dsb c352950Dsb : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C352950Dsb c352950Dsb2 = c352950Dsb;
                if (list2.contains(c352950Dsb2.LJI.getUUID())) {
                    arrayList.add(C2286608xc.LJ(i));
                }
                C352690DsB c352690DsB = c352950Dsb2.LIZJ;
                if (c352690DsB != null && (str = c352690DsB.LIZ) != null && list3.contains(str)) {
                    arrayList.add(C2286608xc.LJ(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1C7U.LIZIZ("FreeLayerPanelUISlotComponent@c5ab.refreshItemEffectIcon$1$updateList$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
