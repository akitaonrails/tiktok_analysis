package X;

import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsDividerItem;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597290rfT implements InterfaceC1597210rfL<C1597420rfg>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597420rfg.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        InterfaceC1891350zJl next;
        int i;
        if (!C298520Bn0.LIZ()) {
            return C13BV.INSTANCE;
        }
        if (C295190Bhd.LIZ()) {
            return C13BV.INSTANCE;
        }
        List<InterfaceC1891350zJl> list = c1597320rfW.LIZIZ;
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        if (c1597320rfW.LIZJ == EnumC1597050rf5.LOAD_MORE) {
            List<InterfaceC1891350zJl> list2 = c1597320rfW.LIZLLL;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<InterfaceC1891350zJl> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof SkylightHighlightsDividerItem) {
                        return C13BV.INSTANCE;
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator<InterfaceC1891350zJl> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next() instanceof SkylightHighlightsDividerItem) {
                    return C13BV.INSTANCE;
                }
            }
        }
        Iterator<InterfaceC1891350zJl> it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (next instanceof SkylightHighlightsItem) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl = next;
        if (interfaceC1891350zJl == null) {
            return C13BV.INSTANCE;
        }
        String strLIZ = c1597320rfW.LIZ(interfaceC1891350zJl);
        if (strLIZ == null) {
            return C13BV.INSTANCE;
        }
        if (C1209404oG.LIZ()) {
            i = 5000;
        } else {
            i = 5499;
        }
        return Collections.singletonList(new C1160310gIf(C1596950rev.LIZJ(EnumC1597060rf6.HIGHLIGHT, "DIVIDER"), new SkylightHighlightsDividerItem(i), strLIZ, C0N2L.BEFORE));
    }
}
