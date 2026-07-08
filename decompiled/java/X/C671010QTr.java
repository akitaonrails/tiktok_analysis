package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0QTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671010QTr extends RecyclerView.ViewHolder implements C0QUA {
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public final C0QU6 LL;
    public EcSearchSugMobHelper LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public SearchSugEntity LLILZIL;
    public String LLILZLL;
    public Integer LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public C1608500rxY LLJI;
    public final C01GW LLJIJIL;
    public final FrameLayout LLJILJIL;
    public final LinearLayout LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final C1610670s13 LLJJ;
    public final TuxIconView LLJJI;
    public final TuxIconView LLJJIII;
    public final TuxTextView LLJJIJI;
    public final C429940GtU LLJJIJIIJIL;
    public final LinearLayout LLJJIJIL;
    public final View LLJJJ;
    public final TuxTextView LLJJJIL;
    public final C1610770s1D LLJJJJ;
    public final SmartImageView LLJJJJJIL;
    public final C425430GmD LLJJJJLIIL;

    @Override // X.C0QUA
    public final void onViewAttachedToWindow() {
        ISearchSugContextAbility iSearchSugContextAbilityLIZJ;
        C670830QSz c670830QSzPD2;
        ISearchSugContextAbility iSearchSugContextAbilityLIZJ2;
        C670830QSz c670830QSzPD22;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(C946803n0.LIZ(this.itemView), C1388190mED.LIZIZ(this.itemView.getContext()));
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        String str = this.LLJ;
        int i = this.LLILZ;
        SearchSugEntity searchSugEntity = this.LLILZIL;
        String str2 = this.LLILZLL;
        String str3 = this.LLIZLLLIL;
        C0QU6 c0qu6 = this.LL;
        int i2 = (c0qu6 == null || (iSearchSugContextAbilityLIZJ2 = c0qu6.LIZJ()) == null || (c670830QSzPD22 = iSearchSugContextAbilityLIZJ2.pD2()) == null) ? 0 : c670830QSzPD22.LIZ;
        C0QU6 c0qu62 = this.LL;
        C670100QQe.LJ(fragmentLIZ, str, i, searchSugEntity, str2, str3, i2, c0qerLIZJ, (c0qu62 == null || (iSearchSugContextAbilityLIZJ = c0qu62.LIZJ()) == null || (c670830QSzPD2 = iSearchSugContextAbilityLIZJ.pD2()) == null) ? null : c670830QSzPD2.LIZIZ);
    }

    @Override // X.C0QUA
    public final void onViewDetachedFromWindow() {
        C1608500rxY c1608500rxY = this.LLJI;
        if (c1608500rxY != null) {
            c1608500rxY.LJIIIIZZ();
        }
    }

    public final void L5(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLJJI;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            C425430GmD c425430GmD = this.LLJJJJLIIL;
            if (c425430GmD != null) {
                int visibility = c425430GmD.getVisibility();
                c425430GmD.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c425430GmD);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJJI;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        C425430GmD c425430GmD2 = this.LLJJJJLIIL;
        if (c425430GmD2 == null) {
            return;
        }
        int visibility2 = c425430GmD2.getVisibility();
        c425430GmD2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c425430GmD2);
    }

    public final void N5(int i) {
        int i2 = LLJJL;
        Integer num = this.LLIZ;
        if (num != null && num.intValue() == i2) {
            return;
        }
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.LLIZ = Integer.valueOf(i2);
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    public C671010QTr(View view, String str, C0QT7 c0qt7) {
        String str2;
        super(view);
        this.LL = c0qt7;
        this.LLILLL = 1;
        this.LLILZLL = "normal_sug";
        this.LLIZLLLIL = str;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS548S0100000_4(view, 473));
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.i_7);
        this.LLJILJILJ = (LinearLayout) view.findViewById(R.id.eux);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.i33);
        this.LLJJ = (C1610670s13) view.findViewById(R.id.l9h);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.lec);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.ljx);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.zf0);
        C429940GtU c429940GtU = (C429940GtU) view.findViewById(R.id.zz3);
        this.LLJJIJIIJIL = c429940GtU;
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.tz1);
        this.LLJJJ = view.findViewById(R.id.view_search_icon_bg);
        this.LLJJJIL = c429940GtU != null ? (TuxTextView) c429940GtU.findViewById(R.id.tv_username) : null;
        this.LLJJJJ = (C1610770s1D) view.findViewById(R.id.l2p);
        this.LLJJJJJIL = (SmartImageView) view.findViewById(R.id.kex);
        this.LLJJJJLIIL = (C425430GmD) view.findViewById(R.id.lwd);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            this.LLILLJJLI = (EcSearchSugMobHelper) C679340Qkm.LIZ(this.itemView, c19egLIZIZ).get(EcSearchSugMobHelper.class);
        }
        N5(0);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragment = (Fragment) c01gwLIZIZ.getValue();
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(view.getContext());
        c646000PVm.getClass();
        C0PRW c0prwLJIIJJI = C646000PVm.LJIIJJI(fragment, c19egLIZIZ2);
        if (c0prwLJIIJJI != null && (str2 = c0prwLJIIJJI.searchPosition) != null && str2.length() > 0) {
            str = str2;
        }
        this.LLJ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0453 A[PHI: r8
      0x0453: PHI (r8v2 X.0QWe) = (r8v5 X.0QWe), (r8v6 X.0QWe) binds: [B:47:0x0150, B:45:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0283  */
    /* JADX WARN: Type inference failed for: r0v109, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(final com.ss.android.ugc.aweme.search.model.SearchSugEntity r25, final java.lang.String r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671010QTr.I5(com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, int):void");
    }
}
