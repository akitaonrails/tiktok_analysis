package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Olf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628930Olf implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI = "";
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final EnumC912680ZrG LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628930Olf)) {
            return false;
        }
        C628930Olf c628930Olf = (C628930Olf) obj;
        return Intrinsics.LJFF(this.LL, c628930Olf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c628930Olf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c628930Olf.LLILLL) && this.LLILZ == c628930Olf.LLILZ && Intrinsics.LJFF(this.LLILZIL, c628930Olf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c628930Olf.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c628930Olf.LLIZ) && this.LLIZLLLIL == c628930Olf.LLIZLLLIL;
    }

    public final int hashCode() {
        return (((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeDiggPageParam(toUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", feedId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", feedScene=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C628930Olf(String str, String str2, int i, String str3, String str4, String str5, EnumC912680ZrG enumC912680ZrG) {
        this.LL = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = enumC912680ZrG;
    }
}
