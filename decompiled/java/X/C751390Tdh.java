package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Tdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.CommentSettingsDataCenter", f = "CommentSettingsDataCenter.kt", l = {37}, m = "getCommentSwitchSettings")
public final class C751390Tdh extends AbstractC23140094w {
    public DataChannel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C751360Tde LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751390Tdh(C751360Tde c751360Tde, InterfaceC1364105Vn<? super C751390Tdh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c751360Tde;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSettingsDataCenter@6d3f.getCommentSwitchSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("CommentSettingsDataCenter@6d3f.getCommentSwitchSettings$1");
        return objLIZ;
    }
}
