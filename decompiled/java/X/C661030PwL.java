package X;

import X.C661030PwL;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;

/* JADX INFO: renamed from: X.0PwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C661030PwL<T extends C661030PwL<T>> extends C650460PfI<T> {
    public C661030PwL(String str, Aweme aweme, List<SearchKeyFramePoint> list, ISearchContextAbility iSearchContextAbility) {
        super(str);
        C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
        C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
        LJJIIZI(c0prc.LLILLL);
        LJIJJ(c646370PWx.LLILLL);
        LJJIJ(c0prc.LLIZLLLIL);
        LJIL(aweme.getAid());
        LJJIJIIJI(c646370PWx.LLJ);
        String strLIZ = C661050PwN.LIZ(aweme);
        if (strLIZ != null) {
            LJ("token_type", strLIZ);
        }
        LJ("list_item_id", aweme.getAid());
        C662670Pyz.LIZ.getClass();
        String strLIZ2 = C662670Pyz.LIZ();
        if (strLIZ2 != null) {
            LJ("end_to_end_search_session_id", strLIZ2);
        }
        LJJIJIIJIL(c0prc.LLILLJJLI);
        LJIIZILJ("chapters_num", String.valueOf(list.size()));
        C659580Pu0.LIZ.getClass();
        LIZIZ(C659580Pu0.LIZIZ(aweme, false));
    }
}
