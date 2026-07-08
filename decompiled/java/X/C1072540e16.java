package X;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0e16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072540e16 extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LIZJ;
    }

    public /* synthetic */ C1072540e16(String str, String str2, String str3, EnumC1070410dxf enumC1070410dxf, String str4) {
        this(str, str2, "", str3, enumC1070410dxf, str4, -1);
    }

    public C1072540e16(String str, String str2, String str3, String str4, EnumC1070410dxf enumC1070410dxf, String str5, int i) {
        this.LIZIZ = "find_friends";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str4);
        c2344009Gk.LJIIIIZZ("homepage_uid", str3);
        c2344009Gk.LJIIIIZZ("platform", enumC1070410dxf.name().toLowerCase(Locale.ENGLISH));
        c2344009Gk.LJIIIIZZ("position", str5);
        c2344009Gk.LJIIIIZZ("did_status", C1071810dzv.LIZ(enumC1070410dxf));
        c2344009Gk.LJIIIIZZ("uid_status", "off");
        if (i >= 0) {
            c2344009Gk.LJFF("to_user_id_follower_cnt", String.valueOf(i));
        }
        this.LIZJ = c2344009Gk.LIZ;
    }
}
