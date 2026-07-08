package X;

import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.ModerationRequestModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.ModerationsRequest;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.PushModerationModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.VideoModerationResponseItem;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.VideoModerationResponseModels;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation.WaterMarkModerationModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XRY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRY extends C09AY implements Function1<Long, Unit> {
    public C0XRY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        l.longValue();
        C1436710nUT c1436710nUT = C1436710nUT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loop called, frameUriRecords size = ");
        Map<String, C1436790nUb> map = C1436710nUT.LIZIZ;
        sbLIZ.append(map.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1436710nUT.getClass();
        C1436710nUT.LJ(strLIZIZ);
        if (!map.isEmpty()) {
            C0XRW c0xrw = C0XRW.LIZ;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                entry.getValue();
                arrayList.add(new ModerationRequestModel(EnumC0305008p.WATERMARK_FRAME.ordinal(), new WaterMarkModerationModel(str)));
            }
            ModerationsRequest moderationsRequest = new ModerationsRequest(arrayList);
            c0xrw.getClass();
            C0XRW.LIZIZ.LIZ(moderationsRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0nUU
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int i;
                    C1C7U.LIZ("VideoModerationManager@ad71.doModerationLoopRequest$1$1");
                    C1436710nUT.LIZ.getClass();
                    C1436710nUT.LIZLLL();
                    for (VideoModerationResponseItem videoModerationResponseItem : ((VideoModerationResponseModels) obj).results) {
                        int i2 = videoModerationResponseItem.status;
                        if (i2 == 2 || i2 == 3) {
                            C1436710nUT c1436710nUT2 = C1436710nUT.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("get API result, target vframeUri is ");
                            sbLIZ2.append(videoModerationResponseItem.waterMarkModerationModel.vFrameUri);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c1436710nUT2.getClass();
                            C1436710nUT.LJ(strLIZIZ2);
                            Map<String, C1436790nUb> map2 = C1436710nUT.LIZIZ;
                            C1436790nUb c1436790nUb = (C1436790nUb) ((LinkedHashMap) map2).get(videoModerationResponseItem.waterMarkModerationModel.vFrameUri);
                            boolean z = false;
                            if (c1436790nUb != null) {
                                C1436730nUV c1436730nUV = C1436730nUV.LIZ;
                                if (videoModerationResponseItem.status == 2) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i3 = C1436710nUT.LIZLLL;
                                c1436730nUV.getClass();
                                C1436730nUV.LIZ(c1436790nUb, true, i, i3);
                            }
                            Map<String, InterfaceC1436810nUd> map3 = C1436710nUT.LJFF;
                            InterfaceC1436810nUd interfaceC1436810nUd = (InterfaceC1436810nUd) ((LinkedHashMap) map3).get(videoModerationResponseItem.waterMarkModerationModel.vFrameUri);
                            if (interfaceC1436810nUd != null) {
                                if (videoModerationResponseItem.status == 2) {
                                    z = true;
                                }
                                interfaceC1436810nUd.LIZIZ(C08JS.LIZLLL(new PushModerationModel(videoModerationResponseItem.waterMarkModerationModel.vFrameUri, z, videoModerationResponseItem.blockDownload, videoModerationResponseItem.blockWatermark)));
                            } else {
                                if (videoModerationResponseItem.status == 2) {
                                    z = true;
                                }
                                C1436710nUT.LIZJ(C08JS.LIZLLL(new PushModerationModel(videoModerationResponseItem.waterMarkModerationModel.vFrameUri, z, videoModerationResponseItem.blockDownload, videoModerationResponseItem.blockWatermark)));
                            }
                            map2.remove(videoModerationResponseItem.waterMarkModerationModel.vFrameUri);
                            map3.remove(videoModerationResponseItem.waterMarkModerationModel.vFrameUri);
                        }
                    }
                    C1436710nUT.LIZ.getClass();
                    C1436710nUT.LIZIZ();
                    C1436710nUT.LIZ();
                    C1C7U.LIZIZ("VideoModerationManager@ad71.doModerationLoopRequest$1$1");
                }
            }, new C09JN() { // from class: X.0XRZ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VideoModerationManager@ad71.doModerationLoopRequest$1$2");
                    C1436710nUT.LIZ.getClass();
                    C1436710nUT.LJ("queryModerationResult api error, request times + 1");
                    C1436710nUT.LIZLLL();
                    C1436710nUT.LIZIZ();
                    C1436710nUT.LIZ();
                    C1C7U.LIZIZ("VideoModerationManager@ad71.doModerationLoopRequest$1$2");
                }
            });
        } else {
            C1436710nUT.LIZ();
        }
        return Unit.LIZ;
    }
}
