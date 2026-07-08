package X;

import Y.ACListenerS151S0100000_16;
import Y.ACListenerS166S0100000_32;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19JH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19JH<T extends View> implements View.OnTouchListener {
    public final Context LL;
    public JSONObject LLILLJJLI;
    public JSONObject LLILLL;
    public final T LLILZ;
    public C1049820dQS<ViewGroup> LLILZIL;
    public C1049830dQT LLILZLL;
    public C1015650cXL LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public String LLJJJJJIL;
    public ImageView.ScaleType LLJJJJLIIL;
    public float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public float LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public float LLLFF;
    public int LLLFFI;
    public String LLLFZ;
    public int LLLI;
    public float LLLII;
    public boolean LLLIIII;
    public ViewGroup.LayoutParams LLLIIIIL;
    public C19J8 LLLIIIL;
    public C19JB LLLIIL;
    public float LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public float LLLILZJ;
    public float LLLILZLLLI;
    public float LLLIZZ;
    public float LLLJ;
    public float LLLJIL;
    public float LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public final GradientDrawable LLLLL;
    public InterfaceC1049730dQJ LLLLLIL;
    public InterfaceC1015520cX8 LLLLLILLIL;
    public C1015690cXP LLLLLJIL;
    public final Map<Integer, C19JV> LLLLLJLJLL;
    public boolean LLLLLL;
    public C21367818jk LLLLLLIL;
    public C21518019Ja LLLLLLJ;
    public C19JQ LLLLLLL;
    public C19JL LLLLLLLLL;
    public C19JS LLLLLLLLLL;
    public C21518119Jb LLLLLLLZIL;
    public boolean LLLLLLZ;
    public C19JY LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public C1049700dQG LLLLZLLIL;
    public C1049840dQU LLLLZLLLI;
    public boolean LLLZ;

    public C19JH() {
        throw null;
    }

    public T LIZ() {
        return null;
    }

    public void LJIILJJIL() {
    }

    public void LJIILL() {
    }

    public final float LJII() {
        T t = this.LLILZ;
        if (t instanceof C19J1) {
            return ((C19J1) t).getRubIn();
        }
        return 0.0f;
    }

    public void LJIIJJI() {
        C19JQ c19jq;
        C19JV c19jv;
        C19JL c19jl;
        C19JV c19jv2;
        List<AbstractC1050010dQl> listLIZ;
        List<C19J8> list;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        C21518019Ja c21518019Ja = this.LLLLLLJ;
        if (c21518019Ja != null) {
            C21518119Jb c21518119Jb = new C21518119Jb(this.LLILZ, c21518019Ja);
            this.LLLLLLLZIL = c21518119Jb;
            c21518119Jb.LIZ();
        }
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null && (valueAnimator2 = c19j8.LLILLL) != null && c19j8.LLILZIL != -2 && c19j8.LLILZLL != 0) {
            valueAnimator2.start();
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null && (valueAnimator = c19j82.LLILLL) != null && c19j82.LLILZIL != -2 && c19j82.LLILZLL != 0) {
                    valueAnimator.start();
                }
            }
        }
        C19JY c19jy = this.LLLLLLZZ;
        if (c19jy != null) {
            c19jy.LIZJ();
        }
        C1049700dQG c1049700dQG = this.LLLLZLLIL;
        if (c1049700dQG != null && (listLIZ = c1049700dQG.LIZ("timer")) != null && !listLIZ.isEmpty()) {
            for (AbstractC1050010dQl abstractC1050010dQl : listLIZ) {
                if (abstractC1050010dQl != null) {
                    abstractC1050010dQl.LIZ = c1049700dQG;
                    abstractC1050010dQl.LJ(new Object[0]);
                }
            }
        }
        if (this.LLLLLLLLL != null && LJIIIIZZ(10) && (c19jv2 = (c19jl = this.LLLLLLLLL).LIZIZ) != null) {
            try {
                C786410Ut5.LJLJJI(1001, CastIntegerProtector.parseInt(C1981907pZ.LIZ(c19jv2.LIZJ.optString("delay"), c19jl.LIZJ.LLILLL)), c19jl.LIZLLL);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LLLLLLL == null || !LJIIIIZZ(9) || (c19jv = (c19jq = this.LLLLLLL).LIZLLL) == null) {
            return;
        }
        JSONObject jSONObject = c19jv.LIZJ;
        try {
            c19jq.LIZIZ = CastIntegerProtector.parseInt(C1981907pZ.LIZ(jSONObject.optString("interval", "8000"), c19jq.LJ.LLILLL));
            c19jq.LIZ = jSONObject.optBoolean("repeat");
            C786410Ut5.LJLJJI(1001, c19jq.LIZIZ, c19jq.LJFF);
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public void LJIIL() {
        List<C19J8> list;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        AnimatorSet animatorSet;
        C21518119Jb c21518119Jb = this.LLLLLLLZIL;
        if (c21518119Jb != null && (animatorSet = c21518119Jb.LIZIZ) != null) {
            animatorSet.cancel();
        }
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null && (valueAnimator2 = c19j8.LLILLL) != null) {
            valueAnimator2.cancel();
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null && (valueAnimator = c19j82.LLILLL) != null) {
                    valueAnimator.cancel();
                }
            }
        }
        C19JY c19jy = this.LLLLLLZZ;
        if (c19jy != null) {
            c19jy.LJIIIIZZ();
        }
    }

    public void LJIIZILJ() {
        BitmapDrawable bitmapDrawable;
        List<AbstractC1050010dQl> listLIZ;
        List<C19J8> list;
        List<AbstractC1050010dQl> value;
        C19JV c19jv;
        if (TextUtils.isEmpty(this.LLJJJJJIL)) {
            if (this.LLLLLL) {
                LJIJJLI(this.LLLLLLIL);
            } else {
                this.LLLLL.setColor(this.LLJJJJ);
                LJIJJ(this.LLJJJJ);
            }
        } else if (this.LLJJJJJIL.startsWith("local://")) {
            String strReplace = this.LLJJJJJIL.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = this.LLJJLIIIJLLLLLLLZ ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.LL.getResources().openRawResource(C790800V0k.LIZ(this.LL, strReplace, "drawable")), null, options);
                if (this.LLJJLIIIJLLLLLLLZ) {
                    Bitmap bitmapLIZJ = C1100060ejU.LIZJ((int) this.LLJJL, this.LL, bitmapDecodeStream);
                    bitmapDrawable = bitmapLIZJ != null ? new BitmapDrawable(this.LL.getResources(), bitmapLIZJ) : new BitmapDrawable(this.LL.getResources(), bitmapDecodeStream);
                } else {
                    bitmapDrawable = new BitmapDrawable(this.LL.getResources(), bitmapDecodeStream);
                }
                LJIL(bitmapDrawable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            LJJI();
        }
        LJJIFFI();
        int i = this.LLLI;
        ViewParent viewParent = (ViewGroup) this.LLILZ.getParent();
        if (viewParent instanceof InterfaceC1049770dQN) {
            ((InterfaceC1049770dQN) viewParent).LIZJ(i, this.LLILZ);
        } else {
            C786410Ut5.LJLLLLLL(i, this.LLILZ);
        }
        if (this.LLLL) {
            C786410Ut5.Jc(this.LLILZ, this.LLLIILIL);
        }
        if (this.LLLLII) {
            C786410Ut5.ed(this.LLILZ, this.LLLIL);
        }
        if (this.LLLLIIIILLL) {
            C786410Ut5.Ob(this.LLILZ, this.LLLILZ);
        }
        if (this.LLLLIIL) {
            C786410Ut5.pc(this.LLILZ, this.LLLILZJ);
        }
        if (this.LLLLIILL) {
            C786410Ut5.Ab(this.LLILZ, this.LLLILZLLLI);
        }
        if (this.LLLLIILLL) {
            C786410Ut5.Hb(this.LLILZ, this.LLLIZZ);
        }
        if (this.LLLLIL) {
            C786410Ut5.Ib(this.LLILZ, -this.LLLJ);
        }
        if (this.LLLLILI) {
            C786410Ut5.T4(this.LLILZ, this.LLLJL);
        }
        float f = this.LLLJIL;
        if (f != 0.0f) {
            C786410Ut5.Ab(this.LLILZ, f);
        }
        if (this.LLLLIILL || this.LLLLIILLL || this.LLLLIL) {
            this.LLILZ.setCameraDistance(10000.0f);
        }
        C786410Ut5.LJLLLLLL(this.LLLI, this.LLILZ);
        float f2 = this.LLLJIL;
        if (f2 != 0.0f) {
            C786410Ut5.Ab(this.LLILZ, f2);
        }
        C1049830dQT c1049830dQT = this.LLILZLL;
        if (c1049830dQT != null && TextUtils.isEmpty(c1049830dQT.LJFF)) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 75), this.LLILZ);
        } else if (LJIIIIZZ(1)) {
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 75), this.LLILZ);
        }
        if (this.LLLLLIL != null && LJIIIIZZ(4)) {
            if (LJIIIIZZ(1)) {
                this.LLLLLLZ = true;
                this.LLLLLLLLLL = new C19JS(this.LL, (C19JV) ((HashMap) this.LLLLLJLJLL).get(4), (C19JV) ((HashMap) this.LLLLLJLJLL).get(1), this.LLLLLLZ, this.LLLZ);
            } else {
                this.LLLLLLLLLL = new C19JS(this.LL, (C19JV) ((HashMap) this.LLLLLJLJLL).get(4), this.LLLLLLZ, this.LLLZ);
            }
        }
        if (this.LLLLLIL != null) {
            LJIIIIZZ(1);
        }
        if (this.LLLLLIL != null && LJIIIIZZ(18) && (c19jv = (C19JV) ((HashMap) this.LLLLLJLJLL).get(18)) != null) {
            JSONObject jSONObject = c19jv.LIZJ;
            if (jSONObject != null) {
                try {
                    jSONObject.put("rotateZ", C1981907pZ.LIZ(jSONObject.optString("rotateZ"), this.LLILLL));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLLLLIL.LIZIZ();
        }
        if (this.LLLLLIL != null && LJIIIIZZ(3)) {
            C1015570cXD.LIZ().getClass();
        }
        if (this.LLLLLIL != null && LJIIIIZZ(9)) {
            C19JQ c19jq = new C19JQ((C19JV) ((HashMap) this.LLLLLJLJLL).get(9), this);
            this.LLLLLLL = c19jq;
            c19jq.LIZJ = this.LLLLLIL;
        }
        if (LJIIIIZZ(10)) {
            C19JL c19jl = new C19JL((C19JV) ((HashMap) this.LLLLLJLJLL).get(10), this);
            this.LLLLLLLLL = c19jl;
            c19jl.LIZ = this.LLLLLIL;
        }
        C1049700dQG c1049700dQG = this.LLLLZLLIL;
        if (c1049700dQG != null) {
            List<AbstractC1050010dQl> listLIZ2 = c1049700dQG.LIZ("shake");
            if (listLIZ2 != null && !listLIZ2.isEmpty()) {
                for (AbstractC1050010dQl abstractC1050010dQl : listLIZ2) {
                    if (abstractC1050010dQl != null) {
                        abstractC1050010dQl.LIZ = c1049700dQG;
                        abstractC1050010dQl.LJ(new Object[0]);
                    }
                }
            }
            C1049700dQG c1049700dQG2 = this.LLLLZLLIL;
            List<AbstractC1050010dQl> listLIZ3 = c1049700dQG2.LIZ("twist");
            if (listLIZ3 != null && !listLIZ3.isEmpty()) {
                for (AbstractC1050010dQl abstractC1050010dQl2 : listLIZ3) {
                    if (abstractC1050010dQl2 != null) {
                        abstractC1050010dQl2.LIZ = c1049700dQG2;
                        abstractC1050010dQl2.LJ(new Object[0]);
                    }
                }
            }
            C1049700dQG c1049700dQG3 = this.LLLLZLLIL;
            C1049710dQH c1049710dQH = c1049700dQG3.LIZ;
            if (c1049710dQH != null) {
                for (Map.Entry<String, List<AbstractC1050010dQl>> entry : c1049710dQH.LIZ.entrySet()) {
                    if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                        for (AbstractC1050010dQl abstractC1050010dQl3 : value) {
                            if (abstractC1050010dQl3 instanceof C1049890dQZ) {
                                abstractC1050010dQl3.LIZ = c1049700dQG3;
                                abstractC1050010dQl3.LJ(new Object[0]);
                            }
                        }
                    }
                }
            }
        }
        this.LLILZ.setOnTouchListener(this);
        StringBuilder sb = new StringBuilder();
        sb.append(this.LLJ);
        this.LLILZ.setContentDescription(sb);
        ViewGroup viewGroup = (ViewGroup) this.LLILZ.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(true ^ this.LLLLJ);
        }
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null) {
            c19j8.LIZ();
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null) {
                    c19j82.LIZ();
                }
            }
        }
        C1049700dQG c1049700dQG4 = this.LLLLZLLIL;
        if (c1049700dQG4 != null && (listLIZ = c1049700dQG4.LIZ("animateState")) != null && !listLIZ.isEmpty()) {
            for (AbstractC1050010dQl abstractC1050010dQl4 : listLIZ) {
                if (abstractC1050010dQl4 != null) {
                    abstractC1050010dQl4.LIZ = c1049700dQG4;
                    abstractC1050010dQl4.LJ(new Object[0]);
                }
            }
        }
        if (this.LLLLLIL == null || !LJIIIIZZ(22)) {
            return;
        }
        InterfaceC1049730dQJ interfaceC1049730dQJ = this.LLLLLIL;
        ((HashMap) this.LLLLLJLJLL).get(22);
        interfaceC1049730dQJ.LIZIZ();
    }

    public final void LJIJI() {
        float f = this.LLJZ ? this.LLJLILLLLZIIL : this.LLJLIL;
        float f2 = this.LLJZIJLIL ? this.LLJLLIL : this.LLJLIL;
        float f3 = this.LLL ? this.LLJLL : this.LLJLIL;
        float f4 = this.LLLF ? this.LLJLLL : this.LLJLIL;
        this.LLLLL.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    public void LJJI() {
        C1015690cXP c1015690cXP = this.LLLLLJIL;
        if (c1015690cXP != null) {
            c1015690cXP.LIZIZ();
        }
        C1015570cXD.LIZ().LIZJ.LIZ(this.LLIZ, this.LLJJJJJIL, new C19JU(this));
    }

    public void LJJIFFI() {
        float f = this.LLJJIJIIJIL ? this.LLJILLL : this.LLJILJILJ;
        float f2 = this.LLJJIJIL ? this.LLJJ : this.LLJILJILJ;
        float f3 = this.LLJJJ ? this.LLJJI : this.LLJILJILJ;
        float f4 = this.LLJJJIL ? this.LLJJIII : this.LLJILJILJ;
        if (C1015570cXD.LIZ().LJ) {
            this.LLILZ.setPaddingRelative((int) f, (int) f3, (int) f2, (int) f4);
        } else {
            this.LLILZ.setPadding((int) f, (int) f3, (int) f2, (int) f4);
        }
    }

    public final void LJJII() {
        if (TextUtils.equals("dashed", this.LLLFZ)) {
            GradientDrawable gradientDrawable = this.LLLLL;
            float f = this.LLLFF;
            gradientDrawable.setStroke((int) f, this.LLLFFI, 3.0f * f, f);
        } else {
            if (!TextUtils.equals("dotted", this.LLLFZ)) {
                this.LLLLL.setStroke((int) this.LLLFF, this.LLLFFI);
                return;
            }
            GradientDrawable gradientDrawable2 = this.LLLLL;
            float f2 = this.LLLFF;
            gradientDrawable2.setStroke((int) f2, this.LLLFFI, f2 / 2.0f, f2);
        }
    }

    public C19JH(Context context) {
        this.LLJIJIL = -2.0f;
        this.LLJILJIL = -2.0f;
        this.LLLFZ = "solid";
        this.LLLIIII = true;
        this.LLLILZ = 1.0f;
        this.LLLILZJ = 1.0f;
        this.LLLJL = 1.0f;
        this.LLLLJ = true;
        this.LLLLZI = true;
        this.LL = context;
        this.LLILZIL = null;
        this.LLLLLJLJLL = new HashMap();
        this.LLLLL = new GradientDrawable();
        this.LLILZ = (T) LIZ();
    }

    public static C19JH LJI(C19JH c19jh) {
        C1049820dQS<ViewGroup> c1049820dQS = c19jh.LLILZIL;
        if (c1049820dQS == null && (c19jh instanceof C1049820dQS)) {
            return c19jh;
        }
        return LJI(c1049820dQS);
    }

    public final void LIZIZ(Canvas canvas) {
        List<C19J8> list;
        C19J0 c19j0;
        C19J0 c19j02;
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null && (c19j02 = c19j8.LLIZ) != null) {
            c19j02.LIZ(canvas);
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null && (c19j0 = c19j82.LLIZ) != null) {
                    c19j0.LIZ(canvas);
                }
            }
        }
    }

    public final C19J8 LIZLLL(String str) {
        List<C19J8> list;
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null && TextUtils.equals(str, c19j8.LLIZLLLIL)) {
            return this.LLLIIIL;
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null && TextUtils.equals(c19j82.LLIZLLLIL, str)) {
                    return c19j82;
                }
            }
            return null;
        }
        return null;
    }

    public C19JH<T> LJ(String str) {
        if (LIZLLL(str) != null) {
            return this;
        }
        return null;
    }

    public C19JH<T> LJFF(String str) {
        if (!TextUtils.isEmpty(this.LLJ) && TextUtils.equals(this.LLJ, str)) {
            return this;
        }
        return null;
    }

    public final boolean LJIIIIZZ(int i) {
        Map<Integer, C19JV> map = this.LLLLLJLJLL;
        if (map != null) {
            if (((HashMap) map).containsKey(Integer.valueOf(i))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIJJ(int i) {
        this.LLLLL.setShape(0);
        this.LLLLL.setColor(i);
        LJIJI();
        LJJII();
        this.LLILZ.setBackground(this.LLLLL);
    }

    public final void LJIJJLI(C21367818jk c21367818jk) {
        if (c21367818jk == null) {
            return;
        }
        this.LLLLL.setShape(0);
        this.LLLLL.setOrientation(c21367818jk.LIZ);
        if (Build.VERSION.SDK_INT >= 29) {
            this.LLLLL.setColors(c21367818jk.LIZIZ, c21367818jk.LIZJ);
        } else {
            this.LLLLL.setColors(c21367818jk.LIZIZ);
        }
        LJIJI();
        LJJII();
        this.LLILZ.setBackground(this.LLLLL);
    }

    public void LJIL(Drawable drawable) {
        this.LLILZ.setBackground(drawable);
    }

    public final void LIZJ(Canvas canvas, InterfaceC1337130ktr interfaceC1337130ktr) {
        C21518119Jb c21518119Jb = this.LLLLLLLZIL;
        if (c21518119Jb != null) {
            c21518119Jb.getClass();
            try {
                if (interfaceC1337130ktr.getRipple() != 0.0f && !TextUtils.isEmpty(c21518119Jb.LJI)) {
                    c21518119Jb.LJFF.setColor(C21367718jj.LIZJ(c21518119Jb.LJI));
                    c21518119Jb.LJFF.setAlpha(90);
                    ((ViewGroup) c21518119Jb.LIZJ.getParent()).setClipChildren(true);
                    canvas.drawCircle(c21518119Jb.LIZLLL, c21518119Jb.LJ, Math.min(r1, r0) * 2 * interfaceC1337130ktr.getRipple(), c21518119Jb.LJFF);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final int[] LJIIIZ(int i, int i2) {
        if (this.LLLII > 0.0f) {
            if (this.LLLLZIL) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.LLLII;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.LLLLZLL) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.LLLII;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        C19JY c19jy = this.LLLLLLZZ;
        if (c19jy != null && !this.LLLLLZIL) {
            this.LLLLLZIL = true;
            c19jy.LJ();
        }
        return new int[]{i, i2};
    }

    public final void LJIILLIIL(int i, int i2) {
        List<C19J8> list;
        C19J0 c19j0;
        C19J0 c19j02;
        C21518119Jb c21518119Jb = this.LLLLLLLZIL;
        if (c21518119Jb != null) {
            c21518119Jb.LIZLLL = i / 2;
            c21518119Jb.LJ = i2 / 2;
        }
        C19J8 c19j8 = this.LLLIIIL;
        if (c19j8 != null && (c19j02 = c19j8.LLIZ) != null) {
            c19j02.LIZIZ(i, i2);
        }
        C19JB c19jb = this.LLLIIL;
        if (c19jb != null && (list = c19jb.LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            for (C19J8 c19j82 : (ArrayList) c19jb.LIZIZ) {
                if (c19j82 != null && (c19j0 = c19j82.LLIZ) != null) {
                    c19j0.LIZIZ(i, i2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJ(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 2182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19JH.LJIJ(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19JH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void LJIIJ(int i, JSONObject jSONObject, C19JV c19jv) {
        if (jSONObject.optJSONObject("success") != null) {
            new C19JV();
        }
        if (jSONObject.optJSONObject("fail") != null) {
            new C19JV();
        }
        c19jv.LIZJ = jSONObject;
        ((HashMap) this.LLLLLJLJLL).put(Integer.valueOf(i), c19jv);
    }
}
