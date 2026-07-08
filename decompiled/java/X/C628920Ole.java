package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ole, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628920Ole extends C607770Nsd {
    public final Aweme LLILLJJLI;
    public final VibeFeedItem LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final EnumC628900Olc LLIZLLLIL;
    public final EnumC912680ZrG LLJ;
    public final String LLJI;

    @Override // X.C607770Nsd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628920Ole)) {
            return false;
        }
        C628920Ole c628920Ole = (C628920Ole) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c628920Ole.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c628920Ole.LLILLL) && Intrinsics.LJFF(this.LLILZ, c628920Ole.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c628920Ole.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c628920Ole.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c628920Ole.LLIZ) && this.LLIZLLLIL == c628920Ole.LLIZLLLIL && this.LLJ == c628920Ole.LLJ && Intrinsics.LJFF(this.LLJI, c628920Ole.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeDiggHistoryItem(aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", feedItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", date=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", feedScene=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C607770Nsd
    public final int hashCode() {
        return this.LLILLJJLI.getAid().hashCode();
    }

    @Override // X.C607770Nsd
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.C607770Nsd, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C628920Ole) {
            C628920Ole c628920Ole = (C628920Ole) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c628920Ole.LLILLJJLI.getAid(), this.LLILLJJLI.getAid()) && c628920Ole.LLIZLLLIL == this.LLIZLLLIL && Intrinsics.LJFF(c628920Ole.LLILZ, this.LLILZ)) {
                return true;
            }
            return false;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }

    public C628920Ole(Aweme aweme, VibeFeedItem vibeFeedItem, String str, String str2, String str3, String str4, EnumC628900Olc enumC628900Olc, EnumC912680ZrG enumC912680ZrG, String str5) {
        super(aweme);
        this.LLILLJJLI = aweme;
        this.LLILLL = vibeFeedItem;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = enumC628900Olc;
        this.LLJ = enumC912680ZrG;
        this.LLJI = str5;
    }
}
