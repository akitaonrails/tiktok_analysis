package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a1;
import defpackage.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0H8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.coldcache.UnconsumedListScoreWrapper$getHighestAwemeListUsingSimilarity$sortedAwemeList$1", f = "UnconsumedListScoreWrapper.kt", l = {306}, m = "invokeSuspend")
public final class C436150H8j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Aweme>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<Aweme> LLILLL;
    public final /* synthetic */ ArrayList<C590350NDl> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436150H8j(List<? extends Aweme> list, ArrayList<C590350NDl> arrayList, InterfaceC1364105Vn<? super C436150H8j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436150H8j(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnconsumedListScoreWrapper@9c3d.getHighestAwemeListUsingSimilarity$sortedAwemeList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList<C590350NDl> arrayList = this.LLILZ;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            z0 z0Var = z0.LIZ;
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(c23260099m, 375);
            synchronized (z0Var) {
                C23250099c.LIZLLL(z0.LIZIZ, null, null, new a1(arrayList, awS585S0100000_6, null), 3);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnconsumedListScoreWrapper@9c3d.getHighestAwemeListUsingSimilarity$sortedAwemeList$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        C118300cf c118300cf = new C118300cf();
        List<Aweme> list2 = this.LLILLL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Aweme aweme : list2) {
            linkedHashMap.put(aweme.getAid(), aweme);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (c118300cf.element >= C590380NDo.LJ()) {
                break;
            }
            Object obj3 = linkedHashMap.get(obj2);
            if (obj3 != null) {
                arrayList2.add(obj3);
                int i2 = c118300cf.element;
                c118300cf.element = i2 + 1;
                C2286608xc.LJ(i2);
            }
        }
        if (c118300cf.element < C590380NDo.LJ()) {
            int iLJ = C590380NDo.LJ() - c118300cf.element;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Aweme) it2.next()).getAid());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList3);
            List<Aweme> list3 = this.LLILLL;
            ArrayList arrayList4 = new ArrayList();
            for (Aweme aweme2 : list3) {
                if (!setLLIIJI.contains(aweme2.getAid())) {
                    arrayList4.add(aweme2);
                }
            }
            Iterator it3 = C13LP.LLD(iLJ, arrayList4).iterator();
            while (it3.hasNext()) {
                ListProtector.add(arrayList2, 0, it3.next());
            }
        }
        C1C7U.LIZIZ("UnconsumedListScoreWrapper@9c3d.getHighestAwemeListUsingSimilarity$sortedAwemeList$1");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
