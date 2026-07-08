package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19985113Hl<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC19985413Ho<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final C13HG<Key> LIZ;
    public final C13HG<Value> LIZIZ;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public abstract InterfaceC19983313Gt getDescriptor();

    public AbstractC19985113Hl(C13HG c13hg, C13HG c13hg2) {
        this.LIZ = c13hg;
        this.LIZIZ = c13hg2;
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Collection collection) {
        LIZLLL(collection);
        InterfaceC19986513Hz interfaceC19986513HzLJIJI = c13hd.LJIJI(getDescriptor());
        Iterator<Map.Entry<? extends Key, ? extends Value>> itLIZJ = LIZJ(collection);
        int i = 0;
        while (itLIZJ.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itLIZJ.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            interfaceC19986513HzLJIJI.LJJIIJ(getDescriptor(), i, this.LIZ, key);
            i = i2 + 1;
            interfaceC19986513HzLJIJI.LJJIIJ(getDescriptor(), i2, this.LIZIZ, value);
        }
        interfaceC19986513HzLJIJI.LIZLLL();
    }

    @Override // X.AbstractC19985413Ho
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Builder builder, boolean z) {
        int iLJIJJ;
        Object objLJI;
        Object objLJI2 = interfaceC19986313Hx.LJI(getDescriptor(), i, this.LIZ, null);
        if (z) {
            iLJIJJ = interfaceC19986313Hx.LJIJJ(getDescriptor());
            if (iLJIJJ != i + 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Value must follow key in a map, index for key: ");
                sbLIZ.append(i);
                sbLIZ.append(", returned index for value: ");
                sbLIZ.append(iLJIJJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        } else {
            iLJIJJ = i + 1;
        }
        if (builder.containsKey(objLJI2) && !(this.LIZIZ.getDescriptor().LIZIZ() instanceof C13HJ)) {
            objLJI = interfaceC19986313Hx.LJI(getDescriptor(), iLJIJJ, this.LIZIZ, C2097608Jq.LJFF(objLJI2, builder));
        } else {
            objLJI = interfaceC19986313Hx.LJI(getDescriptor(), iLJIJJ, this.LIZIZ, null);
        }
        builder.put(objLJI2, objLJI);
    }
}
