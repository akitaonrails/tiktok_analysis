package Y;

import X.C09JN;
import X.C1087930ePv;
import X.C1C7U;
import X.C463640IGc;
import X.InterfaceC1087920ePu;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class AfS1S0102100_17 implements C09JN {
    public final int $t;
    public int i1;
    public int i2;
    public long j3;
    public Object l0;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S0102100_17 afS1S0102100_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS1S0102100_17.l0;
        int i = afS1S0102100_17.i1;
        long j = afS1S0102100_17.j3;
        int i2 = afS1S0102100_17.i2;
        BaseResponse baseResponse = (BaseResponse) obj;
        int i3 = LikeHelper.LLLJL;
        likeHelper.getClass();
        C1C7U.LIZ("LikeHelper@13b2.sendLike$1L");
        if (baseResponse != null && baseResponse.data != 0) {
            Iterator it2 = ((ArrayList) likeHelper.LLILZLL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1087920ePu) it2.next()).onResult(((LikeResponse.Data) baseResponse.data).result);
            }
        }
        Room room = likeHelper.LLILLL;
        C1087930ePv.LIZIZ("tap", i, room, String.valueOf(room.getOwnerUserId()), j, C463640IGc.LIZ, i2, 1, 0);
        C1C7U.LIZIZ("LikeHelper@13b2.sendLike$1L");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS1S0102100_17 r13, java.lang.Object r14) {
        /*
            r6 = r14
            java.lang.Object r2 = r13.l0
            com.bytedance.android.livesdk.like.LikeHelper r2 = (com.bytedance.android.livesdk.like.LikeHelper) r2
            int r8 = r13.i1
            long r11 = r13.j3
            int r14 = r13.i2
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            int r0 = com.bytedance.android.livesdk.like.LikeHelper.LLLJL
            r2.getClass()
            java.lang.String r5 = "LikeHelper@13b2.sendLike$2L"
            X.C1C7U.LIZ(r5)
            if (r6 == 0) goto L6c
            boolean r0 = r6 instanceof X.C501470JlZ
            if (r0 == 0) goto L6c
            r4 = r6
            X.0JlZ r4 = (X.C501470JlZ) r4
            int r1 = r4.getErrorCode()
            r0 = 4021042(0x3d5b32, float:5.63468E-39)
            if (r1 != r0) goto L6c
            java.lang.String r0 = r4.getPrompt()
            r2.LLLILZLLLI = r0
            if (r0 == 0) goto L45
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L45
            android.os.Handler r3 = X.C0IK5.LIZ()
            Y.ARunnableS117S0100000_17 r1 = new Y.ARunnableS117S0100000_17
            r0 = 273(0x111, float:3.83E-43)
            r1.<init>(r2, r0)
            X.C786410Ut5.LJJZZIII(r3, r1)
        L45:
            java.lang.String r0 = r4.getExtra()
            boolean r0 = X.C2093608Ic.LJ(r0)
            if (r0 != 0) goto L7b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = r4.getExtra()     // Catch: org.json.JSONException -> L67
            r1.<init>(r0)     // Catch: org.json.JSONException -> L67
            java.lang.String r0 = "like_blocked_until_ms"
            java.lang.Object r0 = r1.get(r0)     // Catch: org.json.JSONException -> L67
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: org.json.JSONException -> L67
            long r0 = r0.longValue()     // Catch: org.json.JSONException -> L67
            r2.LLLILZJ = r0     // Catch: org.json.JSONException -> L67
            goto L7b
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L7b
        L6c:
            X.19EG r0 = r2.LLILLJJLI
            if (r0 == 0) goto L96
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L96
            X.19EG r0 = r2.LLILLJJLI
            X.C501540Jlg.LIZJ(r0, r6)
        L7b:
            boolean r0 = r6 instanceof java.lang.Exception
            if (r0 == 0) goto L92
            java.lang.Exception r6 = (java.lang.Exception) r6
            java.lang.String r7 = "tap"
            com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r2.LLILLL
            long r0 = r9.getOwnerUserId()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r13 = X.C463640IGc.LIZ
            com.bytedance.android.livesdk.like.LikeHelper.LJJIJIIJIL(r6, r7, r8, r9, r10, r11, r13, r14)
        L92:
            X.C1C7U.LIZIZ(r5)
            return
        L96:
            android.content.Context r0 = X.C497740JfY.LJII()
            X.C501540Jlg.LIZJ(r0, r6)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0102100_17.accept$1(Y.AfS1S0102100_17, java.lang.Object):void");
    }

    public AfS1S0102100_17(LikeHelper likeHelper, int i, long j, int i2, int i3) {
        this.$t = i3;
        this.l0 = likeHelper;
        this.i1 = i;
        this.j3 = j;
        this.i2 = i2;
    }
}
