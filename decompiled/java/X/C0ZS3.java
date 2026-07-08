package X;

import com.ss.android.ugc.aweme.im.message.content.TextContent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZS3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZS3 implements C0ZS7 {
    public final C0IB0 LL;
    public final C0ZXS LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final CharSequence LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZS3)) {
            return false;
        }
        C0ZS3 c0zs3 = (C0ZS3) obj;
        return Intrinsics.LJFF(this.LL, c0zs3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zs3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zs3.LLILLL) && this.LLILZ == c0zs3.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextTranslateReceiveData(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bubbleConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceLanguage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isCustomizeScreenMock=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZS7
    public final String LLIFFJFJJ() {
        return C0ZS5.LIZJ(this);
    }

    @Override // X.C0ZS7
    public final TextContent getContent() {
        return C0ZS5.LIZIZ(this);
    }

    @Override // X.C0ZS7
    public final C0ZXS LJII() {
        return this.LLILLJJLI;
    }

    @Override // X.C0ZS7, X.C0ZS8
    public final CharSequence LJIILL() {
        return this.LLILZIL;
    }

    @Override // X.C0ZS7
    public final boolean LJJJJLL() {
        return this.LLILZ;
    }

    @Override // X.C0ZS7
    public final String LJLJLLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
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
        return C0ZS5.LIZ(this, interfaceC1891350zJl);
    }

    public C0ZS3(C0IB0 c0ib0, C0ZXS c0zxs, String str, boolean z) {
        String text;
        String string;
        this.LL = c0ib0;
        this.LLILLJJLI = c0zxs;
        this.LLILLL = str;
        this.LLILZ = z;
        TextContent textContentLIZIZ = C0ZS5.LIZIZ(this);
        this.LLILZIL = (textContentLIZIZ == null || (text = textContentLIZIZ.getText()) == null || (string = a0.LJLIIIL(text).toString()) == null) ? "" : string;
    }
}
