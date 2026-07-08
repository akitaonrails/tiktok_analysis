package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ResolutionConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966620bGG extends C09AY implements Function0<ResolutionConfig> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966620bGG(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ResolutionConfig invoke() {
        return new ResolutionConfig(this.LL.LLJLILLLLZIIL().LJJLIIIJLLLLLLLZ(), this.LL.LLJLILLLLZIIL().LLFII());
    }
}
