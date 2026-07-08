package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225790i0H implements InterfaceC1224550hyH {
    public final AbstractC1225770i0F LIZ;
    public final AbstractC1225870i0P LIZIZ;
    public List<? extends InterfaceC1224210hxj> LIZJ;
    public final C1224630hyP LIZLLL;

    @Override // X.InterfaceC1224550hyH
    public final List<InterfaceC1224210hxj> LIZ() {
        List list = this.LIZJ;
        if (list != null) {
            return list;
        }
        List<C1225950i0X> listLIZIZ = this.LIZIZ.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (final C1225950i0X c1225950i0X : listLIZIZ) {
            final AbstractC1225770i0F abstractC1225770i0F = this.LIZ;
            arrayList.add(new InterfaceC1224210hxj(abstractC1225770i0F, c1225950i0X) { // from class: X.0i0a
                public final AbstractC1225770i0F LIZ;
                public final C1225950i0X LIZIZ;
                public InterfaceC1224180hxg LIZJ;
                public List<? extends InterfaceC1224260hxo> LIZLLL;

                @Override // X.InterfaceC1224210hxj
                public final C1224570hyJ LIZ() {
                    return this.LIZIZ.LIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
                @Override // X.InterfaceC1224210hxj
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.InterfaceC1224180hxg LIZIZ() {
                    /*
                        r7 = this;
                        X.0hxg r0 = r7.LIZJ
                        if (r0 == 0) goto L5
                        return r0
                    L5:
                        X.0i0X r1 = r7.LIZIZ
                        X.0hyJ r0 = r1.LIZ
                        java.lang.String r5 = r0.LIZIZ
                        X.0hwb r4 = r1.LIZIZ
                        com.bytedance.provider.impl.GScope r1 = com.bytedance.provider.impl.GScope.LL
                        java.lang.Class<com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory> r0 = com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory.class
                        r3 = 0
                        java.util.List r0 = X.C1554610qYd.LIZIZ(r1, r0, r3)
                        r6 = 0
                        if (r0 == 0) goto L4b
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        java.util.Iterator r2 = r0.iterator()
                    L1f:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L49
                        java.lang.Object r1 = r2.next()
                        r0 = r1
                        com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory r0 = (com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory) r0
                        X.0i1U r0 = r0.getTabKey()
                        java.lang.String r0 = r0.getValue()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
                        if (r0 == 0) goto L1f
                    L3a:
                        com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory r1 = (com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory) r1
                        if (r1 == 0) goto L4b
                        X.0i0F r0 = r7.LIZ
                        X.0i0Z r0 = r1.WT1(r0, r4)
                        if (r0 == 0) goto L4b
                    L46:
                        r7.LIZJ = r0
                        return r0
                    L49:
                        r1 = r6
                        goto L3a
                    L4b:
                        com.bytedance.provider.impl.GScope r1 = com.bytedance.provider.impl.GScope.LL
                        java.lang.Class<com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory> r0 = com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory.class
                        java.util.List r0 = X.C1554610qYd.LIZIZ(r1, r0, r3)
                        if (r0 == 0) goto L70
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        java.util.Iterator r2 = r0.iterator()
                    L5b:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L70
                        java.lang.Object r1 = r2.next()
                        com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory r1 = (com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFallbackFactory) r1
                        X.0i0F r0 = r7.LIZ
                        X.0i30 r0 = r1.Q41(r0, r5, r4)
                        if (r0 == 0) goto L5b
                        goto L46
                    L70:
                        X.0i0Z r0 = new X.0i0Z
                        r0.<init>(r4, r3)
                        goto L46
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1225980i0a.LIZIZ():X.0hxg");
                }

                @Override // X.InterfaceC1224210hxj
                public final List<InterfaceC1224260hxo> LIZJ() {
                    Object next;
                    C1226700i1k c1226700i1kFu0;
                    List list2 = this.LIZLLL;
                    if (list2 != null) {
                        return list2;
                    }
                    AbstractC1225770i0F abstractC1225770i0F2 = this.LIZ;
                    C1225950i0X c1225950i0X2 = this.LIZIZ;
                    List<C1226750i1p> list3 = c1225950i0X2.LIZJ;
                    ArrayList arrayList2 = new ArrayList();
                    for (C1226750i1p c1226750i1p : list3) {
                        List listLIZIZ2 = C1554610qYd.LIZIZ(GScope.LL, IContactSelectorHeaderFactory.class, false);
                        if (listLIZIZ2 != null) {
                            Iterator it2 = ((ArrayList) listLIZIZ2).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (Intrinsics.LJFF(((IContactSelectorHeaderFactory) next).lW(), c1226750i1p.LIZ)) {
                                    break;
                                }
                            }
                            IContactSelectorHeaderFactory iContactSelectorHeaderFactory = (IContactSelectorHeaderFactory) next;
                            if (iContactSelectorHeaderFactory != null && (c1226700i1kFu0 = iContactSelectorHeaderFactory.Fu0(abstractC1225770i0F2, c1226750i1p, c1225950i0X2.LIZ.LIZIZ)) != null) {
                                arrayList2.add(c1226700i1kFu0);
                            }
                        }
                    }
                    this.LIZLLL = arrayList2;
                    return arrayList2;
                }

                {
                    this.LIZ = abstractC1225770i0F;
                    this.LIZIZ = c1225950i0X;
                }
            });
        }
        this.LIZJ = arrayList;
        return arrayList;
    }

    @Override // X.InterfaceC1224550hyH
    public final C1224630hyP LIZIZ() {
        return this.LIZLLL;
    }

    public C1225790i0H(AbstractC1225770i0F abstractC1225770i0F, AbstractC1225870i0P abstractC1225870i0P) {
        this.LIZ = abstractC1225770i0F;
        this.LIZIZ = abstractC1225870i0P;
        this.LIZLLL = abstractC1225870i0P.LIZ();
    }
}
