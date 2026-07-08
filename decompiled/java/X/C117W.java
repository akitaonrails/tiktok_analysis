package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagData;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagResponse;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.117W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117W extends FrameLayout implements InterfaceC194462116e, Observer<AVRecommendHashTagResponse> {
    public C425240Glu LL;
    public C7964039e LLILLJJLI;
    public C19401010vI LLILLL;
    public C1445580nim LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final List<C117V> LLIZ;
    public InterfaceC194490117g<? super C117V> LLIZLLLIL;
    public final C01GW LLJ;
    public C194497117n LLJI;
    public C194495117l LLJIJIL;
    public int LLJILJIL;
    public final ViewModelStoreOwner LLJILJILJ;
    public final Scene LLJILLL;

    private final Unit getInitEventListener() {
        this.LLJ.getValue();
        return Unit.LIZ;
    }

    public final void LIZIZ() {
        if (C1403010mc7.LIZ.getChallengeService() == null) {
            this.LLILZIL = false;
            C786410Ut5.E0(this, 8);
            return;
        }
        this.LLILZIL = true;
        C19EG c19eg = (C19EG) C0FNT.LIZ(getContext());
        ViewModelStoreOwner viewModelStoreOwner = this.LLJILJILJ;
        Scene scene = this.LLJILLL;
        RecommendHashTagViewModel recommendHashTagViewModel = viewModelStoreOwner != null ? (RecommendHashTagViewModel) new ViewModelProvider(viewModelStoreOwner).get(RecommendHashTagViewModel.class) : (RecommendHashTagViewModel) ViewModelProviders.of(c19eg).get(RecommendHashTagViewModel.class);
        if (recommendHashTagViewModel.LL == null) {
            recommendHashTagViewModel.LL = new MutableLiveData<>();
        }
        recommendHashTagViewModel.LL.observe(scene, new AObserverS231S0100000_29(viewModelStoreOwner, 68));
        this.LLJI = new C194497117n(recommendHashTagViewModel);
        C194459116b c194459116b = new C194459116b();
        c194459116b.LJIIJ(new C116T());
        c194459116b.LLILLJJLI = new C194461116d(this);
        this.LLJIJIL = new C194495117l(c194459116b);
    }

    @Override // X.InterfaceC194462116e
    public final void M5() {
        C425240Glu c425240Glu = this.LL;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        c425240Glu.scrollToPosition(0);
        this.LLILZLL = false;
        LIZJ(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.039e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.117d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.117c] */
    public final void LIZLLL() {
        C786410Ut5.Sd(R.layout.d5a, C786410Ut5.ne(getContext()), this);
        C425240Glu c425240Glu = (C425240Glu) findViewById(R.id.jh8);
        this.LL = c425240Glu;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        final Context context = getContext();
        c425240Glu.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerListView$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return this.LL.LLILZLL;
            }
        });
        this.LLILLJJLI = new AbstractC21673619ry<C7965039f>() { // from class: X.039e
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 10;
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u6, viewGroup, false);
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.039f
                };
                try {
                    View view = viewHolder.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C7965039f.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C7965039f.class.getName();
                return viewHolder;
            }

            @Override // X.AbstractC21673619ry
            public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            }
        };
        this.LLILLL = new C19401010vI(this.LLIZ, new InterfaceC19401310vL() { // from class: X.117c
            @Override // X.InterfaceC19401310vL
            public final void LIZ(int i, View view) {
                C19401010vI c19401010vI = this.LL.LLILLL;
                if (c19401010vI == null) {
                    c19401010vI = null;
                }
                C117V c117v = (C117V) C13LP.LJJJLZIJ(i, c19401010vI.LL);
                InterfaceC194490117g<? super C117V> interfaceC194490117g = this.LL.LLIZLLLIL;
                if (interfaceC194490117g != null) {
                    interfaceC194490117g.LIZ(c117v);
                }
            }
        }, new InterfaceC19401410vM() { // from class: X.117d
            @Override // X.InterfaceC19401410vM
            public final void LIZIZ(int i) {
                C19401010vI c19401010vI = this.LIZ.LLILLL;
                if (c19401010vI == null) {
                    c19401010vI = null;
                }
                C117V c117v = (C117V) C13LP.LJJJLZIJ(i, c19401010vI.LL);
                InterfaceC194490117g<? super C117V> interfaceC194490117g = this.LIZ.LLIZLLLIL;
                if (interfaceC194490117g != null) {
                    interfaceC194490117g.LIZIZ(c117v);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getInitEventListener();
    }

    public C117W(Context context) {
        super(context, null, 0);
        this.LLILZLL = true;
        this.LLIZ = new ArrayList();
        this.LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS573S0100000_29(this, 270));
        this.LLJILJIL = R.attr.uj;
        LIZLLL();
        LIZIZ();
    }

    @Override // X.InterfaceC194462116e
    public final void LIZ(AVSearchChallengeList aVSearchChallengeList) {
        List<AVSearchChallenge> list;
        C425240Glu c425240Glu = null;
        if (aVSearchChallengeList != null) {
            list = aVSearchChallengeList.items;
        } else {
            list = null;
        }
        ((ArrayList) this.LLIZ).clear();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AVSearchChallenge aVSearchChallenge = (AVSearchChallenge) ListProtector.get(list, i);
                List<C117V> list2 = this.LLIZ;
                C117V c117vLIZ = C117V.LIZ(aVSearchChallenge);
                c117vLIZ.LJII = this.LLJILJIL;
                ((ArrayList) list2).add(c117vLIZ);
            }
            this.LLILZLL = true;
            LIZJ(3);
        } else {
            LIZJ(2);
        }
        C425240Glu c425240Glu2 = this.LL;
        if (c425240Glu2 != null) {
            c425240Glu = c425240Glu2;
        }
        c425240Glu.scrollToPosition(0);
    }

    public final void LIZJ(int i) {
        AbstractC21673619ry abstractC21673619ry = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C425240Glu c425240Glu = this.LL;
                        if (c425240Glu == null) {
                            c425240Glu = null;
                        }
                        AbstractC21673619ry adapter = c425240Glu.getAdapter();
                        C19401010vI c19401010vI = this.LLILLL;
                        if (c19401010vI == null) {
                            c19401010vI = null;
                        }
                        if (!Intrinsics.LJFF(adapter, c19401010vI)) {
                            C425240Glu c425240Glu2 = this.LL;
                            if (c425240Glu2 == null) {
                                c425240Glu2 = null;
                            }
                            C19401010vI c19401010vI2 = this.LLILLL;
                            if (c19401010vI2 != null) {
                                abstractC21673619ry = c19401010vI2;
                            }
                            c425240Glu2.setAdapter(abstractC21673619ry);
                        }
                        C786410Ut5.E0(this, 0);
                        return;
                    }
                    return;
                }
                C425240Glu c425240Glu3 = this.LL;
                if (c425240Glu3 == null) {
                    c425240Glu3 = null;
                }
                AbstractC21673619ry adapter2 = c425240Glu3.getAdapter();
                C7964039e c7964039e = this.LLILLJJLI;
                if (c7964039e == null) {
                    c7964039e = null;
                }
                if (!Intrinsics.LJFF(adapter2, c7964039e)) {
                    C425240Glu c425240Glu4 = this.LL;
                    if (c425240Glu4 == null) {
                        c425240Glu4 = null;
                    }
                    C7964039e c7964039e2 = this.LLILLJJLI;
                    if (c7964039e2 != null) {
                        abstractC21673619ry = c7964039e2;
                    }
                    c425240Glu4.setAdapter(abstractC21673619ry);
                }
                C786410Ut5.E0(this, 8);
                return;
            }
            C425240Glu c425240Glu5 = this.LL;
            if (c425240Glu5 == null) {
                c425240Glu5 = null;
            }
            AbstractC21673619ry adapter3 = c425240Glu5.getAdapter();
            C7964039e c7964039e3 = this.LLILLJJLI;
            if (c7964039e3 == null) {
                c7964039e3 = null;
            }
            if (!Intrinsics.LJFF(adapter3, c7964039e3)) {
                C425240Glu c425240Glu6 = this.LL;
                if (c425240Glu6 == null) {
                    c425240Glu6 = null;
                }
                C7964039e c7964039e4 = this.LLILLJJLI;
                if (c7964039e4 != null) {
                    abstractC21673619ry = c7964039e4;
                }
                c425240Glu6.setAdapter(abstractC21673619ry);
            }
            C786410Ut5.E0(this, 8);
            return;
        }
        C425240Glu c425240Glu7 = this.LL;
        if (c425240Glu7 == null) {
            c425240Glu7 = null;
        }
        AbstractC21673619ry adapter4 = c425240Glu7.getAdapter();
        C7964039e c7964039e5 = this.LLILLJJLI;
        if (c7964039e5 == null) {
            c7964039e5 = null;
        }
        if (!Intrinsics.LJFF(adapter4, c7964039e5)) {
            C425240Glu c425240Glu8 = this.LL;
            if (c425240Glu8 == null) {
                c425240Glu8 = null;
            }
            C7964039e c7964039e6 = this.LLILLJJLI;
            if (c7964039e6 != null) {
                abstractC21673619ry = c7964039e6;
            }
            c425240Glu8.setAdapter(abstractC21673619ry);
        }
        C786410Ut5.E0(this, 0);
    }

    @Override // X.InterfaceC194462116e
    public final void d7(Exception exc) {
        LIZJ(1);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AVRecommendHashTagResponse aVRecommendHashTagResponse) {
        boolean z;
        if (aVRecommendHashTagResponse != null) {
            C194497117n c194497117n = this.LLJI;
            C425240Glu c425240Glu = null;
            if (c194497117n == null) {
                c194497117n = null;
            }
            RecommendHashTagViewModel recommendHashTagViewModel = c194497117n.LIZ;
            if (recommendHashTagViewModel.LL == null) {
                recommendHashTagViewModel.LL = new MutableLiveData<>();
            }
            AVRecommendHashTagResponse aVRecommendHashTagResponseLIZ = C117Z.LIZ(recommendHashTagViewModel.LL.getValue());
            if (aVRecommendHashTagResponseLIZ == null) {
                LIZJ(1);
                return;
            }
            LinkedList linkedList = new LinkedList();
            boolean z2 = aVRecommendHashTagResponseLIZ.needHistory;
            boolean z3 = aVRecommendHashTagResponseLIZ.needPrivacyHistory;
            int i = aVRecommendHashTagResponseLIZ.showPrivacyCount;
            List<? extends AVRecommendHashTagData> list = aVRecommendHashTagResponseLIZ.data;
            new ArrayList();
            if (z2) {
                C0CHQ.LIZ().getLocalHashTagService().getClass();
            } else if (z3 && i > 0) {
                C0CHQ.LIZ().getLocalHashTagService().getClass();
                throw null;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                HashSet hashSet = new HashSet();
                for (AVRecommendHashTagData aVRecommendHashTagData : list) {
                    if (!hashSet.contains(aVRecommendHashTagData.challenge.challengeName)) {
                        C117V c117v = new C117V();
                        c117v.LIZIZ = 2;
                        int i2 = aVRecommendHashTagData.mark;
                        if (i2 == 4) {
                            c117v.LJFF = "history";
                        } else if (i2 == 0) {
                            c117v.LJFF = "recommendation";
                        } else {
                            c117v.LJFF = "commercial";
                        }
                        c117v.LIZ = aVRecommendHashTagData.challenge;
                        c117v.LJ = aVRecommendHashTagData.LIZ;
                        if (aVRecommendHashTagData.pos > linkedList.size()) {
                            linkedList.add(c117v);
                        } else {
                            int i3 = aVRecommendHashTagData.pos;
                            if (i3 < 0) {
                                ListProtector.add(linkedList, 0, c117v);
                            } else {
                                ListProtector.add(linkedList, i3, c117v);
                            }
                        }
                    }
                }
            }
            if (linkedList.isEmpty()) {
                LIZJ(2);
                return;
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                ((C117V) it2.next()).LJII = this.LLJILJIL;
            }
            ((ArrayList) this.LLIZ).clear();
            ((ArrayList) this.LLIZ).addAll(linkedList);
            this.LLILZLL = true;
            LIZJ(3);
            C425240Glu c425240Glu2 = this.LL;
            if (c425240Glu2 != null) {
                c425240Glu = c425240Glu2;
            }
            c425240Glu.scrollToPosition(0);
        }
    }

    public final void setItemBackgroundColor(int i) {
        this.LLJILJIL = i;
    }

    public final void setOnHashTagItemClickListener(InterfaceC194490117g<? super C117V> interfaceC194490117g) {
        this.LLIZLLLIL = interfaceC194490117g;
    }

    public C117W(Context context, ViewModelStoreOwner viewModelStoreOwner, Scene scene) {
        super(context);
        this.LLILZLL = true;
        this.LLIZ = new ArrayList();
        this.LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS573S0100000_29(this, 270));
        this.LLJILJIL = R.attr.uj;
        this.LLJILJILJ = viewModelStoreOwner;
        this.LLJILLL = scene;
        LIZLLL();
        LIZIZ();
    }
}
