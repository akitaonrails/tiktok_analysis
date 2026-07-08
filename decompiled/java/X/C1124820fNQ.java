package X;

import Y.ARunnableS112S0100000_12;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124820fNQ {
    public static C1124820fNQ LIZJ;
    public Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1124820fNQ() {
        /*
            r1 = this;
            r1.<init>()
            boolean r0 = X.C325510CpR.LIZ()
            if (r0 != 0) goto L25
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            boolean r0 = X.C1124870fNV.LIZLLL()
            if (r0 != 0) goto L25
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L1b:
            r1.LIZ = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.LIZIZ = r0
            return
        L25:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1124820fNQ.<init>():void");
    }

    public final String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1124830fNR.LIZ.addAndGet(1);
        String str2 = this.LIZ.get(str);
        if (str2 != null) {
            C1124830fNR.LIZIZ.addAndGet(1);
            return str2;
        }
        String str3 = (String) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (str3 != null) {
            this.LIZ.put(str, str3);
            C1124830fNR.LIZJ.addAndGet(1);
            return str3;
        }
        C823050WQl.LIZIZ().execute(new ARunnableS112S0100000_12(this, str, 140));
        return null;
    }
}
