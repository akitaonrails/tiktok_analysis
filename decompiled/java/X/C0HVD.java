package X;

import Y.AgS287S0100000_6;

/* JADX INFO: renamed from: X.0HVD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordInputUiExtKt$blockUserInputWhenRecordActivated$1$invokeSuspend$$inlined$map$1$2", f = "RecordInputUiExt.kt", l = {223}, m = "emit")
public final class C0HVD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS287S0100000_6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HVD(AgS287S0100000_6 agS287S0100000_6, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS287S0100000_6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordInputUiExtKt@d679.blockUserInputWhenRecordActivated$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("RecordInputUiExtKt@d679.blockUserInputWhenRecordActivated$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
