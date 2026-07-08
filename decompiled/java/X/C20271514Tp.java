package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* JADX INFO: renamed from: X.14Tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20271514Tp {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final List<Aweme> LJFF;
    public final List<ForwardMedia> LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final List<MediaModel> LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;

    public C20271514Tp(Context context, Aweme aweme, String str, String str2, String str3, List list, int i, int i2, List list2, boolean z, String str4, String str5, boolean z2, boolean z3, String str6, String str7, String str8, String str9, int i3) {
        String str10 = str3;
        String str11 = str2;
        String str12 = str4;
        boolean z4 = z;
        List list3 = list2;
        int i4 = i2;
        int i5 = i;
        List list4 = list;
        String str13 = str7;
        String str14 = str6;
        boolean z5 = z2;
        String str15 = str8;
        String str16 = str5;
        Aweme aweme2 = (i3 & 2) != 0 ? null : aweme;
        str11 = (i3 & 8) != 0 ? "" : str11;
        str10 = (i3 & 16) != 0 ? "" : str10;
        list4 = (i3 & 32) != 0 ? null : list4;
        i5 = (i3 & 128) != 0 ? 0 : i5;
        i4 = (i3 & 512) != 0 ? -1 : i4;
        list3 = (i3 & 1024) != 0 ? null : list3;
        z4 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z4;
        str12 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "has_post" : str12;
        str16 = (i3 & 8192) != 0 ? null : str16;
        z5 = (i3 & 16384) != 0 ? false : z5;
        boolean z6 = (32768 & i3) == 0 ? z3 : false;
        str14 = (65536 & i3) != 0 ? "on_this_day" : str14;
        str13 = (131072 & i3) != 0 ? "" : str13;
        str15 = (262144 & i3) != 0 ? "" : str15;
        String str17 = (i3 & 524288) == 0 ? str9 : "";
        this.LIZ = context;
        this.LIZIZ = aweme2;
        this.LIZJ = str;
        this.LIZLLL = str11;
        this.LJ = str10;
        this.LJFF = list4;
        this.LJI = null;
        this.LJII = i5;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = list3;
        this.LJIIJ = z4;
        this.LJIIJJI = str12;
        this.LJIIL = str16;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z6;
        this.LJIILL = str14;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str15;
        this.LJIJ = str17;
    }
}
