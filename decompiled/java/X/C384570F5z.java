package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384570F5z extends AbstractC21673619ry<C0F62> {
    public static final float LLJJIJIIJIL = C418440Gaw.LIZIZ(7);
    public ArrayList<CaptionUtterance> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C0EJ3 LLILZ;
    public final C0F6L LLILZIL;
    public final Boolean LLILZLL;
    public final C563400M7u LLIZ;
    public C0F63 LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public RecyclerView LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public List<? extends C0EVA> LLJJIII;
    public C0EVC LLJJIJI;

    public final int LLLFZ() {
        return this.LLIZ.LIZJ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLI(int i) {
        if (i != -1 && i != this.LLIZ.LIZJ()) {
            int iLIZJ = this.LLIZ.LIZJ();
            this.LLIZ.LJ(i);
            try {
                notifyItemChanged(iLIZJ, "payload_highlight");
                notifyItemChanged(i, "payload_highlight");
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("highLightItem exception: ");
                sbLIZ.append(e);
                C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LLLII(ConstraintLayout constraintLayout) {
        int i;
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
            i = 16;
        } else {
            i = 12;
        }
        c19mb.LJIIIZ(R.id.dch, 6, R.id.ukj, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        c19mb.LIZIZ(constraintLayout);
    }

    public final void LLLIIIIL(ConstraintLayout constraintLayout) {
        int i;
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
            i = 16;
        } else {
            i = 12;
        }
        c19mb.LJIIIZ(R.id.dch, 6, R.id.tv_start_time, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        c19mb.LIZIZ(constraintLayout);
    }

    public final void LLLIILIL(boolean z) {
        Iterator<CaptionUtterance> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().isSelected = z;
        }
        C0F6L c0f6l = this.LLILZIL;
        if (c0f6l != null) {
            c0f6l.Qq(z);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLILLL && this.LLILLJJLI) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJILLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
        }
    }

    public final void setData(List<CaptionUtterance> list) {
        ArrayList<CaptionUtterance> arrayList = new ArrayList<>();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(new CaptionUtterance((CaptionUtterance) it2.next()));
        }
        this.LL = arrayList;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C0F62 c0f62 = (C0F62) viewHolder;
        if (this.LLIZ.LIZJ() == i) {
            z = true;
        } else {
            z = false;
        }
        c0f62.I5((CaptionUtterance) ListProtector.get(this.LL, i), i, z);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0f61;
        if (i != 1) {
            if (i == 2) {
                c0f61 = new C0F6O(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bzy, viewGroup, false), viewGroup.getContext());
            } else {
                throw new RuntimeException("wrong caption type");
            }
        } else {
            c0f61 = new C0F61(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fiq, viewGroup, false), viewGroup.getContext());
        }
        try {
            View view = c0f61.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0f61.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0f61.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0f61.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0f61.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0f61.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0f61.getClass().getName();
        return c0f61;
    }

    public final void LLLIL(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z, boolean z2) {
        this.LLJJ = z;
        for (CaptionUtterance captionUtterance : this.LL) {
            captionUtterance.isSelected = false;
            if (z2) {
                captionUtterance.needAnim = true;
            }
        }
        notifyDataSetChanged();
        if (z2) {
            C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C315580CYq(this, null), 3);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        boolean z;
        C0F62 c0f62 = (C0F62) viewHolder;
        if (this.LLIZ.LIZJ() == i) {
            z = true;
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            c0f62.I5((CaptionUtterance) ListProtector.get(this.LL, i), i, z);
        } else {
            if (!Intrinsics.LJFF(C13LP.LJJJJZI(list).toString(), "payload_highlight")) {
                return;
            }
            c0f62.L5(i, z);
        }
    }

    public C384570F5z(ArrayList<CaptionUtterance> arrayList, boolean z, boolean z2, C0EJ3 c0ej3, C0F6L c0f6l, Boolean bool) {
        this.LL = arrayList;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c0ej3;
        this.LLILZIL = c0f6l;
        this.LLILZLL = bool;
        this.LLIZ = new C563400M7u(-1);
        this.LLJIJIL = -1;
        this.LLJILJIL = -1;
        this.LLJILJILJ = -1;
        this.LLJJIII = C13BV.INSTANCE;
    }

    public /* synthetic */ C384570F5z(ArrayList arrayList, boolean z, boolean z2, C0EJ3 c0ej3, Boolean bool, int i) {
        this((ArrayList<CaptionUtterance>) arrayList, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : c0ej3, (C0F6L) null, (i & 32) != 0 ? null : bool);
    }
}
