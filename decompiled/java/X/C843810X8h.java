package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.partnership.ClickAttributionResponse;

/* JADX INFO: renamed from: X.0X8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.utils.GameAttributionReportHelper$reportS2SInternal$2", f = "GameAttributionReportHelper.kt", l = {}, m = "invokeSuspend")
public final class C843810X8h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC420801kM>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, ClickAttributionResponse.ResponseData, String, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843810X8h(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C843810X8h(this.LL, this.LLILZLL, this.LLIZ, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn, this.LLJI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C1C7U.LIZ("GameAttributionReportHelper@2972.reportS2SInternal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 0) {
            z = true;
        } else {
            z = false;
        }
        GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) C843880X8o.LIZJ.getValue();
        int i = this.LL;
        String str2 = null;
        if (!z) {
            str = this.LLILLJJLI;
        } else {
            str = null;
            str2 = this.LLILLJJLI;
        }
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        String str5 = (String) C843880X8o.LJ.getValue();
        String str6 = (String) C843880X8o.LIZLLL.getValue();
        String str7 = this.LLILZIL;
        int i2 = this.LLILZLL;
        int i3 = this.LLIZ;
        String str8 = this.LLIZLLLIL;
        String str9 = this.LLJ;
        if (str9 == null) {
            str9 = "";
        }
        C19488711Mn c19488711MnLJJLIIIJJIZ = gameLivePartnershipRetrofitApi.clickAttributionReport(i, str, str2, str3, str4, str5, str6, str7, i2, i3, str8, str9).LJJLIIIJJIZ(3L);
        final String str10 = this.LLILLJJLI;
        final InterfaceC1631620sYq<Boolean, ClickAttributionResponse.ResponseData, String, Unit> interfaceC1631620sYq = this.LLJI;
        InterfaceC420801kM interfaceC420801kMLJJLL = c19488711MnLJJLIIIJJIZ.LJJLL(new C09JN() { // from class: X.0X8g
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("GameAttributionReportHelper@2972.reportS2SInternal$2$1");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[reportS2SInternal] ");
                sbLIZ.append(str10);
                sbLIZ.append(" report attribution by S2S success");
                C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ));
                interfaceC1631620sYq.invoke(Boolean.TRUE, (ClickAttributionResponse.ResponseData) ((BaseResponse) obj2).data, "");
                C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportS2SInternal$2$1");
            }
        }, new C09JN() { // from class: X.0X8f
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("GameAttributionReportHelper@2972.reportS2SInternal$2$2");
                Throwable th = (Throwable) obj2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[reportS2SInternal] ");
                sbLIZ.append(str10);
                sbLIZ.append(" report attribution by S2S failed: ");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1631620sYq<Boolean, ClickAttributionResponse.ResponseData, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                Boolean bool = Boolean.FALSE;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("exception: ");
                sbLIZ2.append(th.getMessage());
                interfaceC1631620sYq2.invoke(bool, null, C2188811AlT.LIZIZ(sbLIZ2));
                C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportS2SInternal$2$2");
            }
        });
        C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportS2SInternal$2");
        return interfaceC420801kMLJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC420801kM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
