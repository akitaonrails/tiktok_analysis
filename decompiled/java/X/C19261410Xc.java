package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19261410Xc extends AbstractC19261210Xa {
    public static final C19261410Xc LJI = new C19261410Xc();
    public static final Map<Uri, C19261710Xf> LJII = new LinkedHashMap();

    @Override // X.InterfaceC19262510Xn
    public final void LIZ() {
        this.LIZLLL = false;
        this.LJ = null;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(this.LIZ ? 1 : 0, "is_cold_launch");
        C20684815ws.LJIILLIIL("deep_link_short2long_launch", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19262510Xn
    public final void LJFF() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("launch_method", "link_direct");
        c2344009Gk.LJIIIIZZ("c_launch_method", "deep_link_short_link_fallback");
        int i = 0;
        if (this.LIZ) {
            this.LIZ = false;
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_cold_launch");
        c2344009Gk.LJIIIIZZ("from_channel", "short_link");
        c2344009Gk.LJIIIIZZ("is_gp_large_screen", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("is_pad", String.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad()));
        C20684815ws.LJIILLIIL("launch_log", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19262510Xn
    public final void LIZLLL(boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(this.LIZ), "is_cold_launch");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_bg");
        C20684815ws.LJIILLIIL("deep_link_short2long_success", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19262510Xn
    public final void LIZIZ(Uri uri, boolean z, long j, boolean z2) {
        LJII.put(uri, new C19261710Xf(z, z2));
    }

    @Override // X.InterfaceC19262510Xn
    public final void LIZJ(Uri uri, boolean z, C19261610Xe c19261610Xe, boolean z2, long j, boolean z3) {
        this.LIZLLL = false;
        this.LJ = null;
        Map<Uri, C19261710Xf> map = LJII;
        C19261710Xf c19261710Xf = (C19261710Xf) ((LinkedHashMap) map).get(uri);
        if (c19261710Xf == null) {
            c19261710Xf = new C19261710Xf(z2, z3);
        }
        if (c19261710Xf.LIZ) {
            Uri uriLJIIIIZZ = LJIIIIZZ(uri, z, "deep_link", c19261610Xe, false, false);
            C844470XAv.LIZ.getClass();
            C19263210Xu.LIZ(C844470XAv.LIZ()).LIZJ(uriLJIIIIZZ);
        } else {
            Uri uriLJIIIIZZ2 = LJIIIIZZ(uri, z, "deep_link_short_link", c19261610Xe, true, c19261710Xf.LIZIZ);
            C844470XAv.LIZ.getClass();
            C19263210Xu.LIZ(C844470XAv.LIZ()).LIZJ(uriLJIIIIZZ2);
        }
        map.remove(uri);
    }

    public final Uri LJIIIIZZ(Uri uri, boolean z, String str, C19261610Xe c19261610Xe, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
        int i = 0;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "launch_method");
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "link_direct";
        }
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).appendQueryParameter("c_launch_method", str);
        if (this.LIZ) {
            this.LIZ = false;
            i = 1;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_cold_launch", String.valueOf(i)).appendQueryParameter("is_from_noti", String.valueOf(z)).appendQueryParameter("needlaunchlog", "true");
        if (c19261610Xe != null) {
            builderAppendQueryParameter2.appendQueryParameter("page_source", c19261610Xe.LIZIZ);
            builderAppendQueryParameter2.appendQueryParameter("enter_to", c19261610Xe.LIZJ);
            builderAppendQueryParameter2.appendQueryParameter("platform", c19261610Xe.LIZLLL);
            builderAppendQueryParameter2.appendQueryParameter("from_user_id", c19261610Xe.LJ);
            if (C123100dR.LIZ(c19261610Xe.LJI)) {
                builderAppendQueryParameter2.appendQueryParameter("link_id", c19261610Xe.LJI);
            }
            if (C123100dR.LIZ(c19261610Xe.LJII)) {
                builderAppendQueryParameter2.appendQueryParameter("referrer_url", c19261610Xe.LJII);
            }
            if (C123100dR.LIZ(c19261610Xe.LJIIIIZZ)) {
                builderAppendQueryParameter2.appendQueryParameter("params_url", c19261610Xe.LJIIIIZZ);
            }
            if (C123100dR.LIZ(c19261610Xe.LJFF)) {
                builderAppendQueryParameter2.appendQueryParameter("to_user_id", c19261610Xe.LJFF);
            }
        }
        if (z2) {
            if (z3) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            builderAppendQueryParameter2.appendQueryParameter("c_short_link_is_bg", str2);
        }
        return builderAppendQueryParameter2.build();
    }
}
