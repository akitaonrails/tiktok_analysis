package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20360914lj extends C09AY implements Function0<C20360714lh> {
    public final /* synthetic */ PlaybookAnchorServiceV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20360914lj(PlaybookAnchorServiceV2 playbookAnchorServiceV2) {
        super(0);
        this.LL = playbookAnchorServiceV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20360714lh invoke() {
        return new C20360714lh(this.LL.LLJI, new WeakReference(this.LL.LJJJJLI()));
    }
}
