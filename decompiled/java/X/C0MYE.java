package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MYE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYE {
    public static final Pair<DraftFileRestoreException, String> LIZ(String str, CreativeInfo creativeInfo, CreativeInfo creativeInfo2, C0M8K c0m8k) throws Throwable {
        boolean z;
        long jLJIIIZ;
        FileChannel channel;
        FileInputStream fileInputStreamLJJI;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        FileChannel channel2 = null;
        if (!z && !u.LJJIIJZLJL(str, "http", false)) {
            Iterator<String> it2 = C570200MXy.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (u.LJJIIJZLJL(str, next, false)) {
                    if (next != null) {
                        return new Pair<>(new DraftFileRestoreException(0, null, "Unknown"), null);
                    }
                }
            }
            if (new C0VSJ(str).isDirectory()) {
                ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Forbid use CreativePath on directory !!!, trace : ");
                sbLIZ.append(Log.getStackTraceString(new RuntimeException()));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C571900Mbs.LIZ(strLIZIZ);
                C0M7M.LIZIZ(strLIZIZ);
                return new Pair<>(new DraftFileRestoreException(0, null, "Unknown"), null);
            }
            if (!C570490MZb.LJ(str)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path : ");
                sbLIZ2.append(C0MYL.LIZ(str, creativeInfo.getCreationId()));
                return new Pair<>(new DraftFileRestoreException(-502, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)), "Unknown"), "");
            }
            String strLIZ = c0m8k.LIZ(str, creativeInfo, creativeInfo2);
            if (Intrinsics.LJFF(str, strLIZ)) {
                return new Pair<>(new DraftFileRestoreException(0, null, "Unknown"), null);
            }
            if (u.LJJIIJZLJL(str, "http", false)) {
                jLJIIIZ = 0;
            } else {
                jLJIIIZ = C2471909mP.LJIIIZ(str);
            }
            long jLJI = C0MYA.LJI();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("dstPath : ");
            sbLIZ3.append(strLIZ);
            sbLIZ3.append(" ; availableBytes : ");
            sbLIZ3.append(jLJI);
            sbLIZ3.append(" ; srcFileLength : ");
            sbLIZ3.append(jLJIIIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            if (jLJI < jLJIIIZ) {
                return new Pair<>(new DraftFileRestoreException(-553, new C2089308Gl(strLIZIZ2), "Unknown"), "");
            }
            if (!C570490MZb.LJI(new C0VSJ(strLIZ))) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("path : ");
                sbLIZ4.append(C0MYL.LIZ(strLIZ, creativeInfo2.getCreationId()));
                return new Pair<>(new DraftFileRestoreException(-506, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4)), "Unknown"), "");
            }
            Pair<DraftFileRestoreException, String> pair = new Pair<>(new DraftFileRestoreException(0, null, "Unknown"), strLIZ);
            try {
                try {
                    fileInputStreamLJJI = C2471909mP.LJJI(0, str);
                    try {
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        pair = new Pair<>(new DraftFileRestoreException(-550, e, "Unknown"), "");
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C0MYA.LIZLLL(null);
                    C0MYA.LIZLLL(null);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                channel = null;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C0MYA.LIZLLL(null);
                C0MYA.LIZLLL(null);
                throw th;
            }
            if (fileInputStreamLJJI != null) {
                channel = fileInputStreamLJJI.getChannel();
                if (channel != null) {
                    channel2 = new C0VSV(strLIZ).getChannel();
                    if (C0CHD.LIZ()) {
                        long size = channel.size();
                        for (long jTransferTo = 0; jTransferTo < size; jTransferTo += channel.transferTo(jTransferTo, size - jTransferTo, channel2)) {
                        }
                    } else {
                        channel.transferTo(0L, channel.size(), channel2);
                    }
                    C0MYA.LIZLLL(channel);
                    C0MYA.LIZLLL(channel2);
                    if (pair.getFirst().isSuc() && jLJIIIZ != new C0VSJ(strLIZ).length()) {
                        return new Pair<>(new DraftFileRestoreException(-551, new RuntimeException(strLIZIZ2), "Unknown"), "");
                    }
                    return pair;
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("optInputStream() is null ... , fileDes : ");
            sbLIZ5.append(str);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ5));
        }
        return new Pair<>(new DraftFileRestoreException(0, null, "Unknown"), null);
    }
}
