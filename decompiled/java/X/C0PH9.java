package X;

import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.NonMatching;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0PH9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH9 {
    public final ArrayList<SearchTransitionalCardProtocol<InterfaceC594520NTm>> LIZ = new ArrayList<>();
    public final ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> LIZIZ = new ConcurrentHashMap<>();

    public final ISearchCardProtocol<InterfaceC594520NTm> LIZ(InterfaceC594520NTm interfaceC594520NTm) {
        SearchTransitionalCardProtocol<InterfaceC594520NTm> next;
        Iterator<SearchTransitionalCardProtocol<InterfaceC594520NTm>> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                SearchTransitionalCardProtocol<InterfaceC594520NTm> searchTransitionalCardProtocol = next;
                if (searchTransitionalCardProtocol.getDataType().LIZIZ(interfaceC594520NTm) && searchTransitionalCardProtocol.Hd1(interfaceC594520NTm)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SearchTransitionalCardProtocol<InterfaceC594520NTm> searchTransitionalCardProtocol2 = next;
        if (searchTransitionalCardProtocol2 == null) {
            return NonMatching.LL;
        }
        return searchTransitionalCardProtocol2;
    }
}
