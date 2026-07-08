package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0S7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent$fullAwemeCallback$2$1$onFullAwemeFetchSuccessVhs$1", f = "StoryPaywallComponentTrigger.kt", l = {216}, m = "invokeSuspend")
public final class C716330S7z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public IPlayerComponentAbility LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent LLILZLL;
    public final /* synthetic */ List<C0S81> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716330S7z(StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent, List<C0S81> list, InterfaceC1364105Vn<? super C716330S7z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = storyPaywallCellOverlayComponent;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C716330S7z(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set setLLIIJI;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        Iterator it2;
        int i;
        Aweme awemeLJIIIIZZ;
        C0S8S c0s8s;
        String aid;
        boolean z;
        C0N0Y playerManager;
        C0N0Y playerManager2;
        Aweme awemeLJIIIIZZ2;
        C1C7U.LIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.fullAwemeCallback$2$1$onFullAwemeFetchSuccessVhs$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZ;
                it2 = (Iterator) this.LLILLL;
                iPlayerComponentAbilityX32 = this.LLILLJJLI;
                setLLIIJI = (Set) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent = this.LLILZLL;
            storyPaywallCellOverlayComponent.LLLI = true;
            storyPaywallCellOverlayComponent.Fp();
            List<C0S81> list = this.LLIZ;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (C0S81 c0s81 : list) {
                C0S8V c0s8v = c0s81.LIZIZ;
                Aweme aweme = c0s81.LIZ;
                c0s8v.getClass();
                Pair pair = new Pair(aweme.getAid(), c0s81.LIZ);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<C0S81> list2 = this.LLIZ;
            ArrayList arrayList = new ArrayList();
            for (C0S81 c0s812 : list2) {
                C0S8V c0s8v2 = c0s812.LIZIZ;
                Aweme aweme2 = c0s812.LIZ;
                c0s8v2.getClass();
                C19719612Di.LJJI(C1697810uHb.LJIIJJI(c0s812.LIZ.getAid(), aweme2.getAid()), arrayList);
            }
            setLLIIJI = C13LP.LLIIJI(arrayList);
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLILZLL.LLLIIII.getValue();
            if (feedCollectionViewPagerAbility != null) {
                feedCollectionViewPagerAbility.xd0(linkedHashMap);
            }
            Iterator<C0S81> it3 = this.LLIZ.iterator();
            while (true) {
                iPlayerComponentAbilityX32 = null;
                String aid2 = null;
                if (!it3.hasNext()) {
                    break;
                }
                C0S81 next = it3.next();
                Aweme awemeLJIIIIZZ3 = this.LLILZLL.LJIIIIZZ();
                if (awemeLJIIIIZZ3 != null) {
                    aid2 = awemeLJIIIIZZ3.getAid();
                }
                if (Intrinsics.LJFF(aid2, next.LIZ.getAid()) && (c0s8s = this.LLILZLL.LLJZ) != null) {
                    C0S8V c0s8v3 = next.LIZIZ;
                    FrameLayout frameLayout = c0s8s.LIZ;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                    FrameLayout frameLayout2 = c0s8s.LIZIZ;
                    if (frameLayout2 != null) {
                        C786410Ut5.LJZ(8, frameLayout2);
                    }
                    ((C0S8T) c0s8s.LIZ(c0s8v3)).LIZLLL();
                }
            }
            StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent2 = this.LLILZLL;
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility2 = (FeedCollectionViewPagerAbility) storyPaywallCellOverlayComponent2.LLLIIII.getValue();
            if (feedCollectionViewPagerAbility2 == null || (awemeLJIIIIZZ = feedCollectionViewPagerAbility2.LJIIIIZZ()) == null || awemeLJIIIIZZ.getAid() == null) {
                storyPaywallCellOverlayComponent2.LJIIIIZZ().getAid();
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBp = this.LLILZLL.Bp();
            if (iFeedPanelPlatformAbilityBp != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityBp.x32()) != null) {
                iPlayerComponentAbilityX32.LLLLLLLLLL();
                iPlayerComponentAbilityX32.dO0(0.0f);
            }
            it2 = C1697810uHb.LJIIJJI(C2286608xc.LJFF(200L), C2286608xc.LJFF(500L), C2286608xc.LJFF(1000L), C2286608xc.LJFF(1000L), C2286608xc.LJFF(3000L), C2286608xc.LJFF(Mp4ScreenVideoLoadTimeout.CONTROL)).iterator();
            i = 0;
        }
        while (it2.hasNext()) {
            i++;
            long jLongValue = ((Number) it2.next()).longValue();
            StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent3 = this.LLILZLL;
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility3 = (FeedCollectionViewPagerAbility) storyPaywallCellOverlayComponent3.LLLIIII.getValue();
            if (feedCollectionViewPagerAbility3 == null || (awemeLJIIIIZZ2 = feedCollectionViewPagerAbility3.LJIIIIZZ()) == null || (aid = awemeLJIIIIZZ2.getAid()) == null) {
                aid = storyPaywallCellOverlayComponent3.LJIIIIZZ().getAid();
            }
            if (iPlayerComponentAbilityX32 != null && (playerManager2 = iPlayerComponentAbilityX32.getPlayerManager()) != null && playerManager2.isPlaying()) {
                z = true;
            } else {
                z = false;
            }
            if (setLLIIJI.contains(aid)) {
                if (!z) {
                    if (iPlayerComponentAbilityX32 != null) {
                        iPlayerComponentAbilityX32.tryResumePlay();
                        playerManager = iPlayerComponentAbilityX32.getPlayerManager();
                        if (playerManager != null && playerManager.isPlaying()) {
                            break;
                        }
                    }
                } else if (iPlayerComponentAbilityX32 != null) {
                    playerManager = iPlayerComponentAbilityX32.getPlayerManager();
                    if (playerManager != null) {
                        break;
                        break;
                    }
                }
            }
            this.LL = setLLIIJI;
            this.LLILLJJLI = iPlayerComponentAbilityX32;
            this.LLILLL = it2;
            this.LLILZ = i;
            this.LLILZIL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.fullAwemeCallback$2$1$onFullAwemeFetchSuccessVhs$1");
                return objLJFF;
            }
        }
        this.LLILZLL.LLLI = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.fullAwemeCallback$2$1$onFullAwemeFetchSuccessVhs$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
