package X;

import Y.AfS139S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KFK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFK {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(296));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(295));

    public final MutableLiveData LIZ(String str, Function1 function1) {
        this.LIZIZ.getValue().getClass();
        MutableLiveData mutableLiveData = new MutableLiveData();
        C11NZ userInfo = C0KLQ.LIZ().getUserInfo(str);
        if (userInfo != null) {
            C0JCK.LIZ(userInfo, EnumC499440JiI.GENERAL, C0KF4.class.getSimpleName(), "sub/user/info", null, 8).LJIILIIL(new C0UJ2()).LJJLL(new AfS139S0200000_3((Object) mutableLiveData, (Context) function1, (Function1<? super Drawable, Unit>) 5), new C09JN() { // from class: X.00PA
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SubPackageInfoService@c8d9.fetchSubUserInfo$2");
                    C1C7U.LIZIZ("SubPackageInfoService@c8d9.fetchSubUserInfo$2");
                }
            });
        }
        return mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r21, com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo r22, java.lang.String r23, java.lang.String r24, X.C0KLW r25, java.util.Map r26, java.lang.String r27, boolean r28, X.EnumC513400KBm r29, boolean r30, java.util.List r31, X.C0KOJ r32, java.util.Map r33) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KFK.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo, java.lang.String, java.lang.String, X.0KLW, java.util.Map, java.lang.String, boolean, X.0KBm, boolean, java.util.List, X.0KOJ, java.util.Map):void");
    }
}
