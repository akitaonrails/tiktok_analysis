package X;

import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2447609iU extends C09AY implements Function1<WeakReference<C704830Rkn>, C2447309iR> {
    public C2447609iU() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09iR] */
    @Override // kotlin.jvm.functions.Function1
    public final C2447309iR invoke(WeakReference<C704830Rkn> weakReference) {
        final WeakReference<C704830Rkn> weakReference2 = weakReference;
        return new InterfaceC702540Rh6() { // from class: X.09iR
            @Override // X.InterfaceC702540Rh6
            public final void D6(Object obj) {
            }

            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                WeakReference<C704830Rkn> weakReference3;
                C704830Rkn c704830Rkn;
                Function0<VideoItemParams> function0;
                VideoItemParams videoItemParamsInvoke;
                Object obj;
                FollowingHvrLabelInFypVM followingHvrLabelInFypVM;
                Aweme aweme;
                int duration;
                int length;
                Map<String, Object> map;
                if (z && (weakReference3 = weakReference2) != null && (c704830Rkn = weakReference3.get()) != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null) {
                    C704830Rkn c704830Rkn2 = weakReference2.get();
                    if (c704830Rkn2 != null && (map = c704830Rkn2.LJFF) != null) {
                        obj = map.get("KEY_FYP_VM");
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof FollowingHvrLabelInFypVM) && (followingHvrLabelInFypVM = (FollowingHvrLabelInFypVM) obj) != null && (aweme = videoItemParamsInvoke.getAweme()) != null && (followingHvrLabelInFypVM.vQ2().LIZ instanceof C2447209iQ)) {
                        followingHvrLabelInFypVM.vQ2().LIZ(C2445709iB.LIZ);
                        if (Intrinsics.LJFF(aweme.getAid(), followingHvrLabelInFypVM.LLILLJJLI) && !followingHvrLabelInFypVM.LLILLL.contains(aweme.getAid())) {
                            followingHvrLabelInFypVM.LLILLL.add(aweme.getAid());
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("actual show label, aweme id is ");
                            sbLIZ.append(aweme.getAid());
                            C2188811AlT.LIZIZ(sbLIZ);
                            C01GW c01gw = C2445309i7.LIZ;
                            C2445309i7.LJI(System.currentTimeMillis());
                            String aid = aweme.getAid();
                            Video video = aweme.getVideo();
                            if (video != null) {
                                duration = video.getDuration();
                            } else {
                                duration = 0;
                            }
                            int awemeType = aweme.getAwemeType();
                            String desc = aweme.getDesc();
                            if (desc != null) {
                                length = desc.length();
                            } else {
                                length = 0;
                            }
                            C23250099c.LIZLLL((InterfaceC497601wk) C2447509iT.LIZ.getValue(), null, null, new C315501Kf(duration, awemeType, length, aid, "homepage_hot", "frequently_watched", null), 3);
                        }
                    }
                }
            }
        };
    }
}
