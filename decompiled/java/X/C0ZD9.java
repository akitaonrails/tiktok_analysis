package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZD9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZD9 {
    public final C0ZDI LIZ;
    public final EnumC896030ZDd LIZIZ;
    public final boolean LIZJ;
    public final C0IB7 LIZLLL;
    public final Serializable LJ;
    public final String LJFF;
    public final AttachmentComponent LJI;
    public final ReferenceInfo LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZD9)) {
            return false;
        }
        C0ZD9 c0zd9 = (C0ZD9) obj;
        return this.LIZ == c0zd9.LIZ && this.LIZIZ == c0zd9.LIZIZ && this.LIZJ == c0zd9.LIZJ && this.LIZLLL == c0zd9.LIZLLL && Intrinsics.LJFF(this.LJ, c0zd9.LJ) && Intrinsics.LJFF(this.LJFF, c0zd9.LJFF) && Intrinsics.LJFF(this.LJI, c0zd9.LJI) && Intrinsics.LJFF(this.LJII, c0zd9.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NudgeInfo(frequencyControlType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageScenario=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableSendNudgeWithQuotedVideo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", quotedInfoType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", awemeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", attachmentComponent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", referenceInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZD9(C0ZDI c0zdi, EnumC896030ZDd enumC896030ZDd, boolean z, C0IB7 c0ib7, Serializable serializable, String str, AttachmentComponent attachmentComponent, ReferenceInfo referenceInfo, int i) {
        z = (i & 4) != 0 ? false : z;
        c0ib7 = (i & 8) != 0 ? C0IB7.NONE : c0ib7;
        serializable = (i & 16) != 0 ? null : serializable;
        str = (i & 32) != 0 ? "" : str;
        attachmentComponent = (i & 64) != 0 ? null : attachmentComponent;
        referenceInfo = (i & 128) != 0 ? null : referenceInfo;
        this.LIZ = c0zdi;
        this.LIZIZ = enumC896030ZDd;
        this.LIZJ = z;
        this.LIZLLL = c0ib7;
        this.LJ = serializable;
        this.LJFF = str;
        this.LJI = attachmentComponent;
        this.LJII = referenceInfo;
    }
}
