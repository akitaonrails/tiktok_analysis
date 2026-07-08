package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftRemover$deleteSelectDrafts$1", f = "DraftRemover.kt", l = {78}, m = "invokeSuspend")
public final class C555430LqP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C555490LqV LLILLJJLI;
    public final /* synthetic */ List<C0M0P> LLILLL;
    public final /* synthetic */ C561130Lzb LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555430LqP(C561130Lzb c561130Lzb, C555490LqV c555490LqV, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c555490LqV;
        this.LLILLL = list;
        this.LLILZ = c561130Lzb;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C555430LqP(this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set setLIZIZ;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        C1C7U.LIZ("DraftRemover@581a.deleteSelectDrafts$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C555490LqV c555490LqV = this.LLILLJJLI;
            List<C0M0P> list = this.LLILLL;
            c555490LqV.getClass();
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ2 == null || iCreationAsyncTaskManagerLIZ2.LJIILIIL() == null || (setLIZIZ = C0LCT.LIZIZ()) == null) {
                setLIZIZ = C08CX.INSTANCE;
            }
            ArrayList<C0M0P> arrayList = new ArrayList();
            for (C0M0P c0m0p : list) {
                C0M0P c0m0p2 = c0m0p;
                if (c0m0p2.LJIILIIL != EnumC545550LaT.NONE || setLIZIZ.contains(c0m0p2.LJ)) {
                    arrayList.add(c0m0p);
                }
            }
            ArrayList<Pair> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C0M0P c0m0p3 : arrayList) {
                arrayList2.add(new Pair(c0m0p3.LJ, c0m0p3.LJIILIIL));
            }
            if (!arrayList2.isEmpty()) {
                for (Pair pair : arrayList2) {
                    String str = (String) pair.getFirst();
                    if (pair.getSecond() == EnumC545550LaT.PROCESSING && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                        iCreationAsyncTaskManagerLIZ.LJJIL(str);
                    }
                    C09AE c09ae = c555490LqV.LIZJ.get(str);
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                    c555490LqV.LIZJ.remove(str);
                }
            }
            for (C0M0P c0m0p4 : list) {
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ3 = C09BV.LIZ();
                if (iCreationAsyncTaskManagerLIZ3 != null && iCreationAsyncTaskManagerLIZ3.LJIILIIL() != null) {
                    C0LCT.LIZLLL(c0m0p4.LJ, false);
                }
            }
            InterfaceC555450LqR interfaceC555450LqR = c555490LqV.LJ;
            if (interfaceC555450LqR != null) {
                interfaceC555450LqR.lI(list);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C555440LqQ c555440LqQ = new C555440LqQ(this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c555440LqQ) == objLJFF) {
                C1C7U.LIZIZ("DraftRemover@581a.deleteSelectDrafts$1");
                return objLJFF;
            }
        }
        InterfaceC555450LqR interfaceC555450LqR2 = this.LLILLJJLI.LJ;
        if (interfaceC555450LqR2 != null) {
            interfaceC555450LqR2.sb(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftRemover@581a.deleteSelectDrafts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
