package X;

import com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings;

/* JADX INFO: renamed from: X.0Tdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.CommentSettingsDataCenter", f = "CommentSettingsDataCenter.kt", l = {83}, m = "updateEnigmaSettings")
public final class C751380Tdg extends AbstractC23140094w {
    public EnigmaWhisperSwitchSettings LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C751360Tde LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751380Tdg(C751360Tde c751360Tde, InterfaceC1364105Vn<? super C751380Tdg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c751360Tde;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSettingsDataCenter@6d3f.updateEnigmaSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, null, this);
        C1C7U.LIZIZ("CommentSettingsDataCenter@6d3f.updateEnigmaSettings$1");
        return objLJFF;
    }
}
