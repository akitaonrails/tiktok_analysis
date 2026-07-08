package Y;

import X.C1133910fc5;
import X.C1136390fg5;
import X.C1136400fg6;
import X.C1136410fg7;
import X.C1136560fgM;
import X.C1137740fiG;
import X.C1138360fjG;
import X.C1138640fji;
import X.C1140890fnL;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.InterfaceC1136020ffU;
import X.InterfaceC1139780flY;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AwS59S0301000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS3S0401000_17 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public final void LIZ$0() {
        final AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(((C1136560fgM) this.l0).LJFF);
        if (assetsModelLIZLLL == null) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ = ((C1136560fgM) this.l0).LIZJ();
            AssetsModel assetsModel = (AssetsModel) this.l1;
            interfaceC1139780flYLIZJ.LIZIZ(false, assetsModel, assetsModel != null, true, false);
            ((C1136410fg7) this.l2).LJIILIIL(this.i4, (GiftMessage) this.l3, (C1136560fgM) this.l0, "prepareAssetsModel fail, downloadedAssetsModel is null");
            return;
        }
        ((C1136560fgM) this.l0).LIZJ().LIZIZ(true, assetsModelLIZLLL, ((AssetsModel) this.l1) != null, true, false);
        C1136560fgM c1136560fgM = (C1136560fgM) this.l0;
        if (c1136560fgM.LJJII == null) {
            c1136560fgM.LJJII = C1136390fg5.LIZ(assetsModelLIZLLL);
        }
        final C1136410fg7 c1136410fg7 = (C1136410fg7) this.l2;
        final int i = this.i4;
        final GiftMessage giftMessage = (GiftMessage) this.l3;
        final C1136560fgM c1136560fgM2 = (C1136560fgM) this.l0;
        if (c1136410fg7.LJIIIIZZ(i)) {
            c1136410fg7.LJIIL(i, giftMessage);
            return;
        }
        c1136560fgM2.LIZJ().LJIIIZ(C1138640fji.LJII(null, Long.valueOf(c1136560fgM2.LJFF)));
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadEffectFail()) {
            c1136560fgM2.LIZJ().LJIJ("mock download effect fail", false, true, false);
            c1136410fg7.LJIILIIL(i, giftMessage, c1136560fgM2, "mock download effect fail");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM2.LJFF));
        if (true ^ c1136560fgM2.LJ().isEmpty()) {
            linkedHashSet.addAll(c1136560fgM2.LJ());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Long> it2 = c1136560fgM2.LIZLLL().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), 2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadAssets start, assetIds=");
        sbLIZ.append(linkedHashSet);
        sbLIZ.append(", streamExtraEffectIds=");
        sbLIZ.append(c1136560fgM2.LJ());
        C20441214yg.LJIIIZ("StickerGiftEffectPreDownloader", C2188811AlT.LIZIZ(sbLIZ));
        C1140890fnL.LIZLLL();
        C1138360fjG.LIZ(linkedHashSet, linkedHashMap, C2097608Jq.LJ(), new C1137740fiG() { // from class: X.0fgR
            @Override // X.InterfaceC1138480fjS
            public final void LIZ() {
                LiveEffect.LynxGuide lynxGuide;
                String schema;
                c1136560fgM2.LIZJ().LJIJ("", true, true, false);
                C1136410fg7 c1136410fg72 = c1136410fg7;
                int i2 = i;
                GiftMessage giftMessage2 = giftMessage;
                C1136560fgM c1136560fgM3 = c1136560fgM2;
                AssetsModel assetsModel2 = assetsModelLIZLLL;
                c1136410fg72.getClass();
                LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM3.LJJII;
                if (stickerSDKExtra == null || (lynxGuide = stickerSDKExtra.lynxGuide) == null || (schema = lynxGuide.getSchema()) == null || schema.length() == 0 || C1084930eL5.LIZ(c1136560fgM3)) {
                    c1136410fg72.LJIIJ(i2, giftMessage2, c1136560fgM3);
                    return;
                }
                C1137480fhq c1137480fhq = C1137480fhq.LIZ;
                AwS59S0301000_17 awS59S0301000_17 = new AwS59S0301000_17(i2, c1136410fg72, giftMessage2, c1136560fgM3, 0);
                c1137480fhq.getClass();
                C1137480fhq.LIZIZ(schema, assetsModel2, null, null, c1136560fgM3, awS59S0301000_17);
            }

            @Override // X.InterfaceC1138480fjS
            public final void onFailed(Throwable th) {
                String message;
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                c1136560fgM2.LIZJ().LJIJ(message, false, true, false);
                C1136410fg7 c1136410fg72 = c1136410fg7;
                int i2 = i;
                GiftMessage giftMessage2 = giftMessage;
                C1136560fgM c1136560fgM3 = c1136560fgM2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadAssets onFailed by ");
                sbLIZ2.append(message);
                c1136410fg72.LJIILIIL(i2, giftMessage2, c1136560fgM3, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }, C2097608Jq.LJ());
    }

    public final void LIZ$1() {
        final AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(((C1136560fgM) this.l0).LJFF);
        if (assetsModelLIZLLL == null) {
            InterfaceC1139780flY interfaceC1139780flYLIZJ = ((C1136560fgM) this.l0).LIZJ();
            AssetsModel assetsModel = (AssetsModel) this.l1;
            interfaceC1139780flYLIZJ.LIZIZ(false, assetsModel, assetsModel != null, true, false);
            ((C1136400fg6) this.l2).LJIILLIIL(this.i4, (InterfaceC1136020ffU) this.l3, (C1136560fgM) this.l0, "prepareAssetsModel fail, downloadedAssetsModel is null");
            return;
        }
        ((C1136560fgM) this.l0).LIZJ().LIZIZ(true, assetsModelLIZLLL, ((AssetsModel) this.l1) != null, true, false);
        C1136560fgM c1136560fgM = (C1136560fgM) this.l0;
        if (c1136560fgM.LJJII == null) {
            c1136560fgM.LJJII = C1136390fg5.LIZ(assetsModelLIZLLL);
        }
        final C1136400fg6 c1136400fg6 = (C1136400fg6) this.l2;
        final int i = this.i4;
        final InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) this.l3;
        final C1136560fgM c1136560fgM2 = (C1136560fgM) this.l0;
        if (c1136400fg6.LJIIIZ(i)) {
            c1136400fg6.LJIILL(i, interfaceC1136020ffU);
            return;
        }
        c1136560fgM2.LIZJ().LJIIIZ(C1138640fji.LJII(null, Long.valueOf(c1136560fgM2.LJFF)));
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadEffectFail()) {
            c1136560fgM2.LIZJ().LJIJ("mock download effect fail", false, true, false);
            c1136400fg6.LJIILLIIL(i, interfaceC1136020ffU, c1136560fgM2, "mock download effect fail");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM2.LJFF));
        if (true ^ c1136560fgM2.LJ().isEmpty()) {
            linkedHashSet.addAll(c1136560fgM2.LJ());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Long> it2 = c1136560fgM2.LIZLLL().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), 2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadAssets start, assetIds=");
        sbLIZ.append(linkedHashSet);
        sbLIZ.append(", streamExtraEffectIds=");
        sbLIZ.append(c1136560fgM2.LJ());
        C1133910fc5.LIZIZ("StickerGiftEffectPreDownloader", C2188811AlT.LIZIZ(sbLIZ));
        C1140890fnL.LIZLLL();
        C1138360fjG.LIZ(linkedHashSet, linkedHashMap, C2097608Jq.LJ(), new C1137740fiG() { // from class: X.0fgS
            @Override // X.InterfaceC1138480fjS
            public final void LIZ() {
                LiveEffect.LynxGuide lynxGuide;
                String schema;
                c1136560fgM2.LIZJ().LJIJ("", true, true, false);
                C1136400fg6 c1136400fg62 = c1136400fg6;
                int i2 = i;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                C1136560fgM c1136560fgM3 = c1136560fgM2;
                AssetsModel assetsModel2 = assetsModelLIZLLL;
                c1136400fg62.getClass();
                LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM3.LJJII;
                if (stickerSDKExtra == null || (lynxGuide = stickerSDKExtra.lynxGuide) == null || (schema = lynxGuide.getSchema()) == null || schema.length() == 0 || C1084930eL5.LIZ(c1136560fgM3)) {
                    c1136400fg62.LJIIL(i2, interfaceC1136020ffU2, c1136560fgM3);
                    return;
                }
                C1137480fhq c1137480fhq = C1137480fhq.LIZ;
                AwS59S0301000_17 awS59S0301000_17 = new AwS59S0301000_17(i2, c1136400fg62, interfaceC1136020ffU2, c1136560fgM3, 2);
                c1137480fhq.getClass();
                C1137480fhq.LIZIZ(schema, assetsModel2, null, null, c1136560fgM3, awS59S0301000_17);
            }

            @Override // X.InterfaceC1138480fjS
            public final void onFailed(Throwable th) {
                String message;
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                c1136560fgM2.LIZJ().LJIJ(message, false, true, false);
                C1136400fg6 c1136400fg62 = c1136400fg6;
                int i2 = i;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                C1136560fgM c1136560fgM3 = c1136560fgM2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadAssets onFailed by ");
                sbLIZ2.append(message);
                c1136400fg62.LJIILLIIL(i2, interfaceC1136020ffU2, c1136560fgM3, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }, C2097608Jq.LJ());
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS3S0401000_17 aRunnableS3S0401000_17) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGiftEffectPreDownloader@5452.prepareAssetsModel$onPrepared$1");
        try {
            aRunnableS3S0401000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGiftEffectPreDownloader@5452.prepareAssetsModel$onPrepared$1");
    }

    public static final void run$1(ARunnableS3S0401000_17 aRunnableS3S0401000_17) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGiftEffectPreDownloaderNew@8f06.prepareAssetsModel$onPrepared$1");
        try {
            aRunnableS3S0401000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGiftEffectPreDownloaderNew@8f06.prepareAssetsModel$onPrepared$1");
    }

    public ARunnableS3S0401000_17(int i, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj4;
        this.l1 = obj;
        this.l2 = obj2;
        this.i4 = i;
        this.l3 = obj3;
    }
}
