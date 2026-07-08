package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19719312Df extends C1696260uF6 implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public C19719312Df(Object obj) {
        super(2, obj, C19719212De.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int iIntValue = num.intValue();
        ((C19719212De) this.receiver).LIZ(interfaceC1680500tpg, iIntValue);
        return Unit.LIZ;
    }
}
