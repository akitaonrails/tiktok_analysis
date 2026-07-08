package X;

import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nleeditor.NLE;
import java.util.Iterator;
import kotlin.jvm.internal.AwS14S0410000_5;
import kotlin.jvm.internal.AwS26S1201000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FRC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRC extends INLEResourceDownloadStatusListener {
    public final /* synthetic */ C389960FQs LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onAllResourceDownloadFinished() {
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onAllResourceDownloadFinished");
        }
        C0FRH.LIZ(new AwS549S0100000_5(this.LIZ, 1172));
    }

    public C0FRC(C389960FQs c389960FQs) {
        this.LIZ = c389960FQs;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onStart(NLEResourceNode nLEResourceNode) {
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onStart");
        }
        C0FRH.LIZ(new AwS406S0200000_5(this.LIZ, nLEResourceNode, 126));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onSuccess(NLEResourceNode nLEResourceNode, boolean z) {
        String resourceId;
        String resourceId2;
        String resourceFile;
        NLE nle = NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onSuccess");
        }
        if (this.LIZ.LJJIIJ.get()) {
            NLELoggerListener logger2 = nle.getLogger();
            if (logger2 != null) {
                logger2.onLog(LogLevel.LEVEL_WARNING, "player has been destroyed");
                return;
            }
            return;
        }
        NLEEditor nLEEditor = this.LIZ.LJFF;
        if (nLEEditor == null) {
            NLELoggerListener logger3 = nle.getLogger();
            if (logger3 != null) {
                logger3.onLog(LogLevel.LEVEL_WARNING, "editor is null");
                return;
            }
            return;
        }
        NLELoggerListener logger4 = nle.getLogger();
        NLEResourceNode nLEResourceNode2 = null;
        if (logger4 != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEResourceDownloadStatusListener onSuccess: resourceId: ");
            if (nLEResourceNode != null) {
                resourceId2 = nLEResourceNode.getResourceId();
            } else {
                resourceId2 = null;
            }
            sbLIZ.append(resourceId2);
            sbLIZ.append(", resourceFile: ");
            if (nLEResourceNode != null) {
                resourceFile = nLEResourceNode.getResourceFile();
            } else {
                resourceFile = null;
            }
            sbLIZ.append(resourceFile);
            sbLIZ.append(", isFromCache: ");
            sbLIZ.append(z);
            logger4.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator<NLEResourceNode> it2 = nLEEditor.getModel().getAllResources().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLEResourceNode next = it2.next();
            String resourceId3 = next.getResourceId();
            if (nLEResourceNode != null) {
                resourceId = nLEResourceNode.getResourceId();
            } else {
                resourceId = null;
            }
            if (Intrinsics.LJFF(resourceId3, resourceId)) {
                nLEResourceNode2 = next;
                break;
            }
        }
        C0FRH.LIZ(new AwS14S0410000_5(nLEResourceNode2, nLEResourceNode, this.LIZ, nLEEditor, z, 1));
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener
    public final void onFail(NLEResourceNode nLEResourceNode, int i, String str) {
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEResourceDownloadStatusListener onFailed");
        }
        C0FRH.LIZ(new AwS26S1201000_5(this.LIZ, nLEResourceNode, i, str, 2));
    }
}
