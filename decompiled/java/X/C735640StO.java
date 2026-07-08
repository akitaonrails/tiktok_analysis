package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0StO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735640StO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C735640StO.class, "vm", "<v#0>", 1);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    public static final AdPlayFunVM LIZ(C0RAE c0rae) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModelLIZIZ = null;
        if (c0rae == null) {
            return null;
        }
        C0RP1 c0rp1 = C0RP1.LIZ;
        try {
            if ((c0rae instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0rae) != null && (feedVideoAssem = videoViewCell.LLJJIJI) != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdPlayFunVM.class);
                feedBaseViewModelLIZIZ = LIZIZ(C737910Sx3.LIZ(feedVideoAssem, C724750Sbp.LJIIJ(feedVideoAssem, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 1130), null, AFwS243S0000000_11.get$arr$(747)));
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (AdPlayFunVM) feedBaseViewModelLIZIZ;
    }

    public static final /* synthetic */ FeedBaseViewModel LIZIZ(InterfaceC1731706qJ interfaceC1731706qJ) {
        return (FeedBaseViewModel) interfaceC1731706qJ.getValue(null, LIZ[0]);
    }

    public static final AdPopUpWebPageVM LIZJ(C0RAE c0rae) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModelLIZIZ = null;
        if (c0rae == null) {
            return null;
        }
        C0RP1 c0rp1 = C0RP1.LIZ;
        try {
            if ((c0rae instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0rae) != null && (feedVideoAssem = videoViewCell.LLJJIJI) != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdPopUpWebPageVM.class);
                feedBaseViewModelLIZIZ = LIZIZ(C737910Sx3.LIZ(feedVideoAssem, C724750Sbp.LJIIJ(feedVideoAssem, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 1130), null, AFwS243S0000000_11.get$arr$(747)));
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (AdPopUpWebPageVM) feedBaseViewModelLIZIZ;
    }
}
