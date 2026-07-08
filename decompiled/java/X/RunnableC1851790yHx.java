package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0yHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class RunnableC1851790yHx implements Runnable {
    public final File LL;
    public final VideoPublishEditModel LLILLJJLI;
    public Future<?> LLILLL;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0083 -> B:22:0x008e). Please report as a decompilation issue!!! */
    public final void LIZ() {
        Object obj;
        InterfaceC1840520xzm interfaceC1840520xzm = (InterfaceC1840520xzm) ((LinkedHashMap) C1851770yHv.LIZLLL).get(this.LLILLJJLI.getCreationId());
        if (interfaceC1840520xzm != null) {
            interfaceC1840520xzm.LIZLLL();
        }
        C1851770yHv c1851770yHv = C1851770yHv.LIZ;
        File file = this.LL;
        String creationId = this.LLILLJJLI.getCreationId();
        long jLIZ = C1403950mdd.LIZ(this.LLILLJJLI.getPreviewInfo());
        c1851770yHv.getClass();
        if (file != null) {
            String parent = file.getParent();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(parent);
            sbLIZ.append("/audio_temp.wav");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            VEUtils.transCodeAudio(file.getPath(), strLIZIZ, 1, -1, 8000);
            try {
                C0VSP c0vsp = new C0VSP(new C0VSJ(strLIZIZ));
                if (c0vsp.getChannel().size() == 0) {
                    C098200Yq c098200Yq = new C098200Yq(new Exception("empty file"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                } else {
                    byte[] bArr = new byte[c0vsp.available()];
                    c0vsp.read(bArr);
                    C189200o6.m2constructorimpl(bArr);
                    obj = bArr;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C098200Yq c098200Yq2 = new C098200Yq(e);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj = c098200Yq2;
            }
            try {
                if (C189200o6.m8isSuccessimpl(obj)) {
                    C1851770yHv c1851770yHv2 = C1851770yHv.LIZ;
                    C1840490xzj c1840490xzj = new C1840490xzj(creationId, jLIZ);
                    c1851770yHv2.getClass();
                    C1851770yHv.LIZ((byte[]) obj, c1840490xzj);
                }
                C189200o6.m1boximpl(obj);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.getMessage();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PcsAudioCopyrightDetectionManager$DetectionProcess@fcfd.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PcsAudioCopyrightDetectionManager$DetectionProcess@fcfd.run");
    }

    public RunnableC1851790yHx(C0VSJ c0vsj, VideoPublishEditModel videoPublishEditModel) {
        this.LL = c0vsj;
        this.LLILLJJLI = videoPublishEditModel;
    }
}
