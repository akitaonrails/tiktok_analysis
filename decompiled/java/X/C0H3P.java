package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H3P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3P extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(404));
    public ImSysEmojiModel LLILLJJLI;
    public int LLILLL;

    public final List<C0H3R> getData() {
        return (List) this.LL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C0H3Q) {
            C0H3Q c0h3q = (C0H3Q) viewHolder;
            C0H3R c0h3r = (C0H3R) ListProtector.get(getData(), i);
            c0h3q.LL.setText(c0h3r.LIZ);
            if (c0h3r.LIZIZ) {
                c0h3q.LL.setBackgroundResource(R.drawable.dd7);
            } else {
                c0h3q.LL.setBackgroundResource(R.drawable.dd6);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C0H3Q.LLILLJJLI;
        C0H3Q c0h3q = new C0H3Q(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c40, null, false));
        try {
            View view = c0h3q.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h3q.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h3q.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H3Q.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h3q.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h3q.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H3Q.class.getName();
        return c0h3q;
    }
}
