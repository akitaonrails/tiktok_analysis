package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;

/* JADX INFO: renamed from: X.0NN0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController", f = "BlockUserController.kt", l = {241, 247}, m = "onBlockUserSuccess")
public final class C0NN0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BlockUserController LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NN0(BlockUserController blockUserController, InterfaceC1364105Vn<? super C0NN0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = blockUserController;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BlockUserController@aeb9.onBlockUserSuccess$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(this);
        C1C7U.LIZIZ("BlockUserController@aeb9.onBlockUserSuccess$1");
        return objLJIIIZ;
    }
}
