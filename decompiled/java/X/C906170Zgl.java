package X;

import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamDataRepositoryImpl$persistToMsgKv$2", f = "StreamDataRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C906170Zgl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ StreamingResponseData LL;
    public final /* synthetic */ List<BlockUIData> LLILLJJLI;
    public final /* synthetic */ C0YVE LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906170Zgl(StreamingResponseData streamingResponseData, List<BlockUIData> list, C0YVE c0yve, String str, InterfaceC1364105Vn<? super C906170Zgl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streamingResponseData;
        this.LLILLJJLI = list;
        this.LLILLL = c0yve;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C906170Zgl(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        long jLongValue;
        Long lLJIILIIL2;
        C1C7U.LIZ("StreamDataRepositoryImpl@36bb.persistToMsgKv$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StreamingResponseData streamingResponseData = this.LL;
        String str = streamingResponseData.replyClientMessageId;
        List<BlockUIData> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BlockUIData blockUIData : list) {
            C906190Zgn c906190Zgn = new C906190Zgn();
            c906190Zgn.LIZLLL = blockUIData.blockId;
            c906190Zgn.LJ = EnumC906630ZhV.fromValue(blockUIData.replyType.getValue());
            c906190Zgn.LJFF = EnumC906560ZhO.fromValue(blockUIData.blockType.getValue());
            c906190Zgn.LJI = C906350Zh3.LIZLLL(blockUIData.content);
            c906190Zgn.LJII = EnumC906310Zgz.STREAM_BLOCK_ACTION_UPDATE;
            c906190Zgn.LJIIIIZZ = C906350Zh3.LIZJ(blockUIData.metadata);
            arrayList.add(C906350Zh3.LIZ(c906190Zgn.build()));
        }
        StreamingResponseData streamingResponseDataLIZ = StreamingResponseData.LIZ(streamingResponseData, arrayList, false, 32703);
        ProtoAdapter<C906250Zgt> protoAdapter = C906250Zgt.ADAPTER;
        C906180Zgm c906180Zgm = new C906180Zgm();
        c906180Zgm.LIZLLL = streamingResponseDataLIZ.sendClientMessageId;
        String str2 = streamingResponseDataLIZ.sendServerMessageId;
        Boolean boolValueOf = null;
        if (str2 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL = null;
        }
        c906180Zgm.LJ = lLJIILIIL;
        c906180Zgm.LJFF = streamingResponseDataLIZ.replyClientMessageId;
        String str3 = streamingResponseDataLIZ.replyServerMessageId;
        if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        c906180Zgm.LJI = Long.valueOf(jLongValue);
        c906180Zgm.LJII = Integer.valueOf(streamingResponseDataLIZ.messageType);
        c906180Zgm.LJIIIIZZ = streamingResponseDataLIZ.scene;
        List<StreamBlockComponent> list2 = streamingResponseDataLIZ.blocks;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (StreamBlockComponent streamBlockComponent : list2) {
            C906190Zgn c906190Zgn2 = new C906190Zgn();
            c906190Zgn2.LIZLLL = streamBlockComponent.blockId;
            c906190Zgn2.LJ = EnumC906630ZhV.fromValue(streamBlockComponent.replyType.getValue());
            c906190Zgn2.LJFF = EnumC906560ZhO.fromValue(streamBlockComponent.type.getValue());
            c906190Zgn2.LJI = C906350Zh3.LIZLLL(streamBlockComponent.content);
            c906190Zgn2.LJII = EnumC906310Zgz.fromValue(streamBlockComponent.action.getValue());
            c906190Zgn2.LJIIIIZZ = C906350Zh3.LIZJ(streamBlockComponent.metadata);
            arrayList2.add(c906190Zgn2.build());
        }
        C1516540pZE.LIZ(arrayList2);
        c906180Zgm.LJIIIZ = arrayList2;
        c906180Zgm.LJIIJ = Boolean.valueOf(streamingResponseDataLIZ.isFinish);
        c906180Zgm.LJIIJJI = Integer.valueOf(streamingResponseDataLIZ.seqId);
        c906180Zgm.LJIIL = Integer.valueOf(streamingResponseDataLIZ.firstSeqId);
        c906180Zgm.LJIILIIL = Boolean.valueOf(streamingResponseDataLIZ.resetContent);
        RetryInfoComponent retryInfoComponent = streamingResponseDataLIZ.retryInfo;
        if (retryInfoComponent != null) {
            C906220Zgq c906220Zgq = new C906220Zgq();
            c906220Zgq.LIZLLL = Boolean.valueOf(retryInfoComponent.retryable);
            c906220Zgq.LJ = EnumC906330Zh1.fromValue(retryInfoComponent.strategy.getValue());
            c906220Zgq.LJFF = Long.valueOf(retryInfoComponent.delayMs);
            c906220Zgq.LJI = Integer.valueOf(retryInfoComponent.maxRetries);
            c906180Zgm.LJIILJJIL = c906220Zgq.build();
        }
        c906180Zgm.LJIILL = Integer.valueOf(streamingResponseDataLIZ.errorCode);
        c906180Zgm.LJIILLIIL = streamingResponseDataLIZ.errorMessage;
        byte[] bArrEncode = protoAdapter.encode(c906180Zgm.build());
        this.LLILLL.getClass();
        InterfaceC870590YDh interfaceC870590YDhLJIIJ = C0YVE.LJIIJ();
        if (interfaceC870590YDhLJIIJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC870590YDhLJIIJ.LJJLIIIIJ(str, this.LLILZ, bArrEncode));
        }
        C1C7U.LIZIZ("StreamDataRepositoryImpl@36bb.persistToMsgKv$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
