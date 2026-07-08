package Y;

import X.AbstractC1585810rMx;
import X.C0OPX;
import X.C0ORE;
import X.C1203130hPj;
import X.C1203150hPl;
import X.C1203200hPq;
import X.C13LP;
import X.C1558520qew;
import X.C1629106Zl;
import X.C1697810uHb;
import X.C2252321DDq;
import X.C339190DRl;
import X.C427100Gou;
import X.C615140OAu;
import X.C616880OHm;
import X.C620040OTq;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility;
import com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.emojiselect.BulletinEmojiSelectSheetListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicListAssem;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailAwemeListFragment;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS8S0002000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AsS36S0100000_9 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
            case 2:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS36S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$0(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i) {
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem;
        C620040OTq c620040OTq;
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem2 = (BulletinBoardPageHybridAssem) asS36S0100000_9.l0;
        if (!bulletinBoardPageHybridAssem2.LLJLILLLLZIIL) {
            return;
        }
        List<InterfaceC1891350zJl> list = ((C616880OHm) bulletinBoardPageHybridAssem2.So().getState()).LL.LLILZ;
        if (i != 0) {
            if ((i != 1 && i != 2) || (c620040OTq = (bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) asS36S0100000_9.l0).LLJL) == null || !bulletinBoardPageHybridAssem.LLJLLL) {
                return;
            }
            bulletinBoardPageHybridAssem.LLJLLL = false;
            C0OPX.LJIIIZ("BulletinBoardPageHybrid PreloadonScrollStateChanged removeIdleHandler");
            Looper.myQueue().removeIdleHandler(c620040OTq);
            return;
        }
        if (list == null || ((BulletinBoardPageHybridAssem) asS36S0100000_9.l0).LLJLIL >= list.size()) {
            return;
        }
        ((BulletinBoardPageHybridAssem) asS36S0100000_9.l0).Go("onScrollStateChanged");
    }

    public static final void LJJIIJ$1(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i) {
        if (i == 1) {
            AssemVMLazy assemVMLazy = ((BulletinPageListAssem) asS36S0100000_9.l0).LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinPageListAssem.LLJJLIIIJLLLLLLLZ;
            PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
            panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
        }
    }

    public static final void LJJIIZI$0(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        PageContentScrollAbility pageContentScrollAbility = (PageContentScrollAbility) C1558520qew.LIZ((InterfaceC665370Q7z) asS36S0100000_9.l0, PageContentScrollAbility.class, null);
        if (pageContentScrollAbility != null) {
            pageContentScrollAbility.oq(recyclerView.computeVerticalScrollOffset());
        }
    }

    public static final void LJJIIZI$1(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((BulletinUnreadIndicatorAssem) asS36S0100000_9.l0).LLJJIJI.getValue();
        if (linearLayoutManager != null) {
            BulletinUnreadIndicatorAssem bulletinUnreadIndicatorAssem = (BulletinUnreadIndicatorAssem) asS36S0100000_9.l0;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            C2252321DDq c2252321DDq = bulletinUnreadIndicatorAssem.LLJJIII;
            if (bulletinUnreadIndicatorAssem.Go().getState().LJIIIIZZ() >= 4 && iFindFirstVisibleItemPosition != 0) {
                z = true;
            } else {
                z = false;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
        }
    }

    public static final void LJJIIZI$2(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        PageContentScrollAbility pageContentScrollAbility = (PageContentScrollAbility) C1558520qew.LIZ((InterfaceC665370Q7z) asS36S0100000_9.l0, PageContentScrollAbility.class, null);
        if (pageContentScrollAbility != null) {
            pageContentScrollAbility.oq(recyclerView.computeVerticalScrollOffset());
        }
    }

    public static final void LJJIIZI$3(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        InterfaceC1891350zJl interfaceC1891350zJl;
        C427100Gou c427100Gou;
        C0ORE c0ore;
        List<C1203150hPl> list;
        List<InterfaceC1891350zJl> list2;
        if (i2 == 0) {
            return;
        }
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) ((RecyclerView) ((BulletinEmojiSelectSheetListAssem) asS36S0100000_9.l0).LLJIJIL.getValue()).getLayoutManager()).findFirstVisibleItemPosition();
        C0ORE c0ore2 = ((BulletinEmojiSelectSheetListAssem) asS36S0100000_9.l0).LLJILJIL;
        View viewFindViewById = null;
        if (c0ore2 != null && (list2 = c0ore2.LIZ) != null) {
            interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, list2);
        } else {
            interfaceC1891350zJl = null;
        }
        if ((interfaceC1891350zJl instanceof C427100Gou) && (c427100Gou = (C427100Gou) interfaceC1891350zJl) != null) {
            BulletinEmojiSelectSheetListAssem bulletinEmojiSelectSheetListAssem = (BulletinEmojiSelectSheetListAssem) asS36S0100000_9.l0;
            if (!Intrinsics.LJFF(c427100Gou.LLILLL, bulletinEmojiSelectSheetListAssem.LLJILJILJ) && (c0ore = bulletinEmojiSelectSheetListAssem.LLJILJIL) != null && (list = c0ore.LIZIZ) != null) {
                int i3 = 0;
                for (C1203150hPl c1203150hPl : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        if (Intrinsics.LJFF(c1203150hPl.LIZIZ, c427100Gou.LLILLL)) {
                            View view = bulletinEmojiSelectSheetListAssem.LLIZLLLIL;
                            if (view == null) {
                                View viewLJJIJL = bulletinEmojiSelectSheetListAssem.LJJIJL();
                                if (viewLJJIJL != null) {
                                    viewFindViewById = viewLJJIJL.findViewById(R.id.d4n);
                                }
                                bulletinEmojiSelectSheetListAssem.LLIZLLLIL = (C1203130hPj) viewFindViewById;
                                view = viewFindViewById;
                            }
                            C1203130hPj c1203130hPj = (C1203130hPj) view;
                            if (c1203130hPj != null) {
                                c1203130hPj.LIZ(i3, true, C1203200hPq.LIZ);
                                return;
                            }
                            return;
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$4(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        ((MusicDetailAwemeListFragment) asS36S0100000_9.l0).wS().setState(new AwS8S0002000_9(i, i2, 1));
    }

    public static final void LJJIIZI$5(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition());
        if (viewFindViewByPosition != null) {
            viewFindViewByPosition.getTop();
        }
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        AssemVMLazy assemVMLazy = ((AddYoursDetailAwemeListFragment) asS36S0100000_9.l0).LLLILZLLLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AddYoursDetailAwemeListFragment.LLLLII;
        AddYoursDetailViewModel addYoursDetailViewModel = (AddYoursDetailViewModel) assemVMLazy.getValue();
        float f = iComputeVerticalScrollOffset / ((AddYoursDetailAwemeListFragment) asS36S0100000_9.l0).LLLIZZ;
        if (f > 1.0f) {
            f = 1.0f;
        }
        addYoursDetailViewModel.withState(new C615140OAu(addYoursDetailViewModel, f));
    }

    public static final void LJJIIZI$6(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        ChatLinearLayoutManager chatLinearLayoutManager = (ChatLinearLayoutManager) ((ScrollToBottomIndicator) asS36S0100000_9.l0).LLJIJIL.getValue();
        if (chatLinearLayoutManager != null) {
            int iLJIILIIL = chatLinearLayoutManager.LJIILIIL();
            if (iLJIILIIL < ((Number) ((ScrollToBottomIndicator) asS36S0100000_9.l0).LLILLL.LIZJ.getValue()).intValue()) {
                ((ScrollToBottomIndicator) asS36S0100000_9.l0).LLILLL.LIZIZ.setValue(Integer.valueOf(iLJIILIIL));
            }
            ScrollToBottomIndicator scrollToBottomIndicator = (ScrollToBottomIndicator) asS36S0100000_9.l0;
            C2252321DDq c2252321DDq = scrollToBottomIndicator.LLJJJ;
            boolean z = true;
            if (iLJIILIIL <= 0 && scrollToBottomIndicator.LLILZ.invoke().booleanValue()) {
                z = false;
            }
            c2252321DDq.setValue(Boolean.valueOf(z));
        }
    }

    public static final void LJJIIZI$7(AsS36S0100000_9 asS36S0100000_9, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof WrapLinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            if (linearLayoutManager.findFirstVisibleItemPosition() > 0) {
                View view = ((BulletinShareMusicListAssem) asS36S0100000_9.l0).LLIZLLLIL;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                    return;
                }
                return;
            }
            View view2 = ((BulletinShareMusicListAssem) asS36S0100000_9.l0).LLIZLLLIL;
            if (view2 == null) {
                return;
            }
            C339190DRl.LIZIZ(view2);
        }
    }
}
