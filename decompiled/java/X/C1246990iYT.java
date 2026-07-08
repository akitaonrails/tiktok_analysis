package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246990iYT implements InterfaceC1247150iYj {
    public final User LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Function0<Unit> LJI;

    @Override // X.InterfaceC1247150iYj
    public final C1247510iZJ get() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131846231);
        c1247510iZJ.LIZ(new AwS598S0100000_19(this, 944));
        return c1247510iZJ;
    }

    public C1246990iYT(User user, Context context, String str, String str2, int i, int i2, Function0<Unit> function0) {
        this.LIZ = user;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = function0;
    }
}
