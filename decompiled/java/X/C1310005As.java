package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1310005As extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C056Y LL;
    public final /* synthetic */ EnumC12978056a LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310005As(C056Y c056y, EnumC12978056a enumC12978056a, Context context, String str, String str2, String str3, C05P0<Boolean> c05p0) {
        super(0);
        this.LL = c056y;
        this.LLILLJJLI = enumC12978056a;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C056X c056x = C056X.LIZ;
        C056Y c056y = this.LL;
        EnumC12978056a enumC12978056a = this.LLILLJJLI;
        c056x.getClass();
        InterfaceC1411705fn interfaceC1411705fnLIZIZ = C056X.LIZIZ(c056y, enumC12978056a);
        if (interfaceC1411705fnLIZIZ != null) {
            int i = 0;
            do {
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                long jLIZIZ = iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis();
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                interfaceC1411705fnLIZIZ.LIZLLL(jLIZIZ, iMHostApi2 != null ? iMHostApi2.LIZIZ() : System.currentTimeMillis(), "");
                i++;
            } while (i < 2);
        }
        this.LLIZ.setValue(Boolean.TRUE);
        C20303114cP.LJIIJJI(this.LLILLL);
        C1495805tM c1495805tM = C1495805tM.LIZ;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        EnumC12978056a enumC12978056a2 = this.LLILLJJLI;
        c1495805tM.getClass();
        Map mapLIZ = C1495805tM.LIZ(str, str2, str3, enumC12978056a2);
        mapLIZ.put("button_type", "open_settings");
        C1495805tM.LJ("ttsocial_alert_tones_settings_banner_click", mapLIZ);
        return Unit.LIZ;
    }
}
