package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.11WP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11WP extends C11WM {
    public String LJIILJJIL;

    public C11WP() {
        super(false);
        this.LJIILJJIL = "";
    }

    @Override // X.C11WM, X.C11WS
    public final void LIZ(Map<String, String> map) {
        super.LIZ(map);
        String str = map.get("type");
        if (str == null) {
            str = "-1";
        }
        this.LJ = CastIntegerProtector.parseInt(str);
        String str2 = map.get("subtype");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        this.LJFF = str2;
        String str4 = map.get("add_button_url_regex");
        if (str4 != null) {
            str3 = str4;
        }
        this.LJIILJJIL = str3;
    }
}
