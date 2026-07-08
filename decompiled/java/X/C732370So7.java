package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0So7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732370So7 extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends Integer>, Unit> {
    public C732370So7() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends Integer> c291001Au) {
        Aweme aweme;
        C732130Snj c732130Snj;
        View view;
        String str;
        String aid;
        Aweme aweme2;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        if (c291001Au != null) {
            VideoShareViewModel videoShareViewModelJp = videoShareAssem2.Jp();
            videoShareViewModelJp.getClass();
            videoShareViewModelJp.setState(new C732450SoF());
            VideoItemParams item = videoShareViewModelJp.getItem();
            Aweme aweme3 = null;
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            if (videoShareViewModelJp.CQ2(aweme) && !VideoShareViewModel.IQ2()) {
                if (Intrinsics.LJFF(videoShareViewModelJp.eventType, "homepage_hot")) {
                    str = "homepage";
                } else {
                    str = "feed_detail";
                }
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                VideoItemParams item2 = videoShareViewModelJp.getItem();
                if (item2 != null && (aweme2 = item2.getAweme()) != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                String str2 = videoShareViewModelJp.eventType;
                C1895800zQw.LJIILIIL(aid, str2, str2, str);
            }
            videoShareAssem2.LLLFZ = true;
            VideoShareViewModel videoShareViewModelJp2 = videoShareAssem2.Jp();
            View contentView = videoShareAssem2.getContentView();
            videoShareViewModelJp2.getClass();
            if (contentView.getParent() != null) {
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIJJLI();
                VideoItemParams item3 = videoShareViewModelJp2.getItem();
                if (item3 != null) {
                    aweme3 = item3.getAweme();
                }
                if (C1895800zQw.LJIIJJI(aweme3)) {
                    HandlerHook.viewPostDelay(contentView, new ARunnableS111S0100000_11(contentView, 175), 100L);
                }
            }
            C0CNO.LIZLLL(0L, new C732720Sog(new C732490SoJ(videoShareAssem2)));
            Context context = videoShareAssem2.getContext();
            if ((context == null || !C0SXF.LJIL(context)) && (c732130Snj = videoShareAssem2.LLLFFI) != null && C20586815h4.LIZ() && (view = c732130Snj.LIZJ) != null) {
                HandlerHook.viewPostDelay(view, new RunnableC732120Sni(c732130Snj), C300480BqA.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
