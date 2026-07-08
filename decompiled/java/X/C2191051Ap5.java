package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStatusStruct;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS281S0000000_34;
import njp.a;

/* JADX INFO: renamed from: X.1Ap5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchAutoReplyMessages$1", f = "BaAutoMessageServiceImpl.kt", l = {238}, m = "invokeSuspend")
public final class C2191051Ap5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191051Ap5(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191051Ap5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191051Ap5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2191381Apc.LIZ.getClass();
                C099F c099fLIZ = C23183096n.LIZ(C2191381Apc.LIZ());
                this.LL = 1;
                obj = c099fLIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
                    return objLJFF;
                }
            }
            AutoReplyStatusResponse autoReplyStatusResponse = (AutoReplyStatusResponse) obj;
            if (autoReplyStatusResponse.status_code != 0) {
                this.LLILLJJLI.LJI = new ArrayList();
                this.LLILLJJLI.LJII = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
                return unit;
            }
            AutoReplyStatusStruct[] autoReplyStatusStructArr = autoReplyStatusResponse.autoReplyStatus;
            if (autoReplyStatusStructArr != null) {
                if (autoReplyStatusStructArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                this.LLILLJJLI.LJI = new ArrayList();
                this.LLILLJJLI.LJII = null;
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
                return unit2;
            }
            this.LLILLJJLI.LJI = C09RB.LJJIII(C09RB.LJIIJJI(new C08LY(C13LQ.LJIIJJI(autoReplyStatusStructArr), AFwS281S0000000_34.get$arr$(7))));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
            return unit3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LJII = null;
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchAutoReplyMessages$1");
            return unit4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
