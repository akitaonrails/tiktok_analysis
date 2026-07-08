package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054110dXN implements InterfaceC1054160dXS {
    public final Uri LIZ;

    @Override // X.InterfaceC1054160dXS
    public final Uri convert() {
        final Uri uri = this.LIZ;
        final Uri uri2 = this.LIZ;
        Iterator it2 = C1697810uHb.LJIIJJI(new AbstractC1054130dXP(uri) { // from class: X.0dXQ
            public final Uri LIZ;

            @Override // X.InterfaceC1054160dXS
            public final Uri convert() {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                if (Intrinsics.LJFF(this.LIZ.getAuthority(), "play.google.com") && Intrinsics.LJFF(this.LIZ.getPath(), "/d") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, FollowStatusChangeMethod.PARAM_UID)) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                    return this.LIZ;
                }
                return null;
            }

            {
                this.LIZ = uri;
            }
        }, new AbstractC1054130dXP(uri2) { // from class: X.0dXO
            public final Uri LIZ;

            @Override // X.InterfaceC1054160dXS
            public final Uri convert() {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                if (Intrinsics.LJFF(this.LIZ.getAuthority(), "play.google.com") && Intrinsics.LJFF(this.LIZ.getPath(), "/store/apps/details") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, FollowStatusChangeMethod.PARAM_UID)) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                    return AbstractC1054130dXP.LIZ(this.LIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                return null;
            }

            {
                this.LIZ = uri2;
            }
        }).iterator();
        while (it2.hasNext()) {
            Uri uriConvert = ((AbstractC1054130dXP) it2.next()).convert();
            if (uriConvert != null) {
                return uriConvert;
            }
        }
        return null;
    }

    public C1054110dXN(Uri uri) {
        this.LIZ = uri;
    }
}
