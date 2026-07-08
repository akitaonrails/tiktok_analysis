package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;

/* JADX INFO: renamed from: X.15gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20585615gs extends CharacterStyle implements UpdateAppearance {
    public final int LL;
    public final StoryNoteTextExtra LLILLJJLI;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.LL);
    }

    public C20585615gs(int i, StoryNoteTextExtra storyNoteTextExtra) {
        this.LL = i;
        this.LLILLJJLI = storyNoteTextExtra;
    }
}
