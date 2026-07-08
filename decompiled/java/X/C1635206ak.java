package X;

import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1635206ak implements InterfaceC1638406bG, InterfaceC1635506an {
    public final /* synthetic */ ICommonChatNoticeViewModel LL;

    public C1635206ak(ICommonChatNoticeViewModel iCommonChatNoticeViewModel) {
        this.LL = iCommonChatNoticeViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1638406bG) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(2, this.LL, ICommonChatNoticeViewModel.class, "sendNoticeAck", "sendNoticeAck(Ljava/lang/String;I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC1638406bG
    public final void LIZ(int i, String str) {
        this.LL.MQ2(str);
    }
}
