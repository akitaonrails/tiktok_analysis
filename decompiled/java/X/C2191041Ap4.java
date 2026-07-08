package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoMsgStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.MsgSwitchResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchMessageSwitches$1", f = "BaAutoMessageServiceImpl.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C2191041Ap4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191041Ap4(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191041Ap4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191041Ap4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.fetchMessageSwitches$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2191381Apc.LIZ.getClass();
                C099F c099fLIZ = C23183096n.LIZ(C2191381Apc.LIZIZ());
                this.LL = 1;
                obj = c099fLIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchMessageSwitches$1");
                    return objLJFF;
                }
            }
            AutoMsgStruct[] autoMsgStructArr = ((MsgSwitchResponse) obj).messageSwitches;
            if (autoMsgStructArr != null) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LLILLJJLI;
                for (AutoMsgStruct autoMsgStruct : autoMsgStructArr) {
                    int i2 = autoMsgStruct.messageType;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (autoMsgStruct.messageSwitch == 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                baAutoMessageServiceImpl.LIZLLL = z3;
                            }
                        } else {
                            if (autoMsgStruct.messageSwitch == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            baAutoMessageServiceImpl.LIZJ = z2;
                        }
                    } else {
                        if (autoMsgStruct.messageSwitch == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        baAutoMessageServiceImpl.LIZIZ = z;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchMessageSwitches$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
