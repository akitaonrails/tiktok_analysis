package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS255S0300000_11;

/* JADX INFO: renamed from: X.0StB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735510StB implements InterfaceC1350330lF9 {
    @Override // X.InterfaceC1350330lF9
    public final String H3() {
        return "poi";
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJ() {
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJFF(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final Map LJII(Aweme aweme) {
        return null;
    }

    @Override // X.InterfaceC1350330lF9
    public final void LJIIIZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1350330lF9
    public final int zg() {
        return 11;
    }

    @Override // X.InterfaceC1350330lF9
    public final Integer LJIIIIZZ(Aweme aweme) {
        C1367960lha.LIZ.getClass();
        return C1367960lha.LIZ().LJJJLZIJ();
    }

    @Override // X.InterfaceC1350330lF9
    public final void LIZJ(CommentContextSource commentContextSource, Aweme aweme) {
        String aid;
        C1350340lFA.LIZ(this, aweme, commentContextSource);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1440005kM.LIZ(new C735520StC(aid));
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LJI(CommentContextSource commentContextSource, Aweme aweme) {
        if (aweme == null || commentContextSource == null) {
            return false;
        }
        CommentCommonModel commonModel = commentContextSource.getCommonModel();
        if ((commonModel != null && commonModel.shouldShowVideoDesc) || commentContextSource.getCommonModel().forceHidePoi) {
            return false;
        }
        PoiAnchorData.Companion.getClass();
        if (C735490St9.LIZ(aweme, "comment_header") == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1350330lF9
    public final boolean LIZLLL(Aweme aweme, C2189821An6 c2189821An6, String str) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null) {
            return false;
        }
        if (C729510SjV.LJJ(aweme) && C1601110rld.LIZ() && !AwemeExtKt.isScheduleVideo(aweme)) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme))) {
                return false;
            }
        }
        if (c2189821An6 != null) {
            int i = BubbleListAssem.LLLI;
            if (C0ROI.LIZ(aweme, c2189821An6)) {
                return false;
            }
        }
        PoiAnchorData.Companion.getClass();
        if (C735490St9.LIZ(aweme, "comment_header") == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == EnumC1430380nKG.POI.getTYPE() && anchorCommonStruct2.getExtra().length() > 0) {
                if (anchorCommonStruct == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1350330lF9
    public final View LJIIL(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        if (context == null) {
            return null;
        }
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.eventType) == null) {
            str = "";
        }
        return iPoiServiceLIZ.LJLZ(context, aweme, str, new AwS255S0300000_11(this, aweme, commentContextSource, 16));
    }
}
