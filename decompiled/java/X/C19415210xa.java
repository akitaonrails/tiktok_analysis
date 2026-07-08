package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415210xa extends AbstractC21673619ry<C19415310xb> {
    public List<EffectModel> LL;
    public C19415110xZ LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        Drawable drawableLIZ;
        int i4;
        C19415310xb c19415310xb = (C19415310xb) viewHolder;
        EffectModel effectModel = (EffectModel) ListProtector.get(c19415310xb.LLILZ.LL, i);
        Drawable drawable = c19415310xb.LL.getResources().getDrawable(effectModel.imagePath);
        if (!effectModel.isEnabled) {
            i2 = 127;
        } else {
            i2 = 255;
        }
        if (i != 0 && !C0F4Z.LIZ()) {
            c19415310xb.LL.setBackground(drawable);
            c19415310xb.LL.setImageDrawable(null);
        } else {
            if (C0F4Z.LIZ()) {
                if (i == 0) {
                    i3 = 10;
                } else {
                    i3 = 6;
                }
            } else {
                i3 = 12;
            }
            int iLIZJ = (int) C12ES.LIZJ(i3, c19415310xb.LL.getContext());
            int iLIZJ2 = (int) C12ES.LIZJ(8.0f, c19415310xb.LL.getContext());
            int color = c19415310xb.itemView.getContext().getResources().getColor(R.color.bb);
            drawable = C19733712It.LIZLLL(drawable);
            c19415310xb.LL.setImageDrawable(drawable);
            c19415310xb.LL.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
            C1324800kZy c1324800kZy = c19415310xb.LL;
            if (C0F4Z.LIZ()) {
                drawableLIZ = C426580Go4.LIZJ(color, color, 0, iLIZJ2);
            } else {
                drawableLIZ = C426580Go4.LIZ(color, color, 0);
            }
            c1324800kZy.setBackground(drawableLIZ);
        }
        SpannableString spannableString = new SpannableString(effectModel.name);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C2441009hQ.LJIIL(C960203pA.LIZ(R.attr.bx, C0CHQ.LIZ), i2)), 0, spannableString.length(), 17);
        drawable.setAlpha(i2);
        c19415310xb.LLILLJJLI.setText(spannableString);
        if (i == c19415310xb.LLILZ.LLILLL) {
            c19415310xb.LLILLJJLI.LJJJIL(true);
            c19415310xb.LLILLJJLI.setSelected(true);
            c19415310xb.LLILLJJLI.setTypeface(Typeface.defaultFromStyle(1));
            View view = c19415310xb.LLILLL;
            Resources resources = view.getResources();
            if (C0F4Z.LIZ()) {
                i4 = R.drawable.a9p;
            } else {
                i4 = R.drawable.a9o;
            }
            view.setBackground(resources.getDrawable(i4));
            return;
        }
        c19415310xb.LLILLJJLI.LJJJIL(false);
        c19415310xb.LLILLJJLI.setSelected(false);
        c19415310xb.LLILLJJLI.setTypeface(Typeface.defaultFromStyle(0));
        c19415310xb.LLILLL.setBackground(null);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19415310xb c19415310xb = new C19415310xb(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw6, viewGroup, false));
        try {
            View view = c19415310xb.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19415310xb.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19415310xb.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19415310xb.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19415310xb.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19415310xb.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19415310xb.class.getName();
        return c19415310xb;
    }
}
