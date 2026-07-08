package X;

import com.bytedance.ies.nle.editor_jni.NLECompileLevel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageLivePhotoModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431100nLQ extends AbstractC1431200nLa {
    public final Function0<Unit> LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public final Object LLJI;
    public InterfaceC1431130nLT LLJIJIL;
    public VideoPublishEditModel LLJILJIL;
    public InterfaceC1431080nLO LLJILJILJ;
    public PublishModel LLJILLL;
    public InterfaceC1434170nQN LLJJ;
    public volatile boolean LLJJI;
    public volatile boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1431990nMr LLJJIJIL;
    public final C1431120nLS LLJJJ;

    public final void LJIILJJIL() {
        List<SingleImageData> imageList;
        VideoPublishEditModel videoPublishEditModel = this.LLJILJIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return;
        }
        try {
            C1444220nga.LIZIZ(imageList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final SynthetiseResult LJIIZILJ() {
        return (SynthetiseResult) this.LLJJIJIIJIL.getValue();
    }

    public final boolean LJIJI() {
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        IAIPortraitFeatureService iAIPortraitFeatureService = (IAIPortraitFeatureService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitFeatureService.class, false, false, false, 14, null);
        if (iAIPortraitFeatureService == null || (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureService.LJFF()) == null) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = this.LLJILJIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        return iAIPortraitCreationServiceLJFF.LIZLLL(videoPublishEditModel.creativeModel);
    }

    public final boolean LJJIFFI() {
        PublishModel publishModel = this.LLJILLL;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.isEditSave) {
            return !(this.LLJILJIL != null ? r0 : null).creativeModel.editSaveLocalModel.compileWatermark;
        }
        if (C295850Bih.LIZ()) {
            VideoPublishEditModel videoPublishEditModel = this.LLJILJIL;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (C1428470nHB.LLI(videoPublishEditModel)) {
                return true;
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLJILJIL;
        return (videoPublishEditModel2 != null ? videoPublishEditModel2 : null).isSaveLocalWithoutWaterMark();
    }

    public final void LJJI() {
        C1431990nMr c1431990nMr;
        if (!C0BXJ.LIZ() || (c1431990nMr = this.LLJJIJIL) == null) {
            return;
        }
        c1431990nMr.LIZ.remove(this.LLJJJ);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0nLS] */
    public C1431100nLQ(Function0<Unit> function0) {
        super(null);
        this.LLIZ = function0;
        this.LLJI = new Object();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(442));
        this.LLJJJ = new InterfaceC1432000nMs() { // from class: X.0nLS
            @Override // X.InterfaceC1432000nMs
            public final String LIZIZ() {
                Object c098200Yq;
                InterfaceC1431130nLT interfaceC1431130nLT = this.LIZ.LLJIJIL;
                if (interfaceC1431130nLT == null) {
                    return "";
                }
                try {
                    c098200Yq = interfaceC1431130nLT.getCompileStuckResult();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
            }

            @Override // X.InterfaceC1432000nMs
            public final EnumC1434770nRL LIZ() {
                return EnumC1434770nRL.COMPILE;
            }
        };
    }

    public static String LJIILLIIL(SingleImageData singleImageData) {
        ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
        if (synthesisData != null) {
            Integer compileLevel = synthesisData.getCompileLevel();
            int iSwigValue = NLECompileLevel.NLECompileLevelPicUploadDirectly.swigValue();
            if (compileLevel != null && compileLevel.intValue() == iSwigValue) {
                return singleImageData.getSrcImageInfo().getRemoteUri();
            }
            return null;
        }
        return null;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZLLL(Object obj) {
        super.LIZLLL(obj);
        if (!this.LLIZLLLIL && !this.LLJ) {
            InterfaceC1431080nLO interfaceC1431080nLO = this.LLJILJILJ;
            InterfaceC1431080nLO interfaceC1431080nLO2 = null;
            if (interfaceC1431080nLO == null) {
                interfaceC1431080nLO = null;
            }
            interfaceC1431080nLO.LIZ(new C1404990mfJ("ImageGroupWaveCompileTask", "CompileTask pause"), EnumC2251001D8o.OUTER);
            InterfaceC1431130nLT interfaceC1431130nLT = this.LLJIJIL;
            if (interfaceC1431130nLT == null) {
                interfaceC1431130nLT = null;
            }
            interfaceC1431130nLT.pause();
            synchronized (this.LLJI) {
                try {
                    this.LLIZLLLIL = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            InterfaceC1431080nLO interfaceC1431080nLO3 = this.LLJILJILJ;
            if (interfaceC1431080nLO3 != null) {
                interfaceC1431080nLO2 = interfaceC1431080nLO3;
            }
            interfaceC1431080nLO2.LIZ(C1431170nLX.LIZ, EnumC2251001D8o.OUTER);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final void LJ(Object obj) {
        super.LJ(obj);
        if (this.LLIZLLLIL) {
            InterfaceC1431080nLO interfaceC1431080nLO = this.LLJILJILJ;
            InterfaceC1431080nLO interfaceC1431080nLO2 = null;
            if (interfaceC1431080nLO == null) {
                interfaceC1431080nLO = null;
            }
            interfaceC1431080nLO.LIZ(new C1404990mfJ("ImageGroupWaveCompileTask", "CompileTask resume"), EnumC2251001D8o.OUTER);
            InterfaceC1431130nLT interfaceC1431130nLT = this.LLJIJIL;
            if (interfaceC1431130nLT == null) {
                interfaceC1431130nLT = null;
            }
            interfaceC1431130nLT.resume();
            synchronized (this.LLJI) {
                try {
                    this.LLJI.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            InterfaceC1431080nLO interfaceC1431080nLO3 = this.LLJILJILJ;
            if (interfaceC1431080nLO3 != null) {
                interfaceC1431080nLO2 = interfaceC1431080nLO3;
            }
            interfaceC1431080nLO2.LIZ(C1431160nLW.LIZ, EnumC2251001D8o.OUTER);
            this.LLIZLLLIL = false;
        }
    }

    public static void LJJ(PublishImageModel publishImageModel, List list) {
        String str;
        String str2;
        PublishImageLivePhotoModel publishImageLivePhotoModel = publishImageModel.publishImageLivePhotoModel;
        if (publishImageLivePhotoModel != null && (str = publishImageLivePhotoModel.waterMarkPath) != null && C1428270nGr.LIZ(str)) {
            PublishImageLivePhotoModel publishImageLivePhotoModel2 = publishImageModel.publishImageLivePhotoModel;
            if (publishImageLivePhotoModel2 == null || (str2 = publishImageLivePhotoModel2.waterMarkPath) == null) {
                str2 = "";
            }
            ((ArrayList) list).add(str2);
        }
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        LJJI();
        InterfaceC1431130nLT interfaceC1431130nLT = this.LLJIJIL;
        if (interfaceC1431130nLT == null) {
            interfaceC1431130nLT = null;
        }
        interfaceC1431130nLT.cancel();
        this.LLJJI = true;
        SynthetiseResult synthetiseResultM316clone = LJIIZILJ().m316clone();
        synthetiseResultM316clone.ret = -66666;
        C1433680nPa c1433680nPa = new C1433680nPa();
        c1433680nPa.LIZ = synthetiseResultM316clone;
        c1433680nPa.LIZJ = "Compiler canceled";
        C1443030nef.LJII().getClass();
        LJIJJ(c1433680nPa.LIZ(), false, null);
        ((C1D8A) interfaceC1434410nQl).LIZ(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0  */
    /* JADX WARN: Type inference failed for: r2v90, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel>] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.ArrayList] */
    @Override // X.AbstractC1434490nQt, X.C1D8B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C1404610meh r30, X.C1D85 r31) {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431100nLQ.LJFF(X.0meh, X.1D85):void");
    }

    public final void LJIJ(List<PublishImageModel> list, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1431010nLH(this, z, list, null), 3);
    }

    public final void LJIL(final SynthetiseResult synthetiseResult, final boolean z) {
        InterfaceC1431080nLO interfaceC1431080nLO = this.LLJILJILJ;
        if (interfaceC1431080nLO != null && interfaceC1431080nLO.LIZLLL() != C291160Bb8.LIZ()) {
            C1431140nLU.LIZ();
            Integer num = Integer.MAX_VALUE;
            if (num.intValue() != Integer.MAX_VALUE) {
                int iIntValue = num.intValue();
                SynthetiseResult synthetiseResult2 = new SynthetiseResult();
                synthetiseResult2.ret = iIntValue;
                C1433680nPa c1433680nPa = new C1433680nPa();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mock compile failed: ");
                sbLIZ.append(iIntValue);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ != null) {
                    c1433680nPa.LIZJ = strLIZIZ;
                }
                c1433680nPa.LIZ = synthetiseResult2;
                LJIJJ(c1433680nPa.LIZ(), true, null);
                return;
            }
        }
        C15O7.LIZJ(new Callable() { // from class: X.0nLK
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                C1C7U.LIZ("ImageGroupWaveCompileTask@9fd4.onTaskSuccess$1");
                Function0<Unit> function0 = this.LL.LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                C23250099c.LJ(C23271099x.INSTANCE, new C1407930mk3(this.LL, null));
                InterfaceC1431080nLO interfaceC1431080nLO2 = this.LL.LLJILJILJ;
                (interfaceC1431080nLO2 != null ? interfaceC1431080nLO2 : null).LIZJ(synthetiseResult, z);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ImageGroupWaveCompileTask@9fd4.onTaskSuccess$1");
                return unit;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0217 A[PHI: r2
      0x0217: PHI (r2v56 int) = (r2v31 int), (r2v30 int) binds: [B:79:0x0181, B:77:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r32, boolean r33, java.util.List r34) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431100nLQ.LJIILL(java.lang.String, boolean, java.util.List):void");
    }

    public final void LJIJJ(C1433670nPZ c1433670nPZ, boolean z, Function0<Unit> function0) {
        boolean z2;
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            if (function0 != null) {
                function0.invoke();
            }
            Integer numValueOf = Integer.valueOf(c1433670nPZ.getCode());
            InterfaceC1431080nLO interfaceC1431080nLO = this.LLJILJILJ;
            if (interfaceC1431080nLO != null && !this.LLJJIJI && interfaceC1431080nLO.LIZLLL() < C291160Bb8.LIZ() && C0C2U.LIZ(numValueOf)) {
                z2 = true;
            } else {
                z2 = false;
            }
            InterfaceC1431080nLO interfaceC1431080nLO2 = null;
            if (z2 && z) {
                this.LLJJIJI = true;
                InterfaceC1431080nLO interfaceC1431080nLO3 = this.LLJILJILJ;
                if (interfaceC1431080nLO3 == null) {
                    interfaceC1431080nLO3 = null;
                }
                interfaceC1431080nLO3.LIZIZ(null);
                return;
            }
            InterfaceC1431080nLO interfaceC1431080nLO4 = this.LLJILJILJ;
            if (interfaceC1431080nLO4 != null) {
                interfaceC1431080nLO2 = interfaceC1431080nLO4;
            }
            interfaceC1431080nLO2.LJ(c1433670nPZ.getCode(), c1433670nPZ);
        }
    }
}
