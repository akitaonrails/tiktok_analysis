package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo;
import com.ss.android.ugc.aweme.minidrama.common.share.ShareAwemeCacheServiceImpl;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.share.ShareAwemeCacheServiceImpl$preloadByVideoIds$1", f = "ShareAwemeCacheServiceImpl.kt", l = {161}, m = "invokeSuspend")
public final class C1574400r4Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1574500r4i LLILLL;
    public final /* synthetic */ List<Long> LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;
    public final /* synthetic */ List<Long> LLILZLL;
    public final /* synthetic */ ShareAwemeCacheServiceImpl LLIZ;
    public final /* synthetic */ C00EX LLIZLLLIL;
    public final /* synthetic */ AbstractC1574450r4d LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574400r4Y(AbstractC1574450r4d abstractC1574450r4d, AbstractC1574500r4i abstractC1574500r4i, ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl, C00EX c00ex, String str, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1574500r4i;
        this.LLILZ = list;
        this.LLILZIL = function1;
        this.LLILZLL = list2;
        this.LLIZ = shareAwemeCacheServiceImpl;
        this.LLIZLLLIL = c00ex;
        this.LLJ = abstractC1574450r4d;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AbstractC1574500r4i abstractC1574500r4i = this.LLILLL;
        List<Long> list = this.LLILZ;
        Function1<Integer, Unit> function1 = this.LLILZIL;
        List<Long> list2 = this.LLILZLL;
        C1574400r4Y c1574400r4Y = new C1574400r4Y(this.LLJ, abstractC1574500r4i, this.LLIZ, this.LLIZLLLIL, this.LLJI, list, list2, interfaceC1364105Vn, function1);
        c1574400r4Y.LLILLJJLI = obj;
        return c1574400r4Y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Aweme aweme;
        String aid;
        Long lLJIILIIL;
        Object objLIZ = obj;
        C1C7U.LIZ("ShareAwemeCacheServiceImpl@5f57.preloadByVideoIds$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    C155000ia.LIZIZ(objLIZ);
                    ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl = this.LLIZ;
                    List<Long> list = this.LLILZ;
                    AbstractC1574450r4d abstractC1574450r4d = this.LLJ;
                    String str = this.LLJI;
                    AbstractC1574500r4i abstractC1574500r4i = this.LLILLL;
                    InterfaceC1574420r4a interfaceC1574420r4a = shareAwemeCacheServiceImpl.LIZJ;
                    String strLIZ = abstractC1574500r4i.LIZ();
                    this.LL = 1;
                    objLIZ = interfaceC1574420r4a.LIZ(list, abstractC1574450r4d, str, strLIZ, this);
                    if (objLIZ == objLJFF) {
                        C1C7U.LIZIZ("ShareAwemeCacheServiceImpl@5f57.preloadByVideoIds$1");
                        return objLJFF;
                    }
                }
                c098200Yq = (List) objLIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            List<CollectionVideo> list2 = (List) c098200Yq;
            if (list2 != null) {
                list2.isEmpty();
            }
            C118300cf c118300cf = new C118300cf();
            if (list2 != null) {
                AbstractC1574500r4i abstractC1574500r4i2 = this.LLILLL;
                ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl2 = this.LLIZ;
                for (CollectionVideo collectionVideo : list2) {
                    Long l = collectionVideo.collectionId;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        PaidVideoItem paidVideoItem = collectionVideo.video;
                        if (paidVideoItem != null && (aweme = paidVideoItem.aweme) != null && (aid = aweme.getAid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                            long jLongValue2 = lLJIILIIL.longValue();
                            if (!C1579380rCa.LIZ(aweme)) {
                                shareAwemeCacheServiceImpl2.LIZ.LJFF(jLongValue, new C1574370r4V(jLongValue2), aweme, abstractC1574500r4i2);
                                c118300cf.element++;
                            }
                        }
                    }
                }
            }
            Function1<Integer, Unit> function1 = this.LLILZIL;
            if (function1 != null) {
                function1.invoke(C2286608xc.LJ((this.LLILZLL.size() - this.LLILZ.size()) + c118300cf.element));
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        this.LLIZ.LIZ.LJI(this.LLIZLLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareAwemeCacheServiceImpl@5f57.preloadByVideoIds$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
