package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;

/* JADX INFO: renamed from: X.0NMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController", f = "BlockUserController.kt", l = {301, 303, 306}, m = "onBlockAPIResponse")
public final class C592830NMz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BlockUserController LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592830NMz(BlockUserController blockUserController, InterfaceC1364105Vn<? super C592830NMz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = blockUserController;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BlockUserController@aeb9.onBlockAPIResponse$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("BlockUserController@aeb9.onBlockAPIResponse$1");
        return objLJIIIIZZ;
    }
}
