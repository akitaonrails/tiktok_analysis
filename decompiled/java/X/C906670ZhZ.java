package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingInterruptResponseData;
import com.ss.android.ugc.aweme.im.streaming.remote.StreamingApi;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamingAPIRepositoryImpl$interruptStream$2", f = "StreamingAPIRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class C906670ZhZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StreamingInterruptResponseData>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C906660ZhY LLILLJJLI;
    public final /* synthetic */ C906200Zgo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906670ZhZ(C906660ZhY c906660ZhY, C906200Zgo c906200Zgo, InterfaceC1364105Vn<? super C906670ZhZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c906660ZhY;
        this.LLILLL = c906200Zgo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C906670ZhZ c906670ZhZ = new C906670ZhZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c906670ZhZ.LL = obj;
        return c906670ZhZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StreamingInterruptResponseData c098200Yq;
        StreamingApi streamingApi;
        boolean zBooleanValue;
        int iIntValue;
        C1C7U.LIZ("StreamingAPIRepositoryImpl@e04e.interruptStream$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C906660ZhY c906660ZhY = this.LLILLJJLI;
        C906200Zgo c906200Zgo = this.LLILLL;
        try {
            streamingApi = (StreamingApi) c906660ZhY.LIZ.LIZ.getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (streamingApi != null) {
            ComposePbAndJson<C906720Zhe, StreamingInterruptResponseData> composePbAndJson = streamingApi.interruptStreamMsg(C906350Zh3.LIZIZ(c906200Zgo)).execute().LIZIZ;
            if (composePbAndJson != null) {
                C906720Zhe c906720Zhe = (C906720Zhe) composePbAndJson.LLILLJJLI;
                if (c906720Zhe != null) {
                    Boolean bool = c906720Zhe.interrupted;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Integer num = c906720Zhe.final_seq_id;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str = c906720Zhe.send_client_message_id;
                    Long l = c906720Zhe.send_server_message_id;
                    String str2 = c906720Zhe.reply_client_message_id;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c098200Yq = new StreamingInterruptResponseData(zBooleanValue, iIntValue, str, l, str2, c906720Zhe.reply_server_message_id);
                } else {
                    c098200Yq = composePbAndJson.LL;
                    if (c098200Yq == null) {
                        throw new IOException("Both proto and json are null");
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.interruptStream$2");
                return c189200o6M1boximpl;
            }
            throw new IOException("Empty response body");
        }
        throw new IOException("Retrofit not available");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends StreamingInterruptResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
