package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593820rZs extends C09AY implements Function1<Intent, Unit> {
    public final /* synthetic */ ToolsActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593820rZs(ToolsActivityAssem toolsActivityAssem) {
        super(1);
        this.LL = toolsActivityAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        this.LL.onNewIntent(intent);
        return Unit.LIZ;
    }
}
