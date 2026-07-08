package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527400KmI extends AbstractC527410KmJ {
    public final InterfaceC568490MRj LLILZ;
    public final boolean LLILZIL;
    public final CreativeInfo LLILZLL;
    public final boolean LLIZ;
    public final Map<Long, InterfaceC525540KjI> LLIZLLLIL;
    public final IdentityHashMap<TikTokMediaModel, Long> LLJ;
    public long LLJI;
    public List<TikTokMediaModel> LLJIJIL;
    public C09AY LLJILJIL;
    public C09AY LLJILJILJ;

    public final void LJJJ() {
        int i = 1;
        for (TikTokMediaModel tikTokMediaModel : this.LLJIJIL) {
            if (tikTokMediaModel.selectIndex >= 0) {
                tikTokMediaModel.selectIndex = i;
                tikTokMediaModel.mediaIndex = i - 1;
                i++;
            }
        }
    }

    public final void LJJJI() {
        int i = 0;
        for (TikTokMediaModel tikTokMediaModel : this.LLJIJIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            TikTokMediaModel tikTokMediaModel2 = tikTokMediaModel;
            InterfaceC525540KjI interfaceC525540KjI = (InterfaceC525540KjI) ((LinkedHashMap) this.LLIZLLLIL).get(this.LLJ.get(tikTokMediaModel2));
            if (interfaceC525540KjI != null) {
                interfaceC525540KjI.LJJJJLI(i, this.LLILZ);
                interfaceC525540KjI.LJLILLLLZI(tikTokMediaModel2);
            }
            i = i2;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJIJIL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        Object next;
        Iterator it2 = ((LinkedHashMap) this.LLIZLLLIL).entrySet().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return -2;
        }
        long jLongValue = ((Number) entry.getKey()).longValue();
        Iterator<TikTokMediaModel> it3 = this.LLJIJIL.iterator();
        int i = 0;
        while (true) {
            if (it3.hasNext()) {
                Long l = this.LLJ.get(it3.next());
                if (l != null && l.longValue() == jLongValue) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            return -2;
        }
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.09AY, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.09AY, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.09AY, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.09AY, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, kotlin.Unit>] */
    @Override // X.AbstractC527410KmJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.scene.group.UserVisibleHintGroupScene LJJIJL(int r9) {
        /*
            r8 = this;
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r8.LLJIJIL
            java.lang.Object r4 = X.C13LP.LJJJLZIJ(r9, r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r4 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) r4
            long r6 = r8.LJJIJLIJ(r9)
            X.01GW r0 = X.C0BRU.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L27
            X.0KjI r0 = r8.LJJIZ(r9)
            if (r0 == 0) goto L27
            com.bytedance.scene.group.UserVisibleHintGroupScene r3 = r0.LJI()
            if (r3 != 0) goto L6d
        L27:
            r5 = 1
            if (r4 == 0) goto L9a
            boolean r0 = r4.LJIILJJIL()
            if (r0 != r5) goto L9a
        L30:
            boolean r0 = r4.LJIIL()
            if (r0 != r5) goto L4c
            java.lang.String r0 = r4.LJFF()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L88
            if (r4 == 0) goto L46
            java.lang.String r1 = r4.LJFF()
        L46:
            boolean r0 = X.C570490MZb.LJ(r1)
            if (r0 == 0) goto L88
        L4c:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene
            r3.<init>()
            boolean r2 = r8.LLILZIL
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r1 = r8.LLILZLL
            boolean r0 = r8.LLIZ
            r3.LLJLLL = r2
            r3.LLJZIJLIL = r1
            r3.LLJZ = r0
            X.09AY r0 = r8.LLJILJIL
            r3.LLLIZZ = r0
            if (r4 == 0) goto L6d
            boolean r0 = r4.LJIIL()
            if (r0 != r5) goto L6d
            X.09AY r0 = r8.LLJILJILJ
            r3.LLLJ = r0
        L6d:
            boolean r0 = r3 instanceof X.InterfaceC525540KjI
            if (r0 == 0) goto L87
            r2 = r3
            X.0KjI r2 = (X.InterfaceC525540KjI) r2
            if (r2 == 0) goto L87
            X.0MRj r0 = r8.LLILZ
            r2.LJJJJLI(r9, r0)
            r2.LJLILLLLZI(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.Map<java.lang.Long, X.0KjI> r0 = r8.LLIZLLLIL
            r0.put(r1, r2)
        L87:
            return r3
        L88:
            X.0MRc r3 = new X.0MRc
            r3.<init>()
            boolean r1 = r8.LLILZIL
            boolean r0 = r8.LLIZ
            r3.LLJLLIL = r1
            r3.LLJLLL = r0
            X.09AY r0 = r8.LLJILJILJ
            r3.LLLFZ = r0
            goto L6d
        L9a:
            boolean r0 = X.C527210Klz.LIZ(r4)
            if (r0 == 0) goto La3
            if (r4 == 0) goto L4c
            goto L30
        La3:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene
            r3.<init>()
            boolean r1 = r8.LLILZIL
            boolean r0 = r8.LLIZ
            r3.LLJL = r1
            r3.LLJLIL = r0
            X.09AY r0 = r8.LLJILJIL
            r3.LLJLILLLLZIIL = r0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C527400KmI.LJJIJL(int):com.bytedance.scene.group.UserVisibleHintGroupScene");
    }

    @Override // X.AbstractC527410KmJ
    public final long LJJIJLIJ(int i) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLJIJIL);
        if (objLJJJLZIJ == null) {
            return i;
        }
        IdentityHashMap<TikTokMediaModel, Long> identityHashMap = this.LLJ;
        Long lValueOf = identityHashMap.get(objLJJJLZIJ);
        if (lValueOf == null) {
            long j = this.LLJI;
            this.LLJI = 1 + j;
            lValueOf = Long.valueOf(j);
            identityHashMap.put((TikTokMediaModel) objLJJJLZIJ, lValueOf);
        }
        return lValueOf.longValue();
    }

    public final InterfaceC525540KjI LJJIZ(int i) {
        Object obj = null;
        if (i < 0 || i >= this.LLJIJIL.size()) {
            return null;
        }
        Object obj2 = ((LinkedHashMap) this.LLIZLLLIL).get(Long.valueOf(LJJIJLIJ(i)));
        if (obj2 != null) {
            obj = obj2;
        }
        return (InterfaceC525540KjI) obj;
    }

    public final void LJJIL(int i, boolean z) {
        if (i < this.LLJIJIL.size() && i >= 0) {
            if (z) {
                this.LLIZLLLIL.remove(Long.valueOf(LJJIJLIJ(i)));
            } else {
                ((LinkedHashMap) this.LLIZLLLIL).clear();
            }
            ListProtector.remove(this.LLJIJIL, i);
            LJJJ();
            LJJJI();
            notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        InterfaceC525540KjI interfaceC525540KjI;
        this.LLILLJJLI.remove((Scene) obj);
        if ((obj instanceof InterfaceC525540KjI) && (interfaceC525540KjI = (InterfaceC525540KjI) obj) != null) {
            C19719612Di.LJJIII(((LinkedHashMap) this.LLIZLLLIL).entrySet(), new AwS587S0100000_8(interfaceC525540KjI, 708), true);
        }
    }

    public C527400KmI(C19A3 c19a3, InterfaceC568490MRj interfaceC568490MRj, boolean z, CreativeInfo creativeInfo) {
        super(c19a3);
        this.LLILZ = interfaceC568490MRj;
        this.LLILZIL = z;
        this.LLILZLL = creativeInfo;
        this.LLIZ = false;
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = new IdentityHashMap<>();
        this.LLJIJIL = new ArrayList();
    }
}
