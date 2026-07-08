package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import duk.p;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627290sRr extends C1627300sRs {
    public final C11PQ<Boolean> LLILZIL;
    public final C01GW LLILZLL;
    public final ShortVideoContext LLIZ;
    public final C1623920sMQ LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C1623460sLg LLJIJIL;
    public final C11PQ<Effect> LLJILJIL;
    public final C11NZ<Effect> LLJILJILJ;
    public final C11PQ<AbstractC789520Uy6> LLJILLL;
    public final C11NZ<AbstractC789520Uy6> LLJJ;
    public final C11PQ<AbstractC788650Uwh> LLJJI;
    public final C11NZ<AbstractC788650Uwh> LLJJIII;
    public final C11PQ<Object> LLJJIJI;
    public final C11NZ<Object> LLJJIJIIJIL;
    public final C11PQ<AbstractC2281091EQh> LLJJIJIL;
    public final C11NZ<AbstractC2281091EQh> LLJJJ;
    public final C11NZ<Boolean> LLJJJIL;
    public final C11PQ<Boolean> LLJJJJ;
    public final C11NZ<Boolean> LLJJJJJIL;
    public final C11PQ<EnumC995050c07> LLJJJJLIIL;
    public final C05YC<List<C01W8>> LLJJL;
    public final C05YC<C320530ChP> LLJJLIIIJLLLLLLLZ;
    public final C095E<List<C01WA>> LLJL;
    public final C11NZ<Boolean> LLJLIL;
    public final InterfaceC332260D0u<Collection<Object>> LLJLILLLLZIIL;
    public final C05YD<Collection<Object>> LLJLL;
    public final C05YC<InterfaceC460901qp> LLJLLIL;
    public final C01S9<InterfaceC460901qp> LLJLLL;
    public final C05YC<AbstractC461201qs> LLJZ;
    public final C01S9<AbstractC461201qs> LLJZIJLIL;

    private final boolean LJLLJ() {
        return ((Boolean) this.LLILZLL.getValue()).booleanValue();
    }

    @Override // X.C1627300sRs
    public InterfaceC1628180sTI LJJIJL() {
        return (InterfaceC1628180sTI) this.LLJI.getValue();
    }

    @Override // X.C1627300sRs
    public InterfaceC1625220sOW LJJJIL() {
        return (InterfaceC1625220sOW) this.LLJ.getValue();
    }

    @Override // X.C1627300sRs, X.InterfaceC1648240sze
    public void Mp1() {
        this.LL.onNext(Boolean.FALSE);
    }

    @Override // X.C1627300sRs, X.InterfaceC1648240sze
    public void Pd1() {
        this.LL.onNext(Boolean.TRUE);
    }

    @Override // X.C1627300sRs, X.InterfaceC577400Mkk
    public void MT0() {
        if (LJLLJ()) {
            C0().getStickerRepository().LJJ(C1629080sUk.LIZ(null, C13BV.INSTANCE));
        } else {
            LJJIIZ().onNext(new C788640Uwg(C1697810uHb.LJIIJJI(new InterfaceC1880507Yd() { // from class: X.07Ye
            }, new InterfaceC1880507Yd() { // from class: X.07Yc
                public final Effect LIZ = null;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1880407Yc) && Intrinsics.LJFF(this.LIZ, ((C1880407Yc) obj).LIZ);
                }

                public final int hashCode() {
                    Effect effect = this.LIZ;
                    if (effect == null) {
                        return 0;
                    }
                    return effect.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PlaceHolderEffect(effect=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }, new InterfaceC1880507Yd() { // from class: X.07Yc
                public final Effect LIZ = null;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1880407Yc) && Intrinsics.LJFF(this.LIZ, ((C1880407Yc) obj).LIZ);
                }

                public final int hashCode() {
                    Effect effect = this.LIZ;
                    if (effect == null) {
                        return 0;
                    }
                    return effect.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PlaceHolderEffect(effect=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            })));
        }
        C0().getStickerRepository().LJIIIZ(new C1633080sbC(null, false, false, 1023));
        if (LJLLJ()) {
            return;
        }
        C11PQ<AbstractC789520Uy6> c11pqLJJIII = LJJIII();
        final int i = C1627490sSB.LIZ().count;
        p pVarLJJJJIZL = C0().LJJJJIZL();
        final int i2 = pVarLJJJJIZL != null ? pVarLJJJJIZL.LIZIZ : 0;
        c11pqLJJIII.onNext(new AbstractC789530Uy7(i, i2) { // from class: X.0Uy8
            public final int LIZ;
            public final int LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C789540Uy8)) {
                    return false;
                }
                C789540Uy8 c789540Uy8 = (C789540Uy8) obj;
                return this.LIZ == c789540Uy8.LIZ && this.LIZIZ == c789540Uy8.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ * 31) + this.LIZIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Hot(count=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", scene=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = i;
                this.LIZIZ = i2;
            }
        });
    }

    @Override // X.C1627300sRs, X.InterfaceC577400Mkk
    public void SA1() {
        C11PQ<AbstractC789520Uy6> c11pqLJJIII = LJJIII();
        final boolean z = C1627490sSB.LIZ().panelAutoSelectFirst || Intrinsics.LJFF(LJJJZ().ec().LIZJ(), Boolean.TRUE);
        final String str = "click_effect";
        c11pqLJJIII.onNext(new AbstractC789520Uy6(str, z) { // from class: X.0Uy5
            public final String LIZ;
            public final boolean LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C789510Uy5)) {
                    return false;
                }
                C789510Uy5 c789510Uy5 = (C789510Uy5) obj;
                return Intrinsics.LJFF(this.LIZ, c789510Uy5.LIZ) && this.LIZIZ == c789510Uy5.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LoadMoreEffect(enterMethod=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", shouldAutoSelectFirstEffect=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = z;
            }
        });
        this.LL.onNext(Boolean.FALSE);
    }

    @Override // X.C1627300sRs
    public /* bridge */ /* synthetic */ InterfaceC1650230t2r LJFF() {
        return this.LLIZLLLIL;
    }

    @Override // X.C1627300sRs
    public C11PQ<EnumC995050c07> LJI() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C1627300sRs
    public C01S9<InterfaceC460901qp> LJII() {
        return this.LLJLLL;
    }

    @Override // X.C1627300sRs
    public C05YC<InterfaceC460901qp> LJIIIIZZ() {
        return this.LLJLLIL;
    }

    @Override // X.C1627300sRs
    public C11NZ<Object> LJIIIZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C1627300sRs
    public C11PQ<Object> LJIIJJI() {
        return this.LLJJIJI;
    }

    @Override // X.C1627300sRs
    public C11NZ<Boolean> LJIILIIL() {
        return this.LLJLIL;
    }

    @Override // X.C1627300sRs
    public /* bridge */ /* synthetic */ InterfaceC346201Wa LJIILLIIL() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C1627300sRs
    public C11NZ<AbstractC2281091EQh> LJIIZILJ() {
        return this.LLJJJ;
    }

    @Override // X.C1627300sRs
    public C11PQ<AbstractC2281091EQh> LJIJI() {
        return this.LLJJIJIL;
    }

    @Override // X.C1627300sRs
    public C095E<List<C01WA>> LJIJJ() {
        return this.LLJL;
    }

    @Override // X.C1627300sRs
    public C11NZ<AbstractC789520Uy6> LJJI() {
        return this.LLJJ;
    }

    @Override // X.C1627300sRs
    public C11PQ<AbstractC789520Uy6> LJJIII() {
        return this.LLJILLL;
    }

    @Override // X.C1627300sRs
    public C11NZ<AbstractC788650Uwh> LJJIIJZLJL() {
        return this.LLJJIII;
    }

    @Override // X.C1627300sRs
    public C11PQ<AbstractC788650Uwh> LJJIIZ() {
        return this.LLJJI;
    }

    @Override // X.C1627300sRs
    public /* bridge */ /* synthetic */ InterfaceC346201Wa LJJIJ() {
        return this.LLJJL;
    }

    @Override // X.C1627300sRs
    public C11NZ<Boolean> LJJIJIIJI() {
        return this.LLJJJIL;
    }

    @Override // X.C1627300sRs
    public C11PQ<Effect> LJJIJLIJ() {
        return this.LLJILJIL;
    }

    @Override // X.C1627300sRs
    public C11NZ<Boolean> LJJJJI() {
        return this.LLJJJJJIL;
    }

    @Override // X.C1627300sRs
    public C11PQ<Boolean> LJJJJJL() {
        return this.LLJJJJ;
    }

    @Override // X.C1627300sRs
    public C05YD<Collection<Object>> LJJJJL() {
        return this.LLJLL;
    }

    @Override // X.C1627300sRs
    public InterfaceC332260D0u<Collection<Object>> LJJJJZ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C1627300sRs
    public ShortVideoContext LJJLIIIIJ() {
        return this.LLIZ;
    }

    @Override // X.C1627300sRs
    public /* bridge */ /* synthetic */ InterfaceC1625000sOA LJJLIIIJLLLLLLLZ() {
        return this.LLJIJIL;
    }

    @Override // X.C1627300sRs
    public C01S9<AbstractC461201qs> LJJZ() {
        return this.LLJZIJLIL;
    }

    @Override // X.C1627300sRs
    public C05YC<AbstractC461201qs> LJJZZIII() {
        return this.LLJZ;
    }

    public C1623920sMQ LJLJL() {
        return this.LLIZLLLIL;
    }

    public C05YC<C320530ChP> LJLJLJ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C05YC<List<C01W8>> LJLLI() {
        return this.LLJJL;
    }

    public C1623460sLg LJLLILLLL() {
        return this.LLJIJIL;
    }

    @Override // X.C1627300sRs, X.InterfaceC577400Mkk
    public C11NZ<Effect> h70() {
        return this.LLJILJILJ;
    }

    @Override // X.C1627300sRs, X.InterfaceC577400Mkk
    public void fP1(boolean z) {
        this.LLILZIL.onNext(Boolean.valueOf(z));
    }

    @Override // X.C1627300sRs, X.InterfaceC1648240sze
    public void pl1(boolean z) {
        EnumC995050c07 enumC995050c07;
        C11PQ<EnumC995050c07> c11pqLJI = LJI();
        if (z) {
            enumC995050c07 = EnumC995050c07.RED;
        } else {
            enumC995050c07 = EnumC995050c07.WHITE;
        }
        c11pqLJI.onNext(enumC995050c07);
    }

    @Override // X.C1627300sRs
    public void LJL(C320530ChP c320530ChP, InterfaceC497601wk interfaceC497601wk) {
        C23250099c.LIZLLL(C2296808zG.LJII(interfaceC497601wk, C0PEM.LIZJ), null, null, new C320520ChO(this, c320530ChP, null), 3);
    }

    @Override // X.C1627300sRs
    public Object LJLIIIL(List<C01W8> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objEmit = this.LLJJL.emit(list, interfaceC1364105Vn);
        if (objEmit == C099R.LJFF()) {
            return objEmit;
        }
        return Unit.LIZ;
    }

    @Override // X.C1627300sRs
    public Object LJLIL(List<C01WA> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJIJI = LJIJJ().LJIJI(list, interfaceC1364105Vn);
        if (objLJIJI == C099R.LJFF()) {
            return objLJIJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sMQ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sLg] */
    public C1627290sRr(ShortVideoContext shortVideoContext, InterfaceC1625220sOW interfaceC1625220sOW, final InterfaceC1624480sNK interfaceC1624480sNK, final Function0<? extends InterfaceC1623190sLF> function0, final C05NX c05nx, final InterfaceC1625410sOp interfaceC1625410sOp, final AbstractC1623220sLI abstractC1623220sLI) {
        C11PQ<Boolean> c11pq = new C11PQ<>();
        this.LLILZIL = c11pq;
        this.LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(106));
        this.LLIZ = shortVideoContext;
        this.LLIZLLLIL = new C1650200t2o() { // from class: X.0sMQ
        };
        this.LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(interfaceC1625220sOW, 176));
        this.LLJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(105));
        this.LLJIJIL = new C1623170sLD(function0, c05nx, interfaceC1625410sOp, abstractC1623220sLI) { // from class: X.0sLg
            public final C01GW LLILLL;
            public final C01GW LLILZ;
            public boolean LLILZLL;
            public final /* synthetic */ Function0<InterfaceC1623190sLF> LLJI;
            public final /* synthetic */ AbstractC1623220sLI LLJIJIL;
            public final C560530Lyd<Effect> LLILLJJLI = new C560530Lyd<>();
            public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(107));
            public final MutableLiveData<Effect> LLIZ = new MutableLiveData<>();
            public final C560530Lyd<Boolean> LLIZLLLIL = new C560530Lyd<>();

            @Override // X.C1623170sLD, lnn.q
            public boolean RB1() {
                return false;
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            public void pp2(boolean z, String str) {
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
            public C560530Lyd<Boolean> dN1() {
                return (C560530Lyd) this.LLILZIL.getValue();
            }

            @Override // X.C1623170sLD, lnn.q, X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
            public InterfaceC1623190sLF U() {
                return this.LLJI.invoke();
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            public C11NZ<Pair<Effect, C991780buq>> WJ0() {
                C11RK<Pair<Effect, C991780buq>> c11rk = this.LL;
                c11rk.getClass();
                return new C19475711Hn(c11rk);
            }

            @Override // X.C1623170sLD, lnn.q
            public C05NX sx1() {
                return (C05NX) this.LLILLL.getValue();
            }

            @Override // X.C1623170sLD, lnn.q, X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
            public InterfaceC1625410sOp w4() {
                return (InterfaceC1625410sOp) this.LLILZ.getValue();
            }

            @Override // X.C1623170sLD, lnn.q, X.InterfaceC1625000sOA, X.InterfaceC1623390sLZ
            public InterfaceC1624480sNK C0() {
                return this.LLJ;
            }

            public C560530Lyd<Effect> LIZJ() {
                return this.LLILLJJLI;
            }

            public MutableLiveData<Effect> LJFF() {
                return this.LLIZ;
            }

            public C560530Lyd<Boolean> LJI() {
                return this.LLIZLLLIL;
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            public /* bridge */ /* synthetic */ LiveData Lq0() {
                return this.LLIZ;
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            public boolean VS1() {
                return this.LLILZLL;
            }

            @Override // X.C1623170sLD, lnn.q
            public /* bridge */ /* synthetic */ LiveEvent iF1() {
                return this.LLIZLLLIL;
            }

            @Override // X.C1623170sLD, lnn.q
            public /* bridge */ /* synthetic */ LiveEvent jW1() {
                return this.LLILLJJLI;
            }

            @Override // X.C1623170sLD, lnn.q
            public void DA1(boolean z) {
                this.LLIZLLLIL.LJIIJ(Boolean.valueOf(z));
            }

            @Override // X.C1623170sLD, X.InterfaceC1625000sOA
            public void ao0(boolean z) {
                this.LLILZLL = z;
            }

            @Override // X.C1623170sLD, lnn.q, X.InterfaceC1625000sOA
            public void sk(InterfaceC1622080sJS interfaceC1622080sJS) {
                this.LLJIJIL.LIZ(interfaceC1622080sJS, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLJIJIL = abstractC1623220sLI;
                this.LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(c05nx, 177));
                this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(interfaceC1625410sOp, 178));
            }
        };
        this.LLJILJIL = new C11PQ<>();
        C11PQ<Effect> c11pqLJJIJLIJ = LJJIJLIJ();
        c11pqLJJIJLIJ.getClass();
        this.LLJILJILJ = new C19475711Hn(c11pqLJJIJLIJ);
        this.LLJILLL = new C11PQ<>();
        C11PQ<AbstractC789520Uy6> c11pqLJJIII = LJJIII();
        c11pqLJJIII.getClass();
        this.LLJJ = new C19475711Hn(c11pqLJJIII);
        this.LLJJI = new C11PQ<>();
        C11PQ<AbstractC788650Uwh> c11pqLJJIIZ = LJJIIZ();
        c11pqLJJIIZ.getClass();
        this.LLJJIII = new C19475711Hn(c11pqLJJIIZ);
        this.LLJJIJI = new C11PQ<>();
        C11PQ<Object> c11pqLJIIJJI = LJIIJJI();
        c11pqLJIIJJI.getClass();
        this.LLJJIJIIJIL = new C19475711Hn(c11pqLJIIJJI);
        this.LLJJIJIL = new C11PQ<>();
        C11PQ<AbstractC2281091EQh> c11pqLJIJI = LJIJI();
        c11pqLJIJI.getClass();
        this.LLJJJ = new C19475711Hn(c11pqLJIJI);
        C11PQ<Boolean> c11pq2 = this.LL;
        c11pq2.getClass();
        this.LLJJJIL = new C19475711Hn(c11pq2);
        this.LLJJJJ = C11PQ.LJLLLLLL(Boolean.TRUE);
        C11PQ<Boolean> c11pqLJJJJJL = LJJJJJL();
        c11pqLJJJJJL.getClass();
        this.LLJJJJJIL = new C19475711Hn(c11pqLJJJJJL);
        this.LLJJJJLIIL = new C11PQ<>();
        this.LLJJL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJLIIIJLLLLLLLZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJL = C095G.LIZ(4, null, 6);
        this.LLJLIL = new C19475711Hn(c11pq);
        this.LLJLILLLLZIIL = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLJLL = C09IC.LIZIZ(LJJJJZ());
        this.LLJLLIL = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJLLL = C09IC.LIZ(LJIIIIZZ());
        this.LLJZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJZIJLIL = C09IC.LIZ(LJJZZIII());
    }
}
