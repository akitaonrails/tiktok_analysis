package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11NJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NJ implements InterfaceC420801kM, C11S3 {
    public C11NK<InterfaceC420801kM> LL;
    public volatile boolean LLILLJJLI;

    public final void LJ() {
        if (this.LLILLJJLI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return;
                }
                C11NK<InterfaceC420801kM> c11nk = this.LL;
                this.LL = null;
                LJFF(c11nk);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJI() {
        if (this.LLILLJJLI) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return 0;
                }
                C11NK<InterfaceC420801kM> c11nk = this.LL;
                return c11nk != null ? c11nk.LIZIZ : 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILLJJLI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return;
                }
                this.LLILLJJLI = true;
                C11NK<InterfaceC420801kM> c11nk = this.LL;
                this.LL = null;
                LJFF(c11nk);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI;
    }

    public static void LJFF(C11NK c11nk) throws Throwable {
        if (c11nk == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c11nk.LIZLLL) {
            if (obj instanceof InterfaceC420801kM) {
                try {
                    ((InterfaceC420801kM) obj).dispose();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C11SP.LIZ(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C11QG.LIZIZ((Throwable) ListProtector.get(arrayList, 0));
            }
            throw new C0VYA(arrayList);
        }
    }

    @Override // X.C11S3
    public final boolean LIZ(InterfaceC420801kM interfaceC420801kM) {
        C1701890uOB.LIZ(interfaceC420801kM, "d is null");
        if (!this.LLILLJJLI) {
            synchronized (this) {
                try {
                    if (!this.LLILLJJLI) {
                        C11NK<InterfaceC420801kM> c11nk = this.LL;
                        if (c11nk == null) {
                            c11nk = new C11NK<>(16, 0);
                            this.LL = c11nk;
                        }
                        c11nk.LIZ(interfaceC420801kM);
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        interfaceC420801kM.dispose();
        return false;
    }

    @Override // X.C11S3
    public final boolean LIZIZ(InterfaceC420801kM interfaceC420801kM) {
        C1701890uOB.LIZ(interfaceC420801kM, "Disposable item is null");
        if (this.LLILLJJLI) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI) {
                    return false;
                }
                C11NK<InterfaceC420801kM> c11nk = this.LL;
                if (c11nk == null || !c11nk.LIZIZ(interfaceC420801kM)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C11S3
    public final boolean LIZJ(InterfaceC420801kM interfaceC420801kM) {
        if (LIZIZ(interfaceC420801kM)) {
            interfaceC420801kM.dispose();
            return true;
        }
        return false;
    }

    public final void LIZLLL(InterfaceC420801kM... interfaceC420801kMArr) {
        C1701890uOB.LIZ(interfaceC420801kMArr, "ds is null");
        int i = 0;
        if (!this.LLILLJJLI) {
            synchronized (this) {
                try {
                    if (!this.LLILLJJLI) {
                        C11NK<InterfaceC420801kM> c11nk = this.LL;
                        if (c11nk == null) {
                            c11nk = new C11NK<>(interfaceC420801kMArr.length + 1, 0);
                            this.LL = c11nk;
                        }
                        int length = interfaceC420801kMArr.length;
                        while (i < length) {
                            InterfaceC420801kM interfaceC420801kM = interfaceC420801kMArr[i];
                            C1701890uOB.LIZ(interfaceC420801kM, "d is null");
                            c11nk.LIZ(interfaceC420801kM);
                            i++;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        int length2 = interfaceC420801kMArr.length;
        while (i < length2) {
            interfaceC420801kMArr[i].dispose();
            i++;
        }
    }
}
