package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS5S1500000_1;

/* JADX INFO: renamed from: X.03rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC975703rf {
    Boolean ES();

    void Fk1(Address address);

    Integer IK();

    void It0(Function0<Unit> function0);

    void KM(Context context, InterfaceC1748810vbr interfaceC1748810vbr, Address address, String str, Integer num, Integer num2, String str2, String str3, String str4, Map<String, String> map);

    void LJJJZ(Function1<? super AddressListState, AddressListState> function1);

    boolean LS0();

    boolean PY0();

    void Pg1(Address address);

    List<InterfaceC1891350zJl> RL0(AddressListData addressListData);

    void SB1(int i);

    void Tc0(int i);

    void UC2(boolean z);

    void W6(CoroutineContext coroutineContext, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2);

    String ZM2();

    boolean d41();

    void e81(Activity activity, InterfaceC1748810vbr interfaceC1748810vbr, String str, String str2);

    Object eF0(InterfaceC1364105Vn interfaceC1364105Vn, C975903rh c975903rh);

    List<ReachableAddress> ft();

    String gT1(List<ReachableAddress> list);

    Map<String, String> getExtraInfo();

    String getProductId();

    HashMap<String, Object> getTrackParams();

    C817603Hi gv();

    int hS1();

    Integer iV1();

    void jp1(AddressListData addressListData);

    Integer jt1();

    Boolean l81();

    void mC2(View view, Address address);

    void ml(Function1<? super AddressListState, Unit> function1);

    String nP0();

    boolean vj2();

    AddressListData wD2();

    void wX1(Address address, AwS5S1500000_1 awS5S1500000_1);

    boolean xW();
}
