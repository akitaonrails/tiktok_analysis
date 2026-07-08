package X;

import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.TiktokMinisLinkResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0maq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402220maq implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    public static final void onSubscribe$0(C1402220maq c1402220maq, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C1402220maq c1402220maq, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                C2187451AjH.LIZ;
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
        }
    }

    public C1402220maq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C1402220maq c1402220maq, Throwable th) {
        Function2 function2 = (Function2) c1402220maq.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }

    public static final void onError$1(C1402220maq c1402220maq, Throwable th) {
        Function2 function2 = (Function2) c1402220maq.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }

    public static final void onError$2(C1402220maq c1402220maq, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMinisLink, onError:");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        NetworkResponse<TiktokMinisLinkResponse> networkResponse = new NetworkResponse<>(null, -1, false, null, false, null, null);
        InterfaceC1378930lzH interfaceC1378930lzH = (InterfaceC1378930lzH) c1402220maq.l0;
        if (interfaceC1378930lzH != null) {
            interfaceC1378930lzH.LIZ(false, networkResponse);
        }
    }

    public static final void onSuccess$0(C1402220maq c1402220maq, Object obj) {
        Function2 function2 = (Function2) c1402220maq.l0;
        if (function2 != null) {
            function2.invoke(obj, null);
        }
    }

    public static final void onSuccess$1(C1402220maq c1402220maq, Object obj) {
        Function2 function2 = (Function2) c1402220maq.l0;
        if (function2 != null) {
            function2.invoke(obj, null);
        }
    }

    public static final void onSuccess$2(C1402220maq c1402220maq, Object obj) {
        NetworkResponse<TiktokMinisLinkResponse> networkResponse = (NetworkResponse) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMinisLink, onSuccess, data:");
        sbLIZ.append(networkResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1378930lzH interfaceC1378930lzH = (InterfaceC1378930lzH) c1402220maq.l0;
        if (interfaceC1378930lzH != null) {
            interfaceC1378930lzH.LIZ(true, networkResponse);
        }
    }
}
