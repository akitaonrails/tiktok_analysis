package X;

import java.util.Map;

/* JADX INFO: renamed from: X.1BkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213641BkQ implements InterfaceC805220ViK {
    public final EnumC1910390zoT LIZ;
    public final Object LIZIZ;
    public final AbstractC2213701BkW LIZJ;
    public final Exception LIZLLL;
    public final Object[] LJ;
    public final Map<Object, Object> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMStrategyCenterResult(stateCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategy key=");
        sbLIZ.append(this.LIZJ.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC805220ViK
    public final Object[] LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC805220ViK
    public final EnumC1910390zoT LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC805220ViK
    public final Object LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC805220ViK
    public final AbstractC2213701BkW LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC805220ViK
    public final Exception getErrorMessage() {
        return this.LIZLLL;
    }

    public /* synthetic */ C2213641BkQ(EnumC1910390zoT enumC1910390zoT, Object obj, AbstractC2213701BkW abstractC2213701BkW, Exception exc, Object[] objArr, int i) {
        this(enumC1910390zoT, obj, abstractC2213701BkW, (i & 8) != 0 ? null : exc, (i & 16) != 0 ? null : objArr, (Map<Object, ? extends Object>) null);
    }

    public C2213641BkQ(EnumC1910390zoT enumC1910390zoT, Object obj, AbstractC2213701BkW abstractC2213701BkW, Exception exc, Object[] objArr, Map<Object, ? extends Object> map) {
        this.LIZ = enumC1910390zoT;
        this.LIZIZ = obj;
        this.LIZJ = abstractC2213701BkW;
        this.LIZLLL = exc;
        this.LJ = objArr;
        this.LJFF = map;
    }
}
