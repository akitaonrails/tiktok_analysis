package X;

import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461460I7s implements InterfaceC461490I7v {
    public final C0IB0 LL;
    public final CharSequence LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C461460I7s) && Intrinsics.LJFF(this.LL, ((C461460I7s) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextBigEmojiSkeletonLayoutDataReceive(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC461490I7v
    public final CharSequence LJIILL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
    }

    public C461460I7s(C0IB0 c0ib0) {
        String text;
        this.LL = c0ib0;
        TextContent textContent = (TextContent) BaseContentParserKt.getOrParseJsonContent(LLILII().LIZ.LIZ, TextContent.class);
        this.LLILLJJLI = (textContent == null || (text = textContent.getText()) == null) ? "" : text;
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
        return C461480I7u.LIZ(this, interfaceC1891350zJl);
    }
}
