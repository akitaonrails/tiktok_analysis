package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1358630lSX extends C2217421BqW implements Function1<UpvoteStruct, Boolean> {
    public C1358630lSX(Object obj) {
        super(1, obj, UpvotePanelListCell.class, "onItemLongClick", "onItemLongClick(Lcom/ss/android/ugc/aweme/feed/model/upvote/UpvoteStruct;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UpvoteStruct upvoteStruct) {
        return Boolean.valueOf(((UpvotePanelListCell) this.receiver).z6(upvoteStruct));
    }
}
