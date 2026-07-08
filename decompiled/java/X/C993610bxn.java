package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993610bxn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ SocialFriendsFeedFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C993610bxn(float f, float f2, SocialFriendsFeedFragment socialFriendsFeedFragment) {
        super(0);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = socialFriendsFeedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG activity;
        Window window;
        Integer numLIZJ;
        if (this.LL > this.LLILLJJLI && C0C64.LJIILLIIL().LJIIIZ(31744, "is_release_window_background", true, true) && (activity = this.LLILLL.getActivity()) != null && (window = activity.getWindow()) != null) {
            Context context = this.LLILLL.getContext();
            window.setBackgroundDrawable((context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context)) == null) ? null : new ColorDrawable(numLIZJ.intValue()));
        }
        return Unit.LIZ;
    }
}
