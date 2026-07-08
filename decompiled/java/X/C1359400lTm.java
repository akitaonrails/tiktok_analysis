package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359400lTm extends C09AY implements InterfaceC1631620sYq<String, List<? extends TextExtraStruct>, String, Unit> {
    public final /* synthetic */ UpvotePublishMobParam LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ UpvotePublishExtraData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359400lTm(UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, String str) {
        super(3);
        this.LL = upvotePublishMobParam;
        this.LLILLJJLI = str;
        this.LLILLL = upvotePublishExtraData;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, List<? extends TextExtraStruct> list, String str2) {
        String str3 = str;
        List<? extends TextExtraStruct> list2 = list;
        String str4 = str2;
        if (str3 != null && str3.length() != 0) {
            UpvotePublishMobParam upvotePublishMobParam = this.LL;
            if (str4 == null) {
                str4 = upvotePublishMobParam.publishRepostTextEnterMethod;
            }
            upvotePublishMobParam.publishRepostTextEnterMethod = str4;
            C1360460lVU.LIZIZ.LJJJ(null, null, null, this.LLILLL, upvotePublishMobParam, 0, this.LLILLJJLI, str3, null, null, list2, null, null, false);
        }
        return Unit.LIZ;
    }
}
