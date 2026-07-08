package X;

import Y.ACallableS426S0100000_21;
import android.content.Context;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0mVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398780mVI extends AbstractC1382680m5K {
    public final Aweme LIZ;
    public final Context LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Pair<Boolean, List<String>> LJII;
    public WaterMarkBuilder LJIIIIZZ;
    public InterfaceC1398810mVL LJIIIZ;
    public final C1398800mVK LJIIJ = new C1398800mVK();
    public final C1398790mVJ LJIIJJI = new WaterMarkListener() { // from class: X.0mVJ
        @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
        public final void onStart() {
        }

        @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
        public final void onCancel() {
            InterfaceC1398810mVL interfaceC1398810mVL = this.LIZ.LJIIIZ;
            if (interfaceC1398810mVL != null) {
                interfaceC1398810mVL.onCancel();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
        public final void onError(int i) {
            InterfaceC1398810mVL interfaceC1398810mVL = this.LIZ.LJIIIZ;
            if (interfaceC1398810mVL != null) {
                interfaceC1398810mVL.onFailed(i);
            }
            C1376270luz.LIZ.getClass();
            C1376270luz.LIZLLL = false;
        }

        @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
        public final void onProgress(int i) {
            InterfaceC1398810mVL interfaceC1398810mVL = this.LIZ.LJIIIZ;
            if (interfaceC1398810mVL != null) {
                interfaceC1398810mVL.onProgress(i);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
        public final void onSuccess(String str) {
            InterfaceC1398810mVL interfaceC1398810mVL = this.LIZ.LJIIIZ;
            if (interfaceC1398810mVL != null) {
                interfaceC1398810mVL.onSuccess();
            }
            C1376270luz.LIZ.getClass();
            C1376270luz.LIZLLL = false;
        }
    };

    @Override // X.AbstractC1382680m5K
    public final void LIZ() {
        IWaterMarkService iWaterMarkService = (IWaterMarkService) this.LJIIJ.get();
        if (iWaterMarkService != null) {
            iWaterMarkService.cancelWaterMark();
        }
    }

    @Override // X.AbstractC1382680m5K
    public final void LIZJ() {
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            int i = this.LIZLLL ? 2 : -1;
            WaterMarkBuilder waterMarkBuilder = new WaterMarkBuilder();
            ShareDependService.LIZ.getClass();
            waterMarkBuilder.setWaterParams(ShareDependServiceImpl.LJJJJI().LJJJ(aweme.getAuthor()), aweme.getVideo());
            waterMarkBuilder.setAddInterMark(this.LIZJ);
            waterMarkBuilder.setIsInstagram(this.LIZLLL);
            waterMarkBuilder.setSaveType(i);
            waterMarkBuilder.setForce16To9Ratio(false);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
            waterMarkBuilder.setActivityWaterMark(iUnKnownOwnershipBusinessOuterService != null ? iUnKnownOwnershipBusinessOuterService.LJ() : null);
            waterMarkBuilder.setIsRichEndMode(true);
            waterMarkBuilder.setUrl(waterMarkBuilder.mUrl);
            String string = "";
            if (AudioWatermarkServiceImpl.LJ().enbaleAudioWatermarkTTSVC()) {
                waterMarkBuilder.setTTSVoiceCreatorDesc("");
            } else {
                if (aweme.needTTSWatermarkWhenDownload()) {
                    Context context = this.LIZIZ;
                    string = context != null ? context.getString(2131857243) : null;
                }
                waterMarkBuilder.setTTSVoiceCreatorDesc(string);
            }
            waterMarkBuilder.setTtsCreatorIdList(aweme.getTtsVoiceIDs());
            waterMarkBuilder.setVcCreatorIdList(aweme.getVcVoiceIDs());
            waterMarkBuilder.setListener(this.LJIIJJI);
            waterMarkBuilder.aigcLabelType = aweme.aigcInfo.getAIGCLabelType();
            waterMarkBuilder.containC2PA = AwemeExtKt.containC2PA(aweme);
            waterMarkBuilder.forceAIGCWatermark = this.LJ;
            waterMarkBuilder.isAddAiLiveWatermark = this.LJFF;
            waterMarkBuilder.isAddAiChatWatermark = this.LJI;
            waterMarkBuilder.aiBusinessWatermarkKeys = this.LJII;
            this.LJIIIIZZ = waterMarkBuilder;
        }
        C15O7.LIZIZ(new ACallableS426S0100000_21(this, 12), C823050WQl.LIZLLL(), null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0mVJ] */
    public C1398780mVI(AbstractC21169117sn abstractC21169117sn) {
        this.LJII = new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
        AbstractC1382550m57 abstractC1382550m57 = (AbstractC1382550m57) abstractC21169117sn;
        this.LIZ = abstractC1382550m57.LJFF;
        this.LIZIZ = abstractC1382550m57.LIZ;
        this.LIZJ = abstractC1382550m57.LJIIIIZZ();
        this.LIZLLL = abstractC1382550m57.LJIIIZ();
        this.LJ = abstractC1382550m57.LJFF();
        this.LJFF = abstractC1382550m57.LJII();
        this.LJI = abstractC1382550m57.LJI();
        this.LJII = abstractC1382550m57.LIZJ();
    }

    @Override // X.AbstractC1382680m5K
    public final void LIZLLL(C21169917sv c21169917sv) {
        this.LJIIIZ = c21169917sv;
    }

    @Override // X.AbstractC1382680m5K
    public final void LIZIZ(String str, String str2) {
        IWaterMarkService iWaterMarkService;
        try {
            C1376270luz.LIZ.getClass();
            C1376270luz.LIZLLL = true;
            if (str != null && str2 != null) {
                C2354809Ko.LIZJ(str, false);
                if (this.LIZLLL) {
                    C1380880m2Q.LIZ();
                }
                C1618230sDF.LIZIZ.LIZ.getClass();
                WaterMarkBuilder waterMarkBuilder = this.LJIIIIZZ;
                if (waterMarkBuilder != null && (iWaterMarkService = (IWaterMarkService) this.LJIIJ.get()) != null) {
                    iWaterMarkService.waterMark(waterMarkBuilder);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1398810mVL interfaceC1398810mVL = this.LJIIIZ;
            if (interfaceC1398810mVL != null) {
                interfaceC1398810mVL.onFailed(-1);
            }
        }
    }

    @Override // X.AbstractC1382680m5K
    public final void LJ(long j, long j2, boolean z, String str, String str2) {
        WaterMarkBuilder waterMarkBuilder = this.LJIIIIZZ;
        if (waterMarkBuilder != null) {
            waterMarkBuilder.setInputPath(str);
            waterMarkBuilder.setOutPath(str2);
            waterMarkBuilder.setDownloadDuration(j);
            waterMarkBuilder.setDownloadRate(j2);
            waterMarkBuilder.setForceInputResolution(z);
        }
    }
}
