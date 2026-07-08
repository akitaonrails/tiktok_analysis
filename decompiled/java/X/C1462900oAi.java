package X;

import android.os.Looper;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0oAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462900oAi {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Cert LIZIZ = CertProviderManagerKt.findCert("bpea-mic_VoiceFilterOnShootPage_record", 1476788495);

    public static String LIZ(CreativeInfo creativeInfo) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJ(creativeInfo);
    }
}
