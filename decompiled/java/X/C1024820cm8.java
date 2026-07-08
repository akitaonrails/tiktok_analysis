package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024820cm8 extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1024820cm8(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public static List LJJIIZ(Context context, Uri uri) throws Throwable {
        List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), new Intent("android.intent.action.VIEW", uri), 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMvGT9gDuJH85w21xZuO39P1kKhvx8dDQhgy1Q+6OJtjrc", null));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
        Iterator it2 = listLJJJJZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
        }
        return C13LP.LLIIII(arrayList);
    }

    public static void LJJIIZI(C1024820cm8 c1024820cm8, int i) {
        String strLIZIZ = C1026350cob.LIZIZ(i);
        String strLIZ = C1026350cob.LIZ(i);
        new C1023500ck0() { // from class: X.0cmC
        }.getClass();
        c1024820cm8.logAd(C1023500ck0.LIZJ(strLIZIZ, "open_minicard", strLIZ, new InterfaceC1023650ckF[0]));
    }

    public final void LJJIJ(int i, String str, String str2, String str3, boolean z) {
        boolean z2;
        Uri uri = UriProtector.parse(str);
        C844470XAv.LIZ.getClass();
        boolean z3 = !C13LP.LJLLLLLL(LJJIIZ(C844470XAv.LIZ(), uri), C13LP.LLIIJI(LJJIIZ(C844470XAv.LIZ(), UriProtector.parse("http://")))).isEmpty();
        if (C13LQ.LJJIJIIJI(UriProtector.parse(str).getScheme(), new String[]{"http", "https", "android-app"}) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1024850cmB c1024850cmB = new C1023500ck0() { // from class: X.0cmB
        };
        C1024840cmA.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(str2, "deeplink_app_invoked", str3, new InterfaceC1023650ckF[]{c1024850cmB.LJI(C1024840cmA.LIZIZ, C1024840cmA.LIZJ, C1024840cmA.LIZLLL, C1024840cmA.LJ, C1024840cmA.LJFF)}), new C1024830cm9(str, i, this, z, z3, z2));
    }
}
