package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PBU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBU {
    public final Function0<List<SearchMixFeed>> LIZ;
    public final Function0<C0PAA> LIZIZ;
    public final Fragment LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(472));

    public C0PBU(Fragment fragment, AwS554S0100000_10 awS554S0100000_10, AwS554S0100000_10 awS554S0100000_102) {
        this.LIZ = awS554S0100000_10;
        this.LIZIZ = awS554S0100000_102;
        this.LIZJ = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(RecyclerView.ViewHolder viewHolder, C640750PBh c640750PBh, Function0 function0) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        if (viewHolder instanceof SearchCardViewHolder) {
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((InterfaceC713360RyY) viewHolder), SearchServiceCenter$AutoPlayAbility.class, null);
            if (searchServiceCenter$AutoPlayAbility2 != null) {
                searchServiceCenter$AutoPlayAbility2.Ot0(c640750PBh, function0);
                return;
            }
            return;
        }
        if ((!(viewHolder instanceof ViewOnAttachStateChangeListenerC648030PbN) && !(viewHolder instanceof C652310PiH)) || (interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(viewHolder.itemView, null, 3)) == null || (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, SearchServiceCenter$AutoPlayAbility.class, null)) == null) {
            return;
        }
        searchServiceCenter$AutoPlayAbility.Ot0(c640750PBh, function0);
    }
}
