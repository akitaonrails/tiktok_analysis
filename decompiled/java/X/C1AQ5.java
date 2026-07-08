package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQ5 extends C1AQ7 {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlin.jvm.internal.AFwS224S0000000_33] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlin.jvm.internal.AwS577S0100000_33] */
    public final void LIZJ(C1AQ6 c1aq6, Context context, CompletionBlock<C1AQ8> completionBlock) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = AFwS224S0000000_33.get$arr$(548);
        C19GO c19go = new C19GO(context);
        String title = c1aq6.getTitle();
        if (title != null) {
            c19go.LIZLLL = title;
        }
        String text = c1aq6.getText();
        if (text != null) {
            c19go.LJII = text;
        }
        Number cornerRadius = c1aq6.getCornerRadius();
        if (cornerRadius != null) {
            c19go.LJJIIZ = cornerRadius.intValue();
        }
        c19go.LJJIIJ = false;
        String rightButtonText = c1aq6.getRightButtonText();
        if (rightButtonText != null && rightButtonText.length() > 0) {
            SpannableString spannableString = new SpannableString(rightButtonText);
            String rightButtonTextColor = c1aq6.getRightButtonTextColor();
            if (rightButtonTextColor != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(ColorProtector.parseColor(rightButtonTextColor)), 0, spannableString.length(), 33);
            }
            c19go.LJFF(new DialogInterfaceOnClickListenerC2189621Amm(this, completionBlock, c259800zU, 1), spannableString, false);
        }
        String leftButtonText = c1aq6.getLeftButtonText();
        if (leftButtonText != null && leftButtonText.length() > 0) {
            SpannableString spannableString2 = new SpannableString(leftButtonText);
            String leftButtonTextColor = c1aq6.getLeftButtonTextColor();
            if (leftButtonTextColor != null) {
                C786410Ut5.p2(spannableString2, new ForegroundColorSpan(ColorProtector.parseColor(leftButtonTextColor)), 0, spannableString2.length(), 33);
            }
            c19go.LIZLLL(new DialogInterfaceOnClickListenerC2189621Amm(this, completionBlock, c259800zU, 2), spannableString2, false);
        }
        String key = c1aq6.getKey();
        if (key != null) {
            c19go.LIZJ = key;
        }
        C19GN c19gnLIZ = c19go.LIZ();
        C786410Ut5.M4(c19gnLIZ);
        c259800zU.element = new AwS577S0100000_33(c19gnLIZ, 3833);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C1AQ6 c1aq6 = (C1AQ6) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        try {
            if (Intrinsics.LJFF(c1aq6.getType(), "confirm")) {
                LIZJ(c1aq6, context, completionBlock);
            } else {
                C2382909Vj.LIZ(completionBlock, 0, "wrong type param", null, 4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StackTraceElement[] stackTrace = th.getStackTrace();
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJIIJ(stackTrace, 5);
        }
    }
}
