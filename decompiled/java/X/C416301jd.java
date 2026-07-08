package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C416301jd {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZIZ(String str, boolean z, long j, int i, int i2, int i3, C610940Nxk c610940Nxk, int i4) throws Throwable {
        String str2;
        int i5 = i3;
        if ((i4 & 2) != 0) {
            str2 = "full_save";
        } else {
            str2 = null;
        }
        if ((i4 & 64) != 0) {
            i5 = 0;
        }
        Object objLJI = C23250099c.LJI(c610940Nxk, C0PEM.LIZJ, new C416101jb(str, str2, z, j, i, i2, i5, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    public static Object LIZ(String str, String str2, boolean z, long j, int i, int i2, boolean z2, int i3, double d, long j2, long j3, long j4, int i4, AbstractC23140094w abstractC23140094w, int i5) throws Throwable {
        int i6 = i4;
        long j5 = j2;
        boolean z3 = z2;
        int i7 = i;
        long j6 = j4;
        int i8 = i3;
        boolean z4 = z;
        int i9 = i2;
        double d2 = d;
        long j7 = j;
        long j8 = j3;
        String str3 = str2;
        if ((i5 & 2) != 0) {
            str3 = "full_read";
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        if ((i5 & 8) != 0) {
            j7 = 0;
        }
        if ((i5 & 16) != 0) {
            i7 = 0;
        }
        if ((i5 & 32) != 0) {
            i9 = 0;
        }
        if ((i5 & 64) != 0) {
            z3 = false;
        }
        if ((i5 & 128) != 0) {
            i8 = 0;
        }
        if ((i5 & 256) != 0) {
            d2 = 0.0d;
        }
        if ((i5 & 512) != 0) {
            j5 = 0;
        }
        if ((i5 & 1024) != 0) {
            j8 = 0;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j6 = 0;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i6 = -1;
        }
        Object objLJI = C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C416201jc(str, str3, z4, j7, i7, i9, z3, i8, d2, j5, j8, j6, i6, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }
}
