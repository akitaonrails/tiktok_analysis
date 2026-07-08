package Y;

import X.C03IT;
import X.C098200Yq;
import X.C0PCO;
import X.C0QWW;
import X.C0R42;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C138900fz;
import X.C189200o6;
import X.C1C7U;
import X.C418440Gaw;
import X.C435210H4t;
import X.C440190HNx;
import X.C645140PSe;
import X.C680790Qn7;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.model.IconTextInfo;
import com.ss.android.ugc.aweme.search.model.Image;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS12S0210000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((SearchFeedFragment) this.l0).NS() instanceof C645140PSe) {
            ((SearchFeedFragment) this.l0).NS();
            ((ArrayList) ((SearchFeedFragment) this.l0).FS().LLLI()).size();
            SearchFeedFragment searchFeedFragment = (SearchFeedFragment) this.l0;
            searchFeedFragment.LLLLLL.LLJ = ((ArrayList) searchFeedFragment.FS().LLLI()).size();
        }
        GlobalDoodleConfig globalDoodleConfig = ((SearchFeedFragment) this.l0).LLL;
        if (globalDoodleConfig == null || !Intrinsics.LJFF(globalDoodleConfig.getHideResults(), Boolean.TRUE)) {
            ((SearchFeedFragment) this.l0).LLLLLL.LLJJJIL((List) this.l1, this.z2);
        } else {
            ((SearchFeedFragment) this.l0).LLLLLL.LLJJJIL(new ArrayList(), this.z2);
        }
        RecyclerView recyclerViewBS = ((SearchFeedFragment) this.l0).BS();
        SearchFeedFragment searchFeedFragment2 = (SearchFeedFragment) this.l0;
        if (!recyclerViewBS.isLaidOut() || recyclerViewBS.isLayoutRequested()) {
            recyclerViewBS.addOnLayoutChangeListener(new C0R42(searchFeedFragment2, 3));
        } else {
            C0PCO c0pco = searchFeedFragment2.LLLLLLZZ;
            if (c0pco != null) {
                c0pco.LJFF();
            }
        }
        ((SearchFeedFragment) this.l0).ET(false);
        ((SearchFeedFragment) this.l0).QS().LIZ();
        ((SearchFeedFragment) this.l0).nT();
        ((SearchFeedFragment) this.l0).LJJJJLI();
    }

    public final void LIZ$1() {
        Image image;
        List<String> list;
        Image image2;
        List<String> list2;
        String strLJ;
        String strLJ2;
        Integer numLIZIZ;
        Integer numLIZIZ2;
        float f = C0QWW.LIZ;
        IconTextInfo iconTextInfo = (IconTextInfo) this.l0;
        ViewGroup viewGroup = (ViewGroup) this.l1;
        boolean z = this.z2;
        try {
            if (viewGroup.getChildCount() != 0) {
                TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.gg5);
                String strLJ3 = null;
                if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                    String str = z ? iconTextInfo.textDarkColor : iconTextInfo.textColor;
                    if (!C123100dR.LIZ(str) || str == null) {
                        strLJ = null;
                    } else {
                        C680790Qn7.LIZ.getClass();
                        strLJ = C680790Qn7.LJ(str);
                    }
                    String str2 = z ? iconTextInfo.bgDarkColor : iconTextInfo.bgColor;
                    if (!C123100dR.LIZ(str2) || str2 == null) {
                        strLJ2 = null;
                    } else {
                        C680790Qn7.LIZ.getClass();
                        strLJ2 = C680790Qn7.LJ(str2);
                    }
                    String str3 = z ? iconTextInfo.borderDarkColor : iconTextInfo.borderColor;
                    if (C123100dR.LIZ(str3) && str3 != null) {
                        C680790Qn7.LIZ.getClass();
                        strLJ3 = C680790Qn7.LJ(str3);
                    }
                    if (strLJ != null) {
                        C435210H4t.LIZLLL(tuxTextView, strLJ);
                    }
                    if (strLJ2 != null && (numLIZIZ = C435210H4t.LIZIZ(strLJ2)) != null) {
                        C440190HNx c440190HNx = new C440190HNx(numLIZIZ.intValue());
                        c440190HNx.setRadius(C418440Gaw.LIZIZ(4));
                        if (strLJ3 != null && (numLIZIZ2 = C435210H4t.LIZIZ(strLJ3)) != null) {
                            c440190HNx.LJIIJ(C418440Gaw.LIZIZ(Float.valueOf(0.5f)), numLIZIZ2.intValue());
                        }
                        tuxTextView.setBackground(c440190HNx);
                    }
                }
                SmartImageView smartImageView = (SmartImageView) viewGroup.findViewById(R.id.gg4);
                if (smartImageView != null && smartImageView.getVisibility() == 0) {
                    if (z) {
                        ThemeImage themeImage = iconTextInfo.iconInfo;
                        if (themeImage != null) {
                            image2 = themeImage.dark;
                            if (image2 != null && (list2 = image2.urlList) != null) {
                                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list2));
                                c1331670kl3LJIIJ.LJJ(smartImageView);
                                c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
                                c1331670kl3LJIIJ.LIZLLL = ((Boolean) C138900fz.LIZ.getValue()).booleanValue();
                                C786410Ut5.h3(c1331670kl3LJIIJ);
                            }
                        }
                    } else {
                        ThemeImage themeImage2 = iconTextInfo.iconInfo;
                        if (themeImage2 != null) {
                            image2 = themeImage2.light;
                            if (image2 != null) {
                                C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(list2));
                                c1331670kl3LJIIJ2.LJJ(smartImageView);
                                c1331670kl3LJIIJ2.LJIL = Bitmap.Config.ARGB_8888;
                                c1331670kl3LJIIJ2.LIZLLL = ((Boolean) C138900fz.LIZ.getValue()).booleanValue();
                                C786410Ut5.h3(c1331670kl3LJIIJ2);
                            }
                        }
                    }
                }
                SmartImageView smartImageView2 = (SmartImageView) viewGroup.findViewById(R.id.gg3);
                if (smartImageView2 != null && smartImageView2.getVisibility() == 0) {
                    if (z) {
                        ThemeImage themeImage3 = iconTextInfo.iconInfo;
                        if (themeImage3 != null) {
                            image = themeImage3.dark;
                            if (image != null && (list = image.urlList) != null) {
                                C1331670kl3 c1331670kl3LJIIJ3 = C1331660kl2.LJIIJ(new C03IT(list));
                                c1331670kl3LJIIJ3.LJJ(smartImageView2);
                                c1331670kl3LJIIJ3.LJIL = Bitmap.Config.ARGB_8888;
                                c1331670kl3LJIIJ3.LIZLLL = ((Boolean) C138900fz.LIZ.getValue()).booleanValue();
                                C786410Ut5.h3(c1331670kl3LJIIJ3);
                            }
                        }
                    } else {
                        ThemeImage themeImage4 = iconTextInfo.iconInfo;
                        if (themeImage4 != null) {
                            image = themeImage4.light;
                            if (image != null) {
                                C1331670kl3 c1331670kl3LJIIJ32 = C1331660kl2.LJIIJ(new C03IT(list));
                                c1331670kl3LJIIJ32.LJJ(smartImageView2);
                                c1331670kl3LJIIJ32.LJIL = Bitmap.Config.ARGB_8888;
                                c1331670kl3LJIIJ32.LIZLLL = ((Boolean) C138900fz.LIZ.getValue()).booleanValue();
                                C786410Ut5.h3(c1331670kl3LJIIJ32);
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS12S0210000_10 aRunnableS12S0210000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchFeedFragment@9f20.onRefreshResult$1");
        try {
            aRunnableS12S0210000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchFeedFragment@9f20.onRefreshResult$1");
    }

    public static final void run$1(ARunnableS12S0210000_10 aRunnableS12S0210000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchBarIconViewHelper@d734.updateIconViewThemeWithNewStruct$1");
        try {
            aRunnableS12S0210000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchBarIconViewHelper@d734.updateIconViewThemeWithNewStruct$1");
    }

    public ARunnableS12S0210000_10(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
