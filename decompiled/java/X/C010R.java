package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.010R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010R {
    public static final Map<String, C010U> LIZ;
    public static final List<C010U> LIZIZ;

    static {
        List<C010U> listLJIIJJI = C1697810uHb.LJIIJJI(new C010U() { // from class: X.010P
            @Override // X.C010U
            public final String getName() {
                return "rename_params";
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
            @Override // X.C010U
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r19) {
                /*
                    Method dump skipped, instruction units count: 338
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C010P.LIZ(java.lang.String):void");
            }
        }, new C010U() { // from class: X.010N
            @Override // X.C010U
            public final String getName() {
                return "redirect_link";
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
            @Override // X.C010U
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r20) {
                /*
                    Method dump skipped, instruction units count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C010N.LIZ(java.lang.String):void");
            }
        }, new C010U() { // from class: X.010Q
            @Override // X.C010U
            public final String getName() {
                return "discard_save_params";
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
            @Override // X.C010U
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r19) {
                /*
                    Method dump skipped, instruction units count: 386
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C010Q.LIZ(java.lang.String):void");
            }
        }, C10QE.LIZ, new C010U() { // from class: X.010T
            @Override // X.C010U
            public final String getName() {
                return "ignore_current_deeplink";
            }

            @Override // X.C010U
            public final void LIZ(String str) {
                C010O.LIZ = null;
            }
        }, C010S.LIZ, new C010U() { // from class: X.10PA
            @Override // X.C010U
            public final String getName() {
                return "stop_nuj";
            }

            @Override // X.C010U
            public final void LIZ(String str) {
                C10QE.LIZ.getClass();
                C10QE.LJ = true;
                C10PO.LIZ.getClass();
                C10P6 c10p6 = C10PO.LIZIZ;
                if (c10p6 != null) {
                    c10p6.LIZ();
                }
            }
        });
        LIZIZ = listLJIIJJI;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C010U c010u : listLJIIJJI) {
            linkedHashMap.put(c010u.getName(), c010u);
        }
        LIZ = linkedHashMap;
    }
}
