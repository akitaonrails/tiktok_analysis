package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857960yRu implements InterfaceC1891350zJl, InterfaceC1857730yRX {
    public final C326880Cre LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857960yRu) && Intrinsics.LJFF(this.LL, ((C1857960yRu) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMultiAnswerTabItem(anchorMessage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1857730yRX
    public final C326880Cre LLIIJLIL() {
        return this.LL;
    }

    public C1857960yRu(C326880Cre c326880Cre) {
        this.LL = c326880Cre;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857960yRu) {
            C1857960yRu c1857960yRu = (C1857960yRu) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL.LLILLL.uuid, c1857960yRu.LL.LLILLL.uuid)) {
                Message message = this.LL.LLILLL;
                int i = message.selectedAnswerIndex;
                Message message2 = c1857960yRu.LL.LLILLL;
                if (i == message2.selectedAnswerIndex && message.LJIIIZ == message2.LJIIIZ) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1857960yRu) && Intrinsics.LJFF(this.LL.LLILLL.uuid, ((C1857960yRu) interfaceC1891350zJl).LL.LLILLL.uuid)) {
            return true;
        }
        return false;
    }
}
