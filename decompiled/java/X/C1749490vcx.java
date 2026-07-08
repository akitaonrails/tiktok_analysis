package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1749490vcx extends C2217421BqW implements InterfaceC1631630sYr<Context, Map<String, String>, EnumC1749470vcv, Map<String, ? extends String>, Unit> {
    public C1749490vcx(C1749450vct c1749450vct) {
        super(4, c1749450vct, C1749450vct.class, "sendEmail", "sendEmail(Landroid/content/Context;Ljava/util/Map;Lcom/bytedance/android/livesdk/comp/impl/pcs/utils/PcsContactUtil$ActionSource;Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Context context, Map<String, String> map, EnumC1749470vcv enumC1749470vcv, Map<String, ? extends String> map2) {
        Context context2 = context;
        Map<String, String> map3 = map;
        Map<String, ? extends String> map4 = map2;
        this.receiver.getClass();
        String str = map3.get("email");
        if (str == null) {
            str = "";
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(UriProtector.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        try {
            if (intent.resolveActivity(context2.getPackageManager()) != null) {
                C1749450vct.LIZ(context2, intent);
            }
            if (enumC1749470vcv == EnumC1749470vcv.CONTACT_SHEET) {
                map3.put("click_position", "send_email");
                C1749450vct.LIZLLL(map3, map4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
