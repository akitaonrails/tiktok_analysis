package X;

import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;

/* JADX INFO: renamed from: X.1AvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl", f = "MiniGameRenderServiceImpl.kt", l = {1039, 1111}, m = "resolveSchemaAndMeta")
public final class C2194961AvO extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MiniGameRenderServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194961AvO(MiniGameRenderServiceImpl miniGameRenderServiceImpl, InterfaceC1364105Vn<? super C2194961AvO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = miniGameRenderServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniGameRenderServiceImpl@ccfc.resolveSchemaAndMeta$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, null, false, this);
        C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.resolveSchemaAndMeta$1");
        return objLJI;
    }
}
