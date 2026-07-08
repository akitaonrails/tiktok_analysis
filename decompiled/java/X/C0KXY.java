package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0KXY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXY extends AbstractC21673619ry<C0KXZ> {
    public final Context LL;
    public final C1836130xsh<List<String>> LLILLJJLI;
    public final C1836200xso LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C1290330jgN LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.LIZIZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iLIZIZ;
        C0KXZ c0kxz = (C0KXZ) viewHolder;
        List<String> list = this.LLILLJJLI.LIZIZ;
        if (i != list.size() - 2 || (iLIZIZ = this.LLILZLL) <= 0) {
            if (i == 0) {
                iLIZIZ = this.LLILZ;
            } else if (i == list.size() - 1) {
                iLIZIZ = this.LLILZIL;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(this.LLILLL.LJIIJJI);
            }
        }
        View view = c0kxz.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(this.LLILLL.LJIIL);
        layoutParams.width = iLIZIZ;
        C786410Ut5.W5(view, layoutParams);
        if (i != 0 && i != list.size() - 1) {
            String str = (String) ListProtector.get(list, i);
            Drawable drawableLIZ = C14MI.LIZ(this.LL, R.drawable.cjk);
            if (str.length() == 0) {
                c0kxz.LL.setImageBitmap(null);
                c0kxz.LLILLJJLI.setBackground(drawableLIZ);
                return;
            }
            c0kxz.LLILLJJLI.setBackground(null);
            if (this.LLIZ != null) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                if (numLJIIJJI != null) {
                    Bitmap bitmapLIZ = this.LLIZ.LIZ(numLJIIJJI.intValue());
                    if (bitmapLIZ != null) {
                        c0kxz.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        c0kxz.LL.setImageBitmap(bitmapLIZ);
                        return;
                    }
                }
                c0kxz.LL.setImageBitmap(null);
                c0kxz.LLILLJJLI.setBackground(drawableLIZ);
                return;
            }
            C1324610kZf c1324610kZfLJIIL = C1819620xS4.LIZ().LJIIL(drawableLIZ);
            c1324610kZfLJIIL.setUrl(str);
            c1324610kZfLJIIL.LJJI(c0kxz.LL);
            return;
        }
        c0kxz.LL.setImageDrawable(null);
        c0kxz.LLILLJJLI.setBackground(null);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di1, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(this.LLILLL.LJIIL);
        layoutParams.width = C814420VxA.LIZIZ(this.LLILLL.LJIIJJI);
        C786410Ut5.W5(viewTd, layoutParams);
        C0KXZ c0kxz = new C0KXZ(viewTd);
        try {
            View view = c0kxz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0kxz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0kxz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KXZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0kxz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0kxz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KXZ.class.getName();
        return c0kxz;
    }

    public C0KXY(Context context, C1836130xsh<List<String>> c1836130xsh, C1836200xso c1836200xso, int i, int i2, int i3, C1290330jgN c1290330jgN) {
        this.LL = context;
        this.LLILLJJLI = c1836130xsh;
        this.LLILLL = c1836200xso;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = c1290330jgN;
    }
}
