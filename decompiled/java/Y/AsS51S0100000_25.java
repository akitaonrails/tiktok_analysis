package Y;

import X.AbstractC1585810rMx;
import X.AbstractC1640400sn0;
import X.C11VU;
import X.C1322200kVm;
import X.C13LP;
import X.C1623660sM0;
import X.C1629980sWC;
import X.C1630540sX6;
import X.C1634100scq;
import X.C1640570snH;
import X.C1640580snI;
import X.C1640610snL;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.sticker.pagination.CategoryEffectPageFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AsS51S0100000_25 extends AbstractC1585810rMx {
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
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case 7:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 8:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$9(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$10(this, recyclerView, i);
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
            case 6:
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
            case 7:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS51S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1629980sWC c1629980sWC = (C1629980sWC) asS51S0100000_25.l0;
            if (c1629980sWC.LJIIIIZZ) {
                c1629980sWC.LJIIIIZZ = false;
                return;
            }
            return;
        }
        if (1 != i) {
            return;
        }
        ((C1629980sWC) asS51S0100000_25.l0).LJIIIIZZ = true;
    }

    public static final void LJJIIJ$1(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        CategoryEffectPageFragment categoryEffectPageFragment;
        String str;
        if (!Intrinsics.LJFF(((CategoryEffectPageFragment) asS51S0100000_25.l0).iS().Xp0().getValue(), Boolean.TRUE)) {
            return;
        }
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
        if (((CategoryEffectPageFragment) asS51S0100000_25.l0).LLILZ != null) {
            if ((r0.getItemCount() - 2) - iFindLastVisibleItemPosition <= ((CategoryEffectPageFragment) asS51S0100000_25.l0).PR().LIZ.LJJLIIIJJIZ().LJ.LIZLLL && (str = (categoryEffectPageFragment = (CategoryEffectPageFragment) asS51S0100000_25.l0).LLJJ) != null) {
                categoryEffectPageFragment.iS().XH2(str);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LJJIIJ$10(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C1322200kVm.LIZ().LJIILLIIL();
                }
            } else if (((TrendsTabFragment) asS51S0100000_25.l0).LLJI == 2) {
                C1322200kVm.LIZ().LJIILLIIL();
            } else if (C1322200kVm.LIZ().LJIILL()) {
                C1322200kVm.LIZ().LJIJJ();
            }
        } else if (C1322200kVm.LIZ().LJIILL()) {
            C1322200kVm.LIZ().LJIJJ();
        }
        ((TrendsTabFragment) asS51S0100000_25.l0).LLJI = i;
    }

    public static final void LJJIIJ$2(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        ((AbstractStickerFragment) asS51S0100000_25.l0).LLJILJIL.onNext(Integer.valueOf(i));
    }

    public static final void LJJIIJ$3(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        C1640580snI c1640580snI = (C1640580snI) asS51S0100000_25.l0;
        if (c1640580snI.LJJJ != i) {
            c1640580snI.LJJJ = i;
            c1640580snI.LJJIJIIJI(i);
        }
    }

    public static final void LJJIIJ$4(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        ((AbstractC1640400sn0) asS51S0100000_25.l0).LJIJJ.onNext(Integer.valueOf(i));
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                AbstractC1640400sn0 abstractC1640400sn0 = (AbstractC1640400sn0) asS51S0100000_25.l0;
                int iLJIILLIIL = abstractC1640400sn0.LJIILLIIL(iFindFirstVisibleItemPosition);
                C1634100scq c1634100scq = (C1634100scq) C13LP.LJJJLZIJ(iLJIILLIIL, abstractC1640400sn0.LJIIIIZZ().getData());
                if (c1634100scq != null) {
                    abstractC1640400sn0.LJIJJLI.onNext(new Pair(c1634100scq.LIZ, Integer.valueOf(iLJIILLIIL)));
                }
            }
            ((AbstractC1640400sn0) asS51S0100000_25.l0).LJJI();
        }
    }

    public static final void LJJIIJ$5(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        C1640570snH c1640570snH = (C1640570snH) asS51S0100000_25.l0;
        if (c1640570snH.LJJJIL != i) {
            c1640570snH.LJJJIL = i;
            c1640570snH.LJJIJIIJIL(i);
        }
    }

    public static final void LJJIIJ$6(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        ((EffectTemplateCategoryFragment) asS51S0100000_25.l0).LLJJIJI.onNext(Integer.valueOf(i));
    }

    public static final void LJJIIJ$7(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        C1640610snL c1640610snL = (C1640610snL) asS51S0100000_25.l0;
        if (c1640610snL.LJJIJLIJ != i) {
            c1640610snL.LJJIJLIJ = i;
            c1640610snL.LJJIJ(i);
        }
    }

    public static final void LJJIIJ$8(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        if (((SearchStickerViewContainer) asS51S0100000_25.l0).LJ() && i == 1) {
            ((SearchStickerViewContainer) asS51S0100000_25.l0).x4();
        }
    }

    public static final void LJJIIJ$9(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i) {
        if (((SearchStickerViewContainer) asS51S0100000_25.l0).LJ() && i == 1) {
            ((SearchStickerViewContainer) asS51S0100000_25.l0).x4();
        }
    }

    public static final void LJJIIZI$0(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        Effect effect;
        C1629980sWC c1629980sWC = (C1629980sWC) asS51S0100000_25.l0;
        if (c1629980sWC.LJIIIZ || c1629980sWC.LJIIIIZZ) {
            int iFindLastVisibleItemPosition = c1629980sWC.LJFF.findLastVisibleItemPosition();
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c1629980sWC.LIZ.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                int[] iArr = new int[2];
                viewHolderFindViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                c1629980sWC.LIZ.getLocationOnScreen(iArr2);
                int i3 = iArr[0];
                if (i3 != 0 && iArr2[0] != 0 && i3 + C11VU.LIZ(10.0f) >= iArr2[0] + c1629980sWC.LIZ.getWidth()) {
                    iFindLastVisibleItemPosition--;
                }
            }
            for (int iFindFirstVisibleItemPosition = c1629980sWC.LJFF.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
                C1630540sX6 c1630540sX6 = c1629980sWC.LIZIZ;
                if (iFindFirstVisibleItemPosition >= 0) {
                    if (iFindFirstVisibleItemPosition < c1630540sX6.getItemCount()) {
                        effect = (Effect) ListProtector.get(c1630540sX6.LL, iFindFirstVisibleItemPosition);
                    }
                    if (c1630540sX6.LLILLJJLI == null && effect != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("impr_position", c1630540sX6.LLILLL);
                        EffectCategoryModel effectCategoryModelLIZ = C1623660sM0.LIZ(c1630540sX6.LLIZ);
                        c1630540sX6.LLILLJJLI.LJII(iFindFirstVisibleItemPosition + 1, bundle, c1630540sX6.LLJI.propFromGroupModel, effect, effectCategoryModelLIZ.getName(), effectCategoryModelLIZ.getKey(), "click_main_panel", "main_panel");
                    }
                } else {
                    c1630540sX6.getClass();
                }
                effect = null;
                if (c1630540sX6.LLILLJJLI == null) {
                }
            }
            ((C1629980sWC) asS51S0100000_25.l0).LJIIIZ = false;
        }
    }

    public static final void LJJIIZI$1(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        C1640580snI c1640580snI = (C1640580snI) asS51S0100000_25.l0;
        c1640580snI.LJJIJIIJI(c1640580snI.LJJJ);
    }

    public static final void LJJIIZI$2(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        ((AbstractC1640400sn0) asS51S0100000_25.l0).LJIL.onNext(Integer.valueOf(i2));
    }

    public static final void LJJIIZI$3(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        C1640570snH c1640570snH = (C1640570snH) asS51S0100000_25.l0;
        c1640570snH.LJJIJIIJIL(c1640570snH.LJJJIL);
        if (((ArrayList) ((C1640570snH) asS51S0100000_25.l0).LJJJJI).isEmpty()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            C1640570snH c1640570snH2 = (C1640570snH) asS51S0100000_25.l0;
            if (linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition()) != null) {
                c1640570snH2.getClass();
            }
        }
    }

    public static final void LJJIIZI$4(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        ((Function0) asS51S0100000_25.l0).invoke();
    }

    public static final void LJJIIZI$5(AsS51S0100000_25 asS51S0100000_25, RecyclerView recyclerView, int i, int i2) {
        C1640610snL c1640610snL = (C1640610snL) asS51S0100000_25.l0;
        c1640610snL.LJJIJ(c1640610snL.LJJIJLIJ);
    }
}
