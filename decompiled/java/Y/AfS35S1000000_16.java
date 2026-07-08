package Y;

import X.C09JN;
import X.C1071780dzs;
import X.C1072570e19;
import X.C1C7U;
import X.C2008507tr;

/* JADX INFO: loaded from: classes17.dex */
public class AfS35S1000000_16 implements C09JN {
    public final int $t;
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

    public AfS35S1000000_16(int i) {
        this.$t = i;
        this.s0 = "cold_start";
    }

    public AfS35S1000000_16(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS35S1000000_16 afS35S1000000_16, Object obj) {
        C1C7U.LIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$2$1");
        new C2008507tr(afS35S1000000_16.s0, "", true, "contact").LIZLLL(null);
        C1C7U.LIZIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$2$1");
    }

    public static final void accept$1(AfS35S1000000_16 afS35S1000000_16, Object obj) {
        C1C7U.LIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$2$2");
        new C2008507tr(afS35S1000000_16.s0, "", false, "contact").LIZLLL(null);
        C1C7U.LIZIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$2$2");
    }

    public static final void accept$2(AfS35S1000000_16 afS35S1000000_16, Object obj) {
        C1C7U.LIZ("FriendsServiceImpl@dabe.syncFBUidSwitchWithoutDialog$1");
        C1071780dzs.LIZ(C1071780dzs.LIZ, afS35S1000000_16.s0, "", "facebook", "");
        C1C7U.LIZIZ("FriendsServiceImpl@dabe.syncFBUidSwitchWithoutDialog$1");
    }

    public static final void accept$3(AfS35S1000000_16 afS35S1000000_16, Object obj) {
        C1C7U.LIZ("FriendsServiceImpl@dabe.syncFBUidSwitchWithoutDialog$2");
        C1071780dzs.LIZIZ(C1071780dzs.LIZ, afS35S1000000_16.s0, "", "facebook", "", "", "auto", C1072570e19.LIZ.LIZLLL(), 320);
        C1C7U.LIZIZ("FriendsServiceImpl@dabe.syncFBUidSwitchWithoutDialog$2");
    }
}
