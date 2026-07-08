package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749510vcz extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ C1749520vd0 LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749510vcz(String str, Map<String, String> map, Map<String, String> map2, C1749520vd0 c1749520vd0, Context context, Map<String, String> map3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = c1749520vd0;
        this.LLILZIL = context;
        this.LLILZLL = map3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        String str = this.LL;
        String str2 = "";
        switch (str.hashCode()) {
            case -1813214471:
                if (str.equals("add_to_contacts")) {
                    Map<String, String> map = this.LLILLJJLI;
                    String str3 = this.LLILLL.get("phone_number");
                    if (str3 == null) {
                        str3 = "";
                    }
                    map.put("phone_number", str3);
                    Map<String, String> map2 = this.LLILLJJLI;
                    String str4 = this.LLILLL.get("user_name");
                    if (str4 != null) {
                        str2 = str4;
                    }
                    map2.put("user_name", str2);
                }
                break;
            case -582536622:
                if (str.equals("copy_email")) {
                    Map<String, String> map3 = this.LLILLJJLI;
                    String str5 = this.LLILLL.get("email");
                    if (str5 == null) {
                        str5 = "";
                    }
                    map3.put("text", str5);
                    Map<String, String> map4 = this.LLILLJJLI;
                    String strLJIJI = C497740JfY.LJIJI(2131856028);
                    if (strLJIJI != null) {
                        str2 = strLJIJI;
                    }
                    map4.put("toast", str2);
                }
                break;
            case 3045982:
                if (str.equals("call")) {
                    Map<String, String> map5 = this.LLILLJJLI;
                    String str6 = this.LLILLL.get("phone_number");
                    if (str6 != null) {
                        str2 = str6;
                    }
                    map5.put("phone_number", str2);
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    Map<String, String> map6 = this.LLILLJJLI;
                    String str7 = this.LLILLL.get("email");
                    if (str7 != null) {
                        str2 = str7;
                    }
                    map6.put("email", str2);
                }
                break;
            case 1505158376:
                if (str.equals("copy_call")) {
                    Map<String, String> map7 = this.LLILLJJLI;
                    String str8 = this.LLILLL.get("phone_number");
                    if (str8 == null) {
                        str8 = "";
                    }
                    map7.put("text", str8);
                    Map<String, String> map8 = this.LLILLJJLI;
                    String strLJIJI2 = C497740JfY.LJIJI(2131856030);
                    if (strLJIJI2 != null) {
                        str2 = strLJIJI2;
                    }
                    map8.put("toast", str2);
                }
                break;
        }
        this.LLILZ.LIZIZ.invoke(this.LLILZIL, this.LLILLJJLI, EnumC1749470vcv.CONTACT_SHEET, this.LLILZLL);
        return Unit.LIZ;
    }
}
