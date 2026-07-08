package X;

import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Tdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.CommentSettingsDataCenter", f = "CommentSettingsDataCenter.kt", l = {69}, m = "updateCommentSettings")
public final class C751370Tdf extends AbstractC23140094w {
    public CommentSwitchSettings LL;
    public DataChannel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C751360Tde LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751370Tdf(C751360Tde c751360Tde, InterfaceC1364105Vn<? super C751370Tdf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c751360Tde;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSettingsDataCenter@6d3f.updateCommentSettings$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("CommentSettingsDataCenter@6d3f.updateCommentSettings$1");
        return objLIZJ;
    }
}
