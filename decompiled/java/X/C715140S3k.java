package X;

import Y.ARunnableS111S0100000_11;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor$timingHandler$1;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedVisibilityOptConfig;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0S3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715140S3k implements InterfaceC1616070s9l {
    public final ARunnableS111S0100000_11 LL;
    public boolean LLILLL;
    public long LLILZLL;
    public final /* synthetic */ IViewPagerComponentAbility LLIZLLLIL;
    public final ARunnableS111S0100000_11 LLILLJJLI = new ARunnableS111S0100000_11(this, 92);
    public EnumC715150S3l LLILZ = EnumC715150S3l.IDLE;
    public int LLILZIL = -1;
    public final ARunnableS111S0100000_11 LLIZ = new ARunnableS111S0100000_11(this, 91);

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.InterfaceC1616160s9u
    public final void onBeforePageChange() {
        if (this.LLILZ == EnumC715150S3l.SELECTED) {
            return;
        }
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LLIZLLLIL;
        feedInfraTimingSensor.getClass();
        C0SZ8 c0sz8LIZJ = FeedInfraTimingSensor.LIZJ(iViewPagerComponentAbility);
        FeedInfraTimingSensor.LIZ();
        Iterator it2 = ((ArrayList) FeedInfraTimingSensor.LLJ).iterator();
        while (it2.hasNext()) {
            InterfaceC715180S3o interfaceC715180S3o = (InterfaceC715180S3o) ((Reference) it2.next()).get();
            if (interfaceC715180S3o != null) {
                interfaceC715180S3o.LJIIIIZZ(C0S48.ENTRY_UNSELECTED, c0sz8LIZJ);
            }
        }
        if (((Boolean) C715260S3w.LJ.getValue()).booleanValue()) {
            FeedInfraTimingSensor.LL.getClass();
            InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) FeedInfraTimingSensor.LLJILJIL.getValue();
            if (interfaceC1602960roc != null) {
                interfaceC1602960roc.start();
            }
        }
    }

    public C715140S3k(IViewPagerComponentAbility iViewPagerComponentAbility) {
        this.LLIZLLLIL = iViewPagerComponentAbility;
        this.LL = new ARunnableS111S0100000_11(iViewPagerComponentAbility, 90);
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.LLILLL = true;
        }
        FeedInfraTimingSensor$timingHandler$1 feedInfraTimingSensor$timingHandler$1 = FeedInfraTimingSensor.LLJIJIL;
        feedInfraTimingSensor$timingHandler$1.removeCallbacks(this.LLILLJJLI);
        feedInfraTimingSensor$timingHandler$1.removeCallbacks(this.LLIZ);
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        EnumC715150S3l enumC715150S3l = this.LLILZ;
        feedInfraTimingSensor.getClass();
        if (i != 0) {
            if (i == 1) {
                enumC715150S3l = EnumC715150S3l.DRAGGING;
            }
        } else {
            enumC715150S3l = EnumC715150S3l.IDLE;
        }
        if (enumC715150S3l == EnumC715150S3l.IDLE && this.LLILZ == EnumC715150S3l.SELECTED && this.LLILLL) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LL;
            feedInfraTimingSensor$timingHandler$1.removeCallbacks(aRunnableS111S0100000_11);
            feedInfraTimingSensor$timingHandler$1.postDelayed(aRunnableS111S0100000_11, 16L);
            this.LLILZLL = System.currentTimeMillis();
            feedInfraTimingSensor$timingHandler$1.postDelayed(this.LLIZ, ((Number) FeedVisibilityOptConfig.LJIIL.getValue()).longValue());
            this.LLILLL = false;
        }
        this.LLILZ = enumC715150S3l;
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        this.LLILZIL = i;
        if (this.LLILZ == EnumC715150S3l.IDLE) {
            FeedInfraTimingSensor.LLJIJIL.postDelayed(this.LLILLJJLI, 500L);
        }
        this.LLILZ = EnumC715150S3l.SELECTED;
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        FeedInfraTimingSensor.LLILZ = new WeakReference<>(this.LLIZLLLIL);
        FeedInfraTimingSensor feedInfraTimingSensor2 = FeedInfraTimingSensor.LL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        feedInfraTimingSensor2.getClass();
        FeedInfraTimingSensor.LLIZ = jCurrentTimeMillis;
        if (((Boolean) C1E7D.LIZLLL.getValue()).booleanValue() && !C1E7D.LIZ) {
            return;
        }
        if (!FeedInfraTimingSensor.LLILZIL) {
            C0CM3 c0cm3 = new C0CM3();
            IViewPagerComponentAbility iViewPagerComponentAbility = this.LLIZLLLIL;
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
            c0cm3.LJFF = "FeedInfra_2";
            c0cm3.LJI = new AwS555S0100000_11(iViewPagerComponentAbility, 1299);
            C312240CLu.LIZ(c0cm3);
            return;
        }
        C0CM3 c0cm32 = new C0CM3();
        IViewPagerComponentAbility iViewPagerComponentAbility2 = this.LLIZLLLIL;
        c0cm32.LIZ = C0CME.SCROLL_END;
        c0cm32.LIZIZ = true;
        c0cm32.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        c0cm32.LJFF = "FeedInfra_3";
        c0cm32.LJI = new AwS555S0100000_11(iViewPagerComponentAbility2, 1300);
        C312240CLu.LIZ(c0cm32);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    @Override // X.InterfaceC1616070s9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolledEnd(int r17, float r18, int r19) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C715140S3k.onPageScrolledEnd(int, float, int):void");
    }
}
