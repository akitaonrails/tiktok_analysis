package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.mixediting.IMixedEditOutService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYU {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.InterfaceC1452170ntP r6, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EYU.LIZ(X.0ntP, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LIZJ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModelLIZ;
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMixedEditOutService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            if (!((IMixedEditOutService) objPluggableSpi$default).LIZ(videoPublishEditModel) || interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || !C0EYQ.LJIILL(nLEModelLIZ)) {
                return false;
            }
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        boolean z;
        NLEModel nLEModelLIZ;
        String str = videoPublishEditModel.creativeModel.autoPickModel.themeName;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null) {
            nLEModel = nLEModelLIZ;
        } else {
            if (nLEModel == null && (nLEModel = videoPublishEditModel.getNleModel()) == null) {
                if (!z2 || !Intrinsics.LJFF(C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, false), C1412630mrd.LIZLLL(EnumC1412640mre.AUTO_PICK_TEMPLATE))) {
                    return false;
                }
            }
            return true;
        }
        if (!z2 || !Intrinsics.LJFF(C0EYQ.LIZ(nLEModel), String.valueOf(EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()))) {
            return false;
        }
        return true;
    }
}
