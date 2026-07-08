package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS167S0101000_29;

/* JADX INFO: renamed from: X.12GK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12GK extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
    public static final int LLJJJ;
    public final int LL;
    public final boolean LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public List<C12GP> LLILZ = new ArrayList(0);
    public int LLILZIL = -1;
    public int LLILZLL = 1;
    public C421030Gf7 LLIZ;
    public C12GQ LLIZLLLIL;
    public C12GI LLJ;
    public Integer LLJI;
    public boolean LLJIJIL;

    static {
        LLJJJ = C573570MeZ.LIZ() ? 1 : 2;
    }

    public boolean LLLI(int i) {
        return true;
    }

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LLILZ.size() + 1;
    }

    public boolean LLLII(int i) {
        if (i >= 1 && i < this.LLILZ.size()) {
            return true;
        }
        return false;
    }

    public final int LLLIIIIL(Context context) {
        VideoPublishEditModel videoPublishEditModel;
        int i = 0;
        if (!this.LLILLJJLI && (videoPublishEditModel = this.LLILLL) != null && C1454030nwP.LIZJ(videoPublishEditModel)) {
            int i2 = C19726412Fy.LJIIJ;
            i = C19726412Fy.LJIILJJIL;
        }
        return (((C497820Jfg.LIZIZ(context) - LLJILLL) / 2) - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (i == this.LLILZ.size()) {
            return C12GM.ADD.getType();
        }
        if (i == 0) {
            return C12GM.BLANK_SPACE.getType();
        }
        return C12GM.THUMBNAIL.getType();
    }

    public final void LLLIILIL(List<C12GP> list, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        this.LLILZ = arrayList;
        ListProtector.add(arrayList, 0, new C12GP("", false, false, 6));
        notifyDataSetChanged();
        if (z) {
            LLLIL(((ArrayList) this.LLILZ).size() - 1, true, true, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12GK.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c421030Gf7;
        if (i == C12GM.THUMBNAIL.getType()) {
            c421030Gf7 = new C12GL((FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvz, viewGroup, false), this.LLILLJJLI);
        } else if (i == C12GM.ADD.getType()) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvw, viewGroup, false);
            if (this.LLILLJJLI) {
                viewTd.getLayoutParams().width = this.LL;
                viewTd.getLayoutParams().height = this.LL;
                C426750GoL.LJIIIZ(viewTd, null, Integer.valueOf(LLJJI), null, null, false, 29);
                C421030Gf7 c421030Gf72 = new C421030Gf7(viewTd);
                TuxIconView tuxIconView = c421030Gf72.LL;
                int i2 = LLJJIII;
                tuxIconView.setIconWidth(i2);
                tuxIconView.setIconHeight(i2);
                tuxIconView.setTintColorRes(R.attr.zl);
                c421030Gf7 = c421030Gf72;
            } else {
                c421030Gf7 = new C421030Gf7(viewTd);
            }
        } else if (i == C12GM.BLANK_SPACE.getType()) {
            int iLLLIIIIL = LLLIIIIL(viewGroup.getContext());
            final View view = new View(viewGroup.getContext());
            C786410Ut5.W5(view, new ViewGroup.LayoutParams(iLLLIIIIL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
            c421030Gf7 = new RecyclerView.ViewHolder(view) { // from class: X.12GO
            };
        } else {
            throw new IllegalArgumentException("Invalid view type");
        }
        try {
            View view2 = c421030Gf7.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c421030Gf7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c421030Gf7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c421030Gf7.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c421030Gf7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c421030Gf7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c421030Gf7.getClass().getName();
        return c421030Gf7;
    }

    public C12GK(int i, VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = videoPublishEditModel;
    }

    public final void LLLILZLLLI(C12GL c12gl, int i, boolean z) {
        if (this.LLILZLL == i) {
            if (this.LLILLJJLI) {
                C1447470nlp.LIZIZ(c12gl.LLILLL, C418440Gaw.LIZIZ(8));
                int i2 = LLJJI;
                int i3 = LLJILJILJ;
                int i4 = i2 - (i3 / 2);
                int i5 = LLJJIJI + i3;
                if (z) {
                    C338840DQc.LIZIZ(c12gl.LLILLL, i5, i5);
                    C338840DQc.LIZ(c12gl.LLILLL, Integer.valueOf(i4));
                } else {
                    ViewGroup.LayoutParams layoutParams = c12gl.LLILLL.getLayoutParams();
                    layoutParams.width = i5;
                    layoutParams.height = i5;
                    C426750GoL.LJIIIZ(c12gl.LLILLL, null, Integer.valueOf(i4), null, null, false, 29);
                }
                C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(8));
                c1331100kk8LIZLLL.LJII(C418440Gaw.LIZIZ(8));
                c1331100kk8LIZLLL.LJ(i3, C960203pA.LIZ(R.attr.zi, c12gl.LLILLJJLI));
                c1331100kk8LIZLLL.LIZIZ = false;
                c12gl.LLILLL.getHierarchy().LJJIII(c1331100kk8LIZLLL);
                return;
            }
            C1322110kVd c1322110kVd = c12gl.LLILLL;
            int i6 = LLJILJIL;
            C426750GoL.LJIIL(c1322110kVd, Integer.valueOf(i6), Integer.valueOf(i6), Integer.valueOf(i6), Integer.valueOf(i6), 16);
            C1447470nlp.LIZIZ(c12gl.LLILLL, c12gl.I5());
            if (z) {
                C1322110kVd c1322110kVd2 = c12gl.LLILLL;
                int i7 = LLJILLL;
                C338840DQc.LIZIZ(c1322110kVd2, i7, i7);
                C338840DQc.LIZ(c12gl.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
            } else {
                ViewGroup.LayoutParams layoutParams2 = c12gl.LLILLL.getLayoutParams();
                int i8 = LLJILLL;
                layoutParams2.width = i8;
                layoutParams2.height = i8;
                C426750GoL.LJIIIZ(c12gl.itemView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
            }
            View viewFindViewById = c12gl.itemView.findViewById(R.id.l86);
            if (viewFindViewById != null) {
                C12GL.N5(viewFindViewById, true, z);
            }
            C1331100kk8 c1331100kk8LIZLLL2 = C1331100kk8.LIZLLL(c12gl.I5());
            c1331100kk8LIZLLL2.LJI(c12gl.I5(), c12gl.I5(), c12gl.I5(), c12gl.I5());
            c1331100kk8LIZLLL2.LJ(LLJILJILJ, C960203pA.LIZ(R.attr.ee, c12gl.LLILLJJLI));
            c1331100kk8LIZLLL2.LIZIZ = false;
            c12gl.LLILLL.getHierarchy().LJJIII(c1331100kk8LIZLLL2);
            return;
        }
        if (this.LLILLJJLI) {
            c12gl.getClass();
            int i9 = LLJJI;
            if (z) {
                C1322110kVd c1322110kVd3 = c12gl.LLILLL;
                int i10 = LLJJIJI;
                C338840DQc.LIZIZ(c1322110kVd3, i10, i10);
                C338840DQc.LIZ(c12gl.LLILLL, Integer.valueOf(i9));
            } else {
                ViewGroup.LayoutParams layoutParams3 = c12gl.LLILLL.getLayoutParams();
                int i11 = LLJJIJI;
                layoutParams3.width = i11;
                layoutParams3.height = i11;
                C426750GoL.LJIIIZ(c12gl.LLILLL, null, Integer.valueOf(i9), null, null, false, 29);
            }
            C426750GoL.LJIIL(c12gl.LLILLL, 0, 0, 0, 0, 16);
            C1447470nlp.LIZIZ(c12gl.LLILLL, C418440Gaw.LIZIZ(8));
            C1331100kk8 c1331100kk8LIZLLL3 = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(8));
            c1331100kk8LIZLLL3.LIZIZ = false;
            c12gl.LLILLL.getHierarchy().LJJIII(c1331100kk8LIZLLL3);
            return;
        }
        if (z) {
            C1322110kVd c1322110kVd4 = c12gl.LLILLL;
            int i12 = LLJJ;
            C338840DQc.LIZIZ(c1322110kVd4, i12, i12);
            C338840DQc.LIZ(c12gl.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        } else {
            ViewGroup.LayoutParams layoutParams4 = c12gl.LLILLL.getLayoutParams();
            int i13 = LLJJ;
            layoutParams4.width = i13;
            layoutParams4.height = i13;
            C426750GoL.LJIIIZ(c12gl.itemView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
        }
        View viewFindViewById2 = c12gl.itemView.findViewById(R.id.l86);
        if (viewFindViewById2 != null) {
            C12GL.N5(viewFindViewById2, false, z);
        }
        C426750GoL.LJIIL(c12gl.LLILLL, 0, 0, 0, 0, 16);
        C1447470nlp.LIZIZ(c12gl.LLILLL, c12gl.L5());
        C1331100kk8 c1331100kk8LIZLLL4 = C1331100kk8.LIZLLL(c12gl.L5());
        c1331100kk8LIZLLL4.LIZIZ = false;
        c12gl.LLILLL.getHierarchy().LJJIII(c1331100kk8LIZLLL4);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (viewHolder instanceof C12GL) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof Bundle) {
                    LLLILZLLLI((C12GL) viewHolder, i, true);
                }
            }
            return;
        }
        onBindViewHolder(viewHolder, i);
    }

    public final void LLLFZ(int i, String str, boolean z, boolean z2) {
        int i2 = i + 1;
        if (i2 >= 0 && i2 <= ((ArrayList) this.LLILZ).size()) {
            ListProtector.add(this.LLILZ, i2, new C12GP(str, false, z2, 2));
            if (z) {
                this.LLILZLL = i2 + 1;
                notifyDataSetChanged();
                C0CNO.LIZLLL(300L, new AwS167S0101000_29(i2, this, 3));
                return;
            }
            notifyDataSetChanged();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageThumbnailAdapter add invalid index:");
        sbLIZ.append(i);
        sbLIZ.append(" for ");
        sbLIZ.append(((ArrayList) this.LLILZ).size());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LLLIL(int i, boolean z, boolean z2, boolean z3) {
        int i2;
        C12GQ c12gq;
        if (LLLII(i) && (i2 = this.LLILZLL) != i) {
            this.LLILZLL = i;
            if (LLLII(i2)) {
                notifyItemChanged(i2, new Bundle());
            }
            notifyItemChanged(this.LLILZLL, new Bundle());
            if (z && (c12gq = this.LLIZLLLIL) != null) {
                c12gq.LIZIZ(this.LLILZLL, z2, z3);
            }
        }
    }
}
