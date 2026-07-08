package X;

import Y.AUListenerS255S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370320EfW extends C0EJO<C370330EfX> {
    public final C19EG LLILZLL;
    public C09AY LLIZ;

    public C370320EfW(C19EG c19eg) {
        this.LLILZLL = c19eg;
    }

    public static boolean LLLILZ(String str) {
        if (Intrinsics.LJFF(str, "bottom_item_root_caption") && !C0EJA.LJI()) {
            return true;
        }
        return false;
    }

    public static void LLLIL(C361980EHc c361980EHc, C370330EfX c370330EfX) {
        AnimatorSet animatorSet = (AnimatorSet) c361980EHc.LIZIZ("key_view_anim");
        if (animatorSet != null) {
            View viewFindViewById = c370330EfX.itemView.findViewById(R.id.l2d);
            for (Animator animator : animatorSet.getChildAnimations()) {
                if (animator instanceof ValueAnimator) {
                    ((ValueAnimator) animator).addUpdateListener(new AUListenerS255S0100000_5(viewFindViewById, 1));
                }
            }
            animatorSet.start();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iLJFF;
        Float fValueOf;
        C370330EfX c370330EfX = new C370330EfX(this.LLILZLL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bym, viewGroup, false));
        c370330EfX.LLILLL.setTypeface(C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        c370330EfX.LLILLL.setTextSize(11.0f);
        if (C370330EfX.I5() && (((iLJFF = C0EJA.LJFF()) == 1 || iLJFF == 2 || iLJFF == 3) && (fValueOf = Float.valueOf(12.1f)) != null)) {
            float fApplyDimension = TypedValue.applyDimension(1, fValueOf.floatValue(), Resources.getSystem().getDisplayMetrics()) - c370330EfX.LLILLL.getLineHeight();
            String strT2 = C786410Ut5.t2(Locale.getDefault());
            if (strT2 == null || strT2.length() == 0 || !C1697810uHb.LJIIJJI("my", "hi", "bn", "ta", "te", "ml", "gu", "pa", "kn", "or", "si", "lo", "km", "th").contains(strT2)) {
                c370330EfX.LLILLL.setLineSpacing(fApplyDimension, 1.0f);
            }
        }
        TextPaint textPaint = c370330EfX.LLJIJIL;
        textPaint.setAntiAlias(true);
        textPaint.setColor(c370330EfX.LLILLL.getCurrentTextColor());
        textPaint.setTextSize(c370330EfX.LLILLL.getTextSize());
        textPaint.setTypeface(c370330EfX.LLILLL.getTypeface());
        c370330EfX.LLJIJIL.setLetterSpacing(c370330EfX.LLILLL.getLetterSpacing());
        c370330EfX.LLJIJIL.setTextScaleX(c370330EfX.LLILLL.getTextScaleX());
        c370330EfX.LLIZLLLIL.setImageDrawable((Drawable) c370330EfX.LLJILJILJ.getValue());
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZLLL = Integer.valueOf(iLIZIZ);
        c384050F3z.LJFF = Integer.valueOf(R.attr.zi);
        c370330EfX.LLJILJIL.setBackground(c384050F3z.LIZ(c370330EfX.LLILLJJLI));
        try {
            View view = c370330EfX.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c370330EfX.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c370330EfX.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C370330EfX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c370330EfX.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c370330EfX.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C370330EfX.class.getName();
        return c370330EfX;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0417 A[PHI: r5
      0x0417: PHI (r5v14 android.graphics.drawable.Drawable) = (r5v13 android.graphics.drawable.Drawable), (r5v16 android.graphics.drawable.Drawable) binds: [B:168:0x0407, B:172:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0252  */
    /* JADX WARN: Type inference failed for: r3v20, types: [X.09AY, X.0sYq] */
    @Override // X.C0EJO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(int r20, androidx.recyclerview.widget.RecyclerView.ViewHolder r21, final X.C361980EHc r22) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370320EfW.LLLFZ(int, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.0EHc):void");
    }
}
