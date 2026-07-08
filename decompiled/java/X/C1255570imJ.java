package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0imJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255570imJ extends AbstractC2248601Czi {
    public final String LJI;

    @Override // X.AbstractC2248601Czi
    public final String LIZ() {
        return this.LJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1255570imJ(EnumC1584360rKc enumC1584360rKc, AbstractC1255540imG abstractC1255540imG, EnumC1255080ilW enumC1255080ilW, EnumC2009107tx enumC2009107tx, int i) {
        EnumC1994807re enumC1994807re;
        Map mapLJ;
        EnumC2009107tx enumC2009107tx2 = enumC2009107tx;
        if ((i & 16) != 0) {
            enumC1994807re = EnumC1994807re.NONE;
        } else {
            enumC1994807re = null;
        }
        enumC2009107tx2 = (i & 32) != 0 ? EnumC2009107tx.CLICK_DISAPPEAR : enumC2009107tx2;
        if ((i & 64) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        super(enumC1584360rKc, abstractC1255540imG, enumC1255080ilW, enumC1994807re, enumC2009107tx2, mapLJ);
        this.LJI = C1250890iel.LIZ(enumC1584360rKc, abstractC1255540imG.LIZ, null);
    }
}
