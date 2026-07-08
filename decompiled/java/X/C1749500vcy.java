package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1749500vcy extends C2217421BqW implements InterfaceC1631630sYr<Context, Map<String, String>, EnumC1749470vcv, Map<String, ? extends String>, Unit> {
    public C1749500vcy(C1749450vct c1749450vct) {
        super(4, c1749450vct, C1749450vct.class, "addToContacts", "addToContacts(Landroid/content/Context;Ljava/util/Map;Lcom/bytedance/android/livesdk/comp/impl/pcs/utils/PcsContactUtil$ActionSource;Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Context context, Map<String, String> map, EnumC1749470vcv enumC1749470vcv, Map<String, ? extends String> map2) {
        Context context2 = context;
        Map<String, String> map3 = map;
        Map<String, ? extends String> map4 = map2;
        this.receiver.getClass();
        String str = map3.get("user_name");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = map3.get("phone_number");
        if (str3 != null) {
            str2 = str3;
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("name", str);
        intent.putExtra("phone", str2);
        intent.putExtra("phone_type", 2);
        try {
            if (intent.resolveActivity(context2.getPackageManager()) != null) {
                C1749450vct.LIZ(context2, intent);
            }
            if (enumC1749470vcv == EnumC1749470vcv.CONTACT_SHEET) {
                map3.put("click_position", "add_to_contacts");
                C1749450vct.LIZLLL(map3, map4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
