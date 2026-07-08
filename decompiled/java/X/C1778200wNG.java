package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778200wNG extends AbstractC1778220wNI {
    public final C007B LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1778200wNG) && Intrinsics.LJFF(this.LIZIZ, ((C1778200wNG) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterGameBattle(frameETParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778200wNG(C007B c007b) {
        super(EnumC1778330wNT.ENTER_GAME_BATTLE);
        this.LIZIZ = c007b;
    }
}
