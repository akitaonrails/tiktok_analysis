package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1932507hb extends C2217421BqW implements Function1<Integer, Long> {
    public C1932507hb(Object obj) {
        super(1, obj, MultiGuestUserInfoFragment.class, "getScoreByRank", "getScoreByRank(I)Ljava/lang/Long;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Integer num) {
        return ((MultiGuestUserInfoFragment) this.receiver).bS().get(Integer.valueOf(num.intValue()));
    }
}
