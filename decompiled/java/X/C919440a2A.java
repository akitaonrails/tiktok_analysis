package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS224S0300000_15;

/* JADX INFO: renamed from: X.0a2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919440a2A {
    public final User LIZ;
    public final int LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;

    public C919440a2A() {
        throw null;
    }

    public C919440a2A(User user, int i, AwS224S0300000_15 awS224S0300000_15, int i2) {
        i = (i2 & 2) != 0 ? 1 : i;
        awS224S0300000_15 = (i2 & 4) != 0 ? null : awS224S0300000_15;
        this.LIZ = user;
        this.LIZIZ = i;
        this.LIZJ = awS224S0300000_15;
    }
}
