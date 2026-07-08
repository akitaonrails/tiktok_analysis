package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Hzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.TryEffectCTAButtonType$onShowButton$1", f = "TryEffectCTAButtonType.kt", l = {44}, m = "invokeSuspend")
public final class C459290Hzj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Effect>, Object> {
    public int LL;
    public final /* synthetic */ C459280Hzi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459290Hzj(C459280Hzi c459280Hzi, InterfaceC1364105Vn<? super C459290Hzj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c459280Hzi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459290Hzj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TryEffectCTAButtonType@3b61.onShowButton$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object objLJJJLL = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
            if (iMMediaServiceInternalBridgeLIZ != null) {
                List listLJJLIIIJ = a0.LJJLIIIJ(this.LLILLJJLI.LJFF, new char[]{','}, false, 0, 6);
                Context context = this.LLILLJJLI.LIZ;
                this.LL = 1;
                obj = iMMediaServiceInternalBridgeLIZ.LJIIJ(context, listLJJLIIIJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TryEffectCTAButtonType@3b61.onShowButton$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("TryEffectCTAButtonType@3b61.onShowButton$1");
            return objLJJJLL;
        }
        List list = (List) obj;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        }
        C1C7U.LIZIZ("TryEffectCTAButtonType@3b61.onShowButton$1");
        return objLJJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Effect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
