package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RS2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RS2 extends C09AY implements Function0<String> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RS2(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.LLJLLIL.getValue();
    }
}
