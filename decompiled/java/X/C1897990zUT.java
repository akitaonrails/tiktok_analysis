package X;

import android.app.Activity;
import com.bytedance.touchpoint.api.model.FeedIncentiveToast;
import com.bytedance.touchpoint.api.model.Title;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897990zUT extends C09AY implements Function1<Long, Unit> {
    public C1897990zUT() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Activity activityLJIILL;
        int iN3;
        int i;
        l.longValue();
        C736950SvV c736950SvV = C1897980zUS.LIZ;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        FeedIncentiveToast feedIncentiveToast = (FeedIncentiveToast) C2178808gE.LIZ().LJ(35);
        if (feedIncentiveToast != null) {
            boolean z = false;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
                String str = feedIncentiveToast.tuxIconName;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    iN3 = C786410Ut5.n3(activityLJIILL.getResources(), str, "raw", activityLJIILL.getPackageName());
                    if (iN3 != 0 && iN3 != 4294967295L) {
                        z = true;
                    }
                } else {
                    iN3 = 0;
                }
                if (feedIncentiveToast.showRawIconColor) {
                    i = -1;
                } else {
                    i = R.attr.ee;
                }
                String str3 = feedIncentiveToast.type;
                if (str3 == null) {
                    str3 = "top";
                }
                String str4 = null;
                if (Intrinsics.LJFF(str3, "center")) {
                    if (z) {
                        C1389880mGw c1389880mGw = new C1389880mGw(activityLJIILL);
                        Title title = feedIncentiveToast.title;
                        if (title != null) {
                            str4 = title.text;
                        }
                        c1389880mGw.LJIIIZ(str4);
                        c1389880mGw.LJ(iN3);
                        c1389880mGw.LJI(i);
                        c1389880mGw.LIZLLL(3000L);
                        c1389880mGw.LJIIJ();
                    } else {
                        C1389880mGw c1389880mGw2 = new C1389880mGw(activityLJIILL);
                        Title title2 = feedIncentiveToast.title;
                        if (title2 != null) {
                            str4 = title2.text;
                        }
                        c1389880mGw2.LJIIIZ(str4);
                        c1389880mGw2.LIZLLL(3000L);
                        c1389880mGw2.LJIIJ();
                    }
                } else if (Intrinsics.LJFF(str3, "top")) {
                    if (z) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJIILL);
                        Title title3 = feedIncentiveToast.title;
                        if (title3 != null) {
                            str4 = title3.text;
                        }
                        c1389890mGx.LJIIJ(str4);
                        c1389890mGx.LJFF(iN3);
                        c1389890mGx.LJII(i);
                        c1389890mGx.LIZLLL(3000L);
                        c1389890mGx.LJIIJJI();
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJIILL);
                        Title title4 = feedIncentiveToast.title;
                        if (title4 != null) {
                            str4 = title4.text;
                        }
                        c1389890mGx2.LJIIJ(str4);
                        c1389890mGx2.LIZLLL(3000L);
                        c1389890mGx2.LJIIJJI();
                    }
                }
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                int i2 = feedIncentiveToast.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c1894320zOY.getClass();
                C1894320zOY.LJIJJ(i2, linkedHashMap, null, null, null, "");
                C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str5 = feedIncentiveToast.notificationId;
                if (str5 != null) {
                    str2 = str5;
                }
                linkedHashMap2.put("notification_id", str2);
                linkedHashMap2.put("classification", "feed_top_toast");
                c1894700zPALIZ.getClass();
                C15O7.LIZJ(new CallableC1849870yEr(2, linkedHashMap2));
            }
        }
        return Unit.LIZ;
    }
}
