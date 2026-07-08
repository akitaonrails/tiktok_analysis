package X;

/* JADX INFO: renamed from: X.0fGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120570fGZ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1.equals("prop") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r1.equals("match") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r1.equals("exclusive") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r1.equals("backpack") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        return X.EnumC1120600fGc.EXCLUSIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        return X.EnumC1120600fGc.BACKPACK;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC1120600fGc LIZ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case 3172656: goto La;
                case 3449699: goto L15;
                case 103668165: goto L1e;
                case 104263205: goto L27;
                case 1686617758: goto L32;
                case 1844104930: goto L3b;
                case 2121767808: goto L46;
                default: goto L7;
            }
        L7:
            X.0fGc r0 = X.EnumC1120600fGc.DEFAULT
            return r0
        La:
            java.lang.String r0 = "gift"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            X.0fGc r0 = X.EnumC1120600fGc.GIFT
            return r0
        L15:
            java.lang.String r0 = "prop"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            goto L7
        L1e:
            java.lang.String r0 = "match"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L52
            goto L7
        L27:
            java.lang.String r0 = "music"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            X.0fGc r0 = X.EnumC1120600fGc.MUSIC
            return r0
        L32:
            java.lang.String r0 = "exclusive"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            goto L7
        L3b:
            java.lang.String r0 = "interactive"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            X.0fGc r0 = X.EnumC1120600fGc.INTERACTIVE
            return r0
        L46:
            java.lang.String r0 = "backpack"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L52
            goto L7
        L4f:
            X.0fGc r0 = X.EnumC1120600fGc.EXCLUSIVE
            return r0
        L52:
            X.0fGc r0 = X.EnumC1120600fGc.BACKPACK
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1120570fGZ.LIZ(java.lang.String):X.0fGc");
    }
}
