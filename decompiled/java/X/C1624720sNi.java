package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1624720sNi extends C2217421BqW implements InterfaceC1631630sYr<Boolean, Integer, Cert, String, Unit> {
    public C1624720sNi(C12SE c12se) {
        super(4, c12se, C12SE.class, "pauseRecord", "pauseRecord(ZILcom/bytedance/bpea/basics/Cert;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Integer num, Cert cert, String str) {
        ((C12SE) this.receiver).D5(bool.booleanValue(), num.intValue(), cert, str);
        return Unit.LIZ;
    }
}
