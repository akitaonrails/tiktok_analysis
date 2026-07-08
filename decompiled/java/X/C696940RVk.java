package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696940RVk extends C09AY implements Function0<String> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696940RVk(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.LLLF.getValue();
    }
}
