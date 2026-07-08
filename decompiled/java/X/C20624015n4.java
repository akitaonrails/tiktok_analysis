package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15n4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20624015n4 {
    public static final C20624015n4 LIZ = new C20624015n4();
    public static final String[] LIZIZ;
    public static final List<String> LIZJ;
    public static final String LIZLLL;
    public static NewDislikeReason LJ;
    public static final NewDislikeReason[] LJFF;
    public static List<NewDislikeReason> LJI;
    public static final int LJII;

    static {
        String[] strArrLIZIZ;
        IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
        if (iFilterVideoService == null || (strArrLIZIZ = iFilterVideoService.LIZIZ()) == null) {
            strArrLIZIZ = new String[0];
        }
        LIZIZ = strArrLIZIZ;
        LIZJ = C1697810uHb.LJIIJJI("#viral", "#fyf", "#fyp", "#foryou", "#foryoufeed", "#foryoupage", "#fy");
        LIZLLL = "6";
        NewDislikeReason[] newDislikeReasonArr = (NewDislikeReason[]) C20624215n6.LIZ.getValue();
        if (newDislikeReasonArr == null) {
            newDislikeReasonArr = new NewDislikeReason[0];
        }
        LJFF = newDislikeReasonArr;
        LJII = CastIntegerProtector.parseInt("6");
    }

    public static final List<DislikeHashTag> LIZ(Aweme aweme) {
        ArrayList arrayList = new ArrayList();
        if (aweme.getTextExtra() == null) {
            return arrayList;
        }
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            if (textExtraStruct.getType() == 1 && !TextUtils.isEmpty(textExtraStruct.getHashTagName())) {
                if (!C13LQ.LJIILLIIL(textExtraStruct.getHashTagName(), LIZIZ) && !LIZJ.contains(textExtraStruct.getHashTagName())) {
                    String cid = textExtraStruct.getCid();
                    String str = "";
                    if (cid == null) {
                        cid = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    String hashTagName = textExtraStruct.getHashTagName();
                    if (hashTagName != null) {
                        str = hashTagName;
                    }
                    sbLIZ.append(str);
                    arrayList.add(new DislikeHashTag(cid, C2188811AlT.LIZIZ(sbLIZ)));
                }
            }
        }
        return arrayList;
    }
}
