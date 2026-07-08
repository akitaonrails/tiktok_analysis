package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.view.IThoughtBubblePromptResolver;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826450xd5 extends SocialThoughtBaseBubbleBackgroundView implements InterfaceC1256280inS {
    public static final List<Pair<Integer, Integer>> LLJJIJI = C1697810uHb.LJIIJJI(new Pair(13, 13), new Pair(11, 13));
    public final C1826440xd4 LLJILJILJ;
    public List<StoryNoteTextExtra> LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public boolean LLJJIII;

    @Override // X.InterfaceC1256280inS
    public final View LJJZZI() {
        return this;
    }

    public void setEnterFrom(String str) {
    }

    @Override // X.InterfaceC1256280inS
    public void setThoughtData(StoryNoteDataCollection storyNoteDataCollection) {
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIILIIL() {
        String str;
        boolean z = false;
        C0DZZ c0dzzLIZ = null;
        IThoughtBubblePromptResolver iThoughtBubblePromptResolver = (IThoughtBubblePromptResolver) PluggableExtentionKt.pluggableSpi$default(IThoughtBubblePromptResolver.class, false, false, false, 14, null);
        if (iThoughtBubblePromptResolver == null || (c0dzzLIZ = iThoughtBubblePromptResolver.LIZ(getContext(), false)) == null || (str = c0dzzLIZ.LIZ) == null) {
            str = "";
        }
        this.LLJJI = str;
        if (c0dzzLIZ != null && c0dzzLIZ.LIZIZ) {
            z = true;
        }
        this.LLJJIII = z;
        this.LLJILJILJ.setPrompt(str);
    }

    @Override // X.InterfaceC1256280inS
    public final boolean LJIILL() {
        if (!this.LLJJIII) {
            return false;
        }
        CharSequence text = this.LLJILJILJ.getText();
        return text == null || text.length() == 0;
    }

    @Override // X.InterfaceC1256280inS
    public final boolean LJIJ() {
        List<StoryNoteTextExtra> list = this.LLJILLL;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<StoryNoteTextExtra> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().type;
            if (num != null && num.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1256280inS
    public final void LJJIFFI() {
        this.LLJILJILJ.setText((CharSequence) null);
        this.LLJILJILJ.setPrompt(this.LLJJI);
        this.LLJILLL = null;
    }

    @Override // X.InterfaceC1256280inS
    public CharSequence getContentText() {
        return this.LLJILJILJ.getText();
    }

    @Override // X.InterfaceC1256280inS
    public String getMentionUidsString() {
        List<StoryNoteTextExtra> list = this.LLJILLL;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS269S0000000_27.get$arr$(151), 30);
    }

    @Override // X.InterfaceC1256280inS
    public String getNotePromptText() {
        String str = this.LLJJI;
        CharSequence text = this.LLJILJILJ.getText();
        if (text == null || text.length() == 0) {
            return str;
        }
        return null;
    }

    @Override // X.InterfaceC1256280inS
    public boolean getEnableStarSticker() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIL(EnumC1256540ins enumC1256540ins) {
        setBubbleShape(EnumC21568119ax.BOTTOM_LEFT_SMALL);
        this.LLJILJILJ.setMaxFontSize(61);
        this.LLJILJILJ.setOverflowMode(EnumC1779390wPB.SHRINK_OR_ELLIPSIZE);
        this.LLJILJILJ.setMinFontSize(11.0f);
        this.LLJILJILJ.setAutoSizeSteps(LLJJIJI);
    }

    @Override // X.InterfaceC1256280inS
    public void setContentMaxLines(int i) {
        this.LLJILJILJ.setMaxNumberOfLines(i);
    }

    @Override // X.InterfaceC1256280inS
    public void setContentMaxWidth(int i) {
        this.LLJILJILJ.setMaxContentWidth(i);
    }

    @Override // X.InterfaceC1256280inS
    public void setEnableStarSticker(boolean z) {
        this.LLJJ = z;
    }

    @Override // X.InterfaceC1256280inS
    public void setMentionText(List<StoryNoteTextExtra> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (StoryNoteTextExtra storyNoteTextExtra : list) {
                Integer num = storyNoteTextExtra.type;
                if (num != null && num.intValue() == 1) {
                    arrayList.add(storyNoteTextExtra);
                }
            }
        } else {
            arrayList = null;
        }
        this.LLJILLL = arrayList;
    }

    public C1826450xd5(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        C1826440xd4 c1826440xd4 = new C1826440xd4(context, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1826440xd4);
        c1826440xd4.setLayoutParams(layoutParams);
        int density = (int) (getDensity() * 10.0f);
        int density2 = (int) (getDensity() * 8.0f);
        c1826440xd4.setPadding(density, density2, density, density2);
        this.LLJILJILJ = c1826440xd4;
        this.LLJJI = "";
        setBubbleShape(EnumC21568119ax.BOTTOM_LEFT_SMALL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        setFillColor(iIntValue);
        setReserveShadowOutset(true);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(-getShadowOutsetTopPx());
        addView(c1826440xd4);
        LJIILIIL();
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIJJ(String str, List<RichTextInfo> list) {
        this.LLJILJILJ.setText(str);
    }
}
