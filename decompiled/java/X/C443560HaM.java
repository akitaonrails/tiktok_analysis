package X;

import Y.ARunnableS75S0200000_6;
import android.text.SpannableStringBuilder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.exposedcmt.friends.FriendsV3CommentCellAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C443560HaM extends C2217421BqW implements Function1<SpannableStringBuilder, Unit> {
    public C443560HaM(Object obj) {
        super(1, obj, FriendsV3CommentCellAssem.class, "loadFailUserIcon", "loadFailUserIcon(Landroid/text/SpannableStringBuilder;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder) {
        FriendsV3CommentCellAssem friendsV3CommentCellAssem = (FriendsV3CommentCellAssem) this.receiver;
        HandlerHook.viewPost(friendsV3CommentCellAssem.up(), new ARunnableS75S0200000_6(friendsV3CommentCellAssem, spannableStringBuilder, 149));
        return Unit.LIZ;
    }
}
