package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247490iZH implements InterfaceC1247150iYj {
    public final User LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final InterfaceC1243310iSX LIZLLL = null;
    public final int LJ;
    public final boolean LJFF;

    @Override // X.InterfaceC1247150iYj
    public final C1247510iZJ get() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZLLL = this.LJFF;
        c1247510iZJ.LIZIZ(C1253000iiA.LIZIZ(C1247000iYU.LJ(this.LIZ)));
        c1247510iZJ.LIZ(new AwS598S0100000_19(this, 807));
        if (!this.LJFF) {
            c1247510iZJ.LJI = 2131830414;
        }
        return c1247510iZJ;
    }

    public C1247490iZH(User user, Context context, String str, int i, boolean z) {
        this.LIZ = user;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LJ = i;
        this.LJFF = z;
    }
}
