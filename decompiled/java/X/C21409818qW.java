package X;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.LruCache;
import androidx.emoji2.text.e;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21409818qW {
    public static final LruCache<Integer, Layout> LJIIL = new LruCache<>(100);
    public static final BoringLayout.Metrics LJIILIIL = new BoringLayout.Metrics();
    public C444890HcV LIZ;
    public final C21409918qX LIZIZ;
    public Layout LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final C01GW LJII;
    public final boolean LJIIIIZZ;
    public BoringLayout.Metrics LJIIIZ;
    public BoringLayout LJIIJ;
    public Spannable LJIIJJI;

    public C21409818qW() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setAntiAlias(true);
        C21409918qX c21409918qX = new C21409918qX(Layout.Alignment.ALIGN_NORMAL, TextDirectionHeuristics.FIRSTSTRONG_LTR, c444890HcV.getColor(), ((TextPaint) c444890HcV).linkColor);
        this.LIZ = c444890HcV;
        this.LIZIZ = c21409918qX;
        this.LJII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(18));
        this.LJIIIIZZ = e.LJ() && e.LIZ().LIZJ() == 1;
    }

    public final void LIZJ() {
        if (this.LIZLLL) {
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.set((TextPaint) this.LIZ);
            this.LIZ = c444890HcV;
            this.LIZLLL = false;
        }
    }

    public final BoringLayout.Metrics LIZIZ(BoringLayout.Metrics metrics) {
        if (!Intrinsics.LJFF(metrics, LJIILIIL)) {
            return metrics;
        }
        BoringLayout.Metrics metricsIsBoring = null;
        try {
            C21409918qX c21409918qX = this.LIZIZ;
            CharSequence charSequence = c21409918qX.LIZ;
            if (charSequence != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    metricsIsBoring = BoringLayout.isBoring(charSequence, this.LIZ, c21409918qX.LJIIZILJ, false, this.LJIIIZ);
                } else {
                    metricsIsBoring = BoringLayout.isBoring(charSequence, this.LIZ, this.LJIIIZ);
                }
                if (metricsIsBoring != null) {
                    this.LJIIIZ = metricsIsBoring;
                    return metricsIsBoring;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return metricsIsBoring;
    }

    public static void LJFF(C21409818qW c21409818qW, TextDirectionHeuristic textDirectionHeuristic) {
        if (!Intrinsics.LJFF(c21409818qW.LIZIZ.LJIIZILJ, textDirectionHeuristic)) {
            c21409818qW.LIZIZ.LJIIZILJ = textDirectionHeuristic;
        }
    }

    public final void LIZLLL(int i, Function0 function0) {
        if (this.LIZIZ.LJJII != i) {
            LIZJ();
            C21409918qX c21409918qX = this.LIZIZ;
            c21409918qX.LJJII = i;
            c21409918qX.LJIILIIL = i - this.LIZ.getFontMetrics(null);
            this.LIZIZ.LJIIL = 1.0f;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void LJ(int i, Function0 function0) {
        int i2;
        C21409918qX c21409918qX = this.LIZIZ;
        if (i < 1) {
            i2 = 1;
        } else {
            i2 = i;
        }
        c21409918qX.LIZJ = i2;
        c21409918qX.LJFF = 1;
        c21409918qX.LJIIIZ = i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZ(int r27, android.text.BoringLayout.Metrics r28, int r29, android.text.Layout.Alignment r30) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21409818qW.LIZ(int, android.text.BoringLayout$Metrics, int, android.text.Layout$Alignment):android.text.Layout");
    }
}
