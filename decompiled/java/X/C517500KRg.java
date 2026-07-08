package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@InterfaceC1294060jmO
public class C517500KRg extends C517540KRk {
    public final int LIZLLL;
    public final String LJ;
    public final Throwable LJFF;

    public /* synthetic */ C517500KRg(int i, int i2, String str, Map map, int i3) {
        this(i, i2, (i3 & 4) != 0 ? "" : str, (Throwable) null, (Map<String, String>) ((i3 & 16) != 0 ? new LinkedHashMap() : map));
    }

    public C517500KRg(int i, int i2, String str, Throwable th, Map<String, String> map) {
        super(i, map);
        this.LIZLLL = i2;
        this.LJ = str;
        this.LJFF = th;
    }
}
