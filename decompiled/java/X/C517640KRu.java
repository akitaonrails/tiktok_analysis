package X;

import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.PolingSuperFanContractStatusResult;
import tikcast.api.fans.SuperFanRecoverResponse;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0KRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.subscription.payment.v2.resubscribe.AbsResubscribeStrategy$resubscribe$1", f = "AbsResubscribeStrategy.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT, 25}, m = "invokeSuspend")
public final class C517640KRu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0KS6<Object, Object, C517680KRy> LLILLL;
    public final /* synthetic */ C517680KRy LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517640KRu(C0KS6<Object, Object, C517680KRy> c0ks6, C517680KRy c517680KRy, InterfaceC1364105Vn<? super C517640KRu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0ks6;
        this.LLILZ = c517680KRy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C517640KRu c517640KRu = new C517640KRu(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c517640KRu.LLILLJJLI = obj;
        return c517640KRu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object objLJLIIIL;
        BaseResponse baseResponse;
        C517680KRy c517680KRy;
        Object obj2;
        String str;
        C19EG c19egLIZIZ;
        String str2;
        Object objLJLIIIL2 = obj;
        C1C7U.LIZ("AbsResubscribeStrategy@164.resubscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    objLJLIIIL = this.LLILLJJLI;
                    C155000ia.LIZIZ(objLJLIIIL2);
                    baseResponse = (BaseResponse) objLJLIIIL2;
                    C0KS6<Object, Object, C517680KRy> c0ks6 = this.LLILLL;
                    c517680KRy = this.LLILZ;
                    c0ks6.getClass();
                    C0KSW c0ksw = (C0KSW) objLJLIIIL;
                    if (baseResponse != null || ((SuperFanRecoverResponse.RecoverContractInAppResult) baseResponse.data).inAppRequest.length() == 0 || baseResponse.statusCode != 0) {
                        c517680KRy.LJI.LIZJ(null);
                    } else if (((SuperFanRecoverResponse.RecoverContractInAppResult) baseResponse.data).alreadySucceed) {
                        c517680KRy.LJI.onSuccess();
                    } else {
                        C0KS6<Object, Object, C517680KRy> c0ks62 = this.LLILLL;
                        if (baseResponse != null) {
                            obj2 = baseResponse.data;
                        } else {
                            obj2 = null;
                        }
                        C517680KRy c517680KRy2 = this.LLILZ;
                        c0ks62.getClass();
                        SuperFanRecoverResponse.RecoverContractInAppResult recoverContractInAppResult = (SuperFanRecoverResponse.RecoverContractInAppResult) obj2;
                        final C517690KRz c517690KRz = (C517690KRz) c517680KRy2;
                        if (recoverContractInAppResult != null) {
                            str = recoverContractInAppResult.skuId;
                        } else {
                            str = null;
                        }
                        if (c0ksw == null) {
                            C0KS0 c0ks0 = c517690KRz.LJI;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("no resubscribe target product found for iapId ");
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                            c0ks0.LIZJ(null);
                        } else {
                            C0KP5 c0kp5 = new C0KP5() { // from class: X.0KRx
                                @Override // X.C0KP5
                                public final void LIZIZ(Throwable th, RechargeCustomError rechargeCustomError) {
                                }

                                @Override // X.C0KP5
                                public final void LIZJ(PolingSuperFanContractStatusResult polingSuperFanContractStatusResult) {
                                }

                                @Override // X.C0KP5
                                public final void LIZLLL(Throwable th) {
                                }

                                @Override // X.C0KP5
                                public final void LJFF(CreateSuperFanContractResult createSuperFanContractResult) {
                                }

                                @Override // X.C0KP5
                                public final void LIZ(C0KPG c0kpg) {
                                    c517690KRz.LJI.LIZJ(c0kpg);
                                }

                                @Override // X.C0KP5
                                public final void LJ(C0KPG c0kpg) {
                                    c517690KRz.LJI.onSuccess();
                                }
                            };
                            Context context = c517690KRz.LIZJ;
                            if (context != null) {
                                c19egLIZIZ = C1388190mED.LIZIZ(context);
                            } else {
                                c19egLIZIZ = null;
                            }
                            C0KP3 c0kp3 = new C0KP3(new WeakReference(c19egLIZIZ), c517690KRz.LJFF, new LinkedHashMap(), c517690KRz.LJ, new C0KS8(null, c0ksw, null, 2), 0, String.valueOf(c517690KRz.LIZ), c517690KRz.LIZIZ, c517690KRz.LJIIIIZZ, String.valueOf(c517690KRz.LIZLLL), c517690KRz.LJIIIZ, c517690KRz.LJIIJ, c0kp5);
                            String str3 = null;
                            C516910KOz c516910KOz = new C516910KOz(null);
                            if (recoverContractInAppResult != null) {
                                str3 = recoverContractInAppResult.inAppRequest;
                            }
                            String str4 = "";
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (recoverContractInAppResult != null && (str2 = recoverContractInAppResult.contractId) != null) {
                                str4 = str2;
                            }
                            c516910KOz.LIZ(c0kp3, str4, str3);
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(objLJLIIIL2);
            objLJLIIIL = objLJLIIIL2;
        } else {
            C155000ia.LIZIZ(objLJLIIIL2);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C517660KRw(this.LLILLL, this.LLILZ, null), 3);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1");
                return objLJFF;
            }
        }
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C517650KRv(this.LLILLL, this.LLILZ, objLJLIIIL, null), 3);
        this.LLILLJJLI = objLJLIIIL;
        this.LL = 2;
        objLJLIIIL2 = c099gLIZIZ2.LJLIIIL(this);
        if (objLJLIIIL2 == objLJFF) {
            C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1");
            return objLJFF;
        }
        baseResponse = (BaseResponse) objLJLIIIL2;
        C0KS6<Object, Object, C517680KRy> c0ks63 = this.LLILLL;
        c517680KRy = this.LLILZ;
        c0ks63.getClass();
        C0KSW c0ksw2 = (C0KSW) objLJLIIIL;
        if (baseResponse != null) {
            c517680KRy.LJI.LIZJ(null);
        } else {
            c517680KRy.LJI.LIZJ(null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbsResubscribeStrategy@164.resubscribe$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
