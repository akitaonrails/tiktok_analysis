package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS199S1100000_25;

/* JADX INFO: renamed from: X.0tcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672590tcv extends C09AY implements Function2<InterfaceC1672350tcX, C1682380tsi, InterfaceC1690350u5Z> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672590tcv(int i, int i2, float f, String str) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = f;
        this.LLILZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1690350u5Z invoke(X.InterfaceC1672350tcX r22, X.C1682380tsi r23) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1672590tcv.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Pair<AbstractC1686530tzP, C1692150u8T> LIZ(InterfaceC1672350tcX interfaceC1672350tcX, long j, String str, EnumC1672600tcw enumC1672600tcw, int i) {
        C259800zU c259800zU = new C259800zU();
        InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) C13LP.LJJJJZI(interfaceC1672350tcX.LJJLIL(enumC1672600tcw, new C19719212De(715165793, new AwS199S1100000_25(str, (String) c259800zU, (C259800zU<C1692150u8T>) 2), true)));
        if (i < 0) {
            i = 0;
        }
        return new Pair<>(interfaceC1673370teB.LJJJJZ(C1682390tsj.LIZ(0, i, 0, C1682380tsi.LJII(j))), c259800zU.element);
    }
}
