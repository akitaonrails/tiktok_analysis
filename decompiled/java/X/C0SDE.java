package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo.FriendsV3PhotoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardVideoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.cell.FriendsV3RepostPhotoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.cell.FriendsV3RepostVideoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.storyreveal.FriendsV3StoryRevealPromoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.text.FriendsV3TextCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3VideoCell;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SDE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDE {
    public static final Map<Integer, Class<? extends PowerCell<? extends C14NM>>> LIZ;

    static {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(50001, FriendsV3VideoCell.class);
        pairArr[1] = new Pair(50002, C1206304nl.LIZ() ? FriendsV3RepostCardVideoCell.class : C1206404nm.LIZ() ? FriendsV3RepostVideoCell.class : FriendsV3VideoCell.class);
        pairArr[2] = new Pair(50101, FriendsV3PhotoCell.class);
        pairArr[3] = new Pair(50102, C1206304nl.LIZ() ? FriendsV3RepostCardPhotoCell.class : C1206404nm.LIZ() ? FriendsV3RepostPhotoCell.class : FriendsV3PhotoCell.class);
        pairArr[4] = new Pair(50201, FriendsV3LiveCell.class);
        pairArr[5] = new Pair(50301, FriendsV3TextCell.class);
        pairArr[6] = new Pair(50401, FriendsV3StoryRevealPromoCell.class);
        LIZ = C2097608Jq.LJIIIIZZ(pairArr);
    }
}
