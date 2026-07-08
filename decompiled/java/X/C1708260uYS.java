package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708260uYS extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1708220uYO LL;
    public final /* synthetic */ C1708320uYY LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1708270uYT LLILZIL;
    public final /* synthetic */ C1708990uZd LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708260uYS(Context context, C1708990uZd c1708990uZd, InterfaceC1708270uYT interfaceC1708270uYT, C1708220uYO c1708220uYO, C1708320uYY c1708320uYY, String str) {
        super(1);
        this.LL = c1708220uYO;
        this.LLILLJJLI = c1708320uYY;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = interfaceC1708270uYT;
        this.LLILZLL = c1708990uZd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) throws JSONException {
        if (str != null) {
            C1708320uYY c1708320uYY = this.LLILLJJLI;
            C1708220uYO c1708220uYO = this.LL;
            Context context = this.LLILLL;
            String str2 = this.LLILZ;
            InterfaceC1708270uYT interfaceC1708270uYT = this.LLILZIL;
            C1708990uZd c1708990uZd = this.LLILZLL;
            JSONObject jSONObject = c1708320uYY.LIZIZ;
            if (jSONObject != null) {
                jSONObject.put("verify_request_id", str);
            }
            c1708220uYO.LIZLLL(context, str2, c1708320uYY, interfaceC1708270uYT, c1708990uZd);
        } else {
            this.LLILZIL.LIZ(1, null);
        }
        return Unit.LIZ;
    }
}
