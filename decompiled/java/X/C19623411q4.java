package X;

import Y.ARunnableS91S0200000_22;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS10S0000001_22;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19623411q4 extends TuxTextView implements InterfaceC19592111l1<LocationStickerModel> {
    public static final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public EnumC1466210oG3 LLJJJJ;
    public C1664680tQA<LocationStickerModel> LLJJJJJIL;
    public final C12YW LLJJJJLIIL;
    public Function1<? super String, ? extends Typeface> LLJJL;
    public EnumC993860byC LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;

    @Override // X.InterfaceC19592111l1
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC19592111l1
    public final void destroy() {
    }

    @Override // X.InterfaceC19592111l1
    public View getView() {
        return this;
    }

    private final TuxIconDrawable getStartIconDrawable() {
        return (TuxIconDrawable) this.LLJLIL.getValue();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C786410Ut5.C3(getViewTreeObserver(), this.LLJJJJLIIL);
    }

    public final void LJJJJJ(Function1<? super String, ? extends Typeface> function1) {
        Typeface typefaceInvoke;
        this.LLJJL = function1;
        if (function1 != null) {
            typefaceInvoke = function1.invoke("Neon");
        } else {
            typefaceInvoke = null;
        }
        setTypeface(typefaceInvoke);
    }

    public final void LJJJJL(Integer num) {
        boolean z;
        TuxIconDrawable startIconDrawable;
        TuxIconDrawable startIconDrawable2;
        float textSize = (getTextSize() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(22.0f)))) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
        float f = 0.0f;
        if (textSize > 1.0f) {
            textSize = 1.0f;
        } else if (textSize < 0.0f) {
            textSize = 0.0f;
        }
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) + ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * textSize)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) + ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * textSize)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        setBackground(c384050F3z.LIZ(getContext()));
        if (num != null) {
            int iIntValue = num.intValue();
            TuxIconDrawable startIconDrawable3 = getStartIconDrawable();
            if (startIconDrawable3 != null) {
                startIconDrawable3.LJFF(iIntValue);
            }
        }
        float width = ((getWidth() - getPaint().measureText(getText().toString())) - getPaddingLeft()) - getPaddingRight();
        int compoundDrawablePadding = getCompoundDrawablePadding();
        int i = LLJLILLLLZIIL;
        if (compoundDrawablePadding != i) {
            setCompoundDrawablePadding(i);
        }
        int i2 = LLJLLIL;
        float f2 = (width - (i + i2)) - 0;
        if (f2 >= 0.0f) {
            f = f2;
        }
        float f3 = f / 2.0f;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            startIconDrawable = null;
            startIconDrawable2 = getStartIconDrawable();
        } else {
            startIconDrawable = getStartIconDrawable();
            startIconDrawable2 = null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(f3);
        int i3 = -iLIZIZ;
        if (startIconDrawable != null) {
            startIconDrawable.setBounds(iLIZIZ, 0, iLIZIZ + i2, LLJLL);
        }
        if (startIconDrawable2 != null) {
            startIconDrawable2.setBounds(i3, 0, i2 + i3, LLJLL);
        }
        setCompoundDrawables(startIconDrawable, null, startIconDrawable2, null);
        if (this.LLJJLIIIJLLLLLLLZ == EnumC993860byC.CREATE) {
            float textSize2 = getTextSize();
            C1664680tQA<LocationStickerModel> c1664680tQA = this.LLJJJJJIL;
            if (c1664680tQA != null) {
                c1664680tQA.LIZLLL(new AwS10S0000001_22(textSize2, 8), true);
            }
        }
        requestLayout();
    }

    public final synchronized void LJJJJLI(EnumC1466210oG3 enumC1466210oG3) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        if (enumC1466210oG3 != null) {
            int i = C1466220oG4.LIZ[enumC1466210oG3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        getPaint().setXfermode(null);
                        TuxIconDrawable startIconDrawable = getStartIconDrawable();
                        startIconDrawable.LJIIJJI = false;
                        startIconDrawable.invalidateSelf();
                        LJJJJL(C1308910kAL.LIZJ(R.attr.a0i, getContext()));
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.oh, getContext());
                        if (numLIZJ != null) {
                            setTextColor(numLIZJ.intValue());
                        }
                        C384050F3z c384050F3z = new C384050F3z();
                        if (this.LLJL) {
                            fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(200));
                        } else {
                            fValueOf3 = Float.valueOf(LLJLLL);
                        }
                        c384050F3z.LIZJ = fValueOf3;
                        c384050F3z.LJFF = Integer.valueOf(R.attr.ee);
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
                        setBackground(c384050F3z.LIZ(getContext()));
                    }
                } else {
                    getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                    TuxIconDrawable startIconDrawable2 = getStartIconDrawable();
                    startIconDrawable2.LJIIJJI = true;
                    startIconDrawable2.invalidateSelf();
                    LJJJJL(C1308910kAL.LIZJ(R.attr.ee, getContext()));
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, getContext());
                    if (numLIZJ2 != null) {
                        setTextColor(numLIZJ2.intValue());
                    }
                    C384050F3z c384050F3z2 = new C384050F3z();
                    if (this.LLJL) {
                        fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(200));
                    } else {
                        fValueOf2 = Float.valueOf(LLJLLL);
                    }
                    c384050F3z2.LIZJ = fValueOf2;
                    c384050F3z2.LJFF = Integer.valueOf(R.attr.ee);
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
                    setBackground(c384050F3z2.LIZ(getContext()));
                }
            } else {
                getPaint().setXfermode(null);
                TuxIconDrawable startIconDrawable3 = getStartIconDrawable();
                startIconDrawable3.LJIIJJI = false;
                startIconDrawable3.invalidateSelf();
                LJJJJL(C1308910kAL.LIZJ(R.attr.ee, getContext()));
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, getContext());
                if (numLIZJ3 != null) {
                    setTextColor(numLIZJ3.intValue());
                }
                C384050F3z c384050F3z3 = new C384050F3z();
                if (this.LLJL) {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(200));
                } else {
                    fValueOf = Float.valueOf(LLJLLL);
                }
                c384050F3z3.LIZJ = fValueOf;
                c384050F3z3.LJFF = Integer.valueOf(R.attr.e8);
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.e8);
                setBackground(c384050F3z3.LIZ(getContext()));
            }
            this.LLJJJJ = enumC1466210oG3;
            invalidate();
        } else {
            this.LLJJJJ = enumC1466210oG3;
            invalidate();
        }
    }

    public C19623411q4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLJJJJLIIL = new C12YW(this, 6);
        this.LLJLIL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 75));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        setMaxLines(1);
        setTuxFont(13);
        setGravity(8388627);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxWidth((C497820Jfg.LIZIZ(getContext()) - C1919207fS.LJ()) - C1919207fS.LJIIIIZZ());
    }

    @Override // X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        LocationStickerModel locationStickerModel;
        String str;
        this.LLJJLIIIJLLLLLLLZ = EnumC993860byC.CONSUME;
        if ((stickerModel instanceof LocationStickerModel) && (locationStickerModel = (LocationStickerModel) stickerModel) != null) {
            PoiData poiData = locationStickerModel.getPoiData();
            if (poiData == null || (str = poiData.name) == null) {
                str = "";
            }
            setText(str);
            this.LLJL = locationStickerModel.getUseCapsuleStyle();
            LJJJJI(C11VU.LJII(((LocationStickerModel) stickerModel).getTextSize(), getContext()));
            HandlerHook.viewPost(this, new ARunnableS91S0200000_22(this, locationStickerModel, 30));
        }
    }
}
