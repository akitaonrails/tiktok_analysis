package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1624740sNk extends C2217421BqW implements Function2<Cert, String, Unit> {
    public C1624740sNk(C12SE c12se) {
        super(2, c12se, C12SE.class, "startRecord", "startRecord(Lcom/bytedance/bpea/basics/Cert;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Cert cert, String str) {
        ((C12SE) this.receiver).H5(cert, str);
        return Unit.LIZ;
    }
}
