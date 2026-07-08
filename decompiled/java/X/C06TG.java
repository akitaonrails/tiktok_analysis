package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCreationSheetFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.06TG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TG {
    public static StoryHighlightsCreationSheetFragment LIZ(String str, String str2, List list, boolean z, boolean z2) {
        StoryHighlightsCreationSheetFragment storyHighlightsCreationSheetFragment = new StoryHighlightsCreationSheetFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("collection_cover_uri", str, bundle);
        C786410Ut5.LJJJIL(bundle, "collection_cover_url_list", new ArrayList(list));
        C786410Ut5.LJJJI("cover_aweme_id", str2, bundle);
        bundle.putBoolean("can_return_to_list_page", z);
        bundle.putBoolean("show_list_initially", z2);
        storyHighlightsCreationSheetFragment.setArguments(bundle);
        return storyHighlightsCreationSheetFragment;
    }
}
