package X;

import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0de7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058290de7 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ C1035880d3y LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1058290de7(String str, String str2, String str3, JSONObject jSONObject, C1035880d3y c1035880d3y, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = jSONObject;
        this.LLILZIL = c1035880d3y;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1023640ckE c1023640ckE) {
        String strLIZIZ;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2274561E1e.LIZ.getClass();
        c1023640ckE2.withParam(C2274561E1e.LJJLIIJ, this.LL);
        c1023640ckE2.withParam(C2274561E1e.LJJLIL, this.LLILLJJLI);
        c1023640ckE2.withParam(C2274561E1e.LJIIL, this.LLILLL);
        c1023640ckE2.withParam(C2274561E1e.LJI, C786410Ut5.J3(this.LLILZ));
        c1023640ckE2.withParam(C2274561E1e.LJIIJ, this.LLILZIL.getContainerId());
        c1023640ckE2.withParam(C2274561E1e.LJIIIZ, this.LLILZLL);
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJJI, Long.valueOf(this.LLILZIL.getRecordingModel().eventIndex.incrementAndGet()));
        c1023640ckE2.withParam(C2274561E1e.LJJLIIIJILLIZJL, Long.valueOf(System.currentTimeMillis()));
        C1002190cBd c1002190cBd = C2274561E1e.LJJLIIIJJIZ;
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) PluggableExtentionKt.pluggableSpi$default(IAdLandPageEngageInfoProvider.class, false, false, false, 14, null);
        String str = "";
        if (iAdLandPageEngageInfoProvider == null || (strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(this.LLILZIL.getRealCreativeIdStr())) == null) {
            strLIZIZ = "";
        }
        c1023640ckE2.withParam(c1002190cBd, strLIZIZ);
        C1002190cBd c1002190cBd2 = C2274561E1e.LJJIJIL;
        String currentUrlOrWebUrl = this.LLILZIL.getCurrentUrlOrWebUrl();
        if (currentUrlOrWebUrl != null) {
            str = currentUrlOrWebUrl;
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        c1023640ckE2.withParam(C2274561E1e.LJFF, "js_log_intercept");
        return Unit.LIZ;
    }
}
