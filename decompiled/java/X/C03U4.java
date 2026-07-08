package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastPosition;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS52S1000000_1;

/* JADX INFO: renamed from: X.03U4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03U4 {
    public static final C03U4 LIZ = new C03U4();

    public static void LIZJ(View view, ExceptionUX exceptionUX) {
        Integer num;
        ToastContent toastContent = exceptionUX.toastContent;
        if (toastContent != null) {
            String str = toastContent.daInfo;
            if (str != null) {
                C1748720vbi.LIZLLL(view, new AnonymousClass0481(), new AwS52S1000000_1(str, 30));
            }
            ToastContent toastContent2 = exceptionUX.toastContent;
            String str2 = null;
            if (toastContent2 != null) {
                num = toastContent2.position;
            } else {
                num = null;
            }
            int value = ToastPosition.TOP.getValue();
            if (num != null && num.intValue() == value) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                ToastContent toastContent3 = exceptionUX.toastContent;
                if (toastContent3 != null) {
                    str2 = toastContent3.message;
                }
                c1389890mGx.LJIIJ(str2);
                c1389890mGx.LJIIJJI();
                return;
            }
            int value2 = ToastPosition.CENTER.getValue();
            if (num != null && num.intValue() == value2) {
                C1389880mGw c1389880mGw = new C1389880mGw(view);
                ToastContent toastContent4 = exceptionUX.toastContent;
                if (toastContent4 != null) {
                    str2 = toastContent4.message;
                }
                c1389880mGw.LJIIIZ(str2);
                c1389880mGw.LJIIJ();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            ToastContent toastContent5 = exceptionUX.toastContent;
            if (toastContent5 != null) {
                str2 = toastContent5.message;
            }
            c1389890mGx2.LJIIJ(str2);
            c1389890mGx2.LJIIJJI();
        }
    }

    public static void LIZLLL(View view, Function0 function0) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131848087);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.view.View r12, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r13, kotlin.jvm.functions.Function0 r14, final kotlin.jvm.functions.Function0 r15, kotlin.jvm.internal.AwS580S0100000_1 r16, kotlin.jvm.functions.Function1 r17) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03U4.LIZ(android.view.View, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.internal.AwS580S0100000_1, kotlin.jvm.functions.Function1):void");
    }
}
