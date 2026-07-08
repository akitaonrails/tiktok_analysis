package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.03Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C803103Bt extends PagerAdapter {
    public final List<PageHeaderCarouselContent> LLILLJJLI = new ArrayList();
    public final List<C802503Bn> LLILLL = new ArrayList();
    public final HashMap<Integer, C802503Bn> LLILZ = new HashMap<>();
    public HashMap<String, Object> LLILZIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (((ArrayList) this.LLILLJJLI).isEmpty()) {
            return 0;
        }
        return ((ArrayList) this.LLILLJJLI).size() + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r0 = r6.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            return r0
        L10:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r1 = r6.LLILLJJLI
            if (r7 != 0) goto L7d
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L1b:
            int r0 = r0 + (-1)
        L1d:
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent r2 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent) r2
            if (r2 == 0) goto L8c
            java.util.List<X.03Bn> r0 = r6.LLILLL
            java.lang.Object r5 = X.C19719612Di.LJJIIZI(r0)
            X.03Bn r5 = (X.C802503Bn) r5
            if (r5 != 0) goto L38
            X.03Bn r5 = new X.03Bn
            android.content.Context r0 = r8.getContext()
            r5.<init>(r0)
        L38:
            r5.LIZ(r2)
            r8.addView(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.util.HashMap<java.lang.Integer, X.03Bn> r0 = r6.LLILZ
            r0.put(r1, r5)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselDesc r0 = r2.pageHeaderCarouselDesc
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.descText
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = ""
        L51:
            java.util.HashMap<java.lang.String, java.lang.Object> r4 = r6.LLILZIL
            if (r4 == 0) goto L77
            java.lang.String r0 = r2.daInfo
            java.util.HashMap r0 = X.C1741890vQh.LJIIJ(r0)
            if (r0 == 0) goto L60
            r4.putAll(r0)
        L60:
            X.049G r3 = new X.049G
            r3.<init>()
            kotlin.jvm.internal.AwS86S1000000_1 r2 = new kotlin.jvm.internal.AwS86S1000000_1
            r0 = 15
            r2.<init>(r1, r0)
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 369(0x171, float:5.17E-43)
            r1.<init>(r4, r0)
            X.C1748720vbi.LJFF(r5, r3, r2, r1)
            return r5
        L77:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            goto L60
        L7d:
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 + 1
            if (r7 != r0) goto L8a
            r0 = 0
            goto L1d
        L8a:
            r0 = r7
            goto L1b
        L8c:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803103Bt.LJJI(int, android.view.ViewGroup):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(java.util.HashMap r6, java.util.List r7) {
        /*
            r5 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r0 = r5.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r0 = r5.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r0 = r5.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r7)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r0 = r5.LLILLJJLI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            java.util.HashMap<java.lang.Integer, X.03Bn> r0 = r5.LLILZ
            r0.clear()
            return
        L27:
            java.util.HashMap<java.lang.Integer, X.03Bn> r0 = r5.LLILZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L31:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r2 = r1.getValue()
            X.03Bn r2 = (X.C802503Bn) r2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent> r1 = r5.LLILLJJLI
            if (r3 != 0) goto L66
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
        L58:
            int r0 = r3 + (-1)
        L5a:
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PageHeaderCarouselContent) r0
            if (r0 == 0) goto L31
            r2.LIZ(r0)
            goto L31
        L66:
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 + 1
            if (r3 != r0) goto L58
            r0 = 0
            goto L5a
        L73:
            r5.LLILZIL = r6
            r5.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803103Bt.LJJIJIL(java.util.HashMap, java.util.List):void");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof C802503Bn) && (view = (View) obj) != null) {
            view.setLeft(0);
            view.setTop(0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationX(0.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationY(0.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setAlpha(1.0f);
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            this.LLILZ.remove(Integer.valueOf(i));
            ((ArrayList) this.LLILLL).add(view);
        }
    }
}
