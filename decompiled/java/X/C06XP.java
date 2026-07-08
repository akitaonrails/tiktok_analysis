package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06XP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06XP {
    public final C869590Y9l LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C06XP(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C06XP)) {
            return false;
        }
        C06XP c06xp = (C06XP) obj;
        if (!Intrinsics.LJFF(c06xp.LIZ.getUuid(), this.LIZ.getUuid()) || !Intrinsics.LJFF(c06xp.LIZ.getContent(), this.LIZ.getContent()) || !Intrinsics.LJFF(c06xp.LIZ.getContentPB(), this.LIZ.getContentPB()) || c06xp.LIZ.getMsgId() != this.LIZ.getMsgId() || c06xp.LIZ.getIndex() != this.LIZ.getIndex()) {
            return false;
        }
        return true;
    }
}
