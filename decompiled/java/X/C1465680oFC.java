package X;

import Y.AObserverS184S0200000_22;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465680oFC extends AbstractC2255721DQs<InterfaceC1453680nvq> implements InterfaceC1453680nvq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final Function0<Context> LLILLJJLI;
    public List<? extends FilterBean> LLJ;
    public boolean LLJIJIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465730oFH.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465710oFF.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = new C1466810oH1(this, 0);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465680oFC.class, "editMode", "getEditMode()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1465680oFC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1465680oFC.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1465680oFC.class, "editTooltipApi", "getEditTooltipApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditTooltipApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1465680oFC.class, "editFilterIndicatorApi", "getEditFilterIndicatorApi()Lcom/ss/android/ugc/gamora/editor/filter/indicator/EditFilterIndicatorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1465680oFC.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1465680oFC.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJILJILJ = 8;
    }

    public InterfaceC1453680nvq Z1() {
        return this;
    }

    private final InterfaceC1465710oFF G2() {
        return (InterfaceC1465710oFF) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    private final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC1451050nrb T2() {
        return (InterfaceC1451050nrb) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    private final InterfaceC1465730oFH W2() {
        return (InterfaceC1465730oFH) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final C1450610nqt c3() {
        return (C1450610nqt) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    private final InterfaceC1450920nrO i3() {
        return (InterfaceC1450920nrO) this.LLJI.getValue(this, LLJILJIL[6]);
    }

    private final InterfaceC1453430nvR w2() {
        return (InterfaceC1453430nvR) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    @Override // X.InterfaceC1453680nvq
    public void qU1() {
        InterfaceC1450920nrO interfaceC1450920nrOI3;
        LiveData<Unit> liveDataYX;
        InterfaceC1465730oFH interfaceC1465730oFHW2;
        List<SingleImageData> imageList;
        InitialFilterConfig initialFilterConfig = H2().creativeModel.initialModel.filterConfig;
        if (initialFilterConfig == null) {
            return;
        }
        if (!initialFilterConfig.getEnableInEditPage() || initialFilterConfig.getAppliedInImageEditPage()) {
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig appliedInImageEditPage");
            return;
        }
        if (initialFilterConfig.getAppliedInVideoEditPage()) {
            return;
        }
        String filterId = initialFilterConfig.getFilterId();
        if (filterId == null || filterId.length() == 0) {
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig initialFilterConfig is invalid");
            return;
        }
        InterfaceC1453430nvR interfaceC1453430nvRW2 = w2();
        ImageAlbumData imageAlbumData = H2().getImageAlbumData();
        interfaceC1453430nvRW2.dr2(true, (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() <= 1) ? false : true);
        InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) getDiContainer().LJIIL(null, InterfaceC1460000o62.class);
        if (interfaceC1460000o62 != null && (interfaceC1465730oFHW2 = W2()) != null) {
            VideoPublishEditModel videoPublishEditModelH2 = H2();
            C1664590tQ1.LJII(this);
            interfaceC1465730oFHW2.ig(new C1654700tA4(videoPublishEditModelH2, C1664590tQ1.LJII(this).getString(2131826565), new AwS566S0100000_22(interfaceC1460000o62, 132)));
        }
        initialFilterConfig.setAppliedInImageEditPage(true);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig showAnchorPanel anchorFilterID=");
        sbLIZ.append(initialFilterConfig.getFilterId());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        List<? extends FilterBean> list = (List) C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF().getValue();
        this.LLJ = list;
        if (list == null || list.isEmpty()) {
            C0EHK.LJIIJ(C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF(), this, new AObserverS184S0200000_22(this, initialFilterConfig, 3));
        }
        if (c3() == null && (interfaceC1450920nrOI3 = i3()) != null && (liveDataYX = interfaceC1450920nrOI3.yX()) != null) {
            C0EHK.LJIIJ(liveDataYX, this, new AObserverS184S0200000_22(this, initialFilterConfig, 4));
        }
        X1(initialFilterConfig);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final Function0<Context> o2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public final void X1(InitialFilterConfig initialFilterConfig) {
        boolean z;
        if (this.LLJIJIL) {
            return;
        }
        List<? extends FilterBean> list = this.LLJ;
        boolean z2 = false;
        if (list != null && !list.isEmpty() && c3() != null) {
            InterfaceC1451050nrb interfaceC1451050nrbT2 = T2();
            if (interfaceC1451050nrbT2 != null && !interfaceC1451050nrbT2.aN1()) {
                List<? extends FilterBean> list2 = this.LLJ;
                FilterBean filterBean = null;
                if (list2 != null) {
                    for (FilterBean filterBean2 : list2) {
                        FilterBean filterBean3 = filterBean2;
                        if (Intrinsics.LJFF(filterBean3.getResId(), initialFilterConfig.getResId()) || Intrinsics.LJFF(filterBean3.getId(), initialFilterConfig.getFilterId())) {
                            filterBean = filterBean2;
                            break;
                        }
                    }
                    FilterBean filterBean4 = filterBean;
                    if (filterBean4 != null) {
                        if (!C1453230nv7.LJIIIZ(filterBean4, C0CHQ.LIZ().LJJIL().LIZIZ())) {
                            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig downloading filter");
                            return;
                        } else {
                            W1(initialFilterConfig, filterBean4);
                            this.LLJIJIL = true;
                            return;
                        }
                    }
                }
                C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig filter not found");
                return;
            }
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig checkAndApplyFilter user hid panel");
            return;
        }
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig checkAndApplyFilter availableFilters:");
        List<? extends FilterBean> list3 = this.LLJ;
        if (list3 != null && !list3.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(", imagePresenter: ");
        if (c3() == null) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1465680oFC(C1DRG c1drg, Function0<? extends Context> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
    }

    private final void W1(InitialFilterConfig initialFilterConfig, FilterBean filterBean) {
        float fLIZIZ;
        FilterBean filterBean2;
        LiveData<InterfaceC1453220nv6> liveDataZj2;
        InterfaceC1453220nv6 value;
        InterfaceC1451050nrb interfaceC1451050nrbT2;
        LiveData<InterfaceC358220E2q> liveDataXq1;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig applied anchorFilterID=");
        sbLIZ.append(initialFilterConfig.getFilterId());
        sbLIZ.append(", filterID=");
        sbLIZ.append(filterBean.getId());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1451050nrb interfaceC1451050nrbT22 = T2();
        if (interfaceC1451050nrbT22 != null && (liveDataZj2 = interfaceC1451050nrbT22.zj2()) != null && (value = liveDataZj2.getValue()) != null && (interfaceC1451050nrbT2 = T2()) != null && (liveDataXq1 = interfaceC1451050nrbT2.xq1()) != null && liveDataXq1.getValue() != null) {
            fLIZIZ = C1453210nv5.LIZIZ(filterBean, value);
        } else {
            fLIZIZ = -1.0f;
        }
        C1450610nqt c1450610nqtC3 = c3();
        Context contextInvoke = null;
        if (c1450610nqtC3 != null) {
            c1450610nqtC3.LIZIZ(fLIZIZ, filterBean, false);
            if (c1450610nqtC3.LIZLLL != null) {
                c1450610nqtC3.LIZLLL = null;
            }
            c1450610nqtC3.LIZLLL = filterBean;
        }
        InterfaceC1451050nrb interfaceC1451050nrbT23 = T2();
        if (interfaceC1451050nrbT23 != null) {
            interfaceC1451050nrbT23.E4();
        }
        C1450610nqt c1450610nqtC32 = c3();
        if (c1450610nqtC32 != null) {
            filterBean2 = c1450610nqtC32.LIZLLL;
        } else {
            filterBean2 = null;
        }
        InterfaceC1453430nvR interfaceC1453430nvRW2 = w2();
        Function0<Context> function0 = this.LLILLJJLI;
        if (function0 != null) {
            contextInvoke = function0.invoke();
        }
        interfaceC1453430nvRW2.DA2(filterBean2, false, true, contextInvoke, true, false, true, true);
        InterfaceC1451050nrb interfaceC1451050nrbT24 = T2();
        if (interfaceC1451050nrbT24 != null) {
            C1456140nzo.LIZIZ(interfaceC1451050nrbT24, false, false, false, false, 12);
        }
        InterfaceC1465710oFF interfaceC1465710oFFG2 = G2();
        if (interfaceC1465710oFFG2 != null) {
            C1465720oFG.LIZ(interfaceC1465710oFFG2, true, filterBean, false, 12);
        }
    }
}
