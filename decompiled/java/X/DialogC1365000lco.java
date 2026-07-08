package X;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1365000lco extends DialogC1369990lkr {
    public final Activity LLJJI;
    public final ImChannel LLJJIII;
    public final DurationPerfMon LLJJIJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DialogC1369990lkr, X.DialogC1370000lks, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        IMPerformanceService performanceService;
        View decorView;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        InterfaceC1364520lc2 interfaceC1364520lc2 = null;
        boolean z2 = false;
        if (this.LLIZLLLIL.LJIJJLI && !zLIZJ) {
            Activity activity = this.LLJJI;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.v0s);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.v0k);
            View viewFindViewById = findViewById(R.id.v0o);
            C1371590lnR c1371590lnR = this.LLIZLLLIL;
            C1364530lc3 c1364530lc3 = new C1364530lc3(new C1364540lc4(activity, this, viewGroup, viewGroup2, viewFindViewById, (SharePackage) c1371590lnR.LJIJJ, c1371590lnR.LJJII));
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            Activity activity2 = this.LLJJI;
            ViewGroup frameLayout = (ViewGroup) findViewById(R.id.v13);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(this.LLJJI);
            }
            ViewGroup frameLayout2 = (ViewGroup) findViewById(R.id.v0l);
            if (frameLayout2 == null) {
                frameLayout2 = new FrameLayout(this.LLJJI);
            }
            FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.v0p);
            if (frameLayout3 == null) {
                frameLayout3 = new FrameLayout(this.LLJJI);
            }
            SharePackage sharePackage = (SharePackage) this.LLIZLLLIL.LJIJJ;
            C2372609Rk c2372609Rk = (C2372609Rk) findViewById(R.id.v0z);
            C2372609Rk c2372609Rk2 = c2372609Rk;
            if (c2372609Rk == null) {
                final Activity activity3 = this.LLJJI;
                final boolean z3 = z2 ? 1 : 0;
                c2372609Rk2 = new LinearLayout(activity3, z3) { // from class: X.09Rk
                    public C2372709Rl LL = new C2372709Rl();

                    public C2372709Rl getKeyBoardObservable() {
                        return this.LL;
                    }

                    public void setKeyBoardObservable(C2372709Rl c2372709Rl) {
                        this.LL = c2372709Rl;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00e8
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                        */
                    @Override // android.widget.LinearLayout, android.view.View
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onMeasure(int r11, int r12) {
                        /*
                            Method dump skipped, instruction units count: 245
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2372609Rk.onMeasure(int, int):void");
                    }
                };
            }
            if (findViewById(R.id.v12) == null) {
                new TextView(this.LLJJI);
            }
            C1371590lnR c1371590lnR2 = this.LLIZLLLIL;
            interfaceC1364710lcLLIZIZ.LJJJ(new C1362880lZO(activity2, sharePackage, frameLayout, frameLayout2, frameLayout3, c2372609Rk2, c1371590lnR2.LJJIJ, c1371590lnR2.LIZ), c1364530lc3);
            ImChannel imChannel = this.LLJJIII;
            if (imChannel != null) {
                imChannel.getClass();
            }
        } else {
            ImChannel imChannel2 = this.LLJJIII;
            if (imChannel2 != null) {
                imChannel2.LLILZ = false;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config has supportIm: ");
        sbLIZ.append(this.LLIZLLLIL.LJIJJLI);
        sbLIZ.append(", topView is null: ");
        if (this.LLIZLLLIL.LJIL == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", has channels size: ");
        sbLIZ.append(this.LLIZLLLIL.LIZ);
        sbLIZ.append(", has actions size: ");
        sbLIZ.append(this.LLIZLLLIL.LJFF);
        C2344809Gs.LJFF("CommonShareDialog", C2188811AlT.LIZIZ(sbLIZ));
        ImChannel imChannel3 = this.LLJJIII;
        if (imChannel3 != null) {
            C1371590lnR c1371590lnR3 = this.LLIZLLLIL;
            if (c1371590lnR3 != null) {
                interfaceC1364520lc2 = c1371590lnR3.LJJII;
            }
            imChannel3.LLILZIL = interfaceC1364520lc2;
        }
        View viewFindViewById2 = findViewById(R.id.v0z);
        if (viewFindViewById2 != null && (performanceService = C1336205Ku.LIZ(false).getPerformanceService()) != null) {
            performanceService.LIZ(viewFindViewById2, new InterfaceC1224904ql() { // from class: X.0lcp
                public long LIZ = -1;

                @Override // X.InterfaceC1224904ql
                public final void LIZ() {
                    long jUptimeMillis = this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : -1L;
                    DurationPerfMon durationPerfMon = this.LIZIZ.LLJJIJI;
                    if (durationPerfMon != null) {
                        durationPerfMon.LIZJ(C451270Hmn.LJ, new C158900jD(jUptimeMillis));
                    }
                }

                @Override // X.InterfaceC1224904ql
                public final void LIZIZ() {
                    this.LIZ = SystemClock.uptimeMillis();
                }
            });
        }
    }

    public DialogC1365000lco(Activity activity, C1371590lnR c1371590lnR, int i) {
        C1366690lfX c1366690lfXLIZIZ;
        super(activity, i, c1371590lnR);
        this.LLJJI = activity;
        IMPerformanceService performanceService = C1336205Ku.LIZ(false).getPerformanceService();
        if (performanceService != null) {
            c1366690lfXLIZIZ = performanceService.LIZIZ();
        } else {
            c1366690lfXLIZIZ = null;
        }
        this.LLJJIJI = c1366690lfXLIZIZ;
        List<InterfaceC1369790lkX> list = c1371590lnR.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
            if (interfaceC1369790lkX instanceof ImChannel) {
                arrayList.add(interfaceC1369790lkX);
            }
        }
        if (arrayList.size() == 1) {
            this.LLJJIII = (ImChannel) ListProtector.get(arrayList, 0);
        }
        if (this.LLJJIII != null && C1336205Ku.LIZJ().LIZJ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            c1371590lnR.LIZ.remove(this.LLJJIII);
            this.LLJJIII = null;
        }
        Window window = getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-16777216);
            C1360720lVu.LIZJ(window, false);
        }
        C818480W8w.LIZJ("share_panel", C0W93.SUCCESS, null, C2097608Jq.LJ());
        DurationPerfMon durationPerfMon = this.LLJJIJI;
        if (durationPerfMon != null) {
            durationPerfMon.LIZIZ(C451270Hmn.LJ, true);
        }
    }
}
