package X;

import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.api.WSManagerComponentApi;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWJ implements InterfaceC870750YDx {
    public final GECPigeon LIZ;
    public final C0YWO LIZIZ;
    public final C01GW LIZJ;
    public PigeonIMLoginStateComponentApi LIZLLL;
    public final C0YWK LJ;
    public final C0YWL LJFF;
    public final C0YWM LJI;
    public final C874640YSw LJII;
    public final C0YLI LJIIIIZZ;
    public final C0YWP LJIIIZ;
    public final C0YWP LJIIJ;

    @Override // X.InterfaceC870750YDx
    public final C0YKM LIZJ() {
        return null;
    }

    public final PigeonIMLoginStateComponentApi LJFF() {
        if (this.LIZLLL == null) {
            this.LIZLLL = (PigeonIMLoginStateComponentApi) C0YXD.LIZLLL(this.LIZ, C13LE.LIZ(PigeonIMLoginStateComponentApi.class));
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YIC LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YF1 LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC870750YDx
    public final C0Y2W LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC870750YDx
    public final InterfaceC870790YEb LJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YJ8 getEvent() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC870750YDx
    public final InterfaceC868790Y6j getLog() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC870750YDx
    public final C0Y8P getMessage() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0YWK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YWM] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0YSw] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0YLI] */
    public C0YWJ(GECPigeon gECPigeon, C0YWO c0ywo) {
        this.LIZ = gECPigeon;
        this.LIZIZ = c0ywo;
        C0YWP c0ywp = new C0YWP(gECPigeon);
        this.LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1457));
        this.LJ = new C0YIC() { // from class: X.0YWK
            @Override // X.C0YIC
            public final Integer LIZ() {
                return null;
            }

            @Override // X.C0YIC
            public final boolean LIZIZ() {
                return C786580UtM.LIZ(this.LIZ.LJFF.getApplicationContext());
            }

            @Override // X.C0YIC
            public final boolean isWsConnected() {
                return ((WSManagerComponentApi) this.LIZ.LIZJ.getValue()).isWsConnected();
            }

            @Override // X.C0YIC
            public final Map<String, String> LIZJ() {
                return C2097608Jq.LJ();
            }

            @Override // X.C0YIC
            @InterfaceC1294060jmO
            public final Map<String, String> LJ(int i) {
                return C2097608Jq.LJ();
            }

            @Override // X.C0YIC
            public final void LJFF(C0YIS c0yis, InterfaceC874620YSu interfaceC874620YSu, boolean z) {
                this.LIZ.LIZIZ.LJ(c0yis, interfaceC874620YSu);
            }

            @Override // X.C0YIC
            public final void LIZLLL(long j, String str, byte[] bArr, int i, int i2) {
                int i3;
                C2252321DDq c2252321DDqLJJJJI;
                C0YWT c0ywt;
                PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApiLJFF = this.LIZ.LJFF();
                if (pigeonIMLoginStateComponentApiLJFF != null && (c2252321DDqLJJJJI = pigeonIMLoginStateComponentApiLJFF.LJJJJI()) != null && (c0ywt = (C0YWT) c2252321DDqLJJJJI.getValue()) != null) {
                    i3 = c0ywt.LJIIJ;
                } else {
                    i3 = 0;
                }
                ((WSManagerComponentApi) this.LIZ.LIZJ.getValue()).LJJJLZIJ(new C0YXQ(j, i3, str, str, bArr, i, i2));
            }
        };
        this.LJFF = new C0YWL(this);
        this.LJI = new C0YF1() { // from class: X.0YWM
            @Override // X.C0YF1
            public final void LIZ() {
            }

            @Override // X.C0YF1
            public final Boolean LIZIZ() {
                return null;
            }

            @Override // X.C0YF1
            public final C0YEV LIZJ(final String str) {
                return new C0YEV(str) { // from class: X.0YWV
                    public final String LIZ;
                    public final C0YWW LIZIZ;

                    @Override // X.C0YEV
                    public final void clearAll() {
                        this.LIZIZ.LIZ(this.LIZ);
                    }

                    {
                        this.LIZ = str;
                        GECPigeon.Companion.getClass();
                        this.LIZIZ = C872060YIy.LIZ().LIZIZ();
                    }

                    @Override // X.C0YEV
                    public final boolean getBoolean(String str2) {
                        return this.LIZIZ.LJI(this.LIZ, str2);
                    }

                    @Override // X.C0YEV
                    public final int getInt(String str2) {
                        return this.LIZIZ.LIZJ(this.LIZ, str2);
                    }

                    @Override // X.C0YEV
                    public final void LIZ(Long l, String str2) {
                        this.LIZIZ.LIZLLL(l, this.LIZ, str2);
                    }

                    @Override // X.C0YEV
                    public final long LIZIZ(Long l, String str2) {
                        return this.LIZIZ.LJIIIIZZ(l, this.LIZ, str2);
                    }

                    @Override // X.C0YEV
                    public final String getString(String str2, String str3) {
                        return this.LIZIZ.LJII(this.LIZ, str2, str3);
                    }

                    @Override // X.C0YEV
                    public final void putBoolean(String str2, boolean z) {
                        this.LIZIZ.LJFF(this.LIZ, str2, z);
                    }

                    @Override // X.C0YEV
                    public final void putInt(String str2, int i) {
                        this.LIZIZ.LIZIZ(i, this.LIZ, str2);
                    }

                    @Override // X.C0YEV
                    public final void putString(String str2, String str3) {
                        this.LIZIZ.LJ(this.LIZ, str2, str3);
                    }
                };
            }
        };
        this.LJII = new C0Y2W() { // from class: X.0YSw
            @Override // X.C0Y2W
            public final void LIZ() {
            }

            @Override // X.C0Y2W
            public final C0Y2X LIZJ() {
                return null;
            }
        };
        this.LJIIIIZZ = new C0Y8P() { // from class: X.0YLI
            @Override // X.C0Y8P
            @InterfaceC1294060jmO
            public final boolean LIZ(int i, int i2, Map<String, ? extends Object> map) {
                return false;
            }

            @Override // X.C0Y8P
            public final ReceiveMsgPerfTracker LJFF() {
                return null;
            }

            @Override // X.C0Y8P
            public final Set<Integer> LIZLLL() {
                return C08CX.INSTANCE;
            }

            @Override // X.C0Y8P
            @InterfaceC1294060jmO
            public final String LIZIZ(C869590Y9l c869590Y9l) {
                return c869590Y9l.getContent();
            }

            @Override // X.C0Y8P
            @InterfaceC1294060jmO
            public final ByteString LIZJ(C869590Y9l c869590Y9l) {
                return c869590Y9l.getContentPB();
            }
        };
        this.LJIIIZ = c0ywp;
        this.LJIIJ = c0ywp;
    }
}
