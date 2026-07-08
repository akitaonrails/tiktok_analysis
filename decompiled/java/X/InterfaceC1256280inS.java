package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.List;

/* JADX INFO: renamed from: X.0inS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1256280inS {
    void LJIILIIL();

    boolean LJIILL();

    boolean LJIJ();

    void LJIJJ(String str, List<RichTextInfo> list);

    void LJIL(EnumC1256540ins enumC1256540ins);

    void LJJIFFI();

    View LJJZZI();

    CharSequence getContentText();

    boolean getEnableStarSticker();

    String getMentionUidsString();

    String getNotePromptText();

    void setContentMaxLines(int i);

    void setContentMaxWidth(int i);

    void setEnableStarSticker(boolean z);

    void setMentionText(List<StoryNoteTextExtra> list);

    void setThoughtData(StoryNoteDataCollection storyNoteDataCollection);
}
