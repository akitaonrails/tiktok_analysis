package X;

import Y.ACListenerS9S1201000_7;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0Iv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481850Iv1 extends AbstractC21673619ry<C481860Iv2> {
    public List<ToplivePageItem> LL = new ArrayList();
    public String LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        viewHolder.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        viewHolder.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C481860Iv2 c481860Iv2 = (C481860Iv2) viewHolder;
        ToplivePageItem toplivePageItem = (ToplivePageItem) ListProtector.get(this.LL, i);
        String str = this.LLILLJJLI;
        c481860Iv2.LLILLL = toplivePageItem;
        c481860Iv2.LLILLJJLI.setText(toplivePageItem.cardTitle);
        int color = ColorProtector.parseColor(toplivePageItem.defaultBgColor);
        if (C960203pA.LIZIZ(c481860Iv2.itemView.getContext())) {
            color = Color.argb(127, Color.red(color), Color.green(color), Color.blue(color));
        }
        c481860Iv2.itemView.setBackgroundColor(color);
        C1324610kZf url = C1819620xS4.LIZ().setUrl(toplivePageItem.defaultBgUrl);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        url.LJI = iLIZIZ;
        url.LJII = iLIZIZ2;
        url.LJJI(c481860Iv2.LL);
        C786410Ut5.I7(new ACListenerS9S1201000_7(toplivePageItem, c481860Iv2, i, str, 0), c481860Iv2.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C481860Iv2 c481860Iv2 = new C481860Iv2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di8, viewGroup, false));
        try {
            View view = c481860Iv2.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c481860Iv2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c481860Iv2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C481860Iv2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c481860Iv2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c481860Iv2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C481860Iv2.class.getName();
        return c481860Iv2;
    }
}
