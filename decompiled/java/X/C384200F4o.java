package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0F4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384200F4o {
    public static final C384200F4o LIZ = new C384200F4o();

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        if (!C0CHQ.LIZ().getAccountService().isLogin() || C1428520nHG.LJJL(videoPublishEditModel) || videoPublishEditModel.isDuet() || videoPublishEditModel.getStitchParams() != null || videoPublishEditModel.getTimeEffect() != null || videoPublishEditModel.getPreviewInfo().getVideoList().size() > 1 || videoPublishEditModel.isCurrentAutoCutMode() || ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
            return false;
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (renderProxy = nLETrackSlot.getRenderProxy()) != null && (mainSegment = renderProxy.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && resourceFile.length() > 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r4, java.lang.Integer r5) {
        /*
            if (r5 == 0) goto L3c
            int r1 = r5.intValue()
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r1 == r0) goto L38
            r0 = 60000(0xea60, float:8.4078E-41)
            if (r1 == r0) goto L34
            r0 = 70000(0x11170, float:9.8091E-41)
            if (r1 != r0) goto L3c
            r3 = 2131858285(0x7f11936d, float:1.9350354E38)
        L18:
            android.app.Activity r2 = X.C1388190mED.LIZ(r4)
            if (r2 == 0) goto L33
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r0 = r0.getString(r3)
            r1.message(r0)
            r0 = 3066(0xbfa, float:4.296E-42)
            X.C1390380mHk.LIZ(r2, r0, r1)
        L33:
            return
        L34:
            r3 = 2131858293(0x7f119375, float:1.935037E38)
            goto L18
        L38:
            r3 = 2131858292(0x7f119374, float:1.9350368E38)
            goto L18
        L3c:
            r3 = 2131858288(0x7f119370, float:1.935036E38)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384200F4o.LIZIZ(android.content.Context, java.lang.Integer):void");
    }
}
