package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.10uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19398210uq extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<M10nMockDebugErrorInfo, Unit> LL;
    public final List<AbstractC1882107Yt> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C19398210uq(AwS608S0100000_29 awS608S0100000_29) {
        this.LL = awS608S0100000_29;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof C07UR) {
            return 0;
        }
        if (obj instanceof C1882007Ys) {
            return 2;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1882107Yt abstractC1882107Yt = (AbstractC1882107Yt) ListProtector.get(this.LLILLJJLI, i);
        if (abstractC1882107Yt instanceof C07UR) {
            TextView textView = ((C19398410us) viewHolder).LL;
            abstractC1882107Yt.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        if (abstractC1882107Yt instanceof C1882007Ys) {
            C19398310ur c19398310ur = (C19398310ur) viewHolder;
            c19398310ur.getClass();
            M10nMockDebugErrorInfo m10nMockDebugErrorInfo = ((C1882007Ys) abstractC1882107Yt).LIZ;
            TextView textView2 = c19398310ur.LLILLJJLI;
            if (textView2 != null) {
                textView2.setText(m10nMockDebugErrorInfo.errorDescription);
            }
            if (m10nMockDebugErrorInfo.isChecked) {
                ImageView imageView = c19398310ur.LLILLL;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.cn2);
                }
            } else {
                ImageView imageView2 = c19398310ur.LLILLL;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.cn3);
                }
            }
            C786410Ut5.I7(new ACListenerS131S0200000_29(c19398310ur, m10nMockDebugErrorInfo, 2), c19398310ur.itemView);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19398410us;
        if (i != 0) {
            if (i == 2) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dmx, viewGroup, false);
                C1378990lzN.LIZIZ(viewTd, Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), Float.valueOf(C418440Gaw.LIZIZ(8)), null, 16);
                c19398410us = new C19398310ur(viewTd, this.LL);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown view type: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c19398410us = new C19398410us(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dn2, viewGroup, false));
        }
        try {
            View view = c19398410us.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19398410us.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19398410us.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19398410us.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19398410us.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19398410us.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19398410us.getClass().getName();
        return c19398410us;
    }
}
