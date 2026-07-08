package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageTitleBarAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819320xRa extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ LiveBoardsPageTitleBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819320xRa(LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem) {
        super(2);
        this.LL = liveBoardsPageTitleBarAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem = this.LL;
                    liveBoardsPageTitleBarAssem.LLJIJIL = true;
                    C500260Jjc.LLFFF(liveBoardsPageTitleBarAssem.LLJILJILJ);
                    if (((C1781580wSi) this.LL.LLJ.getValue()).LLILLJJLI && MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                        this.LL.Go();
                    } else {
                        LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem2 = this.LL;
                        LiveIconView liveIconView = liveBoardsPageTitleBarAssem2.LLJILJILJ;
                        if (liveIconView != null) {
                            liveIconView.setIconTintAttr(R.attr.ezy);
                        }
                        LiveIconView liveIconView2 = liveBoardsPageTitleBarAssem2.LLJILJILJ;
                        if (liveIconView2 != null) {
                            liveIconView2.setEnabled(false);
                        }
                    }
                }
            } else {
                C500260Jjc.LLFFF(this.LL.LLJILJILJ);
                this.LL.Go();
            }
        } else if (((C1781580wSi) this.LL.LLJ.getValue()).LLILLJJLI) {
            C500260Jjc.LLFFF(this.LL.LLJILJILJ);
            this.LL.Go();
        } else {
            C500260Jjc.LJIILLIIL(this.LL.LLJILJILJ);
            LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem3 = this.LL;
            LiveIconView liveIconView3 = liveBoardsPageTitleBarAssem3.LLJILJILJ;
            if (liveIconView3 != null) {
                liveIconView3.setIconTintAttr(R.attr.ezy);
            }
            LiveIconView liveIconView4 = liveBoardsPageTitleBarAssem3.LLJILJILJ;
            if (liveIconView4 != null) {
                liveIconView4.setEnabled(false);
            }
        }
        if (!((C1781580wSi) this.LL.LLJ.getValue()).LLILLJJLI) {
            C500260Jjc.LJIILIIL(this.LL.LLJILJILJ);
        }
        return Unit.LIZ;
    }
}
