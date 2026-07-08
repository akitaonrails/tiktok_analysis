package X;

import android.animation.AnimatorSet;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.mention.MentionSpanData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FLB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLB extends C0FKN {
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final C388200FJy LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public C0FL4 LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C0FLJ LJIIL;
    public final List<C0FLJ> LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public AnimatorSet LJIILLIIL;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        C21410318qb c21410318qbLJIILIIL;
        Editable editableLLJILLL;
        LJIJI(false);
        C385340F8y c385340F8yLJIIZILJ = LJIIZILJ();
        if (c385340F8yLJIIZILJ != null && c385340F8yLJIIZILJ.getLayout() != null && (c21410318qbLJIILIIL = LJIILIIL()) != null && (editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null))) != null) {
            List<TextMentionModel> listLJIJ = LJIJ(editableLLJILLL, C0FMX.LIZJ(editableLLJILLL));
            List<TextMentionModel> mentionList = this.LIZLLL.LJ.LIZ.getMentionList();
            boolean z = this.LIZLLL.LJ.LIZ.getTextTemplateModel().enableTextTemplate;
            String textStr = this.LIZLLL.LJ.LIZ.getTextStr();
            if (z && mentionList != null && !mentionList.isEmpty()) {
                ArrayList arrayList = (ArrayList) listLJIJ;
                if (arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (TextMentionModel textMentionModel : mentionList) {
                        String mentionText = textMentionModel.getMentionText();
                        if (mentionText != null && mentionText.length() != 0 && a0.LJJIIZI(textStr, mentionText, false)) {
                            arrayList2.add(textMentionModel);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            this.LIZLLL.LJ.LIZLLL(new AwS584S0100000_5(listLJIJ, (List<Pair<Long, Float>>) 1142), true);
            if (!((ArrayList) listLJIJ).isEmpty()) {
                this.LJIIIZ = true;
            }
        }
        C0FL4 c0fl4 = this.LJIIIIZZ;
        if (c0fl4 != null) {
            c0fl4.LLIZ = null;
            c0fl4.LLIZLLLIL = null;
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.C0FKN
    public final void LJIIL() {
        Editable editableLLJILLL;
        List list;
        List<C0FLJ> list2;
        this.LJIIJJI = false;
        List<C0FLJ> list3 = this.LJIILIIL;
        if (list3 != null) {
            ((ArrayList) list3).clear();
        }
        C21410318qb c21410318qbLJIILIIL = LJIILIIL();
        if (c21410318qbLJIILIIL == null || (editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null))) == null || editableLLJILLL.length() == 0) {
            return;
        }
        for (MentionSpanData mentionSpanData : C0FMX.LIZJ(editableLLJILLL)) {
            int spanStart = editableLLJILLL.getSpanStart(mentionSpanData);
            int spanEnd = editableLLJILLL.getSpanEnd(mentionSpanData);
            C0FLJ c0flj = new C0FLJ(spanStart, spanEnd);
            if (!TextUtils.equals(editableLLJILLL.subSequence(spanStart, spanEnd).toString(), mentionSpanData.text)) {
                editableLLJILLL.removeSpan(mentionSpanData);
            } else if (mentionSpanData.type == 0 && (list2 = this.LJIILIIL) != null) {
                ((ArrayList) list2).add(c0flj);
            }
        }
        List<C0FLJ> list4 = this.LJIILIIL;
        if (list4 == null || (list = (List) this.LJIILJJIL.getValue()) == null) {
            return;
        }
        list.addAll(list4);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() throws Throwable {
        final C0FL4 c0fl4;
        if (!this.LIZLLL.LJIIIZ.LJJ.LIZJ && (c0fl4 = this.LJIIIIZZ) != null) {
            c0fl4.setTextMentionListener(new C0F9G() { // from class: X.0FLG
                @Override // X.C0F9G
                public final InputConnection LIZIZ(InputConnection inputConnection) {
                    return new C388640FLq(this.LIZ, inputConnection, c0fl4);
                }

                @Override // X.C0F9G
                public final void LIZ(int i, int i2) {
                    C0FL4 c0fl42;
                    C0FL4 c0fl43;
                    C0FLJ c0flj = this.LIZ.LJIIL;
                    if (c0flj != null && c0flj.LIZJ(i, i2)) {
                        return;
                    }
                    C0FLJ c0fljLJIILJJIL = this.LIZ.LJIILJJIL(i, i2);
                    if (c0fljLJIILJJIL != null && c0fljLJIILJJIL.LIZIZ == i2) {
                        this.LIZ.LJIIJJI = false;
                    }
                    C0FLJ c0fljLJIILL = this.LIZ.LJIILL(i, i2);
                    if (c0fljLJIILL == null) {
                        return;
                    }
                    try {
                        if (i == i2) {
                            C0FL4 c0fl44 = this.LIZ.LJIIIIZZ;
                            if (c0fl44 != null) {
                                c0fl44.setSelection(c0fljLJIILL.LIZIZ(i));
                                return;
                            }
                            return;
                        }
                        int i3 = c0fljLJIILL.LIZIZ;
                        if (i2 < i3 && (c0fl43 = this.LIZ.LJIIIIZZ) != null) {
                            c0fl43.setSelection(i, i3);
                        }
                        int i4 = c0fljLJIILL.LIZ;
                        if (i > i4 && (c0fl42 = this.LIZ.LJIIIIZZ) != null) {
                            c0fl42.setSelection(i4, i2);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        C21410318qb c21410318qbLJIILIIL = LJIILIIL();
        if (c21410318qbLJIILIIL != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null));
            if (editableLLJILLL != null) {
                c21410318qbLJIILIIL.setSelection(editableLLJILLL.length());
                LJIIJJI(c21410318qbLJIILIIL.getSelectionStart(), editableLLJILLL);
            }
            if (C0F8Y.LJFF(this.LIZLLL.LJ.LIZ)) {
                this.LIZLLL.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(538), true);
            }
        }
    }

    @Override // X.C0FKN
    public final boolean LJIIIIZZ() {
        return this.LIZLLL.LJIIJ.LIZ.LJFF.isVisible();
    }

    @Override // X.C0FKN
    public final boolean LJIIJ() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            return true;
        }
        if (this.LJIIJ || this.LIZIZ.getVisibility() == 0) {
            return true;
        }
        C21410318qb c21410318qbLJIILIIL = LJIILIIL();
        return C0FMX.LIZJ(c21410318qbLJIILIIL != null ? C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null)) : null).length != 0;
    }

    public final C21410318qb LJIILIIL() {
        C0FL4 c0fl4 = this.LJIIIIZZ;
        return c0fl4 == null ? LJIIZILJ() : c0fl4;
    }

    public final C0FLH LJIILLIIL() {
        return (C0FLH) this.LJ.getValue();
    }

    public final C385340F8y LJIIZILJ() {
        return (C385340F8y) this.LJFF.getValue();
    }

    @Override // X.C0FKN
    public final void LJIIIZ() {
        C21410318qb c21410318qbLJIILIIL;
        Editable editableLLJILLL;
        C385340F8y c385340F8yLJIIZILJ = LJIIZILJ();
        if (c385340F8yLJIIZILJ == null || c385340F8yLJIIZILJ.getLayout() == null || (c21410318qbLJIILIIL = LJIILIIL()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null))) == null) {
            return;
        }
        MentionSpanData[] mentionSpanDataArrLIZJ = C0FMX.LIZJ(editableLLJILLL);
        if (mentionSpanDataArrLIZJ.length == 0) {
            return;
        }
        List<TextMentionModel> listLJIJ = LJIJ(editableLLJILLL, mentionSpanDataArrLIZJ);
        if (!((ArrayList) listLJIJ).isEmpty()) {
            this.LIZLLL.LJ.LIZLLL(new AwS584S0100000_5(listLJIJ, (List<Pair<Long, Float>>) 1132), true);
            this.LJIIIZ = true;
        }
    }

    public final void LJIJI(boolean z) {
        C0FLH c0flhLJIILLIIL;
        boolean z2 = false;
        if (z && (c0flhLJIILLIIL = LJIILLIIL()) != null && c0flhLJIILLIIL.LIZ()) {
            z2 = true;
        }
        if (this.LIZLLL.LJIIJ.LIZ.LJFF.isVisible() == z2) {
            return;
        }
        this.LIZLLL.LJIIJ.LIZLLL(new AwS93S0110000_5(z, this, 21), true);
    }

    @Override // X.C0FKN
    public final void LJIIJJI(int i, Editable editable) throws Throwable {
        int size;
        Editable editableLLJILLL;
        int i2;
        Editable editableLLJILLL2;
        int size2;
        C0FKW c0fkw;
        if (C0F8Y.LJIIIIZZ(this.LIZLLL.LJ.LIZ) || (this.LIZLLL.LJIIIZ.LJJ.LJ && (c0fkw = (C0FKW) this.LJIILL.getValue()) != null && c0fkw.LJIIIIZZ())) {
            LJIJI(false);
            return;
        }
        String strLIZLLL = C0FMX.LIZLLL(i, editable);
        if (strLIZLLL == null) {
            LJIJI(false);
            return;
        }
        C1408605fI c1408605fI = C1408605fI.LIZIZ;
        List<C0FTJ<StickerModel>> listLIZLLL = C390410FSl.LIZLLL(this.LIZLLL.LIZ);
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : listLIZLLL) {
            if (c0ftj.getStickerType() == EnumC1466150oFx.TEXT) {
                arrayList.add(c0ftj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            List<TextMentionModel> mentionList = ((C0FFC) ((C0FTJ) it2.next())).LJLI().getMentionList();
            if (mentionList != null) {
                size2 = mentionList.size();
            } else {
                size2 = 0;
            }
            i3 += size2;
        }
        List<TextMentionModel> mentionList2 = this.LIZLLL.LJ.LIZ.getMentionList();
        if (mentionList2 != null) {
            size = mentionList2.size();
        } else {
            size = 0;
        }
        C21410318qb c21410318qbLJIILIIL = LJIILIIL();
        String str = null;
        if (c21410318qbLJIILIIL != null) {
            editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null));
        } else {
            editableLLJILLL = null;
        }
        int length = C0FMX.LIZJ(editableLLJILLL).length;
        ArrayList arrayList2 = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj2 : listLIZLLL) {
            if (c0ftj2.getStickerType() == EnumC1466150oFx.MENTION) {
                arrayList2.add(c0ftj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add((C0FTJ) it3.next());
        }
        if (arrayList3.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it4 = arrayList3.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if (((C19628111qp) it4.next()).LJJJLL().LIZ.getUserId() != null && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (c1408605fI.LIZ((i3 - size) + length + i2, C0FNT.LIZ(this.LIZIZ.getContext()), EnumC1413205g2.TEXT_MENTION)) {
            return;
        }
        C21410318qb c21410318qbLJIILIIL2 = LJIILIIL();
        if (c21410318qbLJIILIIL2 != null) {
            editableLLJILLL2 = C2204961BRm.LLJILLL(c21410318qbLJIILIIL2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null));
        } else {
            editableLLJILLL2 = null;
        }
        if (C0FMX.LIZJ(editableLLJILLL2).length >= 20) {
            LJIJI(false);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZIZ);
            c1389890mGx.LJIIJ(C786410Ut5.j4(this.LIZIZ.getContext().getString(2131831014), Arrays.copyOf(new Object[]{20}, 1)));
            c1389890mGx.LJIIJJI();
            return;
        }
        C0FLH c0flhLJIILLIIL = LJIILLIIL();
        if (c0flhLJIILLIIL != null && c0flhLJIILLIIL.LLLLLJIL(new AwS584S0100000_5(this, 1133))) {
            return;
        }
        LJIJI(true);
        C0FLH c0flhLJIILLIIL2 = LJIILLIIL();
        if (c0flhLJIILLIIL2 != null) {
            C0FKX c0fkx = (C0FKX) this.LJI.getValue();
            if (c0fkx != null && c0fkx.LJIIIIZZ()) {
                str = "caption_mode_click_button";
            }
            c0flhLJIILLIIL2.LLLLLILLIL(strLIZLLL, str);
        }
    }

    public final C0FLJ LJIILJJIL(int i, int i2) {
        List<C0FLJ> list = this.LJIILIIL;
        if (list != null) {
            for (C0FLJ c0flj : (ArrayList) list) {
                if (c0flj.LIZ(i, i2)) {
                    return c0flj;
                }
            }
            return null;
        }
        return null;
    }

    public final C0FLJ LJIILL(int i, int i2) {
        List<C0FLJ> list = this.LJIILIIL;
        if (list != null) {
            for (C0FLJ c0flj : (ArrayList) list) {
                if (c0flj.LIZLLL(i, i2)) {
                    return c0flj;
                }
            }
            return null;
        }
        return null;
    }

    public final List<TextMentionModel> LJIJ(Editable editable, MentionSpanData[] mentionSpanDataArr) {
        Layout layout;
        int spanStart;
        int spanEnd;
        int lineForOffset;
        int lineForOffset2;
        C385340F8y c385340F8yLJIIZILJ = LJIIZILJ();
        if (c385340F8yLJIIZILJ != null && (layout = c385340F8yLJIIZILJ.getLayout()) != null) {
            ArrayList arrayList = new ArrayList();
            for (MentionSpanData mentionSpanData : mentionSpanDataArr) {
                C385340F8y c385340F8yLJIIZILJ2 = LJIIZILJ();
                if (c385340F8yLJIIZILJ2 != null && (lineForOffset = layout.getLineForOffset((spanStart = editable.getSpanStart(mentionSpanData)))) <= (lineForOffset2 = layout.getLineForOffset((spanEnd = editable.getSpanEnd(mentionSpanData))))) {
                    int i = lineForOffset;
                    while (true) {
                        int lineStart = layout.getLineStart(i);
                        int lineEnd = layout.getLineEnd(i) - 1;
                        if (i == lineForOffset) {
                            lineStart = spanStart;
                        }
                        if (i == lineForOffset2) {
                            lineEnd = spanEnd;
                        }
                        float paddingStart = c385340F8yLJIIZILJ2.getPaddingStart() + layout.getPrimaryHorizontal(lineStart);
                        float paddingStart2 = c385340F8yLJIIZILJ2.getPaddingStart() + layout.getPrimaryHorizontal(lineEnd);
                        String str = mentionSpanData.uid;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str3 = mentionSpanData.secId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = mentionSpanData.username;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = mentionSpanData.nickname;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        arrayList.add(new TextMentionModel(str, str3, str4, str2, mentionSpanData.avatarThumb, (int) paddingStart, layout.getLineTop(i) + c385340F8yLJIIZILJ2.getPaddingTop(), (int) paddingStart2, layout.getLineBottom(i) + c385340F8yLJIIZILJ2.getPaddingTop(), spanStart, spanEnd, mentionSpanData.text, false, c385340F8yLJIIZILJ2.getWidth(), c385340F8yLJIIZILJ2.getHeight()));
                        if (i != lineForOffset2) {
                            i++;
                        }
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public C0FLB(ViewGroup viewGroup, ViewGroup viewGroup2, C388200FJy c388200FJy) {
        final C385340F8y c385340F8yLJIIZILJ;
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup2;
        this.LIZLLL = c388200FJy;
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1592));
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1594));
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1591));
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1590));
        this.LJIILIIL = new ArrayList(20);
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1593));
        this.LJIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1589));
        C0FLH c0flhLJIILLIIL = LJIILLIIL();
        if (c0flhLJIILLIIL != null) {
            c0flhLJIILLIIL.LLLLL(viewGroup, viewGroup.getContext(), new C0FLC(this));
        }
        if (!c388200FJy.LJIIIZ.LJJ.LIZJ && (c385340F8yLJIIZILJ = LJIIZILJ()) != null) {
            c385340F8yLJIIZILJ.setTextMentionListener(new C0F9G() { // from class: X.0FLD
                @Override // X.C0F9G
                public final InputConnection LIZIZ(InputConnection inputConnection) {
                    return new C388640FLq(this.LIZ, inputConnection, c385340F8yLJIIZILJ);
                }

                @Override // X.C0F9G
                public final void LIZ(int i, int i2) {
                    C385340F8y c385340F8yLJIIZILJ2;
                    C385340F8y c385340F8yLJIIZILJ3;
                    C0FLB c0flb = this.LIZ;
                    if (c0flb.LJIIIIZZ != null) {
                        return;
                    }
                    C0FLJ c0flj = c0flb.LJIIL;
                    if (c0flj != null && c0flj.LIZJ(i, i2)) {
                        return;
                    }
                    C0FLJ c0fljLJIILJJIL = this.LIZ.LJIILJJIL(i, i2);
                    if (c0fljLJIILJJIL != null && c0fljLJIILJJIL.LIZIZ == i2) {
                        this.LIZ.LJIIJJI = false;
                    }
                    C0FLJ c0fljLJIILL = this.LIZ.LJIILL(i, i2);
                    if (c0fljLJIILL == null) {
                        return;
                    }
                    try {
                        if (i == i2) {
                            C385340F8y c385340F8yLJIIZILJ4 = this.LIZ.LJIIZILJ();
                            if (c385340F8yLJIIZILJ4 != null) {
                                c385340F8yLJIIZILJ4.setSelection(c0fljLJIILL.LIZIZ(i));
                                return;
                            }
                            return;
                        }
                        if (i2 < c0fljLJIILL.LIZIZ && (c385340F8yLJIIZILJ3 = this.LIZ.LJIIZILJ()) != null) {
                            c385340F8yLJIIZILJ3.setSelection(i, c0fljLJIILL.LIZIZ);
                        }
                        if (i > c0fljLJIILL.LIZ && (c385340F8yLJIIZILJ2 = this.LIZ.LJIIZILJ()) != null) {
                            c385340F8yLJIIZILJ2.setSelection(c0fljLJIILL.LIZ, i2);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FLK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LJFF;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1137));
    }
}
