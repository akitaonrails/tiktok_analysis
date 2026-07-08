package Y;

import X.AbstractC19484711Kz;
import X.C13BV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AkS487S0100000_26 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object apply$2(AkS487S0100000_26 akS487S0100000_26, Object obj) {
        return ((Function1) akS487S0100000_26.l0).invoke(obj);
    }

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public AkS487S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS487S0100000_26 akS487S0100000_26, Object obj) {
        final AuthAppInfoListResponse authAppInfoListResponse = (AuthAppInfoListResponse) obj;
        final AuthListViewModel authListViewModel = (AuthListViewModel) akS487S0100000_26.l0;
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0vdl
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<AuthorizedStruct>> interfaceC2329309At) {
                EnumC1749980vdk enumC1749980vdk;
                try {
                    String strLIZIZ = C20485080t.LIZIZ(authAppInfoListResponse);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("middleWare, refresh, resp: ");
                    sbLIZ.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    AuthListViewModel authListViewModel2 = authListViewModel;
                    C1750010vdn c1750010vdn = EnumC1749980vdk.Companion;
                    Integer num = authAppInfoListResponse.familyPairingEnum;
                    c1750010vdn.getClass();
                    EnumC1749980vdk[] enumC1749980vdkArrValues = EnumC1749980vdk.values();
                    int length = enumC1749980vdkArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            enumC1749980vdk = enumC1749980vdkArrValues[i2];
                            int iOrdinal = enumC1749980vdk.ordinal();
                            if (num != null && iOrdinal == num.intValue()) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            enumC1749980vdk = EnumC1749980vdk.FAMILY_PAIRING_ENUM_NO_PAIRING;
                            break;
                        }
                    }
                    authListViewModel2.LLJ = enumC1749980vdk;
                    AuthListViewModel authListViewModel3 = authListViewModel;
                    AuthAppInfoListResponse authAppInfoListResponse2 = authAppInfoListResponse;
                    authListViewModel3.LLJI = authAppInfoListResponse2.partnerAuth;
                    List<AuthorizedStruct> list = authAppInfoListResponse2.authorizationList;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    interfaceC2329309At.onSuccess(list);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("middleWare, refresh, exception: ");
                    sbLIZ2.append(e);
                    C1720106oR.LIZ("appauth-AuthListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    authListViewModel.LLJI = null;
                    interfaceC2329309At.onSuccess(C13BV.INSTANCE);
                }
            }
        });
    }

    public static final Object apply$1(AkS487S0100000_26 akS487S0100000_26, Object obj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("middleWare, error occurred: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        ((AuthListViewModel) akS487S0100000_26.l0).LLJI = null;
        return AbstractC19484711Kz.LJIJJLI(C13BV.INSTANCE);
    }
}
