package X;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0mR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396150mR3 extends AbstractC683510QrV {
    public final C2385709Wl LL;
    public final List<C2386409Ws> LLILLJJLI;
    public final AwS635S0100000_21 LLILLL;

    @Override // X.AbstractC438050HFr
    public final int getBasicItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C1396150mR3(C2385709Wl c2385709Wl) {
        this.LL = c2385709Wl;
        registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0mR5
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                C1396150mR3 c1396150mR3 = this.LIZ;
                c1396150mR3.getItemCount();
                c1396150mR3.getClass();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                C1396150mR3 c1396150mR3 = this.LIZ;
                c1396150mR3.getItemCount();
                c1396150mR3.getClass();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                this.LIZ.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                this.LIZ.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                this.LIZ.getItemCount();
            }
        });
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new AwS635S0100000_21(this, 131);
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        return ((C2386409Ws) ListProtector.get(this.LLILLJJLI, i)).LIZIZ;
    }

    public final void setData(List<C2386409Ws> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1396160mR4 c1396160mR4;
        String nickname;
        if (getItemViewType(i) == 3 && (viewHolder instanceof C1396160mR4) && (c1396160mR4 = (C1396160mR4) viewHolder) != null) {
            C2386409Ws c2386409Ws = (C2386409Ws) ListProtector.get(this.LLILLJJLI, i);
            User user = c2386409Ws.LIZ;
            TextView textView = c1396160mR4.LLILLL;
            String remarkName = user.getRemarkName();
            if (remarkName != null && remarkName.length() != 0) {
                nickname = user.getRemarkName();
            } else {
                nickname = user.getNickname();
            }
            textView.setText(nickname);
            c1396160mR4.LLILZ.setText(user.getUniqueId());
            C1324750kZt.LJI(c1396160mR4.LLILZIL, user.getAvatarThumb(), -1, -1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1396160mR4.LLILZLL.getLayoutParams();
            marginLayoutParams.setMarginStart(((Number) c1396160mR4.LLIZ.getValue()).intValue());
            marginLayoutParams.leftMargin = ((Number) c1396160mR4.LLIZ.getValue()).intValue();
            C1841350y17 c1841350y17 = c1396160mR4.LLILZLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1841350y17);
            c1841350y17.setLayoutParams(marginLayoutParams);
            List<C2386409Ws> value = c1396160mR4.LL.LIZIZ.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            c1396160mR4.LLILZLL.setChecked(value.contains(c2386409Ws));
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        C1396160mR4 c1396160mR4 = new C1396160mR4(this.LL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.wg, viewGroup, false));
        c1396160mR4.LLILLJJLI = this.LLILLL;
        return c1396160mR4;
    }
}
