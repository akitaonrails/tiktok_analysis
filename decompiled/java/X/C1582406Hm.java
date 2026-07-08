package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.exp.StreakPetExpValueManager$hitStreakPetExp$1", f = "StreakPetExpValueManager.kt", l = {155, 112}, m = "invokeSuspend")
public final class C1582406Hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C1582706Hp LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582406Hm(C1582706Hp c1582706Hp, String str, long j, String str2, String str3, InterfaceC1364105Vn<? super C1582406Hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c1582706Hp;
        this.LLJI = str;
        this.LLJIJIL = j;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1582406Hm c1582406Hm = new C1582406Hm(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1582406Hm.LLIZLLLIL = obj;
        return c1582406Hm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN interfaceC383701eN;
        InterfaceC497601wk interfaceC497601wk;
        C1582706Hp c1582706Hp;
        Object obj2;
        long j;
        String str;
        String str2;
        C1C7U.LIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLIZ;
        boolean z = true;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = this.LLILZLL;
                            str2 = (String) this.LLILLL;
                            str = (String) this.LLILLJJLI;
                            interfaceC383701eN = this.LL;
                            interfaceC497601wk = (InterfaceC497601wk) this.LLIZLLLIL;
                            try {
                                C155000ia.LIZIZ(obj);
                                C2296808zG.LJFF(interfaceC497601wk);
                                boolean z2 = C1590806Ks.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("hitStreakPetExpValue request=");
                                sbLIZ.append(j);
                                sbLIZ.append(" cachedStreakExpKey=");
                                sbLIZ.append(str);
                                sbLIZ.append(" cachedStreakPetExpValue=");
                                sbLIZ.append(str2);
                                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                interfaceC383701eN.LIZIZ(null);
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                interfaceC383701eN.LIZIZ(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.LLILZLL;
                    str2 = (String) this.LLILZIL;
                    str = (String) this.LLILZ;
                    obj2 = this.LLILLL;
                    c1582706Hp = (C1582706Hp) this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    interfaceC497601wk = (InterfaceC497601wk) this.LLIZLLLIL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC497601wk = (InterfaceC497601wk) this.LLIZLLLIL;
                    c1582706Hp = this.LLJ;
                    interfaceC383701eN = c1582706Hp.LJFF;
                    obj2 = this.LLJI;
                    j = this.LLJIJIL;
                    str = this.LLJILJIL;
                    str2 = this.LLJILJILJ;
                    this.LLIZLLLIL = interfaceC497601wk;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = c1582706Hp;
                    this.LLILLL = obj2;
                    this.LLILZ = str;
                    this.LLILZIL = str2;
                    this.LLILZLL = j;
                    this.LLIZ = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
                        return objLJFF;
                    }
                }
                if (C15546066u.LIZ()) {
                    c1582706Hp.getClass();
                    if (!C1583306Hv.LIZ().fetchStreakPetExpInfoEnterChat || C1582706Hp.LJIIJ.contains(obj2)) {
                        z = false;
                    }
                    if (z) {
                        List listSingletonList = Collections.singletonList(C2286608xc.LJFF(j));
                        C823170WQx<String> c823170WQx = C1582706Hp.LJIIJ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
                        Iterator it2 = listSingletonList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(c1582706Hp.LIZIZ.invoke(String.valueOf(((Number) it2.next()).longValue())));
                        }
                        c823170WQx.addAll(arrayList);
                        C913070Zrt c913070Zrt = ChatRoomAdaptiveRequestManager.LIZ;
                        C1582506Hn c1582506Hn = new C1582506Hn(c1582706Hp, listSingletonList, null);
                        this.LLIZLLLIL = interfaceC497601wk;
                        this.LL = interfaceC383701eN;
                        this.LLILLJJLI = str;
                        this.LLILLL = str2;
                        this.LLILZ = null;
                        this.LLILZIL = null;
                        this.LLILZLL = j;
                        this.LLIZ = 2;
                        if (c913070Zrt.LJLLI(this, c1582506Hn) == objLJFF) {
                            C1C7U.LIZIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
                            return objLJFF;
                        }
                        C2296808zG.LJFF(interfaceC497601wk);
                        boolean z22 = C1590806Ks.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("hitStreakPetExpValue request=");
                        sbLIZ2.append(j);
                        sbLIZ2.append(" cachedStreakExpKey=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" cachedStreakPetExpValue=");
                        sbLIZ2.append(str2);
                        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        interfaceC383701eN.LIZIZ(null);
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
                        return unit2;
                    }
                }
                boolean z3 = C1590806Ks.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("hitStreakPetExpValue cachedStreakExpKey=");
                sbLIZ3.append(str);
                sbLIZ3.append(" cachedStreakPetExpValue=");
                sbLIZ3.append(str2);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                interfaceC383701eN.LIZIZ(null);
                Unit unit22 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetExpValueManager@912.hitStreakPetExp$1");
                return unit22;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th3) {
            while (true) {
                th = th3;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
