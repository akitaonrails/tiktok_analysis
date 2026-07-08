package X;

import com.bytedance.android.starship.engine.event.Event;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307930k8l extends C09AY implements Function0<String> {
    public final /* synthetic */ InterfaceC1307790k8X LL;
    public final /* synthetic */ C1307840k8c LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Event LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307930k8l(InterfaceC1307790k8X interfaceC1307790k8X, C1307840k8c c1307840k8c, boolean z, Event event) {
        super(0);
        this.LL = interfaceC1307790k8X;
        this.LLILLJJLI = c1307840k8c;
        this.LLILLL = z;
        this.LLILZ = event;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run CEP ");
        sbLIZ.append(this.LL.LIZJ(this.LLILLJJLI.LIZ));
        sbLIZ.append(", isMatched:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", event:");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
