package X;

import android.content.Context;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194750hCD implements InterfaceC469360Ias {
    public final C1194760hCE LL;
    public final InterfaceC1194150hBF LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public C1194790hCH LLILZIL;
    public final C1197240hGE LLILZLL;
    public List<PoiActivityApi.PoiBannerInfo> LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public String LLJIJIL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void LIZ(List<PoiActivityApi.PoiBannerInfo> list) {
        int i;
        Context context = this.LL.getViewPager().getContext();
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1194790hCH(this.LLILLJJLI, C786410Ut5.ne(context), this.LLILLL, this.LLJI, this.LLJIJIL, this.LLILZ);
            this.LL.getViewPager().setAdapter(new C21595819fQ(this.LLILZIL, 5000));
        }
        boolean zLIZJ = C444960Hcc.LIZJ(context);
        this.LLILZLL.LLILZ = C1175120ggY.LIZJ(Integer.valueOf(((ArrayList) list).size()));
        C1194790hCH c1194790hCH = this.LLILZIL;
        if (c1194790hCH != null && c1194790hCH.LLJ != list) {
            c1194790hCH.LLJ = list;
            c1194790hCH.notifyDataSetChanged();
        }
        C1194790hCH c1194790hCH2 = this.LLILZIL;
        if (c1194790hCH2 != null) {
            c1194790hCH2.notifyDataSetChanged();
        }
        this.LL.getIndicator().setUpViewPager(this.LL.getViewPager());
        C1194770hCF indicator = this.LL.getIndicator();
        if (C1175120ggY.LIZJ(Integer.valueOf(((ArrayList) list).size())) < 2) {
            i = 8;
        } else {
            i = 0;
        }
        int visibility = indicator.getVisibility();
        indicator.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, indicator);
        if (zLIZJ) {
            list = C13LP.LJLJJLL(list);
        }
        this.LLIZ = list;
        this.LL.getViewPager().setCurrentItem(0);
        LIZIZ(true);
    }

    public final void LIZIZ(boolean z) {
        if (z) {
            this.LLILZLL.LIZ();
            return;
        }
        C1197240hGE c1197240hGE = this.LLILZLL;
        if (c1197240hGE.LLIZ) {
            c1197240hGE.LLIZ = false;
            WeakHandler weakHandler = c1197240hGE.LLIZLLLIL;
            if (weakHandler != null) {
                weakHandler.removeCallbacksAndMessages(null);
            }
        }
        this.LL.getViewPager().setOnTouchListener(null);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            if (!Intrinsics.LJFF(this.LLILZLL.LLILZLL, Boolean.TRUE)) {
                this.LLIZLLLIL = true;
            } else {
                this.LLIZLLLIL = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1194750hCD.onPageSelected(int):void");
    }

    public C1194750hCD(C1194760hCE c1194760hCE, InterfaceC1194150hBF interfaceC1194150hBF, boolean z, boolean z2) {
        this.LL = c1194760hCE;
        this.LLILLJJLI = interfaceC1194150hBF;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLIZ = C13BV.INSTANCE;
        this.LLILZLL = new C1197240hGE(c1194760hCE.getViewPager());
        c1194760hCE.getViewPager().addOnPageChangeListener(this);
    }

    public /* synthetic */ C1194750hCD(C1194760hCE c1194760hCE, InterfaceC1194150hBF interfaceC1194150hBF, boolean z, int i) {
        this(c1194760hCE, interfaceC1194150hBF, (i & 4) != 0 ? false : z, false);
    }
}
