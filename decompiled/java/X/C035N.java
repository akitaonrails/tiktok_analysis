package X;

import X.InterfaceC729102sz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.035N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C035N<S extends InterfaceC729102sz> implements C035U, C036G {
    public final Map<String, Object> LIZ = new LinkedHashMap();
    public volatile S LIZIZ;

    @Override // X.InterfaceC2257711DYj
    public final void Am() {
    }

    @Override // X.InterfaceC2257711DYj
    public final void LIZ() {
    }

    @Override // X.C036G
    public final void LJIJI(BillInfoData billInfoData) {
    }

    public void LJJIL(BillInfoData billInfoData, PaymentInfo paymentInfo) {
    }

    @Override // X.C035U
    public void LJJJJIZL(JSONObject jSONObject) {
    }

    public void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
    }

    @Override // X.C036G
    public final void LJJJLZIJ() {
    }

    @Override // X.C035U
    public void LJJLIIIJ(CreateOrderRequest createOrderRequest) {
    }

    @Override // X.C036G
    public final void LJJLIIIJILLIZJL(C850403Ty c850403Ty) {
    }

    @Override // X.C035U
    public void LJJLIIIJLJLI(List<C035L> list) {
    }

    @Override // X.C035U
    public void LJJLIIJ(ChangeInfo changeInfo, BillInfoRequest billInfoRequest) {
    }

    public abstract S LJJZ();

    @Override // X.InterfaceC2257711DYj
    public final void onCreate() {
    }

    public void onDestroy() {
    }

    @Override // X.InterfaceC2257711DYj
    public final void onPause() {
    }

    @Override // X.InterfaceC2257711DYj
    public final void onResume() {
    }

    @Override // X.InterfaceC2257711DYj
    public void onStop() {
    }

    public final S LJJZZI() {
        S s = this.LIZIZ;
        if (s == null) {
            synchronized (this) {
                try {
                    s = this.LIZIZ;
                    if (s == null) {
                        s = (S) LJJZ();
                        this.LIZIZ = s;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return s;
    }

    public final boolean LJJZZIII(Function1<? super S, ? extends S> function1) {
        boolean z;
        synchronized (this) {
            try {
                InterfaceC729102sz interfaceC729102szLJJZZI = LJJZZI();
                S sInvoke = function1.invoke(interfaceC729102szLJJZZI);
                z = !Intrinsics.LJFF(interfaceC729102szLJJZZI, sInvoke);
                if (z) {
                    this.LIZIZ = sInvoke;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
