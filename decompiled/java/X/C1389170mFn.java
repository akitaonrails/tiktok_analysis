package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0mFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389170mFn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final String LJII;
    public final UrlModel LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final Map<String, Object> LJIIL;

    public /* synthetic */ C1389170mFn(String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, String str7, String str8, UrlModel urlModel2, String str9, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : urlModel, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "", (i & 512) != 0 ? null : urlModel2, (i & 1024) == 0 ? str9 : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z, null, null);
    }

    public C1389170mFn(String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, String str7, String str8, UrlModel urlModel2, String str9, boolean z, String str10, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = urlModel;
        this.LJII = str8;
        this.LJIIIIZZ = urlModel2;
        this.LJIIIZ = str9;
        this.LJIIJ = z;
        this.LJIIJJI = str10;
        this.LJIIL = map;
    }
}
