package X;

import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905370ZfT implements C09KT<Pair<? extends BaseTemplate, ? extends List<? extends C0YC6>>, Integer> {
    public final InterfaceC905380ZfU LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(236));

    public C905370ZfT(InterfaceC905380ZfU interfaceC905380ZfU) {
        this.LIZ = interfaceC905380ZfU;
    }

    @Override // X.C09KT
    public final Object LIZ(Object obj, C874520YSk c874520YSk) {
        ByteString byteStringLJIJJ;
        C905460Zfc c905460ZfcBuild;
        C905540Zfk c905540ZfkBuild;
        C905440Zfa c905440ZfaBuild;
        Pair pair = (Pair) obj;
        BaseTemplate baseTemplate = (BaseTemplate) pair.getFirst();
        List list = (List) pair.getSecond();
        C0YHS c0yhsLIZ = C882760Yk6.LIZ(C882760Yk6.LIZ);
        ByteString byteStringEncode = baseTemplate.encode();
        String conversationId = this.LIZ.getConversationId();
        int messageType = baseTemplate.getMessageType();
        String scene = this.LIZ.getScene();
        Map<String, String> ext = this.LIZ.getExt();
        Map<String, String> localExt = this.LIZ.getLocalExt();
        PersistentExtraData persistentExtraDataLIZIZ = this.LIZ.LIZIZ();
        if (persistentExtraDataLIZIZ != null) {
            C1496690p3D c1496690p3D = new C1496690p3D();
            ProtoAdapter<C905470Zfd> protoAdapter = C905470Zfd.ADAPTER;
            C905560Zfm c905560Zfm = new C905560Zfm();
            c905560Zfm.LIZLLL = persistentExtraDataLIZIZ.sessionId;
            TrackInfoData trackInfoData = persistentExtraDataLIZIZ.trackInfo;
            if (trackInfoData != null) {
                C905600Zfq c905600Zfq = new C905600Zfq();
                C905390ZfV c905390ZfV = new C905390ZfV();
                c905390ZfV.LIZLLL = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasCaptionMode);
                c905390ZfV.LJ = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasTextMode);
                c905390ZfV.LJFF = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasStickerMode);
                c905390ZfV.LJI = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasPostPage);
                c905390ZfV.LJII = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasStoryMentionAfterPublishSharePanel);
                c905390ZfV.LJIIIIZZ = Boolean.valueOf(trackInfoData.mentionMsgExtra.hasStoryMentionAfterPublishFeedBottom);
                c905600Zfq.LIZLLL = c905390ZfV.build();
                c905460ZfcBuild = c905600Zfq.build();
            } else {
                c905460ZfcBuild = null;
            }
            c905560Zfm.LJ = c905460ZfcBuild;
            c905560Zfm.LJI = persistentExtraDataLIZIZ.preEntranceType;
            Long l = persistentExtraDataLIZIZ.bubbleStyleId;
            if (l != null) {
                long jLongValue = l.longValue();
                C905610Zfr c905610Zfr = new C905610Zfr();
                c905610Zfr.LIZLLL = Long.valueOf(jLongValue);
                c905540ZfkBuild = c905610Zfr.build();
            } else {
                c905540ZfkBuild = null;
            }
            c905560Zfm.LJIIIZ = c905540ZfkBuild;
            ReplySourcePayloadData replySourcePayloadData = persistentExtraDataLIZIZ.replySourcePayload;
            if (replySourcePayloadData != null) {
                C905580Zfo c905580Zfo = new C905580Zfo();
                c905580Zfo.LIZLLL = Long.valueOf(replySourcePayloadData.replySourceMsgId);
                c905580Zfo.LJ = replySourcePayloadData.replySourceUniqueId;
                c905580Zfo.LJFF = replySourcePayloadData.clientMessageIdForReply;
                c905440ZfaBuild = c905580Zfo.build();
            } else {
                c905440ZfaBuild = null;
            }
            c905560Zfm.LJIIJ = c905440ZfaBuild;
            protoAdapter.encode(c1496690p3D, c905560Zfm.build());
            byteStringLJIJJ = c1496690p3D.LJIJJ();
        } else {
            byteStringLJIJJ = null;
        }
        c0yhsLIZ.LIZJ(new C873500YOm((C0YHT) new C0YP1(byteStringEncode, conversationId, messageType, list, scene, ext, localExt, null, null, byteStringLJIJJ, 6688), (List<? extends AbstractC873650YPb>) C1697810uHb.LJIIJJI(new AbstractC873650YPb() { // from class: X.0YSi
            {
                super("im-send-message-service-transform");
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0YPo] */
            @Override // X.AbstractC873650YPb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(final X.C873910YQb r10, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof X.C874490YSh
                    if (r0 == 0) goto L5e
                    r7 = r11
                    X.0YSh r7 = (X.C874490YSh) r7
                    int r2 = r7.LLILZ
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L5e
                    int r2 = r2 - r1
                    r7.LLILZ = r2
                L12:
                    java.lang.Object r1 = r7.LLILLJJLI
                    java.lang.Object r6 = X.C099R.LJFF()
                    int r0 = r7.LLILZ
                    r8 = 1
                    if (r0 == 0) goto L27
                    if (r0 != r8) goto L64
                    X.00zU r4 = r7.LL
                    X.C155000ia.LIZIZ(r1)
                L24:
                    T r0 = r4.element
                    return r0
                L27:
                    X.C155000ia.LIZIZ(r1)
                    X.0ZfT r0 = r9.LIZIZ
                    X.0ZfU r0 = r0.LIZ
                    java.util.List r1 = r0.LIZLLL()
                    X.0YSj r0 = new X.0YSj
                    r0.<init>()
                    java.util.List r5 = X.C13LP.LJLILLLLZI(r0, r1)
                    X.00zU r4 = new X.00zU
                    r4.<init>()
                    X.0YPo r0 = X.C873780YPo.LIZ
                    r4.element = r0
                    X.0YSg r3 = new X.0YSg
                    r0 = 0
                    r3.<init>(r0)
                    kotlin.jvm.internal.AwS223S0300000_14 r2 = new kotlin.jvm.internal.AwS223S0300000_14
                    X.0ZfT r1 = r9.LIZIZ
                    r0 = 8
                    r2.<init>(r1, r10, r4, r0)
                    r7.LL = r4
                    r7.LLILZ = r8
                    java.lang.Object r0 = X.C874530YSl.LIZ(r5, r3, r2, r7)
                    if (r0 != r6) goto L24
                    return r6
                L5e:
                    X.0YSh r7 = new X.0YSh
                    r7.<init>(r9, r11)
                    goto L12
                L64:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C874500YSi.LIZ(X.0YQb, X.05Vn):java.lang.Object");
            }
        }, new AbstractC873650YPb() { // from class: X.0YTU
            {
                super("im-send-message-service-on-send-start");
            }

            @Override // X.AbstractC873650YPb
            public final Object LIZ(C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
                C09KU c09kuLIZJ = this.LIZIZ.LIZ.LIZJ();
                if (c09kuLIZJ != null) {
                    c09kuLIZJ.LIZLLL(c873910YQb.LIZIZ, c873910YQb.LIZ);
                }
                return C873780YPo.LIZ;
            }
        }), (Function2<? super C0Y8T, ? super C869590Y9l, Unit>) new AwS628S0100000_14(this, 28), new C0YOY() { // from class: X.0YTV
            @Override // X.C0YOY
            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                C09KU c09kuLIZJ;
                if (interfaceC873750YPl instanceof C0YQY) {
                    C09KU c09kuLIZJ2 = this.LIZ.LIZ.LIZJ();
                    if (c09kuLIZJ2 != null) {
                        C0YQY c0yqy = (C0YQY) interfaceC873750YPl;
                        c09kuLIZJ2.LJI(c0yqy.LIZ, c0yqy.LIZIZ);
                        return;
                    }
                    return;
                }
                if (interfaceC873750YPl instanceof C0YPL) {
                    C09KU c09kuLIZJ3 = this.LIZ.LIZ.LIZJ();
                    if (c09kuLIZJ3 == null) {
                        return;
                    }
                    C0YPL c0ypl = (C0YPL) interfaceC873750YPl;
                    c09kuLIZJ3.LJ(c0ypl.LIZ, c0ypl.LIZIZ);
                    return;
                }
                if (!(interfaceC873750YPl instanceof C0YQ0) || (c09kuLIZJ = this.LIZ.LIZ.LIZJ()) == null) {
                    return;
                }
                C0YQ0 c0yq0 = (C0YQ0) interfaceC873750YPl;
                c09kuLIZJ.LJII(c0yq0.LIZ, c0yq0.LIZIZ, c0yq0.LIZJ.toIMError());
            }
        }, (C0Y3I) this.LIZIZ.getValue(), true));
        return C2286608xc.LJ(0);
    }
}
