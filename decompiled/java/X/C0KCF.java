package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0KCF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public Boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public String LJJI;
    public final int LJJIFFI;
    public final Uri LJJII;
    public final long LJJIII;
    public final long LJJIIJ;
    public final boolean LJJIIJZLJL;

    public final int LIZ() {
        Integer numLJIIJJI;
        Uri uri = this.LJJII;
        if (uri == null) {
            return this.LJJIFFI;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "link_id");
        return (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) == null) ? LSPassThroughRecordSizeConfig.DEFAULT : numLJIIJJI.intValue();
    }

    public C0KCF(String str, String str2, String str3, boolean z, int i, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, boolean z2, String str13, boolean z3, String str14, int i2, String str15, String str16, String str17, String str18, String str19, int i3, Uri uri, long j, long j2, boolean z4, int i4, int i5) {
        String str20;
        String str21 = str9;
        String str22 = str8;
        Boolean bool2 = bool;
        String str23 = str7;
        String str24 = str6;
        String str25 = str5;
        String str26 = str4;
        int i6 = i;
        boolean z5 = z;
        String str27 = str3;
        String str28 = str2;
        boolean z6 = z4;
        long j3 = j2;
        long j4 = j;
        Uri uri2 = uri;
        String str29 = str17;
        String str30 = str16;
        String str31 = str15;
        int i7 = i2;
        String str32 = str14;
        String str33 = str13;
        boolean z7 = z2;
        String str34 = str12;
        int i8 = i3;
        String pageName = str18;
        boolean z8 = z3;
        String str35 = str10;
        String str36 = "";
        String str37 = (i4 & 1) != 0 ? "" : str;
        str28 = (i4 & 2) != 0 ? "" : str28;
        str27 = (i4 & 4) != 0 ? "" : str27;
        z5 = (i4 & 8) != 0 ? true : z5;
        i6 = (i4 & 16) != 0 ? 0 : i6;
        str26 = (i4 & 32) != 0 ? "unknown" : str26;
        str25 = (i4 & 64) != 0 ? "" : str25;
        str24 = (i4 & 128) != 0 ? "" : str24;
        str23 = (i4 & 1024) != 0 ? "" : str23;
        bool2 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : bool2;
        str22 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str22;
        str21 = (i4 & 8192) != 0 ? "" : str21;
        str35 = (i4 & 16384) != 0 ? "" : str35;
        if ((32768 & i4) != 0) {
            str20 = "";
        } else {
            str20 = "";
            str36 = str11;
        }
        str34 = (65536 & i4) != 0 ? str20 : str34;
        z7 = (131072 & i4) != 0 ? true : z7;
        str33 = (262144 & i4) != 0 ? str20 : str33;
        z8 = (524288 & i4) != 0 ? false : z8;
        str32 = (1048576 & i4) != 0 ? str20 : str32;
        i7 = (2097152 & i4) != 0 ? 0 : i7;
        str31 = (4194304 & i4) != 0 ? str20 : str31;
        str30 = (8388608 & i4) != 0 ? str20 : str30;
        str29 = (16777216 & i4) != 0 ? str20 : str29;
        pageName = (33554432 & i4) != 0 ? EnumC513390KBl.UNKNOWN.getPageName() : pageName;
        str20 = (67108864 & i4) == 0 ? str19 : str20;
        i8 = (536870912 & i4) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i8;
        uri2 = (1073741824 & i4) != 0 ? null : uri2;
        j4 = (i4 & Integer.MIN_VALUE) != 0 ? 0L : j4;
        j3 = (i5 & 1) != 0 ? 0L : j3;
        z6 = (i5 & 2) != 0 ? false : z6;
        this.LIZ = str37;
        this.LIZIZ = str28;
        this.LIZJ = str27;
        this.LIZLLL = z5;
        this.LJ = i6;
        this.LJFF = str26;
        this.LJI = str25;
        this.LJII = str24;
        this.LJIIIIZZ = str23;
        this.LJIIIZ = bool2;
        this.LJIIJ = str22;
        this.LJIIJJI = str21;
        this.LJIIL = str35;
        this.LJIILIIL = str36;
        this.LJIILJJIL = str34;
        this.LJIILL = z7;
        this.LJIILLIIL = str33;
        this.LJIIZILJ = z8;
        this.LJIJ = str32;
        this.LJIJI = i7;
        this.LJIJJ = str31;
        this.LJIJJLI = str30;
        this.LJIL = str29;
        this.LJJ = pageName;
        this.LJJI = str20;
        this.LJJIFFI = i8;
        this.LJJII = uri2;
        this.LJJIII = j4;
        this.LJJIIJ = j3;
        this.LJJIIJZLJL = z6;
    }
}
