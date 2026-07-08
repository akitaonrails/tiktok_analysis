package Y;

import X.C09JN;
import X.C1104590eqn;
import X.C1104600eqo;
import X.C1C7U;
import X.C20441214yg;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import java.util.ArrayList;
import java.util.List;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;

/* JADX INFO: loaded from: classes5.dex */
public class AfS0S1101100_4 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S1101100_4 afS0S1101100_4, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("GoodyBagPresenter@6f83.getUserIfWinner$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.statusCode);
        } else {
            numValueOf = null;
        }
        C1104590eqn c1104590eqn = (C1104590eqn) afS0S1101100_4.l1;
        C1104600eqo.LJFF(numValueOf, c1104590eqn.LIZJ, afS0S1101100_4.s0, (GetGoodyBagLotteryResponse.ResponseData) baseResponse.data, afS0S1101100_4.i2, afS0S1101100_4.j3, c1104590eqn.LJIIJJI, null, baseResponse.LIZIZ);
        GetGoodyBagLotteryResponse.ResponseData responseData = (GetGoodyBagLotteryResponse.ResponseData) baseResponse.data;
        if (responseData != null) {
            C1104590eqn c1104590eqn2 = (C1104590eqn) afS0S1101100_4.l1;
            C20441214yg.LIZIZ("GoodyBagPresenter", "requestTheServerForOpen");
            c1104590eqn2.LJI(responseData);
        }
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.getUserIfWinner$1$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS0S1101100_4 r13, java.lang.Object r14) {
        /*
            java.lang.String r2 = "GoodyBagPresenter@6f83.getUserIfWinner$1$2"
            X.C1C7U.LIZ(r2)
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            boolean r0 = r14 instanceof X.C501470JlZ
            if (r0 == 0) goto L4a
            r1 = r14
            X.0JlZ r1 = (X.C501470JlZ) r1
            int r0 = r1.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r12 = r1.getLogId()
            if (r12 != 0) goto L1e
        L1c:
            java.lang.String r12 = ""
        L1e:
            java.lang.Object r1 = r13.l1
            X.0eqn r1 = (X.C1104590eqn) r1
            int r10 = r1.LJIIJJI
            r0 = 2
            if (r10 != r0) goto L42
            boolean r4 = r1.LIZJ
            java.lang.String r5 = r13.s0
            r6 = 0
            int r7 = r13.i2
            long r8 = r13.j3
            java.lang.String r11 = r14.getMessage()
            X.C1104600eqo.LJFF(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            java.lang.Object r0 = r13.l1
            X.0eqn r0 = (X.C1104590eqn) r0
            r0.LJIIZILJ()
        L3e:
            X.C1C7U.LIZIZ(r2)
            return
        L42:
            int r0 = r10 + 1
            r1.LJIIJJI = r0
            r1.LJIILJJIL()
            goto L3e
        L4a:
            boolean r0 = r14 instanceof X.C501520Jle
            if (r0 == 0) goto L5a
            r0 = r14
            X.0Jle r0 = (X.C501520Jle) r0
            int r0 = r0.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L1c
        L5a:
            boolean r0 = r14 instanceof X.C1811850xFX
            if (r0 == 0) goto L68
            r0 = r14
            X.0xFX r0 = (X.C1811850xFX) r0
            int r0 = r0.statusCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L1c
        L68:
            r3 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1101100_4.accept$1(Y.AfS0S1101100_4, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS0S1101100_4 afS0S1101100_4, Object obj) {
        Integer numValueOf;
        int size;
        List<GoodyBagWinnerInfo> list;
        C1C7U.LIZ("GoodyBagPresenter@6f83.requestWinnerList$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.statusCode);
        } else {
            numValueOf = null;
        }
        boolean z = ((C1104590eqn) afS0S1101100_4.l1).LIZJ;
        String str = afS0S1101100_4.s0;
        GetGoodyBagWinnerListResponse.ResponseData responseData = (GetGoodyBagWinnerListResponse.ResponseData) baseResponse.data;
        if (responseData != null && (list = responseData.winners) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C1104600eqo.LJIIIIZZ(numValueOf, z, str, size, afS0S1101100_4.i2, afS0S1101100_4.j3, ((C1104590eqn) afS0S1101100_4.l1).LJIIJJI, null, baseResponse.LIZIZ);
        GetGoodyBagWinnerListResponse.ResponseData responseData2 = (GetGoodyBagWinnerListResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            C1104590eqn c1104590eqn = (C1104590eqn) afS0S1101100_4.l1;
            GoodyBagMessage goodyBagMessage = new GoodyBagMessage();
            c1104590eqn.LJIIIZ = goodyBagMessage;
            goodyBagMessage.baseInfo = c1104590eqn.LJIIJ;
            List<GoodyBagWinnerInfo> arrayList = responseData2.winners;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            goodyBagMessage.winners = arrayList;
            GoodyBagMessage goodyBagMessage2 = c1104590eqn.LJIIIZ;
            if (goodyBagMessage2 != null) {
                goodyBagMessage2.type = 3;
            }
        }
        ((C1104590eqn) afS0S1101100_4.l1).LJFF();
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.requestWinnerList$1$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS0S1101100_4 r13, java.lang.Object r14) {
        /*
            java.lang.String r2 = "GoodyBagPresenter@6f83.requestWinnerList$1$2"
            X.C1C7U.LIZ(r2)
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            boolean r0 = r14 instanceof X.C501470JlZ
            if (r0 == 0) goto L4a
            r1 = r14
            X.0JlZ r1 = (X.C501470JlZ) r1
            int r0 = r1.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r12 = r1.getLogId()
            if (r12 != 0) goto L1e
        L1c:
            java.lang.String r12 = ""
        L1e:
            java.lang.Object r1 = r13.l1
            X.0eqn r1 = (X.C1104590eqn) r1
            int r10 = r1.LJIIJJI
            r0 = 2
            if (r10 != r0) goto L42
            boolean r4 = r1.LIZJ
            java.lang.String r5 = r13.s0
            r6 = 0
            int r7 = r13.i2
            long r8 = r13.j3
            java.lang.String r11 = r14.getMessage()
            X.C1104600eqo.LJIIIIZZ(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            java.lang.Object r0 = r13.l1
            X.0eqn r0 = (X.C1104590eqn) r0
            r0.LJIIZILJ()
        L3e:
            X.C1C7U.LIZIZ(r2)
            return
        L42:
            int r0 = r10 + 1
            r1.LJIIJJI = r0
            r1.LJIJ()
            goto L3e
        L4a:
            boolean r0 = r14 instanceof X.C501520Jle
            if (r0 == 0) goto L5a
            r0 = r14
            X.0Jle r0 = (X.C501520Jle) r0
            int r0 = r0.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L1c
        L5a:
            boolean r0 = r14 instanceof X.C1811850xFX
            if (r0 == 0) goto L68
            r0 = r14
            X.0xFX r0 = (X.C1811850xFX) r0
            int r0 = r0.statusCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L1c
        L68:
            r3 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1101100_4.accept$3(Y.AfS0S1101100_4, java.lang.Object):void");
    }

    public AfS0S1101100_4(C1104590eqn c1104590eqn, String str, int i, long j, int i2) {
        this.$t = i2;
        this.l1 = c1104590eqn;
        this.s0 = str;
        this.i2 = i;
        this.j3 = j;
    }
}
