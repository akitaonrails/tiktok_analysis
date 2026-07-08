package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Wvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839150Wvx extends C09AY implements InterfaceC2280181EMu<Integer, String, String, Object, Object[], Object, C0WZW, Boolean, Unit> {
    public final /* synthetic */ InterfaceC839390WwL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839150Wvx(InterfaceC839390WwL interfaceC839390WwL) {
        super(8);
        this.LL = interfaceC839390WwL;
    }

    @Override // X.InterfaceC2280181EMu
    public final Unit dN(Integer num, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LIZIZ(num.intValue(), str, str2, obj, objArr, obj2, c0wzw, zBooleanValue);
        return Unit.LIZ;
    }
}
