package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS456S0200000_21;

/* JADX INFO: renamed from: X.0lq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373190lq1 {
    public static void LIZJ(Context context, Aweme aweme, String str, String str2) {
        String logExtra;
        Long adId;
        C1260870iur c1260870iur = new C1260870iur();
        c1260870iur.LJIIJ(new C1373260lq8());
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = aweme.getAid();
        c1387280mCk.LIZIZ = 1;
        c1387280mCk.LJ = 0;
        c1387280mCk.LJI = 1;
        c1387280mCk.LJII = str;
        if (AwemeExtKt.isMonetizationTraffic(aweme)) {
            AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
            Long creativeId = null;
            if (monetizationData != null) {
                logExtra = monetizationData.getLogExtra();
            } else {
                logExtra = null;
            }
            AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData2 != null) {
                adId = monetizationData2.getAdId();
            } else {
                adId = null;
            }
            String strValueOf = String.valueOf(adId);
            AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData3 != null) {
                creativeId = monetizationData3.getCreativeId();
            }
            C735080SsU.LIZIZ(context, logExtra, strValueOf, String.valueOf(creativeId), c1387280mCk);
        } else if (str2 != null) {
            c1387280mCk.LJJIJ = str2;
        }
        c1260870iur.LIZJ(c1387280mCk.LIZ());
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJJIJLIJ(1, aweme);
    }

    public static void LIZ(Aweme aweme, C1371600lnS c1371600lnS, AwemeSharePackage awemeSharePackage, Activity activity, boolean z, ArrayList arrayList) {
        String str;
        awemeSharePackage.extras.getString("panel_source");
        c1371600lnS.LJJIIJZLJL = true;
        c1371600lnS.LJJIII = R.string.f1_;
        c1371600lnS.LJIIZILJ = true;
        C1374530lsB c1374530lsB = C1374530lsB.LIZ;
        BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
        if (baseSharePackage == null || (str = baseSharePackage.itemType) == null) {
            str = "";
        }
        c1374530lsB.getClass();
        c1371600lnS.LJFF(new C1372180loO(str, 8));
        c1371600lnS.LJIL = new AwS456S0200000_21(aweme, awemeSharePackage, 19);
        c1371600lnS.LJJJI = !z;
        List listLIZJ = C1374530lsB.LIZJ(aweme, C1374530lsB.LIZLLL(activity), arrayList, null);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        Iterator it2 = ((ArrayList) listLIZJ).iterator();
        while (it2.hasNext()) {
            c1371600lnS.LIZ.add((InterfaceC1369790lkX) it2.next());
            arrayList2.add(c1371600lnS);
        }
    }
}
