package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.130y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199422130y extends AbstractC19939512zx implements InterfaceC19922212xA<C199423130z> {
    public final C131C LLILLJJLI;
    public final String LLILLL;
    public final AbstractC19939512zx LLILZ;
    public final C199423130z[] LLILZIL;
    public final C199423130z[] LLILZLL;
    public final int LLIZ;
    public Map<Integer, WeakReference<C199423130z>> LLIZLLLIL;
    public ReferenceQueue<C199423130z> LLJ;

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZ.LJI();
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLJJLI.getName();
    }

    public final List<C199423130z> LJIJ() {
        return Collections.unmodifiableList(Arrays.asList(this.LLILZIL));
    }

    public final void LJIJI() {
        LJIIL(this.LLILLJJLI.getOptions().getFeatures());
        for (C199423130z c199423130z : this.LLILZIL) {
            c199423130z.LJIIL(c199423130z.LLILLL.getOptions().getFeatures());
        }
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19922212xA
    /* JADX INFO: renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public final C199423130z LIZJ(int i) {
        return (C199423130z) AnonymousClass1303.LIZ(this.LLILZLL, this.LLIZ, C199423130z.LLIZLLLIL, i);
    }

    public final C199423130z LJIIZILJ(int i) {
        C199423130z c199423130z;
        C199423130z c199423130zLIZJ = LIZJ(i);
        if (c199423130zLIZJ != null) {
            return c199423130zLIZJ;
        }
        synchronized (this) {
            try {
                if (this.LLJ != null) {
                    while (true) {
                        AnonymousClass1311 anonymousClass1311 = (AnonymousClass1311) this.LLJ.poll();
                        if (anonymousClass1311 == null) {
                            break;
                        }
                        ((HashMap) this.LLIZLLLIL).remove(Integer.valueOf(anonymousClass1311.LIZ));
                    }
                } else {
                    this.LLJ = new ReferenceQueue<>();
                    this.LLIZLLLIL = new HashMap();
                }
                WeakReference weakReference = (WeakReference) ((HashMap) this.LLIZLLLIL).get(Integer.valueOf(i));
                if (weakReference == null || (c199423130z = (C199423130z) weakReference.get()) == null) {
                    c199423130z = new C199423130z(this, Integer.valueOf(i));
                    ((HashMap) this.LLIZLLLIL).put(Integer.valueOf(i), new AnonymousClass1311(i, c199423130z));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c199423130z;
    }

    public C199422130y(C131C c131c, AnonymousClass1302 anonymousClass1302, AnonymousClass1301 anonymousClass1301) throws C19939612zy {
        if (anonymousClass1301 == null) {
            this.LLILZ = anonymousClass1302;
        } else {
            this.LLILZ = anonymousClass1301;
        }
        this.LLILLJJLI = c131c;
        this.LLILLL = AnonymousClass1303.LIZIZ(anonymousClass1302, anonymousClass1301, c131c.getName());
        if (c131c.getValueCount() != 0) {
            this.LLILZIL = new C199423130z[c131c.getValueCount()];
            int i = 0;
            for (int i2 = 0; i2 < c131c.getValueCount(); i2++) {
                this.LLILZIL[i2] = new C199423130z(c131c.getValue(i2), this, i2);
            }
            C199423130z[] c199423130zArr = (C199423130z[]) this.LLILZIL.clone();
            this.LLILZLL = c199423130zArr;
            Arrays.sort(c199423130zArr, C199423130z.LLIZ);
            for (int i3 = 1; i3 < c131c.getValueCount(); i3++) {
                C199423130z[] c199423130zArr2 = this.LLILZLL;
                C199423130z c199423130z = c199423130zArr2[i];
                C199423130z c199423130z2 = c199423130zArr2[i3];
                if (c199423130z.getNumber() != c199423130z2.getNumber()) {
                    i++;
                    this.LLILZLL[i] = c199423130z2;
                }
            }
            int i4 = i + 1;
            this.LLIZ = i4;
            Arrays.fill(this.LLILZLL, i4, c131c.getValueCount(), (Object) null);
            anonymousClass1302.LLJ.LIZIZ(this);
            return;
        }
        throw new C19939612zy(this, "Enums must contain at least one value.");
    }
}
