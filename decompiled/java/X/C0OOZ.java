package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;

/* JADX INFO: renamed from: X.0OOZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager", f = "BulletinPublishManager.kt", l = {1727}, m = "publishItem")
public final class C0OOZ extends AbstractC23140094w {
    public Object LL;
    public BulletinBaseItem LLILLJJLI;
    public Object LLILLL;
    public C0OP0 LLILZ;
    public InterfaceC618630OOf LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0OOY LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OOZ(C0OOY c0ooy, InterfaceC1364105Vn<? super C0OOZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c0ooy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPublishManager@9c10.publishItem$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLJ.LJIILLIIL(null, null, false, null, null, this);
        C1C7U.LIZIZ("BulletinPublishManager@9c10.publishItem$1");
        return objLJIILLIIL;
    }
}
