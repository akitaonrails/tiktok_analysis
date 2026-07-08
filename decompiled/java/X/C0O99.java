package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0O99, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O99 implements InterfaceC736910SvR<InterfaceC442501nr> {
    public final C0O8X LL = new C0O8X();
    public final C0NNW LLILLJJLI = new C0NNW(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }

    public static void LIZ(int i, int i2, int i3, String str, long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("digg_type", String.valueOf(i));
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i2));
        c0lab.LJ("retry_count", String.valueOf(i3));
        c0lab.LJ("duration_network", String.valueOf(j));
        c0lab.LJFF("is_final_request", true);
        C20684815ws.LJIILLIIL("feed_digg_api_monitor", c0lab.LIZ);
    }
}
