package X;

/* JADX INFO: renamed from: X.0wE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772550wE9 extends AbstractC1771860wD2 {
    public InterfaceC1772410wDv LLILLL;
    public boolean LLILZ = true;

    @Override // X.AbstractC1771860wD2
    public final void LJII() {
        this.LLILZ = true;
    }

    @Override // X.AbstractC1771860wD2
    public final void LJIIJJI() {
        if (this.LLILZ) {
            if (this.LLILLL == null) {
                this.LLILLL = C1774010wGV.LIZ(LIZIZ().LIZJ());
            }
            InterfaceC1772410wDv interfaceC1772410wDv = this.LLILLL;
            if (interfaceC1772410wDv != null) {
                interfaceC1772410wDv.LJII();
            }
        }
        this.LLILZ = false;
    }

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallTryPlay", new InterfaceC1775150wIL() { // from class: X.0wE5
            /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r7, java.util.Map r8, X.C21175917tt r9) {
                /*
                    r6 = this;
                    java.lang.String r0 = "play"
                    java.lang.Object r5 = X.C7726030a.LIZ(r0, r7)
                    boolean r0 = r5 instanceof java.lang.Integer
                    r4 = 0
                    if (r0 == 0) goto L9e
                    java.lang.Integer r5 = (java.lang.Integer) r5
                Ld:
                    r2 = 1
                    if (r5 == 0) goto L18
                    int r0 = r5.intValue()
                    if (r0 != r2) goto L94
                    java.lang.Boolean r4 = java.lang.Boolean.TRUE
                L18:
                    X.0wE9 r1 = r6.LIZ
                    X.0wDv r0 = r1.LLILLL
                    if (r0 != 0) goto L2c
                    X.0wFN r0 = r1.LIZIZ()
                    X.0wGJ r0 = r0.LIZJ()
                    X.0wDv r0 = X.C1774010wGV.LIZ(r0)
                    r1.LLILLL = r0
                L2c:
                    X.0wDv r3 = r1.LLILLL
                    if (r4 != 0) goto L6c
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Invalid params: play param can only be 0 or 1, but got "
                    r1.append(r0)
                    r1.append(r5)
                    java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
                L40:
                    r4 = 0
                L41:
                    X.0Nfo r3 = X.C599820Nfo.LIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "ecMixMallTryPlay: success: "
                    r1.append(r0)
                    r1.append(r4)
                    java.lang.String r0 = ", msg: "
                    r1.append(r0)
                    r1.append(r5)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    r3.getClass()
                    java.lang.String r0 = "MixMallPlayEvent"
                    X.C599820Nfo.LIZ(r0, r1)
                    if (r4 == 0) goto La1
                    java.lang.String r1 = "success"
                    r0 = 0
                    r9.LIZ(r2, r1, r0)
                    return
                L6c:
                    if (r3 != 0) goto L71
                    java.lang.String r5 = "PlayService not found"
                    goto L40
                L71:
                    boolean r0 = r4.booleanValue()
                    java.lang.String r1 = "ecMixMallTryPlay"
                    if (r0 == 0) goto L88
                    X.0Nfo r0 = X.C599820Nfo.LIZ
                    r0.getClass()
                    X.C599820Nfo.LIZLLL()
                    r3.LIZ(r1)
                L84:
                    java.lang.String r5 = ""
                    r4 = 1
                    goto L41
                L88:
                    X.0Nfo r0 = X.C599820Nfo.LIZ
                    r0.getClass()
                    X.C599820Nfo.LIZLLL()
                    r3.LJIILLIIL(r1, r2)
                    goto L84
                L94:
                    int r0 = r5.intValue()
                    if (r0 != 0) goto L18
                    java.lang.Boolean r4 = java.lang.Boolean.FALSE
                    goto L18
                L9e:
                    r5 = r4
                    goto Ld
                La1:
                    r1 = 0
                    r0 = 0
                    r9.LIZ(r1, r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1772510wE5.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
    }
}
