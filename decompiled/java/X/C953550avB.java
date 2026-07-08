package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.0avB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953550avB implements InterfaceC951240arS<Object> {
    public final NoticeboardTemplate LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C953550avB)) {
            return false;
        }
        C953550avB c953550avB = (C953550avB) obj;
        return Intrinsics.LJFF(this.LIZ, c953550avB.LIZ) && this.LIZIZ == c953550avB.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateContentInfo(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C953550avB) {
            C953550avB c953550avB = (C953550avB) obj;
            if (Intrinsics.LJFF(c953550avB.LIZ, this.LIZ) && c953550avB.LIZIZ == this.LIZIZ) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C953550avB;
    }

    public C953550avB(int i, NoticeboardTemplate noticeboardTemplate) {
        this.LIZ = noticeboardTemplate;
        this.LIZIZ = i;
    }
}
