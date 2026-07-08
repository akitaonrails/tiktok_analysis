package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0WA3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WA3 {
    public final Resources LIZ;
    public final String LIZIZ;

    public static String LIZ(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.fq2);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return context.getPackageName();
        }
    }

    public final String LIZIZ(String str) {
        int iN3 = C786410Ut5.n3(this.LIZ, str, "string", this.LIZIZ);
        if (iN3 == 0) {
            return null;
        }
        try {
            return this.LIZ.getString(iN3);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0WA3(Context context, String str) {
        C0W3J.LJIIIIZZ(context);
        this.LIZ = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.LIZIZ = str;
        } else {
            this.LIZIZ = LIZ(context);
        }
    }
}
