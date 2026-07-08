package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.HTTP_TYPE;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackAction;
import com.ss.ugc.android.davinciresource.jni.HttpClientCallbackDelegate;
import com.ss.ugc.android.davinciresource.jni.MapStringString;
import com.ss.ugc.android.davinciresource.jni.MsgExtParam;
import com.ss.ugc.android.davinciresource.jni.SWIGTYPE_p_void;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.1Bz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.bytedance.ies.cutsame.effectfetcher.EffectNetWorker$requestNet$1", f = "EffectNetWorker.kt", l = {}, m = "invokeSuspend")
public final class C2222741Bz6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C2222731Bz5 LLILLJJLI;
    public final /* synthetic */ HTTP_TYPE LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ MapStringString LLILZIL;
    public final /* synthetic */ MapStringString LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ byte[] LLIZLLLIL;
    public final /* synthetic */ SWIGTYPE_p_void LLJ;
    public final /* synthetic */ HttpClientCallbackDelegate LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2222741Bz6(String str, C2222731Bz5 c2222731Bz5, HTTP_TYPE http_type, long j, MapStringString mapStringString, MapStringString mapStringString2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, HttpClientCallbackDelegate httpClientCallbackDelegate, InterfaceC1364105Vn<? super C2222741Bz6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c2222731Bz5;
        this.LLILLL = http_type;
        this.LLILZ = j;
        this.LLILZIL = mapStringString;
        this.LLILZLL = mapStringString2;
        this.LLIZ = str2;
        this.LLIZLLLIL = bArr;
        this.LLJ = sWIGTYPE_p_void;
        this.LLJI = httpClientCallbackDelegate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2222741Bz6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectNetWorker@15f0.requestNet$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LLILLJJLI.LIZ(this.LL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            MsgExtParam msgExtParam = new MsgExtParam();
            HTTP_TYPE http_type = this.LLILLL;
            if (http_type == null) {
                http_type = HTTP_TYPE.HTTP_GET;
            }
            msgExtParam.setEHttpType(http_type);
            msgExtParam.setUiReqId(this.LLILZ);
            msgExtParam.setErrorCode(-1);
            this.LLJI.onCallback(this.LLJ, HttpClientCallbackAction.FAIL, "Network Failed".getBytes(Charsets.UTF_8), r6.length, msgExtParam);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectNetWorker@15f0.requestNet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
