package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966610bGF extends C09AY implements Function0<C2182061Aaa> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966610bGF(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Aaa] */
    @Override // kotlin.jvm.functions.Function0
    public final C2182061Aaa invoke() {
        C965340bEC c965340bEC = this.LL;
        final C2181391AYv c2181391AYv = c965340bEC.LJIIZILJ;
        final C1276910jKj c1276910jKj = c965340bEC.LJFF.LJJI.LIZIZ;
        if (!(c1276910jKj instanceof InterfaceC2182071Aab)) {
            c1276910jKj = null;
        }
        return new InterfaceC947140akq(c2181391AYv, c1276910jKj) { // from class: X.1Aaa
            public final InterfaceC2182051AaZ LIZ;
            public final InterfaceC2182071Aab LIZIZ;

            @Override // X.InterfaceC947140akq
            public final void LIZIZ(String str) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LIZIZ(str);
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LIZLLL(String str) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LIZLLL(str);
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJI(JSONObject jSONObject) {
                InterfaceC2182051AaZ interfaceC2182051AaZ = this.LIZ;
                if (interfaceC2182051AaZ != null) {
                    C1AZ9 c1az9 = interfaceC2182051AaZ.LJII().LIZIZ;
                    int i = (int) c1az9.LIZIZ;
                    int i2 = (int) c1az9.LIZJ;
                    List<C1276580jKC> listLJI = interfaceC2182051AaZ.LJI();
                    if (interfaceC2182051AaZ instanceof InterfaceC1276590jKD) {
                        String strMixStream = ((InterfaceC1276590jKD) interfaceC2182051AaZ).mixStream(i, i2, listLJI);
                        C969430bKn c969430bKn = new C969430bKn();
                        c969430bKn.LIZJ = listLJI;
                        c969430bKn.LJ = jSONObject;
                        c969430bKn.LIZ = strMixStream;
                        InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                        if (interfaceC2182071Aab != null) {
                            interfaceC2182071Aab.LJIIIZ(c969430bKn);
                        }
                    }
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJII(String str) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LJJIJIL(str, 0.0f, false);
                }
            }

            {
                this.LIZ = c2181391AYv;
                this.LIZIZ = c1276910jKj;
            }

            @Override // X.InterfaceC947140akq
            public final void LIZJ(long j, String str) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LIZJ(j, str);
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJ(String str, String str2) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LJ(str, str2);
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJFF(String str, C947150akr c947150akr) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LJFF(str, c947150akr);
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJIIIIZZ(String str, JSONObject jSONObject) {
                InterfaceC2182051AaZ interfaceC2182051AaZ = this.LIZ;
                if (interfaceC2182051AaZ != null) {
                    C1AZ9 c1az9 = interfaceC2182051AaZ.LJII().LIZIZ;
                    int i = (int) c1az9.LIZIZ;
                    int i2 = (int) c1az9.LIZJ;
                    List<C1276580jKC> listLJI = interfaceC2182051AaZ.LJI();
                    if (interfaceC2182051AaZ instanceof InterfaceC1276590jKD) {
                        String strMixStream = ((InterfaceC1276590jKD) interfaceC2182051AaZ).mixStream(i, i2, listLJI);
                        C969430bKn c969430bKn = new C969430bKn();
                        c969430bKn.LIZIZ = str;
                        c969430bKn.LIZJ = listLJI;
                        c969430bKn.LJ = jSONObject;
                        c969430bKn.LIZ = strMixStream;
                        InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                        if (interfaceC2182071Aab != null) {
                            interfaceC2182071Aab.LJJIJIIJI(c969430bKn);
                        }
                    }
                }
            }

            @Override // X.InterfaceC947140akq
            public final void LJIJJ(String str, boolean z) {
                InterfaceC2182071Aab interfaceC2182071Aab = this.LIZIZ;
                if (interfaceC2182071Aab != null) {
                    interfaceC2182071Aab.LJIJJ(str, z);
                }
            }
        };
    }
}
