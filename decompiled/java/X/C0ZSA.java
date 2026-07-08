package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZSA implements C0ZSC {
    public final C0ZXS LL;
    public final C0IB0 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZSA)) {
            return false;
        }
        C0ZSA c0zsa = (C0ZSA) obj;
        return Intrinsics.LJFF(this.LL, c0zsa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zsa.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkdownSendData(bubbleConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZSC
    public final MarkdownMessageTemplate getContent() {
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(C0I6Y.LIZ(this), BaseTemplate.class);
        if (baseTemplateLIZ instanceof MarkdownMessageTemplate) {
            return (MarkdownMessageTemplate) baseTemplateLIZ;
        }
        return null;
    }

    @Override // X.C0ZSC
    public final C0ZXS LJII() {
        return this.LL;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C0ZSB.LIZ(this, interfaceC1891350zJl);
    }

    public C0ZSA(C0ZXS c0zxs, C0IB0 c0ib0) {
        this.LL = c0zxs;
        this.LLILLJJLI = c0ib0;
    }
}
