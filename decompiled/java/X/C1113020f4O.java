package X;

import com.bytedance.android.live.publicscreen.impl.messagehistory.FetchHistoryApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0f4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.messagehistory.MessageHistoryFetcher$fetchHistory$1$fetchResult$1", f = "MessageHistoryFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1113020f4O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1113010f4N>, Object> {
    public final /* synthetic */ C1112000f2k LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113020f4O(C1112000f2k c1112000f2k, InterfaceC1364105Vn<? super C1113020f4O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1112000f2k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1113020f4O(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ProtoMessageFetchResult.BaseProtoMessage> list;
        Map<String, String> fetchHistoryParams;
        C1C7U.LIZ("MessageHistoryFetcher@f94f.fetchHistory$1$fetchResult$1");
        boolean zLJI = MethodIDManager.LJI(196868);
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int secret = UserService.getInstance().user().getCurrentUser().getSecret();
        ArrayList arrayList = new ArrayList();
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        String str = "";
        c259800zU.element = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IMessageManager iMessageManager = this.LL.LJIIIIZZ;
        if (iMessageManager != null && (fetchHistoryParams = iMessageManager.getFetchHistoryParams()) != null && (!fetchHistoryParams.isEmpty())) {
            linkedHashMap.putAll(fetchHistoryParams);
        }
        C1112000f2k c1112000f2k = this.LL;
        Room room = c1112000f2k.LJFF;
        Boolean boolValueOf = null;
        if (room != null) {
            try {
                C480460Ism.LIZ().getClass();
                C0X52<InterfaceC1516690pZT> c0x52Execute = ((FetchHistoryApi) C480460Ism.LIZLLL(FetchHistoryApi.class)).fetchCommentHistory(room.getId(), secret, c1112000f2k.LIZ(), linkedHashMap).execute();
                if (c0x52Execute.LIZJ()) {
                    C1516680pZS c1516680pZS = new C1516680pZS();
                    C1515210pX5.LIZLLL().getClass();
                    C0IMD c0imdLJI = C1515210pX5.LJI(ProtoMessageFetchResult.class);
                    if (c0imdLJI == null) {
                        AssertionError assertionError = new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
                        if (zLJI) {
                            MethodIDManager.LJ();
                            throw assertionError;
                        }
                        throw assertionError;
                    }
                    c1516680pZS.LJIIL(c0x52Execute.LIZIZ);
                    ProtoMessageFetchResult protoMessageFetchResult = (ProtoMessageFetchResult) c0imdLJI.LIZJ(c1516680pZS);
                    if (protoMessageFetchResult != null) {
                        boolValueOf = Boolean.valueOf(protoMessageFetchResult.historyNoMore);
                    }
                    c013c.element = C500260Jjc.LJJIFFI(boolValueOf);
                    T t = str;
                    if (protoMessageFetchResult != null) {
                        String str2 = protoMessageFetchResult.historyCommentCursor;
                        t = str;
                        if (str2 != null) {
                            t = str2;
                        }
                    }
                    c259800zU.element = t;
                    if (protoMessageFetchResult != null && (list = protoMessageFetchResult.messages) != null) {
                        Boolean.valueOf(arrayList.addAll(C1112000f2k.LIZJ(list)));
                    }
                } else {
                    c013c.element = c1112000f2k.LIZIZ();
                    c259800zU.element = c1112000f2k.LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c013c.element = c1112000f2k.LIZIZ();
                c259800zU.element = c1112000f2k.LIZ();
            }
            C1113010f4N c1113010f4N = new C1113010f4N(arrayList, c013c.element, (String) c259800zU.element);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            C1C7U.LIZIZ("MessageHistoryFetcher@f94f.fetchHistory$1$fetchResult$1");
            return c1113010f4N;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("MessageHistoryFetcher@f94f.fetchHistory$1$fetchResult$1");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1113010f4N> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
