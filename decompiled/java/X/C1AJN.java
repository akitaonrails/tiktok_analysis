package X;

import Y.ARunnableS129S0100000_29;
import Y.AfS198S0100000_29;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostFixStickerAreaSettings;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AJN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AJN<T extends Sticker> extends ConstraintLayout {
    public final T LL;
    public final boolean LLILLJJLI;
    public int[] LLILLL;
    public final InterfaceC2177361AJi LLILZ;
    public boolean LLILZIL;
    public TextView LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public final int[] LLJILJILJ;
    public final int[] LLJILLL;
    public final int[] LLJJ;
    public final Rect LLJJI;
    public final Rect LLJJIII;
    public boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C11JF LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;

    public abstract void j0();

    public abstract View n0();

    public abstract void p0(View view);

    public JSONObject getDecorationInfo() {
        JSONObject jSONObject = new JSONObject();
        T t = this.LL;
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(t.id));
            jSONObject.put("type", t.type);
            jSONObject.put("content", t.content);
            jSONObject.put("x", t.xPosition);
            jSONObject.put("y", t.yPosition);
            jSONObject.put("w", this.LLJJIJIIJIL);
            jSONObject.put("h", this.LLJJIJIL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final int getDeleteRegionVBottom() {
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        return view.getBottom();
    }

    public T getRoomDecoration() {
        if (!this.LLILLJJLI) {
            return this.LL;
        }
        T t = this.LL;
        t.screenHeight = this.LLJJIJIL;
        return t;
    }

    public final int getType() {
        return this.LL.type;
    }

    public void h0() {
        this.LLILZ.LLLLLJLJLL(this.LL);
    }

    public final boolean l0() {
        View view = this.LLJL;
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(this.LLJJ);
        View view2 = this.LLJL;
        Rect rect = this.LLJJI;
        int[] iArr = this.LLJJ;
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view2.getMeasuredWidth();
        rect.bottom = rect.top + view2.getMeasuredHeight();
        this.LLJJI.offset(0, this.LLJL.getMeasuredHeight() / 100);
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        view3.getLocationOnScreen(this.LLJILLL);
        View view4 = this.LLIZLLLIL;
        View view5 = view4 != null ? view4 : null;
        Rect rect2 = this.LLJJIII;
        int[] iArr2 = this.LLJILLL;
        int i2 = iArr2[0];
        rect2.left = i2;
        rect2.top = iArr2[1];
        rect2.right = i2 + view5.getMeasuredWidth();
        rect2.bottom = rect2.top + view5.getMeasuredHeight();
        return this.LLJJI.intersect(this.LLJJIII);
    }

    public final void reset() {
        this.LLJJL = -1.0f;
        this.LLJJJJLIIL = -1.0f;
        this.LLJJJIL = -1.0f;
        this.LLJJJ = -1.0f;
        this.LLILZIL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
    }

    public final int e0() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ayt);
        return (int) (((this.LL.yPosition - dimensionPixelSize) / (this.LLJILJILJ[1] - dimensionPixelSize)) * 100);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LLJLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final float getDownX() {
        return this.LLJZ;
    }

    public final float getDownY() {
        return this.LLJZIJLIL;
    }

    public final int getLocToRest() {
        return this.LLJLLL;
    }

    public final boolean getShowMaskOnDragging() {
        return this.LLJLLIL;
    }

    public final View getStickerView() {
        return this.LLJL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.LLILLJJLI && (i = this.LL.type) != 3 && i != 7) {
            return false;
        }
        return zDispatchTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AJN.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0235  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AJN.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void s0(boolean z) {
        if (!this.LLJLLIL) {
            return;
        }
        if (z) {
            View view = this.LLJILJIL;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            C500260Jjc.LJIILLIIL(view3);
        }
        View view4 = this.LLJIJIL;
        if (view4 == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(view4);
    }

    public final void setDownX(float f) {
        this.LLJZ = f;
    }

    public final void setDownY(float f) {
        this.LLJZIJLIL = f;
    }

    public final void setLocToRest(int i) {
        this.LLJLLL = i;
    }

    public final void setShowMaskOnDragging(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setStickerView(View view) {
        this.LLJL = view;
    }

    public final void u0(final boolean z) {
        int[] iArr = this.LLJILJILJ;
        int[] iArr2 = this.LLILLL;
        iArr[0] = iArr2[0];
        iArr[2] = iArr2[2];
        iArr[3] = iArr2[3];
        int i = this.LLJJIJIL - iArr2[1];
        View view = this.LLJ;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        View view3 = this.LLJ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.W5(view3, layoutParams);
        View view4 = this.LLJ;
        if (view4 != null) {
            view2 = view4;
        }
        view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: X.1AJQ
            public final /* synthetic */ C1AJN<T> LL;

            {
                this.LL = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view5, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Float fValueOf;
                Float fValueOf2;
                int measuredHeight;
                Float fValueOf3;
                View view6 = this.LL.LLJ;
                Float fValueOf4 = null;
                if (view6 == null) {
                    view6 = null;
                }
                view6.removeOnLayoutChangeListener(this);
                View view7 = this.LL.LLJ;
                if (view7 == null) {
                    view7 = null;
                }
                if (view7.getTop() < 0 && LiveHostFixStickerAreaSettings.enable()) {
                    C20441214yg.LIZIZ("BaseDecorationView", "bottomRegionV#onLayoutChange return");
                    return;
                }
                C1AJN<T> c1ajn = this.LL;
                int[] iArr3 = c1ajn.LLJILJILJ;
                View view8 = c1ajn.LLJ;
                if (view8 == null) {
                    view8 = null;
                }
                iArr3[1] = view8.getTop();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bottomRegionV#onLayoutChange type: ");
                sbLIZ.append(this.LL.getType());
                sbLIZ.append(", bottomRegionV.top: ");
                View view9 = this.LL.LLJ;
                if (view9 == null) {
                    view9 = null;
                }
                sbLIZ.append(view9.getTop());
                sbLIZ.append(", VALID_BOTTOM: ");
                sbLIZ.append(this.LL.LLJILJILJ[1]);
                C20441214yg.LIZIZ("BaseDecorationView", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    C1AJN<T> c1ajn2 = this.LL;
                    c1ajn2.setStickerView(c1ajn2.n0());
                    if (this.LL.getStickerView() != null) {
                        C1AJN<T> c1ajn3 = this.LL;
                        c1ajn3.addView(c1ajn3.getStickerView());
                        C1AJN<T> c1ajn4 = this.LL;
                        c1ajn4.p0(c1ajn4.getStickerView());
                        return;
                    }
                    return;
                }
                C1AJN<T> c1ajn5 = this.LL;
                if (c1ajn5.LLJL == null) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("adjustDecorationPosition type: ");
                sbLIZ2.append(c1ajn5.getType());
                sbLIZ2.append(", x: ");
                View view10 = c1ajn5.LLJL;
                if (view10 != null) {
                    fValueOf = Float.valueOf(view10.getX());
                } else {
                    fValueOf = null;
                }
                sbLIZ2.append(fValueOf);
                sbLIZ2.append(", y: ");
                View view11 = c1ajn5.LLJL;
                if (view11 != null) {
                    fValueOf2 = Float.valueOf(view11.getY());
                } else {
                    fValueOf2 = null;
                }
                sbLIZ2.append(fValueOf2);
                sbLIZ2.append(", VALID_LEFT: ");
                sbLIZ2.append(c1ajn5.LLJILJILJ[2]);
                sbLIZ2.append(", VALID_TOP: ");
                sbLIZ2.append(c1ajn5.LLJILJILJ[0]);
                sbLIZ2.append(", VALID_BOTTOM: ");
                sbLIZ2.append(c1ajn5.LLJILJILJ[1]);
                C20441214yg.LIZIZ("BaseDecorationView", C2188811AlT.LIZIZ(sbLIZ2));
                float x = c1ajn5.LLJL.getX();
                float f = c1ajn5.LLJILJILJ[2];
                if (x < f) {
                    C786410Ut5.Fd(c1ajn5.LLJL, f);
                } else {
                    if (c1ajn5.LLJL.getX() + c1ajn5.LLJL.getMeasuredWidth() > c1ajn5.LLJILJILJ[3]) {
                        C786410Ut5.Fd(c1ajn5.LLJL, r2 - r1.getMeasuredWidth());
                    }
                }
                boolean zLIZ = C342701Ur.LIZ(c1ajn5.LL);
                if ((c1ajn5 instanceof InterfaceC2177421AJo) && c1ajn5.LL.type == 4 && zLIZ) {
                    measuredHeight = ((InterfaceC2177421AJo) c1ajn5).getDecorationTextHeight();
                } else {
                    measuredHeight = c1ajn5.LLJL.getMeasuredHeight();
                }
                float y = c1ajn5.LLJL.getY();
                float f2 = c1ajn5.LLJILJILJ[0];
                if (y < f2) {
                    C786410Ut5.Ld(c1ajn5.LLJL, f2);
                } else {
                    if (c1ajn5.LLJL.getY() + measuredHeight > c1ajn5.LLJILJILJ[1]) {
                        C786410Ut5.Ld(c1ajn5.LLJL, r2 - measuredHeight);
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("after adjustDecorationPosition type: ");
                sbLIZ3.append(c1ajn5.getType());
                sbLIZ3.append(", x: ");
                View view12 = c1ajn5.LLJL;
                if (view12 != null) {
                    fValueOf3 = Float.valueOf(view12.getX());
                } else {
                    fValueOf3 = null;
                }
                sbLIZ3.append(fValueOf3);
                sbLIZ3.append(", y: ");
                View view13 = c1ajn5.LLJL;
                if (view13 != null) {
                    fValueOf4 = Float.valueOf(view13.getY());
                }
                sbLIZ3.append(fValueOf4);
                C20441214yg.LIZIZ("BaseDecorationView", C2188811AlT.LIZIZ(sbLIZ3));
            }
        });
    }

    public final void z0(boolean z) {
        View view = null;
        if (z) {
            View view2 = this.LLIZ;
            if (view2 == null) {
                view2 = null;
            }
            if (view2.getVisibility() != 0) {
                View view3 = this.LLIZ;
                if (view3 != null) {
                    view = view3;
                }
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (this instanceof C1AJJ) {
                this.LLILZ.i1();
                return;
            }
            return;
        }
        View view4 = this.LLIZ;
        if (view4 == null) {
            view4 = null;
        }
        if (view4.getVisibility() == 4) {
            return;
        }
        View view5 = this.LLIZ;
        if (view5 != null) {
            view = view5;
        }
        C786410Ut5.LJLLLLLL(4, view);
    }

    public void i0(AwS577S0100000_33 awS577S0100000_33, AwS577S0100000_33 awS577S0100000_332) {
        this.LLILZ.LLLLLJLJLL(this.LL);
    }

    public C1AJN(Context context, T t, boolean z, int[] iArr, InterfaceC2177361AJi interfaceC2177361AJi, boolean z2) {
        super(context);
        this.LL = t;
        this.LLILLJJLI = z;
        this.LLILLL = iArr;
        this.LLILZ = interfaceC2177361AJi;
        this.LLJILJILJ = new int[4];
        this.LLJILLL = new int[2];
        this.LLJJ = new int[2];
        this.LLJJI = new Rect();
        this.LLJJIII = new Rect();
        this.LLJJIJIIJIL = C12ES.LJIIJ(getContext());
        this.LLJJIJIL = C12ES.LJIIIIZZ(getContext());
        this.LLJJLIIIJLLLLLLLZ = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewGroup.inflate(context, R.layout.g49, this);
        this.LLIZ = findViewById(R.id.me7);
        this.LLIZLLLIL = findViewById(R.id.fl3);
        this.LLJ = findViewById(R.id.cg9);
        this.LLILZLL = (TextView) findViewById(R.id.fl4);
        this.LLJI = findViewById(R.id.cg8);
        this.LLJIJIL = findViewById(R.id.lvz);
        View view = this.LLJIJIL;
        if (view != null) {
            C1143680frq.LJ(view, "tiktok_live_sticker_preview_mask", "live_event_sticker_mask_bottom.png", ImageView.ScaleType.FIT_XY);
        }
        this.LLJILJIL = findViewById(R.id.lw0);
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            view2.setPaddingRelative(0, C497740JfY.LJIJ(), 0, 0);
            C1143680frq.LJ(view2, "tiktok_live_sticker_preview_mask", "live_event_sticker_mask_top.png", ImageView.ScaleType.FIT_XY);
        }
        u0(true);
        t.LIZIZ = e0();
        if (z2) {
            HandlerHook.viewPost(this, new ARunnableS129S0100000_29(this, 145));
        }
        this.LLJLL = (C11JF) C784440Upu.LIZ().LJ(C2177501AJw.class).LJJLJLI(new AfS198S0100000_29(this, 25));
        this.LLJZ = -1.0f;
        this.LLJZIJLIL = -1.0f;
    }
}
