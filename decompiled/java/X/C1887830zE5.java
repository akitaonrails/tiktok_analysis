package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentKeywordsVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887830zE5 extends AbstractC21673619ry<C1887840zE6> {
    public final CommentKeywordsVM LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List list = (List) this.LL.LLIZ.getValue();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return list.size();
    }

    public C1887830zE5(CommentKeywordsVM commentKeywordsVM) {
        this.LL = commentKeywordsVM;
        commentKeywordsVM.LLJ = new InterfaceC1887850zE7() { // from class: X.0zIe
            @Override // X.InterfaceC1887850zE7
            public final void LIZIZ() {
                this.LIZ.notifyItemInserted(0);
                C1887830zE5 c1887830zE5 = this.LIZ;
                c1887830zE5.notifyItemRangeChanged(1, c1887830zE5.getItemCount());
            }

            @Override // X.InterfaceC1887850zE7
            public final void LIZJ(int i) {
                this.LIZ.notifyItemRemoved(i);
                C1887830zE5 c1887830zE5 = this.LIZ;
                c1887830zE5.notifyItemRangeChanged(i, c1887830zE5.getItemCount() - i);
            }

            @Override // X.InterfaceC1887850zE7
            public final void LIZ(final List<String> list, final List<String> list2) {
                C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.0zIg
                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return list2.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return list.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i, int i2) {
                        return Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i2));
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i, int i2) {
                        return Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i2));
                    }
                }, true).LIZJ(this.LIZ);
            }
        };
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1887840zE6 c1887840zE6 = (C1887840zE6) viewHolder;
        List list = (List) this.LL.LLIZ.getValue();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str = (String) ListProtector.get(list, i);
        c1887840zE6.LLILLL = str;
        c1887840zE6.LLILLJJLI = Integer.valueOf(i);
        c1887840zE6.LL.setText(str);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1887840zE6 c1887840zE6 = new C1887840zE6(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.beb, viewGroup, false), new AwS642S0100000_28(this, 57));
        try {
            View view = c1887840zE6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1887840zE6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1887840zE6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1887840zE6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1887840zE6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1887840zE6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1887840zE6.class.getName();
        return c1887840zE6;
    }
}
