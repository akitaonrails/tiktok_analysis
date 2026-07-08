package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546780LcS extends AbstractC2255721DQs<InterfaceC548420Lf6> implements InterfaceC548420Lf6, InterfaceC379610EuV {
    public final C1DRG LL;
    public final AIGCCreationModel LLILLJJLI;
    public final InterfaceC548420Lf6 LLILLL = this;

    @Override // X.InterfaceC548420Lf6
    public List<String> Aa1() {
        return vA2().ZG().bH();
    }

    @Override // X.InterfaceC548420Lf6
    public List<String> DP2() {
        return vA2().ZG().getResults();
    }

    @Override // X.InterfaceC548420Lf6
    public String getClientTaskId() {
        return vA2().ZG().getClientTaskId();
    }

    public InterfaceC548420Lf6 W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC548420Lf6
    public AIGCCreationModel vA2() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC548420Lf6
    public void Y90(List<String> list) {
        vA2().kx(new AwS587S0100000_8(list, (List<MentionDataItem>) 750));
    }

    public C546780LcS(C1DRG c1drg, AIGCCreationModel aIGCCreationModel) {
        this.LL = c1drg;
        this.LLILLJJLI = aIGCCreationModel;
    }
}
