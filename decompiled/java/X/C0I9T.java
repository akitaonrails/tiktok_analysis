package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I9T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9T extends AbstractC21673619ry<C0I9U> {
    public final List<PreshownStickerItem> LL;
    public final Function1<PreshownStickerItem, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0I9T(List list, C0I9W c0i9w) {
        this.LL = list;
        this.LLILLJJLI = c0i9w;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r28, int r29) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0I9T.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = C1915107en.LIZ;
        if (this.LL.size() == 1) {
            i2 = C1915107en.LIZIZ;
        } else {
            i2 = C1915107en.LIZ;
        }
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        C786410Ut5.G6(smartImageView, new RecyclerView.LayoutParams(i2, i2));
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        C0I9U c0i9u = new C0I9U(i2, smartImageView);
        try {
            View view = c0i9u.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0i9u.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0i9u.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0I9U.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0i9u.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0i9u.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0I9U.class.getName();
        return c0i9u;
    }
}
