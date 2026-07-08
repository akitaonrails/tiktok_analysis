package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C383040F0c extends C2217421BqW implements Function1<String, Unit> {
    public C383040F0c(Object obj) {
        super(1, obj, C383070F0f.class, "usePrompt", "usePrompt(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C383070F0f c383070F0f = (C383070F0f) this.receiver;
        c383070F0f.LIZIZ.invoke(new C0F04() { // from class: X.0F03
        });
        InterfaceC383270F0z interfaceC383270F0z = c383070F0f.LJFF;
        if (interfaceC383270F0z != null) {
            interfaceC383270F0z.LIZ(str2);
        }
        return Unit.LIZ;
    }
}
