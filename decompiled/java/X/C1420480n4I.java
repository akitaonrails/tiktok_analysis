package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS106S1000000_22;

/* JADX INFO: renamed from: X.0n4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420480n4I {
    public static boolean LIZIZ;
    public static final C1420480n4I LIZ = new C1420480n4I();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(377));

    public static void LIZ(NLEResourceNode nLEResourceNode) {
        String resourceFile;
        if (nLEResourceNode != null && C1697810uHb.LJIIJJI(NLEResType.VIDEO, NLEResType.IMAGE).contains(nLEResourceNode.getResourceType()) && (resourceFile = nLEResourceNode.getResourceFile()) != null && resourceFile.length() != 0 && !C2286708xd.LIZJ(nLEResourceNode.getResourceFile())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEModel resource file ");
            sbLIZ.append(nLEResourceNode.getResourceFile());
            sbLIZ.append(" not exists");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static Pair LIZIZ(String str) {
        int i;
        if (!C2286708xd.LIZJ(str)) {
            return new Pair(-1, null);
        }
        String strLJIJJ = C2471909mP.LJIJJ(str, null);
        if (C2471909mP.LIZ(strLJIJJ)) {
            i = 1;
        } else {
            i = 100;
        }
        return new Pair(Integer.valueOf(i), strLJIJJ);
    }

    public static final void LIZJ(NLEModel nLEModel) {
        if (nLEModel.getMainTrack() == null) {
            C201955140j.LJII(C563650M8t.LIZIZ, "realCheckNLEModel: mainTrack is null, skipping check to avoid crash (e.g. in-process magic draft)");
        }
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            LIZ.getClass();
            if (nLEResourceNode != null) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "check_nle_model_file_exists_when_commit_and_process_draft", true, false) && ((Boolean) C1930907hL.LIZ.getValue()).booleanValue()) {
                    LIZ(nLEResourceNode);
                }
                String resourceFile = nLEResourceNode.getResourceFile();
                NLEResType resourceType = nLEResourceNode.getResourceType();
                if (resourceType != null) {
                    int i = C348690Dlj.LIZ[resourceType.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            AwS106S1000000_22 awS106S1000000_22 = new AwS106S1000000_22(resourceFile, 3);
                            if (C297420BlE.LIZ()) {
                                ((ExecutorServiceC822430WOb) LIZJ.getValue()).submit(new ARunnableS103S0100000_3((Object) awS106S1000000_22, 104));
                            } else {
                                awS106S1000000_22.invoke();
                            }
                        }
                    } else {
                        AwS106S1000000_22 awS106S1000000_222 = new AwS106S1000000_22(resourceFile, 2);
                        if (C297420BlE.LIZ()) {
                            ((ExecutorServiceC822430WOb) LIZJ.getValue()).submit(new ARunnableS103S0100000_3((Object) awS106S1000000_222, 103));
                        } else {
                            awS106S1000000_222.invoke();
                        }
                    }
                }
                C0CHQ.LIZ().isDebugConfigOpen();
            }
        }
    }
}
