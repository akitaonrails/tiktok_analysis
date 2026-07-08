package X;

import com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings;

/* JADX INFO: renamed from: X.0TiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionSettingsManager", f = "RoomFunctionSettingsManager.kt", l = {246}, m = "updateEnigmaSettings")
public final class C754250TiJ extends AbstractC23140094w {
    public EnigmaWhisperSwitchSettings LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C758980Tpw LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754250TiJ(C758980Tpw c758980Tpw, InterfaceC1364105Vn<? super C754250TiJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c758980Tpw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionSettingsManager@eba.updateEnigmaSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLL.LJIILJJIL(null, this);
        C1C7U.LIZIZ("RoomFunctionSettingsManager@eba.updateEnigmaSettings$1");
        return objLJIILJJIL;
    }
}
