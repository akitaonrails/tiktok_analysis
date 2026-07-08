package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1009810cNv extends C2217421BqW implements Function0<Unit> {
    public C1009810cNv(AbstractC1014240cV4 abstractC1014240cV4) {
        super(0, abstractC1014240cV4, C1009800cNu.class, "autoDismiss", "autoDismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1009800cNu c1009800cNu = (C1009800cNu) this.receiver;
        InterfaceC1009820cNw interfaceC1009820cNw = c1009800cNu.LLJLIL;
        if (interfaceC1009820cNw != null) {
            interfaceC1009820cNw.LIZJ("auto_dismiss");
        }
        c1009800cNu.LJIIZILJ();
        return Unit.LIZ;
    }
}
