package X;

import Y.ARunnableS75S0200000_6;
import android.text.SpannableStringBuilder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.exposedcmt.friends.repost.FriendsV3RepostCommentCellAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C443550HaL extends C2217421BqW implements Function1<SpannableStringBuilder, Unit> {
    public C443550HaL(Object obj) {
        super(1, obj, FriendsV3RepostCommentCellAssem.class, "loadFailUserIcon", "loadFailUserIcon(Landroid/text/SpannableStringBuilder;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder) {
        FriendsV3RepostCommentCellAssem friendsV3RepostCommentCellAssem = (FriendsV3RepostCommentCellAssem) this.receiver;
        HandlerHook.viewPost(friendsV3RepostCommentCellAssem.op(), new ARunnableS75S0200000_6(friendsV3RepostCommentCellAssem, spannableStringBuilder, 8));
        return Unit.LIZ;
    }
}
