package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.140I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager", f = "C2PAAIGCManager.kt", l = {943, 946}, m = "writeToImageProduct")
public final class C140I extends AbstractC23140094w {
    public VideoPublishEditModel LL;
    public C15464063q LLILLJJLI;
    public Object LLILLL;
    public SingleImageData LLILZ;
    public Object LLILZIL;
    public boolean LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C140D LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140I(C140D c140d, InterfaceC1364105Vn<? super C140I> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c140d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.writeToImageProduct$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJJJIL = this.LLIZLLLIL.LJJJIL(null, false, this);
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.writeToImageProduct$1");
        return objLJJJIL;
    }
}
