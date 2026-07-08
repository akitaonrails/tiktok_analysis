package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.PigeonNetworkApi;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.PigeonDepend$sendHttp$1", f = "PigeonDepend.kt", l = {}, m = "invokeSuspend")
public final class C0YZA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YIS LLILLJJLI;
    public final /* synthetic */ InterfaceC874620YSu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YZA(C0YIS c0yis, InterfaceC874620YSu interfaceC874620YSu, InterfaceC1364105Vn<? super C0YZA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yis;
        this.LLILLL = interfaceC874620YSu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0YZA c0yza = new C0YZA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0yza.LL = obj;
        return c0yza;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        InterfaceC859903Xp interfaceC859903XpCreateBuilder;
        C01K1 c01k1Build;
        PigeonNetworkApi pigeonNetworkApi;
        C0X9S<TypedInput> c0x9sDoPostPbOutput;
        byte[] bytes;
        TypedByteArray typedByteArray;
        String str = "Failed to send im http";
        C1C7U.LIZ("PigeonDepend@4e84.sendHttp$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YIS c0yis = this.LLILLJJLI;
        InterfaceC874620YSu interfaceC874620YSu = this.LLILLL;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(c0yis.LIZ, linkedHashMap);
            byte[] bArr = c0yis.LIZLLL;
            if (bArr == null) {
                bArr = new byte[0];
            }
            C0X52<TypedInput> c0x52Execute = null;
            TypedByteArray typedByteArray2 = new TypedByteArray(null, bArr, new String[0]);
            IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IECRetrofitFactory.class, false, false, false, 14, null);
            if (iECRetrofitFactory != null && (interfaceC859903XpCreateBuilder = iECRetrofitFactory.createBuilder((String) pairLIZJ.first)) != null && (c01k1Build = interfaceC859903XpCreateBuilder.build()) != null && (pigeonNetworkApi = (PigeonNetworkApi) c01k1Build.create(PigeonNetworkApi.class)) != null && (c0x9sDoPostPbOutput = pigeonNetworkApi.doPostPbOutput((String) pairLIZJ.second, linkedHashMap, typedByteArray2, C13BV.INSTANCE, true)) != null && (c0x52Execute = c0x9sDoPostPbOutput.execute()) != null && c0x52Execute.LIZ.LIZIZ == 200) {
                TypedInput typedInput = c0x52Execute.LIZIZ;
                if (!(typedInput instanceof TypedByteArray) || (typedByteArray = (TypedByteArray) typedInput) == null || (bytes = typedByteArray.getBytes()) == null) {
                    bytes = new byte[0];
                }
                C871860YIe c871860YIe = new C871860YIe();
                int i2 = c0x52Execute.LIZ.LIZIZ;
                C0YIX c0yix = c871860YIe.LIZ;
                c0yix.LIZ = i2;
                c0yix.LIZIZ = bytes;
                interfaceC874620YSu.LIZIZ(c0yix);
            } else {
                RuntimeException runtimeException = new RuntimeException("Failed to send im http");
                if (c0x52Execute != null) {
                    String str2 = c0x52Execute.LIZ.LJI;
                    if (str2 != null) {
                        str = str2;
                    }
                    i = c0x52Execute.LIZ.LIZIZ;
                } else {
                    i = -1;
                }
                interfaceC874620YSu.LIZ(runtimeException, str, i);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        InterfaceC874620YSu interfaceC874620YSu2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            RuntimeException runtimeException2 = new RuntimeException(thM5exceptionOrNullimpl);
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            interfaceC874620YSu2.LIZ(runtimeException2, message, 400);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonDepend@4e84.sendHttp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
