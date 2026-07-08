package X;

import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905330ZfP implements InterfaceC905380ZfU {
    public final /* synthetic */ InterfaceC905380ZfU LIZ;
    public final C09KU LIZIZ;
    public final C874890YTv LIZJ;
    public final C01GW LIZLLL;
    public final PersistentExtraData LJ;

    @Override // X.InterfaceC905380ZfU
    public final List<C09KT<?, ?>> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC905380ZfU
    public final List<C09KT<?, ?>> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC905380ZfU
    public final String getConversationId() {
        return this.LIZ.getConversationId();
    }

    @Override // X.InterfaceC905380ZfU
    public final Map<String, String> getExt() {
        return this.LIZ.getExt();
    }

    @Override // X.InterfaceC905380ZfU
    public final String getScene() {
        return this.LIZ.getScene();
    }

    @Override // X.InterfaceC905380ZfU
    public final Map<String, String> getLocalExt() {
        return (Map) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC905380ZfU
    public final PersistentExtraData LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC905380ZfU
    public final C09KU LIZJ() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0YTv] */
    public C905330ZfP(C905340ZfQ c905340ZfQ, String str, final C259800zU c259800zU, final StreamingSugarImpl streamingSugarImpl, final C099F c099f) {
        InterfaceC905380ZfU interfaceC905380ZfU = c905340ZfQ.LIZLLL;
        this.LIZ = interfaceC905380ZfU;
        C09KU c09kuLIZJ = interfaceC905380ZfU.LIZJ();
        this.LIZIZ = c09kuLIZJ == null ? new C09KU() { // from class: X.0Yck
            @Override // X.C09KU
            public final void LIZ(long j, String str2) {
            }

            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C09KU
            public final void LJFF(int i, String str2, String str3) {
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
            }

            @Override // X.C09KU
            public final void LJIIIIZZ(String str2) {
            }
        } : c09kuLIZJ;
        this.LIZJ = new C09KU() { // from class: X.0YTv
            public final /* synthetic */ C09KU LIZ;

            @Override // X.C09KU
            public final void LIZ(long j, String str2) {
                this.LIZ.LIZ(j, str2);
            }

            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                this.LIZ.LIZIZ(c0y8t, list, map);
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                this.LIZ.LIZJ(c0y8t, list);
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                this.LIZ.LJ(c0y8t, c869590Y9l);
            }

            @Override // X.C09KU
            public final void LJFF(int i, String str2, String str3) {
                this.LIZ.LJFF(i, str2, str3);
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                this.LIZ.LJII(c0y8t, c869590Y9l, c0ymw);
            }

            @Override // X.C09KU
            public final void LJIIIIZZ(String str2) {
                this.LIZ.LJIIIIZZ(str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                T uuid;
                String uuid2;
                this.LIZIZ.LIZIZ.LIZLLL(c0y8t, c869590Y9l);
                if (c869590Y9l != null && (uuid2 = c869590Y9l.getUuid()) != null) {
                    streamingSugarImpl.LLILZ.put(uuid2, c099f);
                }
                C259800zU<String> c259800zU2 = c259800zU;
                if (c869590Y9l != null) {
                    uuid = c869590Y9l.getUuid();
                } else {
                    uuid = 0;
                }
                c259800zU2.element = uuid;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                T uuid;
                String uuid2;
                this.LIZIZ.LIZIZ.LJI(c0y8t, c869590Y9l);
                if (c869590Y9l != null && (uuid2 = c869590Y9l.getUuid()) != null) {
                    streamingSugarImpl.LLILZ.put(uuid2, c099f);
                }
                C259800zU<String> c259800zU2 = c259800zU;
                if (c869590Y9l != null) {
                    uuid = c869590Y9l.getUuid();
                } else {
                    uuid = 0;
                }
                c259800zU2.element = uuid;
            }

            {
                this.LIZ = this.LIZIZ.LIZIZ;
            }
        };
        this.LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(c905340ZfQ, 1047));
        PersistentExtraData persistentExtraDataLIZIZ = c905340ZfQ.LIZLLL.LIZIZ();
        persistentExtraDataLIZIZ = persistentExtraDataLIZIZ == null ? new PersistentExtraData(0) : persistentExtraDataLIZIZ;
        this.LJ = new PersistentExtraData(persistentExtraDataLIZIZ.sessionId, persistentExtraDataLIZIZ.trackInfo, persistentExtraDataLIZIZ.preEntranceType, persistentExtraDataLIZIZ.bubbleStyleId, new ReplySourcePayloadData(str, 3), persistentExtraDataLIZIZ.botFeedback, persistentExtraDataLIZIZ.featureAttachment);
    }
}
