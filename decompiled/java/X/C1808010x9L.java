package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808010x9L extends AbstractC21673619ry<C1808020x9M> {
    public final Function2<Long, String, Unit> LL;
    public List<C1781540wSe> LLILLJJLI = C13BV.INSTANCE;
    public long LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1808010x9L(C1621206Wk c1621206Wk) {
        this.LL = c1621206Wk;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C1808020x9M c1808020x9M, int i) {
        boolean z;
        final C1781540wSe c1781540wSe = (C1781540wSe) ListProtector.get(this.LLILLJJLI, i);
        boolean z2 = true;
        if (c1781540wSe.LIZ == this.LLILLL) {
            z = true;
        } else {
            z = false;
        }
        c1808020x9M.LLILZIL.setText(c1781540wSe.LIZIZ);
        c1808020x9M.LLILZLL.setText(c1781540wSe.LIZIZ);
        c1808020x9M.LLIZ.setText(c1781540wSe.LIZJ);
        if (c1781540wSe.LIZLLL.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            C786410Ut5.LLJJIII(c1808020x9M.LLILZ, 0);
            c1808020x9M.LLILZ.setImageURI(c1781540wSe.LIZLLL);
        } else {
            c1808020x9M.LLILZ.setImageURI((String) null);
            C786410Ut5.LLJJIII(c1808020x9M.LLILZ, 8);
        }
        ValueAnimator valueAnimator = c1808020x9M.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c1808020x9M.LLIZLLLIL = null;
        if (z) {
            DecelerateInterpolator decelerateInterpolator = C1808050x9P.LIZ;
            C786410Ut5.T4(c1808020x9M.LLILLJJLI, 0.0f);
            C786410Ut5.T4(c1808020x9M.LLILLL, 1.0f);
            C1808050x9P.LIZ(c1808020x9M, 1.0f);
        } else {
            DecelerateInterpolator decelerateInterpolator2 = C1808050x9P.LIZ;
            C786410Ut5.T4(c1808020x9M.LLILLJJLI, 1.0f);
            C786410Ut5.T4(c1808020x9M.LLILLL, 0.0f);
            C1808050x9P.LIZ(c1808020x9M, 0.0f);
        }
        View view = c1808020x9M.itemView;
        final C1808010x9L c1808010x9L = c1808020x9M.LLJ;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0whu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.LL.invoke(Long.valueOf(c1781540wSe.LIZ), c1781540wSe.LIZIZ);
            }
        }, view);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1808020x9M c1808020x9M = new C1808020x9M(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gth, viewGroup, false));
        try {
            View view = c1808020x9M.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1808020x9M.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1808020x9M.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1808020x9M.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1808020x9M.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1808020x9M.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1808020x9M.class.getName();
        return c1808020x9M;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        final C1808020x9M c1808020x9M = (C1808020x9M) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c1808020x9M, i);
            return;
        }
        for (Object obj : list) {
            if (Intrinsics.LJFF(obj, "select")) {
                DecelerateInterpolator decelerateInterpolator = C1808050x9P.LIZ;
                ValueAnimator valueAnimator = c1808020x9M.LLIZLLLIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                c1808020x9M.LLIZLLLIL = null;
                final float alpha = c1808020x9M.LLILLJJLI.getAlpha();
                final float alpha2 = c1808020x9M.LLILLL.getAlpha();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(220L);
                valueAnimatorOfFloat.setInterpolator(C1808050x9P.LIZ);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0x9O
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        float f = alpha * (1.0f - fFloatValue);
                        float f2 = alpha2;
                        C786410Ut5.T4(c1808020x9M.LLILLJJLI, f);
                        C786410Ut5.T4(c1808020x9M.LLILLL, f2 + ((1.0f - f2) * fFloatValue));
                        DecelerateInterpolator decelerateInterpolator2 = C1808050x9P.LIZ;
                        C1808050x9P.LIZ(c1808020x9M, fFloatValue);
                    }
                });
                c1808020x9M.LLIZLLLIL = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
            } else if (Intrinsics.LJFF(obj, "deselect")) {
                DecelerateInterpolator decelerateInterpolator2 = C1808050x9P.LIZ;
                ValueAnimator valueAnimator2 = c1808020x9M.LLIZLLLIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                c1808020x9M.LLIZLLLIL = null;
                final float alpha3 = c1808020x9M.LLILLJJLI.getAlpha();
                final float alpha4 = c1808020x9M.LLILLL.getAlpha();
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(220L);
                valueAnimatorOfFloat2.setInterpolator(C1808050x9P.LIZ);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0x9N
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        float f = alpha3;
                        float f2 = 1.0f - fFloatValue;
                        float f3 = alpha4 * f2;
                        C786410Ut5.T4(c1808020x9M.LLILLJJLI, f + ((1.0f - f) * fFloatValue));
                        C786410Ut5.T4(c1808020x9M.LLILLL, f3);
                        DecelerateInterpolator decelerateInterpolator3 = C1808050x9P.LIZ;
                        C1808050x9P.LIZ(c1808020x9M, f2);
                    }
                });
                c1808020x9M.LLIZLLLIL = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.start();
            }
        }
    }
}
