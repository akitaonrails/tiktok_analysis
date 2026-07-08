package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372470lor {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final List<Aweme> LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final View LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final Map<String, String> LJIJ;
    public final String LJIJI;
    public final Bundle LJIJJ;
    public final Boolean LJIJJLI;
    public final Boolean LJIL;
    public final Boolean LJJ;
    public final String LJJI;
    public final ShareInfo LJJIFFI;
    public final String LJJII;
    public final Boolean LJJIII;
    public final String LJJIIJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1372470lor(String str, String str2, String str3, String str4, long j, List<? extends Aweme> list, String str5, String str6, String str7, int i, String str8, View view, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map, String str15, Bundle bundle, Boolean bool, Boolean bool2, Boolean bool3, String str16, ShareInfo shareInfo, String str17, Boolean bool4, String str18) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = list;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = i;
        this.LJIIJ = str8;
        this.LJIIJJI = view;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = str11;
        this.LJIILL = str12;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str14;
        this.LJIJ = map;
        this.LJIJI = str15;
        this.LJIJJ = bundle;
        this.LJIJJLI = bool;
        this.LJIL = bool2;
        this.LJJ = bool3;
        this.LJJI = str16;
        this.LJJIFFI = shareInfo;
        this.LJJII = str17;
        this.LJJIII = bool4;
        this.LJJIIJ = str18;
    }

    public /* synthetic */ C1372470lor(String str, String str2, String str3, String str4, long j, List list, String str5, String str6, String str7, int i, String str8, View view, String str9, String str10, String str11, String str12, String str13, String str14, Map map, String str15, Bundle bundle, Boolean bool, Boolean bool2, Boolean bool3, String str16, ShareInfo shareInfo, String str17, Boolean bool4, String str18, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, str3, str4, j, list, str5, str6, str7, i, str8, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : view, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i2 & 8192) != 0 ? null : str10, (i2 & 16384) != 0 ? null : str11, (32768 & i2) != 0 ? null : str12, (65536 & i2) != 0 ? null : str13, (131072 & i2) != 0 ? null : str14, (i2 & 262144) == 0 ? map : null, str15, bundle, bool, bool2, bool3, str16, shareInfo, str17, bool4, str18);
    }
}
