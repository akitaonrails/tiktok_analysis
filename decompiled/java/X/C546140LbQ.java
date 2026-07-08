package X;

import com.ss.android.ugc.aweme.aigc.AITaskServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: renamed from: X.0LbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AITaskServiceImpl", f = "AITaskServiceImpl.kt", l = {129}, m = "checkCreativeModelPermission")
public final class C546140LbQ extends AbstractC23140094w {
    public CreativeModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C546230LbZ LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ AITaskServiceImpl LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546140LbQ(AITaskServiceImpl aITaskServiceImpl, InterfaceC1364105Vn<? super C546140LbQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = aITaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITaskServiceImpl@999e.checkCreativeModelPermission$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJ.LIZJ(null, false, this);
        C1C7U.LIZIZ("AITaskServiceImpl@999e.checkCreativeModelPermission$1");
        return objLIZJ;
    }
}
