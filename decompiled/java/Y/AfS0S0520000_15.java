package Y;

import X.C09JN;
import X.C1C7U;
import X.C960510b6P;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0520000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;
    public boolean z6;

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

    public static final void accept$0(AfS0S0520000_15 afS0S0520000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostUserListStatusLoopManager@5502.realFetchStatusListData$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            ((Function1) afS0S0520000_15.l0).invoke(baseResponse);
        } else if (!afS0S0520000_15.z5) {
            ((C960510b6P) afS0S0520000_15.l1).LIZJ((Function1) afS0S0520000_15.l2, (Function1) afS0S0520000_15.l0, (Function1) afS0S0520000_15.l3, (Function0) afS0S0520000_15.l4, true, afS0S0520000_15.z6);
        } else {
            ((Function1) afS0S0520000_15.l3).invoke(new Throwable("empty response"));
        }
        C1C7U.LIZIZ("MultiCoHostUserListStatusLoopManager@5502.realFetchStatusListData$1");
    }

    public static final void accept$1(AfS0S0520000_15 afS0S0520000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostUserListStatusLoopManager@5502.realFetchStatusListData$2");
        if (!afS0S0520000_15.z5) {
            ((C960510b6P) afS0S0520000_15.l0).LIZJ((Function1) afS0S0520000_15.l1, (Function1) afS0S0520000_15.l2, (Function1) afS0S0520000_15.l3, (Function0) afS0S0520000_15.l4, true, afS0S0520000_15.z6);
        } else {
            ((Function1) afS0S0520000_15.l3).invoke(obj);
        }
        C1C7U.LIZIZ("MultiCoHostUserListStatusLoopManager@5502.realFetchStatusListData$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0520000_15(X.C960510b6P r2, kotlin.jvm.functions.Function0 r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, boolean r7, boolean r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.z5 = r7
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r5
            r0.l3 = r6
            r0.l4 = r3
            r0.z6 = r8
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l0 = r4
            r0.z5 = r7
            r0.l1 = r2
            r0.l2 = r5
            r0.l3 = r6
            r0.l4 = r3
            r0.z6 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0520000_15.<init>(X.0b6P, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean, int):void");
    }
}
