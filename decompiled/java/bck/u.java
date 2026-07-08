package bck;

import X.C12IR;
import X.C1643880ssc;
import X.C1ALZ;
import X.C2177871ALh;
import X.C2177921ALm;
import X.C2177931ALn;
import X.InterfaceC1645720sva;
import X.InterfaceC2177841ALe;
import X.InterfaceC2177911ALl;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ui.component.b1;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class u implements InterfaceC2177841ALe {
    public final InterfaceC1645720sva LIZ;
    public final C2177931ALn LIZIZ;
    public FilterBean LIZJ;
    public final VERecorder LIZLLL;
    public C1ALZ LJ;
    public C12IR LJFF;
    public final InterfaceC2177911ALl LJI;
    public float LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final C2177871ALh LIZLLL() {
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder == null) {
            return new C2177871ALh();
        }
        k kVar = vERecorder.LIZIZ;
        if (kVar == null) {
            return new C2177871ALh();
        }
        TEBundle tEBundleObtain = TEBundle.obtain();
        kVar.LJJJ.LJFF(tEBundleObtain);
        C2177871ALh c2177871ALh = new C2177871ALh();
        c2177871ALh.LIZ = tEBundleObtain.getFloat("gamma");
        c2177871ALh.LIZIZ = tEBundleObtain.getFloat("brightness");
        c2177871ALh.LIZJ = tEBundleObtain.getFloat("contrast");
        c2177871ALh.LIZLLL = tEBundleObtain.getFloat("saturation");
        c2177871ALh.LJ = tEBundleObtain.getFloat("hueShift");
        c2177871ALh.LJFF = tEBundleObtain.getFloat("opacity");
        c2177871ALh.LJI = (int) tEBundleObtain.getLong("addColor");
        c2177871ALh.LJII = (int) tEBundleObtain.getLong("mulColor");
        tEBundleObtain.recycle();
        return c2177871ALh;
    }

    public final String LJ() {
        String filterFolder;
        String strGo = this.LIZ.go();
        FilterBean filterBean = this.LIZJ;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null || strGo == null || !strGo.contains(filterFolder)) {
            return null;
        }
        return filterFolder;
    }

    public final void LIZJ(boolean z) {
        k kVar;
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder != null && (kVar = vERecorder.LIZIZ) != null) {
            kVar.LJJJ.LJIJJLI("enableBMFColorCorrection", z);
        }
    }

    public final void LJFF(String... strArr) {
        this.LIZ.LJJLIIIJILLIZJL(LIZIZ(Arrays.asList(strArr), Collections.emptyList(), Collections.emptyList()));
    }

    public final int LJI(C2177871ALh c2177871ALh) {
        k kVar;
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder != null && (kVar = vERecorder.LIZIZ) != null) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setBool("SetBMFColorCorrectionParam", true);
            tEBundleObtain.setFloat("gamma", c2177871ALh.LIZ);
            tEBundleObtain.setFloat("brightness", c2177871ALh.LIZIZ);
            tEBundleObtain.setFloat("contrast", c2177871ALh.LIZJ);
            tEBundleObtain.setFloat("saturation", c2177871ALh.LIZLLL);
            tEBundleObtain.setFloat("hueShift", c2177871ALh.LJ);
            tEBundleObtain.setFloat("opacity", c2177871ALh.LJFF);
            tEBundleObtain.setInt("addColor", c2177871ALh.LJI);
            tEBundleObtain.setInt("mulColor", c2177871ALh.LJII);
            return kVar.LJJJ.LJIL("SetBMFColorCorrectionParam", tEBundleObtain);
        }
        return -1;
    }

    public static List LIZ(FilterBean filterBean, float f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(C1643880ssc.LIZIZ(filterBean, f), filterBean.getExtra(), filterBean.getId(), ""));
        return arrayList;
    }

    public u(C2177931ALn c2177931ALn, VERecorder vERecorder, C2177921ALm c2177921ALm) {
        this.LIZIZ = c2177931ALn;
        this.LIZ = c2177931ALn.LIZ;
        this.LIZLLL = vERecorder;
        this.LJI = c2177921ALm;
    }

    public static List LIZIZ(List list, List list2, List list3) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i >= list2.size()) {
                str = "";
            } else {
                str = (String) ListProtector.get(list2, i);
            }
            if (i >= list3.size()) {
                str2 = "";
            } else {
                str2 = (String) ListProtector.get(list3, i);
            }
            arrayList.add(new ComposerInfo((String) ListProtector.get(list, i), str, str2, ""));
        }
        return arrayList;
    }

    public final void LJIIIZ(float f, String str, String str2) {
        String[] strArr = {str, str2};
        String[] strArr2 = {"leftSlidePosition", "rightSlidePosition"};
        float[] fArr = {f, f};
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder != null && vERecorder.LJIIL() != null) {
            this.LIZLLL.LJIIL().LJJIJIIJIL(2, strArr, strArr2, fArr);
        }
    }

    public final void LJIIJ(boolean z, boolean z2, boolean z3) {
        if (z2) {
            b1 b1Var = ((C2177921ALm) this.LJI).LIZ;
            b1Var.d5();
            b1Var.Zd1().LJ(CertProviderManagerKt.findCert("bpea-live_effect_start_use_mic_in_preview_page", 1476788229), null);
        } else {
            b1 b1Var2 = ((C2177921ALm) this.LJI).LIZ;
            b1Var2.d5();
            b1Var2.Zd1().LJI(CertProviderManagerKt.findCert("bpea-live_effect_stop_use_mic_in_preview_page", 1476788483));
        }
        this.LIZ.Pn(z, z2, z3);
    }

    public final void LJIIIIZZ(float f, float f2, int i, int i2) {
        InterfaceC1645720sva interfaceC1645720sva = this.LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.no(f, f2, i, i2);
        }
    }

    public final void LJII(float f, float f2, float f3, float f4, float f5) {
        InterfaceC1645720sva interfaceC1645720sva = this.LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.fo(f, f2, f3, f4, f5);
        }
    }
}
