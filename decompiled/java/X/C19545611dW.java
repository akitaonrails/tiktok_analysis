package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult;

/* JADX INFO: renamed from: X.11dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.VCStageUtils", f = "VCStageUtils.kt", l = {557, 565}, m = "writeToFile")
public final class C19545611dW extends AbstractC23140094w {
    public VCAudioResult LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C19545411dU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19545611dW(C19545411dU c19545411dU, InterfaceC1364105Vn<? super C19545611dW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c19545411dU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VCStageUtils@cd98.writeToFile$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("VCStageUtils@cd98.writeToFile$1");
        return objLIZ;
    }
}
