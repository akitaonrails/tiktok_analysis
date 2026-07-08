package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProcessInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1858660yT2 implements InterfaceC1857950yRt, InterfaceC1858700yT6, InterfaceC1861810yY7, InterfaceC1859270yU1 {
    public final C326880Cre LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final TakoMixFeed LLILZLL;
    public final int LLIZ;
    public final List<TakoProcessInfo> LLIZLLLIL;
    public final boolean LLJ;
    public final List<TakoInteractionConfig> LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;
    public final List<TakoSourceItem> LLJILJILJ;
    public final Long LLJILLL;
    public Boolean LLJJ;
    public final int LLJJI;
    public final boolean LLJJIII;

    @Override // X.InterfaceC1857950yRt
    public final int LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1857950yRt
    public final List<TakoProcessInfo> LJJIFFI() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1859270yU1
    public final Boolean LJJIL() {
        return this.LLJJ;
    }

    public boolean LJJJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1861810yY7
    public final C326880Cre LJJJJZI() {
        return this.LL;
    }

    @Override // X.InterfaceC1859270yU1
    public final Long LJJLIIIIJ() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1859270yU1
    public final int LJJLIIIJL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1858700yT6
    public final List<TakoInteractionConfig> LJJZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1859270yU1
    public final String LLIIIL() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1859270yU1
    public final boolean LLILIL() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1859270yU1
    public final int LLJJJJ() {
        return this.LLJJI;
    }

    public final String getUuid() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProcessInfo>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    public C1858660yT2(C326880Cre c326880Cre) {
        int iLJFF;
        ?? arrayList;
        boolean z;
        String str;
        List<TakoSourceItem> list;
        List<TakoInteractionConfig> list2;
        TakoMixFeed takoMixFeedLJIIIZ;
        List<TakoProcessInfo> list3;
        this.LL = c326880Cre;
        Message message = c326880Cre.LLILLL;
        this.LLILLJJLI = message.uuid;
        this.LLILLL = message.subSessionId;
        this.LLILZ = message.actionId;
        this.LLILZIL = message.botId;
        TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
        this.LLILZLL = takoMixFeedLJIIIZ2;
        int iLJFF2 = -1;
        if (!C07IB.LIZ()) {
            iLJFF = c326880Cre.LLILLL.LJFF();
        } else if (takoMixFeedLJIIIZ2 != null) {
            iLJFF = takoMixFeedLJIIIZ2.status;
        } else {
            iLJFF = -1;
        }
        this.LLIZ = iLJFF;
        TakoMixFeed takoMixFeedLJIIIZ3 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null && (list3 = takoMixFeedLJIIIZ3.processInfo) != null) {
            arrayList = new ArrayList();
            for (TakoProcessInfo takoProcessInfo : list3) {
                if (takoProcessInfo.stage != 0) {
                    arrayList.add(takoProcessInfo);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLIZLLLIL = arrayList;
        if (this.LL.LLILLL.LIZIZ != 7 && (C07IB.LIZ() ? (takoMixFeedLJIIIZ = this.LL.LLILLL.LJIIIZ()) == null || takoMixFeedLJIIIZ.status != 4 : this.LL.LLILLL.LJFF() != 4)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        List listLJIIJJI = C1697810uHb.LJIIJJI(new TakoInteractionConfig(1, 2), new TakoInteractionConfig(2, 2));
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (true) {
            TakoInteractionConfig takoInteractionConfig = null;
            if (!it2.hasNext()) {
                break;
            }
            TakoInteractionConfig takoInteractionConfig2 = (TakoInteractionConfig) it2.next();
            TakoMixFeed takoMixFeed = this.LLILZLL;
            if (takoMixFeed != null && (list2 = takoMixFeed.interactionStatus) != null) {
                Iterator<TakoInteractionConfig> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    TakoInteractionConfig next = it3.next();
                    if (Intrinsics.LJFF(takoInteractionConfig2.type, next.type)) {
                        takoInteractionConfig = next;
                        break;
                    }
                }
                TakoInteractionConfig takoInteractionConfig3 = takoInteractionConfig;
                if (takoInteractionConfig3 != null) {
                    takoInteractionConfig2 = new TakoInteractionConfig(takoInteractionConfig2.type, takoInteractionConfig3.status);
                }
            }
            arrayList2.add(takoInteractionConfig2);
        }
        this.LLJI = arrayList2;
        if (!C07IB.LIZ()) {
            iLJFF2 = this.LL.LLILLL.LJFF();
        } else {
            TakoMixFeed takoMixFeed2 = this.LLILZLL;
            if (takoMixFeed2 != null) {
                iLJFF2 = takoMixFeed2.status;
            }
        }
        this.LLJIJIL = iLJFF2;
        TakoMixFeed takoMixFeed3 = this.LLILZLL;
        if (takoMixFeed3 != null) {
            str = takoMixFeed3.thinkContent;
        } else {
            str = null;
        }
        this.LLJILJIL = str;
        if (takoMixFeed3 != null) {
            list = takoMixFeed3.sources;
        } else {
            list = null;
        }
        this.LLJILJILJ = list;
        this.LLJILLL = takoMixFeed3 != null ? takoMixFeed3.thinkCostS : null;
        Boolean bool = this.LL.LLILLL.LJIIIIZZ;
        this.LLJJ = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        Message message2 = this.LL.LLILLL;
        this.LLJJI = message2.LIZIZ;
        this.LLJJIII = C1858670yT3.LJFF(message2);
    }

    @Override // X.InterfaceC1859270yU1
    public final void LLJJIJIIJIL(Boolean bool) {
        this.LLJJ = bool;
    }
}
