package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953190aub extends AbstractC960470b6L<C950910aqv> {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final RecyclerView LLILLL;
    public C953400auw LLILZ;
    public boolean LLILZIL;
    public List<C953540avA> LLILZLL;
    public final C01GW LLIZ;

    public C953190aub(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_show_all);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.tvr);
        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 601));
    }

    public final void L5(C950910aqv c950910aqv) {
        float fLIZIZ;
        if (this.LLILZ == null) {
            this.LLILZ = new C953400auw(c950910aqv.LIZ, new C953200auc(this));
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
                recyclerView3.setAdapter((AbstractC21673619ry) this.LLIZ.getValue());
            }
            RecyclerView recyclerView4 = this.LLILLL;
            if (recyclerView4 != null) {
                if ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(20.0f))) % ((int) C497740JfY.LIZIZ(90.0f)) != 0) {
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
        List<C953540avA> list = this.LLILZLL;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(3);
            int i2 = 0;
            do {
                arrayList.add(new InterfaceC951240arS<Object>() { // from class: X.0aue
                    @Override // X.InterfaceC951240arS
                    public final boolean LIZIZ(Object obj) {
                        return true;
                    }

                    @Override // X.InterfaceC951240arS
                    public final boolean LJII(Object obj) {
                        return obj instanceof C953220aue;
                    }
                });
                i2++;
            } while (i2 < 3);
            ((C1117360fBO) this.LLIZ.getValue()).LLLII(arrayList);
        }
        final C953400auw c953400auw = this.LLILZ;
        if (c953400auw != null) {
            List<C953540avA> listLJIIIIZZ = C953400auw.LJIIIIZZ();
            if (!((ArrayList) listLJIIIIZZ).isEmpty()) {
                c953400auw.LJIIJ(listLJIIIIZZ, true, false);
            } else {
                C953230auf c953230auf = C953230auf.LIZ;
                InterfaceC952880au6 interfaceC952880au6 = new InterfaceC952880au6() { // from class: X.0aud
                    public final /* synthetic */ boolean LIZIZ = true;

                    @Override // X.InterfaceC952880au6
                    public final void onSuccess() {
                        MultiCanvasUtils.LIZ.getClass();
                        MultiCanvasUtils.LJIJ();
                        C953400auw c953400auw2 = c953400auw;
                        c953400auw2.getClass();
                        c953400auw2.LJIIJ(C953400auw.LJIIIIZZ(), this.LIZIZ, false);
                    }

                    @Override // X.InterfaceC952880au6
                    public final void LIZ(Throwable th) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetch onFail throwable:");
                        sbLIZ.append(th);
                        C20441214yg.LJIIIZ("NoticeboardViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                c953230auf.getClass();
                C953230auf.LIZLLL(1, interfaceC952880au6);
            }
        }
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131854243));
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            C500260Jjc.LJLIIIL(500L, textView2, new AwS381S0200000_15(c950910aqv, this, 89));
        }
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C950910aqv) obj);
    }
}
