package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19925912xl {
    public AbstractC19922812xG LIZ;
    public final C19926312xp LIZIZ;
    public volatile InterfaceC19925612xi LIZJ;
    public volatile AbstractC19922812xG LIZLLL;
    public volatile boolean LJ;

    public int hashCode() {
        return 1;
    }

    public final int LIZ() {
        int size;
        if (this.LIZLLL != null) {
            size = this.LIZLLL.size();
        } else {
            AbstractC19922812xG abstractC19922812xG = this.LIZ;
            size = abstractC19922812xG != null ? abstractC19922812xG.size() : this.LIZJ != null ? this.LIZJ.getSerializedSize() : 0;
        }
        return AbstractC19928912yF.LJIILIIL(size) + size;
    }

    public final AbstractC19922812xG LIZJ() {
        if (this.LIZLLL != null) {
            return this.LIZLLL;
        }
        AbstractC19922812xG abstractC19922812xG = this.LIZ;
        if (abstractC19922812xG != null) {
            return abstractC19922812xG;
        }
        synchronized (this) {
            try {
                if (this.LIZLLL != null) {
                    return this.LIZLLL;
                }
                if (this.LIZJ == null) {
                    this.LIZLLL = AbstractC19922812xG.EMPTY;
                } else {
                    this.LIZLLL = this.LIZJ.toByteString();
                }
                return this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C19925912xl() {
    }

    public final InterfaceC19925612xi LIZIZ(InterfaceC19925612xi interfaceC19925612xi) {
        if (this.LIZJ == null) {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        try {
                            if (this.LIZ != null) {
                                this.LIZJ = interfaceC19925612xi.getParserForType().LIZ(this.LIZ, this.LIZIZ);
                                this.LIZLLL = this.LIZ;
                            } else {
                                this.LIZJ = interfaceC19925612xi;
                                this.LIZLLL = AbstractC19922812xG.EMPTY;
                            }
                        } catch (C19926612xs e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LJ = true;
                            this.LIZJ = interfaceC19925612xi;
                            this.LIZLLL = AbstractC19922812xG.EMPTY;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19925912xl)) {
            return false;
        }
        C19925912xl c19925912xl = (C19925912xl) obj;
        InterfaceC19925612xi interfaceC19925612xi = this.LIZJ;
        InterfaceC19925612xi interfaceC19925612xi2 = c19925912xl.LIZJ;
        if (interfaceC19925612xi == null) {
            if (interfaceC19925612xi2 == null) {
                return LIZJ().equals(c19925912xl.LIZJ());
            }
            return LIZIZ(interfaceC19925612xi2.getDefaultInstanceForType()).equals(interfaceC19925612xi2);
        }
        if (interfaceC19925612xi2 != null) {
            return interfaceC19925612xi.equals(interfaceC19925612xi2);
        }
        return interfaceC19925612xi.equals(c19925912xl.LIZIZ(interfaceC19925612xi.getDefaultInstanceForType()));
    }

    public C19925912xl(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        if (c19926312xp != null) {
            if (abstractC19922812xG != null) {
                this.LIZIZ = c19926312xp;
                this.LIZ = abstractC19922812xG;
                return;
            }
            throw new NullPointerException("found null ByteString");
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }
}
