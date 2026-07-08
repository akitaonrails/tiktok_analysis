package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.0avA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953540avA implements InterfaceC951230arR<Object> {
    public final C953550avB LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C953540avA)) {
            return false;
        }
        C953540avA c953540avA = (C953540avA) obj;
        return Intrinsics.LJFF(this.LIZ, c953540avA.LIZ) && this.LIZIZ == c953540avA.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateContentInfoWrapper(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C953540avA) {
            C953540avA c953540avA = (C953540avA) obj;
            if (this.LIZ.LIZIZ(c953540avA.LIZ) && c953540avA.LIZIZ == this.LIZIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951230arR
    public final Object LIZLLL(Object obj) {
        C953540avA c953540avA;
        if (!(obj instanceof C953540avA) || (c953540avA = (C953540avA) obj) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C953540avA c953540avA2 = (C953540avA) obj;
        if (this.LIZ.LIZIZ(c953540avA2.LIZ) && c953540avA2.LIZIZ != this.LIZIZ) {
            arrayList.add(C953590avF.LIZ);
            return arrayList;
        }
        C953550avB c953550avB = this.LIZ;
        int i = c953550avB.LIZIZ;
        C953550avB c953550avB2 = c953540avA.LIZ;
        if (i == c953550avB2.LIZIZ) {
            C953470av3 c953470av3 = C953470av3.LIZ;
            NoticeboardTemplate noticeboardTemplate = c953550avB.LIZ;
            NoticeboardTemplate noticeboardTemplate2 = c953550avB2.LIZ;
            Function1[] function1Arr = {AFwS250S0000000_15.get$arr$(135), AFwS250S0000000_15.get$arr$(136), AFwS250S0000000_15.get$arr$(137), AFwS250S0000000_15.get$arr$(138), AFwS250S0000000_15.get$arr$(139)};
            c953470av3.getClass();
            int i2 = 0;
            while (true) {
                Function1 function1 = function1Arr[i2];
                if (!Intrinsics.LJFF(function1.invoke(noticeboardTemplate), function1.invoke(noticeboardTemplate2))) {
                    break;
                }
                i2++;
                if (i2 >= 5) {
                    arrayList.add(C953580avE.LIZ);
                    if (c953540avA2.LIZIZ != this.LIZIZ) {
                        arrayList.add(C953590avF.LIZ);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        if ((obj instanceof C953540avA) && ((C953540avA) obj).LIZ.LIZ.noticeboardTemplateId == this.LIZ.LIZ.noticeboardTemplateId) {
            return true;
        }
        return false;
    }

    public C953540avA(C953550avB c953550avB, boolean z) {
        this.LIZ = c953550avB;
        this.LIZIZ = z;
    }
}
