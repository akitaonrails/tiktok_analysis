package X;

import X.InterfaceC1618170sD9;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.0PW6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PW6<T extends InterfaceC1618170sD9<T>> {
    public final T LIZ;
    public final String LIZIZ;
    public T LIZJ;
    public final Keva LIZLLL;
    public final Gson LJ;

    public C0PW6(T t) {
        this.LIZ = t;
        String string = C13LE.LIZ(t.getClass()).toString();
        this.LIZIZ = string;
        this.LIZJ = t;
        this.LIZLLL = Keva.getRepo(string);
        this.LJ = C7740030o.LIZ().getGson();
    }
}
