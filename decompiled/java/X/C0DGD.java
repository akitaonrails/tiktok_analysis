package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DGD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGD extends AbstractC21673619ry<C336310DGj> {
    public boolean LLILLJJLI;
    public List<String> LL = C13BV.INSTANCE;
    public C0D4K LLILLL = C0D4K.LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLILLJJLI || this.LL.isEmpty()) {
            return 1;
        }
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C336310DGj c336310DGj = (C336310DGj) viewHolder;
        c336310DGj.LL.setImageDrawable(null);
        super.onViewRecycled(c336310DGj);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C336310DGj c336310DGj = (C336310DGj) viewHolder;
        Context context = c336310DGj.LL.getContext();
        if (context != null) {
            C0D4K c0d4k = this.LLILLL;
            if (c0d4k == C0D4K.LLILLJJLI) {
                c336310DGj.LL.setImageDrawable(null);
                c336310DGj.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                c336310DGj.LL.setBackgroundResource(R.drawable.fh0);
            } else {
                if (c0d4k != C0D4K.LLILLL && !this.LL.isEmpty()) {
                    String str = (String) ListProtector.get(this.LL, i);
                    c336310DGj.LL.setBackground(null);
                    c336310DGj.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
                    if (numLIZJ != null) {
                        c336310DGj.LL.setBackgroundColor(numLIZJ.intValue());
                    }
                    C0D8X.LIZ().LIZ(str, c336310DGj.LL, 0.0f, null);
                    return;
                }
                c336310DGj.LL.setBackground(null);
                C0DJY.LIZ(c336310DGj.LL);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C336310DGj c336310DGj = new C336310DGj(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i4d, viewGroup, false));
        try {
            View view = c336310DGj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c336310DGj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c336310DGj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C336310DGj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c336310DGj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c336310DGj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C336310DGj.class.getName();
        return c336310DGj;
    }

    public final boolean LLLFZ(List<String> list, boolean z, boolean z2) {
        C0D4K c0d4k;
        if (z) {
            c0d4k = C0D4K.LLILLJJLI;
        } else if (z2) {
            c0d4k = C0D4K.LLILLL;
        } else {
            c0d4k = C0D4K.LL;
        }
        final List<String> list2 = this.LL;
        if (list2 == list && this.LLILLJJLI == z && this.LLILLL == c0d4k) {
            return false;
        }
        boolean z3 = this.LLILLJJLI;
        C0D4K c0d4k2 = this.LLILLL;
        final List<String> listLLIIII = C13LP.LLIIII(list);
        this.LL = listLLIIII;
        this.LLILLJJLI = z;
        this.LLILLL = c0d4k;
        if (z3 == z && c0d4k2 == c0d4k) {
            C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0DG5
                @Override // X.AbstractC21342018fa
                public final int LIZLLL() {
                    return listLLIIII.size();
                }

                @Override // X.AbstractC21342018fa
                public final int LJ() {
                    return list2.size();
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZ(int i, int i2) {
                    return Intrinsics.LJFF(ListProtector.get(list2, i), ListProtector.get(listLLIIII, i2));
                }

                @Override // X.AbstractC21342018fa
                public final boolean LIZIZ(int i, int i2) {
                    return Intrinsics.LJFF(ListProtector.get(list2, i), ListProtector.get(listLLIIII, i2));
                }
            }, true).LIZJ(this);
            return !Intrinsics.LJFF(list2, listLLIIII);
        }
        notifyDataSetChanged();
        return true;
    }
}
