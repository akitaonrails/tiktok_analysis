package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2448109iZ extends C09AY implements Function1<WeakReference<C704830Rkn>, C2447409iS> {
    public C2448109iZ() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09iS] */
    @Override // kotlin.jvm.functions.Function1
    public final C2447409iS invoke(WeakReference<C704830Rkn> weakReference) {
        final WeakReference<C704830Rkn> weakReference2 = weakReference;
        return new InterfaceC702540Rh6() { // from class: X.09iS
            @Override // X.InterfaceC702540Rh6
            public final void D6(Object obj) {
            }

            @Override // X.InterfaceC700000Rd0
            public final void l0(boolean z) {
                C704830Rkn c704830Rkn;
                Function0<VideoItemParams> function0;
                VideoItemParams videoItemParamsInvoke;
                ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel;
                Aweme aweme;
                Map<String, Object> map;
                FYPFollowingSuggestViewModel fYPFollowingSuggestViewModel;
                Aweme aweme2;
                Map<String, Object> map2;
                if (z) {
                    WeakReference<C704830Rkn> weakReference3 = weakReference2;
                    Object obj = null;
                    if (weakReference3 != null && (c704830Rkn = weakReference3.get()) != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null) {
                        WeakReference<C704830Rkn> weakReference4 = weakReference2;
                        if (Intrinsics.LJFF(videoItemParamsInvoke.mEventType, "homepage_hot")) {
                            C704830Rkn c704830Rkn2 = weakReference4.get();
                            if (c704830Rkn2 != null && (map2 = c704830Rkn2.LJFF) != null) {
                                obj = map2.get("KEY_BUTTON_VM");
                            }
                            if ((obj instanceof FYPFollowingSuggestViewModel) && (fYPFollowingSuggestViewModel = (FYPFollowingSuggestViewModel) obj) != null && (aweme2 = videoItemParamsInvoke.getAweme()) != null && (fYPFollowingSuggestViewModel.vQ2().LIZ instanceof C2447209iQ)) {
                                fYPFollowingSuggestViewModel.vQ2().LIZ(C2445709iB.LIZ);
                                if (!((C2445009i4) fYPFollowingSuggestViewModel.LLILLJJLI.getValue()).LIZ.contains(aweme2.getAid()) && !C1017070cZd.LLFF(aweme2)) {
                                    C2445309i7.LJ();
                                    ((C2445009i4) fYPFollowingSuggestViewModel.LLILLJJLI.getValue()).LIZ.add(aweme2.getAid());
                                    C01NN.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowingCount(), aweme2.getAid(), AwemeExtKt.getAuthorUid(aweme2), "double_button", "homepage_hot", "play_3s");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C704830Rkn c704830Rkn3 = weakReference4.get();
                        if (c704830Rkn3 != null && (map = c704830Rkn3.LJFF) != null) {
                            obj = map.get("KEY_BUTTON_VM");
                        }
                        if (!(obj instanceof ProfileFollowingSuggestViewModel) || (profileFollowingSuggestViewModel = (ProfileFollowingSuggestViewModel) obj) == null || (aweme = videoItemParamsInvoke.getAweme()) == null || !(profileFollowingSuggestViewModel.vQ2().LIZ instanceof C2447209iQ)) {
                            return;
                        }
                        profileFollowingSuggestViewModel.vQ2().LIZ(C2445709iB.LIZ);
                        C2446309iH c2446309iHXQ2 = profileFollowingSuggestViewModel.xQ2();
                        if (!c2446309iHXQ2.LLIZLLLIL.get()) {
                            c2446309iHXQ2.LLIZLLLIL.set(true);
                            if (!C1017070cZd.LLFF(aweme)) {
                                C2445309i7.LJ();
                                if (!profileFollowingSuggestViewModel.LLILLL) {
                                    profileFollowingSuggestViewModel.LLILLL = true;
                                    C01NN.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowingCount(), aweme.getAid(), AwemeExtKt.getAuthorUid(aweme), "single_button", "others_homepage", "play_30s");
                                }
                            }
                        }
                        C2446309iH c2446309iHXQ22 = profileFollowingSuggestViewModel.xQ2();
                        c2446309iHXQ22.LIZ().getClass();
                        if (((Number) C1ECA.LJII.getValue()).intValue() <= 0) {
                            return;
                        }
                        long j = c2446309iHXQ22.LLILZIL;
                        if (j <= 0) {
                            c2446309iHXQ22.LLILZIL = j + ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        }
                        c2446309iHXQ22.LLIZ.removeMessages(101);
                        C786410Ut5.LJLJJI(101, 1000L, c2446309iHXQ22.LLIZ);
                    }
                }
            }
        };
    }
}
