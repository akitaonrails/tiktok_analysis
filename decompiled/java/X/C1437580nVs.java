package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.publish.protector.IPublishResourcePathPatch;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437580nVs {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1437600nVu LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1437580nVs.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel):X.0nVu");
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!((Boolean) C280510Az3.LIZ.getValue()).booleanValue() || C1428470nHB.LJJZZI(videoPublishEditModel) || C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || C1428470nHB.LJLLI(videoPublishEditModel) || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            return false;
        }
        IPublishResourcePathPatch iPublishResourcePathPatch = (IPublishResourcePathPatch) PluggableExtentionKt.pluggableSpi$default(IPublishResourcePathPatch.class, false, false, false, 14, null);
        if (iPublishResourcePathPatch != null && iPublishResourcePathPatch.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(String str, String str2) {
        String str3 = "[FileChecker]" + str2 + ", path=" + str;
        C1AF0.LIZJ(str3);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        C201955140j.LJIIIIZZ(c830690WiJ, "FileChecker", str3);
        if (C823190WQz.LIZJ.contains(str)) {
            C201955140j.LJIIIIZZ(c830690WiJ, "FileChecker", "delete protect file: " + str);
            C1AF0.LIZJ("[FileChecker]-inProtector-" + str2 + '-' + str);
        }
    }

    public static final void LIZIZ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, Function1<? super C1437600nVu, Unit> function1) {
        C1463670oBx c1463670oBx;
        if (!LIZJ(videoPublishEditModel)) {
            return;
        }
        if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
            C1437600nVu c1437600nVuLIZ = LIZ(c1463670oBx.LIZJ());
            function1.invoke(c1437600nVuLIZ);
            if (c1437600nVuLIZ.LIZ == 0) {
                C823190WQz.LIZ.LIZIZ(videoPublishEditModel.getCreationId(), c1437600nVuLIZ.LIZIZ);
                return;
            }
            return;
        }
        function1.invoke(new C1437600nVu(-1));
        LIZLLL("", "nle model not found");
    }
}
