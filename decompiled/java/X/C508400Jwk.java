package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508400Jwk {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final Uri LJI;
    public final Boolean LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final boolean LIZ() {
        if (!Intrinsics.LJFF(this.LJII, Boolean.TRUE)) {
            Uri uri = this.LJI;
            if (uri == null) {
                return false;
            }
            if (!uri.getBooleanQueryParameter("preview_mode", false)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "preview_mode");
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    return false;
                }
            }
        }
        return true;
    }

    public C508400Jwk(String str, String str2, long j, long j2, String str3, boolean z, Uri uri, Boolean bool, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? "" : str2;
        j = (i & 32) != 0 ? 0L : j;
        long j3 = (i & 64) == 0 ? j2 : 0L;
        str3 = (i & 128) != 0 ? "" : str3;
        z = (i & 256) != 0 ? false : z;
        uri = (i & 512) != 0 ? null : uri;
        bool = (i & 1024) != 0 ? Boolean.FALSE : bool;
        String str5 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str4 : "";
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j3;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = uri;
        this.LJII = bool;
        this.LJIIIIZZ = str5;
        this.LJIIJ = true;
    }
}
