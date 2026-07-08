package X;

import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleUserDependAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;

/* JADX INFO: renamed from: X.0R2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689360R2g implements InterfaceC689370R2h, InterfaceC1587906Jp {
    public final /* synthetic */ TakoUserItem LL;
    public final /* synthetic */ INimbleUserDependAbility LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    @Override // X.InterfaceC689370R2h
    public final String LJ() {
        String messageId;
        String str = this.LLILLL;
        if (str != null) {
            return str;
        }
        INimbleUserDependAbility iNimbleUserDependAbility = this.LLILLJJLI;
        return (iNimbleUserDependAbility == null || (messageId = iNimbleUserDependAbility.getMessageId()) == null) ? "" : messageId;
    }

    @Override // X.InterfaceC689370R2h
    public final TakoUserItem getUser() {
        TakoUserItem takoUserItem = this.LL;
        if (takoUserItem != null) {
            return takoUserItem;
        }
        INimbleUserDependAbility iNimbleUserDependAbility = this.LLILLJJLI;
        if (iNimbleUserDependAbility != null) {
            return iNimbleUserDependAbility.getUser();
        }
        return null;
    }

    public C689360R2g(INimbleUserDependAbility iNimbleUserDependAbility, TakoUserItem takoUserItem, String str) {
        this.LL = takoUserItem;
        this.LLILLJJLI = iNimbleUserDependAbility;
        this.LLILLL = str;
    }
}
