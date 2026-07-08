package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.15gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20584815gk extends TuxTextView implements InterfaceC1256280inS {
    public final C20585015gm LLJJJJ;
    public final C557050Lt1 LLJJJJJIL;
    public EnumC1257160ios LLJJJJLIIL;
    public C1256320inW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public List<RichTextInfo> LLJLIL;
    public List<StoryNoteTextExtra> LLJLILLLLZIIL;
    public StoryNoteDataCollection LLJLL;
    public String LLJLLIL;
    public C20580415g2 LLJLLL;
    public final C01GW LLJZ;
    public boolean LLJZIJLIL;

    public C20584815gk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC1256280inS
    public final View LJJZZI() {
        return this;
    }

    @Override // X.InterfaceC1256280inS
    public boolean getEnableStarSticker() {
        return this.LLJJJJ.LJII != null;
    }

    public final Method getHintLayoutMethod() {
        return (Method) this.LLJZ.getValue();
    }

    public final List<StoryNoteTextExtra> getMentionText() {
        List<StoryNoteTextExtra> list = this.LLJLILLLLZIIL;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (StoryNoteTextExtra storyNoteTextExtra : list) {
            Integer num = storyNoteTextExtra.type;
            if (num != null && num.intValue() == 1) {
                arrayList.add(storyNoteTextExtra);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIILIIL() {
        set_prompt(C20580615g4.LIZ(getContext(), false, false));
    }

    @Override // X.InterfaceC1256280inS
    public final boolean LJIILL() {
        EnumC19387610t8 enumC19387610t8 = getPrompt().LIZIZ;
        if (enumC19387610t8 != EnumC19387610t8.HOLIDAY && enumC19387610t8 != EnumC19387610t8.DYNAMIC) {
            return false;
        }
        CharSequence text = getText();
        return text == null || text.length() == 0;
    }

    @Override // X.InterfaceC1256280inS
    public final boolean LJIJ() {
        List<StoryNoteTextExtra> mentionText = getMentionText();
        if (!(!mentionText.isEmpty()) || mentionText.isEmpty()) {
            return false;
        }
        Iterator<StoryNoteTextExtra> it2 = mentionText.iterator();
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
        LJIILIIL();
        LJIJJ(null, null);
        setMentionText(null);
        setThoughtData(null);
        setEnterFrom(null);
    }

    public final void LJJJJL() {
        CharSequence text = getText();
        setHint((text == null || text.length() == 0) ? this.LLJLLL.LIZ : "");
    }

    @Override // X.InterfaceC1256280inS
    public CharSequence getContentText() {
        return getText();
    }

    @Override // X.InterfaceC1256280inS
    public String getMentionUidsString() {
        List<StoryNoteTextExtra> mentionText = getMentionText();
        if (mentionText.isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(mentionText, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(213), 30);
    }

    @Override // X.InterfaceC1256280inS
    public String getNotePromptText() {
        String str = getPrompt().LIZ;
        CharSequence text = getText();
        if (text == null || text.length() == 0) {
            return str;
        }
        return null;
    }

    private final StoryNoteDataCollection getStoryNoteData() {
        return this.LLJLL;
    }

    public final EnumC1257160ios getBubbleStyle() {
        return this.LLJJJJLIIL;
    }

    public final boolean getEnableDarkMode() {
        return this.LLJL;
    }

    public final boolean getEnableSmallScreen() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getEnterFrom() {
        return this.LLJLLIL;
    }

    public final C20580415g2 getPrompt() {
        return this.LLJLLL;
    }

    private final void set_prompt(C20580415g2 c20580415g2) {
        this.LLJLLL = c20580415g2;
        LJJJJL();
    }

    private final void set_tuxFontConfig(C1256320inW c1256320inW) {
        this.LLJJL = c1256320inW;
        LJJJJLI(this, null, c1256320inW, false, 29);
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIL(EnumC1256540ins enumC1256540ins) {
        int i = C1256550int.LIZIZ[enumC1256540ins.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setBubbleStyle(EnumC1257160ios.MINI);
                setTuxFontConfig(C1256300inU.LIZ());
                return;
            }
            throw new C1954807lC();
        }
        setBubbleStyle(EnumC1257160ios.MINI);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLJJJJ.LIZJ(canvas);
        super.onDraw(canvas);
    }

    public final void setBubbleStyle(EnumC1257160ios enumC1257160ios) {
        boolean z;
        boolean z2 = true;
        if (this.LLJJJJLIIL != enumC1257160ios) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJLIIL = enumC1257160ios;
        if (this.LLJJJJJIL.LIZ(false, true) || z) {
            EnumC1257160ios enumC1257160ios2 = this.LLJJJJLIIL;
            if (this.LLJJJJ.LJII == null) {
                z2 = false;
            }
            LJJJJJ(enumC1257160ios2, z2);
        }
        if (C298620BnA.LIZ() && enumC1257160ios != EnumC1257160ios.MINI) {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // X.InterfaceC1256280inS
    public void setContentMaxLines(int i) {
        setMaxLines(i);
    }

    @Override // X.InterfaceC1256280inS
    public void setContentMaxWidth(int i) {
        setMaxWidth(i);
    }

    public final void setEnableDarkMode(boolean z) {
        this.LLJL = z;
        int iIntValue = 2046820352;
        int iIntValue2 = -16777216;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            setTextColor(iIntValue2);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            setHintTextColor(iIntValue);
        } else {
            setTextColor(-16777216);
            setHintTextColor(2046820352);
        }
        this.LLJJJJ.LJ(this.LLJL);
        invalidate();
    }

    public final void setEnableSmallScreen(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
        LJJJJLI(this, null, null, z, 27);
    }

    @Override // X.InterfaceC1256280inS
    public void setEnableStarSticker(boolean z) {
        Drawable drawableLIZIZ;
        boolean z2;
        int i;
        C20585015gm c20585015gm = this.LLJJJJ;
        if (z) {
            if (c20585015gm.LJIIIIZZ && C960203pA.LIZIZ(c20585015gm.LIZ)) {
                i = R.drawable.acg;
            } else {
                i = R.drawable.acf;
            }
            drawableLIZIZ = C800330VaR.LIZIZ(c20585015gm.LIZ, i);
        } else {
            drawableLIZIZ = null;
        }
        c20585015gm.LJII = drawableLIZIZ;
        EnumC1257160ios enumC1257160ios = c20585015gm.LJ;
        int i2 = c20585015gm.LJFF;
        int i3 = c20585015gm.LJI;
        if (drawableLIZIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c20585015gm.LIZ(enumC1257160ios, i2, i3, z2);
        c20585015gm.LIZIZ(c20585015gm.LJ, c20585015gm.LJII, c20585015gm.LJFF, c20585015gm.LJI);
        LJJJJJ(this.LLJJJJLIIL, z);
    }

    public void setEnterFrom(String str) {
        this.LLJLLIL = str;
    }

    public final void setHintText(String str) {
        setPromptDirectly(new C20580415g2(str, EnumC19387610t8.DEFAULT));
    }

    public final void setIsInImmersiveFeed(boolean z) {
        this.LLJZIJLIL = z;
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
        this.LLJLILLLLZIIL = arrayList;
        LJJJJLI(this, null, null, false, 31);
    }

    public final void setPromptDirectly(C20580415g2 c20580415g2) {
        set_prompt(c20580415g2);
    }

    @Override // X.InterfaceC1256280inS
    public void setThoughtData(StoryNoteDataCollection storyNoteDataCollection) {
        this.LLJLL = storyNoteDataCollection;
    }

    public final void setTuxFontConfig(C1256320inW c1256320inW) {
        set_tuxFontConfig(c1256320inW);
    }

    @Override // X.InterfaceC1256280inS
    public final void LJIJJ(String str, List<RichTextInfo> list) {
        this.LLJLIL = list;
        setText(str);
        LJJJJLI(this, null, null, false, 31);
        LJJJJL();
    }

    public final void LJJJJJ(EnumC1257160ios enumC1257160ios, boolean z) {
        int iLIZIZ;
        int iLIZIZ2;
        setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getMinWidthDp()))));
        setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getMinHeightDp()))));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingHorizontalDp())));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingVerticalDp())));
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getStarStickerMarginTopDp())));
        } else {
            iLIZIZ = 0;
        }
        int i = iLIZIZ4 + iLIZIZ;
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingHorizontalDp())));
        if (z) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getStarStickerMarginRightDp())));
        } else {
            iLIZIZ2 = 0;
        }
        setPaddingRelative(iLIZIZ3, i, iLIZIZ5 + iLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingVerticalDp()))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getBubblePaddingBottomDp()))));
        this.LLJJJJ.LIZLLL(enumC1257160ios);
        LJJJJLI(this, enumC1257160ios, null, false, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20584815gk.onMeasure(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20584815gk(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z4;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        C20585015gm c20585015gm = new C20585015gm(context);
        this.LLJJJJ = c20585015gm;
        this.LLJJJJJIL = new C557050Lt1(false);
        setGravity(8388627);
        setTextAlignment(4);
        setEllipsize(TextUtils.TruncateAt.END);
        setTextDirection(3);
        EnumC1257160ios enumC1257160ios = EnumC1257160ios.NORMAL;
        this.LLJJJJLIIL = enumC1257160ios;
        LJJJJJ(enumC1257160ios, c20585015gm.LJII != null);
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = true;
        setEnableDarkMode(true);
        this.LLJLLL = new C20580415g2(context.getString(2131849044), EnumC19387610t8.DEFAULT);
        this.LLJZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 61));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        C20585015gm c20585015gm = this.LLJJJJ;
        c20585015gm.LJFF = i;
        c20585015gm.LJI = i2;
        EnumC1257160ios enumC1257160ios = c20585015gm.LJ;
        if (c20585015gm.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        c20585015gm.LIZ(enumC1257160ios, i, i2, z);
        c20585015gm.LIZIZ(c20585015gm.LJ, c20585015gm.LJII, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJLI(X.C20584815gk r10, X.EnumC1257160ios r11, X.C1256320inW r12, boolean r13, int r14) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20584815gk.LJJJJLI(X.15gk, X.0ios, X.0inW, boolean, int):void");
    }
}
