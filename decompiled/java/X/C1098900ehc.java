package X;

import Y.ARunnableS117S0100000_17;
import android.graphics.Color;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveLynxBannerReverseSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewBannerFontOptSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.text.u;
import webcast.data.BannerImageBackground;
import webcast.data.BannerImageContent;

/* JADX INFO: renamed from: X.0ehc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098900ehc extends AbstractC1098620ehA {
    public static final C01GW<C603820NmG<String, Float>> LLJI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(384));
    public static float LLJIJIL = -1.0f;
    public final Function1<BannerInRoom, Unit> LL;
    public final DataChannel LLILLJJLI;
    public final C1098920ehe LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final ImageView LLILZLL;
    public final int LLIZ;
    public StaticLayout LLIZLLLIL;
    public BannerInRoom LLJ;

    @Override // X.AbstractC1098620ehA
    public final int L5() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView = this.LLILZ;
        int width = this.itemView.getWidth();
        CharSequence text = textView.getText();
        StaticLayout staticLayoutBuild = null;
        if (!(text.length() == 0)) {
            TextPaint paint = textView.getPaint();
            int paddingLeft = (width - textView.getPaddingLeft()) - textView.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            int marginStart = paddingLeft - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            int i = marginStart - ((!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) ? 0 : marginLayoutParams.rightMargin);
            if (i > 0) {
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), paint, i);
                builderObtain.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                builderObtain.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                builderObtain.setIncludePad(textView.getIncludeFontPadding());
                builderObtain.setBreakStrategy(textView.getBreakStrategy());
                builderObtain.setHyphenationFrequency(textView.getHyphenationFrequency());
                staticLayoutBuild = builderObtain.build();
            }
        }
        this.LLIZLLLIL = staticLayoutBuild;
        if (staticLayoutBuild == null) {
            return super.L5();
        }
        int lineCount = staticLayoutBuild.getLineCount();
        return lineCount != 1 ? lineCount != 2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    @Override // X.AbstractC1098620ehA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5() {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1098900ehc.T5():void");
    }

    public static float U5(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((((double) 1.055f) * Math.pow(f, 0.4166666666666667d)) - ((double) 0.055f));
    }

    public static String V5(String str) {
        try {
            if (str.length() != 8 && str.length() != 9) {
                if (str.length() == 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            if (u.LJJIIJZLJL(str, "#", false)) {
                str = C13LN.LJLJLJ(1, str);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C13LN.LL(2, str));
            sbLIZ2.append(C13LN.LJLL(2, str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('#');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "#00000000";
        }
    }

    public static float X5(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4f);
    }

    @Override // X.AbstractC1098620ehA
    public final void N5(BannerInRoom bannerInRoom) {
        String str;
        String str2;
        String str3;
        ImageModel imageModel;
        C417850GZz.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.itemView);
        BannerImageContent bannerImageContent = bannerInRoom.imageContent;
        BannerImageBackground bannerImageBackground = bannerInRoom.background;
        if (bannerImageContent == null && LiveLynxBannerReverseSetting.INSTANCE.enable()) {
            bannerImageContent = new BannerImageContent();
            bannerImageContent.title = bannerInRoom.tabTitle;
        }
        C1098920ehe c1098920ehe = this.LLILLL;
        if (bannerImageContent != null) {
            str = bannerImageContent.title;
        } else {
            str = null;
        }
        c1098920ehe.setText(str);
        TextView textView = this.LLILZ;
        if (bannerImageContent != null) {
            str2 = bannerImageContent.title;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = this.LLILZIL;
        if (bannerImageContent != null) {
            str3 = bannerImageContent.subTitle;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        W5(this.LLILLL);
        this.itemView.setBackgroundColor(this.LLIZ);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        if (bannerImageBackground != null) {
            imageModel = bannerImageBackground.activeIcon;
        } else {
            imageModel = null;
        }
        c0jbnLIZ.LJIIIZ(imageModel).LJJI(this.LLILZLL);
        this.LLIZLLLIL = null;
        this.LLJ = bannerInRoom;
    }

    @Override // X.AbstractC1098620ehA
    public final void S5(EnumC1098640ehC enumC1098640ehC) throws IllegalAccessException {
        Object c098200Yq;
        int i = C1098630ehB.LIZIZ[enumC1098640ehC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LLILLL.setSelected(false);
                W5(this.LLILLL);
                return;
            }
            throw new C1954807lC();
        }
        this.LLILLL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        C1098920ehe c1098920ehe = this.LLILLL;
        c1098920ehe.getClass();
        if (C1098920ehe.LLJL == null) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mMarqueeFadeMode");
                C1098920ehe.LLJL = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1CC2.LIZ("MarqueeTextView get mMarqueeFadeMode failed", thM5exceptionOrNullimpl);
            }
        }
        Field field = C1098920ehe.LLJL;
        if (field != null) {
            field.set(c1098920ehe, 0);
        }
        this.LLILLL.setMarqueeRepeatLimit(1);
        this.LLILLL.setMarqueeStatusChangeListener(new InterfaceC1098940ehg() { // from class: X.0ehd
            @Override // X.InterfaceC1098940ehg
            public final void LIZ(EnumC1098930ehf enumC1098930ehf) {
                C1098900ehc c1098900ehc;
                C1098920ehe c1098920ehe2;
                if (enumC1098930ehf == EnumC1098930ehf.STOPPED && (c1098920ehe2 = (c1098900ehc = this.LIZ).LLILLL) != null) {
                    HandlerHook.viewPost(c1098920ehe2, new ARunnableS117S0100000_17(c1098900ehc, 298));
                }
            }
        });
        this.LLILLL.setSelected(true);
    }

    public final void W5(C1098920ehe c1098920ehe) {
        boolean z;
        int marginStart;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLILLL.setMaxLines(1);
        this.LLILLL.setEllipsize(TextUtils.TruncateAt.END);
        if (LiveNewBannerFontOptSetting.enable()) {
            CharSequence text = c1098920ehe.getText();
            String string = null;
            if (text != null) {
                string = text.toString();
            }
            int i = 0;
            if (string != null && string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.LLILLL.setTextSize(1, 12.0f);
            } else {
                float f = c1098920ehe.getContext().getResources().getDisplayMetrics().density;
                float f2 = LLJIJIL;
                if (f != f2) {
                    if (f2 > 0.0f) {
                        LLJI.getValue().LJIIIZ(-1);
                    }
                    LLJIJIL = c1098920ehe.getContext().getResources().getDisplayMetrics().density;
                }
                Float fLIZJ = LLJI.getValue().LIZJ(string);
                if (fLIZJ != null) {
                    c1098920ehe.setTextSize(0, fLIZJ.floatValue());
                } else {
                    this.LLILLL.setTextSize(1, 12.0f);
                    int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(106.0f))) - c1098920ehe.getPaddingEnd()) - c1098920ehe.getPaddingStart();
                    ViewGroup.LayoutParams layoutParams = c1098920ehe.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        marginStart = 0;
                    }
                    int i2 = iLIZIZ - marginStart;
                    ViewGroup.LayoutParams layoutParams2 = c1098920ehe.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        i = marginLayoutParams.rightMargin;
                    }
                    int i3 = i2 - i;
                    TextPaint paint = c1098920ehe.getPaint();
                    if (paint != null) {
                        float f3 = i3;
                        if (paint.measureText(string) > f3) {
                            this.LLILLL.setTextSize(1, 11.0f);
                            if (paint.measureText(string) > f3) {
                                this.LLILLL.setTextSize(1, 12.0f);
                            }
                        }
                    }
                }
            }
        }
        if (LiveNewBannerFontOptSetting.enable() && C500260Jjc.LJJIJ(this.LLILLL.getText())) {
            LLJI.getValue().LIZLLL(this.LLILLL.getText().toString(), Float.valueOf(this.LLILLL.getTextSize()));
        }
    }

    @Override // X.AbstractC1098620ehA
    public final void P5(EnumC1098600eh8 enumC1098600eh8, float f) {
        int i = C1098630ehB.LIZ[enumC1098600eh8.ordinal()];
        if (i != 3) {
            if (i == 4) {
                if (f >= 0.5f) {
                    C500260Jjc.LLFFF(this.LLILLL);
                    C500260Jjc.LJIILIIL(this.LLILZ);
                    C500260Jjc.LJIILIIL(this.LLILZIL);
                    C1098920ehe c1098920ehe = this.LLILLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1098920ehe);
                    c1098920ehe.setAlpha((f - 0.5f) * 2);
                    return;
                }
                C500260Jjc.LLFFF(this.LLILZ);
                C500260Jjc.LLFFF(this.LLILZIL);
                C500260Jjc.LJIILIIL(this.LLILLL);
                float f2 = 1 - (f * 2);
                C786410Ut5.S4(f2, this.LLILZ);
                C786410Ut5.S4(f2, this.LLILZIL);
                return;
            }
            return;
        }
        if (f >= 0.5d) {
            C500260Jjc.LLFFF(this.LLILZ);
            C500260Jjc.LLFFF(this.LLILZIL);
            C500260Jjc.LJIILIIL(this.LLILLL);
            float f3 = (f - 0.5f) * 2;
            C786410Ut5.S4(f3, this.LLILZ);
            C786410Ut5.S4(f3, this.LLILZIL);
            return;
        }
        C500260Jjc.LLFFF(this.LLILLL);
        C500260Jjc.LJIILIIL(this.LLILZ);
        C500260Jjc.LJIILIIL(this.LLILZIL);
        C1098920ehe c1098920ehe2 = this.LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1098920ehe2);
        c1098920ehe2.setAlpha(1 - (f * 2));
    }

    @Override // X.AbstractC1098620ehA
    public final void R5(BannerInRoom bannerInRoom, EnumC1098600eh8 enumC1098600eh8) {
        String str;
        Object c098200Yq;
        int i = C1098630ehB.LIZ[enumC1098600eh8.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new C1954807lC();
                }
                C500260Jjc.LJIILIIL(this.LLILZLL);
                return;
            }
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LJIILIIL(this.LLILZIL);
            C500260Jjc.LLFFF(this.LLILLL);
            C500260Jjc.LLFFF(this.LLILZLL);
            C786410Ut5.V4(this.LLILZLL, 1.0f);
            ImageView imageView = this.LLILZLL;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C786410Ut5.W5(imageView, layoutParams);
                C500260Jjc.LLFFF(this.LLILZLL);
                this.itemView.setBackgroundColor(this.LLIZ);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        C500260Jjc.LLFFF(this.LLILZ);
        C500260Jjc.LLFFF(this.LLILZIL);
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LJIILIIL(this.LLILLL);
        ImageView imageView2 = this.LLILZLL;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.W5(imageView2, layoutParams2);
            StaticLayout staticLayout = this.LLIZLLLIL;
            int iArgb = 0;
            if (staticLayout != null) {
                int lineCount = staticLayout.getLineCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= lineCount) {
                        break;
                    }
                    if (staticLayout.getLineWidth(i2) > this.itemView.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) {
                        C786410Ut5.V4(this.LLILZLL, 0.4f);
                        break;
                    }
                    i2++;
                }
            }
            C500260Jjc.LLFFF(this.LLILZLL);
            BannerImageBackground bannerImageBackground = bannerInRoom.background;
            if (bannerImageBackground != null && (str = bannerImageBackground.backgroundColor) != null) {
                try {
                    c098200Yq = Integer.valueOf(Color.parseColor(V5(str)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num = (Integer) c098200Yq;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view = this.itemView;
                    int i3 = this.LLIZ;
                    float fAlpha = Color.alpha(iIntValue) / 255.0f;
                    float fRed = Color.red(iIntValue) / 255.0f;
                    float fGreen = Color.green(iIntValue) / 255.0f;
                    float fBlue = Color.blue(iIntValue) / 255.0f;
                    float fAlpha2 = Color.alpha(i3) / 255.0f;
                    float fRed2 = Color.red(i3) / 255.0f;
                    float fGreen2 = Color.green(i3) / 255.0f;
                    float fBlue2 = Color.blue(i3) / 255.0f;
                    float fX5 = X5(fRed);
                    float fX52 = X5(fGreen);
                    float fX53 = X5(fBlue);
                    float fX54 = X5(fRed2);
                    float fX55 = X5(fGreen2);
                    float fX56 = X5(fBlue2);
                    float f = 1.0f - fAlpha;
                    float f2 = (fAlpha2 * f) + fAlpha;
                    if (f2 >= 1.0E-5f) {
                        float f3 = 255;
                        iArgb = Color.argb((int) (f2 * f3), (int) (C13LZ.LIZLLL(U5(((fX5 * fAlpha) + ((fX54 * fAlpha2) * f)) / f2), 0.0f, 1.0f) * f3), (int) (C13LZ.LIZLLL(U5(((fX52 * fAlpha) + ((fX55 * fAlpha2) * f)) / f2), 0.0f, 1.0f) * f3), (int) (C13LZ.LIZLLL(U5(((fX53 * fAlpha) + ((fX56 * fAlpha2) * f)) / f2), 0.0f, 1.0f) * f3));
                    }
                    view.setBackgroundColor(iArgb);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1098900ehc(View view, Function1<? super BannerInRoom, Unit> function1, DataChannel dataChannel) {
        int iLIZIZ;
        super(view);
        this.LL = function1;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = (C1098920ehe) view.findViewById(R.id.zea);
        this.LLILZ = (TextView) view.findViewById(R.id.zl3);
        this.LLILZIL = (TextView) view.findViewById(R.id.zl2);
        this.LLILZLL = (ImageView) view.findViewById(R.id.brn);
        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(C500260Jjc.LJJLIIIIJ(dataChannel), null)) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ep5, C1834150xpV.LJII(view.getContext()));
        } else {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exm, C1834150xpV.LJII(view.getContext()));
        }
        this.LLIZ = iLIZIZ;
    }
}
