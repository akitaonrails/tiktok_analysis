package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247500iZI implements InterfaceC1247150iYj {
    public final User LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C10EW LJFF;

    @Override // X.InterfaceC1247150iYj
    public final C1247510iZJ get() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131836021);
        c1247510iZJ.LIZ(new AwS598S0100000_19(this, 941));
        return c1247510iZJ;
    }

    public C1247500iZI(User user, Context context, String str, int i, int i2, C10EW c10ew) {
        this.LIZ = user;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = c10ew;
    }
}
