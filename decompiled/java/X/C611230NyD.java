package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl$batchWrite$ok$1", f = "StoryCollectionStoreServiceImpl.kt", l = {195}, m = "invokeSuspend")
public final class C611230NyD extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ArrayList<C611290NyJ> LLILLL;
    public final /* synthetic */ ArrayList<C611240NyE> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611230NyD(ArrayList<C611290NyJ> arrayList, ArrayList<C611240NyE> arrayList2, InterfaceC1364105Vn<? super C611230NyD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = arrayList;
        this.LLILZ = arrayList2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611230NyD c611230NyD = new C611230NyD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c611230NyD.LLILLJJLI = obj;
        return c611230NyD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.batchWrite$ok$1");
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
            InterfaceC611220NyC interfaceC611220NyCLIZIZ = ((SkylightUnifiedDB) this.LLILLJJLI).LIZIZ();
            ArrayList<C611290NyJ> arrayList = this.LLILLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<C611290NyJ> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZ);
            }
            ArrayList<C611240NyE> arrayList3 = this.LLILZ;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (C611240NyE c611240NyE : arrayList3) {
                arrayList4.add(new C611330NyN(c611240NyE.LIZIZ, c611240NyE.LIZ));
            }
            this.LL = 1;
            if (interfaceC611220NyCLIZIZ.LIZJ(arrayList2, arrayList4, this) == objLJFF) {
                C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchWrite$ok$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchWrite$ok$1");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
