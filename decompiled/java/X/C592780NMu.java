package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$updateToBlockStatus$1", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
public final class C592780NMu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BlockUserController LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592780NMu(BlockUserController blockUserController, boolean z, InterfaceC1364105Vn<? super C592780NMu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = blockUserController;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592780NMu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C1C7U.LIZ("BlockUserController@aeb9.updateToBlockStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZIL.invoke();
        if (this.LLILLJJLI) {
            BlockUserController blockUserController = this.LL;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Activity activity = null;
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            if (activityLIZIZ instanceof Activity) {
                activity = activityLIZIZ;
            }
            blockUserController.LJIIJJI(0, activity);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BlockUserController@aeb9.updateToBlockStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
