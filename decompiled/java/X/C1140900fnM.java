package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140900fnM {
    public final C2247551Cy1 LIZ = new InterfaceC1141390fo9() { // from class: X.1Cy1
        public final C2247541Cy0 LIZ = new C2247541Cy0();

        @Override // X.InterfaceC1141390fo9
        public final void d(String str, String str2) {
            this.LIZ.d(str, str2);
        }

        @Override // X.InterfaceC1141390fo9
        public final void e(String str, String str2) {
            this.LIZ.e(str, str2);
        }

        @Override // X.InterfaceC1141390fo9
        public final void i(String str, String str2) {
            this.LIZ.i(str, str2);
        }

        @Override // X.InterfaceC1141390fo9
        public final void e(String str, String str2, Throwable th) {
            this.LIZ.e(str, str2, th);
        }
    };
    public final InterfaceC1141280fny LIZIZ;
    public final InterfaceC1141030fnZ LIZJ;
    public final InterfaceC1862007Ra LIZLLL;
    public final InterfaceC1141190fnp LJ;
    public final InterfaceC2247071CxF LJFF;
    public final C1140920fnO LJI;
    public final InterfaceC1139050fkN LJII;
    public final InterfaceC1141000fnW LJIIIIZZ;
    public final InterfaceC1140810fnD LJIIIZ;
    public final InterfaceC1141550foP LJIIJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Cy1] */
    public C1140900fnM(C1140910fnN c1140910fnN) {
        this.LIZIZ = c1140910fnN.LIZ;
        InterfaceC1141030fnZ interfaceC1141030fnZ = c1140910fnN.LIZJ;
        this.LIZJ = interfaceC1141030fnZ == null ? new InterfaceC1141030fnZ() { // from class: X.0fnX
        } : interfaceC1141030fnZ;
        InterfaceC1862007Ra interfaceC1862007Ra = c1140910fnN.LJI;
        this.LIZLLL = interfaceC1862007Ra == null ? new InterfaceC1862007Ra() { // from class: X.07RZ
            @Override // X.InterfaceC1862007Ra
            public final void LIZ(String str, Map<String, String> map) {
            }

            @Override // X.InterfaceC1862007Ra
            public final HashMap<String, String> LIZIZ() {
                return new HashMap<>();
            }
        } : interfaceC1862007Ra;
        InterfaceC1141190fnp interfaceC1141190fnp = c1140910fnN.LJ;
        this.LJ = interfaceC1141190fnp == null ? new InterfaceC1141190fnp() { // from class: X.0fnR
            @Override // X.InterfaceC1141190fnp
            public final void LIZ(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1141190fnp
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1141190fnp
            public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC1141190fnp
            public final void LIZLLL(String str, Map map) {
            }

            @Override // X.InterfaceC1141190fnp
            public final void ensureNotReachHere(Throwable th, String str) {
            }

            @Override // X.InterfaceC1141190fnp
            public final InterfaceC1101410elf getOverloadScoreRetriever() {
                return null;
            }

            @Override // X.InterfaceC1141190fnp
            public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            }
        } : interfaceC1141190fnp;
        this.LJFF = c1140910fnN.LJII;
        C1140920fnO c1140920fnO = c1140910fnN.LIZLLL;
        this.LJI = c1140920fnO == null ? new C1140920fnO(new C1140930fnP()) : c1140920fnO;
        InterfaceC1139050fkN interfaceC1139050fkN = c1140910fnN.LJFF;
        this.LJII = interfaceC1139050fkN == null ? new InterfaceC1139050fkN() { // from class: X.0fkP
            @Override // X.InterfaceC1139050fkN
            public final JSONObject LIZ() {
                return null;
            }

            @Override // X.InterfaceC1139050fkN
            public final InterfaceC1139030fkL LIZIZ() {
                return null;
            }
        } : interfaceC1139050fkN;
        this.LJIIIIZZ = c1140910fnN.LIZIZ;
        this.LJIIIZ = c1140910fnN.LJIIIIZZ;
        this.LJIIJ = c1140910fnN.LJIIIZ;
    }
}
