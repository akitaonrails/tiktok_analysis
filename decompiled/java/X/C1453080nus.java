package X;

import android.content.Context;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

/* JADX INFO: renamed from: X.0nus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453080nus implements InterfaceC1644080ssw, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final String LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public String LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453080nus.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1453080nus.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1453080nus.class, "autoSaveDraftApi", "getAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final InterfaceC1455860nzM LIZ() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public final VideoPublishEditModel LIZIZ() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1453080nus(C1DRG c1drg, String str) {
        this.LL = c1drg;
        this.LLILLJJLI = str;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC559500Lwy.class, null);
    }

    @Override // X.InterfaceC1644080ssw
    public final void Ch2(float f, boolean z) {
        FilterBean filterBean;
        InterfaceC358220E2q value;
        InterfaceC1453220nv6 value2;
        InterfaceC559500Lwy interfaceC559500Lwy;
        C1453000nuk value3 = LIZ().gq1().getValue();
        if (value3 != null && (filterBean = value3.LIZIZ) != null && (value = LIZ().xq1().getValue()) != null && (value2 = LIZ().zj2().getValue()) != null) {
            LIZIZ().setSelectedFilterIntensity(value.LIZ(filterBean, value2) / 100);
            if (z && (interfaceC559500Lwy = (InterfaceC559500Lwy) this.LLILZIL.getValue(this, LLIZ[2])) != null) {
                interfaceC559500Lwy.Qk(false);
            }
        }
    }

    @Override // X.InterfaceC1644080ssw
    public final void Zk2(boolean z, FilterBean filterBean) {
        boolean z2 = !z;
        C1456140nzo.LIZIZ(LIZ(), z2, false, false, false, 12);
        InterfaceC19530111b1 interfaceC19530111b1 = (InterfaceC19530111b1) ((C0ETY) this.LL.LJII(C0ETY.class, null)).MY1(InterfaceC19530111b1.class);
        if (interfaceC19530111b1 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1, false, false, z2, null, false, 27);
        }
    }

    @Override // X.InterfaceC1644080ssw
    public final void gi2(String str, String str2) {
        this.LLILZLL = str;
        C1402610mbT.LJJIII(LIZIZ(), str, str2);
    }

    @Override // X.InterfaceC1644080ssw
    public final void BG0(C1453000nuk c1453000nuk, boolean z, Context context) {
        InterfaceC1453220nv6 value;
        String name;
        FilterBean filterBean = null;
        if (c1453000nuk != null) {
            filterBean = c1453000nuk.LIZIZ;
        }
        String str = "";
        if (filterBean != null) {
            if (LIZ().xq1().getValue() == null || (value = LIZ().zj2().getValue()) == null) {
                return;
            }
            InterfaceC1640320sms interfaceC1640320smsLJJI = C0CHQ.LIZ().LJJIJ(this.LLILLJJLI).LIZIZ().LJJI();
            String str2 = this.LLILZLL;
            if (str2 == null) {
                EffectCategoryResponse effectCategoryResponseLIZ = C1453230nv7.LIZ(filterBean, interfaceC1640320smsLJJI);
                if (effectCategoryResponseLIZ != null && (name = effectCategoryResponseLIZ.getName()) != null) {
                    str = name;
                }
            } else {
                str = str2;
            }
            LIZIZ().setSelectedId(C1453230nv7.LJI(filterBean, interfaceC1640320smsLJJI));
            String id = filterBean.getId();
            id.toString();
            LIZIZ().setSelectedFilterId(id);
            LIZIZ().setSelectedFilterLabel(filterBean.getEnName());
            String resId = filterBean.getResId();
            LIZIZ().setSelectedFilterResId(resId);
            LIZIZ().setSelectedFilterIntensity(r8.LIZ(filterBean, value) / 100);
            LIZIZ().setSelectedFilterCategoryKey(filterBean.getCategoryKey());
            C574480Mg2.LIZIZ(new C1178704jJ(id));
            C574480Mg2.LIZIZ(new C1179004jM(id));
            C574480Mg2.LIZIZ(new C1259004wG(resId));
            InterfaceC376620Epg applicationService = C1403010mc7.LIZ.getApplicationService();
            String contentType = LIZIZ().getAvetParameter().getContentType();
            String enName = filterBean.getEnName();
            applicationService.getClass();
            C1453120nuw c1453120nuw = new C1453120nuw();
            c1453120nuw.LJIILLIIL = contentType;
            c1453120nuw.LJIIZILJ = "mid_page";
            c1453120nuw.LJIJ = enName;
            c1453120nuw.LJIILJJIL();
            if (context != null) {
                if (z) {
                    VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
                    C1402610mbT.LJJJJ(videoPublishEditModelLIZIZ, "slide", filterBean.getEnName(), filterBean.getId(), str, videoPublishEditModelLIZIZ.getSelectedFilterIntensity(), filterBean.getCategoryKey());
                } else {
                    VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
                    C1402610mbT.LJJJJ(videoPublishEditModelLIZIZ2, "click", filterBean.getEnName(), filterBean.getId(), str, videoPublishEditModelLIZIZ2.getSelectedFilterIntensity(), filterBean.getCategoryKey());
                }
            }
        } else {
            LIZIZ().setSelectedId(0);
            LIZIZ().setSelectedFilterId("");
            LIZIZ().setSelectedFilterLabel("");
            LIZIZ().setSelectedFilterResId("");
            LIZIZ().setSelectedFilterCategoryKey("");
        }
        InterfaceC559500Lwy interfaceC559500Lwy = (InterfaceC559500Lwy) this.LLILZIL.getValue(this, LLIZ[2]);
        if (interfaceC559500Lwy != null) {
            interfaceC559500Lwy.Qk(false);
        }
    }
}
