package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C810503Ep extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final int LL;
    public final int LLILLJJLI;
    public final List<Bitmap> LLILLL = new ArrayList(7);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(List<Bitmap> list) {
        if (list != null && !list.isEmpty()) {
            ((ArrayList) this.LLILLL).clear();
            ((ArrayList) this.LLILLL).addAll(list);
            notifyDataSetChanged();
        }
    }

    public C810503Ep(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Bitmap bitmap = (Bitmap) ListProtector.get(this.LLILLL, i);
        ImageView imageView = (ImageView) viewHolder.itemView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ft9, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.LLILLJJLI;
        layoutParams.width = this.LL;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.c6(imageView, layoutParams);
        C810403Eo c810403Eo = new C810403Eo(imageView);
        try {
            View view = c810403Eo.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c810403Eo.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c810403Eo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C810403Eo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c810403Eo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c810403Eo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C810403Eo.class.getName();
        return c810403Eo;
    }
}
