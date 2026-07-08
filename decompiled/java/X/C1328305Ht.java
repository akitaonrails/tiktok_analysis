package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1328305Ht implements InterfaceC586170Myt {
    public static final C1328305Ht LL = new C1328305Ht();
    public static final C2252321DDq LLILLJJLI;
    public static final AnonymousClass0951 LLILLL;
    public static final C01GW LLILZ;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ("");
        LLILLJJLI = c2252321DDqLIZ;
        LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1405));
    }

    public static final String LIZ() {
        C2252321DDq c2252321DDq = LLILLJJLI;
        String str = (String) c2252321DDq.getValue();
        if (str.length() != 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return str;
        }
        String curUserId = ((IAccountService) LLILZ.getValue()).LJIIJ().getCurUserId();
        c2252321DDq.setValue(curUserId);
        return curUserId;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        C23250099c.LIZLLL(C065A.LIZ(), null, null, new C1328205Hs(user, null), 3);
    }
}
