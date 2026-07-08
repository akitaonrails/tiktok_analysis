package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ytv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$onPostBlock$2", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
public final class C888850Ytv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BlockUserController LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888850Ytv(BlockUserController blockUserController, boolean z, InterfaceC1364105Vn<? super C888850Ytv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = blockUserController;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C888850Ytv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BlockUserController@aeb9.onPostBlock$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BlockUserController blockUserController = this.LL;
        blockUserController.LLILZLL.invoke(blockUserController.LLILLJJLI);
        if (C298480Bmw.LIZ()) {
            if (!this.LLILLJJLI) {
                C486890J7n c486890J7n = new C486890J7n();
                BlockUserController blockUserController2 = this.LL;
                C2201941BFw c2201941BFw = IMUser.Companion;
                IMUser iMUser = blockUserController2.LLILLJJLI;
                c2201941BFw.getClass();
                c486890J7n.LIZ = C2201941BFw.LJII(iMUser);
                C1440005kM.LIZ(c486890J7n);
            } else {
                C888460YtI c888460YtI = new C888460YtI();
                BlockUserController blockUserController3 = this.LL;
                C2201941BFw c2201941BFw2 = IMUser.Companion;
                IMUser iMUser2 = blockUserController3.LLILLJJLI;
                c2201941BFw2.getClass();
                c888460YtI.LIZ = C2201941BFw.LJII(iMUser2);
                C1440005kM.LIZ(c888460YtI);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BlockUserController@aeb9.onPostBlock$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
