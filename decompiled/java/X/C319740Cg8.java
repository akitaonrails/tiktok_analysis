package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimLoadOlderMessagesMethodIDL$handle$1$1", f = "EcimLoadOlderMessagesMethodIDL.kt", l = {38, 41}, m = "invokeSuspend")
public final class C319740Cg8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonMessageListComponentApi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319740Cg8(PigeonMessageListComponentApi pigeonMessageListComponentApi, InterfaceC1364105Vn<? super C319740Cg8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonMessageListComponentApi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319740Cg8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EcimLoadOlderMessagesMethodIDL@eaf5.handle$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcimLoadOlderMessagesMethodIDL@eaf5.handle$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C414301jJ c414301jJLJJIII = this.LLILLJJLI.LJJIII();
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c414301jJLJJIII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcimLoadOlderMessagesMethodIDL@eaf5.handle$1$1");
                return objLJFF;
            }
        }
        if (((List) obj).isEmpty()) {
            try {
                this.LLILLJJLI.LJII();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            PigeonMessageListComponentApi pigeonMessageListComponentApi = this.LLILLJJLI;
            this.LL = 2;
            if (pigeonMessageListComponentApi.LIZLLL() == objLJFF) {
                C1C7U.LIZIZ("EcimLoadOlderMessagesMethodIDL@eaf5.handle$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcimLoadOlderMessagesMethodIDL@eaf5.handle$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
