package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250418Ec extends C09AY implements Function0<Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C259800zU<BufferBtm> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21250418Ec(C259800zU c259800zU, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldPollBuffer=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pausedInfo.flag=");
        boolean z = C18E3.LIZ;
        C21247918Dd c21247918Dd = C18E3.LJII;
        sbLIZ.append(c21247918Dd != null ? c21247918Dd.LIZJ : null);
        sbLIZ.append(", bufferBtm=");
        sbLIZ.append(this.LLILLJJLI.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
