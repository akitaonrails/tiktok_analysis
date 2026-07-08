package Y;

import X.C0P0T;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1389890mGx;
import X.C20145813s8;
import X.C259800zU;
import X.C838130WuJ;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiDetailContentHeaderRegionalWithIntroAssemBase;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS3S2300000_18 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS3S2300000_18 aCListenerS3S2300000_18, View view) {
        String str = aCListenerS3S2300000_18.s0;
        if (str != null && str.length() != 0) {
            try {
                C20145813s8.LIZ("label", aCListenerS3S2300000_18.s0, view.getContext(), CertProviderManagerKt.findCert("bpea-poi_detail_copy_address", 1476399105));
                C1389890mGx c1389890mGx = new C1389890mGx((View) aCListenerS3S2300000_18.l2);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) aCListenerS3S2300000_18.l3;
            String str2 = poiDetailContentHeaderBaseAssemV3.LLJILJILJ;
            String str3 = aCListenerS3S2300000_18.s1;
            PageFinder pageFinder = (PageFinder) poiDetailContentHeaderBaseAssemV3.LLJILLL.getValue();
            c1185430gxB.getClass();
            C1185430gxB.LJIILLIIL(pageFinder, str2, "long_press_copy", str3);
        }
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS3S2300000_18.l4).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS3S2300000_18 aCListenerS3S2300000_18, View view) {
        String str = aCListenerS3S2300000_18.s0;
        if (str != null && str.length() != 0) {
            try {
                C20145813s8.LIZ("label", aCListenerS3S2300000_18.s0, view.getContext(), CertProviderManagerKt.findCert("bpea-poi_detail_copy_address", 1476399105));
                C1389890mGx c1389890mGx = new C1389890mGx((View) aCListenerS3S2300000_18.l2);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem = (PoiDetailContentHeaderNewRegionalAssem) aCListenerS3S2300000_18.l3;
            String str2 = poiDetailContentHeaderNewRegionalAssem.LLJILJILJ;
            String str3 = aCListenerS3S2300000_18.s1;
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiDetailContentHeaderNewRegionalAssem));
            c1185430gxB.getClass();
            C1185430gxB.LJIILLIIL(pageFinderVia, str2, "long_press_copy", str3);
        }
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS3S2300000_18.l4).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static final void onClick$2(ACListenerS3S2300000_18 aCListenerS3S2300000_18, View view) {
        String str = aCListenerS3S2300000_18.s0;
        if (str != null && str.length() != 0) {
            try {
                C20145813s8.LIZ("label", aCListenerS3S2300000_18.s0, view.getContext(), CertProviderManagerKt.findCert("bpea-poi_detail_copy_address", 1476399105));
                C1389890mGx c1389890mGx = new C1389890mGx((View) aCListenerS3S2300000_18.l2);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            PoiDetailContentHeaderRegionalWithIntroAssemBase poiDetailContentHeaderRegionalWithIntroAssemBase = (PoiDetailContentHeaderRegionalWithIntroAssemBase) aCListenerS3S2300000_18.l3;
            String str2 = poiDetailContentHeaderRegionalWithIntroAssemBase.LLJI;
            String str3 = aCListenerS3S2300000_18.s1;
            PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(poiDetailContentHeaderRegionalWithIntroAssemBase));
            c1185430gxB.getClass();
            C1185430gxB.LJIILLIIL(pageFinderVia, str2, "long_press_copy", str3);
        }
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS3S2300000_18.l4).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS3S2300000_18(String str, String str2, View view, PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, String str3, C259800zU<C0P0T> c259800zU) {
        this.$t = c259800zU;
        this.s0 = str;
        this.l2 = str2;
        this.l3 = view;
        this.s1 = poiDetailContentHeaderBaseAssemV3;
        this.l4 = str3;
    }
}
