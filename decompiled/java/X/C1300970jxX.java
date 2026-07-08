package X;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0jxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300970jxX {
    public static void LIZIZ(AudioRecord audioRecord, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100403, "audio_release", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/AudioRecord", "release()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(audioRecord, 37));
    }

    public static void LIZJ(AudioRecord audioRecord, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100400, "audio_start", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/AudioRecord", "startRecording()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(audioRecord, 38));
    }

    public static void LIZLLL(AudioRecord audioRecord, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100401, "audio_stop", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/media/AudioRecord", "stop()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(audioRecord, 39));
    }

    public static C825940Wae LIZ(int i, String str, Cert cert) {
        return new C825940Wae(cert, str, new String[]{"audio"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }
}
