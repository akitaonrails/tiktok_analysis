package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1938607ia {
    public static AbstractC1938207iW LIZ(final h hVar, final int i) {
        if (i >= hVar.size()) {
            return null;
        }
        final n nVarLJIILIIL = hVar.LJJIIJZLJL(i).LJIILIIL();
        String strLJIL = nVarLJIILIIL.LJJIIZ("action").LJIL();
        if (strLJIL != null) {
            int iHashCode = strLJIL.hashCode();
            if (iHashCode != -1233049061) {
                if (iHashCode != 430051577) {
                    if (iHashCode == 962642266 && strLJIL.equals("replaceParams")) {
                        return new AbstractC1938207iW(hVar, nVarLJIILIIL, i) { // from class: X.07iZ
                            public final n LIZJ;

                            @Override // X.AbstractC1938207iW
                            public final void LIZIZ(SchemaBundle schemaBundle) {
                                Object c098200Yq;
                                for (String str : this.LIZJ.LJJIJIL()) {
                                    k kVarLJJIIZ = this.LIZJ.LJJIIZ(str);
                                    kVarLJJIIZ.getClass();
                                    if (kVarLJJIIZ instanceof m) {
                                        if (schemaBundle.getQueryParameter(str) != null) {
                                            schemaBundle.deleteQuery(str);
                                        }
                                    } else {
                                        try {
                                            c098200Yq = kVarLJJIIZ.LJIL();
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c098200Yq = new C098200Yq(th);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        }
                                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                            c098200Yq = null;
                                        }
                                        String str2 = (String) c098200Yq;
                                        if (str2 != null) {
                                            schemaBundle.appendQueryParameter(str, str2);
                                        }
                                    }
                                }
                            }

                            {
                                this.LIZJ = nVarLJIILIIL.LJJIIZ("params").LJIILIIL();
                            }
                        };
                    }
                } else if (strLJIL.equals("replacePath")) {
                    return new AbstractC1938207iW(hVar, nVarLJIILIIL, i) { // from class: X.07ib
                        public final String LIZJ;

                        @Override // X.AbstractC1938207iW
                        public final void LIZIZ(SchemaBundle schemaBundle) {
                            schemaBundle.setPath(this.LIZJ);
                        }

                        {
                            this.LIZJ = nVarLJIILIIL.LJJIIZ("path").LJIL();
                        }
                    };
                }
            } else if (strLJIL.equals("replaceURL")) {
                return new C1938807ic(hVar, nVarLJIILIIL, i);
            }
        }
        throw new IllegalArgumentException("cannot parse action");
    }
}
