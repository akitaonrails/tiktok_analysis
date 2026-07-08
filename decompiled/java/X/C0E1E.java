package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0E1E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.filter.ui.FilterPanelItemScene$initObserver$3$1", f = "FilterPanelItemScene.kt", l = {223}, m = "invokeSuspend")
public final class C0E1E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EBP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E1E(C0EBP c0ebp, InterfaceC1364105Vn<? super C0E1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ebp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E1E(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objXu2;
        List<ResourceItem> list;
        C0EDF c0edf;
        C361100EDs resourceListAdapter;
        Object next;
        C1C7U.LIZ("FilterPanelItemScene@c301.initObserver$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objXu2 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC361290EEl interfaceC361290EEl = (InterfaceC361290EEl) this.LLILLJJLI.LLJLIL.getValue();
            if (interfaceC361290EEl != null) {
                this.LL = 1;
                objXu2 = interfaceC361290EEl.Xu2("filtercomposer", this);
                if (objXu2 == objLJFF) {
                    C1C7U.LIZIZ("FilterPanelItemScene@c301.initObserver$3$1");
                    return objLJFF;
                }
            }
            list = C13BV.INSTANCE;
            c0edf = this.LLILLJJLI.LLJLL;
            if (c0edf == null && (resourceListAdapter = c0edf.getResourceListAdapter()) != null) {
                for (ResourceItem resourceItem : list) {
                    Iterator it2 = ((ArrayList) resourceListAdapter.LLLFZ()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((ResourceItem) next).getResourceId(), resourceItem.getResourceId())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ResourceItem resourceItem2 = (ResourceItem) next;
                    if (resourceItem2 != null) {
                        resourceItem2.setFavorite(true);
                        resourceListAdapter.LLLI(resourceItem2);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FilterPanelItemScene@c301.initObserver$3$1");
                return unit;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FilterPanelItemScene@c301.initObserver$3$1");
            return unit2;
        }
        if (C189200o6.m7isFailureimpl(objXu2)) {
            objXu2 = null;
        }
        list = (List) objXu2;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        c0edf = this.LLILLJJLI.LLJLL;
        if (c0edf == null) {
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("FilterPanelItemScene@c301.initObserver$3$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
