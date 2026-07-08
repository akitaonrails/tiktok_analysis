package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743170vSl extends PagerAdapter {
    public final Context LLILLJJLI;
    public final C21599719g3 LLILLL;
    public final TrendingListViewModel LLILZ;
    public final List<BannerFrame> LLILZIL = new ArrayList();
    public final Stack<SmartImageView> LLILZLL = new Stack<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (((ArrayList) this.LLILZIL).size() == 0) {
            return 0;
        }
        return ((ArrayList) this.LLILZIL).size() + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(int r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            r1 = -1
            if (r5 != 0) goto L6a
            java.util.List<com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame> r0 = r4.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r5 = r0.size()
        Lb:
            int r3 = r5 + (-1)
        Ld:
            java.util.Stack<com.bytedance.lighten.loader.SmartImageView> r0 = r4.LLILZLL
            int r0 = r0.size()
            if (r0 <= 0) goto L62
            java.util.Stack<com.bytedance.lighten.loader.SmartImageView> r0 = r4.LLILZLL
            java.lang.Object r2 = r0.pop()
            com.bytedance.lighten.loader.SmartImageView r2 = (com.bytedance.lighten.loader.SmartImageView) r2
        L1d:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            X.C786410Ut5.G6(r2, r0)
            X.0kdB r1 = X.C1326790kdB.LIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame> r0 = r4.LLILZIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame r0 = (com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.darkImage
            if (r0 == 0) goto L60
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L60
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
        L3d:
            r1.getClass()
            X.0kl3 r1 = X.C1326790kdB.LIZLLL(r0)
            r1.LJJ(r2)
            X.0kve r0 = X.EnumC1338240kve.CENTER_CROP
            r1.LJJ = r0
            java.lang.String r0 = "ec_trending_banner_image"
            r1.LIZLLL(r0)
            X.C786410Ut5.h3(r1)
            Y.ACListenerS51S0201000_26 r1 = new Y.ACListenerS51S0201000_26
            r0 = 1
            r1.<init>(r4, r3, r2, r0)
            X.C786410Ut5.Q8(r2, r1)
            r6.addView(r2)
            return r2
        L60:
            r0 = 0
            goto L3d
        L62:
            com.bytedance.lighten.loader.SmartImageView r2 = new com.bytedance.lighten.loader.SmartImageView
            android.content.Context r0 = r4.LLILLJJLI
            r2.<init>(r0)
            goto L1d
        L6a:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame> r0 = r4.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 + 1
            if (r5 != r0) goto Lb
            r3 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743170vSl.LJJI(int, android.view.ViewGroup):java.lang.Object");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    public C1743170vSl(Context context, C21599719g3 c21599719g3, TrendingListViewModel trendingListViewModel) {
        this.LLILLJJLI = context;
        this.LLILLL = c21599719g3;
        this.LLILZ = trendingListViewModel;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof SmartImageView) && (view = (View) obj) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            this.LLILZLL.push((SmartImageView) view);
        }
    }
}
