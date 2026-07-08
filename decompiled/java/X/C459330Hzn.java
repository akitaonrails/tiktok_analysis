package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.PlayGameCTAButtonType$onClickButton$1$1", f = "PlayGameCTAButtonType.kt", l = {106}, m = "invokeSuspend")
public final class C459330Hzn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Effect>, Object> {
    public int LL;
    public final /* synthetic */ C459320Hzm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459330Hzn(C459320Hzm c459320Hzm, InterfaceC1364105Vn<? super C459330Hzn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c459320Hzm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459330Hzn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayGameCTAButtonType@8207.onClickButton$1$1");
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
                List listSingletonList = Collections.singletonList(this.LLILLJJLI.LIZLLL);
                Context context = this.LLILLJJLI.LIZ;
                this.LL = 1;
                obj = iMMediaServiceInternalBridgeLIZ.LJIIJ(context, listSingletonList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PlayGameCTAButtonType@8207.onClickButton$1$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("PlayGameCTAButtonType@8207.onClickButton$1$1");
            return objLJJJLL;
        }
        List list = (List) obj;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        }
        C1C7U.LIZIZ("PlayGameCTAButtonType@8207.onClickButton$1$1");
        return objLJJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Effect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
