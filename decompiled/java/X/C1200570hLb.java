package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS419S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem$checkPoiValid$1", f = "PoiClaimPoiListAssem.kt", l = {180}, m = "invokeSuspend")
public final class C1200570hLb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiClaimPoiListAssem LLILLJJLI;
    public final /* synthetic */ PoiData LLILLL;
    public final /* synthetic */ C1200050hKl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200570hLb(PoiClaimPoiListAssem poiClaimPoiListAssem, PoiData poiData, C1200050hKl c1200050hKl, InterfaceC1364105Vn<? super C1200570hLb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiClaimPoiListAssem;
        this.LLILLL = poiData;
        this.LLILZ = c1200050hKl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1200570hLb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        Integer num;
        EnumC1200610hLf enumC1200610hLf;
        int i;
        String str;
        IPoiClaimApi.PoiClaimCheckDataDialog poiClaimCheckDataDialog;
        boolean z;
        C1C7U.LIZ("PoiClaimPoiListAssem@be06.checkPoiValid$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PoiClaimPoiListViewModel poiClaimPoiListViewModelJo = this.LLILLJJLI.Jo();
                String str2 = this.LLILLL.poiId;
                this.LL = 1;
                if (str2 == null) {
                    poiClaimPoiListViewModelJo.getClass();
                    obj = null;
                } else {
                    obj = ((InterfaceC1199740hKG) poiClaimPoiListViewModelJo.LL.getValue().getOperator()).LLLJ(str2, this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiClaimPoiListAssem@be06.checkPoiValid$1");
                    return objLJFF;
                }
            }
            IPoiClaimApi.PoiClaimCheckResponse poiClaimCheckResponse = (IPoiClaimApi.PoiClaimCheckResponse) obj;
            this.LLILLJJLI.So(false);
            if (poiClaimCheckResponse != null) {
                numLJ = C2286608xc.LJ(poiClaimCheckResponse.status_code);
            } else {
                numLJ = null;
            }
            if (numLJ != null && numLJ.intValue() == 0) {
                C1200730hLr c1200730hLr = EnumC1200610hLf.Companion;
                if (poiClaimCheckResponse != null) {
                    num = poiClaimCheckResponse.checkPoiResult;
                } else {
                    num = null;
                }
                c1200730hLr.getClass();
                EnumC1200610hLf[] enumC1200610hLfArrValues = EnumC1200610hLf.values();
                int length = enumC1200610hLfArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        enumC1200610hLf = enumC1200610hLfArrValues[i3];
                        int resultCode = enumC1200610hLf.getResultCode();
                        if (num == null || resultCode != num.intValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            break;
                        }
                        i3++;
                    } else {
                        enumC1200610hLf = null;
                        break;
                    }
                }
                if (enumC1200610hLf == null) {
                    i = -1;
                } else {
                    i = C1200600hLe.LIZ[enumC1200610hLf.ordinal()];
                }
                switch (i) {
                    case 1:
                        this.LLILLJJLI.Oo(this.LLILLL);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        PoiClaimPoiListAssem poiClaimPoiListAssem = this.LLILLJJLI;
                        String str3 = this.LLILLL.poiId;
                        if (poiClaimCheckResponse != null) {
                            str = poiClaimCheckResponse.errorType;
                        } else {
                            str = null;
                        }
                        if (poiClaimCheckResponse == null) {
                            poiClaimCheckDataDialog = null;
                        } else {
                            poiClaimCheckDataDialog = poiClaimCheckResponse.dialog;
                        }
                        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(poiClaimPoiListAssem, this.LLILZ, 139);
                        poiClaimPoiListAssem.getClass();
                        IPoiClaimFragmentAbility iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(poiClaimPoiListAssem), IPoiClaimFragmentAbility.class, null);
                        if (iPoiClaimFragmentAbility != null) {
                            iPoiClaimFragmentAbility.Lt2(str3, str, poiClaimCheckDataDialog, awS419S0200000_18);
                        }
                        break;
                    default:
                        this.LLILLJJLI.Vo();
                        break;
                }
            } else {
                this.LLILLJJLI.Vo();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.Vo();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong with checkPoiClaim, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiClaimPoiListAssem@be06.checkPoiValid$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
