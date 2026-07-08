package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1Bl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214061Bl6 extends AbstractC2214081Bl8 {
    public static int LIZJ(Context context, Context context2) {
        boolean z;
        if (context == null) {
            context = context2;
        }
        int i = 0;
        if (context.getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        int i2 = C2133008Xg.LIZIZ;
        if (i2 <= 0) {
            C2133008Xg.LIZ(context);
            i2 = C2133008Xg.LIZIZ;
            if (i2 <= 0) {
                i2 = 0;
            }
        }
        int iLIZLLL = LIZLLL(i2, context);
        int i3 = C2133008Xg.LIZ;
        if (i3 <= 0) {
            C2133008Xg.LIZ(context);
            int i4 = C2133008Xg.LIZ;
            if (i4 > 0) {
                i = i4;
            }
            i3 = i;
        }
        int iLIZLLL2 = LIZLLL(i3, context);
        if (z) {
            return Math.min(iLIZLLL, iLIZLLL2);
        }
        return Math.max(iLIZLLL, iLIZLLL2);
    }

    public static int LIZLLL(double d, Context context) {
        return (int) ((d / ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r18, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r19, X.EnumC1063300dmC r20) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2214061Bl6.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
