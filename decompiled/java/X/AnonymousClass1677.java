package X;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;

/* JADX INFO: renamed from: X.1677, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1677 {
    public final FragmentManager LIZ;
    public final EnumC1782750wUb LIZIZ;
    public final EnumC207219166v LIZJ;
    public final int LIZLLL;
    public final Map<String, Object> LJ;
    public final boolean LJFF;
    public final Bitmap LJI;
    public final Uri LJII;
    public final String LJIIIIZZ;
    public final C207221166x LJIIIZ;
    public final AnonymousClass1676 LJIIJ;

    public AnonymousClass1677(FragmentManager fragmentManager, EnumC1782750wUb enumC1782750wUb, EnumC207219166v enumC207219166v, int i, Map map, boolean z, Bitmap bitmap, Uri uri, C207221166x c207221166x, AnonymousClass1676 anonymousClass1676, int i2) {
        z = (i2 & 64) != 0 ? false : z;
        bitmap = (i2 & 128) != 0 ? null : bitmap;
        uri = (i2 & 256) != 0 ? null : uri;
        c207221166x = (i2 & 1024) != 0 ? null : c207221166x;
        anonymousClass1676 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : anonymousClass1676;
        this.LIZ = fragmentManager;
        this.LIZIZ = enumC1782750wUb;
        this.LIZJ = enumC207219166v;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJFF = z;
        this.LJI = bitmap;
        this.LJII = uri;
        this.LJIIIIZZ = null;
        this.LJIIIZ = c207221166x;
        this.LJIIJ = anonymousClass1676;
    }
}
