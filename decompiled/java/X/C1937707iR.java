package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937707iR extends AbstractC1938007iU {
    public final n LJFF;

    @Override // X.AbstractC1938007iU
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        for (String str : this.LJFF.LJJIJIL()) {
            k kVarLJJIIZ = this.LJFF.LJJIIZ(str);
            kVarLJJIIZ.getClass();
            if (kVarLJJIIZ instanceof m) {
                if (schemaBundle.getQueryParameter(str) != null) {
                    return false;
                }
            } else if (!u.LJIJI(schemaBundle.getQueryParameter(str), kVarLJJIIZ.LJIL(), true)) {
                return false;
            }
        }
        return true;
    }

    public C1937707iR(h hVar, n nVar, int i) {
        super(hVar, nVar, i);
        this.LJFF = nVar.LJJIJ("params");
    }
}
