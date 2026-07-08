package Y;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C0CHQ;
import X.C0LJU;
import X.C0LJV;
import X.C0MX0;
import X.C1659640tI2;
import X.C259800zU;
import X.C473001sm;
import X.C528350Knp;
import X.C528360Knq;
import X.C528500Ko4;
import X.C528760KoU;
import X.C533680KwQ;
import X.C540760LIs;
import X.C569680MVy;
import X.C786410Ut5;
import X.InterfaceC528570KoB;
import X.InterfaceC540750LIr;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.utils.oh;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AsS35S0100000_8 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
            case 5:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 2:
                LJJIIZI$0(this, recyclerView, i, i2);
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
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS35S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i) {
        InterfaceC540750LIr interfaceC540750LIr;
        if (C0CHQ.LIZ().LJJJI().isAlbumOptDegradation()) {
            if (i != 2) {
                Object adapter = ((C540760LIs) asS35S0100000_8.l0).getAdapter();
                if ((adapter instanceof InterfaceC540750LIr) && (interfaceC540750LIr = (InterfaceC540750LIr) adapter) != null) {
                    interfaceC540750LIr.LJJJJL();
                }
            } else {
                return;
            }
        }
        if (i != 2) {
            oh.LJ("tool_album_scroll");
            oh.LJ("tool_album_scroll_high_speed");
        }
    }

    public static final void LJJIIJ$1(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C528760KoU) asS35S0100000_8.l0).c();
        }
    }

    public static final void LJJIIJ$2(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C528350Knp) asS35S0100000_8.l0).LLZ();
        }
    }

    public static final void LJJIIJ$3(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i) {
        if (((C0LJV) asS35S0100000_8.l0).isEnabled()) {
            if (i != 0) {
                if (i == 1) {
                    ((C0LJV) asS35S0100000_8.l0).getHandler().removeCallbacks(((C0LJV) asS35S0100000_8.l0).LLJILLL);
                    return;
                }
                return;
            }
            if (!((C0LJV) asS35S0100000_8.l0).LLILZIL.isSelected()) {
                C786410Ut5.LJLIIL(500L, ((C0LJV) asS35S0100000_8.l0).getHandler(), ((C0LJV) asS35S0100000_8.l0).LLJILLL);
            }
            ((C0LJV) asS35S0100000_8.l0).LJFF();
            C0LJU c0lju = ((C0LJV) asS35S0100000_8.l0).LLJI;
            if (c0lju == null) {
                return;
            }
            c0lju.onFastScrollStop(false);
        }
    }

    public static final void LJJIIJ$4(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C473001sm) asS35S0100000_8.l0).LIZ();
        }
    }

    public static final void LJJIIZI$0(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        GridLayoutManager gridLayoutManager;
        LiveRecordingsDataManager liveRecordingsDataManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            int childCount = gridLayoutManager.getChildCount();
            int itemCount = gridLayoutManager.getItemCount();
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            int i3 = gridLayoutManager.LLILLJJLI * 2;
            final C528350Knp c528350Knp = (C528350Knp) asS35S0100000_8.l0;
            if (!c528350Knp.LLLLLZIL && c528350Knp.LLLLLZL && childCount + iFindFirstVisibleItemPosition >= itemCount - i3 && iFindFirstVisibleItemPosition >= 0) {
                c528350Knp.LLLLLZIL = true;
                final ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZLLL(c528350Knp).LIZ(ChooseMediaViewModel.class);
                if (chooseMediaViewModel != null && (liveRecordingsDataManager = c528350Knp.LLLZIIL) != null) {
                    liveRecordingsDataManager.LIZIZ(new C533680KwQ(c528350Knp.LLLZ, c528350Knp.LLLZI, c528350Knp.LLLLZLLIL, c528350Knp.LLLLZLLLI), c528350Knp.LLLLZLL, false, new InterfaceC528570KoB() { // from class: X.0Knt
                        @Override // X.InterfaceC528570KoB
                        public final void onError(Throwable th) {
                            C528350Knp c528350Knp2 = c528350Knp;
                            c528350Knp2.LLLLLZIL = false;
                            C537680L6w.LIZ(C533770KwZ.LIZIZ, c528350Knp2.LLLLLLJ, "loadMore onError: ", th);
                        }

                        @Override // X.InterfaceC528570KoB
                        public final void LIZ(List<? extends TikTokMediaModel> list, boolean z) {
                            c528350Knp.LLLLLZL = z;
                            if (!list.isEmpty()) {
                                chooseMediaViewModel.CR2(list, false);
                            }
                            c528350Knp.LLLLLZIL = false;
                        }
                    });
                }
            }
        }
    }

    public static final void LJJIIZI$1(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (!((C0LJV) asS35S0100000_8.l0).LLILZIL.isSelected() && ((C0LJV) asS35S0100000_8.l0).isEnabled()) {
            C0LJV c0ljv = (C0LJV) asS35S0100000_8.l0;
            c0ljv.setTimeLineViewsPosition(c0ljv.LIZLLL(recyclerView));
        }
        C0LJV c0ljv2 = (C0LJV) asS35S0100000_8.l0;
        if (c0ljv2.LLJJIJI) {
            C786410Ut5.LJLLLLLL(8, c0ljv2.LLJ);
            ((C0LJV) asS35S0100000_8.l0).LLJJIJI = false;
        } else {
            C786410Ut5.LJLLLLLL(0, c0ljv2.LLJ);
        }
        if (((C0LJV) asS35S0100000_8.l0).LLJIJIL != null && recyclerView.getLayoutManager() != null) {
            ((C0LJV) asS35S0100000_8.l0).LJFF();
        }
        ((C0LJV) asS35S0100000_8.l0).getClass();
    }

    public static final void LJJIIZI$2(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        C528360Knq c528360Knq = (C528360Knq) asS35S0100000_8.l0;
        int i3 = c528360Knq.LJIIJ + i2;
        c528360Knq.LJIIJ = i3;
        if (i3 > 100) {
            c528360Knq.LIZIZ();
            ((C528360Knq) asS35S0100000_8.l0).LJIIJ = 0;
        } else {
            if (i3 >= -100) {
                return;
            }
            c528360Knq.LIZLLL();
            ((C528360Knq) asS35S0100000_8.l0).LJIIJ = 0;
        }
    }

    public static final void LJJIIZI$3(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        GridLayoutManager gridLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            C0MX0 c0mx0 = ((AIPortraitTabFragment) asS35S0100000_8.l0).LLJI;
            if (c0mx0 != null) {
                c0mx0.LLLIIIIL(gridLayoutManager);
            }
            ((AIPortraitTabFragment) asS35S0100000_8.l0).RR();
        }
    }

    public static final void LJJIIZI$4(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        ((C473001sm) asS35S0100000_8.l0).LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIZI$5(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        if (((LinearLayoutManager) ((C259800zU) asS35S0100000_8.l0).element).findFirstVisibleItemPosition() != -1) {
            C528500Ko4.LIZ = ((LinearLayoutManager) ((C259800zU) asS35S0100000_8.l0).element).findFirstVisibleItemPosition();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIZI$6(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        if (((LinearLayoutManager) ((C259800zU) asS35S0100000_8.l0).element).findFirstVisibleItemPosition() != -1) {
            C528500Ko4.LIZ = ((LinearLayoutManager) ((C259800zU) asS35S0100000_8.l0).element).findFirstVisibleItemPosition();
        }
    }

    public static final void LJJIIZI$7(AsS35S0100000_8 asS35S0100000_8, RecyclerView recyclerView, int i, int i2) {
        View view;
        int i3;
        AbstractC21673619ry adapter;
        C569680MVy c569680MVy = (C569680MVy) asS35S0100000_8.l0;
        RecyclerView recyclerView2 = c569680MVy.LLJI;
        if (recyclerView2 != null && (view = c569680MVy.LLIZ) != null) {
            if (c569680MVy.LLJJIJIIJIL) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            if (recyclerView2.canScrollHorizontally(i3) && (adapter = recyclerView2.getAdapter()) != null && adapter.getItemCount() > 0) {
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }
}
