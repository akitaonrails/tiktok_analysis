package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370330EfX extends RecyclerView.ViewHolder {
    public final View LL;
    public final Context LLILLJJLI;
    public final TuxTextView LLILLL;
    public final FrameLayout LLILZ;
    public final SmartImageView LLILZIL;
    public final View LLILZLL;
    public final C01GW LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final TuxIconView LLJ;
    public AwS406S0200000_5 LLJI;
    public final TextPaint LLJIJIL;
    public final View LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C370390Efd LLJJIII;

    public static boolean I5() {
        return ((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CHANGE_BTM_BAR_STYLE, Boolean.FALSE)).booleanValue();
    }

    public final int L5() {
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    public final int getScreenWidth() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    public final boolean N5(C361980EHc c361980EHc) {
        String str;
        Drawable drawableInvoke;
        Uri uriFromFile = null;
        if (c361980EHc.LJ == null) {
            Function0<? extends Drawable> function0 = c361980EHc.LJFF;
            if (function0 != null) {
                drawableInvoke = function0.invoke();
            } else {
                drawableInvoke = null;
            }
            c361980EHc.LJ = drawableInvoke;
        }
        Object obj = c361980EHc.LJIIJJI.get("IMAGE_URI");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            uriFromFile = UriProtector.parse(str);
            if (!Intrinsics.LJFF(uriFromFile.getScheme(), "content")) {
                uriFromFile = Uri.fromFile(new C0VSJ(str));
            }
        }
        if (uriFromFile != null) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
            c1331670kl3LJI.LJJI = (C1331730kl9) this.LLJJ.getValue();
            c1331670kl3LJI.LJJ(this.LLILZIL);
            C786410Ut5.h3(c1331670kl3LJI);
            return true;
        }
        Integer num = c361980EHc.LIZLLL;
        if (num != null) {
            this.LLILZIL.setImageResource(num.intValue());
            C786410Ut5.LLFF(0, this.LLILZIL);
            return true;
        }
        Drawable drawable = c361980EHc.LJ;
        if (drawable != null) {
            this.LLILZIL.setImageDrawable(drawable);
            C786410Ut5.LLFF(0, this.LLILZIL);
            return true;
        }
        C786410Ut5.LLFF(8, this.LLILZIL);
        return false;
    }

    public final void P5(C361980EHc c361980EHc) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue2;
        Integer numLIZ = C0EJA.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 28;
        }
        if (I5()) {
            ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                float f = iIntValue;
                marginLayoutParams.width = C390810FTz.LIZ(f);
                marginLayoutParams.height = C390810FTz.LIZ(f);
                Integer numLIZIZ = C0EJA.LIZIZ(getScreenWidth());
                if (numLIZIZ != null) {
                    iIntValue2 = numLIZIZ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                marginLayoutParams.topMargin = C390810FTz.LIZ(iIntValue2);
                C786410Ut5.a6(this.LLILZ, marginLayoutParams);
            }
        }
        ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
        if (c361980EHc.LJIIJJI.containsKey("IMAGE_URI")) {
            if (I5()) {
                int i = iIntValue - 4;
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                return;
            } else {
                layoutParams2.width = C390810FTz.LIZ(24.0f);
                layoutParams2.height = C390810FTz.LIZ(24.0f);
                return;
            }
        }
        float f2 = iIntValue;
        layoutParams2.width = C390810FTz.LIZ(f2);
        layoutParams2.height = C390810FTz.LIZ(f2);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0Efd] */
    public C370330EfX(C19EG c19eg, View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c19eg;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.zmx);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.l2d);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.lho);
        this.LLILZLL = view.findViewById(R.id.view_dot);
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 30));
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.cny);
        this.LLJ = (TuxIconView) view.findViewById(R.id.lab);
        this.LLJIJIL = new TextPaint();
        this.LLJILJIL = view.findViewById(R.id.lhp);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 28));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 31));
        this.LLJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(20));
        this.LLJJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(21));
        this.LLJJIII = new Object() { // from class: X.0Efd
        };
    }
}
