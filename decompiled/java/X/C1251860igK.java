package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import java.util.List;

/* JADX INFO: renamed from: X.0igK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251860igK {
    public static final StoryNoteDataCollection LIZ(ProfileStoryNote profileStoryNote, String str) {
        String str2;
        String str3;
        UrlModel urlModel;
        List<RichTextInfo> list;
        Integer num;
        List<String> list2;
        List<String> list3;
        List<StoryNoteTextExtra> list4 = null;
        if (profileStoryNote != null) {
            str2 = profileStoryNote.text;
            str3 = profileStoryNote.aid;
            urlModel = profileStoryNote.dynamicAvatarUrl;
            list = profileStoryNote.richText;
        } else {
            str2 = null;
            str3 = null;
            urlModel = null;
            list = null;
        }
        if (profileStoryNote != null) {
            num = profileStoryNote.avatarThoughtType;
            list2 = profileStoryNote.avatarImgUrl;
            list3 = profileStoryNote.avatarImgUrl;
        } else {
            num = null;
            list2 = null;
            list3 = null;
        }
        if (profileStoryNote != null) {
            list4 = profileStoryNote.textExtras;
        }
        return new StoryNoteDataCollection(str2, str3, str, urlModel, list, null, num, list2, list3, null, list4);
    }
}
