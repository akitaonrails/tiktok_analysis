package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355550lNZ extends C09AY implements Function2<CharSequence, Boolean, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ UpvotePanelListCell LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355550lNZ(String str, String str2, User user, Aweme aweme, UpvotePanelListCell upvotePanelListCell) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = user;
        this.LLILZ = aweme;
        this.LLILZIL = upvotePanelListCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CharSequence charSequence, Boolean bool) {
        CharSequence charSequence2 = charSequence;
        UpvoteStruct upvoteStruct = null;
        if (bool.booleanValue()) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            String str = this.LL;
            String str2 = this.LLILLJJLI;
            User user = this.LLILLL;
            Aweme aweme = this.LLILZ;
            C1358130lRj item = this.LLILZIL.getItem();
            if (item != null) {
                upvoteStruct = item.LL;
            }
            C1358550lSP.LJIIZILJ(c1358550lSP, str, str2, "sticker", user, aweme, upvoteStruct, charSequence2.toString(), 384);
        } else {
            C1358550lSP c1358550lSP2 = C1358550lSP.LIZ;
            String str3 = this.LL;
            String str4 = this.LLILLJJLI;
            User user2 = this.LLILLL;
            Aweme aweme2 = this.LLILZ;
            C1358130lRj item2 = this.LLILZIL.getItem();
            if (item2 != null) {
                upvoteStruct = item2.LL;
            }
            C1358550lSP.LJIIZILJ(c1358550lSP2, str3, str4, "text", user2, aweme2, upvoteStruct, null, 448);
        }
        return Unit.LIZ;
    }
}
