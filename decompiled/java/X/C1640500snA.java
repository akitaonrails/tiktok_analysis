package X;

import Y.AObserverS227S0100000_25;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0snA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640500snA extends AbstractC1640400sn0<Effect> implements InterfaceC1640700snU<EffectCategoryResponse, Effect> {
    public final C1640790snd LJJIJIL;
    public final LifecycleOwner LJJIJL;
    public final InterfaceC1423450n95<EffectCategoryResponse, Effect> LJJIJLIJ;
    public final int LJJIL;
    public final boolean LJJIZ;
    public final boolean LJJJ;
    public final InterfaceC1640760sna LJJJI;
    public final Function0<VideoPublishEditModel> LJJJIL;
    public AbstractC1640230smj<EffectCategoryResponse> LJJJJ;
    public final C01GW LJJJJI;
    public final C01GW LJJJJIZL;
    public final List<Pair<EffectCategoryResponse, List<Effect>>> LJJJJJ;
    public final C11PQ<List<Pair<EffectCategoryResponse, List<Effect>>>> LJJJJJL;
    public final C01GW LJJJJL;
    public View LJJJJLI;

    @Override // X.AbstractC1640400sn0
    public final AbstractC1640090smV<C1634100scq<Effect, EnumC1641420soe, Integer>> LJJIII() {
        return new C1640050smR(this);
    }

    public final C1640690snT LJJIJL() {
        return (C1640690snT) this.LJJJJIZL.getValue();
    }

    public final C1640690snT LJJIJLIJ() {
        return (C1640690snT) this.LJJJJI.getValue();
    }

    public final C19475711Hn LJJIL() {
        C11PQ<List<Pair<EffectCategoryResponse, List<Effect>>>> c11pq = this.LJJJJJL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.AbstractC1640400sn0
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        if (this.LJJJ) {
            LJJIJLIJ();
            LJJIJL();
        }
    }

    @Override // X.AbstractC1640400sn0
    public AbstractC21673619ry<RecyclerView.ViewHolder> LJJIFFI() {
        final AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ryLJJIFFI = super.LJJIFFI();
        AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj = new AbstractC1640230smj<EffectCategoryResponse>(abstractC21673619ryLJJIFFI) { // from class: X.0snQ
            @Override // X.AbstractC1640230smj
            public final RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
                return this.LLILZ.LJJIJIL(viewGroup);
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
                if (viewHolder instanceof C1640670snR) {
                    ((C1640670snR) viewHolder).LLJILJILJ.LJFF = false;
                }
            }

            @Override // X.AbstractC1640230smj
            public final void LLLI(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
                this.LLILZ.LJJIJ(viewHolder, effectCategoryResponse);
            }
        };
        this.LJJJJ = abstractC1640230smj;
        return abstractC1640230smj;
    }

    @Override // X.AbstractC1640400sn0
    public C0DXR LJJIIJ() {
        if (!C1641230soL.LIZIZ() || this.LJJIJIL.LIZ) {
            return super.LJJIIJ();
        }
        return new C1337790kuv(this.LJJIL, C1641230soL.LIZJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f))), C1641230soL.LIZJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f))), LJI());
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public void vw() {
        LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> categories;
        super.vw();
        C1231520i9W.LIZLLL();
        InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95 = this.LJJIJLIJ;
        if (interfaceC1423450n95 == null || (categories = interfaceC1423450n95.getCategories()) == null) {
            return;
        }
        categories.removeObservers(this.LJJIJL);
    }

    @Override // X.AbstractC1640400sn0
    public final LifecycleOwner LJIIIZ() {
        return this.LJJIJL;
    }

    @Override // X.AbstractC1640400sn0
    public final int LJIIJ() {
        return this.LJJIL;
    }

    @Override // X.AbstractC1640400sn0
    public void LJIILIIL(LifecycleOwner lifecycleOwner) {
        LiveData<List<Pair<EffectCategoryResponse, List<Effect>>>> categories;
        super.LJIILIIL(lifecycleOwner);
        InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95 = this.LJJIJLIJ;
        if (interfaceC1423450n95 != null && (categories = interfaceC1423450n95.getCategories()) != null) {
            categories.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 106));
        }
        if (this.LJJJ) {
            LJIIJJI().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0snF
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                    LinearLayoutManager linearLayoutManager;
                    AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj;
                    Object next;
                    Pair pair;
                    EffectCategoryResponse effectCategoryResponse;
                    if (((ArrayList) this.LL.LJJJJJ).isEmpty()) {
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        C1640500snA c1640500snA = this.LL;
                        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null && (abstractC1640230smj = c1640500snA.LJJJJ) != null) {
                            Map<Integer, EffectCategoryResponse> map = abstractC1640230smj.LLILLL;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                if (((Number) entry.getKey()).intValue() < iFindFirstVisibleItemPosition) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            Iterator it2 = linkedHashMap.entrySet().iterator();
                            if (!it2.hasNext()) {
                                next = null;
                            } else {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    int iIntValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                                    do {
                                        Object next2 = it2.next();
                                        int iIntValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                                        if (iIntValue < iIntValue2) {
                                            next = next2;
                                            iIntValue = iIntValue2;
                                        }
                                    } while (it2.hasNext());
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) next;
                            if (entry2 != null) {
                                pair = new Pair(entry2.getKey(), entry2.getValue());
                            } else {
                                pair = null;
                            }
                            C1640690snT c1640690snTLJJIJLIJ = c1640500snA.LJJIJLIJ();
                            if (pair == null || (effectCategoryResponse = (EffectCategoryResponse) pair.getSecond()) == null) {
                                effectCategoryResponse = (EffectCategoryResponse) ((Pair) C13LP.LJJJJZI(c1640500snA.LJJJJJ)).getFirst();
                            }
                            c1640500snA.LJJIJ(c1640690snTLJJIJLIJ, effectCategoryResponse);
                            EffectCategoryResponse effectCategoryResponse2 = (EffectCategoryResponse) ((LinkedHashMap) abstractC1640230smj.LLILLL).get(Integer.valueOf(iFindFirstVisibleItemPosition));
                            if (effectCategoryResponse2 != null && viewFindViewByPosition.getTop() > (-c1640500snA.LJJIJL().itemView.getMeasuredHeight())) {
                                C786410Ut5.ed(c1640500snA.LJJIJLIJ().itemView, viewFindViewByPosition.getTop());
                                C786410Ut5.LJLLLLLL(0, c1640500snA.LJJIJL().itemView);
                                C786410Ut5.ed(c1640500snA.LJJIJL().itemView, viewFindViewByPosition.getTop());
                                c1640500snA.LJJIJ(c1640500snA.LJJIJL(), effectCategoryResponse2);
                                C786410Ut5.LJLLLLLL(4, viewFindViewByPosition);
                                c1640500snA.LJJJJLI = viewFindViewByPosition;
                                return;
                            }
                            C786410Ut5.ed(c1640500snA.LJJIJLIJ().itemView, 0.0f);
                            C786410Ut5.LJLLLLLL(4, c1640500snA.LJJIJL().itemView);
                            View view = c1640500snA.LJJJJLI;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                            c1640500snA.LJJJJLI = null;
                        }
                    }
                }
            });
        }
    }

    @Override // X.AbstractC1640400sn0
    public final int LJIILLIIL(int i) {
        AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj = this.LJJJJ;
        if (abstractC1640230smj != null) {
            i = abstractC1640230smj.LLLIILIL(i);
        }
        return super.LJIILLIIL(i);
    }

    @Override // X.AbstractC1640400sn0
    public final View LJJII(ViewGroup viewGroup) {
        if (this.LJJJ) {
            return C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(this.LIZ, R.style.z4)), R.layout.fv4, viewGroup, this.LJJIZ);
        }
        return super.LJJII(viewGroup);
    }

    @Override // X.AbstractC1640400sn0
    public RecyclerView LJJIIZ(View view) {
        int iLIZIZ;
        int iLIZIZ2;
        RecyclerView recyclerViewLJJIIZ = super.LJJIIZ(view);
        if (C1641230soL.LIZIZ() && !this.LJJIJIL.LIZ) {
            if (C1641230soL.LIZJ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f))) / 2;
            }
            int i = iLIZIZ - iLIZIZ2;
            C426750GoL.LJIIL(recyclerViewLJJIIZ, Integer.valueOf(i), null, Integer.valueOf(i), null, 26);
            return recyclerViewLJJIIZ;
        }
        if (this.LJJIL >= 4) {
            recyclerViewLJJIIZ.setFadingEdgeLength((int) C11VU.LIZIZ(4.0f, view.getContext()));
            recyclerViewLJJIIZ.setVerticalFadingEdgeEnabled(true);
            int iLIZIZ3 = (int) C11VU.LIZIZ(3.0f, view.getContext());
            recyclerViewLJJIIZ.setPadding(iLIZIZ3, 0, iLIZIZ3, 0);
        }
        return recyclerViewLJJIIZ;
    }

    public C1640690snT LJJIJIIJIL(View view) {
        TextView textView = (TextView) view.findViewById(R.id.w5z);
        Integer numLIZJ = C1231520i9W.LIZJ(R.attr.a1h, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_right_button);
        Integer numLIZJ2 = C1231520i9W.LIZJ(R.attr.a1h, tuxTextView.getContext());
        if (numLIZJ2 != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        return new C1640690snT(view, textView, tuxTextView);
    }

    public RecyclerView.ViewHolder LJJIJIL(ViewGroup viewGroup) {
        if (this.LJJJ) {
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

    public void LJJJ(List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
        ((ArrayList) this.LJJJJJ).clear();
        List<Pair<EffectCategoryResponse, List<Effect>>> list2 = this.LJJJJJ;
        ArrayList arrayList = new ArrayList();
        for (Pair<? extends EffectCategoryResponse, ? extends List<? extends Effect>> pair : list) {
            if (!pair.getSecond().isEmpty()) {
                arrayList.add(pair);
            }
        }
        ((ArrayList) list2).addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = 0;
        for (Pair pair2 : (ArrayList) this.LJJJJJ) {
            if (size != 0) {
                arrayList2.add(new Pair(Integer.valueOf(size - 1), pair2.getFirst()));
            }
            size += ((List) pair2.getSecond()).size();
        }
        AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj = this.LJJJJ;
        if (abstractC1640230smj != null) {
            abstractC1640230smj.LLLIL(arrayList2);
        }
        if (this.LJJJ) {
            if (((ArrayList) this.LJJJJJ).isEmpty()) {
                C786410Ut5.LJLLLLLL(8, LJJIJLIJ().itemView);
                C786410Ut5.LJLLLLLL(8, LJJIJL().itemView);
            } else {
                C786410Ut5.LJLLLLLL(0, LJJIJLIJ().itemView);
                LJJIJ(LJJIJLIJ(), (EffectCategoryResponse) ((Pair) C13LP.LJJJJZI(this.LJJJJJ)).getFirst());
                C786410Ut5.LJLLLLLL(4, LJJIJL().itemView);
            }
            this.LJJJJJL.onNext(this.LJJJJJ);
            return;
        }
        this.LJJJJJL.onNext(C13BV.INSTANCE);
    }

    public void LJJIJ(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
        C1640690snT c1640690snT;
        TextView textView;
        if (this.LJJJ) {
            if (effectCategoryResponse.getName().length() == 0) {
                C786410Ut5.LJLLLLLL(8, viewHolder.itemView);
            } else {
                if (!(viewHolder instanceof C1640690snT) || (c1640690snT = (C1640690snT) viewHolder) == null || (textView = c1640690snT.LL) == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
                textView.setText(effectCategoryResponse.getName());
            }
        }
    }

    @Override // X.InterfaceC1640700snU
    /* JADX INFO: renamed from: LJJIZ, reason: merged with bridge method [inline-methods] */
    public void LIZ(int i, Effect effect) {
        LinearLayoutManager linearLayoutManager;
        Iterator it2 = C13LP.LL(this.LJJJJJ, i).iterator();
        int iLLLIIIIL = 0;
        while (it2.hasNext()) {
            iLLLIIIIL += ((List) ((Pair) it2.next()).getSecond()).size();
        }
        List<C1634100scq<Effect, EnumC1641420soe, Integer>> data = LJIIIIZZ().getData();
        int size = ((ArrayList) data).size();
        while (iLLLIIIIL < size) {
            if (Intrinsics.LJFF(((C1634100scq) ListProtector.get(data, iLLLIIIIL)).LIZ, effect)) {
                if (iLLLIIIIL >= 0) {
                    RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                        AbstractC1640230smj<EffectCategoryResponse> abstractC1640230smj = this.LJJJJ;
                        if (abstractC1640230smj != null) {
                            iLLLIIIIL = abstractC1640230smj.LLLIIIIL(iLLLIIIIL);
                        }
                        linearLayoutManager.scrollToPositionWithOffset(iLLLIIIIL, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            iLLLIIIIL++;
        }
    }

    @Override // X.AbstractC1640400sn0
    public RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25) {
        LiveData<List<ProviderEffect>> liveDataHe;
        InterfaceC1640330smt<ProviderEffect> interfaceC1640330smtOy0;
        C1640590snJ c1640590snJ = C1640590snJ.LIZ;
        Activity activityLIZ = C0FNT.LIZ(viewGroup.getContext());
        c1640590snJ.getClass();
        Pair pairLIZ = C1640590snJ.LIZ(activityLIZ);
        if (pairLIZ == null) {
            pairLIZ = C1640590snJ.LIZJ(viewGroup.getContext(), this.LJJIJIL.LIZ);
        }
        FrameLayout frameLayout = (FrameLayout) pairLIZ.getFirst();
        C1662850tND c1662850tND = (C1662850tND) pairLIZ.getSecond();
        if (-2147483645 == i) {
            C1640790snd c1640790snd = this.LJJIJIL;
            LifecycleOwner lifecycleOwner = this.LJJIJL;
            InterfaceC1640760sna interfaceC1640760sna = this.LJJJI;
            if (interfaceC1640760sna != null && (interfaceC1640330smtOy0 = interfaceC1640760sna.Oy0()) != null) {
                liveDataHe = interfaceC1640330smtOy0.he();
            } else {
                liveDataHe = null;
            }
            return new C1640670snR(frameLayout, c1640790snd, lifecycleOwner, c1662850tND, awS674S0100000_25, liveDataHe, C1640590snJ.LIZIZ(this.LIZ), (C1656660tDE) this.LJJJJL.getValue());
        }
        if (C1641230soL.LIZIZ() && !this.LJJIJIL.LIZ) {
            return new C1638170sjP(frameLayout, c1662850tND, awS674S0100000_25, (C1656660tDE) this.LJJJJL.getValue(), this.LJJJIL, 32);
        }
        return new C1638170sjP(frameLayout, c1662850tND, awS674S0100000_25, (C1656660tDE) null, this.LJJJIL, 40);
    }

    @Override // X.AbstractC1640400sn0
    /* JADX INFO: renamed from: LJJIJIIJI, reason: merged with bridge method [inline-methods] */
    public void LIZJ(RecyclerView.ViewHolder viewHolder, int i, Effect effect, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        if ((viewHolder instanceof C1638170sjP) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            if (!C1635160seY.LIZIZ(effect) && (C1635160seY.LIZLLL(effect) || C1635160seY.LIZ(effect))) {
                C1231520i9W.LIZ((AbstractC1637470siH) viewHolder);
            } else {
                C1231520i9W.LIZIZ((AbstractC1637470siH) viewHolder);
            }
            abstractC1637470siH.I5(i, enumC1641420soe, num, effect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1640500snA(Context context, C1640790snd c1640790snd, LifecycleOwner lifecycleOwner, InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95, InterfaceC1640420sn2<Effect> interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1<? super C1640060smS, Unit> function1, InterfaceC1640760sna interfaceC1640760sna, Function0<? extends VideoPublishEditModel> function0) {
        super(context, lifecycleOwner, interfaceC1423450n95, interfaceC1640420sn2, viewGroup, i, z, z5, z3, z4, function1);
        this.LJJIJIL = c1640790snd;
        this.LJJIJL = lifecycleOwner;
        this.LJJIJLIJ = interfaceC1423450n95;
        this.LJJIL = i;
        this.LJJIZ = z;
        this.LJJJ = z2;
        this.LJJJI = interfaceC1640760sna;
        this.LJJJIL = function0;
        this.LJJJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 908));
        this.LJJJJIZL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 907));
        this.LJJJJJ = new ArrayList();
        this.LJJJJJL = new C11PQ<>();
        this.LJJJJL = C452501pT.LIZIZ(new AwS426S0200000_25(context, this, 154));
    }

    public /* synthetic */ C1640500snA(Context context, C1640790snd c1640790snd, LifecycleOwner lifecycleOwner, InterfaceC1423450n95 interfaceC1423450n95, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1, InterfaceC1640760sna interfaceC1640760sna, Function0 function0, int i2) {
        this(context, c1640790snd, lifecycleOwner, interfaceC1423450n95, interfaceC1640420sn2, viewGroup, i, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z5, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function1, (i2 & 8192) != 0 ? null : interfaceC1640760sna, (i2 & 16384) == 0 ? function0 : null);
    }
}
