package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19758412Sg extends C2217421BqW implements Function1<Cert, Unit> {
    public C19758412Sg(C12SD c12sd) {
        super(1, c12sd, C12SD.class, "backRecord", "backRecord(Lcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Cert cert) {
        ((C12SD) this.receiver).H4(cert);
        return Unit.LIZ;
    }
}
