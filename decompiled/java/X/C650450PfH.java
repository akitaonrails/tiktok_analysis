package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650450PfH {
    public static final <T extends C661020PwK<T>> void LIZ(C661020PwK<T> c661020PwK, View view, Aweme aweme, ISearchContextAbility iSearchContextAbility, boolean z) {
        String str;
        String aid;
        String aid2;
        String strLJ;
        HashMap<String, String> mobParams;
        String str2;
        if (iSearchContextAbility == null) {
            return;
        }
        C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
        C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
        c661020PwK.LJIJJ(c646370PWx.LLILLL);
        c661020PwK.LJJIIZI(c0prc.LLILLL);
        c661020PwK.LJJIJ(c0prc.LLIZLLLIL);
        c661020PwK.LJJIJIIJIL(c0prc.LLILLJJLI);
        if (Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c661020PwK.LJIIZILJ("is_fullscreen", str);
        c661020PwK.LJJIJIIJI(c646370PWx.LLJ);
        if (z) {
            String str3 = "";
            if (aweme == null) {
                strLJ = "";
            } else {
                strLJ = C643200PKs.LJ(aweme);
            }
            c661020PwK.LJ("universal_rank", strLJ);
            if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("rank_inner")) != null) {
                str3 = str2;
            }
            c661020PwK.LJ("rank_inner", str3);
        } else {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C645920PVe.LIZIZ(c661020PwK, view, aid, null);
            c661020PwK.LJ("universal_rank", String.valueOf(c646370PWx.LLJILJIL));
        }
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        if (strLIZ != null) {
            c661020PwK.LJ("end_to_end_search_session_id", strLIZ);
        }
        if (aweme != null && (aid2 = aweme.getAid()) != null) {
            c661020PwK.LJ("list_item_id", aid2);
        }
    }
}
