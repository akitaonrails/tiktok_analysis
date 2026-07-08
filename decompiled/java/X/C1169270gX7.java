package X;

import Y.AfS2S0100100_4;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.videodetail.JediWidget;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169270gX7 implements InterfaceC1603360rpG, InterfaceC1216440hlC {
    public final MixVideosViewModel LL;
    public C19EG LLILLJJLI;
    public JediWidget LLILLL;

    @Override // X.InterfaceC1216440hlC
    public final /* synthetic */ boolean aH0() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 19;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return !this.LL.LLIZLLLIL;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean cannotLoadMore() {
        return !this.LL.LLJ;
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LL;
    }

    public C1169270gX7(MixVideosViewModel mixVideosViewModel) {
        this.LL = mixVideosViewModel;
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        String aid;
        Aweme awemeLLILZ;
        String str;
        String str2;
        if (this.LLILLJJLI != null) {
            Aweme aweme = this.LL.LLILZIL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            String str3 = this.LL.LLJJJJ;
            if (str3 != null && str3.length() != 0 && (str = this.LL.LLJJJJJIL) != null && str.length() != 0 && (str2 = this.LL.LLJJJJLIIL) != null && str2.length() != 0) {
                Aweme awemeLLILZ2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aid);
                if (awemeLLILZ2 != null) {
                    awemeLLILZ = awemeLLILZ2.m199clone();
                } else {
                    awemeLLILZ = null;
                }
            } else {
                awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aid);
            }
            ArrayList arrayList = new ArrayList();
            if (awemeLLILZ != null) {
                arrayList.add(awemeLLILZ);
            }
            interfaceC1209780haS.LLJJJIL(arrayList, true);
        }
        AssemViewModel.asyncSubscribe$default(this.LL, new C2217381BqS() { // from class: X.0gX8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1164120gOo) obj).LLIZLLLIL;
            }
        }, null, AFwS256S0000000_18.get$arr$(974), AFwS206S0000000_18.get$arr$(747), new AwS597S0100000_18((DetailFragmentPanel) interfaceC1209780haS, 952), 2, null);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        if (this.LL == null) {
            return false;
        }
        C19EG activity = fragment.getActivity();
        this.LLILLJJLI = activity;
        C638660P3g.LIZ(activity).LL.setValue(Boolean.valueOf(this.LL.LLIZLLLIL));
        this.LLILLL = new JediWidget();
        C214820195e c214820195eLIZ = C214817195b.LIZ(fragment.getView(), fragment);
        JediWidget jediWidget = this.LLILLL;
        if (jediWidget == null) {
            jediWidget = null;
        }
        c214820195eLIZ.LIZLLL(jediWidget);
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        MixVideosViewModel mixVideosViewModel;
        if (i != 1) {
            if (i != 2) {
                if (i == 4 && (mixVideosViewModel = this.LL) != null) {
                    mixVideosViewModel.xQ2(Long.valueOf(mixVideosViewModel.LLJIJIL), c2189821An6.getUid(), c2189821An6.getSecUid());
                    return;
                }
                return;
            }
            MixVideosViewModel mixVideosViewModel2 = this.LL;
            Long lValueOf = Long.valueOf(mixVideosViewModel2.LLJI);
            String uid = c2189821An6.getUid();
            String secUid = c2189821An6.getSecUid();
            if (lValueOf == null) {
                return;
            }
            lValueOf.longValue();
            if (uid == null || secUid == null) {
                return;
            }
            int iLIZ = C1164030gOf.LIZ();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            MixFeedApi.LIZ.getClass();
            mixVideosViewModel2.disposeOnClear(C1169360gXG.LIZ().getMixVideos2(mixVideosViewModel2.LLILLL, "", mixVideosViewModel2.LLJI, 2, mixVideosViewModel2.BQ2(), mixVideosViewModel2.zQ2(), mixVideosViewModel2.LLJJIJIIJIL, Integer.valueOf(iLIZ), 1, null, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS2S0100100_4(jCurrentTimeMillis, mixVideosViewModel2, 3), new C09JN() { // from class: X.06Nx
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MixVideosViewModel@67cc.doLoadLatest$2");
                    C05FZ c05fz = C05FZ.LIZ;
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("reason", "failed"), new Pair(Scene.SCENE_SERVICE, "detail_page"));
                    c05fz.getClass();
                    C05FZ.LJ(mapLJIIIIZZ);
                    C1C7U.LIZIZ("MixVideosViewModel@67cc.doLoadLatest$2");
                }
            }));
            return;
        }
        MixVideosViewModel mixVideosViewModel3 = this.LL;
        if (mixVideosViewModel3 == null) {
            return;
        }
        mixVideosViewModel3.yQ2(c2189821An6.getUid(), c2189821An6.getSecUid());
    }
}
