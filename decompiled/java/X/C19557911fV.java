package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19557911fV extends RelativeLayout {
    public C373020Ejs LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public FrameLayout LLILZ;
    public final int LLILZIL;
    public ArrayList<EffectPointModel> LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public InterfaceC19560711fx LLJ;
    public final int LLJI;

    public int getCursorPosition() {
        return LJ(1, this.LLILZ);
    }

    public int getCursorOffsetTime() {
        return (int) ((((int) C12ES.LIZJ(21.0f, getContext())) / C0EZ3.LIZ) * this.LLIZLLLIL);
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.LLILZLL;
    }

    public static String LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((int) Math.floor(((double) i) / 1000.0d));
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ.length() < 2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(CardStruct.IStatusCode.DEFAULT);
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("00:");
        sbLIZ3.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final EffectPointModel LIZJ(String str) {
        try {
            Iterator<EffectPointModel> it2 = this.LLILZLL.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                EffectPointModel next = it2.next();
                EffectPointModel effectPointModel = next;
                if (effectPointModel != null && effectPointModel.getUuid().equals(str)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final int LIZLLL(int i) {
        float fLIZJ;
        if (i == 1) {
            fLIZJ = C12ES.LIZJ(4.0f, getContext());
        } else {
            fLIZJ = C12ES.LIZJ(30.0f, getContext());
        }
        return (int) fLIZJ;
    }

    public final void LJII(int i) {
        int iLIZLLL = C0EZ3.LIZ - LIZLLL(1);
        int i2 = (int) ((i / this.LLIZLLLIL) * iLIZLLL);
        if (i2 >= iLIZLLL) {
            i2 = this.LLILZIL + iLIZLLL;
        }
        if (i2 <= 0) {
            i2 = -this.LLILZIL;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZ.getLayoutParams();
        marginLayoutParams.setMarginStart(i2);
        C786410Ut5.a6(this.LLILZ, marginLayoutParams);
        setStartTime(i);
    }

    public final void LJIIIIZZ(boolean z) {
        C373020Ejs c373020Ejs = this.LL;
        if (c373020Ejs.LLJILJILJ != z) {
            c373020Ejs.LLJILJILJ = z;
            c373020Ejs.invalidate();
        }
    }

    public void setNormalColor(int i) {
        this.LL.setNormalColor(i);
    }

    public void setOnCursorSeekListener(InterfaceC19560711fx interfaceC19560711fx) {
        this.LLJ = interfaceC19560711fx;
    }

    public void setOverlayColor(int i) {
        this.LL.setOverlayColor(i);
    }

    public void setStartTime(int i) {
        if (i > this.LLIZLLLIL - getCursorOffsetTime()) {
            i = this.LLIZLLLIL;
        }
        this.LLILLL.setText(LJFF(i));
    }

    public void setVideoDuration(int i) {
        C373020Ejs c373020Ejs = this.LL;
        if (c373020Ejs != null) {
            this.LLIZLLLIL = i;
            c373020Ejs.setDuration(i);
            this.LLILLJJLI.setText(LJFF(i));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C373020Ejs c373020Ejs = this.LL;
        int visibility = c373020Ejs.getVisibility();
        c373020Ejs.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c373020Ejs);
    }

    public C19557911fV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = C12ES.LJIILJJIL(C12ES.LJIIJ(context), context);
        int iLIZJ = (int) C12ES.LIZJ(0.0f, context);
        this.LLILZIL = iLIZJ;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_leftRightMargin, 0.0f));
            int i = C12UY.LIZJ;
            this.LLJI = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_slideHorizontalMargin, fRound - i)) + i;
            typedArrayObtainStyledAttributes.recycle();
        }
        C786410Ut5.Sd(R.layout.vf, C786410Ut5.ne(getContext()), this);
        this.LLILZLL = new ArrayList<>();
        this.LL = (C373020Ejs) findViewById(R.id.gxa);
        this.LLILLJJLI = (TextView) findViewById(R.id.zk8);
        this.LLILLL = (TextView) findViewById(R.id.tv_start_time);
        this.LLILZ = (FrameLayout) findViewById(R.id.to2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.EffectSeekLayout);
        int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.EffectSeekLayout_normal_color, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.LL.setNormalColor(color);
        final FrameLayout frameLayout = this.LLILZ;
        frameLayout.setOnTouchListener(new View.OnTouchListener(frameLayout) { // from class: X.11fX
            public final FrameLayout LL;
            public final RelativeLayout.LayoutParams LLILLJJLI;
            public final int LLILLL = 1;

            {
                this.LL = frameLayout;
                this.LLILLJJLI = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            }

            public final float LIZ(float f, int i2) {
                float fLIZJ;
                int iLIZLLL = this.LLILZ.LIZLLL(i2);
                C19557911fV c19557911fV = this.LLILZ;
                if (f < c19557911fV.LLJI) {
                    fLIZJ = -c19557911fV.LLILZIL;
                } else {
                    if (f > ((int) C12ES.LIZJ(this.LLILZ.LLIZ - 24, c19557911fV.getContext())) - iLIZLLL) {
                        float fLIZJ2 = C12ES.LIZJ(this.LLILZ.LLIZ, this.LLILZ.getContext());
                        C19557911fV c19557911fV2 = this.LLILZ;
                        fLIZJ = ((fLIZJ2 - (c19557911fV2.LLJI * 2)) - iLIZLLL) + c19557911fV2.LLILZIL;
                    } else {
                        C19557911fV c19557911fV3 = this.LLILZ;
                        fLIZJ = (f - c19557911fV3.LLJI) + (c19557911fV3.LLILZIL * (((2.0f * r6) / ((C12ES.LIZJ(this.LLILZ.LLIZ, c19557911fV3.getContext()) - (this.LLILZ.LLJI * 2)) - iLIZLLL)) - 1.0f));
                    }
                }
                if (C1388580mEq.LIZIZ(this.LLILZ.getContext())) {
                    return ((C12ES.LIZJ(this.LLILZ.LLIZ, this.LLILZ.getContext()) - (this.LLILZ.LLJI * 2)) - iLIZLLL) - fLIZJ;
                }
                return fLIZJ;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                /*
                    r7 = this;
                    int r0 = r9.getAction()
                    r4 = 1
                    if (r0 == 0) goto L5f
                    r6 = 2
                    if (r0 == r4) goto L4b
                    r5 = 3
                    if (r0 == r6) goto L10
                    if (r0 == r5) goto L4b
                Lf:
                    return r4
                L10:
                    float r1 = r9.getRawX()
                    int r0 = r7.LLILLL
                    float r0 = r7.LIZ(r1, r0)
                    android.widget.RelativeLayout$LayoutParams r1 = r7.LLILLJJLI
                    int r0 = java.lang.Math.round(r0)
                    r1.setMarginStart(r0)
                    android.widget.FrameLayout r1 = r7.LL
                    android.widget.RelativeLayout$LayoutParams r0 = r7.LLILLJJLI
                    X.C786410Ut5.a6(r1, r0)
                    int r0 = r7.LLILLL
                    if (r0 != r4) goto L37
                    X.11fV r1 = r7.LLILZ
                    int r0 = r1.getCursorPosition()
                    r1.setStartTime(r0)
                L37:
                    X.11fV r3 = r7.LLILZ
                    X.11fx r2 = r3.LLJ
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LL
                    int r0 = r7.LLILLL
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LLILLL
                    r2.LIZ(r1, r0, r5)
                    return r4
                L4b:
                    X.11fV r3 = r7.LLILZ
                    X.11fx r2 = r3.LLJ
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LL
                    int r0 = r7.LLILLL
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LLILLL
                    r2.LIZ(r1, r0, r6)
                    return r4
                L5f:
                    float r1 = r9.getRawX()
                    int r0 = r7.LLILLL
                    float r0 = r7.LIZ(r1, r0)
                    android.widget.RelativeLayout$LayoutParams r1 = r7.LLILLJJLI
                    int r0 = java.lang.Math.round(r0)
                    r1.setMarginStart(r0)
                    android.widget.FrameLayout r1 = r7.LL
                    android.widget.RelativeLayout$LayoutParams r0 = r7.LLILLJJLI
                    X.C786410Ut5.a6(r1, r0)
                    X.11fV r3 = r7.LLILZ
                    X.11fx r2 = r3.LLJ
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LL
                    int r0 = r7.LLILLL
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LLILLL
                    r2.LIZ(r1, r0, r4)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC19558111fX.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZ.getLayoutParams();
        marginLayoutParams.setMarginStart(-iLIZJ);
        C786410Ut5.a6(this.LLILZ, marginLayoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.zfj);
        Context context2 = C19733712It.LIZ;
        imageView.setImageDrawable(C426580Go4.LIZJ(0, -1, 1, (int) C12ES.LIZJ(2.0f, getContext())));
        C786410Ut5.LJLLLLLL(8, findViewById(R.id.c9e));
        View viewFindViewById = findViewById(R.id.gxb);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int i2 = this.LLJI;
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        C786410Ut5.W5(viewFindViewById, layoutParams);
    }

    public final void LIZIZ(int i, boolean z) {
        boolean z2;
        C373020Ejs c373020Ejs = this.LL;
        if (c373020Ejs.LLJILJILJ != z) {
            c373020Ejs.LLJILJILJ = z;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c373020Ejs.LLJILJIL != i) {
            c373020Ejs.LLJILJIL = i;
        } else if (!z2) {
            return;
        }
        c373020Ejs.invalidate();
    }

    public final int LJ(int i, FrameLayout frameLayout) {
        int left;
        if (frameLayout != null) {
            if (C1388580mEq.LIZIZ(getContext())) {
                left = (int) ((1.0f - ((frameLayout.getRight() - this.LLJI) / C0EZ3.LIZ)) * this.LLIZLLLIL);
            } else {
                left = (int) (((frameLayout.getLeft() - this.LLJI) / C0EZ3.LIZ) * this.LLIZLLLIL);
            }
            int i2 = this.LLIZLLLIL;
            int iLIZLLL = (int) ((LIZLLL(i) / C0EZ3.LIZ) * i2);
            if (left >= 0) {
                if (left > i2 - iLIZLLL) {
                    return i2;
                }
                return left;
            }
        }
        return 0;
    }

    public final void LJI(List<EffectPointModel> list, boolean z) {
        this.LLILZLL.clear();
        this.LLILZLL.addAll(list);
        C373020Ejs c373020Ejs = this.LL;
        c373020Ejs.LLILZLL = this.LLILZLL;
        c373020Ejs.LLIZ = z;
        c373020Ejs.postInvalidate();
    }

    public final void LIZ(int i, String str, long j, String str2, String str3, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUuid(str);
        int i2 = (int) j;
        effectPointModel.setUiStartPoint(i2);
        effectPointModel.setUiEndPoint(i2);
        effectPointModel.setSelectedColor(i);
        effectPointModel.setFromEnd(z);
        effectPointModel.setCategory(str2);
        effectPointModel.setResourceId(str3);
        this.LLILZLL.add(effectPointModel);
        C373020Ejs c373020Ejs = this.LL;
        c373020Ejs.LLILZLL = this.LLILZLL;
        c373020Ejs.LLIZ = z;
        c373020Ejs.postInvalidate();
    }
}
