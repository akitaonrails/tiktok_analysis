package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINViewModel;
import com.ss.android.ugc.aweme.account.pin.PINApi;
import com.ss.android.ugc.aweme.account.pin.PINResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ttI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.pin.CreateOrResetPINViewModel$setPin$1", f = "CreateOrResetPINViewModel.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 38}, m = "invokeSuspend")
public final class C1682740ttI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateOrResetPINViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682740ttI(CreateOrResetPINViewModel createOrResetPINViewModel, String str, boolean z, InterfaceC1364105Vn<? super C1682740ttI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = createOrResetPINViewModel;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1682740ttI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateOrResetPINViewModel@ca9.setPin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CreateOrResetPINViewModel@ca9.setPin$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LL.setValue(true);
            PINApi pINApi = PINApi.LIZ;
            String str = this.LLILLL;
            boolean z = this.LLILZ;
            this.LL = 1;
            obj = pINApi.LIZ(str, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreateOrResetPINViewModel@ca9.setPin$1");
                return objLJFF;
            }
        }
        PINResponse pINResponse = (PINResponse) obj;
        this.LLILLJJLI.LL.setValue(false);
        if (Intrinsics.LJFF("success", pINResponse.message)) {
            C1DEK c1dek = this.LLILLJJLI.LLILLL;
            C1682730ttH c1682730ttH = C1682730ttH.LIZ;
            this.LL = 2;
            if (c1dek.LJIJI(c1682730ttH, this) == objLJFF) {
                C1C7U.LIZIZ("CreateOrResetPINViewModel@ca9.setPin$1");
                return objLJFF;
            }
        } else {
            C1DEK c1dek2 = this.LLILLJJLI.LLILLL;
            PINResponse.Data data = pINResponse.data;
            C1682710ttF c1682710ttF = new C1682710ttF(data.errorCode, data.description);
            this.LL = 3;
            if (c1dek2.LJIJI(c1682710ttF, this) == objLJFF) {
                C1C7U.LIZIZ("CreateOrResetPINViewModel@ca9.setPin$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreateOrResetPINViewModel@ca9.setPin$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
