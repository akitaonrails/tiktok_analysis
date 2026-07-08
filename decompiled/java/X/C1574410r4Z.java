package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo;
import com.ss.android.ugc.aweme.minidrama.common.share.ShareAwemeCacheServiceImpl;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0r4Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.share.ShareAwemeCacheServiceImpl$preloadByCollectionIds$1", f = "ShareAwemeCacheServiceImpl.kt", l = {83}, m = "invokeSuspend")
public final class C1574410r4Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1574500r4i LLILLL;
    public final /* synthetic */ AbstractC1574450r4d LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ List<Long> LLIZ;
    public final /* synthetic */ ShareAwemeCacheServiceImpl LLIZLLLIL;
    public final /* synthetic */ C00EX LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574410r4Z(AbstractC1574450r4d abstractC1574450r4d, AbstractC1574500r4i abstractC1574500r4i, ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl, C00EX c00ex, String str, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1574500r4i;
        this.LLILZ = abstractC1574450r4d;
        this.LLILZIL = list;
        this.LLILZLL = function1;
        this.LLIZ = list2;
        this.LLIZLLLIL = shareAwemeCacheServiceImpl;
        this.LLJ = c00ex;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AbstractC1574500r4i abstractC1574500r4i = this.LLILLL;
        AbstractC1574450r4d abstractC1574450r4d = this.LLILZ;
        List<Long> list = this.LLILZIL;
        Function1<Integer, Unit> function1 = this.LLILZLL;
        C1574410r4Z c1574410r4Z = new C1574410r4Z(abstractC1574450r4d, abstractC1574500r4i, this.LLIZLLLIL, this.LLJ, this.LLJI, list, this.LLIZ, interfaceC1364105Vn, function1);
        c1574410r4Z.LLILLJJLI = obj;
        return c1574410r4Z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        Aweme aweme;
        Object objLIZ = obj;
        C1C7U.LIZ("ShareAwemeCacheServiceImpl@5f57.preloadByCollectionIds$1");
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
                    ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl = this.LLIZLLLIL;
                    List<Long> list = this.LLILZIL;
                    AbstractC1574450r4d abstractC1574450r4d = this.LLILZ;
                    String str = this.LLJI;
                    AbstractC1574500r4i abstractC1574500r4i = this.LLILLL;
                    InterfaceC1574420r4a interfaceC1574420r4a = shareAwemeCacheServiceImpl.LIZJ;
                    String strLIZ = abstractC1574500r4i.LIZ();
                    this.LL = 1;
                    objLIZ = interfaceC1574420r4a.LIZ(list, abstractC1574450r4d, str, strLIZ, this);
                    if (objLIZ == objLJFF) {
                        C1C7U.LIZIZ("ShareAwemeCacheServiceImpl@5f57.preloadByCollectionIds$1");
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
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.LLILLL.LIZ();
                this.LLILZ.LIZ();
                this.LLILZIL.size();
                Objects.toString(this.LLILZIL);
            }
            C118300cf c118300cf = new C118300cf();
            if (list2 != null) {
                AbstractC1574450r4d abstractC1574450r4d2 = this.LLILZ;
                AbstractC1574500r4i abstractC1574500r4i2 = this.LLILLL;
                ShareAwemeCacheServiceImpl shareAwemeCacheServiceImpl2 = this.LLIZLLLIL;
                for (CollectionVideo collectionVideo : list2) {
                    Long l = collectionVideo.collectionId;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        PaidVideoItem paidVideoItem = collectionVideo.video;
                        if (paidVideoItem != null && (aweme = paidVideoItem.aweme) != null) {
                            if (C1579380rCa.LIZ(aweme)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preloadByCollectionIds: skip paid-locked aweme cid=");
                                sbLIZ.append(jLongValue);
                                sbLIZ.append(" variant=");
                                sbLIZ.append(abstractC1574450r4d2.LIZ());
                                sbLIZ.append(" producer=");
                                sbLIZ.append(abstractC1574500r4i2.LIZ());
                                C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                if (!Intrinsics.LJFF(abstractC1574450r4d2, C1574380r4W.LIZ) && !Intrinsics.LJFF(abstractC1574450r4d2, C1574440r4c.LIZ) && !(abstractC1574450r4d2 instanceof C1574370r4V)) {
                                    throw new C1954807lC();
                                }
                                shareAwemeCacheServiceImpl2.LIZ.LJFF(jLongValue, abstractC1574450r4d2, aweme, abstractC1574500r4i2);
                                c118300cf.element++;
                            }
                        }
                    }
                }
            }
            if (c118300cf.element > 0) {
                this.LLILLL.LIZ();
                this.LLILZ.LIZ();
                this.LLILZIL.size();
            }
            Function1<Integer, Unit> function1 = this.LLILZLL;
            if (function1 != null) {
                function1.invoke(C2286608xc.LJ((this.LLIZ.size() - this.LLILZIL.size()) + c118300cf.element));
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        this.LLIZLLLIL.LIZ.LJI(this.LLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareAwemeCacheServiceImpl@5f57.preloadByCollectionIds$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
