package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610480s0k extends C09AY implements Function2<FeedAvatarDefaultAssem, UserInfoUpdateEvent, Unit> {
    public final /* synthetic */ User LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610480s0k(User user) {
        super(2);
        this.LL = user;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, UserInfoUpdateEvent userInfoUpdateEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        FeedAvatarDefaultAssem feedAvatarDefaultAssem2 = feedAvatarDefaultAssem;
        UserInfoUpdateEvent userInfoUpdateEvent2 = userInfoUpdateEvent;
        if (userInfoUpdateEvent2 != null && !AwemeSaaSExtKt.isLive(((VideoItemParams) C631370Opb.LIZ(feedAvatarDefaultAssem2)).getAweme())) {
            C724270Sb3 c724270Sb3 = feedAvatarDefaultAssem2.LLJI;
            Object obj6 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!AwemeExtKt.isAdTraffic(((VideoItemParams) obj).getAweme())) {
                C724270Sb3 c724270Sb32 = feedAvatarDefaultAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (((VideoItemParams) obj2).getAweme().getAuthor() != null) {
                    C724270Sb3 c724270Sb33 = feedAvatarDefaultAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((VideoItemParams) obj3).getAweme()), userInfoUpdateEvent2.user.getUid()) && feedAvatarDefaultAssem2.LLLIIIIL) {
                        feedAvatarDefaultAssem2.LLLIIIIL = false;
                        C724270Sb3 c724270Sb34 = feedAvatarDefaultAssem2.LLJI;
                        if (c724270Sb34 != null) {
                            obj4 = c724270Sb34.LL;
                        } else {
                            obj4 = null;
                        }
                        ((VideoItemParams) obj4).getAweme().getAuthor().setAvatarThumb(userInfoUpdateEvent2.user.getAvatarThumb());
                        C724270Sb3 c724270Sb35 = feedAvatarDefaultAssem2.LLJI;
                        if (c724270Sb35 != null) {
                            obj5 = c724270Sb35.LL;
                        } else {
                            obj5 = null;
                        }
                        Aweme aweme = ((VideoItemParams) obj5).getAweme();
                        C430210Gtv c430210Gtv = feedAvatarDefaultAssem2.LLJJL;
                        if (c430210Gtv == null) {
                            c430210Gtv = null;
                        }
                        if (C1019620cdk.LJ(aweme, c430210Gtv)) {
                            InterfaceC582800MtS interfaceC582800MtSLJI = C1029590ctp.LJI();
                            C724270Sb3 c724270Sb36 = feedAvatarDefaultAssem2.LLJI;
                            if (c724270Sb36 != null) {
                                obj6 = c724270Sb36.LL;
                            }
                            C1045070dIn c1045070dInLIZJ = C1019620cdk.LIZJ(((VideoItemParams) obj6).getAweme());
                            interfaceC582800MtSLJI.getClass();
                            C1045220dJ2.LJIIZILJ(c1045070dInLIZJ);
                        } else {
                            feedAvatarDefaultAssem2.lp(this.LL);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
