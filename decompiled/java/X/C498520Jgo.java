package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498520Jgo extends C1091840eWE {
    public List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final Paint LLIZ;
    public InterfaceC498160JgE LLIZLLLIL;
    public Function1<? super List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>>, Unit> LLJ;
    public final Map<AbstractC498530Jgp<? extends AbstractC521080Kc6>, Float> LLJI;
    public int LLJIJIL;
    public C498120JgA LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLILZLL) {
            C498120JgA c498120JgA = this.LLJILJIL;
            ((ArrayList) c498120JgA.LJ).clear();
            for (AbstractC498550Jgr<? extends AbstractC521080Kc6> abstractC498550Jgr : c498120JgA.LJFF) {
                if (abstractC498550Jgr != null) {
                    abstractC498550Jgr.LJFF();
                }
            }
            c498120JgA.LJFF.clear();
            c498120JgA.LIZJ.removeCallbacksAndMessages(null);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final boolean getClickAble() {
        return this.LLJILLL;
    }

    public final float getDownX() {
        return this.LLJILJILJ;
    }

    public final C498120JgA getLabelManager() {
        return this.LLJILJIL;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List listLLIIII;
        boolean z;
        super.onDraw(canvas);
        List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> list = this.LLILLL;
        if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null || !(!listLLIIII.isEmpty()) || this.LLJIJIL == 0) {
            return;
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.LLJIJIL;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp = (AbstractC498530Jgp) ListProtector.get(listLLIIII, i3);
            int iLIZIZ = abstractC498530Jgp.LIZJ().LIZIZ(this.LLIZ);
            if (i3 > 0) {
                i2 += this.LLILZ;
            }
            canvas.save();
            float width = z ? (getWidth() - i2) - iLIZIZ : i2;
            canvas.translate(width, 0.0f);
            if (((LinkedHashMap) this.LLJI).get(abstractC498530Jgp) == null) {
                this.LLJI.put(abstractC498530Jgp, Float.valueOf(width));
            }
            abstractC498530Jgp.LIZJ().LIZ(canvas, this.LLIZ);
            canvas.restore();
            i2 += iLIZIZ;
        }
        if (!(!this.LLJILJIL.LJFF.isEmpty())) {
            List listLL = C13LP.LL(listLLIIII, this.LLJIJIL);
            Function1<? super List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>>, Unit> function1 = this.LLJ;
            if (function1 != null) {
                function1.invoke(listLL);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC498160JgE interfaceC498160JgE;
        int iLIZIZ;
        AbstractC521080Kc6 abstractC521080Kc6LIZJ;
        AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLJILJILJ = motionEvent.getX();
                this.LLJILLL = true;
            } else if (numValueOf != null) {
                if (numValueOf.intValue() != 2 && numValueOf.intValue() != 3) {
                    if (numValueOf.intValue() == 1) {
                        this.LLJILLL = true;
                        float x = motionEvent.getX();
                        Map<AbstractC498530Jgp<? extends AbstractC521080Kc6>, Float> map = this.LLJI;
                        if (map != null && !map.isEmpty()) {
                            for (Map.Entry entry : ((LinkedHashMap) this.LLJI).entrySet()) {
                                AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp2 = (AbstractC498530Jgp) entry.getKey();
                                float fFloatValue = ((Number) entry.getValue()).floatValue();
                                if (C497740JfY.LJJ()) {
                                    if (abstractC498530Jgp2 != null && (abstractC521080Kc6LIZJ = abstractC498530Jgp2.LIZJ()) != null) {
                                        iLIZIZ = abstractC521080Kc6LIZJ.LIZIZ(this.LLIZ);
                                    } else {
                                        iLIZIZ = 0;
                                    }
                                    if (x < fFloatValue + iLIZIZ) {
                                        abstractC498530Jgp = abstractC498530Jgp2;
                                    }
                                } else if (x > fFloatValue) {
                                    abstractC498530Jgp = abstractC498530Jgp2;
                                }
                            }
                            if (abstractC498530Jgp != null && this.LLJILLL && (interfaceC498160JgE = this.LLIZLLLIL) != null) {
                                interfaceC498160JgE.LIZ(abstractC498530Jgp);
                            }
                        }
                    }
                } else {
                    this.LLJILLL = false;
                }
            }
        }
        return this.LLJILLL;
    }

    public final void setBadges(List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list) {
        boolean z;
        List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> list2 = this.LLILLL;
        if ((list2 == null || list2.isEmpty()) && list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.LLILLL = list;
        ((LinkedHashMap) this.LLJI).clear();
        if (true ^ list.isEmpty()) {
            Iterator<AbstractC498530Jgp<? extends AbstractC521080Kc6>> it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC521080Kc6 abstractC521080Kc6LIZJ = it2.next().LIZJ();
                int i = this.LLILZIL;
                if (i != 0) {
                    abstractC521080Kc6LIZJ.LIZJ = i;
                }
            }
        }
        this.LLJIJIL = 0;
        if (z) {
            requestLayout();
        }
    }

    public final void setClickAble(boolean z) {
        this.LLJILLL = z;
    }

    public final void setDownX(float f) {
        this.LLJILJILJ = f;
    }

    public final void setLabelManager(C498120JgA c498120JgA) {
        this.LLJILJIL = c498120JgA;
    }

    public final void setOnLabelClickListener(InterfaceC498160JgE interfaceC498160JgE) {
        this.LLIZLLLIL = interfaceC498160JgE;
    }

    public C498520Jgo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avh);
        this.LLILZ = dimensionPixelSize;
        this.LLILZIL = context.getResources().getDimensionPixelSize(R.dimen.f617avg);
        this.LLILZLL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TTLiveLabelView);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TTLiveLabelView_labelHeight)) {
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TTLiveLabelView_labelHeight, 0);
        }
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TTLiveLabelView_labelSpacing, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        this.LLIZ = new Paint(1);
        this.LLJI = new LinkedHashMap();
        this.LLJILJIL = new C498120JgA(C497740JfY.LJJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498520Jgo.onMeasure(int, int):void");
    }
}
