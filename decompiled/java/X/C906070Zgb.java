package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Zgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906070Zgb implements InterfaceC905630Zft {
    public final EnumC542860LQu LIZ;
    public final InterfaceC1493105sv LIZIZ;
    public final ConcurrentHashMap<String, C906080Zgc> LIZJ = new ConcurrentHashMap<>();
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 14)));

    @Override // X.InterfaceC905630Zft
    public final void LIZ() {
        Iterator it2 = C13LP.LLIIII(this.LIZJ.keySet()).iterator();
        while (it2.hasNext()) {
            LJFF((String) it2.next(), EnumC905780Zg8.CANCELLED, null, null, null, true, "conversation_exit");
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LIZIZ(String str) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc != null) {
            c906080Zgc.LJIIIZ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LIZLLL(String str) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc != null && c906080Zgc.LJIIJ == 0) {
            c906080Zgc.LJIIJ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LJII(String str) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc != null) {
            c906080Zgc.LJII = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LJIIIIZZ(String str) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc != null) {
            c906080Zgc.LJIIIIZZ = System.currentTimeMillis();
        }
    }

    public C906070Zgb(EnumC542860LQu enumC542860LQu, InterfaceC1493505sz interfaceC1493505sz) {
        this.LIZ = enumC542860LQu;
        this.LIZIZ = interfaceC1493505sz;
    }

    @Override // X.InterfaceC905630Zft
    public final void LJI(int i, String str) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc != null) {
            c906080Zgc.LJIIJJI = i;
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LIZJ(Long l, String str, String str2) {
        C906080Zgc c906080Zgc = this.LIZJ.get(str);
        if (c906080Zgc == null) {
            return;
        }
        if (str2 != null) {
            c906080Zgc.LJFF = str2;
        }
        if (l != null) {
            c906080Zgc.LJI = Long.valueOf(l.longValue());
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LJ(String str, String str2, long j, EnumC905800ZgA enumC905800ZgA, String str3, String str4, Long l) {
        C906080Zgc c906080Zgc = new C906080Zgc(str, str2, enumC905800ZgA, str3, System.currentTimeMillis());
        c906080Zgc.LJFF = str4;
        c906080Zgc.LJI = l;
        synchronized (this.LIZJ) {
            try {
                if (!this.LIZJ.containsKey(str)) {
                    this.LIZJ.put(str, c906080Zgc);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC905630Zft
    public final void LJFF(String str, EnumC905780Zg8 enumC905780Zg8, Integer num, Integer num2, String str2, boolean z, String str3) {
        C906080Zgc c906080ZgcRemove;
        long j;
        long j2;
        long j3;
        synchronized (this.LIZJ) {
            try {
                c906080ZgcRemove = this.LIZJ.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c906080ZgcRemove == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c906080ZgcRemove.LJII > 0 && c906080ZgcRemove.LJIIIIZZ > 0) {
            j = c906080ZgcRemove.LJIIIIZZ - c906080ZgcRemove.LJII;
        } else {
            j = 0;
        }
        if (c906080ZgcRemove.LJIIIZ > 0 && c906080ZgcRemove.LJIIJ > 0) {
            j2 = c906080ZgcRemove.LJIIJ - c906080ZgcRemove.LJIIIZ;
        } else {
            j2 = 0;
        }
        if (c906080ZgcRemove.LJIIIZ > 0) {
            j3 = jCurrentTimeMillis - c906080ZgcRemove.LJIIIZ;
        } else {
            j3 = 0;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C906060Zga(this, c906080ZgcRemove, enumC905780Zg8, num, num2, str2, z, str3, j, j2, j3, jCurrentTimeMillis - c906080ZgcRemove.LJ, null), 3);
    }
}
