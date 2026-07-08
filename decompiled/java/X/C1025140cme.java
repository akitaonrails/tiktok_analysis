package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0cme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025140cme {
    public static final C1025140cme LIZ = new C1025140cme();

    public static List LIZIZ(Context context) throws Throwable {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse("http://"));
        List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+LUXPzG9Qwc=", null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
        Iterator it2 = listLJJJJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    public static List LIZ(Context context, Uri uri) throws Throwable {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+LUXPzG9Qwc=", null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
        Iterator it2 = listLJJJJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
        }
        return arrayList;
    }

    public static final boolean LIZJ(Context context, Uri uri) {
        if (context != null && uri != null && AbstractC1025070cmX.LJIIL(uri)) {
            LIZ.getClass();
            return !C13LP.LJLLLLLL(LIZ(context, uri), LIZIZ(context)).isEmpty();
        }
        return false;
    }

    public static final boolean LIZLLL(Context context, Uri uri) {
        if (context != null && uri != null && !AbstractC1025070cmX.LJIIL(uri)) {
            LIZ.getClass();
            return !((ArrayList) LIZ(context, uri)).isEmpty();
        }
        return false;
    }

    public static final boolean LJ(Context context, Uri uri) {
        if (context == null || uri == null || !LIZJ(context, uri)) {
            return false;
        }
        LIZ.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        Set setLJLLLLLL = C13LP.LJLLLLLL(LIZ(context, uri), LIZIZ(context));
        if (!setLJLLLLLL.isEmpty()) {
            intent.setPackage((String) ListProtector.get(C13LP.LLIIII(setLJLLLLLL), 0));
            intent.addFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
            return AbstractC1025070cmX.LJJIIZ(context, intent);
        }
        return false;
    }

    public static final void LJI(Context context, Uri uri) throws Throwable {
        if (context == null || uri == null || !LIZLLL(context, uri)) {
            return;
        }
        LIZ.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List listLIZ = LIZ(context, uri);
        if ((!((ArrayList) listLIZ).isEmpty()) && listLIZ != null) {
            intent.setPackage((String) ListProtector.get(C13LP.LLIIII(listLIZ), 0));
            intent.addFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
            AbstractC1025070cmX.LJJIIZ(context, intent);
        }
    }

    public static final void LJFF(Context context, final AwemeRawAd awemeRawAd, final String str, final boolean z, final String str2) {
        if (C294500BgW.LIZ()) {
            C1034340d1U.LIZLLL.LIZ().LIZ("draw_ad", new C1029220ctE(awemeRawAd, CardStruct.IStatusCode.DEFAULT, null, null), null, str, context);
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str2, "open_url_app", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str, "app_url");
        c1022820ciuLIZLLL.LJIIIIZZ();
        AbstractC1025070cmX.LJJIII(new InterfaceC1027210cpz() { // from class: X.0cmf
            @Override // X.InterfaceC1027210cpz
            public final void LIZ(boolean z2) {
                if (z2) {
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(str2, "deeplink_success", awemeRawAd);
                    c1022820ciuLIZLLL2.LIZIZ(str, "app_url");
                    c1022820ciuLIZLLL2.LJIIIIZZ();
                } else {
                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL(str2, "deeplink_failed", awemeRawAd);
                    c1022820ciuLIZLLL3.LIZIZ(str, "app_url");
                    c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(!z ? 1 : 0), "fail_reason");
                    c1022820ciuLIZLLL3.LJIIIIZZ();
                }
            }
        });
        AbstractC1025070cmX.LJJIIJ(new InterfaceC1027210cpz() { // from class: X.0cmg
            @Override // X.InterfaceC1027210cpz
            public final void LIZ(boolean z2) {
                if (z2) {
                    C2184171Adz.LIZLLL(str2, "deeplink_opened", awemeRawAd).LJII();
                }
            }
        });
    }
}
