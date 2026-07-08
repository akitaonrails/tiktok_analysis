package X;

import Y.AfS6S0100100_17;

/* JADX INFO: renamed from: X.11Lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487311Lz {
    public static void LIZ(AbstractC19486711Lt abstractC19486711Lt, final C11NJ c11nj, final C971780bOa c971780bOa, final C082100Sl c082100Sl, int i) {
        final C09JN c09jn = null;
        if ((i & 1) != 0) {
            c11nj = null;
        }
        if ((i & 2) != 0) {
            c971780bOa = null;
        }
        if ((i & 4) != 0) {
            c082100Sl = null;
        }
        abstractC19486711Lt.LIZIZ(new C11IY() { // from class: X.11JK
            public InterfaceC420801kM LL;

            @Override // X.C11IY
            public final void onComplete() {
                C11NJ c11nj2;
                InterfaceC781210Ukh interfaceC781210Ukh = c971780bOa;
                if (interfaceC781210Ukh != null) {
                    interfaceC781210Ukh.run();
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM == null || (c11nj2 = c11nj) == null) {
                    return;
                }
                c11nj2.LIZJ(interfaceC420801kM);
            }

            @Override // X.C11IY
            public final void onError(Throwable th) {
                C11NJ c11nj2;
                C09JN<? super Throwable> c09jn2 = c082100Sl;
                if (c09jn2 != null) {
                    c09jn2.accept(th);
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM != null && (c11nj2 = c11nj) != null) {
                    c11nj2.LIZJ(interfaceC420801kM);
                }
            }

            @Override // X.C11IY
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL = interfaceC420801kM;
                C11NJ c11nj2 = c11nj;
                if (c11nj2 != null) {
                    c11nj2.LIZ(interfaceC420801kM);
                }
                C09JN<? super InterfaceC420801kM> c09jn2 = c09jn;
                if (c09jn2 != null) {
                    c09jn2.accept(interfaceC420801kM);
                }
            }
        });
    }

    public static void LIZJ(AbstractC19484711Kz abstractC19484711Kz, final C11NJ c11nj, final C09JN c09jn, final C09JN c09jn2, int i) {
        final C09JN c09jn3 = null;
        if ((i & 1) != 0) {
            c11nj = null;
        }
        if ((i & 2) != 0) {
            c09jn = null;
        }
        if ((i & 4) != 0) {
            c09jn2 = null;
        }
        abstractC19484711Kz.LIZ(new InterfaceC19474811He<Object>() { // from class: X.0U7x
            public InterfaceC420801kM LL;

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                C11NJ c11nj2;
                C09JN<? super Throwable> c09jn4 = c09jn2;
                if (c09jn4 != null) {
                    c09jn4.accept(th);
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM != null && (c11nj2 = c11nj) != null) {
                    c11nj2.LIZJ(interfaceC420801kM);
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL = interfaceC420801kM;
                C11NJ c11nj2 = c11nj;
                if (c11nj2 != null) {
                    c11nj2.LIZ(interfaceC420801kM);
                }
                C09JN<? super InterfaceC420801kM> c09jn4 = c09jn3;
                if (c09jn4 != null) {
                    c09jn4.accept(interfaceC420801kM);
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Object obj) {
                C11NJ c11nj2;
                C09JN<Object> c09jn4 = c09jn;
                if (c09jn4 != null) {
                    c09jn4.accept(obj);
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM != null && (c11nj2 = c11nj) != null) {
                    c11nj2.LIZJ(interfaceC420801kM);
                }
            }
        });
    }

    public static void LIZIZ(C11NZ c11nz, C11NJ c11nj, C09JN c09jn, C09JN c09jn2, InterfaceC781210Ukh interfaceC781210Ukh, AfS6S0100100_17 afS6S0100100_17, int i) {
        final InterfaceC781210Ukh interfaceC781210Ukh2 = interfaceC781210Ukh;
        final C09JN c09jn3 = c09jn2;
        final C09JN c09jn4 = c09jn;
        final C11NJ c11nj2 = c11nj;
        final AfS6S0100100_17 afS6S0100100_172 = null;
        if ((i & 1) != 0) {
            c11nj2 = null;
        }
        if ((i & 2) != 0) {
            c09jn4 = null;
        }
        if ((i & 4) != 0) {
            c09jn3 = null;
        }
        if ((i & 8) != 0) {
            interfaceC781210Ukh2 = null;
        }
        if ((i & 16) == 0) {
            afS6S0100100_172 = afS6S0100100_17;
        }
        c11nz.LIZIZ(new InterfaceC626120Oh8<Object>() { // from class: X.11JJ
            public InterfaceC420801kM LL;

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                C11NJ c11nj3;
                InterfaceC781210Ukh interfaceC781210Ukh3 = interfaceC781210Ukh2;
                if (interfaceC781210Ukh3 != null) {
                    interfaceC781210Ukh3.run();
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM == null || (c11nj3 = c11nj2) == null) {
                    return;
                }
                c11nj3.LIZJ(interfaceC420801kM);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                C11NJ c11nj3;
                C09JN<? super Throwable> c09jn5 = c09jn3;
                if (c09jn5 != null) {
                    c09jn5.accept(th);
                }
                InterfaceC420801kM interfaceC420801kM = this.LL;
                if (interfaceC420801kM != null && (c11nj3 = c11nj2) != null) {
                    c11nj3.LIZJ(interfaceC420801kM);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                C09JN<Object> c09jn5 = c09jn4;
                if (c09jn5 != null) {
                    c09jn5.accept(obj);
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL = interfaceC420801kM;
                C11NJ c11nj3 = c11nj2;
                if (c11nj3 != null) {
                    c11nj3.LIZ(interfaceC420801kM);
                }
                C09JN<? super InterfaceC420801kM> c09jn5 = afS6S0100100_172;
                if (c09jn5 != null) {
                    c09jn5.accept(interfaceC420801kM);
                }
            }
        });
    }
}
