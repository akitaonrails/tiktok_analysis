package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.room.MuteRule;

/* JADX INFO: renamed from: X.0TLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745240TLe extends AbstractC21673619ry<C745250TLf> {
    public final List<C745220TLc> LL;
    public final MuteRule LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C745220TLc> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C745240TLe(List<C745220TLc> list, MuteRule muteRule) {
        this.LL = list;
        this.LLILLJJLI = muteRule;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C745220TLc c745220TLc;
        boolean z;
        C745250TLf c745250TLf = (C745250TLf) viewHolder;
        List<C745220TLc> list = this.LL;
        if (list != null && (c745220TLc = (C745220TLc) ListProtector.get(list, i)) != null) {
            C16F5 c16f5 = c745250TLf.LL;
            if (c16f5 != null) {
                c16f5.setText(C0TYC.LIZIZ(c745220TLc));
            }
            C20744016Fi c20744016Fi = c745250TLf.LLILLJJLI;
            if (c20744016Fi != null) {
                MuteRule muteRule = this.LLILLJJLI;
                if (muteRule != null && c745220TLc.LIZ == muteRule.durationSecond) {
                    z = true;
                } else {
                    z = false;
                }
                c20744016Fi.setChecked(z);
            }
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, c745220TLc, 14), c745250TLf.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745250TLf c745250TLf = new C745250TLf(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hez, viewGroup, false));
        try {
            View view = c745250TLf.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745250TLf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745250TLf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745250TLf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745250TLf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745250TLf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745250TLf.class.getName();
        return c745250TLf;
    }
}
