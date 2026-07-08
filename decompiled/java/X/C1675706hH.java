package X;

import com.ss.android.ugc.aweme.freqcontrol.IUFCDebugHelper;
import com.ss.android.ugc.aweme.freqcontrol.messageprompts.PromptUFCMessageHelper;
import com.ss.android.ugc.aweme.freqcontrol.sdk.PromptUFCFrequencySDKHelper;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675706hH implements C06RC {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public Function0<Unit> LIZLLL;
    public final PromptUFCFrequencySDKHelper LJ = new PromptUFCFrequencySDKHelper();
    public final C1676606hQ LJFF = new C1676606hQ();
    public C1675806hI LJI;
    public boolean LJII;
    public final PromptUFCMessageHelper LJIIIIZZ;
    public List<? extends C869590Y9l> LJIIIZ;
    public Long LJIIJ;
    public boolean LJIIJJI;
    public final Map<Long, Boolean> LJIIL;
    public final boolean LJIILIIL;

    @Override // X.C06RC
    public final void l0() {
        this.LJII = false;
        C1675806hI c1675806hI = this.LJI;
        if (c1675806hI != null) {
            c1675806hI.LIZJ();
        }
        this.LJI = null;
        ((LinkedHashMap) this.LJIIL).clear();
        C1676606hQ c1676606hQ = this.LJFF;
        c1676606hQ.LIZ.LIZJ();
        c1676606hQ.LIZIZ.LIZJ();
        c1676606hQ.LIZJ.LIZJ();
        c1676606hQ.LIZLLL.LIZJ();
    }

    public final void LIZ() {
        if (this.LJIIJJI) {
            return;
        }
        List<Pair<C869590Y9l, InterfaceC1677406hY>> listLIZ = this.LJIIIIZZ.LIZ(this.LJIIIZ);
        ArrayList arrayList = new ArrayList();
        for (Pair<C869590Y9l, InterfaceC1677406hY> pair : listLIZ) {
            if (pair.getSecond().getPromptType() == EnumC1641906bp.MESSAGE) {
                arrayList.add(pair);
            }
        }
        if (this.LJII) {
            C1676606hQ c1676606hQ = this.LJFF;
            c1676606hQ.LIZ.LJ(AFwS229S0000000_2.get$arr$(742));
            c1676606hQ.LIZIZ.LJ(AFwS229S0000000_2.get$arr$(743));
            c1676606hQ.LIZJ.LJ(AFwS229S0000000_2.get$arr$(744));
            c1676606hQ.LIZLLL.LJ(AFwS229S0000000_2.get$arr$(745));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c1676606hQ.LIZ((InterfaceC1677406hY) ((Pair) it2.next()).getSecond());
            }
            this.LJIIJJI = true;
            StringBuilder sb = new StringBuilder("Checking existing message prompts\nAll: ");
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator<Pair<C869590Y9l, InterfaceC1677406hY>> it3 = listLIZ.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().getSecond());
            }
            sb.append(arrayList2);
            sb.append("\nFiltered: ");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((Pair) it4.next()).getSecond());
            }
            sb.append(arrayList3);
            LIZIZ(sb.toString(), false);
        }
    }

    @Override // X.C06RC
    public final C1676806hS<EnumC1641806bo> p0() {
        return this.LJFF.LIZIZ;
    }

    @Override // X.C06RC
    public final C1676806hS<InterfaceC1675606hG> r0() {
        return this.LJFF.LIZ;
    }

    @Override // X.C06RC
    public final C1676806hS<EnumC1670906gV> u0() {
        return this.LJFF.LIZJ;
    }

    @Override // X.C06RC
    public final C1676806hS<EnumC1674506h5> w0() {
        return this.LJFF.LIZLLL;
    }

    @Override // X.C06RC
    public final int getChatType() {
        return this.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1678106hf LIZJ(X.InterfaceC1677406hY r12) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675706hH.LIZJ(X.06hY):X.06hf");
    }

    @Override // X.C06RC
    public final void m0(AwS546S0100000_2 awS546S0100000_2) {
        this.LIZLLL = awS546S0100000_2;
    }

    @Override // X.C06RC
    public final void n0(List<? extends EnumC15599068v> list) {
        C1675806hI c1675806hI = this.LJI;
        if (c1675806hI != null && c1675806hI.LJIIJJI) {
            return;
        }
        this.LJI = new C1675806hI(new C1676806hS(list), this);
    }

    @Override // X.C06RC
    public final void o0(List<? extends C869590Y9l> list) {
        C1419505h3.LIZ.getClass();
        this.LJIIIZ = list.subList(0, Math.min(C1419505h3.LIZ().lastXMessagesCount, list.size()));
        C1675806hI c1675806hI = this.LJI;
        if (c1675806hI != null && c1675806hI.LJIIL == null) {
            c1675806hI.LJIIL = c1675806hI.LIZIZ.LJIIJ;
        }
        this.LJIIJJI = false;
        t0(EnumC15599068v.UPDATE_MESSAGE_LIST);
    }

    @Override // X.C06RC
    public final void q0(long j) {
        this.LJIIJ = Long.valueOf(j);
        LIZIZ("Updated last read index", false);
    }

    @Override // X.C06RC
    public final void t0(EnumC15599068v enumC15599068v) {
        C1675806hI c1675806hI = this.LJI;
        if (c1675806hI != null) {
            if (!c1675806hI.LJIIJJI) {
                if (C13LQ.LJIILLIIL(enumC15599068v, c1675806hI.LJIIZILJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Mark as done after timeout ");
                    sbLIZ.append(enumC15599068v);
                    c1675806hI.LJ(C2188811AlT.LIZIZ(sbLIZ), true);
                    return;
                }
                return;
            }
            if (!c1675806hI.LIZ.LIZJ.contains(enumC15599068v)) {
                return;
            }
            c1675806hI.LIZ.LIZLLL(enumC15599068v);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Mark as done ");
            sbLIZ2.append(enumC15599068v);
            c1675806hI.LJ(C2188811AlT.LIZIZ(sbLIZ2), false);
            c1675806hI.LJI.add(new Pair<>(enumC15599068v.toString(), Boolean.FALSE));
            c1675806hI.LJIIIIZZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1676106hL(c1675806hI, null), 2);
        }
    }

    @Override // X.C06RC
    public final void v0(InterfaceC1677406hY interfaceC1677406hY) {
        Function0<Unit> function0;
        C1676606hQ c1676606hQ = this.LJFF;
        c1676606hQ.getClass();
        if (interfaceC1677406hY instanceof InterfaceC1675606hG) {
            c1676606hQ.LIZ.LIZLLL(interfaceC1677406hY);
        } else if (interfaceC1677406hY instanceof EnumC1641806bo) {
            c1676606hQ.LIZIZ.LIZLLL(interfaceC1677406hY);
        } else if (interfaceC1677406hY instanceof EnumC1670906gV) {
            c1676606hQ.LIZJ.LIZLLL(interfaceC1677406hY);
        } else if (interfaceC1677406hY instanceof EnumC1674506h5) {
            c1676606hQ.LIZLLL.LIZLLL(interfaceC1677406hY);
        } else {
            throw new C1954807lC();
        }
        if (Intrinsics.LJFF(interfaceC1677406hY.getUiType(), "sheet") && (function0 = this.LIZLLL) != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hide ");
        sbLIZ.append(interfaceC1677406hY);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final void LIZIZ(String str, boolean z) {
        IPromptUnifiedFrequencyController.LIZ.getClass();
        C06R9.LIZ().LJ(C06RH.ROOM, str, this.LIZIZ, z);
    }

    @Override // X.C06RC
    public final void s0(InterfaceC1677406hY interfaceC1677406hY, boolean z) {
        this.LJFF.LIZ(interfaceC1677406hY);
        if (z && this.LJII) {
            if (interfaceC1677406hY instanceof EnumC1670906gV) {
                PromptUFCFrequencySDKHelper promptUFCFrequencySDKHelper = this.LJ;
                promptUFCFrequencySDKHelper.getClass();
                PromptUFCFrequencySDKHelper.LIZLLL("Set P2 shown");
                long jLIZJ = PromptUFCFrequencySDKHelper.LIZJ();
                promptUFCFrequencySDKHelper.LJ(jLIZJ);
                InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) promptUFCFrequencySDKHelper.LIZJ.getValue();
                if (interfaceC1411705fn != null) {
                    interfaceC1411705fn.LIZLLL(jLIZJ, jLIZJ, "");
                }
            } else if (interfaceC1677406hY instanceof EnumC1674506h5) {
                PromptUFCFrequencySDKHelper promptUFCFrequencySDKHelper2 = this.LJ;
                promptUFCFrequencySDKHelper2.getClass();
                PromptUFCFrequencySDKHelper.LIZLLL("Set P3 shown");
                long jLIZJ2 = PromptUFCFrequencySDKHelper.LIZJ();
                promptUFCFrequencySDKHelper2.LJ(jLIZJ2);
                InterfaceC1411705fn interfaceC1411705fn2 = (InterfaceC1411705fn) promptUFCFrequencySDKHelper2.LIZLLL.getValue();
                if (interfaceC1411705fn2 != null) {
                    interfaceC1411705fn2.LIZLLL(jLIZJ2, jLIZJ2, "");
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Showing ");
        sbLIZ.append(interfaceC1677406hY);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public C1675706hH(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        C1674906h9 c1674906h9 = new C1674906h9(C461720I8s.LIZIZ());
        this.LJII = true;
        System.currentTimeMillis();
        this.LJIIIIZZ = new PromptUFCMessageHelper(c1674906h9, str);
        this.LJIIIZ = C13BV.INSTANCE;
        this.LJIIJJI = true;
        this.LJIIL = new LinkedHashMap();
        IUFCDebugHelper.LIZ.getClass();
        IUFCDebugHelper value = C1677506hZ.LIZIZ.getValue();
        this.LJIILIIL = value != null && value.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0288  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C06RC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(X.InterfaceC1677406hY r14, java.lang.Long r15, long r16, X.InterfaceC1364105Vn<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675706hH.x0(X.06hY, java.lang.Long, long, X.05Vn):java.lang.Object");
    }
}
