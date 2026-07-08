package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0RLJ.class, "vm", "<v#0>", 1);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    public static final /* synthetic */ FeedBaseViewModel LIZ(InterfaceC1731706qJ interfaceC1731706qJ) {
        return (FeedBaseViewModel) interfaceC1731706qJ.getValue(null, LIZ[0]);
    }

    public static final VideoDiggVM LIZIZ(C0SZ8 c0sz8) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        C0HHT c0hht = C0HHT.LIZ;
        FeedBaseViewModel feedBaseViewModelLIZ = null;
        try {
            if ((c0sz8 instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8) != null && (feedVideoAssem = videoViewCell.LLJJIJI) != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
                feedBaseViewModelLIZ = LIZ(C737910Sx3.LIZ(feedVideoAssem, C724750Sbp.LJIIJ(feedVideoAssem, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C2874019k(c19719912DlLIZ), null, new C0RLK()));
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (VideoDiggVM) feedBaseViewModelLIZ;
    }

    public static final VideoExposeSharerInformationVM LIZJ(C0SZ8 c0sz8) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModelLIZ = null;
        if (c0sz8 == null) {
            return null;
        }
        C0HHT c0hht = C0HHT.LIZ;
        try {
            if ((c0sz8 instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8) != null && (feedVideoAssem = videoViewCell.LLJJIJI) != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoExposeSharerInformationVM.class);
                feedBaseViewModelLIZ = LIZ(C737910Sx3.LIZ(feedVideoAssem, C724750Sbp.LJIIJ(feedVideoAssem, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C2874019k(c19719912DlLIZ), null, new C0RLK()));
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (VideoExposeSharerInformationVM) feedBaseViewModelLIZ;
    }

    public static final VideoShareViewModel LIZLLL(C0SZ8 c0sz8) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModelLIZ = null;
        if (c0sz8 == null) {
            return null;
        }
        C0HHT c0hht = C0HHT.LIZ;
        try {
            if ((c0sz8 instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8) != null && (feedVideoAssem = videoViewCell.LLJJIJI) != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoShareViewModel.class);
                feedBaseViewModelLIZ = LIZ(C737910Sx3.LIZ(feedVideoAssem, C724750Sbp.LJIIJ(feedVideoAssem, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C2874019k(c19719912DlLIZ), null, new C0RLK()));
            } else {
                C189200o6.m2constructorimpl(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (VideoShareViewModel) feedBaseViewModelLIZ;
    }

    public static final VideoItemParams LJ(C0SZ8 c0sz8) {
        VideoBaseCell videoBaseCell;
        if (!(c0sz8 instanceof VideoBaseCell) || (videoBaseCell = (VideoBaseCell) c0sz8) == null) {
            return null;
        }
        return videoBaseCell.LLJILLL;
    }
}
