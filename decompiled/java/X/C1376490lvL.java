package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0lvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376490lvL extends AbstractC1376120luk {
    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        return false;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "contact_list";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return C20642515q3.LJI(2131845922);
    }

    public static void LJFF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", "contacts_list");
        c2344009Gk.LJIIIIZZ("button_name", str2);
        C20684815ws.LJIILLIIL("leave_page_click", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_contact_circle;
            return c419910GdJ.LIZ(context);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.InterfaceC1369790lkX
    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        String strLIZ = AbstractC1376120luk.LIZ(c1371420lnA);
        Bundle bundle = new Bundle();
        C259800zU c259800zU = new C259800zU();
        String str = "";
        c259800zU.element = "";
        if (c1371420lnA instanceof C1376500lvM) {
            Bundle bundle2 = ((C1376500lvM) c1371420lnA).LIZLLL;
            ?? r3 = str;
            if (bundle2 != null) {
                String string = bundle2.getString("enter_from");
                r3 = str;
                if (string != null) {
                    r3 = string;
                }
            }
            c259800zU.element = r3;
            C786410Ut5.LJJJI("enter_from", r3, bundle);
        }
        C1234690iEd.LIZIZ.LJ(context, bundle, strLIZ, C20642515q3.LJI(2131845923), new AwS422S0200000_21(this, (C1376490lvL) c259800zU, (C259800zU<String>) 112), new AwS422S0200000_21(this, (C1376490lvL) c259800zU, (C259800zU<String>) 113)).show();
        return true;
    }
}
