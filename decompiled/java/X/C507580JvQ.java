package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C507580JvQ implements InterfaceC515600KJy {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final GetSubPrivilegeDetailResponse.Data LLILZ;
    public SubscriptionPrivilegeDetailFragment LLILZIL;

    @Override // X.InterfaceC515600KJy
    public final boolean LIZ(InterfaceC515600KJy interfaceC515600KJy) {
        return false;
    }

    public void LIZIZ() {
    }

    public String LIZJ() {
        return this.LLILLL;
    }

    public int LIZLLL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC515600KJy
    public String LJJJ() {
        return this.LL;
    }

    public C507580JvQ(String str, int i, String str2, GetSubPrivilegeDetailResponse.Data data, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = data;
        this.LLILZIL = subscriptionPrivilegeDetailFragment;
    }
}
