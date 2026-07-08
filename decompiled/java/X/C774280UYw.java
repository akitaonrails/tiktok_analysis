package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C774280UYw extends C2217421BqW implements Function1<Cert, Unit> {
    public C774280UYw(Object obj) {
        super(1, obj, C0UYG.class, "onFinishBroadcastConfirmClick", "onFinishBroadcastConfirmClick(Lcom/bytedance/bpea/basics/Cert;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Cert cert) {
        ((C0UYG) this.receiver).LIZJ(cert);
        return Unit.LIZ;
    }
}
