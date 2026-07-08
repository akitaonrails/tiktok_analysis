package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652430PiT implements InterfaceC652490PiZ, InterfaceC435450H5r {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL = null;
    public final C650430PfF LLILZ = new C650430PfF(new AwS589S0100000_10(this, 180));
    public final int LLILZIL;
    public final int LLILZLL;

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C652430PiT)) {
            return false;
        }
        C652430PiT c652430PiT = (C652430PiT) obj;
        return Intrinsics.LJFF(this.LL, c652430PiT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c652430PiT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c652430PiT.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSubCardRenderDataImpl(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC436740HAq
    public final SearchMixFeed LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC435450H5r
    public final int LJIIJJI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC435450H5r
    public final int getIndex() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C652430PiT) {
            if (areItemTheSame(interfaceC1891350zJl) && this.LLILZIL == ((C652430PiT) interfaceC1891350zJl).LLILZIL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C652430PiT) {
            return Intrinsics.LJFF(this.LLILLJJLI.getAid(), ((C652430PiT) interfaceC1891350zJl).LLILLJJLI.getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C652430PiT(SearchMixFeed searchMixFeed, Aweme aweme) {
        int i;
        TakoInfo bot;
        Integer messageType;
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
        this.LLILZIL = LIZIZ(aweme, searchMixFeed) + 1;
        if (searchMixFeed != null && searchMixFeed.isTako() && (bot = searchMixFeed.getBot()) != null && (messageType = bot.getMessageType()) != null && messageType.intValue() != 201) {
            messageType.intValue();
        }
        if (C0BQH.LIZ()) {
            i = 8;
        } else {
            i = 4;
        }
        this.LLILZLL = i;
    }

    public static int LIZIZ(Aweme aweme, SearchMixFeed searchMixFeed) {
        TakoInfo bot;
        List<Aweme> awemeList;
        String aid;
        if (searchMixFeed != null && searchMixFeed.isTako() && (bot = searchMixFeed.getBot()) != null && (awemeList = bot.getAwemeList()) != null) {
            Iterator<Aweme> it2 = awemeList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String aid2 = it2.next().getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(aid2, aid)) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
}
