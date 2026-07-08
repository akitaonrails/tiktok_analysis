package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.08q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2239408q0 {
    public static final String LIZ(CreativeInfo creativeInfo) {
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("-pin.json");
        return pathAdapter.LJJJJLI(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LIZIZ(CreativeInfo creativeInfo) {
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("-pin-mapping.json");
        return pathAdapter.LJJJJLI(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(String str, ByteBuffer byteBuffer) throws IOException {
        if (str != null && byteBuffer != null) {
            FileChannel channel = null;
            try {
                try {
                    channel = new C0VSV(str).getChannel();
                    channel.write(byteBuffer);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (channel == null) {
                        return;
                    }
                }
                channel.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (channel != null) {
                    channel.close();
                }
                throw th;
            }
        }
    }
}
