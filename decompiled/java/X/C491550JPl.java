package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491550JPl {
    public static SuggestEmotePageFragment LIZ(String str, String str2, String str3, String str4, Function0 function0, boolean z) {
        SuggestEmotePageFragment suggestEmotePageFragment = new SuggestEmotePageFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("sec_user_id", str, bundle);
        C786410Ut5.LJJJI("show_entrance", str2, bundle);
        C786410Ut5.LJJJI("anchor_id", str3, bundle);
        C786410Ut5.LJJJI("upload_user_type", str4, bundle);
        bundle.putBoolean("is_sheet", z);
        suggestEmotePageFragment.setArguments(bundle);
        suggestEmotePageFragment.LLIZ = function0;
        return suggestEmotePageFragment;
    }
}
