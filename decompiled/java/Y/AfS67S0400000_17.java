package Y;

import X.C09JN;
import X.C1132840faM;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFullInfo;
import webcast.api.gift.CollabGiftBaseInfo;
import webcast.api.gift.CollabGiftGameplayResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS67S0400000_17 implements C09JN {
    public final int $t;
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

    public static final void accept$0(AfS67S0400000_17 afS67S0400000_17, Object obj) {
        String str;
        CollabGiftBaseInfo collabGiftBaseInfo;
        C1C7U.LIZ("CollaborateGiftingStateMachine@8efd.requestCollabGiftState$1");
        CollabGiftGameplayResponse collabGiftGameplayResponse = (CollabGiftGameplayResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCollabGiftState: success, server session=");
        CollabGiftGameplayResponse.Data data = collabGiftGameplayResponse.data;
        if (data != null && (collabGiftBaseInfo = data.baseInfo) != null) {
            str = collabGiftBaseInfo.collabSessionId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ));
        ((C1132840faM) afS67S0400000_17.l0).LIZLLL((com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo) afS67S0400000_17.l1, (CollabGiftActiveInfo) afS67S0400000_17.l2, (CollabGiftFullInfo) afS67S0400000_17.l3, collabGiftGameplayResponse.data);
        C1C7U.LIZIZ("CollaborateGiftingStateMachine@8efd.requestCollabGiftState$1");
    }

    public static final void accept$1(AfS67S0400000_17 afS67S0400000_17, Object obj) {
        C1C7U.LIZ("CollaborateGiftingStateMachine@8efd.requestCollabGiftState$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCollabGiftState: failed, session=");
        sbLIZ.append(((com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo) afS67S0400000_17.l0).collabSessionId);
        C20441214yg.LJFF("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        ((C1132840faM) afS67S0400000_17.l1).LIZLLL((com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo) afS67S0400000_17.l0, (CollabGiftActiveInfo) afS67S0400000_17.l2, (CollabGiftFullInfo) afS67S0400000_17.l3, null);
        C1C7U.LIZIZ("CollaborateGiftingStateMachine@8efd.requestCollabGiftState$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS67S0400000_17(X.C1132840faM r2, com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo r3, com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo r4, com.bytedance.android.livesdk.model.message.CollabGiftFullInfo r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            r0.l3 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS67S0400000_17.<init>(X.0faM, com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo, com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo, com.bytedance.android.livesdk.model.message.CollabGiftFullInfo, int):void");
    }
}
