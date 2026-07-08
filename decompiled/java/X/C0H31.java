package X;

import android.content.res.Resources;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0H31, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H31 extends AbstractC21673619ry<C0H32> {
    public List<C0H33> LL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H32 c0h32 = (C0H32) viewHolder;
        View view = (View) c0h32.LL.getValue();
        if (view != null) {
            C1143680frq.LJ(view, ((C0H33) ListProtector.get(this.LL, i)).LIZ, ((C0H33) ListProtector.get(this.LL, i)).LIZIZ, ImageView.ScaleType.FIT_XY);
        }
        ((TextView) c0h32.LLILLJJLI.getValue()).setText(C497740JfY.LJIJI(((C0H33) ListProtector.get(this.LL, i)).LIZJ));
        AppCompatTextView appCompatTextView = (AppCompatTextView) c0h32.LLILLJJLI.getValue();
        String string = appCompatTextView.getText().toString();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int iLIZIZ = C465640INu.LIZIZ(appCompatTextView.getContext()) - ((int) C497740JfY.LIZIZ(72.0f));
        if (iLIZIZ > 0) {
            TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
            textPaint.setTextSize(TypedValue.applyDimension(1, 30.0f, displayMetrics));
            int lineCount = StaticLayout.Builder.obtain(string, 0, string.length(), textPaint, iLIZIZ).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier()).build().getLineCount();
            if (4 <= lineCount && lineCount < 7) {
                appCompatTextView.setMaxLines(lineCount);
            }
        }
        ((C16F5) c0h32.LLILLJJLI.getValue()).setFontWeight(900);
        ((TextView) c0h32.LLILLL.getValue()).setText(C497740JfY.LJIJI(((C0H33) ListProtector.get(this.LL, i)).LIZLLL));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H32 c0h32 = new C0H32(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gu1, viewGroup, false));
        try {
            View view = c0h32.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h32.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h32.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H32.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h32.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h32.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H32.class.getName();
        return c0h32;
    }
}
