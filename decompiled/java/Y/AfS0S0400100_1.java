package Y;

import X.C09AJ;
import X.C09JN;
import X.C0POE;
import X.C1515820pY4;
import X.C19482611Ke;
import X.C1C7U;
import X.C238400w2;
import X.C857603Ws;
import X.C994803uk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChunkDebugInfo;
import com.ss.android.ugc.tiktok.ConvertHelper;

/* JADX INFO: loaded from: classes2.dex */
public class AfS0S0400100_1 implements C09JN {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0400100_1 afS0S0400100_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1$1");
        final C857603Ws c857603Ws = (C857603Ws) afS0S0400100_1.l0;
        final C09AJ c09aj = (C09AJ) afS0S0400100_1.l1;
        final C238400w2 c238400w2 = (C238400w2) afS0S0400100_1.l2;
        final long j = afS0S0400100_1.j4;
        final BillInfoRequest billInfoRequest = (BillInfoRequest) afS0S0400100_1.l3;
        ((C1515820pY4) obj).LIZLLL(new C0POE<BillInfoResponse>() { // from class: X.03Wu
            @Override // X.C0POE
            public final void onComplete() {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onComplete");
                c09aj.onComplete();
                C857603Ws c857603Ws2 = c857603Ws;
                C857603Ws.LJ(c857603Ws2.LIZLLL, c857603Ws2.LIZJ, System.currentTimeMillis() - j);
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed, ");
                sbLIZ.append(th.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                c09aj.onError(th);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C03O0 c03o0 = C03O0.LIZ;
                String message = th.getMessage();
                Long lValueOf = Long.valueOf(jCurrentTimeMillis - j);
                Boolean firstLoad = billInfoRequest.getFirstLoad();
                c03o0.getClass();
                C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0POE
            public final void onNext(BillInfoResponse billInfoResponse) {
                String str;
                Boolean bool;
                Boolean bool2;
                BillInfoResponse billInfoResponse2 = billInfoResponse;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onNext: ");
                sbLIZ.append(billInfoResponse2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                C857603Ws c857603Ws2 = c857603Ws;
                BillInfoData billInfoData = (BillInfoData) billInfoResponse2.data;
                if (billInfoData == null || (str = billInfoData.requestId) == null) {
                    str = c857603Ws2.LIZLLL;
                }
                c857603Ws2.LIZLLL = str;
                BillInfoResponse billInfoResponse3 = c857603Ws2.LIZJ;
                if (billInfoResponse3 == null) {
                    billInfoResponse3 = billInfoResponse2;
                }
                c857603Ws2.LIZJ = billInfoResponse3.mergeChunk(billInfoResponse2);
                BillInfoData billInfoData2 = (BillInfoData) billInfoResponse2.data;
                if (billInfoData2 != null) {
                    billInfoData2.LIZ = Boolean.TRUE;
                }
                c09aj.onNext(billInfoResponse2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C238400w2 c238400w22 = c238400w2;
                long j2 = jCurrentTimeMillis - c238400w22.element;
                long j3 = jCurrentTimeMillis - j;
                c238400w22.element = jCurrentTimeMillis;
                C03O0 c03o0 = C03O0.LIZ;
                Boolean bool3 = Boolean.TRUE;
                Long lValueOf = Long.valueOf(j2);
                Long lValueOf2 = Long.valueOf(j3);
                Integer num = billInfoResponse2.chunkIndex;
                BillInfoData billInfoData3 = (BillInfoData) billInfoResponse2.data;
                Long l = null;
                if (billInfoData3 != null) {
                    bool = billInfoData3.beginRenderChunk;
                    bool2 = billInfoData3.lastChunk;
                    ChunkDebugInfo chunkDebugInfo = billInfoData3.chunkDebugInfo;
                    if (chunkDebugInfo != null) {
                        l = chunkDebugInfo.costTime;
                    }
                } else {
                    bool = null;
                    bool2 = null;
                }
                Boolean firstLoad = billInfoRequest.getFirstLoad();
                c03o0.getClass();
                C03O0.LJJIJL(bool3, lValueOf, lValueOf2, num, bool, bool2, l, firstLoad);
            }
        });
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1$1");
    }

    public static final void accept$1(AfS0S0400100_1 afS0S0400100_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1$1");
        final C857603Ws c857603Ws = (C857603Ws) afS0S0400100_1.l0;
        final C09AJ c09aj = (C09AJ) afS0S0400100_1.l1;
        final C238400w2 c238400w2 = (C238400w2) afS0S0400100_1.l2;
        final long j = afS0S0400100_1.j4;
        final BillInfoRequest billInfoRequest = (BillInfoRequest) afS0S0400100_1.l3;
        ((C1515820pY4) obj).LIZLLL(new C0POE<ComposePbAndJson<C994803uk, BillInfoResponse>>() { // from class: X.03Ww
            @Override // X.C0POE
            public final void onComplete() {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onComplete");
                c09aj.onComplete();
                C857603Ws c857603Ws2 = c857603Ws;
                C857603Ws.LJ(c857603Ws2.LIZLLL, c857603Ws2.LIZJ, System.currentTimeMillis() - j);
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed, ");
                sbLIZ.append(th.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                c09aj.onError(th);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C03O0 c03o0 = C03O0.LIZ;
                String message = th.getMessage();
                Long lValueOf = Long.valueOf(jCurrentTimeMillis - j);
                Boolean firstLoad = billInfoRequest.getFirstLoad();
                c03o0.getClass();
                C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0POE
            public final void onNext(ComposePbAndJson<C994803uk, BillInfoResponse> composePbAndJson) {
                String str;
                Boolean bool;
                Boolean bool2;
                ComposePbAndJson<C994803uk, BillInfoResponse> composePbAndJson2 = composePbAndJson;
                if (composePbAndJson2 == null) {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZJ("empty chunk");
                    return;
                }
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onNext: ");
                sbLIZ.append(composePbAndJson2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                BillInfoResponse billInfoResponseLIZJ = composePbAndJson2.LIZJ(new InterfaceC1487280oo2() { // from class: X.03ui
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        C994803uk c994803uk = (C994803uk) obj2;
                        try {
                            return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, ConvertHelper.shop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData(c994803uk.data, null), c994803uk.chunk_index);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1019103yf.LIZ(EnumC1014603xw.ERR_OSP_BEAN_COPY, th, null);
                            return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, null, c994803uk.chunk_index);
                        }
                    }
                });
                C857603Ws c857603Ws2 = c857603Ws;
                BillInfoData billInfoData = (BillInfoData) billInfoResponseLIZJ.data;
                if (billInfoData == null || (str = billInfoData.requestId) == null) {
                    str = c857603Ws2.LIZLLL;
                }
                c857603Ws2.LIZLLL = str;
                BillInfoResponse billInfoResponse = c857603Ws2.LIZJ;
                if (billInfoResponse == null) {
                    billInfoResponse = billInfoResponseLIZJ;
                }
                c857603Ws2.LIZJ = billInfoResponse.mergeChunk(billInfoResponseLIZJ);
                BillInfoData billInfoData2 = (BillInfoData) billInfoResponseLIZJ.data;
                if (billInfoData2 != null) {
                    billInfoData2.LIZ = Boolean.TRUE;
                }
                c09aj.onNext(billInfoResponseLIZJ);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C238400w2 c238400w22 = c238400w2;
                long j2 = jCurrentTimeMillis - c238400w22.element;
                long j3 = jCurrentTimeMillis - j;
                c238400w22.element = jCurrentTimeMillis;
                C03O0 c03o0 = C03O0.LIZ;
                Boolean bool3 = Boolean.TRUE;
                Long lValueOf = Long.valueOf(j2);
                Long lValueOf2 = Long.valueOf(j3);
                Integer num = billInfoResponseLIZJ.chunkIndex;
                BillInfoData billInfoData3 = (BillInfoData) billInfoResponseLIZJ.data;
                Long l = null;
                if (billInfoData3 != null) {
                    bool = billInfoData3.beginRenderChunk;
                    bool2 = billInfoData3.lastChunk;
                    ChunkDebugInfo chunkDebugInfo = billInfoData3.chunkDebugInfo;
                    if (chunkDebugInfo != null) {
                        l = chunkDebugInfo.costTime;
                    }
                } else {
                    bool = null;
                    bool2 = null;
                }
                Boolean firstLoad = billInfoRequest.getFirstLoad();
                c03o0.getClass();
                C03O0.LJJIJL(bool3, lValueOf, lValueOf2, num, bool, bool2, l, firstLoad);
            }
        });
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1$1");
    }

    public AfS0S0400100_1(long j, C857603Ws c857603Ws, BillInfoRequest billInfoRequest, C19482611Ke c19482611Ke, C238400w2 c238400w2, int i) {
        this.$t = i;
        this.l0 = c857603Ws;
        this.l1 = c19482611Ke;
        this.l2 = c238400w2;
        this.j4 = j;
        this.l3 = billInfoRequest;
    }
}
