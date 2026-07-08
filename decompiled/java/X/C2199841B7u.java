package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199841B7u implements InterfaceC2199921B8c {
    public static final ArrayList<String> LJIIIZ;
    public final String LIZ;
    public final List<HttpHeader> LIZIZ;
    public Map<String, String> LIZJ;
    public int LIZLLL;
    public long LJ;
    public final Object LJFF = new Object();
    public boolean LJI;
    public boolean LJII;
    public InterfaceC2199921B8c LJIIIIZZ;

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        LJIIIZ = arrayList;
        arrayList.add("Content-Length");
        arrayList.add("Content-Range");
        arrayList.add("Transfer-Encoding");
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    public final void LIZJ() {
        if (this.LIZJ != null) {
            return;
        }
        boolean z = true;
        try {
            this.LJII = true;
            this.LJIIIIZZ = C2199681B7e.LIZLLL(this.LIZ, this.LIZIZ, 0, false, null);
            synchronized (this.LJFF) {
                try {
                    if (this.LJIIIIZZ != null) {
                        HashMap map = new HashMap();
                        this.LIZJ = map;
                        LJ(this.LJIIIIZZ, map);
                        this.LIZLLL = this.LJIIIIZZ.LIZ();
                        this.LJ = System.currentTimeMillis();
                        int i = this.LIZLLL;
                        if (i < 200 || i >= 300) {
                            z = false;
                        }
                        this.LJI = z;
                    }
                    this.LJII = false;
                    this.LJFF.notifyAll();
                } finally {
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            synchronized (this.LJFF) {
                try {
                    if (this.LJIIIIZZ != null) {
                        HashMap map2 = new HashMap();
                        this.LIZJ = map2;
                        LJ(this.LJIIIIZZ, map2);
                        this.LIZLLL = this.LJIIIIZZ.LIZ();
                        this.LJ = System.currentTimeMillis();
                        int i2 = this.LIZLLL;
                        if (i2 < 200 || i2 >= 300) {
                            z = false;
                        }
                        this.LJI = z;
                    }
                    this.LJII = false;
                    this.LJFF.notifyAll();
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void LIZLLL() {
        synchronized (this.LJFF) {
            try {
                if (this.LJII && this.LIZJ == null) {
                    this.LJFF.wait();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2199921B8c
    public final void cancel() {
        InterfaceC2199921B8c interfaceC2199921B8c = this.LJIIIIZZ;
        if (interfaceC2199921B8c != null) {
            interfaceC2199921B8c.cancel();
        }
    }

    @Override // X.InterfaceC2199921B8c
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2199921B8c
    public final String LIZIZ(String str) {
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            return map.get(str);
        }
        InterfaceC2199921B8c interfaceC2199921B8c = this.LJIIIIZZ;
        if (interfaceC2199921B8c != null) {
            return interfaceC2199921B8c.LIZIZ(str);
        }
        return null;
    }

    public C2199841B7u(String str, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    public static void LJ(InterfaceC2199921B8c interfaceC2199921B8c, Map map) {
        if (interfaceC2199921B8c != null) {
            for (String str : LJIIIZ) {
                ((HashMap) map).put(str, interfaceC2199921B8c.LIZIZ(str));
            }
        }
    }
}
