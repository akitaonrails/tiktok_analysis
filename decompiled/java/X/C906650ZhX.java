package X;

import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import com.ss.android.ugc.aweme.im.streaming.remote.StreamingApi;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.0ZhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamingAPIRepositoryImpl$streamMessages$1", f = "StreamingAPIRepositoryImpl.kt", l = {46, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C906650ZhX extends C09AX implements Function2<C094D<? super StreamingResponseData>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C906660ZhY LLILLL;
    public final /* synthetic */ C906210Zgp LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906650ZhX(C906660ZhY c906660ZhY, C906210Zgp c906210Zgp, InterfaceC1364105Vn<? super C906650ZhX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c906660ZhY;
        this.LLILZ = c906210Zgp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C906650ZhX c906650ZhX = new C906650ZhX(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c906650ZhX.LLILLJJLI = obj;
        return c906650ZhX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        final C094D c094d;
        C1C7U.LIZ("StreamingAPIRepositoryImpl@e04e.streamMessages$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.streamMessages$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c094d = (C094D) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c094d = (C094D) this.LLILLJJLI;
            StreamingApi streamingApi = (StreamingApi) this.LLILLL.LIZ.LIZ.getValue();
            if (streamingApi != null) {
                C906210Zgp c906210Zgp = this.LLILZ;
                C13DA c13da = new C13DA();
                c13da.put("business_type", c906210Zgp.LIZ);
                c13da.put("reply_client_message_id", c906210Zgp.LIZIZ);
                c13da.put("start_seq_id", String.valueOf(c906210Zgp.LIZJ));
                c13da.put("conversation_short_id", String.valueOf(c906210Zgp.LIZLLL));
                String str = c906210Zgp.LJ;
                if (str != null) {
                    c13da.put("send_client_message_id", str);
                }
                Long l = c906210Zgp.LJFF;
                if (l != null) {
                    c13da.put("send_server_message_id", String.valueOf(l.longValue()));
                }
                String str2 = c906210Zgp.LJI;
                if (str2 != null) {
                    c13da.put("business_scene", str2);
                }
                Map<String, String> mapBuild = c13da.build();
                this.LLILLJJLI = c094d;
                this.LL = 1;
                obj = streamingApi.getStreamingMsg(mapBuild, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.streamMessages$1");
                    return objLJFF;
                }
            } else {
                throw new IOException("Retrofit not available");
            }
        }
        ((C1515820pY4) obj).LIZLLL(new C0POE<C1515830pY5<C906250Zgt, Void>>() { // from class: X.0Zhb
            @Override // X.C0POE
            public final void onComplete() {
                c094d.LJIIJJI(null);
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) {
                c094d.LJIIJJI(th);
            }

            @Override // X.C0POE
            public final void onNext(C1515830pY5<C906250Zgt, Void> c1515830pY5) {
                C1515830pY5<C906250Zgt, Void> c1515830pY52 = c1515830pY5;
                if (c1515830pY52 != null) {
                    C094D<StreamingResponseData> c094d2 = c094d;
                    C906250Zgt c906250Zgt = (C906250Zgt) c1515830pY52.LL;
                    if (c906250Zgt != null) {
                        c094d2.LJIIIIZZ(C906350Zh3.LJ(c906250Zgt, c1515830pY52.LLILLL));
                    }
                }
            }
        });
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23128094k.LIZ(c094d, AFwS189S0000000_3.get$arr$(1330), this) == objLJFF) {
            C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.streamMessages$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreamingAPIRepositoryImpl@e04e.streamMessages$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super StreamingResponseData> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
