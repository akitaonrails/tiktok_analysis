package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.010S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010S implements C010U {
    public static final C010S LIZ = new C010S();
    public static final List<String> LIZIZ = new ArrayList();

    @Override // X.C010U
    public final String getName() {
        return "ignore_nuj_node";
    }

    @Override // X.C010U
    public final void LIZ(String str) {
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            ((ArrayList) LIZIZ).addAll(listLJJLIIIJILLIZJL);
        }
    }
}
