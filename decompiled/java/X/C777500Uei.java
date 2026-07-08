package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Uei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777500Uei extends AbstractC777950UfR {
    public final int LJ;
    public final CharSequence LJFF;
    public final PunishEventInfo LJI;
    public final String LJII;
    public final EnumC777930UfP LJIIIIZZ;
    public final EnumC777480Ueg LJIIIZ;
    public final CharSequence LJIIJ;

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return this.LJIIIZ;
    }

    public C777500Uei(int i, CharSequence charSequence, PunishEventInfo punishEventInfo, Integer num, String str) {
        EnumC777930UfP enumC777930UfP;
        String str2;
        InterfaceC778710Ugf interfaceC778710Ugf;
        this.LJ = i;
        this.LJFF = charSequence;
        this.LJI = punishEventInfo;
        this.LJII = str;
        if (i != 1) {
            if (i != 999) {
                enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P1;
            } else {
                enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P2;
            }
        } else {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P0;
        }
        this.LJIIIIZZ = enumC777930UfP;
        this.LJIIIZ = EnumC777480Ueg.NOTICE_CENTER;
        this.LJIIJ = charSequence;
        if (punishEventInfo != null) {
            str2 = punishEventInfo.punishId;
        } else {
            str2 = null;
        }
        this.LIZLLL = str2;
        if (num != null && num.intValue() != 0) {
            final int iLIZ = C777180UeC.LIZ(num.intValue());
            interfaceC778710Ugf = new AbstractC777520Uek(iLIZ) { // from class: X.0Uej
                public final int LIZ;
                public final int LIZIZ;

                @Override // X.AbstractC777520Uek
                public final int LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC777520Uek
                public final int LIZIZ() {
                    return this.LIZ;
                }

                {
                    int iIntValue;
                    this.LIZ = iLIZ;
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.etr, C497740JfY.LJII());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -46022;
                    }
                    this.LIZIZ = iIntValue;
                }
            };
        } else {
            interfaceC778710Ugf = new AbstractC777790UfB(this) { // from class: X.0Ues
                public final EnumC777770Uf9 LIZ;

                @Override // X.AbstractC777790UfB
                public final EnumC777770Uf9 LIZ() {
                    return this.LIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
                {
                    /*
                        r2 = this;
                        r2.<init>()
                        int r1 = r3.LJ
                        r0 = 1
                        if (r1 == r0) goto L26
                        r0 = 2
                        if (r1 == r0) goto L23
                        r0 = 3
                        if (r1 == r0) goto L23
                        r0 = 4
                        if (r1 == r0) goto L23
                        r0 = 6
                        if (r1 == r0) goto L23
                        r0 = 7
                        if (r1 == r0) goto L20
                        r0 = 999(0x3e7, float:1.4E-42)
                        if (r1 == r0) goto L23
                        X.0Uf9 r0 = X.EnumC777770Uf9.NULL
                    L1d:
                        r2.LIZ = r0
                        return
                    L20:
                        X.0Uf9 r0 = X.EnumC777770Uf9.TICK
                        goto L1d
                    L23:
                        X.0Uf9 r0 = X.EnumC777770Uf9.TRIANGLE_WARNING_RED
                        goto L1d
                    L26:
                        X.0Uf9 r0 = X.EnumC777770Uf9.TRIANGLE_WARNING_WHITE
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C777600Ues.<init>(X.0Uei):void");
                }
            };
        }
        this.LIZ = interfaceC778710Ugf;
        this.LIZIZ = new AbstractC777790UfB(this) { // from class: X.0Uer
            public final EnumC777770Uf9 LIZ;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0026  */
            {
                /*
                    r2 = this;
                    r2.<init>()
                    int r1 = r3.LJ
                    r0 = 1
                    if (r1 == r0) goto L26
                    r0 = 2
                    if (r1 == r0) goto L23
                    r0 = 3
                    if (r1 == r0) goto L23
                    r0 = 4
                    if (r1 == r0) goto L20
                    r0 = 6
                    if (r1 == r0) goto L26
                    r0 = 7
                    if (r1 == r0) goto L23
                    r0 = 999(0x3e7, float:1.4E-42)
                    if (r1 == r0) goto L23
                    X.0Uf9 r0 = X.EnumC777770Uf9.NULL
                L1d:
                    r2.LIZ = r0
                    return
                L20:
                    X.0Uf9 r0 = X.EnumC777770Uf9.NULL
                    goto L1d
                L23:
                    X.0Uf9 r0 = X.EnumC777770Uf9.CLOSE
                    goto L1d
                L26:
                    X.0Uf9 r0 = X.EnumC777770Uf9.BACK
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C777590Uer.<init>(X.0Uei):void");
            }
        };
    }

    public /* synthetic */ C777500Uei(int i, CharSequence charSequence, PunishEventInfo punishEventInfo, Integer num, int i2) {
        this(i, charSequence, punishEventInfo, (i2 & 8) != 0 ? null : num, (String) null);
    }
}
