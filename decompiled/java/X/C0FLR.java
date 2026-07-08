package X;

import Y.ACListenerS140S0100000_5;
import android.text.Editable;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.hashtag.HashtagSpanData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextHashtagModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FLR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLR extends C0FKM {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public C0FL4 LJIIIIZZ;
    public final C01GW LJIIIZ;
    public FrameLayout LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final List<C0FLJ> LJIILIIL;
    public C387990FJd LJIILJJIL;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() throws Throwable {
        Layout layout;
        LJIILJJIL(this, false);
        TextView textView = (TextView) this.LJI.getValue();
        if (textView == null || (layout = textView.getLayout()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C21410318qb c21410318qbLJIIL = LJIIL();
        String[] strArr = null;
        HashtagSpanData[] hashtagSpanDataArrLIZIZ = C0FMV.LIZIZ(c21410318qbLJIIL != null ? C2204961BRm.LLJJIII(c21410318qbLJIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", null)) : null);
        int length = hashtagSpanDataArrLIZIZ.length;
        int i = 0;
        while (i < length) {
            HashtagSpanData hashtagSpanData = hashtagSpanDataArrLIZIZ[i];
            C21410318qb c21410318qbLJIIL2 = LJIIL();
            if (c21410318qbLJIIL2 != null) {
                Editable editableLLJJIII = C2204961BRm.LLJJIII(c21410318qbLJIIL2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", strArr));
                int spanStart = editableLLJJIII != null ? editableLLJJIII.getSpanStart(hashtagSpanData) : 0;
                Editable editableLLJJIII2 = C2204961BRm.LLJJIII(c21410318qbLJIIL2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", strArr));
                int spanEnd = editableLLJJIII2 != null ? editableLLJJIII2.getSpanEnd(hashtagSpanData) : 0;
                int lineForOffset = layout.getLineForOffset(spanStart);
                int lineForOffset2 = layout.getLineForOffset(spanEnd);
                if (lineForOffset <= lineForOffset2) {
                    int i2 = lineForOffset;
                    while (true) {
                        int lineStart = layout.getLineStart(i2);
                        int lineEnd = layout.getLineEnd(i2) - 1;
                        if (i2 == lineForOffset) {
                            lineStart = spanStart;
                        }
                        if (i2 == lineForOffset2) {
                            lineEnd = spanEnd;
                        }
                        float primaryHorizontal = layout.getPrimaryHorizontal(lineStart) + c21410318qbLJIIL2.getPaddingStart();
                        float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd) + c21410318qbLJIIL2.getPaddingStart();
                        String str = hashtagSpanData.hashtagId;
                        int i3 = (int) primaryHorizontal;
                        int lineTop = layout.getLineTop(i2) + c21410318qbLJIIL2.getPaddingTop();
                        int i4 = (int) primaryHorizontal2;
                        int lineBottom = layout.getLineBottom(i2) + c21410318qbLJIIL2.getPaddingTop();
                        String str2 = hashtagSpanData.text;
                        arrayList.add(new TextHashtagModel(str2 != null ? u.LJJIFFI(str2, "#", "", false) : null, str, i3, lineTop, i4, lineBottom, spanStart, spanEnd, null));
                        if (i2 != lineForOffset2) {
                            i2++;
                        }
                    }
                }
            }
            i++;
            strArr = null;
        }
        this.LIZJ.LJ.LIZLLL(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 1129), true);
        if (!arrayList.isEmpty()) {
            this.LJIIJJI = true;
        }
    }

    @Override // X.C0FKM
    public final boolean LJIIIZ() {
        if (this.LJIIJJI) {
            this.LJIIJJI = false;
            return true;
        }
        if (this.LJIIL || this.LIZIZ.getVisibility() == 0) {
            return true;
        }
        C21410318qb c21410318qbLJIIL = LJIIL();
        return C0FMV.LIZIZ(c21410318qbLJIIL != null ? C2204961BRm.LLJJIII(c21410318qbLJIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", null)) : null).length != 0;
    }

    @Override // X.C0FKM
    public final void LJIIJJI() throws Throwable {
        ((ArrayList) this.LJIILIIL).clear();
        C21410318qb c21410318qbLJIIL = LJIIL();
        if (c21410318qbLJIIL != null) {
            Editable editableLLJJIII = C2204961BRm.LLJJIII(c21410318qbLJIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", null));
            if (editableLLJJIII == null || editableLLJJIII.length() == 0) {
                return;
            }
            for (HashtagSpanData hashtagSpanData : C0FMV.LIZIZ(editableLLJJIII)) {
                int spanStart = editableLLJJIII.getSpanStart(hashtagSpanData);
                int spanEnd = editableLLJJIII.getSpanEnd(hashtagSpanData);
                C0FLJ c0flj = new C0FLJ(spanStart, spanEnd);
                if (Intrinsics.LJFF(editableLLJJIII.subSequence(spanStart, spanEnd).toString(), hashtagSpanData.text)) {
                    ((ArrayList) this.LJIILIIL).add(c0flj);
                } else {
                    editableLLJJIII.removeSpan(hashtagSpanData);
                }
            }
            List list = (List) this.LJIIIZ.getValue();
            if (list != null) {
                list.addAll(this.LJIILIIL);
            }
        }
    }

    public final C21410318qb LJIIL() {
        C0FL4 c0fl4 = this.LJIIIIZZ;
        return c0fl4 == null ? (C21410318qb) this.LJI.getValue() : c0fl4;
    }

    public final boolean LJIILIIL() {
        C0FKW c0fkw;
        return C0F8Y.LJIIIIZZ(this.LIZJ.LJ.LIZ) || (this.LIZJ.LJIIIZ.LJJ.LJ && (c0fkw = (C0FKW) this.LJII.getValue()) != null && c0fkw.LJIIIIZZ());
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() throws Throwable {
        List<TextHashtagModel> hashtagList;
        C21410318qb c21410318qbLJIIL = LJIIL();
        if (c21410318qbLJIIL != null) {
            Editable editableLLJJIII = C2204961BRm.LLJJIII(c21410318qbLJIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zUBUsa/ZEbq+E9FP10LUNj4k4=", null));
            if (editableLLJJIII != null) {
                c21410318qbLJIIL.setSelection(editableLLJJIII.length());
                LJIIJ(c21410318qbLJIIL.getSelectionStart(), editableLLJJIII);
            }
            TextStickerModel textStickerModel = this.LIZJ.LJ.LIZ;
            if (C0F8Y.LJFF(textStickerModel) || !((hashtagList = textStickerModel.getHashtagList()) == null || hashtagList.isEmpty())) {
                this.LIZJ.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(529), true);
            }
        }
    }

    @Override // X.C0FKM
    public final void LJIIIIZZ(C0FL4 c0fl4) {
        this.LJIIIIZZ = c0fl4;
    }

    public C0FLR(ViewGroup viewGroup, C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1580));
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1577));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1578));
        this.LJFF = c01gwLIZIZ;
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1581));
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1576));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1579));
        this.LJIILIIL = new ArrayList();
        this.LJIIJ = (FrameLayout) viewGroup.findViewById(R.id.jh6);
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.jm2);
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C1919207fS.LJIIJJI());
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 149));
        }
        C0FLT c0flt = (C0FLT) c01gwLIZIZ.getValue();
        if (c0flt != null) {
            FrameLayout frameLayout = this.LJIIJ;
            viewGroup.getContext();
            c0flt.LIZJ(frameLayout, new C0FLV(this), new C0FLU(this));
        }
        C0FLT c0flt2 = (C0FLT) c01gwLIZIZ.getValue();
        if (c0flt2 != null) {
            c0flt2.LJ();
            c0flt2.LIZLLL();
        }
        C337180DJs.LIZ(viewGroup);
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FJq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LJ;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1122));
    }

    public static void LJIILJJIL(C0FLR c0flr, boolean z) {
        C0FGR c0fgrLIZJ;
        AFwS191S0000000_5 aFwS191S0000000_5 = AFwS191S0000000_5.get$arr$(401);
        if (z && !c0flr.LJIILIIL()) {
            if (c0flr.LIZIZ.getVisibility() != 0) {
                C0FF8 c0ff8 = (C0FF8) c0flr.LIZLLL.getValue();
                if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                    c0fgrLIZJ.LJIILL();
                }
                c0flr.LJIILJJIL = C387990FJd.LIZ(c0flr.LIZJ.LJIIJ.LIZ, null, null, null, null, null, null, 63);
                c0flr.LIZJ.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(532), true);
            } else {
                return;
            }
        } else {
            if (c0flr.LJIILJJIL == null) {
                c0flr.LIZJ.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(533), true);
            }
            C387990FJd c387990FJd = c0flr.LJIILJJIL;
            if (c387990FJd != null) {
                c0flr.LIZJ.LJIIJ.LIZLLL(new AwS584S0100000_5(c387990FJd, 1128), true);
                c0flr.LJIILJJIL = null;
            }
        }
        aFwS191S0000000_5.getClass();
    }

    @Override // X.C0FKM
    public final void LJIIJ(int i, Editable editable) {
        if (LJIILIIL()) {
            return;
        }
        String strLIZ = C0FMV.LIZ(i, editable);
        if (strLIZ != null && strLIZ.length() != 0) {
            C0FLT c0flt = (C0FLT) this.LJFF.getValue();
            if (c0flt != null) {
                c0flt.LIZ(strLIZ);
            }
            LJIILJJIL(this, true);
            return;
        }
        LJIILJJIL(this, false);
    }
}
