package Y;

import X.AbstractC1387200mCc;
import X.C1185670gxZ;
import X.C1202210hOF;
import X.C1440005kM;
import X.C1445940njM;
import X.C1558520qew;
import X.InterfaceC1452170ntP;
import X.InterfaceC1711206n0;
import X.InterfaceC665370Q7z;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import irm.AkS90S0100000_22;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS204S0300000_22 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS204S0300000_22 aObjectS204S0300000_22) {
        AkS90S0100000_22 akS90S0100000_22 = (AkS90S0100000_22) aObjectS204S0300000_22.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS204S0300000_22.l1;
        ((VEChooseVideoCoverFragment) akS90S0100000_22.l0).ZR((InterfaceC1452170ntP) aObjectS204S0300000_22.l2, videoPublishEditModel);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(Y.AObjectS204S0300000_22 r8) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS204S0300000_22.invoke$1(Y.AObjectS204S0300000_22):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(Y.AObjectS204S0300000_22 r5) {
        /*
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            java.lang.Object r1 = r5.l1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r5 = r5.l2
            X.0nlL r5 = (X.InterfaceC1447170nlL) r5
            com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel r0 = r0.getCoverPublishModel()
            com.ss.android.ugc.aweme.editSticker.model.EffectTextModel r0 = r0.getEffectTextModel()
            android.graphics.Bitmap r0 = r0.directMergeCoverText(r1)
            if (r0 != 0) goto L61
            if (r1 == 0) goto L1e
        L1c:
            X.C1444060ngK.LIZ = r1
        L1e:
            if (r5 == 0) goto L5e
            X.0nlK r5 = (X.C1447160nlK) r5
            android.graphics.Bitmap r0 = X.C1444060ngK.LIZ
            if (r0 == 0) goto L5e
            irm.AkS90S0100000_22 r0 = r5.LIZLLL
            java.lang.Object r0 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = (com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r4 = r0.LLJILJIL
            X.19EG r3 = r0.requireActivity()
            java.lang.String r2 = r5.LIZ
            java.lang.String[] r1 = r5.LIZIZ
            r0 = 12
            r4.goCoverPreviewProfileActivity(r3, r2, r1, r0)
            irm.AkS90S0100000_22 r0 = r5.LIZLLL
            java.lang.Object r1 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r1 = (com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment) r1
            r0 = 1
            r1.LLLIIII = r0
            X.0ngD r4 = X.C1443990ngD.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.LIZJ
            boolean r2 = r1.PR()
            irm.AkS90S0100000_22 r0 = r5.LIZLLL
            java.lang.Object r0 = r0.l0
            com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment r0 = (com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment) r0
            boolean r1 = r0.SR()
            r4.getClass()
            java.lang.String r0 = "preview"
            X.C1443990ngD.LJII(r3, r0, r2, r1)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L61:
            r1 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS204S0300000_22.invoke$2(Y.AObjectS204S0300000_22):java.lang.Object");
    }

    public static final Object invoke$3(AObjectS204S0300000_22 aObjectS204S0300000_22) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        ToolsMainActivityAbility toolsMainActivityAbility;
        MainActivityCallback mainActivityCallback = (MainActivityCallback) aObjectS204S0300000_22.l0;
        AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) aObjectS204S0300000_22.l1;
        Boolean bool = (Boolean) aObjectS204S0300000_22.l2;
        mainActivityCallback.getClass();
        C1445940njM c1445940njM = new C1445940njM(mainActivityCallback);
        mainActivityCallback.LL = c1445940njM;
        if (((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJII()) {
            PublishModel publishModel = mainActivityCallback.LLILZ;
            if (publishModel.publishPermission != 1) {
                try {
                    PoiData poiData = PublishExtensionModel.fromContext(publishModel.editModel).poiData;
                    if (poiData != null) {
                        C1440005kM.LIZIZ(new C1202210hOF(poiData, mainActivityCallback.LLILZ.shootWay));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if ((abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) && (interfaceC665370Q7zLIZ = C1185670gxZ.LIZ(abstractC1387200mCc)) != null && (toolsMainActivityAbility = (ToolsMainActivityAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ToolsMainActivityAbility.class, null)) != null) {
            c1445940njM.getArgs();
            toolsMainActivityAbility.OS1(c1445940njM, mainActivityCallback.LLILZ, bool.booleanValue());
        }
        mainActivityCallback.LJI("VideoPublishBinder initialize finish.");
        return Unit.LIZ;
    }

    public AObjectS204S0300000_22(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public AObjectS204S0300000_22(MainActivityCallback mainActivityCallback, String str, AbstractC1387200mCc abstractC1387200mCc, Boolean bool, int i) {
        this.$t = i;
        this.l0 = mainActivityCallback;
        this.l1 = abstractC1387200mCc;
        this.l2 = bool;
    }
}
