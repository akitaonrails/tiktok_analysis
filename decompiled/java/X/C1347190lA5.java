package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.comment.poll.repository.CancelVoteRequest;
import com.ss.android.ugc.aweme.comment.poll.repository.CastVoteRequest;
import com.ss.android.ugc.aweme.comment.poll.repository.CreatePollRequest;
import com.ss.android.ugc.aweme.comment.poll.repository.DeletePollRequest;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347190lA5 {
    public static final C1347190lA5 LIZ = new C1347190lA5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(144));

    public static Object LIZ(CancelVoteRequest cancelVoteRequest, C1347170lA3 c1347170lA3) {
        int iIntValue;
        InterfaceC1347200lA6 interfaceC1347200lA6 = (InterfaceC1347200lA6) LIZIZ.getValue();
        String str = cancelVoteRequest.itemId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = cancelVoteRequest.pollId;
        if (str3 != null) {
            str2 = str3;
        }
        Integer num = cancelVoteRequest.optionIndex;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return interfaceC1347200lA6.LIZ(str, str2, iIntValue, c1347170lA3);
    }

    public static Object LIZIZ(CastVoteRequest castVoteRequest, C1347180lA4 c1347180lA4) {
        int iIntValue;
        InterfaceC1347200lA6 interfaceC1347200lA6 = (InterfaceC1347200lA6) LIZIZ.getValue();
        String str = castVoteRequest.itemId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = castVoteRequest.pollId;
        if (str3 != null) {
            str2 = str3;
        }
        Integer num = castVoteRequest.optionIndex;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return interfaceC1347200lA6.LIZJ(str, str2, iIntValue, c1347180lA4);
    }

    public static Object LIZJ(CreatePollRequest createPollRequest, C1347150lA1 c1347150lA1) {
        long jLongValue;
        Gson gson = C7740030o.LIZ().getGson();
        InterfaceC1347200lA6 interfaceC1347200lA6 = (InterfaceC1347200lA6) LIZIZ.getValue();
        String str = createPollRequest.itemId;
        if (str == null) {
            str = "";
        }
        String str2 = createPollRequest.title;
        if (str2 == null) {
            str2 = "";
        }
        Object obj = createPollRequest.pollOptionList;
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        String json = GsonProtectorUtils.toJson(gson, obj);
        Long l = createPollRequest.expireTime;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return interfaceC1347200lA6.LIZIZ(str, str2, json, jLongValue, c1347150lA1);
    }

    public static Object LIZLLL(DeletePollRequest deletePollRequest, C1347160lA2 c1347160lA2) {
        InterfaceC1347200lA6 interfaceC1347200lA6 = (InterfaceC1347200lA6) LIZIZ.getValue();
        String str = deletePollRequest.pollId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = deletePollRequest.itemId;
        if (str3 != null) {
            str2 = str3;
        }
        return interfaceC1347200lA6.LIZLLL(str, str2, c1347160lA2);
    }
}
