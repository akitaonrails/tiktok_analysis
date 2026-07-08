package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.vibefeed.cache.VibeInteractRecord;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryStats;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem;
import com.ss.android.ugc.aweme.vibefeed.model.VibeItemStatus;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0P31, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0P31 {
    C0P3N LIZ();

    String LIZIZ();

    String LIZJ();

    Pair<String, String> LIZLLL();

    List<UrlModel> LJ();

    VibeInteractRecord LJFF();

    List<String> LJI();

    void LJII(SummaryStats summaryStats);

    void LJIIIIZZ(List<VibeItemStatus> list, List<String> list2);

    SummaryStats LJIIIZ();

    C638560P2w LJIIJ();

    boolean LJIIJJI();

    String LJIIL();

    List<String> LJIILIIL();

    void LJIILJJIL(String str);

    List<String> LJIILL();

    boolean LJIILLIIL(String str);

    List<String> LJIIZILJ(String str);

    long LJIJ(String str);

    void LJIJI(List list);

    Pair<String, String> LJIJJ();

    void LJIJJLI(String str, List<String> list, EnumC629350OmL enumC629350OmL, List<VibeFeedItem> list2, EnumC585040Mx4 enumC585040Mx4, String str2, String str3);

    String LJIL();

    void LJJ(List<String> list);

    boolean LJJI(String str);

    List<String> LJJIFFI();

    void clear();

    String getConversationId();

    String getUid();
}
