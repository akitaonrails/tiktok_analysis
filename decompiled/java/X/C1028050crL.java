package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0crL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028050crL {
    public static final C1028050crL LIZ = new C1028050crL();

    public static void LIZ(final String str) {
        int readHoldCount;
        int readHoldCount2;
        int i = 0;
        if (str != null && str.length() != 0) {
            ReentrantReadWriteLock reentrantReadWriteLock = C1028190crZ.LIZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C1028190crZ.LIZIZ.clear();
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.lock();
                }
                writeLock.unlock();
                final int i4 = 0;
                Object obj = new Object(str, i4) { // from class: X.0crN
                };
                ReentrantReadWriteLock reentrantReadWriteLock2 = C1028190crZ.LIZ;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                    readHoldCount2 = reentrantReadWriteLock2.getReadHoldCount();
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.unlock();
                    }
                } else {
                    readHoldCount2 = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    C1028190crZ.LIZIZ.add((C1028070crN) obj);
                    while (true) {
                        LinkedList<C1028070crN> linkedList = C1028190crZ.LIZIZ;
                        if (linkedList.size() <= 10) {
                            break;
                        } else {
                            linkedList.removeFirst();
                        }
                    }
                    while (i < readHoldCount2) {
                        lock2.lock();
                        i++;
                    }
                    writeLock2.unlock();
                } finally {
                }
            } finally {
            }
        }
    }

    public static final boolean LIZIZ(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C1028060crM c1028060crM, Integer num) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            C0XI4 c0xi4 = new C0XI4(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c0xi4.LJ(entry.getKey(), entry.getValue());
            }
            str = c0xi4.LJFF();
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        C2429209fW.LIZ().appendDataFlowId(intent, "402657282");
        intent.setData(UriProtector.parse(str));
        Uri data = intent.getData();
        Integer numValueOf = null;
        if (data != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "launch_mode");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (c1028060crM != null) {
            if (!TextUtils.isEmpty(c1028060crM.LIZIZ)) {
                intent.putExtra("bundle_download_app_log_extra", c1028060crM.LIZIZ);
            }
            Long l = c1028060crM.LIZ;
            if (l == null || l.longValue() != 0) {
                intent.putExtra("ad_id", c1028060crM.LIZ);
                intent.putExtra("refer", C1026350cob.LIZLLL(num));
                intent.putExtra("ad_type", c1028060crM.LJFF);
                intent.putExtra("ad_system_origin", c1028060crM.LJI);
                intent.putExtra("aweme_creative_id", String.valueOf(c1028060crM.LIZ));
            }
            String strLIZ = SharePrefCache.inst().getJsActlogUrl().LIZ();
            if (!TextUtils.isEmpty(strLIZ)) {
                intent.putExtra("ad_js_url", strLIZ);
            }
            if (!TextUtils.isEmpty(c1028060crM.LIZJ)) {
                intent.putExtra("bundle_download_url", c1028060crM.LIZJ);
                intent.putExtra("aweme_package_name", c1028060crM.LIZLLL);
                intent.putExtra("bundle_download_app_name", c1028060crM.LJ);
                intent.putExtra("bundle_app_ad_from", c1028060crM.LJII);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str3 = map.get("aweme_package_name");
                    String str4 = map.get("bundle_app_ad_from");
                    if (str4 != null) {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str4));
                    }
                    intent.putExtra("bundle_app_ad_from", numValueOf);
                    intent.putExtra("aweme_package_name", str3);
                    if (numValueOf != null && numValueOf.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        LIZ.getClass();
        LIZ(str);
        return AbstractC1025070cmX.LJJIIZ(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(android.content.Context r33, com.ss.android.ugc.aweme.feed.model.Aweme r34, java.lang.String r35, java.lang.String r36, boolean r37, int r38, java.lang.Boolean r39, java.lang.Integer r40) {
        /*
            Method dump skipped, instruction units count: 2189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028050crL.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, int, java.lang.Boolean, java.lang.Integer):boolean");
    }
}
