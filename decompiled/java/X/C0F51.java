package X;

import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0F51, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F51 {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;

    public final void LIZ() {
        List<TextStickerModel> listOo1;
        EnumC363350EMj enumC363350EMj;
        FrameLayout frameLayout;
        TextStickerCompatModel compatModel;
        Boolean showPunctuation;
        C0EJ3 c0ej3 = this.LIZ.LJ;
        if (c0ej3 == null || (listOo1 = c0ej3.Oo1()) == null) {
            listOo1 = C13BV.INSTANCE;
        }
        TextStickerModel textStickerModel = (TextStickerModel) C13LP.LJJJLL(listOo1);
        boolean z = true;
        this.LIZ.LJI.LJIJI = (textStickerModel == null || (compatModel = textStickerModel.getCompatModel()) == null || (showPunctuation = compatModel.getShowPunctuation()) == null) ? true : showPunctuation.booleanValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listOo1, 10));
        Iterator<TextStickerModel> it2 = listOo1.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getCompatModel().getCapitalizationState());
        }
        C0F5P c0f5p = this.LIZ.LJI;
        if (C13LP.LJJJJI(arrayList).size() > 1 || (enumC363350EMj = (EnumC363350EMj) C13LP.LJJJLL(arrayList)) == null) {
            enumC363350EMj = EnumC363350EMj.DEFAULT;
        }
        c0f5p.LJIJ = enumC363350EMj;
        LIZIZ(false);
        LIZJ();
        C0F5P c0f5p2 = this.LIZ.LJI;
        if (listOo1.isEmpty()) {
            z = false;
        } else {
            for (TextStickerModel textStickerModel2 : listOo1) {
                if (C1207804o0.LIZ().contains(textStickerModel2.getTextMotionModel().motionResId) && textStickerModel2.getTextMotionModel().motionEnabled == 1) {
                    break;
                }
            }
            z = false;
        }
        c0f5p2.LJIJJ = z;
        if (!this.LIZ.LJI.LJIJJ || (frameLayout = this.LIZIZ.LJIJI) == null) {
            return;
        }
        C786410Ut5.U4(frameLayout, 0.34f);
    }

    public final void LIZJ() {
        if (this.LIZ.LJI.LJIJI) {
            TuxIconView tuxIconView = this.LIZIZ.LJIILLIIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_quotation);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LIZIZ.LJIILLIIL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_quotation_slash_ltr);
        }
    }

    public final void LIZIZ(boolean z) {
        C443120HZe c443120HZe;
        C0EJ3 c0ej3;
        List<TextStickerModel> listOo1;
        int i = C384300F4y.LIZ[this.LIZ.LJI.LJIJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c443120HZe = new C443120HZe("TT", Integer.valueOf(R.drawable.bo1), EnumC363350EMj.DEFAULT);
                } else {
                    c443120HZe = new C443120HZe("Tt", Integer.valueOf(R.drawable.bo2), EnumC363350EMj.CAPITALIZE);
                }
            } else {
                c443120HZe = new C443120HZe("tt", Integer.valueOf(R.drawable.bo2), EnumC363350EMj.ALL_LOWER);
            }
        } else {
            c443120HZe = new C443120HZe("TT", Integer.valueOf(R.drawable.bo2), EnumC363350EMj.ALL_UPPER);
        }
        String str = (String) c443120HZe.getFirst();
        int iIntValue = ((Number) c443120HZe.getSecond()).intValue();
        EnumC363350EMj enumC363350EMj = (EnumC363350EMj) c443120HZe.getThird();
        TuxTextView tuxTextView = this.LIZIZ.LJIJ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        FrameLayout frameLayout = this.LIZIZ.LJIJI;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(iIntValue);
        }
        if (z && (c0ej3 = this.LIZ.LJ) != null && (listOo1 = c0ej3.Oo1()) != null) {
            for (TextStickerModel textStickerModel : listOo1) {
                C0EJ3 c0ej32 = this.LIZ.LJ;
                if (c0ej32 != null) {
                    c0ej32.RF(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, TextStickerCompatModel.copy$default(textStickerModel.getCompatModel(), false, false, null, null, null, null, enumC363350EMj, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097087, null), -1, 32767, null), false);
                }
            }
        }
    }

    public C0F51(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }
}
