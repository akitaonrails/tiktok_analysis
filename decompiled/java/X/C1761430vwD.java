package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761430vwD implements InterfaceC1761370vw7 {
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final GalleryViewerFragment LL;
    public final GalleryViewerViewModel LLILLJJLI;
    public final int LLILLL;
    public View LLILZ;
    public EnumC1407150min LLILZIL;
    public C427660Gpo LLILZLL;
    public TuxTextView LLIZ;
    public C1761470vwH LLIZLLLIL;
    public TuxIconView LLJ;
    public C0DJG LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public View LLJJ;

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LLILZ;
        ViewParent parent = view != null ? view.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
    }

    public final void LIZIZ(boolean z) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        View view = this.LLILZ;
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            if (z) {
                i = 0;
            } else {
                i = iLIZIZ;
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, i);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (!z) {
                    iLIZIZ = 0;
                }
                marginLayoutParams.bottomMargin = iLIZIZ;
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    @Override // X.InterfaceC1761370vw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r25) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1761430vwD.onPageSelected(int):void");
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    public final void LIZ(Boolean bool, Integer num) {
        int i;
        String string;
        Resources resources;
        int iIntValue;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i = R.raw.icon_thumbs_up_fill;
        } else {
            i = R.raw.icon_thumbs_up;
        }
        if (num != null && (iIntValue = num.intValue()) != 0) {
            string = String.valueOf(iIntValue);
        } else {
            View view = this.LLILZ;
            if (view != null && (resources = view.getResources()) != null) {
                string = resources.getString(2131857253);
            } else {
                string = null;
            }
        }
        C197039127h c197039127h = this.LLJILJIL;
        if (c197039127h != null) {
            c197039127h.setText(string);
            c197039127h.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
            int i2 = LLJJI;
            int i3 = LLJJIII;
            c197039127h.setPadding(i2, i3, i2, i3);
            c197039127h.setTextColorRes(R.attr.a1h);
            c197039127h.setTuxFont(102);
            c197039127h.setIconTintColorRes(R.attr.zi);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            c197039127h.setButtonStartIconDrawable(c419910GdJ.LIZ(c197039127h.getContext()));
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        C427660Gpo c427660Gpo;
        TuxTextView tuxTextView;
        C1761470vwH c1761470vwH;
        C0DJG c0djg;
        TuxTextView tuxTextView2;
        C197039127h c197039127h;
        TuxIconView tuxIconView;
        View viewLIZ = C992303uL.LIZ(frameLayout.getContext(), R.layout.av4, null);
        this.LLILZ = viewLIZ;
        if (viewLIZ != null) {
            c427660Gpo = (C427660Gpo) viewLIZ.findViewById(R.id.bkz);
        } else {
            c427660Gpo = null;
        }
        this.LLILZLL = c427660Gpo;
        View view = this.LLILZ;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.tv_username);
        } else {
            tuxTextView = null;
        }
        this.LLIZ = tuxTextView;
        View view2 = this.LLILZ;
        if (view2 != null) {
            c1761470vwH = (C1761470vwH) view2.findViewById(R.id.zfe);
        } else {
            c1761470vwH = null;
        }
        this.LLIZLLLIL = c1761470vwH;
        View view3 = this.LLILZ;
        if (view3 != null) {
            c0djg = (C0DJG) view3.findViewById(R.id.tv_rating_star_v1);
        } else {
            c0djg = null;
        }
        this.LLJI = c0djg;
        View view4 = this.LLILZ;
        if (view4 != null) {
            tuxTextView2 = (TuxTextView) view4.findViewById(R.id.tv_review_cell_size_v2);
        } else {
            tuxTextView2 = null;
        }
        this.LLJIJIL = tuxTextView2;
        View view5 = this.LLILZ;
        if (view5 != null) {
            c197039127h = (C197039127h) view5.findViewById(R.id.mn4);
        } else {
            c197039127h = null;
        }
        this.LLJILJIL = c197039127h;
        View view6 = this.LLILZ;
        if (view6 != null) {
            tuxIconView = (TuxIconView) view6.findViewById(R.id.tv_source_info_icon);
        } else {
            tuxIconView = null;
        }
        this.LLJ = tuxIconView;
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(null);
            c197039127h2.setButtonVariant(1);
            c197039127h2.setButtonSize(2);
            c197039127h2.LJJLI(true);
            c197039127h2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            c197039127h2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            c197039127h2.setForeground(null);
        }
        frameLayout.addView(this.LLILZ, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    public C1761430vwD(GalleryViewerFragment galleryViewerFragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        this.LL = galleryViewerFragment;
        this.LLILLJJLI = galleryViewerViewModel;
        this.LLILLL = i;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    }
}
