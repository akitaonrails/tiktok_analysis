package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS40S2100000_16;

/* JADX INFO: renamed from: X.0dXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054200dXW implements InterfaceC1054190dXV {
    public final C1028270crh LIZ;

    public C1054200dXW(C1028270crh c1028270crh) {
        this.LIZ = c1028270crh;
    }

    @Override // X.InterfaceC1054190dXV
    public final void onFailed(String str) {
        LIZ(str, false);
    }

    @Override // X.InterfaceC1054190dXV
    public final void onSuccess(String str) {
        LIZ(str, true);
    }

    public final void LIZ(String str, boolean z) {
        C1023960ckk c1023960ckk;
        C1035880d3y c1035880d3y = this.LIZ.LIZIZ;
        if (c1035880d3y == null) {
            return;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), FollowStatusChangeMethod.PARAM_UID);
        if (z) {
            c1023960ckk = C2266081Dmo.LIZ;
        } else {
            c1023960ckk = C2266061Dmm.LIZ;
        }
        new AdWebEventLogger(c1035880d3y).logAd(c1023960ckk, c1035880d3y.getAwemeRawAd(), new AwS40S2100000_16(str, this, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 9));
    }
}
