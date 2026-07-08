package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.recommend.RecommendFeature;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.api.IFfpSearchApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227330i2l extends C1224950hyv {
    public final C1227080i2M LLILZ;
    public final Map<String, C1227400i2s> LLILZIL;
    public List<C1224840hyk> LLILZLL;
    public final IFfpSearchApi LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // X.C1224950hyv, X.InterfaceC1223590hwj
    public final List<AbstractC1223800hx4> LJJIJ() {
        ?? arrayList;
        InterfaceC1224210hxj next;
        C1228060i3w c1228060i3w;
        List<? extends AbstractC1223800hx4> list;
        ArrayList arrayList2 = null;
        if (this.LLILZLL == null) {
            Iterator<InterfaceC1224210hxj> it2 = ((C1225790i0H) this.LLILLJJLI.LJIILLIIL()).LIZ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ().LIZIZ, EnumC1226540i1U.TAB_KEY_FRIENDS.getValue())) {
                    break;
                }
            }
            InterfaceC1224210hxj interfaceC1224210hxj = next;
            InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = interfaceC1224210hxj != null ? interfaceC1224210hxj.LIZIZ() : null;
            if ((interfaceC1224180hxgLIZIZ instanceof C1228060i3w) && (c1228060i3w = (C1228060i3w) interfaceC1224180hxgLIZIZ) != null && (list = c1228060i3w.LLILZIL) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (AbstractC1223800hx4 abstractC1223800hx4 : list) {
                    if (abstractC1223800hx4 instanceof C1224840hyk) {
                        arrayList3.add(abstractC1223800hx4);
                    }
                }
                arrayList2 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (Intrinsics.LJFF(((C1224840hyk) obj).LLJI.get("index_tag"), "combined_suggested")) {
                        arrayList2.add(obj);
                    }
                }
            }
            this.LLILZLL = arrayList2;
        }
        List<C1224840hyk> list2 = this.LLILZLL;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1224840hyk> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(LJJJJIZL(this, it3.next(), "", LJJJJJ(), false, true, 4));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList4.add(new C1223790hx3(C1383370m6R.LIZ.getString(2131831591), C1227320i2k.LIZJ(), 4));
            arrayList4.addAll(arrayList);
        }
        return arrayList4;
    }

    @Override // X.C1224950hyv, X.InterfaceC1223360hwM
    public final View LJ() {
        C1749280vcc c1749280vcc = new C1749280vcc(this.LLILLJJLI.LJJJJLL().LIZIZ(), null, 6);
        c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(200));
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJ(c1722300uv6);
        c1749280vcc.setStatus(c1722300uv6);
        return c1749280vcc;
    }

    public final Set<String> LJJJJJ() {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1224840hyk> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LLILZ);
            }
            Set<String> setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    @Override // X.C1224950hyv, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        List<C1224840hyk> list;
        Map<String, List<C1224840hyk>> map = c1224790hyf.LIZ;
        if (map != null && (list = map.get(EnumC1226540i1U.TAB_KEY_FRIENDS.getValue())) != null) {
            ArrayList arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                if (Intrinsics.LJFF(c1224840hyk.LLJI.get("index_tag"), "combined_suggested")) {
                    arrayList.add(c1224840hyk);
                }
            }
            this.LLILZLL = arrayList;
        }
    }

    public C1227330i2l(AbstractC1225770i0F abstractC1225770i0F, C1227080i2M c1227080i2M) {
        super(abstractC1225770i0F, c1227080i2M);
        this.LLILZ = c1227080i2M;
        this.LLILZIL = Collections.synchronizedMap(new LinkedHashMap());
        this.LLIZ = (IFfpSearchApi) PluggableExtentionKt.pluggableSpiForReal(IFfpSearchApi.class);
    }

    @Override // X.C1224950hyv, X.InterfaceC1223360hwM
    public final void LJJ(FrameLayout frameLayout, String str) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        C1227400i2s c1227400i2s = this.LLILZIL.get(str);
        if (c1227400i2s != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, frameLayout);
        if (c1227400i2s != null) {
            if (frameLayout.findViewById(R.id.suz) == null) {
                C786410Ut5.Sd(R.layout.cjo, C786410Ut5.ne(frameLayout.getContext()), frameLayout);
            }
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, frameLayout);
        if (c1227400i2s != null) {
            C0QB7 c0qb7 = (C0QB7) frameLayout.findViewById(R.id.oyp);
            TuxTextView tuxTextView = (TuxTextView) frameLayout.findViewById(R.id.suz);
            MatchedFriendStruct matchedFriendStruct = c1227400i2s.LIZ;
            if (matchedFriendStruct != null) {
                MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
                if (mutualStruct != null && mutualStruct.total > 0) {
                    z2 = true;
                    i3 = 0;
                } else {
                    z2 = false;
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, c0qb7);
                if (!z2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, tuxTextView);
                if (z2) {
                    c0qb7.LIZ(mutualStruct, 4);
                } else {
                    C06QL c06ql = RecommendFeature.LIZ;
                    c06ql.getClass();
                    RecommendFeature value = C06QL.LIZJ.getValue(c06ql, C06QL.LIZIZ[0]);
                    if (value != null) {
                        value.LIZ(tuxTextView, c1227400i2s.LIZJ);
                    }
                }
                if (c0qb7.getTvDesc().getVisibility() == 0 && z2) {
                    c0qb7.getTvDesc().setMaxLines(1);
                }
            } else {
                C786410Ut5.LJLLLLLL(8, c0qb7);
                C786410Ut5.LJLLLLLL(8, tuxTextView);
            }
            TextView textView = (TextView) frameLayout.findViewById(R.id.pvd);
            if (C866950Xzh.LIZ(c1227400i2s.LIZIZ)) {
                C786410Ut5.LJLLLLLL(0, textView);
                textView.setText(c1227400i2s.LIZIZ);
            } else {
                C786410Ut5.LJLLLLLL(8, textView);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C1224950hyv, X.InterfaceC1223590hwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(java.lang.String r28, X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r29) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227330i2l.LJJIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1224840hyk LJJJJIZL(X.C1227330i2l r9, X.C1224840hyk r10, java.lang.String r11, java.util.Set r12, boolean r13, boolean r14, int r15) {
        /*
            r0 = r15 & 4
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r0 = r15 & 8
            if (r0 == 0) goto La
            r14 = 0
        La:
            r9.getClass()
            r3 = r10
            boolean r0 = r3.LLJILJILJ
            if (r0 != 0) goto L66
            X.0i0F r2 = r9.LLILLJJLI
            java.util.List r0 = X.C1227320i2k.LIZIZ(r2)
            int r1 = r0.size()
            X.0i0G r0 = r2.LJJJJLL()
            X.0hxw r0 = r0.LIZJ()
            int r0 = r0.LIZIZ()
            if (r1 >= r0) goto L66
            r10 = 0
        L2b:
            X.0hyl r4 = new X.0hyl
            X.0bwD r1 = X.EnumC992630bwD.TYPE_SEARCH_PAGE
            java.lang.String r0 = ""
            r4.<init>(r1, r0)
            if (r13 == 0) goto L63
            X.0hyj r5 = X.EnumC1224830hyj.HIGHER
        L38:
            java.lang.String r0 = r3.LLILZ
            r1 = r12
            boolean r9 = r1.contains(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.LLJI
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
            java.lang.String r0 = "is_search_page_item"
            java.lang.String r1 = "1"
            r7.put(r0, r1)
            if (r14 != 0) goto L51
            java.lang.String r1 = "0"
        L51:
            java.lang.String r0 = "is_search_page_default_item"
            r7.put(r0, r1)
            r6 = 0
            r12 = 1
            r14 = 41212(0xa0fc, float:5.775E-41)
            r8 = r11
            r11 = r6
            r13 = r6
            X.0hyk r0 = X.C1224840hyk.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L63:
            X.0hyj r5 = r3.LLILLJJLI
            goto L38
        L66:
            r10 = 1
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227330i2l.LJJJJIZL(X.0i2l, X.0hyk, java.lang.String, java.util.Set, boolean, boolean, int):X.0hyk");
    }
}
