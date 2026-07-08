package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1624750sNl extends C2217421BqW implements Function2<Cert, String, Unit> {
    public C1624750sNl(C12SD c12sd) {
        super(2, c12sd, C12SD.class, "startRecord", "startRecord(Lcom/bytedance/bpea/basics/Cert;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Cert cert, String str) {
        ((C12SD) this.receiver).L6(cert, str);
        return Unit.LIZ;
    }
}
