package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919530a2J {
    public final User LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function1<Boolean, Unit> LIZLLL;

    public C919530a2J() {
        throw null;
    }

    public C919530a2J(User user, boolean z, boolean z2, Function1 function1, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        function1 = (i & 8) != 0 ? null : function1;
        this.LIZ = user;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = function1;
    }
}
