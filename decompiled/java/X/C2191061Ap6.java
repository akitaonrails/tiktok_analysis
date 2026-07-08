package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.WelMsgStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$setSwitch$2", f = "BaAutoMessageServiceImpl.kt", l = {47}, m = "invokeSuspend")
public final class C2191061Ap6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191061Ap6(int i, boolean z, BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191061Ap6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191061Ap6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        boolean z;
        C484210Iyp c484210Iyp;
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.setSwitch$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        boolean z2 = false;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2191381Apc c2191381Apc = C2191381Apc.LIZ;
                int i3 = this.LLILLJJLI;
                if (this.LLILLL) {
                    i = 2;
                } else {
                    i = 1;
                }
                c2191381Apc.getClass();
                C099F c099fLIZ = C23183096n.LIZ(C2191381Apc.LJFF(i3, i));
                this.LL = 1;
                obj = c099fLIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.setSwitch$2");
                    return objLJFF;
                }
            }
            WelMsgStatusResponse welMsgStatusResponse = (WelMsgStatusResponse) obj;
            WelMsgStatusStruct welMsgStatusStruct = welMsgStatusResponse.welMessageStatus;
            if (welMsgStatusStruct != null) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LLILZ;
                long j = welMsgStatusStruct.welcomeMessageId;
                int i4 = welMsgStatusStruct.reviewStatus;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                c484210Iyp = new C484210Iyp(0, C2286608xc.LJFF(j), "", null);
                            } else {
                                c484210Iyp = new C484210Iyp(4, C2286608xc.LJFF(j), welMsgStatusStruct.content, welMsgStatusStruct.reviewReason);
                            }
                        } else {
                            c484210Iyp = new C484210Iyp(3, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                        }
                    } else {
                        c484210Iyp = new C484210Iyp(2, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                    }
                } else {
                    if (welMsgStatusStruct.content.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c484210Iyp = new C484210Iyp(0, C2286608xc.LJFF(j), "", null);
                    } else {
                        c484210Iyp = new C484210Iyp(1, C2286608xc.LJFF(j), welMsgStatusStruct.content, null);
                    }
                }
                baAutoMessageServiceImpl.LJFF = c484210Iyp;
            }
            if (welMsgStatusResponse.status_code == 0) {
                z2 = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.setSwitch$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
