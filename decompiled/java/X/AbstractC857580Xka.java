package X;

import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Xka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC857580Xka extends AbstractC854370XfP {
    public static final int $stable = 0;

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public abstract /* synthetic */ String getFirstStepId();

    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
    public abstract /* synthetic */ HashMap<String, HashMap<String, String>> getFlowGraph();

    public abstract String getInitialVerificationStepId();

    public abstract List<VerificationMethodType> getVerifyMethods();
}
