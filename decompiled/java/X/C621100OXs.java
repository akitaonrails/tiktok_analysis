package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621100OXs implements InterfaceC0148002o {
    public final C621040OXm LL;
    public final EnumC621120OXu LLILLJJLI;

    public C621100OXs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C621100OXs)) {
            return false;
        }
        C621100OXs c621100OXs = (C621100OXs) obj;
        return Intrinsics.LJFF(this.LL, c621100OXs.LL) && this.LLILLJJLI == c621100OXs.LLILLJJLI;
    }

    public final int hashCode() {
        C621040OXm c621040OXm = this.LL;
        return ((c621040OXm == null ? 0 : c621040OXm.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareMusicPlayState(playingItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playingStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C621100OXs(int i) {
        this(null, EnumC621120OXu.DEFAULT);
    }

    public C621100OXs(C621040OXm c621040OXm, EnumC621120OXu enumC621120OXu) {
        this.LL = c621040OXm;
        this.LLILLJJLI = enumC621120OXu;
    }
}
