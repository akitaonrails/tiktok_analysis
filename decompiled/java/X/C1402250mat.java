package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import java.util.List;

/* JADX INFO: renamed from: X.0mat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402250mat implements InterfaceC300801Eo {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1402250mat c1402250mat, InterfaceC2329309At interfaceC2329309At) {
        boolean zForceWatermarkWhenDownloadAIGC = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().forceWatermarkWhenDownloadAIGC((Aweme) c1402250mat.l1);
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        Aweme aweme = (Aweme) c1402250mat.l1;
        c1376010luZ.getClass();
        if (C1376010luZ.LJIIJ(aweme) && !zForceWatermarkWhenDownloadAIGC) {
            interfaceC2329309At.onSuccess(c1402250mat.s0);
            return;
        }
        C1376300lv2.LIZ.getClass();
        boolean z = false;
        C2354709Kn.LJFF((String) C1376300lv2.LJIIL.getValue(), false);
        final Aweme aweme2 = (Aweme) c1402250mat.l1;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        WaterMarkListener waterMarkListener = new WaterMarkListener() { // from class: X.0lv8
            @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
            public final /* synthetic */ void onCancel() {
                C1376370lv9.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
            public final void onStart() {
            }

            @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
            public final void onError(int i) {
                C1376300lv2.LIZ.getClass();
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIIIZZ);
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIJ);
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIIZ);
                C2354709Kn.LJIJJLI(C1376300lv2.LJII);
                c11kt.onSuccess("");
            }

            @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
            public final void onProgress(int i) {
                if (C1376300lv2.LIZIZ) {
                    return;
                }
                C1376300lv2 c1376300lv2 = C1376300lv2.LIZ;
                Aweme aweme3 = aweme2;
                c1376300lv2.getClass();
                C1376300lv2.LIZIZ((i / 2) + 50, aweme3);
            }

            @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
            public final void onSuccess(String str) {
                C1376300lv2.LIZ.getClass();
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIIIZZ);
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIJ);
                C2354709Kn.LJIJJLI(C1376300lv2.LJIIIZ);
                if (C1376300lv2.LIZIZ) {
                    C2354709Kn.LJIJJLI(C1376300lv2.LJII);
                    c11kt.onSuccess("");
                } else {
                    c11kt.onSuccess(str);
                }
            }
        };
        boolean zAddAiChatWatermarkWhenDownload = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().addAiChatWatermarkWhenDownload((Aweme) c1402250mat.l1, 0);
        WaterMarkBuilder waterMarkBuilder = new WaterMarkBuilder();
        String str = c1402250mat.s0;
        Aweme aweme3 = (Aweme) c1402250mat.l1;
        waterMarkBuilder.setInputPath(str);
        waterMarkBuilder.setOutPath(C1376300lv2.LJII);
        C19292410dm c19292410dmLJJJ = ShareDependServiceImpl.LJJJJI().LJJJ(aweme3.getAuthor());
        Video video = aweme3.getVideo();
        if (video.getWidth() == 0 || video.getHeight() == 0) {
            video.setWidth(576);
            video.setHeight(1024);
        }
        waterMarkBuilder.setWaterParams(c19292410dmLJJJ, video);
        waterMarkBuilder.setSaveType(-1);
        waterMarkBuilder.setAddInterMark(true);
        waterMarkBuilder.setAiChatWatermark(zAddAiChatWatermarkWhenDownload);
        waterMarkBuilder.setAddEndMark(false);
        waterMarkBuilder.setListener(waterMarkListener);
        waterMarkBuilder.setIsRichEndMode(false);
        waterMarkBuilder.aigcLabelType = aweme3.aigcInfo.getAIGCLabelType();
        waterMarkBuilder.containC2PA = AwemeExtKt.containC2PA(aweme3);
        if (zForceWatermarkWhenDownloadAIGC && C1376010luZ.LJIIJ(aweme3)) {
            z = true;
        }
        waterMarkBuilder.forceAIGCWatermark = z;
        String string = "";
        if (AudioWatermarkServiceImpl.LJ().enbaleAudioWatermarkTTSVC()) {
            waterMarkBuilder.setTTSVoiceCreatorDesc("");
        } else {
            if (((Aweme) c1402250mat.l1).needTTSWatermarkWhenDownload()) {
                string = C1376300lv2.LIZ().getString(2131857243);
            }
            waterMarkBuilder.setTTSVoiceCreatorDesc(string);
        }
        waterMarkBuilder.setVcCreatorIdList(((Aweme) c1402250mat.l1).getVcVoiceIDs());
        waterMarkBuilder.setTtsCreatorIdList(((Aweme) c1402250mat.l1).getTtsVoiceIDs());
        ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).waterMark(waterMarkBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(X.C1402250mat r15, X.InterfaceC2329309At r16) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402250mat.subscribe$1(X.0mat, X.09At):void");
    }

    public C1402250mat(Aweme aweme, String str, int i) {
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    public C1402250mat(AbstractC1368180lhw abstractC1368180lhw, String str, List list, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = list;
    }
}
