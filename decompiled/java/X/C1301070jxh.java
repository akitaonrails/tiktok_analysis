package X;

import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0jxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301070jxh {
    public static final String LIZJ = C1301070jxh.class.getSimpleName();
    public final Typeface LIZ;
    public final Typeface[] LIZIZ;

    public C1301070jxh(Typeface typeface) {
        Typeface[] typefaceArr = new Typeface[4];
        this.LIZIZ = typefaceArr;
        this.LIZ = typeface;
        typefaceArr[0] = typeface;
    }

    public final Typeface LIZ(int i) {
        if (i < 0 || i > 3) {
            i = 0;
        }
        Typeface[] typefaceArr = this.LIZIZ;
        if (typefaceArr[i] == null) {
            try {
                typefaceArr[i] = Typeface.create(this.LIZ, i);
            } catch (ArrayIndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                String str = LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create typeface failed, style: ");
                sbLIZ.append(i);
                sbLIZ.append(", origin typeface: ");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", Typeface.create function is not thread safe lower than Android 9, exception: ");
                sbLIZ.append(e);
                LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return this.LIZIZ[i];
    }
}
