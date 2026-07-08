package X;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.LinkMicExtra;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183191AcP extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C2183171AcN LL;
    public final /* synthetic */ C2183211AcR LLILLJJLI;
    public final /* synthetic */ C2183221AcS LLILLL;
    public final /* synthetic */ C926820aE4<TypedInput> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183191AcP(C2183171AcN c2183171AcN, C2183211AcR c2183211AcR, C2183221AcS c2183221AcS, C926820aE4<TypedInput> c926820aE4) {
        super(1);
        this.LL = c2183171AcN;
        this.LLILLJJLI = c2183211AcR;
        this.LLILLL = c2183221AcS;
        this.LLILZ = c926820aE4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C2183171AcN c2183171AcN = this.LL;
        InterfaceC2181441AZa interfaceC2181441AZa = c2183171AcN.LL;
        String str = c2183171AcN.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on sendRequest Error: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", and error is ");
        sbLIZ.append(th);
        C1AZW.LJI(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C2183221AcS c2183221AcS = this.LLILLL;
        C926820aE4<TypedInput> c926820aE4 = this.LLILZ;
        long j = c926820aE4.statusCode;
        RequestError requestError = c926820aE4.LJ;
        String str2 = requestError.message;
        String str3 = requestError.prompts;
        String str4 = requestError.alert;
        R r = c926820aE4.extra;
        String str5 = ((LinkMicExtra) r).extraJsonString;
        if (str5 == null) {
            str5 = "";
        }
        c2183221AcS.LJ = new C966980bGq(j, str2, str3, str4, str5);
        this.LL.getClass();
        HashMap map = new HashMap();
        map.put("has_more", String.valueOf(r.hasMore));
        map.put("now", String.valueOf(r.now));
        c2183221AcS.LIZLLL = map;
        return Unit.LIZ;
    }
}
