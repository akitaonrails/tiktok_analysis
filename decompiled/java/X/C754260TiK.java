package X;

import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;

/* JADX INFO: renamed from: X.0TiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionSettingsManager", f = "RoomFunctionSettingsManager.kt", l = {222}, m = "updateCommentSettings")
public final class C754260TiK extends AbstractC23140094w {
    public CommentSwitchSettings LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C758980Tpw LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754260TiK(C758980Tpw c758980Tpw, InterfaceC1364105Vn<? super C754260TiK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c758980Tpw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionSettingsManager@eba.updateCommentSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILLL.LJIIL(null, this);
        C1C7U.LIZIZ("RoomFunctionSettingsManager@eba.updateCommentSettings$1");
        return objLJIIL;
    }
}
