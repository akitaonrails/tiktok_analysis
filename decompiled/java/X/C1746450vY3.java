package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemOption;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressEditSetting;
import com.ss.android.ugc.aweme.ecommerce.dependency.map.PoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$updateRegion$1$3", f = "AddressEditViewModel.kt", l = {1738}, m = "invokeSuspend")
public final class C1746450vY3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressEditViewModel LLILLJJLI;
    public final /* synthetic */ Region LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746450vY3(AddressEditViewModel addressEditViewModel, Region region, InterfaceC1364105Vn<? super C1746450vY3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressEditViewModel;
        this.LLILLL = region;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746450vY3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        AnonymousClass0317 anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin;
        Boolean boolValueOf;
        Integer numLIZ;
        boolean z;
        String name;
        Object objLIZLLL = obj;
        C1C7U.LIZ("AddressEditViewModel@7f24.updateRegion$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(151));
                C980703sT c980703sT = AddressApi.LIZ;
                Region region = this.LLILLL;
                Integer numLJ = C2286608xc.LJ(0);
                if (this.LLILLJJLI.LLLLLJIL == 1) {
                    num = 1;
                } else {
                    num = null;
                }
                AddressEditViewModel addressEditViewModel = this.LLILLJJLI;
                Integer num2 = addressEditViewModel.LLLIIL;
                Address addressTR2 = addressEditViewModel.tR2(addressEditViewModel.XR2(), true);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = PoiMapDependencyService.createIPoiMapDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IPoiMapDependencyService.class.getName();
                    if (anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPoiMapDependencyService.class);
                }
                Boolean boolValueOf2 = Boolean.valueOf(!((IPoiMapDependencyService) anonymousClass0317CreateIPoiMapDependencyServicebyMonsterPlugin).googleServiceEnable());
                if (Intrinsics.LJFF(AddressEditSetting.LIZ().locationAuthorized, true)) {
                    boolValueOf = Boolean.valueOf(C1745180vW0.LJFF());
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.LJFF(AddressEditSetting.LIZ().locationAuthorized, true)) {
                    numLIZ = C1747070vZ3.LIZ();
                } else {
                    numLIZ = null;
                }
                InputItemOption inputItemOption = new InputItemOption(boolValueOf2, null, null, boolValueOf, numLIZ);
                this.LL = 1;
                objLIZLLL = c980703sT.LIZLLL(region, numLJ, num, num2, "shipping_address", addressTR2, inputItemOption, null, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("AddressEditViewModel@7f24.updateRegion$1$3");
                    return objLJFF;
                }
            }
            Response response = (Response) objLIZLLL;
            InputItemData inputItemData = (InputItemData) response.data;
            if (response.isCodeOK() && inputItemData != null) {
                AddressEditViewModel addressEditViewModel2 = this.LLILLJJLI;
                addressEditViewModel2.LLILZLL = this.LLILLL;
                addressEditViewModel2.LLJJIJI = true;
                addressEditViewModel2.setState(AFwS268S0000000_26.get$arr$(153));
                AddressEditViewModel addressEditViewModel3 = this.LLILLJJLI;
                addressEditViewModel3.LLJJJJ = inputItemData;
                addressEditViewModel3.lS2(inputItemData, null, Boolean.TRUE, Boolean.FALSE);
            } else {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(152));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(154));
            C1019103yf.LIZ(EnumC1014603xw.ERR54, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditViewModel@7f24.updateRegion$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
