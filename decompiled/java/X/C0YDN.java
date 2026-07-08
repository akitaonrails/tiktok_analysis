package X;

import android.util.Pair;
import com.bytedance.im.core.internal.link.handler.BatchGetMultiConversationParticipantsReadIndexHelper;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: renamed from: X.0YDN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDN implements InterfaceC870410YCp {
    public final C0YEM LIZ;
    public final C870860YEi LIZIZ;
    public final C0YI6 LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    @Override // X.InterfaceC870410YCp
    public final C0YDF LIZIZ() {
        return (C0YDF) this.LJFF.getValue();
    }

    @Override // X.InterfaceC870410YCp
    public final C0YC7 LIZJ() {
        return (C0YC7) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC870410YCp
    public final BatchGetMultiConversationParticipantsReadIndexHelper LJ() {
        return (BatchGetMultiConversationParticipantsReadIndexHelper) this.LJ.getValue();
    }

    @Override // X.InterfaceC870410YCp
    public final C870860YEi LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC870410YCp
    public final C0YI6 LIZLLL() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0YE2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0YLJ] */
    public C0YDN(final C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = new C870860YEi(this.LIZ);
        ?? r3 = new C0YIU(c0yem) { // from class: X.0YLJ
            public final C0YEM LIZ;

            {
                this.LIZ = c0yem;
            }

            @Override // X.C0YIU
            public final C871820YIa LIZIZ(Request request) {
                Pair pairLIZ = C0YLK.LIZ(this.LIZ, request);
                return new C871820YIa((String) pairLIZ.first, (byte[]) pairLIZ.second);
            }

            @Override // X.C0YIU
            public final Response LIZ(String str, byte[] bArr) throws C0YIJ {
                C0YEM c0yem2 = this.LIZ;
                if (bArr != null && bArr.length != 0) {
                    C868780Y6i c868780Y6iLIZLLL = c0yem2.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SSEncodeAndDecode decode length = ");
                    sbLIZ.append(bArr.length);
                    c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        if ("__lz4".equals(str)) {
                            if (c0yem2.LJIIIZ().LJJLIIIIJ.LJIJJ) {
                                bArr = C0YLK.LIZIZ(c0yem2, bArr);
                            } else if (bArr.length == 0) {
                                bArr = null;
                            } else {
                                try {
                                    bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
                                } catch (LZ4Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c0yem2.LIZLLL().LJIIIZ("SSEncodeAndDecode lz4Decompress", e);
                                    bArr = LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, 51200);
                                }
                            }
                        }
                        return Response.ADAPTER.decode(bArr);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c0yem2.LIZLLL().LJIIIZ("SSEncodeAndDecode decode", e2);
                        C0YIJ c0yij = new C0YIJ(-2003);
                        c0yij.setStackTrace(e2.getStackTrace());
                        throw c0yij;
                    }
                }
                throw new C0YIJ(-2005);
            }
        };
        ?? r2 = new C0YIE() { // from class: X.0YE2
            public final ConcurrentHashMap<Long, C05XL<Response>> LIZ = new ConcurrentHashMap<>(50);
            public final ConcurrentHashMap<Long, Unit> LIZIZ = new ConcurrentHashMap<>(50);

            @Override // X.C0YIE
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.C0YIE
            public final int LJFF() {
                return this.LIZ.size();
            }

            @Override // X.C0YIE
            public final void clear() {
                this.LIZ.clear();
                this.LIZIZ.clear();
            }

            @Override // X.C0YIE
            public final int LJ() {
                return LJFF() + LIZLLL();
            }

            @Override // X.C0YIE
            public final C05XL<Response> LIZIZ(long j) {
                if (this.LIZ.containsKey(Long.valueOf(j))) {
                    return this.LIZ.remove(Long.valueOf(j));
                }
                this.LIZIZ.remove(Long.valueOf(j));
                return null;
            }

            @Override // X.C0YIE
            public final void LIZJ(long j) {
                this.LIZIZ.put(Long.valueOf(j), Unit.LIZ);
            }

            @Override // X.C0YIE
            public final C05XL<Response> get(long j) {
                if (this.LIZ.containsKey(Long.valueOf(j))) {
                    return this.LIZ.get(Long.valueOf(j));
                }
                return null;
            }

            @Override // X.C0YIE
            public final void LIZ(long j, C099F c099f) {
                this.LIZ.put(Long.valueOf(j), c099f);
            }
        };
        this.LIZJ = new C0YI6(c0yem, r2, new C0YI7(c0yem, r2), r3);
        this.LIZLLL = C452501pT.LIZIZ(new C0YDM(this));
        this.LJ = C452501pT.LIZIZ(new C0YDO(this));
        this.LJFF = C452501pT.LIZIZ(new C0YDI(this));
    }
}
