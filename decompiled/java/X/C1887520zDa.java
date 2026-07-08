package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Window;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0zDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887520zDa extends AbstractC1887540zDc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        EnumC1887530zDb enumC1887530zDbValueOf;
        Window window;
        boolean z;
        Window window2;
        InterfaceC1887510zDZ interfaceC1887510zDZ = (InterfaceC1887510zDZ) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        Activity activityLIZ = C0XS4.LIZ(context);
        String style = interfaceC1887510zDZ.getStyle();
        boolean visible = interfaceC1887510zDZ.getVisible();
        try {
            EnumC1887530zDb.Companion.getClass();
            if (style != null) {
                try {
                    enumC1887530zDbValueOf = EnumC1887530zDb.valueOf(style.toUpperCase(Locale.US));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    enumC1887530zDbValueOf = EnumC1887530zDb.UNKNOWN;
                }
            } else {
                enumC1887530zDbValueOf = EnumC1887530zDb.UNKNOWN;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (enumC1887530zDbValueOf == EnumC1887530zDb.UNKNOWN) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StatusBar style can only be dark or light,  style: ");
            sbLIZ.append(enumC1887530zDbValueOf);
            C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        if (activityLIZ == null) {
            window = null;
        } else {
            window = activityLIZ.getWindow();
        }
        if (enumC1887530zDbValueOf == EnumC1887530zDb.DARK) {
            z = true;
        } else {
            z = false;
        }
        C483510Ixh.LJ(activityLIZ, window, z);
        if (visible) {
            if (activityLIZ != null && (window2 = activityLIZ.getWindow()) != null) {
                window2.clearFlags(1024);
            }
        } else {
            C483510Ixh.LIZIZ(activityLIZ);
        }
        String backgroundColor = interfaceC1887510zDZ.getBackgroundColor();
        if (activityLIZ != null && backgroundColor != null && backgroundColor.length() != 0 && backgroundColor.length() == 9) {
            String strSubstring = backgroundColor.substring(7, 9);
            Locale locale = Locale.ROOT;
            String upperCase = strSubstring.toUpperCase(locale);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('#');
            sbLIZ3.append(upperCase);
            sbLIZ2.append(C2188811AlT.LIZIZ(sbLIZ3));
            sbLIZ2.append(backgroundColor.subSequence(1, 7).toString().toUpperCase(locale));
            C483510Ixh.LIZLLL(Color.parseColor(C2188811AlT.LIZIZ(sbLIZ2)), activityLIZ);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1887550zDd.class, null), "");
    }
}
