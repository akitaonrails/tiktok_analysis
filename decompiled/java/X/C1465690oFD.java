package X;

import Y.AObserverS184S0200000_22;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465690oFD extends AbstractC2255721DQs<InterfaceC1453680nvq> implements InterfaceC1453680nvq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final Function0<Context> LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465710oFF.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465730oFH.class, null);
    public List<? extends FilterBean> LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465690oFD.class, "editMode", "getEditMode()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1465690oFD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1465690oFD.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1465690oFD.class, "editFilterIndicatorApi", "getEditFilterIndicatorApi()Lcom/ss/android/ugc/gamora/editor/filter/indicator/EditFilterIndicatorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1465690oFD.class, "editTooltipApi", "getEditTooltipApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditTooltipApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJIJIL = 8;
    }

    public InterfaceC1453680nvq Z1() {
        return this;
    }

    private final InterfaceC1465710oFF G2() {
        return (InterfaceC1465710oFF) this.LLILZLL.getValue(this, LLJI[3]);
    }

    private final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJI[0]);
    }

    private final InterfaceC1451050nrb T2() {
        return (InterfaceC1451050nrb) this.LLILZ.getValue(this, LLJI[1]);
    }

    private final InterfaceC1465730oFH W2() {
        return (InterfaceC1465730oFH) this.LLIZ.getValue(this, LLJI[4]);
    }

    private final InterfaceC1453430nvR w2() {
        return (InterfaceC1453430nvR) this.LLILZIL.getValue(this, LLJI[2]);
    }

    @Override // X.InterfaceC1453680nvq
    public void qU1() {
        InterfaceC1465730oFH interfaceC1465730oFHW2;
        InitialFilterConfig initialFilterConfig = H2().creativeModel.initialModel.filterConfig;
        if (initialFilterConfig == null) {
            return;
        }
        if (!initialFilterConfig.getEnableInEditPage() || initialFilterConfig.getAppliedInVideoEditPage()) {
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig appliedInVideoEditPage");
            return;
        }
        if (initialFilterConfig.getAppliedInImageEditPage()) {
            return;
        }
        String filterId = initialFilterConfig.getFilterId();
        if (filterId == null || filterId.length() == 0) {
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig initialFilterConfig is invalid");
            return;
        }
        w2().dr2(true, false);
        InterfaceC1451050nrb interfaceC1451050nrbT2 = T2();
        if (interfaceC1451050nrbT2 != null) {
            C1456140nzo.LIZIZ(interfaceC1451050nrbT2, false, false, false, false, 12);
        }
        InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) getDiContainer().LJIIL(null, InterfaceC1460000o62.class);
        if (interfaceC1460000o62 != null && (interfaceC1465730oFHW2 = W2()) != null) {
            interfaceC1465730oFHW2.ig(new C1654700tA4(H2(), C1664590tQ1.LJII(this).getString(2131826976), new AwS566S0100000_22(interfaceC1460000o62, 293)));
        }
        initialFilterConfig.setAppliedInVideoEditPage(true);
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig showAnchorPanel anchorFilterID=");
        sbLIZ.append(initialFilterConfig.getFilterId());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL = (List) C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF().getValue();
        C0EHK.LJIIJ(C0CHQ.LIZ().LJJIL().LIZIZ().LJJI().LJFF(), this, new AObserverS184S0200000_22(this, initialFilterConfig, 5));
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
        if (this.LLJ) {
            return;
        }
        List<? extends FilterBean> list = this.LLIZLLLIL;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            this.LLJ = true;
            List<? extends FilterBean> list2 = this.LLIZLLLIL;
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
                        return;
                    }
                }
            }
            C201955140j.LIZJ(C1662160tM6.LIZIZ, "applyInitialFilterConfig filter not found");
            return;
        }
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig checkAndApplyFilter availableFilters:");
        List<? extends FilterBean> list3 = this.LLIZLLLIL;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        }
        sbLIZ.append(z);
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1465690oFD(C1DRG c1drg, Function0<? extends Context> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
    }

    private final void W1(InitialFilterConfig initialFilterConfig, FilterBean filterBean) {
        Context contextInvoke;
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyInitialFilterConfig applied anchorFilterID=");
        sbLIZ.append(initialFilterConfig.getFilterId());
        sbLIZ.append(", filterID=");
        sbLIZ.append(filterBean.getId());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1453430nvR interfaceC1453430nvRW2 = w2();
        Function0<Context> function0 = this.LLILLJJLI;
        if (function0 != null) {
            contextInvoke = function0.invoke();
        } else {
            contextInvoke = null;
        }
        interfaceC1453430nvRW2.DA2(filterBean, false, true, contextInvoke, true, false, true, true);
        InterfaceC1465710oFF interfaceC1465710oFFG2 = G2();
        if (interfaceC1465710oFFG2 != null) {
            C1465720oFG.LIZ(interfaceC1465710oFFG2, true, filterBean, false, 12);
        }
    }
}
