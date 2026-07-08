package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchWelcomeMessage$1", f = "BaAutoMessageServiceImpl.kt", l = {146}, m = "invokeSuspend")
public final class C2191071Ap7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191071Ap7(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191071Ap7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191071Ap7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C484210Iyp c484210Iyp;
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
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
                C099F c099fLIZ = C23183096n.LIZ(C2191381Apc.LIZLLL());
                this.LL = 1;
                obj = c099fLIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
                    return objLJFF;
                }
            }
            WelMsgStatusResponse welMsgStatusResponse = (WelMsgStatusResponse) obj;
            if (welMsgStatusResponse.status_code != 0) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LLILLJJLI;
                baAutoMessageServiceImpl.LJ = null;
                baAutoMessageServiceImpl.LJFF = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
                return unit;
            }
            WelMsgStatusStruct welMsgStatusStruct = welMsgStatusResponse.welMessageStatus;
            if (welMsgStatusStruct == null) {
                this.LLILLJJLI.LJFF = new C484210Iyp(0, C2286608xc.LJFF(0L), "", null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
                return unit2;
            }
            long j = welMsgStatusStruct.welcomeMessageId;
            BaAutoMessageServiceImpl baAutoMessageServiceImpl2 = this.LLILLJJLI;
            int i2 = welMsgStatusStruct.reviewStatus;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            c484210Iyp = new C484210Iyp(4, C2286608xc.LJFF(j), welMsgStatusStruct.content, welMsgStatusStruct.reviewReason);
                        } else {
                            c484210Iyp = new C484210Iyp(0, C2286608xc.LJFF(j), "", null);
                        }
                    } else {
                        c484210Iyp = new C484210Iyp(3, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                    }
                } else {
                    c484210Iyp = new C484210Iyp(2, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                }
            } else {
                if (welMsgStatusStruct.content.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    c484210Iyp = new C484210Iyp(0, C2286608xc.LJFF(j), "", null);
                } else {
                    c484210Iyp = new C484210Iyp(1, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                }
            }
            baAutoMessageServiceImpl2.LJFF = c484210Iyp;
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
            return unit3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            BaAutoMessageServiceImpl baAutoMessageServiceImpl3 = this.LLILLJJLI;
            baAutoMessageServiceImpl3.LJ = null;
            baAutoMessageServiceImpl3.LJFF = null;
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchWelcomeMessage$1");
            return unit4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
