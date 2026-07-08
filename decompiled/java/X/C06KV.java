package X;

import android.content.Context;
import com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.06KV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06KV {
    public static C06KV LIZIZ;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public String LIZ;

    public final String LIZ(Context context, boolean z) {
        List listLIZIZ;
        String str = this.LIZ;
        if (str == null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null || (listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(c19egLIZIZ, null), DefaultBottomTabProtocol.class, false)) == null) {
                return null;
            }
            for (DefaultBottomTabProtocol defaultBottomTabProtocol : C13LP.LJLLLL(new Comparator() { // from class: X.05xX
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(((DefaultBottomTabProtocol) t).priority(), ((DefaultBottomTabProtocol) t2).priority());
                }
            }, listLIZIZ)) {
                if (this.LIZ == null) {
                    if (defaultBottomTabProtocol.Wf0(context)) {
                        this.LIZ = defaultBottomTabProtocol.gZ1();
                    }
                } else if (z) {
                    defaultBottomTabProtocol.op1();
                }
            }
            return this.LIZ;
        }
        return str;
    }
}
