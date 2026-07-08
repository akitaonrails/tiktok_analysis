package X;

import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0xyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839790xyb {
    public InterfaceC1839810xyd LIZ;

    @C14EU
    public void onEvent(C0PSR c0psr) {
        if (this.LIZ != null && (c0psr.LIZIZ instanceof User)) {
            FollowPair followPair = new FollowPair();
            int i = c0psr.LIZ;
            followPair.followStatus = i;
            followPair.LIZJ = i;
            String uid = ((User) c0psr.LIZIZ).getUid();
            if (uid != null) {
                followPair.LIZ = CastLongProtector.parseLong(uid);
            }
            ((C1839800xyc) this.LIZ).LIZ.LJIIIIZZ.onNext(followPair);
            C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
        }
    }
}
