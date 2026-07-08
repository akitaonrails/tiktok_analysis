package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVZ extends C1091840eWE {
    public List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final Paint LLJ;
    public InterfaceC518480KVa LLJI;
    public final Map<AbstractC498530Jgp<? extends AbstractC521080Kc6>, Float> LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public C520950Kbt LLJILLL;
    public float LLJJ;
    public boolean LLJJI;

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public final void LIZ() {
        this.LLILLL = null;
        ((LinkedHashMap) this.LLJIJIL).clear();
    }

    public final void LIZLLL() {
        this.LLILLL = null;
        this.LLJILLL = new C520950Kbt(C497740JfY.LJJ(), 7);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLILZLL) {
            this.LLJILLL.LIZLLL();
        }
        super.onDetachedFromWindow();
    }

    public final C520950Kbt getBadgeManager() {
        return this.LLJILLL;
    }

    public final boolean getClickAble() {
        return this.LLJJI;
    }

    public final float getDownX() {
        return this.LLJJ;
    }

    public final int getFontWeight() {
        return this.LLIZLLLIL;
    }

    public final int getTypographyName() {
        return this.LLIZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List listLLIIII;
        super.onDraw(canvas);
        boolean z = true;
        this.LLJILJILJ = true;
        List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> list = this.LLILLL;
        if (list != null && (listLLIIII = C13LP.LLIIII(list)) != null && (!listLLIIII.isEmpty())) {
            if (this.LLJILJIL == 0) {
                this.LLJILJILJ = false;
                return;
            }
            if (getLayoutDirection() != 1) {
                z = false;
            }
            int i = this.LLJILJIL;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp = (AbstractC498530Jgp) ListProtector.get(listLLIIII, i3);
                int iLIZIZ = abstractC498530Jgp.LIZJ().LIZIZ(this.LLJ);
                if (i3 > 0) {
                    i2 += this.LLILZ;
                }
                canvas.save();
                float width = z ? (getWidth() - i2) - iLIZIZ : i2;
                canvas.translate(width, 0.0f);
                if (((LinkedHashMap) this.LLJIJIL).get(abstractC498530Jgp) == null) {
                    this.LLJIJIL.put(abstractC498530Jgp, Float.valueOf(width));
                }
                abstractC498530Jgp.LIZJ().LIZ(canvas, this.LLJ);
                canvas.restore();
                i2 += iLIZIZ;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC518480KVa interfaceC518480KVa;
        int iLIZIZ;
        AbstractC521080Kc6 abstractC521080Kc6LIZJ;
        AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLJJ = motionEvent.getX();
                this.LLJJI = true;
            } else if (numValueOf != null) {
                if (numValueOf.intValue() != 2 && numValueOf.intValue() != 3) {
                    if (numValueOf.intValue() == 1) {
                        this.LLJJI = true;
                        float x = motionEvent.getX();
                        Map<AbstractC498530Jgp<? extends AbstractC521080Kc6>, Float> map = this.LLJIJIL;
                        if (map != null && !map.isEmpty()) {
                            for (Map.Entry entry : ((LinkedHashMap) this.LLJIJIL).entrySet()) {
                                AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp2 = (AbstractC498530Jgp) entry.getKey();
                                float fFloatValue = ((Number) entry.getValue()).floatValue();
                                if (C497740JfY.LJJ()) {
                                    if (abstractC498530Jgp2 != null && (abstractC521080Kc6LIZJ = abstractC498530Jgp2.LIZJ()) != null) {
                                        iLIZIZ = abstractC521080Kc6LIZJ.LIZIZ(this.LLJ);
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
                            if (abstractC498530Jgp != null && this.LLJJI && (interfaceC518480KVa = this.LLJI) != null) {
                                interfaceC518480KVa.LIZ(abstractC498530Jgp);
                            }
                        }
                    }
                } else {
                    this.LLJJI = false;
                }
            }
        }
        return this.LLJJI;
    }

    public final void setBadgeManager(C520950Kbt c520950Kbt) {
        this.LLJILLL = c520950Kbt;
    }

    public final void setBadges(List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list) {
        boolean z;
        C1113930f5r c1113930f5r;
        List<? extends AbstractC498530Jgp<? extends AbstractC521080Kc6>> list2 = this.LLILLL;
        if ((list2 == null || list2.isEmpty()) && !(!list.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        this.LLILLL = list;
        if (true ^ list.isEmpty()) {
            Iterator<AbstractC498530Jgp<? extends AbstractC521080Kc6>> it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC521080Kc6 abstractC521080Kc6LIZJ = it2.next().LIZJ();
                int i = this.LLIZ;
                if (i != -1) {
                    abstractC521080Kc6LIZJ.LIZLLL = i;
                }
                int i2 = this.LLILZIL;
                if (i2 != 0) {
                    abstractC521080Kc6LIZJ.LIZJ = i2;
                }
                if ((abstractC521080Kc6LIZJ instanceof C1113930f5r) && (c1113930f5r = (C1113930f5r) abstractC521080Kc6LIZJ) != null) {
                    c1113930f5r.LJJJI = this.LLIZLLLIL;
                }
            }
        }
        this.LLJILJIL = 0;
        if (z) {
            requestLayout();
        }
    }

    public final void setClickAble(boolean z) {
        this.LLJJI = z;
    }

    public final void setDownX(float f) {
        this.LLJJ = f;
    }

    public final void setFontWeight(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setOnBadgeClickListener(InterfaceC518480KVa interfaceC518480KVa) {
        this.LLJI = interfaceC518480KVa;
    }

    public final void setTypographyName(int i) {
        this.LLIZ = i;
    }

    public C0KVZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C0KVZ.onMeasure(int, int):void");
    }

    public C0KVZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avh);
        this.LLILZ = dimensionPixelSize;
        this.LLILZIL = context.getResources().getDimensionPixelSize(R.dimen.f617avg);
        this.LLILZLL = true;
        this.LLIZ = -1;
        this.LLIZLLLIL = 500;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TTLiveBadgeView);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TTLiveBadgeView_typographyName)) {
            this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TTLiveBadgeView_typographyName, 11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TTLiveBadgeView_badgeHeight)) {
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TTLiveBadgeView_badgeHeight, 0);
        }
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TTLiveBadgeView_badgeSpacing, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJ = new Paint(1);
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJILJ = true;
        this.LLJILLL = new C520950Kbt(C497740JfY.LJJ(), 7);
    }

    public final void LJ(boolean z, List<BadgeStruct> list, User user, int i, Function0<Unit> function0, Function1<? super BadgeStruct, Unit> function1, boolean z2) {
        if (list == null) {
            return;
        }
        this.LLJILLL.LJIIIZ(z, getContext(), list, new AwS551S0100000_7(this, 6), function1, i, user, function0, z2);
    }
}
