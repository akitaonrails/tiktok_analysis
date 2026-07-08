package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549330qQ7 extends C09AY implements InterfaceC1631620sYq<String, Boolean, String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549330qQ7(String str, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, long j) {
        super(3);
        this.LL = str;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = j;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Boolean bool, String str2) {
        boolean zBooleanValue = bool.booleanValue();
        C340370DVz c340370DVz = C340370DVz.LIZ;
        String str3 = this.LL;
        String str4 = this.LLILLJJLI.element;
        String str5 = this.LLILLL.element;
        String str6 = this.LLILZ.element;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZIL;
        c340370DVz.getClass();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gecko_channel", str3);
        linkedHashMap.put(Scene.SCENE_SERVICE, "deeplink_ug_install_campaign");
        linkedHashMap.put("access_key", str4);
        linkedHashMap.put("host", str5);
        linkedHashMap.put("path", str6);
        linkedHashMap.put("context", str);
        linkedHashMap.put("duration", Long.valueOf(jElapsedRealtime));
        linkedHashMap.put("is_success", Integer.valueOf(zBooleanValue ? 1 : 0));
        linkedHashMap.put("error_msg", C123500dV.LIZIZ(str2));
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_manual_update_gecko", linkedHashMap);
        return Unit.LIZ;
    }
}
