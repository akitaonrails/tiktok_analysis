package X;

import Y.ACallableS245S0200000_13;
import android.os.CancellationSignal;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796850VNr implements C0LX1 {
    public final AbstractC796540VMm LIZ;
    public final C580780MqC LIZIZ;
    public final C796860VNs LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VNs] */
    public C796850VNr(final CreationAsyncTaskDatabase creationAsyncTaskDatabase) {
        this.LIZ = creationAsyncTaskDatabase;
        this.LIZIZ = new C580780MqC(creationAsyncTaskDatabase, 3);
        this.LIZJ = new AbstractC796320VLq<C0LXL>(creationAsyncTaskDatabase) { // from class: X.0VNs
            @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM `creation_async_task` WHERE `id` = ?";
            }

            @Override // X.AbstractC796320VLq
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0LXL c0lxl) {
                String str = c0lxl.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
            }
        };
    }

    @Override // X.C0LX1
    public final C095D LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM creation_async_task where id IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZ(this.LIZ, new String[]{"creation_async_task"}, new ACallableS245S0200000_13(this, c0vn5LIZLLL, 32));
    }

    @Override // X.C0LX1
    public final Object LIZIZ(C544360LWo c544360LWo) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM creation_async_task");
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 35), c544360LWo);
    }

    @Override // X.C0LX1
    public final C095D LJIIIIZZ(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM creation_async_task where creation_id IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZ(this.LIZ, new String[]{"creation_async_task"}, new ACallableS245S0200000_13(this, c0vn5LIZLLL, 34));
    }

    @Override // X.C0LX1
    public final C095D LJIIIZ(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM creation_async_task where id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZ(this.LIZ, new String[]{"creation_async_task"}, new ACallableS245S0200000_13(this, c0vn5LIZLLL, 31));
    }

    @Override // X.C0LX1
    public final Object LIZJ(List list, C544320LWk c544320LWk) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM creation_async_task where type IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 42), c544320LWk);
    }

    @Override // X.C0LX1
    public final Object LJ(String str, AbstractC23140094w abstractC23140094w) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM creation_async_task where parent_task_id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 39), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LJFF(String str, C544410LWt c544410LWt) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM creation_async_task where server_task_id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 40), c544410LWt);
    }

    @Override // X.C0LX1
    public final Object LJI(List list, AbstractC23140094w abstractC23140094w) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM creation_async_task where creation_id IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 33), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LJII(C0LXL c0lxl, AbstractC23140094w abstractC23140094w) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c0lxl, 37), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LJIIJ(List list, AbstractC23140094w abstractC23140094w) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM creation_async_task where id IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 30), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LJIIJJI(C0LXL c0lxl, AbstractC23140094w abstractC23140094w) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c0lxl, 36), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LJIIL(String str, AbstractC23140094w abstractC23140094w) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM creation_async_task where id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 38), abstractC23140094w);
    }

    @Override // X.C0LX1
    public final Object LIZLLL(String str, String str2, C544400LWs c544400LWs) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM creation_async_task where creation_id=? AND name LIKE '%' || ? || '%'");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 41), c544400LWs);
    }
}
