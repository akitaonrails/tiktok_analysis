package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacySettingsDepServiceImpl;

/* JADX INFO: renamed from: X.0TiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacySettingsDepServiceImpl", f = "PrivacySettingsDepServiceImpl.kt", l = {272}, m = "shouldForceShowInboxOption")
public final class C754170TiB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PrivacySettingsDepServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754170TiB(PrivacySettingsDepServiceImpl privacySettingsDepServiceImpl, InterfaceC1364105Vn<? super C754170TiB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = privacySettingsDepServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrivacySettingsDepServiceImpl@a08c.shouldForceShowInboxOption$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIJL = this.LLILLJJLI.LJJIJL(null, this);
        C1C7U.LIZIZ("PrivacySettingsDepServiceImpl@a08c.shouldForceShowInboxOption$1");
        return objLJJIJL;
    }
}
