package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;

/* JADX INFO: renamed from: X.0Ds7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352650Ds7 {
    public static final C352650Ds7 LIZ = new C352650Ds7();

    public static void LIZ(NLEModel nLEModel) {
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            String resourceFile = nLEResourceNode.getResourceFile();
            if (resourceFile != null && resourceFile.length() != 0) {
                NLEResType nLEResType = NLEResType.VIDEO;
                NLEResType nLEResType2 = NLEResType.IMAGE;
                if (C1697810uHb.LJIIJJI(nLEResType, nLEResType2).contains(nLEResourceNode.getResourceType()) && C2286708xd.LIZJ(nLEResourceNode.getResourceFile())) {
                    Boolean mediaTypeCache = C0CHQ.LIZ().LJIILL().getMediaTypeCache(nLEResourceNode.getResourceFile());
                    if (mediaTypeCache != null && C298040BmE.LIZ()) {
                        if (mediaTypeCache.booleanValue()) {
                            nLEResourceNode.setResourceType(nLEResType2);
                        } else {
                            nLEResourceNode.setResourceType(nLEResType);
                        }
                    } else if (C2286708xd.LJIILL(nLEResourceNode.getResourceFile())) {
                        nLEResourceNode.setResourceType(nLEResType2);
                    } else {
                        nLEResourceNode.setResourceType(nLEResType);
                    }
                    if (C298040BmE.LIZ()) {
                        C0CHQ.LIZ().LJIILL().updateMediaTypeCache(nLEResourceNode.getResourceFile());
                        C0CHQ.LIZ().LJIILL().updateVideoInfoCache(nLEResourceNode.getResourceFile());
                    }
                }
            }
        }
    }
}
