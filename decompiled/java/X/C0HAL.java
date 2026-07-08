package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0HAL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAL extends AnonymousClass1825<C18L9> {
    public C0HAL(C18L9 c18l9) {
        super("selling_point_items", c18l9);
    }

    public final void LJIILIIL(C0HAM c0ham) {
        String str;
        int iLIZ;
        boolean z = false;
        if (!PinCardRefactorSettings.LIZ().sellingPointEnable) {
            LJIIJ(false);
            return;
        }
        this.LJII = true;
        ((LinkedHashMap) this.LJI).clear();
        this.LJ.clear();
        C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
        int i = c0ham.LIZIZ;
        if (i > 0) {
            ((C18L9) this.LIZ).setMaxTagCount(i);
        }
        for (SellingItem sellingItem : c0ham.LIZ) {
            if (!AnonymousClass1825.LJIIIIZZ.contains(Integer.valueOf(sellingItem.sellingItemType)) && (str = sellingItem.showText) != null) {
                this.LJ.add(sellingItem);
                int i2 = sellingItem.sellingItemType;
                if (i2 != 3) {
                    if (i2 != 7) {
                        LJIIJJI(C0HAJ.LIZ(this.LIZLLL, str, this.LJFF, sellingItem.icon));
                    } else {
                        Context context = this.LIZLLL;
                        C0HAK c0hak = this.LJFF;
                        int iGenerateViewId = View.generateViewId();
                        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                        tuxIconView.setIconRes(R.raw.icon_star_fill);
                        Integer numLIZJ = C1308910kAL.LIZJ(c0hak.LJI(), context);
                        if (numLIZJ != null) {
                            tuxIconView.setTintColor(numLIZJ.intValue());
                        }
                        tuxIconView.setId(iGenerateViewId);
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.setText(str);
                        tuxTextView.setTuxFont(c0hak.LIZIZ());
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setGravity(16);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setIncludeFontPadding(false);
                        Integer numLIZJ2 = C1308910kAL.LIZJ(c0hak.LIZJ(), context);
                        if (numLIZJ2 != null) {
                            iLIZ = numLIZJ2.intValue();
                        } else {
                            iLIZ = C446980Hfs.LIZ(context, R.color.di);
                        }
                        tuxTextView.setTextColor(iLIZ);
                        ConstraintLayout constraintLayout = new ConstraintLayout(context);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(c0hak.LIZLLL());
                        c384050F3z.LIZIZ = Integer.valueOf(c0hak.LJIIIZ());
                        constraintLayout.setBackground(c384050F3z.LIZ(context));
                        constraintLayout.setPadding(c0hak.LJ(), 0, c0hak.LJ(), 0);
                        C19ME c19me = new C19ME(c0hak.H2(), c0hak.H2());
                        c19me.startToStart = 0;
                        c19me.topToTop = 0;
                        c19me.setMargins(0, c0hak.LJFF(), 0, 0);
                        constraintLayout.addView(tuxIconView, c19me);
                        C19ME c19me2 = new C19ME(-2, c0hak.getItemHeight());
                        c19me2.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.ug));
                        c19me2.startToEnd = iGenerateViewId;
                        c19me2.constrainedWidth = true;
                        c19me2.endToEnd = 0;
                        c19me2.topToTop = 0;
                        c19me2.bottomToBottom = 0;
                        constraintLayout.addView(tuxTextView, c19me2);
                        LJIIJJI(constraintLayout);
                    }
                } else {
                    String strLIZIZ = sellingItem.optShowText;
                    if (strLIZIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(' ');
                        sbLIZ.append(this.LIZLLL.getResources().getString(2131832822));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    LJIIJJI(C0HAJ.LIZ(this.LIZLLL, strLIZIZ, this.LJFF, sellingItem.icon));
                }
            }
        }
        if (((ViewGroup) this.LIZ).getChildCount() > 0) {
            z = true;
        }
        LJIIJ(z);
    }

    public final void LJIILJJIL(C0HAK c0hak) {
        this.LJFF = c0hak;
        if (c0hak.LJIIJ()) {
            C18L9 c18l9 = (C18L9) this.LIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
            c18l9.LLIZ = iLIZIZ;
            c18l9.LLILZLL = iLIZIZ2;
            C18L9 c18l92 = (C18L9) this.LIZ;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.eh);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(1));
            c18l92.LIZ(c384050F3z.LIZ(this.LIZLLL), 1);
            return;
        }
        if (c0hak.LJIIIIZZ()) {
            C18L9 c18l93 = (C18L9) this.LIZ;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c18l93.LLIZ = iLIZIZ3;
            c18l93.LLILZLL = iLIZIZ4;
            C18L9 c18l94 = (C18L9) this.LIZ;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.e6);
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c18l94.LIZ(c384050F3z2.LIZ(this.LIZLLL), 0);
            return;
        }
        C18L9 c18l95 = (C18L9) this.LIZ;
        c18l95.LLIZ = 0;
        c18l95.LLILZLL = 0;
        c18l95.LIZ(null, 0);
        ((C18L9) this.LIZ).setChildHorizontalMargin(c0hak.LJII());
    }
}
