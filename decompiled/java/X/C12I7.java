package X;

import Y.ARunnableS27S0210000_29;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.creativex.recorder.beauty.q;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ln3.a;

/* JADX INFO: renamed from: X.12I7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12I7 {
    public final C12IA LIZ;
    public final C12IC LIZIZ;
    public final a LIZJ;
    public boolean LIZLLL;
    public final InterfaceC1463990oCT LJ;
    public final InterfaceC1644770su3 LJFF;
    public final boolean LJI;
    public boolean LJII;
    public final h0<Boolean> LJIIIIZZ = new h0<>(Boolean.FALSE);
    public List<BeautyComposerInfo> LJIIIZ;
    public LifecycleOwner LJIIJ;

    public abstract BeautyMetadata LIZJ();

    public abstract void LIZLLL();

    public final void LIZ() {
        BeautyCategory beautyCategoryLIZJ;
        List<ComposerBeauty> beautyList;
        if (this.LIZIZ.Vl() || (beautyCategoryLIZJ = this.LIZIZ.LIZJ()) == null || (beautyList = beautyCategoryLIZJ.getBeautyList()) == null) {
            return;
        }
        for (ComposerBeauty composerBeauty : beautyList) {
            if (composerBeauty.getChildList() != null) {
                Iterator<ComposerBeauty> it2 = composerBeauty.getChildList().iterator();
                while (it2.hasNext()) {
                    LIZIZ(it2.next());
                }
            } else {
                LIZIZ(composerBeauty);
            }
        }
    }

    public final void LIZIZ(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items != null && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                ComposerBeautyExtraBeautify.ItemsBean itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) ListProtector.get(items, i);
                int[] iArrLJJLL = this.LIZ.LJJLL(composerBeauty.getEffect().getUnzipPath(), "");
                if (iArrLJJLL.length == 2 && iArrLJJLL[0] == 0 && iArrLJJLL[1] != EnumC992680bwI.EXCLUDE.getFlag() && this.LIZIZ.je().Ye().LIZLLL(composerBeauty, false)) {
                    this.LIZ.V(composerBeauty.getEffect().getUnzipPath(), itemsBean.tag, 0.0f);
                } else if (!this.LIZIZ.Vl()) {
                    this.LIZ.V(composerBeauty.getEffect().getUnzipPath(), itemsBean.tag, 0.0f);
                }
            }
        }
    }

    public final void LJ(List<BeautyComposerInfo> list) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_first_frame_preload_beauty_package_optimization", true, false)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (!C19731012Hs.LJIIIIZZ.contains(((BeautyComposerInfo) obj).effectId)) {
                    arrayList.add(obj);
                }
            }
            this.LIZJ.kA1(arrayList);
        }
    }

    public final void LJFF(boolean z) {
        C1643870ssb value;
        try {
            if (!this.LIZJ.M1().equals("record")) {
                InterfaceC1463990oCT interfaceC1463990oCT = this.LJ;
                if (interfaceC1463990oCT != null) {
                    interfaceC1463990oCT.w("[BeautyPresenter#updateBeautyAndFilter] curPage is not record");
                    return;
                }
                return;
            }
            this.LIZ.gn(false);
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (BeautyComposerInfo beautyComposerInfo : this.LJIIIZ) {
                arrayList.add(beautyComposerInfo.nodePath);
                arrayList2.add(beautyComposerInfo.extra);
                InterfaceC1463990oCT interfaceC1463990oCT2 = this.LJ;
                if (interfaceC1463990oCT2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[BeautyPresenter#updateBeautyAndFilter] beautyComposerInfo:");
                    sbLIZ.append(beautyComposerInfo.nodePath);
                    sbLIZ.append(" ");
                    sbLIZ.append(beautyComposerInfo.extra);
                    interfaceC1463990oCT2.i(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            int iIndexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
            InterfaceC1644770su3 interfaceC1644770su3 = this.LJFF;
            if (interfaceC1644770su3 != null) {
                value = interfaceC1644770su3.RT().getValue();
            } else {
                value = null;
            }
            if (iIndexOf >= 0 && iIndexOf < this.LJIIIZ.size() && (value == null || !this.LJFF.QJ(value.LIZ))) {
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < iIndexOf; i++) {
                    arrayList3.add(this.LJIIIZ.get(i));
                }
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    iIndexOf++;
                    if (iIndexOf >= this.LJIIIZ.size()) {
                        break;
                    } else {
                        arrayList4.add(this.LJIIIZ.get(iIndexOf));
                    }
                }
                if (this.LIZIZ.ke()) {
                    InterfaceC1463990oCT interfaceC1463990oCT3 = this.LJ;
                    if (interfaceC1463990oCT3 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[BeautyPresenter#updateBeautyAndFilter] apply useComposerFilter=");
                        sbLIZ2.append(this.LJI);
                        sbLIZ2.append(" headNodes=");
                        sbLIZ2.append(arrayList3);
                        sbLIZ2.append(" trailNodes=");
                        sbLIZ2.append(arrayList4);
                        interfaceC1463990oCT3.i(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (this.LJI) {
                        if (!this.LJII) {
                            a aVar = this.LIZJ;
                            if (aVar instanceof q) {
                                boolean zYG2 = aVar.yG2();
                                this.LJII = zYG2;
                                if (!zYG2) {
                                    LJ(C12I5.LIZ(arrayList3));
                                }
                            }
                        }
                        this.LIZ.h(arrayList3, 10000);
                    } else {
                        this.LIZ.L4(arrayList3, 10000);
                    }
                } else {
                    InterfaceC1463990oCT interfaceC1463990oCT4 = this.LJ;
                    if (interfaceC1463990oCT4 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[BeautyPresenter#updateBeautyAndFilter] clear useComposerFilter=");
                        sbLIZ3.append(this.LJI);
                        interfaceC1463990oCT4.i(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (this.LJI) {
                        this.LIZ.h(Collections.emptyList(), 10000);
                    } else {
                        this.LIZ.L4(Collections.emptyList(), 10000);
                    }
                }
                C786410Ut5.LJLIIL(250L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS27S0210000_29(this, z, arrayList4, 0));
                return;
            }
            if (this.LIZIZ.ke()) {
                List<BeautyComposerInfo> listLIZ = C12I5.LIZ(this.LJIIIZ);
                InterfaceC1463990oCT interfaceC1463990oCT5 = this.LJ;
                if (interfaceC1463990oCT5 != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[BeautyPresenter#updateBeautyAndFilter] apply useComposerFilter=");
                    sbLIZ4.append(this.LJI);
                    sbLIZ4.append(" setFilter=");
                    sbLIZ4.append(z);
                    sbLIZ4.append(" beautyComposerNodes=");
                    sbLIZ4.append(listLIZ);
                    interfaceC1463990oCT5.i(C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (this.LJI && !z) {
                    this.LIZ.h(listLIZ, 10000);
                } else {
                    LJ(listLIZ);
                    this.LIZ.L4(listLIZ, 10000);
                }
            } else {
                InterfaceC1463990oCT interfaceC1463990oCT6 = this.LJ;
                if (interfaceC1463990oCT6 != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[BeautyPresenter#updateBeautyAndFilter] clear useComposerFilter=");
                    sbLIZ5.append(this.LJI);
                    sbLIZ5.append(" setFilter=");
                    sbLIZ5.append(z);
                    interfaceC1463990oCT6.i(C2188811AlT.LIZIZ(sbLIZ5));
                }
                if (this.LJI && !z) {
                    this.LIZ.h(Collections.emptyList(), 10000);
                } else {
                    this.LIZ.L4(Collections.emptyList(), 10000);
                }
            }
            if (C306770C0t.LIZ() && !this.LIZIZ.Vl()) {
                return;
            }
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!C2219091BtD.LIZIZ()) {
                InterfaceC1463990oCT interfaceC1463990oCT7 = this.LJ;
                if (interfaceC1463990oCT7 != null) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("[BeautyPresenter#updateBeautyAndFilter] exception:\n");
                    sbLIZ6.append(Log.getStackTraceString(e));
                    interfaceC1463990oCT7.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    return;
                }
                return;
            }
            throw new RuntimeException("updateBeautyAndFilter error", e);
        }
    }

    public C12I7(C1661390tKr c1661390tKr, C19731712Hz c19731712Hz, a aVar, InterfaceC1644770su3 interfaceC1644770su3, InterfaceC1463990oCT interfaceC1463990oCT, boolean z) {
        this.LIZ = c1661390tKr;
        this.LIZIZ = c19731712Hz;
        this.LIZJ = aVar;
        this.LJ = interfaceC1463990oCT;
        this.LJFF = interfaceC1644770su3;
        this.LJI = z;
    }
}
