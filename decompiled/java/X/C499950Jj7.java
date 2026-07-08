package X;

import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0Jj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499950Jj7 {
    public final C495520Jby LIZ;
    public final C495520Jby LIZIZ = new C495520Jby();
    public float LIZJ;

    public final Uri LIZ() {
        if (this.LIZJ != 0.0f) {
            this.LIZ.LIZ((int) C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * this.LIZJ)), "height");
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            this.LIZ.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId(), "enter_appid");
        }
        Uri uri = UriProtector.parse(this.LIZ.LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (!C500260Jjc.LJJIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return uri;
        }
        C495520Jby c495520Jby = this.LIZIZ;
        c495520Jby.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        return C500260Jjc.LJJL(uri, "url", c495520Jby.LIZLLL());
    }

    public C499950Jj7(String str) {
        this.LIZ = new C495520Jby(str);
    }
}
