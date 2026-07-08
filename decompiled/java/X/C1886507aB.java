package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886507aB extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ Settings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886507aB(Settings settings) {
        super(0);
        this.LL = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        Settings settings = this.LL;
        return C13LP.LJLIL(settings.blockedV1Page, settings.blockedPages);
    }
}
