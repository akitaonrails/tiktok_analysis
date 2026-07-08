package X;

import android.content.Context;
import android.text.method.MovementMethod;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683500QrU {
    public int LIZ = -1;
    public CharSequence LIZIZ;
    public final int LIZJ;
    public Integer LIZLLL;
    public MovementMethod LJ;
    public CharSequence LJFF;
    public final int LJI;
    public Integer LJII;

    public C683500QrU() {
        Context applicationContext;
        Context applicationContext2;
        IAppContextManagerService iAppContextManagerServiceLIZ = C1948707kD.LIZ();
        String string = null;
        this.LIZIZ = (iAppContextManagerServiceLIZ == null || (applicationContext2 = iAppContextManagerServiceLIZ.getApplicationContext()) == null) ? null : applicationContext2.getString(2131836755);
        this.LIZJ = R.attr.a1k;
        IAppContextManagerService iAppContextManagerServiceLIZ2 = C1948707kD.LIZ();
        if (iAppContextManagerServiceLIZ2 != null && (applicationContext = iAppContextManagerServiceLIZ2.getApplicationContext()) != null) {
            string = applicationContext.getString(2131845625);
        }
        this.LJFF = string;
        this.LJI = R.attr.a1k;
    }
}
