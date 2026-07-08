package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;

/* JADX INFO: renamed from: X.140K, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager", f = "C2PAAIGCManager.kt", l = {168}, m = "generateC2PAWithTimeOut")
public final class C140K extends AbstractC23140094w {
    public MediaModel LL;
    public AIGCInfo LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C140D LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140K(C140D c140d, InterfaceC1364105Vn<? super C140K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c140d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.generateC2PAWithTimeOut$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZ.LJIILJJIL(null, null, 0L, null, this);
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.generateC2PAWithTimeOut$1");
        return objLJIILJJIL;
    }
}
