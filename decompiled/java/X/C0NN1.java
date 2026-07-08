package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;

/* JADX INFO: renamed from: X.0NN1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController", f = "BlockUserController.kt", l = {317, 318}, m = "onPostBlock")
public final class C0NN1 extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BlockUserController LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NN1(BlockUserController blockUserController, InterfaceC1364105Vn<? super C0NN1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = blockUserController;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BlockUserController@aeb9.onPostBlock$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(false, this);
        C1C7U.LIZIZ("BlockUserController@aeb9.onPostBlock$1");
        return objLJIIJ;
    }
}
