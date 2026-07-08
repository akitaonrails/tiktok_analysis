package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869780yky extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869780yky(boolean z) {
        super(0);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isBackground=");
        sbLIZ.append(this.LL ? "1" : CardStruct.IStatusCode.DEFAULT);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
