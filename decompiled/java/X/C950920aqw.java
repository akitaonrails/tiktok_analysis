package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.AllShareBgDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS66S1000000_15;

/* JADX INFO: renamed from: X.0aqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950920aqw extends AbstractC960470b6L<C950900aqu> {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final RecyclerView LLILLL;
    public final View LLILZ;
    public C950690aqZ LLILZIL;
    public AllShareBgDialog LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public List<C950750aqf> LLJ;
    public final Rect LLJI;
    public final C01GW LLJIJIL;

    public C950920aqw(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_show_all);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.tvr);
        this.LLILZ = view.findViewById(R.id.tv_unavailable);
        this.LLJI = new Rect();
        this.LLJIJIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 607));
    }

    public final void N5(boolean z) {
        int i = 0;
        if (!z) {
            AllShareBgDialog allShareBgDialog = this.LLILZLL;
            if (allShareBgDialog != null) {
                allShareBgDialog.close(1);
            }
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                C500260Jjc.LJLJLJ(textView, false);
            }
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                C500260Jjc.LJLJLJ(recyclerView, false);
            }
            View view = this.LLILZ;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, true);
                return;
            }
            return;
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            C500260Jjc.LJLJLJ(textView2, true);
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            C500260Jjc.LJLJLJ(recyclerView2, true);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        List<C950750aqf> list = this.LLJ;
        if (list == null || list.isEmpty()) {
            C1117360fBO c1117360fBO = (C1117360fBO) this.LLJIJIL.getValue();
            ArrayList arrayList = new ArrayList(4);
            do {
                arrayList.add(new InterfaceC951240arS<Object>() { // from class: X.0arB
                    @Override // X.InterfaceC951240arS
                    public final boolean LIZIZ(Object obj) {
                        return true;
                    }

                    @Override // X.InterfaceC951240arS
                    public final boolean LJII(Object obj) {
                        return obj instanceof C951070arB;
                    }
                });
                i++;
            } while (i < 4);
            c1117360fBO.LLLII(arrayList);
        }
        C950690aqZ c950690aqZ = this.LLILZIL;
        if (c950690aqZ == null) {
            return;
        }
        C950940aqy c950940aqy = new C950940aqy(this);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJI(new C771260UNg(c950690aqZ, jCurrentTimeMillis, c950940aqy), true);
    }

    public final void P5(boolean z) {
        List<C950750aqf> list;
        if (this.LLIZLLLIL || (list = this.LLJ) == null) {
            return;
        }
        if (!z && !this.itemView.getGlobalVisibleRect(this.LLJI)) {
            return;
        }
        int templateQuickSelectMaxCount = MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount();
        if (this.LLILZIL != null) {
            C950690aqZ.LIZLLL(C13LP.LL(list, templateQuickSelectMaxCount), this.LLIZLLLIL);
        }
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
        }
    }

    public final void R5(C950900aqu c950900aqu) {
        Boolean boolLIZJ;
        float fLIZIZ;
        if (this.LLILZIL == null) {
            this.LLILZIL = new C950690aqZ(c950900aqu.LIZ, new C950950aqz(this), new C950990ar3(this));
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
            }
            RecyclerView recyclerView2 = this.LLILLL;
            if (recyclerView2 != null) {
                recyclerView2.setOverScrollMode(2);
            }
            RecyclerView recyclerView3 = this.LLILLL;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter((AbstractC21673619ry) this.LLJIJIL.getValue());
            }
            RecyclerView recyclerView4 = this.LLILLL;
            if (recyclerView4 != null) {
                int iLJIIZILJ = C497740JfY.LJIIZILJ();
                if ((iLJIIZILJ - ((int) C497740JfY.LIZIZ(20.0f))) % ((int) C497740JfY.LIZIZ(70.0f)) != 0) {
                    fLIZIZ = C497740JfY.LIZIZ(6.0f);
                } else {
                    fLIZIZ = C497740JfY.LIZIZ(4.0f);
                }
                int i = (int) fLIZIZ;
                int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
                if (recyclerView4.getItemDecorationCount() == 0) {
                    recyclerView4.addItemDecoration(new C943340aei(i, iLIZIZ, iLIZIZ));
                }
            }
        }
        C950690aqZ c950690aqZ = this.LLILZIL;
        if (c950690aqZ != null) {
            boolLIZJ = c950690aqZ.LIZJ();
        } else {
            boolLIZJ = null;
        }
        N5(C500260Jjc.LJJJI(boolLIZJ));
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131854241));
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            C500260Jjc.LJLIIIL(500L, textView2, new AwS381S0200000_15(c950900aqu, this, 90));
        }
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        R5((C950900aqu) obj);
    }

    public final void L5(List<C950750aqf> list, boolean z) {
        String strLIZ;
        if (list != null && !list.isEmpty()) {
            this.LLJ = list;
            C950690aqZ c950690aqZ = this.LLILZIL;
            if (c950690aqZ != null) {
                strLIZ = c950690aqZ.LIZ();
            } else {
                strLIZ = null;
            }
            C953470av3 c953470av3 = C953470av3.LIZ;
            RecyclerView recyclerView = this.LLILLL;
            AwS66S1000000_15 awS66S1000000_15 = new AwS66S1000000_15(strLIZ, 4);
            c953470av3.getClass();
            C953470av3.LJFF(recyclerView, list, awS66S1000000_15, z);
            P5(false);
        }
    }
}
