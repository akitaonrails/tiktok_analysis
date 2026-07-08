package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.DramaContentType;
import com.ss.android.ugc.aweme.model.DramaFeedCardInsertScene;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.nujinsertion.DramaNUJInsertionTask;
import com.ss.android.ugc.aweme.series.feed.nujinsertion.component.DramaNUJCardPanelComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0r9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1577370r9L implements InterfaceC1577280r9C {
    public final C1577390r9N LIZ;
    public final C1577380r9M LIZIZ;
    public final INUJUnderTakeManager LIZJ;
    public final C01GW LIZLLL;

    @Override // X.InterfaceC1577280r9C
    public final void LJI() {
    }

    @Override // X.InterfaceC1577280r9C
    public final C19719912Dl LJIIL() {
        return C13LE.LIZ(DramaNUJCardPanelComponent.class);
    }

    @Override // X.InterfaceC1577280r9C
    public final void LIZ() {
        this.LIZIZ.LIZJ = true;
        C1577320r9G c1577320r9G = C1577320r9G.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1577320r9G.getClass();
        long j = jCurrentTimeMillis - C1577320r9G.LIZIZ;
        C1577320r9G.LIZIZ(c1577320r9G, EnumC1577400r9O.NUJ_FINISHED, null, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, C1577320r9G.LIZJ, null, C1577320r9G.LIZLLL, Boolean.valueOf(C1577320r9G.LJFF), null, 311166);
    }

    @Override // X.InterfaceC1577280r9C
    public final void LIZIZ() {
        C1577380r9M c1577380r9M = this.LIZIZ;
        if (c1577380r9M != null) {
            C1577390r9N c1577390r9N = c1577380r9M.LIZ;
            ((ArrayList) c1577390r9N.LJI).clear();
            c1577390r9N.LIZLLL = null;
            C11JF c11jf = c1577390r9N.LIZJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C11JF c11jf2 = c1577390r9N.LJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
        }
    }

    @Override // X.InterfaceC1577280r9C
    public final C11NZ<MiniDramaTabConfigResponse> LIZLLL() {
        this.LIZ.getClass();
        C1578500rBA.LIZ.getClass();
        InterfaceC1577430r9R interfaceC1577430r9RLIZ = C1578500rBA.LIZ();
        if (interfaceC1577430r9RLIZ != null) {
            return interfaceC1577430r9RLIZ.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1577280r9C
    public final boolean LJ() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC1577280r9C
    public final EnumC2006807ta LJFF() {
        return this.LIZIZ.LJI;
    }

    @Override // X.InterfaceC1577280r9C
    public final MiniDramaFeedCardResponse LJII() {
        return this.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC1577280r9C
    public final void LJIIIZ() {
        this.LIZIZ.LJ = true;
    }

    @Override // X.InterfaceC1577280r9C
    public final boolean LJIIJ() {
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = this.LIZ.LIZLLL;
        return (miniDramaFeedCardResponse != null ? miniDramaFeedCardResponse.getContentType() : null) == DramaContentType.DRAMA_CONTENT_TYPE_VIDEO && !this.LIZIZ.LIZLLL;
    }

    @Override // X.InterfaceC1577280r9C
    public final boolean LJIILIIL() {
        return this.LIZIZ.LJ;
    }

    @Override // X.InterfaceC1577280r9C
    public final Aweme LJIILLIIL() {
        Aweme tabFallbackAweme;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C1577390r9N c1577390r9N = this.LIZ;
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = c1577390r9N.LIZLLL;
        if ((miniDramaFeedCardResponse != null ? miniDramaFeedCardResponse.getContentType() : null) != DramaContentType.DRAMA_CONTENT_TYPE_VIDEO) {
            return null;
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (((iSeriesFeedServiceLIZIZ == null || (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) == null) ? null : interfaceC1577280r9CLIZ.LJFF()) == EnumC2006807ta.DRAMA_TAB_PRELOAD) {
            MiniDramaFeedCardResponse miniDramaFeedCardResponse2 = c1577390r9N.LIZLLL;
            if (miniDramaFeedCardResponse2 != null) {
                return miniDramaFeedCardResponse2.getCardInfo();
            }
            return null;
        }
        MiniDramaFeedCardResponse miniDramaFeedCardResponse3 = c1577390r9N.LIZLLL;
        if ((miniDramaFeedCardResponse3 != null ? miniDramaFeedCardResponse3.getInsertScene() : null) != DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB) {
            MiniDramaFeedCardResponse miniDramaFeedCardResponse4 = c1577390r9N.LIZLLL;
            if (miniDramaFeedCardResponse4 != null) {
                return miniDramaFeedCardResponse4.getCardInfo();
            }
            return null;
        }
        MiniDramaFeedCardResponse miniDramaFeedCardResponse5 = c1577390r9N.LIZLLL;
        if (miniDramaFeedCardResponse5 != null && (tabFallbackAweme = miniDramaFeedCardResponse5.getTabFallbackAweme()) != null) {
            return tabFallbackAweme;
        }
        MiniDramaFeedCardResponse miniDramaFeedCardResponse6 = c1577390r9N.LIZLLL;
        if (miniDramaFeedCardResponse6 != null) {
            return miniDramaFeedCardResponse6.getCardInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1577280r9C
    public final void LJIIZILJ() {
        this.LIZIZ.LIZLLL = true;
    }

    @Override // X.InterfaceC1577280r9C
    public final DramaNUJInsertionTask LJIJ() {
        return (DramaNUJInsertionTask) this.LIZLLL.getValue();
    }

    public C1577370r9L() {
        C1577390r9N c1577390r9N = new C1577390r9N();
        this.LIZ = c1577390r9N;
        this.LIZIZ = new C1577380r9M(c1577390r9N);
        INUJUnderTakeManager.LIZ.getClass();
        this.LIZJ = C1589520rSw.LIZ();
        this.LIZLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 917));
    }

    @Override // X.InterfaceC1577280r9C
    public final INUJUnderTakeManager LJIILJJIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1577280r9C
    public final void LIZJ(EnumC2006807ta enumC2006807ta) {
        this.LIZIZ.LJI = enumC2006807ta;
    }

    @Override // X.InterfaceC1577280r9C
    public final void LJIIIIZZ(InterfaceC1577470r9V interfaceC1577470r9V) {
        Integer numValueOf;
        C1577390r9N c1577390r9N = this.LIZ;
        List<InterfaceC1577470r9V> list = c1577390r9N.LJI;
        if (list != null) {
            ((ArrayList) list).remove(interfaceC1577470r9V);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeDramaNUJDataListener rest list : ");
        List<InterfaceC1577470r9V> list2 = c1577390r9N.LJI;
        if (list2 != null) {
            numValueOf = Integer.valueOf(((ArrayList) list2).size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1577280r9C
    public final int LJIIJJI(List<Aweme> list) {
        Aweme cardInfo;
        C1577380r9M c1577380r9M = this.LIZIZ;
        MiniDramaFeedCardResponse miniDramaFeedCardResponse = c1577380r9M.LIZIZ;
        if (miniDramaFeedCardResponse != null && (cardInfo = miniDramaFeedCardResponse.getCardInfo()) != null) {
            if (miniDramaFeedCardResponse.getInsertScene() == DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_FYP) {
                AwemeExtKt.appendMobParam(cardInfo, "is_from_series_dnu_insertion", "1");
                AwemeExtKt.appendMobParam(cardInfo, "series_dnu_insertion_position", "2");
                ListProtector.add(list, 1, cardInfo);
                return 1;
            }
            if (miniDramaFeedCardResponse.getInsertScene() == DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_INNER_FEED) {
                c1577380r9M.LJ = true;
                AwemeExtKt.appendMobParam(cardInfo, "is_from_series_dnu_insertion", "1");
                AwemeExtKt.appendMobParam(cardInfo, "series_dnu_insertion_position", "1");
                ListProtector.add(list, 0, cardInfo);
                return 0;
            }
            miniDramaFeedCardResponse.getInsertScene();
            DramaFeedCardInsertScene dramaFeedCardInsertScene = DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB;
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1577280r9C
    public final void LJIILL(InterfaceC1577470r9V interfaceC1577470r9V) {
        this.LIZ.LIZ(interfaceC1577470r9V);
    }
}
