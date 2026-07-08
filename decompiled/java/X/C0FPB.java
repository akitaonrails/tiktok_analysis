package X;

import Y.AfS174S0100000_5;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FPB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPB extends AbstractC21673619ry<C0FPC> {
    public final C19560811fy LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Pair<?, ?>[] LLILZ;
    public boolean LLILZIL = true;
    public boolean LLILZLL;

    public final void LLLFZ() {
        C11SU c11suLIZ;
        C19560811fy c19560811fy = this.LL;
        if (c19560811fy == null || (c11suLIZ = c19560811fy.LIZ()) == null) {
            return;
        }
        c11suLIZ.LJJLJLI(new AfS174S0100000_5(this, 3));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        C19560811fy c19560811fy = this.LL;
        if (c19560811fy != null) {
            return c19560811fy.LIZLLL;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Pair<?, ?> pair;
        Bitmap bitmap;
        C0FPC c0fpc = (C0FPC) viewHolder;
        int itemCount = getItemCount();
        if (!this.LLILZLL || (itemCount - i) - 1 < 0 || i2 >= itemCount) {
            i2 = i;
        }
        Pair<?, ?> pair2 = this.LLILZ[i2];
        if ((pair2 == null || (bitmap = (Bitmap) pair2.getSecond()) == null || bitmap.isRecycled()) && ((pair = this.LLILZ[0]) == null || (bitmap = (Bitmap) pair.getSecond()) == null || bitmap.isRecycled())) {
            bitmap = null;
        }
        c0fpc.LL.setImageBitmap(bitmap);
        if (i == 0) {
            c0fpc.LL.setPadding(0, 0, 0, 0);
        } else if (i == itemCount - 1) {
            c0fpc.LL.setPadding(0, 0, 0, 0);
        } else {
            c0fpc.LL.setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ft9, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.LLILLL;
        layoutParams.width = this.LLILLJJLI;
        C786410Ut5.c6(imageView, layoutParams);
        C0FPC c0fpc = new C0FPC(imageView);
        try {
            View view = c0fpc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0fpc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0fpc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0FPC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0fpc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0fpc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0FPC.class.getName();
        return c0fpc;
    }

    public C0FPB(C19560811fy c19560811fy, int i, int i2) {
        int i3;
        this.LL = c19560811fy;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        if (c19560811fy != null) {
            i3 = c19560811fy.LIZLLL;
        } else {
            i3 = 0;
        }
        this.LLILZ = new Pair[i3];
        LLLFZ();
    }
}
