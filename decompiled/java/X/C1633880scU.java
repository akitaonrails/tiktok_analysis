package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS82S0500000_25;

/* JADX INFO: renamed from: X.0scU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633880scU implements InterfaceC1633890scV {
    public final Function0<String> LIZ;
    public final Function0<String> LIZIZ;
    public final Function0<InterfaceC1635390sev> LIZJ;
    public final Function0<InterfaceC1634030scj> LIZLLL;
    public final Function0<InterfaceC1634030scj> LJ;
    public Function0<? extends InterfaceC1632630saT<Effect, C1634230sd3>> LJFF;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sci] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sce] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sb2] */
    @Override // X.InterfaceC1633890scV
    public final C1633870scT create() {
        ?? r8 = new InterfaceC1633000sb4(this.LIZJ) { // from class: X.0sb2
            public final Function0<InterfaceC1635390sev> LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function0;
            }

            @Override // X.InterfaceC1633000sb4
            public final boolean LIZ(Effect effect) {
                return this.LIZ.invoke().LJIJJLI(effect);
            }
        };
        C1632960sb0 c1632960sb0 = new C1632960sb0(r8, new AwS604S0100000_25(this, 656));
        Function0<? extends InterfaceC1632630saT<Effect, C1634230sd3>> function0 = this.LJFF;
        if (function0 != null) {
            InterfaceC1632630saT<Effect, C1634230sd3> interfaceC1632630saTInvoke = function0.invoke();
            C1632610saR c1632610saR = (C1632610saR) c1632960sb0.LJ.getValue();
            if (!((ArrayList) c1632610saR.LIZ).contains(interfaceC1632630saTInvoke)) {
                ((ArrayList) c1632610saR.LIZ).add(interfaceC1632630saTInvoke);
            }
        }
        InterfaceC1634030scj interfaceC1634030scjInvoke = this.LJ.invoke();
        ?? r4 = new InterfaceC1634000scg<EffectCategoryResponse>(this.LIZJ) { // from class: X.0sci
            public final Function0<InterfaceC1635390sev> LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function0;
            }

            @Override // X.InterfaceC1634000scg
            public final C11ON LIZ(C1634350sdF c1634350sdF) {
                C11NZ c11nzRequest = new C1634050scl(this, c1634350sdF, this.LIZ, new AwS569S0100000_25(c1634350sdF, 1063)).request();
                if (C2281551ESb.LIZIZ.LJIL()) {
                    c11nzRequest = c11nzRequest.LJJJLZIJ(C11S5.LIZIZ);
                }
                return c11nzRequest.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08wf
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                        List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
                        if (categoryResponseList != null && (!categoryResponseList.isEmpty())) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(categoryResponseList, 10));
                            for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                                arrayList.addAll(totalEffects);
                                arrayList2.add(new Pair(effectCategoryResponse, totalEffects));
                            }
                            return new C1638730skJ(arrayList, arrayList2);
                        }
                        return new C1638730skJ(effectChannelResponse.getAllCategoryEffects(), C13BV.INSTANCE);
                    }
                });
            }
        };
        C1632970sb1 c1632970sb1 = new C1632970sb1(r8, c1632960sb0);
        return new C1633870scT(this.LIZLLL.invoke(), interfaceC1634030scjInvoke, r4, new InterfaceC1633990scf<Effect>(this.LIZJ) { // from class: X.0sce
            public final Function0<InterfaceC1635390sev> LIZ;
            public final int LIZIZ = 75;

            {
                this.LIZ = function0;
            }

            @Override // X.InterfaceC1633990scf
            public final C1635200sec LIZ(C1634340sdE c1634340sdE) {
                Function0<InterfaceC1635390sev> function02 = this.LIZ;
                String str = c1634340sdE.LIZJ;
                int i = this.LIZIZ;
                String str2 = c1634340sdE.LJII;
                if (str2 == null) {
                    str2 = "";
                }
                return new C1635200sec(function02, str, i, new C1635370set(0, 0, "", str2, true));
            }
        }, c1632970sb1, c1632960sb0, r8);
    }

    public C1633880scU(AFwS214S0000000_25 aFwS214S0000000_25, AFwS214S0000000_25 aFwS214S0000000_252, AFwS214S0000000_25 aFwS214S0000000_253, AwS153S0400000_25 awS153S0400000_25, AwS82S0500000_25 awS82S0500000_25) {
        this.LIZ = aFwS214S0000000_25;
        this.LIZIZ = aFwS214S0000000_252;
        this.LIZJ = aFwS214S0000000_253;
        this.LIZLLL = awS153S0400000_25;
        this.LJ = awS82S0500000_25;
    }
}
