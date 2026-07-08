package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VUX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUX {
    public final Map<String, InterfaceC798580VUi> LIZ;
    public final List<InterfaceC798590VUj> LIZIZ;
    public final List<C0VTW> LIZJ;
    public final List<C0VUR> LIZLLL;
    public Executor LJ;
    public final List<InterfaceC798600VUk> LJFF;

    public C0VUX(Context context) {
        if (C786410Ut5.N3(context) != null) {
            this.LIZ = new LinkedHashMap();
            this.LIZIZ = new ArrayList();
            this.LIZJ = new ArrayList();
            this.LIZLLL = new ArrayList();
            this.LJFF = new ArrayList();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get application context from context : ");
        sbLIZ.append(context);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
