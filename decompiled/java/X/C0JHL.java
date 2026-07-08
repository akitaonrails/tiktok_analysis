package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JHL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHL implements InterfaceC0148002o {
    public final AbstractC489130JGd LL;
    public final AbstractC489130JGd LLILLJJLI;
    public final InterfaceC489200JGk LLILLL;
    public final boolean LLILZ;
    public PublishModel LLILZIL;
    public final String LLILZLL;

    public C0JHL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JHL)) {
            return false;
        }
        C0JHL c0jhl = (C0JHL) obj;
        return Intrinsics.LJFF(this.LL, c0jhl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jhl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jhl.LLILLL) && this.LLILZ == c0jhl.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0jhl.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0jhl.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        InterfaceC489200JGk interfaceC489200JGk = this.LLILLL;
        int iHashCode2 = (((iHashCode + (interfaceC489200JGk == null ? 0 : interfaceC489200JGk.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        PublishModel publishModel = this.LLILZIL;
        return ((iHashCode2 + (publishModel != null ? publishModel.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoReEditVMState(downloadVideoStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", editPublishStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", video=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isEdited=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", publishModel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0JHL(int i) {
        C488560JDy c488560JDy = C488560JDy.LIZ;
        this(c488560JDy, c488560JDy, null, false, null, "");
    }

    public C0JHL(AbstractC489130JGd abstractC489130JGd, AbstractC489130JGd abstractC489130JGd2, InterfaceC489200JGk interfaceC489200JGk, boolean z, PublishModel publishModel, String str) {
        this.LL = abstractC489130JGd;
        this.LLILLJJLI = abstractC489130JGd2;
        this.LLILLL = interfaceC489200JGk;
        this.LLILZ = z;
        this.LLILZIL = publishModel;
        this.LLILZLL = str;
    }

    public static C0JHL LIZ(C0JHL c0jhl, AbstractC489130JGd abstractC489130JGd, AbstractC489130JGd abstractC489130JGd2, InterfaceC489200JGk interfaceC489200JGk, boolean z, PublishModel publishModel, String str, int i) {
        String str2 = str;
        PublishModel publishModel2 = publishModel;
        boolean z2 = z;
        InterfaceC489200JGk interfaceC489200JGk2 = interfaceC489200JGk;
        AbstractC489130JGd abstractC489130JGd3 = abstractC489130JGd2;
        AbstractC489130JGd abstractC489130JGd4 = abstractC489130JGd;
        if ((i & 1) != 0) {
            abstractC489130JGd4 = c0jhl.LL;
        }
        if ((i & 2) != 0) {
            abstractC489130JGd3 = c0jhl.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            interfaceC489200JGk2 = c0jhl.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c0jhl.LLILZ;
        }
        if ((i & 16) != 0) {
            publishModel2 = c0jhl.LLILZIL;
        }
        if ((i & 32) != 0) {
            str2 = c0jhl.LLILZLL;
        }
        c0jhl.getClass();
        return new C0JHL(abstractC489130JGd4, abstractC489130JGd3, interfaceC489200JGk2, z2, publishModel2, str2);
    }
}
