package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C383130F0l extends C2217421BqW implements Function1<Integer, Unit> {
    public C383130F0l(Object obj) {
        super(1, obj, C383070F0f.class, "onReplace", "onReplace(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        InterfaceC383170F0p interfaceC383170F0p = ((C383070F0f) this.receiver).LJ;
        if (interfaceC383170F0p != null) {
            interfaceC383170F0p.LIZJ(iIntValue);
        }
        return Unit.LIZ;
    }
}
