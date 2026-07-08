package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.ecommerce.mix.api.BaseMixContainerAbility;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment;

/* JADX INFO: renamed from: X.0gMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162840gMk extends AbstractC1161490gKZ implements InterfaceC1161450gKV, InterfaceC1166540gSi {
    public RecyclerView LLILLJJLI;
    public int LLILLL = -1;
    public boolean LLILZ = true;
    public final /* synthetic */ StoreMixTabFragment LLILZIL;

    @Override // X.InterfaceC1166540gSi
    public final void LIZ() {
    }

    @Override // X.InterfaceC1166540gSi
    public final void LJFF() {
    }

    @Override // X.InterfaceC1166540gSi
    public final void LLZZJLIL(C16GX c16gx, int i) {
    }

    public C1162840gMk(StoreMixTabFragment storeMixTabFragment) {
        this.LLILZIL = storeMixTabFragment;
        BaseMixContainerAbility baseMixContainerAbility = (BaseMixContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(storeMixTabFragment, null), BaseMixContainerAbility.class, null);
        if (baseMixContainerAbility != null) {
            baseMixContainerAbility.aK(this);
        }
    }

    @Override // X.InterfaceC1161450gKV
    public final void LIZIZ(int i, int i2) {
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            StoreMixTabFragment storeMixTabFragment = this.LLILZIL;
            if (i2 > 0) {
                if (this.LLILZ) {
                    this.LLILZ = false;
                    LJIIJJI(1, "down");
                }
            } else if (i2 < 0 && this.LLILZ) {
                this.LLILZ = false;
                LJIIJJI(1, "up");
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                iFindLastVisibleItemPosition = -1;
            }
            if (iFindLastVisibleItemPosition != this.LLILLL) {
                this.LLILLL = iFindLastVisibleItemPosition;
                FrameLayout frameLayout = storeMixTabFragment.LLJI;
                if (frameLayout != null) {
                    if (iFindLastVisibleItemPosition >= 17) {
                        if (frameLayout.getVisibility() == 8) {
                            C03DZ.LIZJ(frameLayout);
                            C786410Ut5.U4(frameLayout, 0.5f);
                            return;
                        }
                        return;
                    }
                    C0H1U.LIZIZ(frameLayout);
                }
            }
        }
    }

    public final void LJIIJJI(int i, String str) {
        int iLIZIZ;
        StoreMixTabFragment storeMixTabFragment = this.LLILZIL;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("state", Integer.valueOf(i));
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            iLIZIZ = C679280Qkg.LIZIZ(Integer.valueOf(recyclerView.computeVerticalScrollOffset()));
        } else {
            iLIZIZ = 0;
        }
        javaOnlyMap.put("scroll_top", Integer.valueOf(iLIZIZ));
        if (str != null) {
            javaOnlyMap.put("direction", str);
        }
        storeMixTabFragment.kU("ec_store_event_product_list_scroll_status", javaOnlyMap);
    }

    @Override // X.InterfaceC1161450gKV
    public final void LLF(RecyclerView recyclerView, int i) {
        this.LLILLJJLI = recyclerView;
        if (i == 0) {
            LJIIJJI(0, null);
            this.LLILZ = true;
            FrameLayout frameLayout = this.LLILZIL.LLJI;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                C786410Ut5.U4(frameLayout, 1.0f);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.LLILZIL.LLJI;
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            return;
        }
        C786410Ut5.U4(frameLayout2, 0.5f);
    }
}
