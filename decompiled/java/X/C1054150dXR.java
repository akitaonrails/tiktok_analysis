package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054150dXR extends AbstractC1054130dXP {
    public final Uri LIZ;

    @Override // X.InterfaceC1054160dXS
    public final Uri convert() {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (Intrinsics.LJFF(this.LIZ.getAuthority(), "details") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LIZ, FollowStatusChangeMethod.PARAM_UID)) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
            return AbstractC1054130dXP.LIZ(this.LIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        return null;
    }

    public C1054150dXR(Uri uri) {
        this.LIZ = uri;
    }
}
