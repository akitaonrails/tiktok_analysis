package X;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailHotHashtagResponse;

/* JADX INFO: renamed from: X.0z9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885000z9W {
    public View LIZIZ;
    public boolean LIZJ;
    public RecyclerView LJFF;
    public C1833330xoB LJI;
    public C1749280vcc LJII;
    public ViewGroup LJIIIIZZ;
    public InterfaceC1883030z6L LJIIIZ;
    public C1885370zA7 LJIIJJI;
    public final C1885330zA3 LIZ = new C1885330zA3();
    public final List<GameDetailHotHashtagResponse.ResponseData.GameHashtag> LIZLLL = new ArrayList();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final Set<String> LJIIJ = new LinkedHashSet();

    public final void LIZ() {
        C20441214yg.LIZIZ("GameHashTagCard", "Mark No more hash tags");
        this.LJ.set(false);
        this.LIZJ = false;
        final C1833330xoB c1833330xoB = this.LJI;
        if (c1833330xoB != null) {
            c1833330xoB.LLILLJJLI = false;
            RecyclerView recyclerView = c1833330xoB.LLILLL.LJFF;
            if (recyclerView != null) {
                C476770Imp.LIZJ(recyclerView, new Runnable() { // from class: X.0Uxo
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GameHashTagPresenter$HashtagAdapter@4503.setLoading$1");
                        try {
                            C1833330xoB c1833330xoB2 = c1833330xoB;
                            c1833330xoB2.notifyItemChanged(c1833330xoB2.LL.size());
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GameHashTagPresenter$HashtagAdapter@4503.setLoading$1");
                    }
                });
            }
        }
    }

    public final void LIZJ() {
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ;
        C1882760z5u eventCenter;
        View view = this.LIZIZ;
        if (view != null) {
            C476770Imp.LIZJ(view, new Runnable() { // from class: X.0T4w
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameHashTagPresenter@d6bb.requestInitHashTags$1");
                    try {
                        View view2 = this.LL.LIZIZ;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(0, view2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestInitHashTags$1");
                }
            });
        }
        InterfaceC1883030z6L interfaceC1883030z6L = this.LJIIIZ;
        if (interfaceC1883030z6L != null && (interfaceC1881340z3cLIZJ = interfaceC1883030z6L.LIZJ()) != null && (eventCenter = interfaceC1881340z3cLIZJ.getEventCenter()) != null) {
            eventCenter.LIZIZ(Boolean.TRUE, "hashTagLoading");
        }
        C480460Ism.LIZ().getClass();
        GameDetailPageApi gameDetailPageApi = (GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class);
        C1885330zA3 c1885330zA3 = this.LIZ;
        gameDetailPageApi.requestAnchorGameDetailHashTags(c1885330zA3.LIZ, c1885330zA3.LIZIZ, c1885330zA3.LIZJ, c1885330zA3.LIZLLL).LJJIII(3L).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0z9Y
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<GameDetailHotHashtagResponse.ResponseData.GameHashtag> list;
                InterfaceC1881340z3c interfaceC1881340z3cLIZJ2;
                C1882760z5u eventCenter2;
                C1C7U.LIZ("GameHashTagPresenter@d6bb.requestInitHashTags$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                InterfaceC1883030z6L interfaceC1883030z6L2 = this.LL.LJIIIZ;
                if (interfaceC1883030z6L2 != null && (interfaceC1881340z3cLIZJ2 = interfaceC1883030z6L2.LIZJ()) != null && (eventCenter2 = interfaceC1881340z3cLIZJ2.getEventCenter()) != null) {
                    eventCenter2.LIZIZ(Boolean.FALSE, "hashTagLoading");
                }
                GameDetailHotHashtagResponse.ResponseData responseData = (GameDetailHotHashtagResponse.ResponseData) baseResponse.data;
                Context context = null;
                if (responseData != null) {
                    list = responseData.hashtags;
                } else {
                    list = null;
                }
                C1885000z9W c1885000z9W = this.LL;
                boolean z = true;
                if (list != null) {
                    ((ArrayList) c1885000z9W.LIZLLL).clear();
                    ((ArrayList) c1885000z9W.LIZLLL).addAll(list);
                    c1885000z9W.LIZ.LIZLLL = ((ArrayList) c1885000z9W.LIZLLL).size();
                    RecyclerView recyclerView = c1885000z9W.LJFF;
                    if (recyclerView != null) {
                        context = recyclerView.getContext();
                    }
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1);
                    RecyclerView recyclerView2 = c1885000z9W.LJFF;
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutManager(gridLayoutManager);
                    }
                    RecyclerView recyclerView3 = c1885000z9W.LJFF;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(c1885000z9W.LJI);
                    }
                    C1833330xoB c1833330xoB = c1885000z9W.LJI;
                    if (c1833330xoB != null) {
                        c1833330xoB.notifyDataSetChanged();
                    }
                }
                C1885000z9W c1885000z9W2 = this.LL;
                GameDetailHotHashtagResponse.ResponseData responseData2 = (GameDetailHotHashtagResponse.ResponseData) baseResponse.data;
                if (responseData2 == null || !responseData2.hasMore) {
                    z = false;
                }
                c1885000z9W2.LIZJ = z;
                if (!z) {
                    c1885000z9W2.LIZ();
                }
                final C1885000z9W c1885000z9W3 = this.LL;
                View view2 = c1885000z9W3.LIZIZ;
                if (view2 != null) {
                    C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0T4v
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameHashTagPresenter@d6bb.requestInitHashTags$2$2");
                            try {
                                View view3 = c1885000z9W3.LIZIZ;
                                if (view3 != null) {
                                    C786410Ut5.LJLLLLLL(8, view3);
                                }
                                if (((ArrayList) c1885000z9W3.LIZLLL).size() == 0) {
                                    c1885000z9W3.LIZLLL();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestInitHashTags$2$2");
                        }
                    });
                }
                C1885370zA7 c1885370zA7 = this.LL.LJIIJJI;
                if (c1885370zA7 != null) {
                    c1885370zA7.invoke();
                }
                C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestInitHashTags$2");
            }
        }, new C09JN() { // from class: X.0z9d
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC1881340z3c interfaceC1881340z3cLIZJ2;
                C1882760z5u eventCenter2;
                C1C7U.LIZ("GameHashTagPresenter@d6bb.requestInitHashTags$3");
                C20441214yg.LJI("GameHashTagCard", (Throwable) obj);
                InterfaceC1883030z6L interfaceC1883030z6L2 = this.LL.LJIIIZ;
                if (interfaceC1883030z6L2 != null && (interfaceC1881340z3cLIZJ2 = interfaceC1883030z6L2.LIZJ()) != null && (eventCenter2 = interfaceC1881340z3cLIZJ2.getEventCenter()) != null) {
                    eventCenter2.LIZIZ(Boolean.FALSE, "hashTagLoading");
                }
                final C1885000z9W c1885000z9W = this.LL;
                View view2 = c1885000z9W.LIZIZ;
                if (view2 != null) {
                    C476770Imp.LIZJ(view2, new Runnable() { // from class: X.0T4u
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GameHashTagPresenter@d6bb.requestInitHashTags$3$1");
                            try {
                                View view3 = c1885000z9W.LIZIZ;
                                if (view3 != null) {
                                    C786410Ut5.LJLLLLLL(8, view3);
                                }
                                c1885000z9W.LIZLLL();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestInitHashTags$3$1");
                        }
                    });
                }
                C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestInitHashTags$3");
            }
        });
    }

    public final void LIZLLL() {
        ViewGroup viewGroup = this.LJIIIIZZ;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        C1749280vcc c1749280vcc = this.LJII;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJFF(c1722300uv6, new C741010T4x(this));
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc2 = this.LJII;
        if (c1749280vcc2 != null) {
            c1749280vcc2.setButtonTopMargin(C497740JfY.LIZIZ(24.0f));
        }
    }

    public final void LIZIZ(String str) {
        AbstractC21673619ry adapter;
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        Size size;
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ;
        C1882420z5M c1882420z5MLIZLLL;
        C1882410z5L c1882410z5LLJIIIIZZ;
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ2;
        C1882760z5u eventCenter;
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (Intrinsics.LJFF(adapter, this.LJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HashTagTab is showing：");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("GameHashTagCard", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(str, "scroll_to_bottom")) {
                if (this.LIZJ) {
                    C20441214yg.LIZIZ("GameHashTagCard", "hasMore & load more hash tags");
                    if (this.LJ.get()) {
                        C20441214yg.LIZIZ("GameHashTagCard", "now loading ,return");
                        return;
                    }
                    this.LJ.set(true);
                    InterfaceC1883030z6L interfaceC1883030z6L = this.LJIIIZ;
                    if (interfaceC1883030z6L != null && (interfaceC1881340z3cLIZJ2 = interfaceC1883030z6L.LIZJ()) != null && (eventCenter = interfaceC1881340z3cLIZJ2.getEventCenter()) != null) {
                        eventCenter.LIZIZ(Boolean.TRUE, "hashTagLoading");
                    }
                    this.LIZ.LIZLLL = ((ArrayList) this.LIZLLL).size();
                    C480460Ism.LIZ().getClass();
                    GameDetailPageApi gameDetailPageApi = (GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class);
                    C1885330zA3 c1885330zA3 = this.LIZ;
                    gameDetailPageApi.requestAnchorGameDetailHashTags(c1885330zA3.LIZ, c1885330zA3.LIZIZ, c1885330zA3.LIZJ, c1885330zA3.LIZLLL).LJJIII(3L).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0z9a
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            List<GameDetailHotHashtagResponse.ResponseData.GameHashtag> list;
                            RecyclerView recyclerView2;
                            InterfaceC1881340z3c interfaceC1881340z3cLIZJ3;
                            C1882760z5u eventCenter2;
                            C1C7U.LIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1");
                            BaseResponse baseResponse = (BaseResponse) obj;
                            C20441214yg.LIZIZ("GameHashTagCard", "on more tag loaded");
                            InterfaceC1883030z6L interfaceC1883030z6L2 = this.LL.LJIIIZ;
                            if (interfaceC1883030z6L2 != null && (interfaceC1881340z3cLIZJ3 = interfaceC1883030z6L2.LIZJ()) != null && (eventCenter2 = interfaceC1881340z3cLIZJ3.getEventCenter()) != null) {
                                eventCenter2.LIZIZ(Boolean.FALSE, "hashTagLoading");
                            }
                            GameDetailHotHashtagResponse.ResponseData responseData = (GameDetailHotHashtagResponse.ResponseData) baseResponse.data;
                            if (responseData != null) {
                                list = responseData.hashtags;
                            } else {
                                list = null;
                            }
                            final C1885000z9W c1885000z9W = this.LL;
                            final C118300cf c118300cf = new C118300cf();
                            boolean z = true;
                            int size2 = ((ArrayList) c1885000z9W.LIZLLL).size() - 1;
                            c118300cf.element = size2;
                            if (size2 < 0) {
                                size2 = 0;
                            }
                            c118300cf.element = size2;
                            if (list != null) {
                                ((ArrayList) c1885000z9W.LIZLLL).addAll(list);
                            }
                            RecyclerView recyclerView3 = c1885000z9W.LJFF;
                            if (recyclerView3 != null) {
                                C476770Imp.LIZJ(recyclerView3, new Runnable() { // from class: X.0xtp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1$1$1");
                                        try {
                                            C1885000z9W c1885000z9W2 = c1885000z9W;
                                            C1833330xoB c1833330xoB = c1885000z9W2.LJI;
                                            if (c1833330xoB != null) {
                                                c1833330xoB.notifyItemRangeChanged(c118300cf.element, ((ArrayList) c1885000z9W2.LIZLLL).size() + 1);
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1$1$1");
                                    }
                                });
                            }
                            final C1885000z9W c1885000z9W2 = this.LL;
                            GameDetailHotHashtagResponse.ResponseData responseData2 = (GameDetailHotHashtagResponse.ResponseData) baseResponse.data;
                            if (responseData2 == null || !responseData2.hasMore) {
                                z = false;
                            }
                            c1885000z9W2.LIZJ = z;
                            if (!z && (recyclerView2 = c1885000z9W2.LJFF) != null) {
                                C476770Imp.LIZJ(recyclerView2, new Runnable() { // from class: X.0T4t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1$2");
                                        try {
                                            c1885000z9W2.LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1$2");
                                    }
                                });
                            }
                            this.LL.LJ.set(false);
                            C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$1");
                        }
                    }, new C09JN() { // from class: X.0z9e
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            InterfaceC1881340z3c interfaceC1881340z3cLIZJ3;
                            C1882760z5u eventCenter2;
                            C1C7U.LIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$2");
                            C20441214yg.LJI("GameHashTagCard", (Throwable) obj);
                            InterfaceC1883030z6L interfaceC1883030z6L2 = this.LL.LJIIIZ;
                            if (interfaceC1883030z6L2 != null && (interfaceC1881340z3cLIZJ3 = interfaceC1883030z6L2.LIZJ()) != null && (eventCenter2 = interfaceC1881340z3cLIZJ3.getEventCenter()) != null) {
                                eventCenter2.LIZIZ(Boolean.FALSE, "hashTagLoading");
                            }
                            this.LL.LJ.set(false);
                            C1C7U.LIZIZ("GameHashTagPresenter@d6bb.requestMoreHashTags$2");
                        }
                    });
                    return;
                }
                C20441214yg.LIZIZ("GameHashTagCard", "No more hash tags, return");
                return;
            }
            if (!Intrinsics.LJFF(str, "on_action_up")) {
                return;
            }
            ArrayList arrayList = (ArrayList) this.LIZLLL;
            if (arrayList.isEmpty() || arrayList.size() <= this.LJIIJ.size()) {
                return;
            }
            RecyclerView recyclerView2 = this.LJFF;
            if (recyclerView2 != null) {
                layoutManager = recyclerView2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindLastVisibleItemPosition <= 0 || arrayList.size() < iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                GameDetailHotHashtagResponse.ResponseData.GameHashtag gameHashtag = (GameDetailHotHashtagResponse.ResponseData.GameHashtag) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, arrayList);
                if (gameHashtag != null && !this.LJIIJ.contains(gameHashtag.hashtagId) && linearLayoutManager != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                    int[] iArr = new int[2];
                    viewFindViewByPosition.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    InterfaceC1883030z6L interfaceC1883030z6L2 = this.LJIIIZ;
                    if (interfaceC1883030z6L2 == null || (size = C1883130z6V.LIZIZ(interfaceC1883030z6L2)) == null) {
                        size = new Size(0, 0);
                    }
                    if (i >= 0 && i < size.getWidth() && i2 >= 0 && i2 < size.getHeight()) {
                        this.LJIIJ.add(gameHashtag.hashtagId);
                        InterfaceC1883030z6L interfaceC1883030z6L3 = this.LJIIIZ;
                        if (interfaceC1883030z6L3 != null) {
                            interfaceC1881340z3cLIZJ = interfaceC1883030z6L3.LIZJ();
                        } else {
                            interfaceC1881340z3cLIZJ = null;
                        }
                        String str2 = gameHashtag.hashtagName;
                        Integer numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition + 1);
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_hashtag_show");
                        if (interfaceC1881340z3cLIZJ != null) {
                            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3cLIZJ);
                        } else {
                            c1882420z5MLIZLLL = null;
                        }
                        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                        c474500IjALIZ.LJJII(str2, "hashtag_name");
                        c474500IjALIZ.LJJII(numValueOf, "hashtag_order");
                        c474500IjALIZ.LJJII("videos", "tab_name");
                        if (interfaceC1881340z3cLIZJ != null) {
                            c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(interfaceC1881340z3cLIZJ);
                        } else {
                            c1882410z5LLJIIIIZZ = null;
                        }
                        String strLJFF = C1882380z5I.LJFF(c1882410z5LLJIIIIZZ, "sub_tab_name");
                        if (strLJFF == null) {
                            strLJFF = "";
                        }
                        c474500IjALIZ.LJJII(strLJFF, "sub_tab_name");
                        c474500IjALIZ.LIZ();
                    }
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    return;
                } else {
                    iFindFirstVisibleItemPosition++;
                }
            }
        } else {
            C20441214yg.LIZIZ("GameHashTagCard", "HashTagTab is NOT showing");
        }
    }
}
