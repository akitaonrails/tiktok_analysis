package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0316, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0316 extends AbstractC756202xM {
    public final EmailAuthorizationInfo LLILZLL;
    public final String LLIZ = "email_authorization";
    public final String LLIZLLLIL = "email_authorization_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0316) && Intrinsics.LJFF(this.LLILZLL, ((AnonymousClass0316) obj).LLILZLL);
    }

    public final int hashCode() {
        return this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USEmailAuthorizeVO(emailAuthorizationInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public AnonymousClass0316(EmailAuthorizationInfo emailAuthorizationInfo) {
        this.LLILZLL = emailAuthorizationInfo;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(AnonymousClass0316.class, interfaceC1891350zJl.getClass());
    }
}
