package X;

import Y.AObserverS186S0200000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import Y.AkS468S0100000_3;
import Y.AkS486S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS1S3001000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640440sn4 extends C1640500snA {
    public final Function0<InterfaceC1644640stq> LJJJJLL;
    public final C11RK LJJJJZ;
    public final C1656660tDE LJJJJZI;
    public final CopyOnWriteArrayList<Effect> LJJJLIIL;
    public final ConcurrentHashMap<Effect, Pair<EnumC1641420soe, Integer>> LJJJLL;
    public final List<View> LJJJLZIJ;
    public final List<C1662850tND> LJJJZ;
    public final List<GifEntranceBannerController> LJJL;
    public final C01GW LJJLI;
    public final C01GW LJJLIIIIJ;
    public boolean LJJLIIIJ;

    @Override // X.C1640500snA, X.AbstractC1640400sn0
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LJJIFFI() {
        final C1640660snQ c1640660snQ = (C1640660snQ) super.LJJIFFI();
        AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj = new AbstractC1640230smj<EffectCategoryResponse>(c1640660snQ) { // from class: X.0snC
            @Override // X.AbstractC1640230smj
            public final RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
                if (this.LLILZ.LJJJ) {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fvj, viewGroup, false);
                    viewTd.setTag(R.id.kmv, Boolean.TRUE);
                    TextView textView = (TextView) viewTd.findViewById(R.id.w5z);
                    Integer numLIZJ = C1231520i9W.LIZJ(R.attr.a1h, textView.getContext());
                    if (numLIZJ != null) {
                        textView.setTextColor(numLIZJ.intValue());
                    }
                    return new C1640690snT(viewTd, textView, null);
                }
                return new C1640180sme(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ct4, viewGroup, false));
            }

            @Override // X.AbstractC1640230smj, X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return -2147483646;
                }
                return super.getItemViewType(i);
            }

            @Override // X.AbstractC1640350smv, X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewAttachedToWindow(viewHolder);
                if (viewHolder instanceof C1640670snR) {
                    GifEntranceBannerController gifEntranceBannerController = ((C1640670snR) viewHolder).LLJILJILJ;
                    gifEntranceBannerController.LJFF = true;
                    gifEntranceBannerController.LIZLLL();
                }
            }

            @Override // X.AbstractC21673619ry
            public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewDetachedFromWindow(viewHolder);
                if (viewHolder.getItemViewType() == -2147483646) {
                    Iterator it2 = ((ArrayList) this.LLILZ.LJJL).iterator();
                    while (it2.hasNext()) {
                        ((GifEntranceBannerController) it2.next()).LJFF = false;
                    }
                } else if (viewHolder instanceof C1640670snR) {
                    ((C1640670snR) viewHolder).LLJILJILJ.LJFF = false;
                }
            }

            @Override // X.AbstractC1640230smj, X.AbstractC1640350smv
            public final int LLLFZ(int i, GridLayoutManager gridLayoutManager) {
                if (getItemViewType(i) == -2147483646) {
                    return gridLayoutManager.LLILLJJLI;
                }
                return super.LLLFZ(i, gridLayoutManager);
            }

            @Override // X.AbstractC1640230smj
            public final void LLLI(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
                this.LLILZ.LJJIJ(viewHolder, effectCategoryResponse);
            }

            @Override // X.AbstractC1640230smj, X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
                if (i == -2147483646) {
                    viewHolderOnCreateViewHolder = this.LLILZ.LJJIJIL(viewGroup);
                } else {
                    viewHolderOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
                }
                try {
                    View view = viewHolderOnCreateViewHolder.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolderOnCreateViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolderOnCreateViewHolder.itemView.getParent() != null) {
                        boolean zLIZ = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZ) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(viewHolderOnCreateViewHolder.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolderOnCreateViewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolderOnCreateViewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = viewHolderOnCreateViewHolder.getClass().getName();
                return viewHolderOnCreateViewHolder;
            }
        };
        this.LJJJJ = abstractC1640230smj;
        return abstractC1640230smj;
    }

    @Override // X.C1640500snA, X.AbstractC1640400sn0
    public final C0DXR LJJIIJ() {
        return new C1337790kuv(this.LJJIL, C1641230soL.LIZJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f))), C1641230soL.LIZJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))), AFwS214S0000000_25.get$arr$(490), true);
    }

    @Override // X.C1640500snA, X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final void vw() {
        InterfaceC1640420sn2<Effect> interfaceC1640420sn2B90;
        super.vw();
        InterfaceC1640760sna interfaceC1640760sna = this.LJJJI;
        if (interfaceC1640760sna == null || (interfaceC1640420sn2B90 = interfaceC1640760sna.b90()) == null) {
            return;
        }
        interfaceC1640420sn2B90.nN1().removeObservers(this.LJJIJL);
        interfaceC1640420sn2B90.KI1().removeObservers(this.LJJIJL);
        interfaceC1640420sn2B90.V60().removeObservers(this.LJJIJL);
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final C11NZ<C1634100scq<Effect, Integer, EnumC1641420soe>> ww() {
        C11ON c11onLJJJJZI = super.ww().LJJJJZI(new AkS486S0100000_25(this, 12));
        C11RK c11rk = this.LJJJJZ;
        c11rk.getClass();
        C19475711Hn c19475711Hn = new C19475711Hn(c11rk);
        C1701890uOB.LIZ(c19475711Hn, "other is null");
        return C11NZ.LJJJLL(c11onLJJJJZI, c19475711Hn);
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final C11NZ<Pair<List<Effect>, Integer>> xw() {
        return super.xw().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08Lc
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                List list = (List) pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Effect) obj2).getEffectId().length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                return new Pair(arrayList, Integer.valueOf(iIntValue));
            }
        }).LJJJJZI(new AkS468S0100000_3(this, 7));
    }

    @Override // X.C1640500snA, X.AbstractC1640400sn0
    public final void LJIILIIL(LifecycleOwner lifecycleOwner) {
        InterfaceC1640420sn2<Effect> interfaceC1640420sn2B90;
        InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95Zo1;
        LiveData<List<Effect>> liveDataHe;
        super.LJIILIIL(lifecycleOwner);
        InterfaceC1640760sna interfaceC1640760sna = this.LJJJI;
        if (interfaceC1640760sna != null && (interfaceC1423450n95Zo1 = interfaceC1640760sna.zo1()) != null && (liveDataHe = interfaceC1423450n95Zo1.he()) != null) {
            liveDataHe.observe(lifecycleOwner, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) lifecycleOwner, (l0) 4));
        }
        InterfaceC1640760sna interfaceC1640760sna2 = this.LJJJI;
        if (interfaceC1640760sna2 != null && (interfaceC1640420sn2B90 = interfaceC1640760sna2.b90()) != null) {
            interfaceC1640420sn2B90.nN1().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 83));
            interfaceC1640420sn2B90.KI1().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 84));
            interfaceC1640420sn2B90.V60().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 85));
        }
    }

    @Override // X.AbstractC1640400sn0
    public final void LJJIIZI(List<? extends Effect> list) {
        super.LJJIIZI(C13LP.LJLIL(list, Collections.singletonList(this.LJJLIIIIJ.getValue())));
    }

    @Override // X.C1640500snA
    public final RecyclerView.ViewHolder LJJIJIL(ViewGroup viewGroup) {
        final ViewGroup viewGroup2;
        final ViewOnClickListenerC1641310soT viewOnClickListenerC1641310soT = (ViewOnClickListenerC1641310soT) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fv5, viewGroup, false);
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)))) - LJIIJJI().getPaddingLeft();
        C426750GoL.LJIIL(viewOnClickListenerC1641310soT, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(-4.0f)))), Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(14.0f)))), 16);
        viewOnClickListenerC1641310soT.setClipChildren(false);
        viewOnClickListenerC1641310soT.setClipToPadding(false);
        LJIIJJI().setClipChildren(false);
        LJIIJJI().setClipToPadding(false);
        ViewParent parent = LJIIJJI().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.setClipChildren(this.LJJLIIIJ);
            viewGroup2.setClipToPadding(this.LJJLIIIJ);
            LJIIJJI().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0sn5
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    RecyclerView.LayoutManager layoutManager;
                    View viewFindViewByPosition;
                    boolean z = true;
                    if (i == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null && viewFindViewByPosition.getTop() >= 0) {
                        z = false;
                    }
                    this.LL.LJJLIIIJ = z;
                    viewGroup2.setClipChildren(z);
                    viewGroup2.setClipToPadding(z);
                }
            });
        }
        viewOnClickListenerC1641310soT.setFlowPanelAdapter((AbstractC1640730snX) this.LJJLI.getValue());
        viewOnClickListenerC1641310soT.setOnItemClickedListener(new InterfaceC1640480sn8() { // from class: X.0sav
            @Override // X.InterfaceC1640480sn8
            public final void LIZ(int i) {
                String name;
                EnumC1641420soe first;
                C1632480saE c1632480saE = C1632480saE.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InfoStickerCompactHeaderListView FlowPanelLayout onItemClick: ");
                sbLIZ.append(i);
                sbLIZ.append(" name: ");
                Effect effect = (Effect) C13LP.LJJJLZIJ(i, this.LIZ.LJJJLIIL);
                if (effect != null) {
                    name = effect.getName();
                } else {
                    name = null;
                }
                sbLIZ.append(name);
                C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LIZ.LJJJLIIL);
                if (objLJJJLZIJ != null) {
                    C1640440sn4 c1640440sn4 = this.LIZ;
                    Pair<EnumC1641420soe, Integer> pair = c1640440sn4.LJJJLL.get(objLJJJLZIJ);
                    if (pair == null || (first = pair.getFirst()) == null) {
                        first = EnumC1641420soe.UNKNOWN;
                    }
                    c1640440sn4.LJJJJZ.onNext(new C1634100scq(objLJJJLZIJ, Integer.valueOf(i), first));
                }
            }
        });
        return new RecyclerView.ViewHolder(viewOnClickListenerC1641310soT) { // from class: X.0sn6
        };
    }

    @Override // X.C1640500snA
    public final void LJJJ(List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
        Pair pair = (Pair) C13LP.LJJJLL(list);
        if (pair != null) {
            list = C13LP.LJLIL(C13LP.LJJJJIZL(list, 1), Collections.singletonList(new Pair(pair.getFirst(), C13LP.LJLIL((Iterable) pair.getSecond(), Collections.singletonList(this.LJJLIIIIJ.getValue())))));
        }
        super.LJJJ(list);
    }

    public static void LJJJI(Effect effect, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectId: ");
        sbLIZ.append(effect.getEffectId());
        sbLIZ.append(", errorMessage: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1634980seG.LIZ("edit_sticker_preview_download_failed", new AwS1S3001000_25(C2188811AlT.LIZIZ(sbLIZ), C13LP.LJJLIIIJ(effect.getIconUrl().getUrlList(), null, null, null, 0, null, null, 63), C1462560oAA.LJII(effect.getTags()), 1));
    }

    @Override // X.C1640500snA, X.InterfaceC1640700snU
    public final /* bridge */ /* synthetic */ void LIZ(int i, Object obj) {
        LIZ(i, (Effect) obj);
    }

    @Override // X.C1640500snA
    /* JADX INFO: renamed from: LJJIZ */
    public final void LIZ(int i, Effect effect) {
        LinearLayoutManager linearLayoutManager;
        if (i > 0) {
            super.LIZ(i, effect);
            return;
        }
        RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(0, 0);
    }

    public C1640440sn4(Context context, C1640790snd c1640790snd, LifecycleOwner lifecycleOwner, InterfaceC1423450n95 interfaceC1423450n95, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, Function1 function1, InterfaceC1640760sna interfaceC1640760sna, Function0 function0, AwS569S0100000_25 awS569S0100000_25) {
        super(context, c1640790snd, lifecycleOwner, interfaceC1423450n95, interfaceC1640420sn2, viewGroup, i, true, z, true, z2, false, function1, interfaceC1640760sna, function0);
        this.LJJJJLL = awS569S0100000_25;
        C11RK c11rk = new C11RK();
        this.LJJJJZ = c11rk;
        this.LJJJJZI = new C1656660tDE(context, lifecycleOwner);
        this.LJJJLIIL = new CopyOnWriteArrayList<>();
        this.LJJJLL = new ConcurrentHashMap<>();
        this.LJJJLZIJ = new ArrayList();
        this.LJJJZ = new ArrayList();
        this.LJJL = new ArrayList();
        this.LJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1034));
        this.LJJLIIIIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(455));
        c11rk.LJLIL(800L, TimeUnit.MILLISECONDS).LJJLJLI(new AfS194S0100000_25(interfaceC1640760sna, 202));
    }
}
