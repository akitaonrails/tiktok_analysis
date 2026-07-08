package X;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623615n0 implements InterfaceC20623815n2 {
    public final C19GS LIZ;
    public final LinearLayout LIZIZ;
    public final ChooseItemViewModel LJFF;
    public final ArrayList<C20623715n1> LIZJ = new ArrayList<>();
    public final int LIZLLL = 100;
    public int LJ = 100;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1513));

    public final List<DislikeHashTag> LIZLLL() {
        return (List) this.LJI.getValue();
    }

    @Override // X.InterfaceC20623815n2
    public final void LIZ(C20623715n1 c20623715n1) {
        ChooseItemViewModel chooseItemViewModel = this.LJFF;
        int i = chooseItemViewModel.LLILLJJLI;
        int i2 = 0;
        if (c20623715n1.LIZLLL == 1) {
            int i3 = i + 1;
            chooseItemViewModel.LLILLJJLI = i3;
            if (chooseItemViewModel.LLILZ) {
                i2 = i3;
            }
            chooseItemViewModel.vQ2(chooseItemViewModel.LL + i2);
            LIZJ(i3, i);
            return;
        }
        int i4 = i - 1;
        chooseItemViewModel.LLILLJJLI = i4;
        if (chooseItemViewModel.LLILZ) {
            i2 = i4;
        }
        chooseItemViewModel.vQ2(chooseItemViewModel.LL + i2);
        LIZJ(i4, i);
    }

    public final void LIZIZ(List<DislikeHashTag> list) {
        LinearLayout linearLayout = this.LIZIZ;
        C19GS c19gs = this.LIZ;
        AttributeSet attributeSet = null;
        C426160GnO c426160GnO = new C426160GnO(c19gs, null, 6);
        C786410Ut5.a7(c426160GnO, new LinearLayout.LayoutParams(-1, -2));
        c426160GnO.setGravity(-1);
        for (DislikeHashTag dislikeHashTag : (ArrayList) list) {
            TuxTextView tuxTextView = new TuxTextView(c19gs, attributeSet, 6, 0);
            int iLIZ = (int) C11VU.LIZ(12.0f);
            int iLIZ2 = (int) C11VU.LIZ(9.5f);
            int iLIZ3 = (int) C11VU.LIZ(80.0f);
            tuxTextView.setText(dislikeHashTag.name);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setSingleLine(true);
            tuxTextView.setMinWidth(iLIZ3);
            tuxTextView.setGravity(17);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(iLIZ), Integer.valueOf(iLIZ2), Integer.valueOf(iLIZ), Integer.valueOf(iLIZ2), 16);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int iLIZ4 = (int) C11VU.LIZ(8.0f);
            marginLayoutParams.setMarginStart(iLIZ4);
            marginLayoutParams.bottomMargin = iLIZ4;
            C786410Ut5.R6(tuxTextView, marginLayoutParams);
            c426160GnO.addView(tuxTextView);
            ArrayList<C20623715n1> arrayList = this.LIZJ;
            C20623715n1 c20623715n1 = new C20623715n1(tuxTextView, dislikeHashTag, this);
            if (this.LJ <= 0 && c20623715n1.LIZLLL == 0) {
                c20623715n1.LIZ(-1);
            }
            arrayList.add(c20623715n1);
            attributeSet = null;
        }
        linearLayout.addView(c426160GnO);
    }

    public C20623615n0(C19GS c19gs, LinearLayout linearLayout) {
        this.LIZ = c19gs;
        this.LIZIZ = linearLayout;
        this.LJFF = (ChooseItemViewModel) ViewModelProviders.of(c19gs).get(ChooseItemViewModel.class);
    }

    public final void LIZJ(int i, int i2) {
        int i3 = this.LJ;
        if (i >= i3) {
            for (C20623715n1 c20623715n1 : this.LIZJ) {
                if (c20623715n1.LIZLLL == 0) {
                    c20623715n1.LIZ(-1);
                }
            }
            return;
        }
        if (i2 >= i3 && i < i3) {
            for (C20623715n1 c20623715n12 : this.LIZJ) {
                if (c20623715n12.LIZLLL == -1) {
                    c20623715n12.LIZ(0);
                }
            }
        }
    }
}
