package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;

/* JADX INFO: renamed from: X.0CaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316060CaC implements InterfaceC316110CaH {
    public final CKEDraftInfo LL;
    public int LLILLJJLI;
    public C316070CaD LLILLL = new C316070CaD("", "");

    @Override // X.InterfaceC316110CaH
    public final CKEDraftInfo draftInfoWrapper() {
        return this.LL;
    }

    public C316060CaC(CKEDraftInfo cKEDraftInfo) {
        this.LL = cKEDraftInfo;
    }

    @Override // X.InterfaceC316110CaH
    public final void setModerationStatus(int i) {
        this.LLILLJJLI = i;
    }
}
