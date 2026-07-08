package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS285S0000000_2;

/* JADX INFO: renamed from: X.0fjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138620fjg {
    public static C11JF LIZ;

    public static void LIZ(AssetsModel assetsModel) {
        FaceRecognitionMeta faceRecognitionMeta;
        if (assetsModel == null) {
            return;
        }
        int i = assetsModel.resourceType;
        if (i == AssetsModel.RESOURCE_TYPE_MP4) {
            C1138630fjh c1138630fjh = C1138630fjh.LIZ;
            C1138630fjh.LIZLLL(assetsModel.id, new C1138840fk2(), 4, new HashMap(), null, null);
            return;
        }
        if (i == AssetsModel.RESOURCE_TYPE_LYNX) {
            C1137480fhq c1137480fhq = C1137480fhq.LIZ;
            AFwS285S0000000_2 aFwS285S0000000_2 = AFwS285S0000000_2.get$arr$(40);
            c1137480fhq.getClass();
            C1137480fhq.LIZLLL(assetsModel, null, null, null, aFwS285S0000000_2);
            return;
        }
        if (i != AssetsModel.RESOURCE_TYPE_STICKER && i != AssetsModel.RESOURCE_TYPE_PREFAB_TEMPLATE) {
            return;
        }
        C1138630fjh c1138630fjh2 = C1138630fjh.LIZ;
        C1138630fjh.LIZLLL(assetsModel.id, new C1138840fk2(), 4, new HashMap(), null, null);
        if (!C2640010k.LIZIZ() || (faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta) == null) {
            return;
        }
        C1141900foy c1141900foy = C1141900foy.LIZ;
        List list = faceRecognitionMeta.requirements;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str = faceRecognitionMeta.modelNames;
        c1141900foy.getClass();
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames((String[]) list.toArray(new String[0]), C1141900foy.LIZLLL(str), new C1141920fp0(null));
    }
}
