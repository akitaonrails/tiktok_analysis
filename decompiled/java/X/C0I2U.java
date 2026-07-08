package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDynamicHeaderContainerAssem;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I2U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2U extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PoiDynamicHeaderContainerAssem LL;
    public final /* synthetic */ List<C628830OlV> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I2U(PoiDynamicHeaderContainerAssem poiDynamicHeaderContainerAssem, List<C628830OlV> list) {
        super(1);
        this.LL = poiDynamicHeaderContainerAssem;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Assembler assembler) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        Object next;
        Integer numValueOf;
        UISlotAssem uISlotAssem;
        AbstractC738140SxQ next2;
        AbstractC738140SxQ next3;
        Integer numValueOf2;
        UISlotAssem uISlotAssem2;
        UISlotAssem uISlotAssem3;
        UISlotAssem uISlotAssem4;
        Assembler assembler2 = assembler;
        AssemSupervisor assemSupervisorCQ2 = assembler2.CQ2(this.LL);
        if (assemSupervisorCQ2 != null) {
            copyOnWriteArrayList = assemSupervisorCQ2.LLJILLL;
        } else {
            copyOnWriteArrayList = null;
        }
        List<C628830OlV> list = this.LLILLJJLI;
        PoiDynamicHeaderContainerAssem poiDynamicHeaderContainerAssem = this.LL;
        for (C628830OlV c628830OlV : list) {
            if (copyOnWriteArrayList != null) {
                Iterator<AbstractC738140SxQ> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        AbstractC738140SxQ abstractC738140SxQ = next2;
                        if ((abstractC738140SxQ instanceof UISlotAssem) && (uISlotAssem4 = (UISlotAssem) abstractC738140SxQ) != null && c628830OlV.LLIZLLLIL == uISlotAssem4.LLIZ) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                AbstractC738140SxQ abstractC738140SxQ2 = next2;
                if (abstractC738140SxQ2 != null && (!Intrinsics.LJFF(C13LE.LIZ(abstractC738140SxQ2.getClass()), c628830OlV.LL) || !Intrinsics.LJFF(abstractC738140SxQ2.assemTagInternal, c628830OlV.LLILLJJLI))) {
                    poiDynamicHeaderContainerAssem.mp(C13LE.LIZ(abstractC738140SxQ2.getClass()), abstractC738140SxQ2.assemTagInternal, Integer.valueOf(c628830OlV.LLIZLLLIL));
                }
                if (copyOnWriteArrayList != null) {
                    Iterator<AbstractC738140SxQ> it3 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next3 = it3.next();
                            AbstractC738140SxQ abstractC738140SxQ3 = next3;
                            if (Intrinsics.LJFF(c628830OlV.LL, C13LE.LIZ(abstractC738140SxQ3.getClass())) && Intrinsics.LJFF(abstractC738140SxQ3.assemTagInternal, c628830OlV.LLILLJJLI) && (!(abstractC738140SxQ3 instanceof UISlotAssem) || (uISlotAssem3 = (UISlotAssem) abstractC738140SxQ3) == null || c628830OlV.LLIZLLLIL != uISlotAssem3.LLIZ)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    AbstractC738140SxQ abstractC738140SxQ4 = next3;
                    if (abstractC738140SxQ4 != null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(abstractC738140SxQ4.getClass());
                        String str = abstractC738140SxQ4.assemTagInternal;
                        if ((abstractC738140SxQ4 instanceof UISlotAssem) && (uISlotAssem2 = (UISlotAssem) abstractC738140SxQ4) != null) {
                            numValueOf2 = Integer.valueOf(uISlotAssem2.LLIZ);
                        } else {
                            numValueOf2 = null;
                        }
                        poiDynamicHeaderContainerAssem.mp(c19719912DlLIZ, str, numValueOf2);
                    }
                }
            }
        }
        if (Intrinsics.LJFF(this.LL.getConfig().LLILZ.get("unload_invalid_assem"), Boolean.TRUE)) {
            if (copyOnWriteArrayList != null) {
                List<C628830OlV> list2 = this.LLILLJJLI;
                PoiDynamicHeaderContainerAssem poiDynamicHeaderContainerAssem2 = this.LL;
                for (AbstractC738140SxQ abstractC738140SxQ5 : copyOnWriteArrayList) {
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (C628830OlV c628830OlV2 : list2) {
                            if (!Intrinsics.LJFF(c628830OlV2.LL, C13LE.LIZ(abstractC738140SxQ5.getClass())) || !Intrinsics.LJFF(abstractC738140SxQ5.assemTagInternal, c628830OlV2.LLILLJJLI)) {
                            }
                        }
                    }
                    C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(abstractC738140SxQ5.getClass());
                    String str2 = abstractC738140SxQ5.assemTagInternal;
                    if ((abstractC738140SxQ5 instanceof UISlotAssem) && (uISlotAssem = (UISlotAssem) abstractC738140SxQ5) != null) {
                        numValueOf = Integer.valueOf(uISlotAssem.LLIZ);
                    } else {
                        numValueOf = null;
                    }
                    poiDynamicHeaderContainerAssem2.mp(c19719912DlLIZ2, str2, numValueOf);
                }
            }
            Collection collectionValues = ((LinkedHashMap) PoiDynamicHeaderContainerAssem.LLJJIJIIJIL).values();
            List<C628830OlV> list3 = this.LLILLJJLI;
            PoiDynamicHeaderContainerAssem poiDynamicHeaderContainerAssem3 = this.LL;
            Iterator it4 = collectionValues.iterator();
            while (it4.hasNext()) {
                int iIntValue = ((Number) it4.next()).intValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<C628830OlV> it5 = list3.iterator();
                    while (it5.hasNext()) {
                        if (it5.next().LLIZLLLIL == iIntValue) {
                            break;
                        }
                    }
                }
                LinearLayout linearLayout = poiDynamicHeaderContainerAssem3.LLJJIII;
                if (linearLayout != null) {
                    Iterator it6 = new C462910IDh(linearLayout, 1).iterator();
                    while (true) {
                        C462890IDf c462890IDf = (C462890IDf) it6;
                        if (c462890IDf.hasNext()) {
                            next = c462890IDf.next();
                            if (((View) next).getId() == iIntValue) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    View view = (View) next;
                    if (view != null && (view instanceof FrameLayout)) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() > 0) {
                            C786410Ut5.LJJJJIZL(frameLayout);
                        }
                    }
                }
            }
        }
        PoiDynamicHeaderContainerAssem poiDynamicHeaderContainerAssem4 = this.LL;
        List<C628830OlV> list4 = this.LLILLJJLI;
        poiDynamicHeaderContainerAssem4.LLJJIJI = list4;
        assembler2.wQ2(poiDynamicHeaderContainerAssem4, list4);
        return Unit.LIZ;
    }
}
