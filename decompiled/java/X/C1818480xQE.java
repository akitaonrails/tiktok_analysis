package X;

import com.bytedance.android.livesdk.model.SceneryContent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818480xQE extends C09AY implements Function1<C1735840vGw, C1735840vGw> {
    public final /* synthetic */ SceneryContent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818480xQE(SceneryContent sceneryContent) {
        super(1);
        this.LL = sceneryContent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1735840vGw invoke(C1735840vGw c1735840vGw) {
        return C1735840vGw.LIZ(c1735840vGw, null, this.LL.sceneryType, 1);
    }
}
