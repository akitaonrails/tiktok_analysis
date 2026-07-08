package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142630fq9 extends C09AY implements Function0<C1142640fqA> {
    public final /* synthetic */ C1142590fq5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142630fq9(C1142590fq5 c1142590fq5) {
        super(0);
        this.LL = c1142590fq5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0fqA] */
    @Override // kotlin.jvm.functions.Function0
    public final C1142640fqA invoke() {
        final C1142610fq7 c1142610fq7 = this.LL.LIZ;
        return new Object(c1142610fq7) { // from class: X.0fqA
            public final Function0<PcsApi> LIZ;

            {
                this.LIZ = c1142610fq7;
            }
        };
    }
}
