package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveScaleNativeBannerSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import wh6.AbS689S0100000_7;

/* JADX INFO: renamed from: X.0IQR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQR extends AbstractC21673619ry<C0IQT> {
    public List<? extends BannerInRoom> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size() != 1 ? Integer.MAX_VALUE : 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size = i % this.LL.size();
        BannerInRoom bannerInRoom = (BannerInRoom) ListProtector.get(this.LL, size);
        if (LiveScaleNativeBannerSetting.enable() && C1097970eg7.LJ(bannerInRoom)) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(Collections.singletonList(bannerInRoom.LIZIZ));
            c1324610kZfLIZJ.LJIJI(Float.valueOf((int) C497740JfY.LIZIZ(8.0f)));
            c1324610kZfLIZJ.LJJI(viewHolder.itemView);
        } else {
            C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(C842240X2g.LIZ(bannerInRoom.image));
            c1324610kZfLIZJ2.LJIJI(Float.valueOf((int) C497740JfY.LIZIZ(8.0f)));
            c1324610kZfLIZJ2.LJJI(viewHolder.itemView);
        }
        C786410Ut5.I7(new AbS689S0100000_7(this, size, bannerInRoom, 31), viewHolder.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final ImageView imageView = new ImageView(viewGroup.getContext());
        C786410Ut5.c6(imageView, new ViewGroup.LayoutParams(-1, -1));
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(imageView) { // from class: X.0IQT
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0IQT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0IQT.class.getName();
        return viewHolder;
    }
}
