package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMErrorUtilsHelper;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$2$2", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
public final class C0NNU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BlockUserController LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NNU(BlockUserController blockUserController, Exception exc, InterfaceC1364105Vn<? super C0NNU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = blockUserController;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NNU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IBlockService iBlockService;
        C1C7U.LIZ("BlockUserController@aeb9.callApi$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BlockUserController blockUserController = this.LL;
        Exception exc = this.LLILLJJLI;
        blockUserController.LLILZLL.invoke(blockUserController.LLILLJJLI);
        if (exc instanceof C0XIR) {
            if (((C23112093u) exc).getErrorCode() == 3002038) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(blockUserController.LL);
                if (c19egLIZIZ != null && (iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpiForReal(IBlockService.class)) != null) {
                    iBlockService.LIZJ(c19egLIZIZ);
                }
            } else {
                blockUserController.LJIIJJI(-1, blockUserController.LL);
            }
        } else {
            IIMErrorUtilsHelper.LIZ.getClass();
            IIMErrorUtilsHelper value = C0NNV.LIZIZ.getValue();
            if (value != null) {
                value.LIZ(blockUserController.LL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BlockUserController@aeb9.callApi$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
