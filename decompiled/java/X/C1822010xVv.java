package X;

import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsNewFormEnableSettingV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822010xVv {
    public final EnumC1785280wYg LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final Long LJI;
    public final String LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Boolean LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final Boolean LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;

    public final boolean LIZ() {
        Boolean bool = this.LJIIJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        Long l = this.LJI;
        return l != null && l.longValue() == UserService.getInstance().user().getCurrentUserId();
    }

    public final boolean LIZIZ() {
        Uri uri;
        String str = this.LJIILIIL;
        String path = null;
        if (str != null && (uri = UriProtector.parse(str)) != null) {
            path = uri.getPath();
        }
        return LivePcsNewFormEnableSettingV2.INSTANCE.getValue() && Intrinsics.LJFF(path, "/form_revamp");
    }

    public C1822010xVv(EnumC1785280wYg enumC1785280wYg, String str, boolean z, boolean z2, boolean z3, String str2, Long l, String str3, Long l2, Long l3, Boolean bool, String str4, boolean z4, String str5, String str6, Boolean bool2, String str7, String str8, int i) {
        Long l4 = l;
        String str9 = str2;
        boolean z5 = z3;
        boolean z6 = z2;
        String str10 = str4;
        Boolean bool3 = bool;
        Long l5 = l3;
        Long l6 = l2;
        String str11 = str3;
        String str12 = str8;
        String str13 = str7;
        Boolean bool4 = bool2;
        String str14 = str6;
        String str15 = str5;
        boolean z7 = (i & 4) != 0 ? true : z;
        z6 = (i & 8) != 0 ? false : z6;
        z5 = (i & 16) != 0 ? false : z5;
        str9 = (i & 32) != 0 ? null : str9;
        l4 = (i & 64) != 0 ? null : l4;
        str11 = (i & 128) != 0 ? null : str11;
        l6 = (i & 256) != 0 ? null : l6;
        l5 = (i & 512) != 0 ? null : l5;
        bool3 = (i & 1024) != 0 ? null : bool3;
        str10 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str10;
        boolean z8 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z4 : false;
        str15 = (i & 8192) != 0 ? null : str15;
        str14 = (i & 16384) != 0 ? null : str14;
        bool4 = (65536 & i) != 0 ? null : bool4;
        str13 = (131072 & i) != 0 ? null : str13;
        str12 = (i & 262144) != 0 ? null : str12;
        this.LIZ = enumC1785280wYg;
        this.LIZIZ = str;
        this.LIZJ = z7;
        this.LIZLLL = z6;
        this.LJ = z5;
        this.LJFF = str9;
        this.LJI = l4;
        this.LJII = str11;
        this.LJIIIIZZ = l6;
        this.LJIIIZ = l5;
        this.LJIIJ = bool3;
        this.LJIIJJI = str10;
        this.LJIIL = z8;
        this.LJIILIIL = str15;
        this.LJIILJJIL = str14;
        this.LJIILL = bool4;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str12;
    }
}
