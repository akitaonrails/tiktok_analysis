package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047200dME {
    public static final /* synthetic */ int LIZ = 0;

    public static final Uri LIZ(String str) {
        InterfaceC1047240dMI interfaceC1047240dMI = (InterfaceC1047240dMI) C20113813my.LIZIZ().LIZIZ(InterfaceC1047240dMI.class);
        if (interfaceC1047240dMI != null) {
            UriProtector.parse(str);
            new Bundle();
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Object() { // from class: X.0dMJ
            });
            arrayList.add(new Object() { // from class: X.0dMK
            });
            Uri uriConvert = interfaceC1047240dMI.convert();
            if (uriConvert != null) {
                return uriConvert;
            }
        }
        C1047210dMF c1047210dMF = new C1047210dMF();
        C1041700dDM c1041700dDM = c1047210dMF.LIZIZ;
        Object objLIZIZ = c1047210dMF.LIZ;
        Iterator<InterfaceC1041910dDh<?>> it2 = c1041700dDM.LIZ().iterator();
        while (it2.hasNext()) {
            objLIZIZ = it2.next().LIZIZ(Uri.Builder.class, objLIZIZ);
        }
        return ((Uri.Builder) objLIZIZ).build();
    }

    public static final Uri LIZIZ(Uri uri, String str) {
        if (uri == null || TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str))) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str2, str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str2).iterator();
                while (it2.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it2.next());
                }
            }
        }
        return builderBuildUpon.build();
    }
}
