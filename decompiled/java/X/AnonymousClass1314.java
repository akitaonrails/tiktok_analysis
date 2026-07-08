package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1314, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1314 extends AbstractC19933312yx<AnonymousClass1315, AnonymousClass1314> implements InterfaceC199417130t {
    public int LLILZLL;
    public List<AnonymousClass1316> LLIZ;
    public C130M<AnonymousClass1316, AnonymousClass1317, C131B> LLIZLLLIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJLIIIIJ;
        c19935812zM.LIZ(AnonymousClass1315.class, AnonymousClass1314.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass1315 buildPartial() {
        AnonymousClass1315 anonymousClass1315 = new AnonymousClass1315(this);
        C130M<AnonymousClass1316, AnonymousClass1317, C131B> c130m = this.LLIZLLLIL;
        if (c130m == null) {
            if ((this.LLILZLL & 1) != 0) {
                this.LLIZ = Collections.unmodifiableList(this.LLIZ);
                this.LLILZLL &= -2;
            }
            anonymousClass1315.location_ = this.LLIZ;
        } else {
            anonymousClass1315.location_ = c130m.LIZLLL();
        }
        LJIILL();
        return anonymousClass1315;
    }

    public AnonymousClass1314() {
        this.LLIZ = Collections.emptyList();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        AnonymousClass1315 anonymousClass1315BuildPartial = buildPartial();
        if (anonymousClass1315BuildPartial.isInitialized()) {
            return anonymousClass1315BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1315BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return AnonymousClass1315.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return LJIJJLI();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJLI;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        AnonymousClass1315 anonymousClass1315BuildPartial = buildPartial();
        if (anonymousClass1315BuildPartial.isInitialized()) {
            return anonymousClass1315BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1315BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return AnonymousClass1315.getDefaultInstance();
    }

    public AnonymousClass1314(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZ = Collections.emptyList();
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1315) {
            LJJIII((AnonymousClass1315) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIII(AnonymousClass1315 anonymousClass1315) {
        if (anonymousClass1315 == AnonymousClass1315.getDefaultInstance()) {
            return;
        }
        if (this.LLIZLLLIL == null) {
            if (!anonymousClass1315.location_.isEmpty()) {
                if (this.LLIZ.isEmpty()) {
                    this.LLIZ = anonymousClass1315.location_;
                    this.LLILZLL &= -2;
                } else {
                    if ((this.LLILZLL & 1) == 0) {
                        this.LLIZ = new ArrayList(this.LLIZ);
                        this.LLILZLL |= 1;
                    }
                    this.LLIZ.addAll(anonymousClass1315.location_);
                }
                LJIILLIIL();
            }
        } else if (!anonymousClass1315.location_.isEmpty()) {
            if (this.LLIZLLLIL.LJII()) {
                C130M<AnonymousClass1316, AnonymousClass1317, C131B> c130m = null;
                this.LLIZLLLIL.LIZ = null;
                this.LLIZLLLIL = null;
                List<AnonymousClass1316> list = anonymousClass1315.location_;
                this.LLIZ = list;
                this.LLILZLL &= -2;
                if (k0.alwaysUseFieldBuilders) {
                    C130M<AnonymousClass1316, AnonymousClass1317, C131B> c130m2 = new C130M<>(list, LJIIJJI(), this.LLILLL);
                    this.LLIZLLLIL = c130m2;
                    this.LLIZ = null;
                    c130m = c130m2;
                }
                this.LLIZLLLIL = c130m;
            } else {
                this.LLIZLLLIL.LIZIZ(anonymousClass1315.location_);
            }
        }
        LJIL(anonymousClass1315);
        LJFF(anonymousClass1315.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1315) {
            LJJIII((AnonymousClass1315) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJ(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIIJ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 10) {
                        if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                            break;
                        }
                    } else {
                        AnonymousClass1316 anonymousClass1316 = (AnonymousClass1316) abstractC19927312xz.LJJ(AnonymousClass1316.parser(), c19926312xp);
                        C130M<AnonymousClass1316, AnonymousClass1317, C131B> c130m = this.LLIZLLLIL;
                        if (c130m == null) {
                            if ((this.LLILZLL & 1) == 0) {
                                this.LLIZ = new ArrayList(this.LLIZ);
                                this.LLILZLL = 1 | this.LLILZLL;
                            }
                            this.LLIZ.add(anonymousClass1316);
                        } else {
                            c130m.LIZJ(anonymousClass1316);
                        }
                    }
                } catch (C19926612xs e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIILLIIL();
                throw th;
            }
        }
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJ(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJ(abstractC19927312xz, c19926312xp);
        return this;
    }
}
