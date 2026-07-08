package X;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS153S0101000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Vzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816090Vzr {
    public static final C816090Vzr LIZ = new C816090Vzr();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Shower");

    public static void LIZ() {
        Object c098200Yq;
        C844470XAv.LIZ.getClass();
        C815520Vyw c815520Vyw = new C815520Vyw(C844470XAv.LIZ());
        Iterator<Integer> it2 = C1226404r0.LIZ.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            try {
                LIZ.getClass();
                c815520Vyw.LIZIZ((iIntValue & 255) + 2000000, null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19319410i8 c19319410i8 = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Shower] cancelAll item failed strategy=");
                sbLIZ.append(iIntValue);
                sbLIZ.append(' ');
                sbLIZ.append(thM5exceptionOrNullimpl);
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LIZIZ.LJIIJJI(AFwS200S0000000_13.get$arr$(15));
    }

    public static void LIZIZ(int i) {
        Object c098200Yq;
        C844470XAv.LIZ.getClass();
        try {
            new C815520Vyw(C844470XAv.LIZ()).LIZIZ((i & 255) + 2000000, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19319410i8 c19319410i8 = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Shower] cancel by strategy failed strategy=");
            sbLIZ.append(i);
            sbLIZ.append(' ');
            sbLIZ.append(thM5exceptionOrNullimpl);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LIZJ(C816100Vzs c816100Vzs) {
        String realChannelId;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C815520Vyw c815520Vyw = new C815520Vyw(contextLIZ);
        boolean z = false;
        if (!c815520Vyw.LIZ()) {
            LIZIZ.LJIIJJI(new AwS557S0100000_13(c816100Vzs, 6));
            return false;
        }
        IPushApi iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null);
        if (iPushApi != null) {
            iPushApi.initNotificationChannel();
        }
        C0VQA.LIZ.getClass();
        String strLIZ = C0VQA.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        sbLIZ.append(C844470XAv.LJIIJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("://offline_mode");
        Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)).buildUpon();
        builderBuildUpon.appendQueryParameter("event_type", "homepage_hot");
        builderBuildUpon.appendQueryParameter("enter_method", "click_push");
        builderBuildUpon.appendQueryParameter("offline_mode_require_ug_first", "true");
        builderBuildUpon.appendQueryParameter("offline_push_strategy", String.valueOf(c816100Vzs.LIZ));
        builderBuildUpon.appendQueryParameter("offline_push_sender_uid", strLIZ);
        builderBuildUpon.appendQueryParameter("launch_method", "click_push_offline_mode");
        Intent intent = new Intent("android.intent.action.VIEW", builderBuildUpon.build());
        intent.addFlags(268435456);
        intent.setPackage(contextLIZ.getPackageName());
        PendingIntent activity = PendingIntent.getActivity(contextLIZ, c816100Vzs.LIZ, intent, 201326592);
        IPushApi iPushApi2 = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null);
        String str = "other_channel";
        if (iPushApi2 != null && (realChannelId = iPushApi2.getRealChannelId("other_channel")) != null) {
            str = realChannelId;
        }
        C813610Vvr c813610Vvr = new C813610Vvr(contextLIZ, str);
        int i = contextLIZ.getApplicationInfo().icon;
        if (i == 0) {
            i = R.drawable.stat_notify_chat;
        }
        c813610Vvr.LJJIIZI.icon = i;
        c813610Vvr.LJFF(c816100Vzs.LIZIZ);
        c813610Vvr.LJ(c816100Vzs.LIZJ);
        c813610Vvr.LJII(16, false);
        c813610Vvr.LJIIJ = 0;
        c813610Vvr.LJI = activity;
        int i2 = (c816100Vzs.LIZ & 255) + 2000000;
        try {
            c815520Vyw.LIZJ(i2, c813610Vvr.LIZIZ());
            LIZIZ.LJIIJJI(new AwS153S0101000_13(c816100Vzs, i2, 0));
            z = true;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19319410i8 c19319410i8 = LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Shower] notify failed strategy=");
            sbLIZ3.append(c816100Vzs.LIZ);
            sbLIZ3.append(' ');
            sbLIZ3.append(th);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            return z;
        }
    }
}
