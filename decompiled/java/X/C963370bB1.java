package X;

import Y.ACListenerS150S0100000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingSetting;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963370bB1 extends C0J8P<C961160b7S, C963400bB4> {
    public final Function1<EnumC959280b4Q, Unit> LIZIZ;

    public C963370bB1(AwS594S0100000_15 awS594S0100000_15) {
        this.LIZIZ = awS594S0100000_15;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961160b7S c961160b7S) {
        float f;
        int iIntValue;
        int iIntValue2;
        C963400bB4 c963400bB4 = (C963400bB4) viewHolder;
        C961160b7S c961160b7S2 = c961160b7S;
        View view = c963400bB4.itemView;
        List<?> list = this.LIZ.LL;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            f = 6.0f;
        } else {
            Iterator<?> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C960780b6q) {
                    f = 14.0f;
                    break;
                }
            }
            f = 6.0f;
        }
        C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(f), view);
        ((TextView) c963400bB4.LL.getValue()).setText(c961160b7S2.LJ);
        if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking()) {
            C786410Ut5.l8((C16F5) c963400bB4.LL.getValue(), new ACListenerS150S0100000_15(this, 224));
            C16F5 c16f5 = (C16F5) c963400bB4.LLILLJJLI.getValue();
            if (c16f5 != null) {
                C786410Ut5.l8(c16f5, new ACListenerS150S0100000_15(this, 225));
            }
            TextView textView = (TextView) c963400bB4.LL.getValue();
            if (c961160b7S2.LJFF == 1) {
                iIntValue = ((Number) c963400bB4.LLILZ.getValue()).intValue();
            } else {
                iIntValue = ((Number) c963400bB4.LLILZIL.getValue()).intValue();
            }
            textView.setTextColor(iIntValue);
            TextView textView2 = (TextView) c963400bB4.LLILLJJLI.getValue();
            if (textView2 != null) {
                if (c961160b7S2.LJFF == 0) {
                    iIntValue2 = ((Number) c963400bB4.LLILZ.getValue()).intValue();
                } else {
                    iIntValue2 = ((Number) c963400bB4.LLILZIL.getValue()).intValue();
                }
                textView2.setTextColor(iIntValue2);
            }
            TextView textView3 = (TextView) c963400bB4.LLILLJJLI.getValue();
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJI(2131855563));
            }
            TextView textView4 = (TextView) c963400bB4.LLILLL.getValue();
            if (textView4 != null) {
                textView4.setText(c961160b7S2.LJI);
            }
            C16F5 c16f52 = (C16F5) c963400bB4.LLILLL.getValue();
            if (c16f52 != null) {
                if (c961160b7S2.LJFF != 0) {
                    i = 8;
                }
                C786410Ut5.LLJJJJ(c16f52, i);
            }
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking()) {
            i = R.layout.gh1;
        } else {
            i = R.layout.gh0;
        }
        return new C963400bB4(C786410Ut5.Td(layoutInflater, i, viewGroup, false));
    }
}
