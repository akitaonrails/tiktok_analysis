package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friendstab.mute.MutePostsResponse;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0mb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402330mb1 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<MutePostsResponse> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1402330mb1 c1402330mb1, C09AJ c09aj) {
        MutePostsResponse mutePostsResponse;
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.realMutePosts$d$1");
        InterfaceC1392930mLr interfaceC1392930mLr = C1392940mLs.LIZ;
        try {
            mutePostsResponse = C1392940mLs.LIZ.LIZIZ(((User) c1402330mb1.l0).getUid(), ((EnumC1393020mM0) c1402330mb1.l1).getValue(), ((EnumC1392960mLu) c1402330mb1.l2).getValue()).get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "mutePosts error");
        }
        if (mutePostsResponse == null) {
            c09aj.onComplete();
        } else {
            c09aj.onNext(mutePostsResponse);
        }
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.realMutePosts$d$1");
    }

    public static final void subscribe$1(C1402330mb1 c1402330mb1, C09AJ c09aj) {
        BaseResponse baseResponse;
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$1");
        InterfaceC1392930mLr interfaceC1392930mLr = C1392940mLs.LIZ;
        try {
            baseResponse = C1392940mLs.LIZ.LIZ(((User) c1402330mb1.l0).getUid(), ((EnumC1393020mM0) c1402330mb1.l1).getValue(), ((EnumC1392960mLu) c1402330mb1.l2).getValue()).get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "unmutePosts error");
        }
        if (baseResponse == null) {
            c09aj.onComplete();
        } else {
            c09aj.onNext(baseResponse);
        }
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$1");
    }

    public C1402330mb1(User user, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, int i) {
        this.$t = i;
        this.l0 = user;
        this.l1 = enumC1393020mM0;
        this.l2 = enumC1392960mLu;
    }
}
