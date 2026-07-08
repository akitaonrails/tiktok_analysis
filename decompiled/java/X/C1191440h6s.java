package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS57S1300000_18;

/* JADX INFO: renamed from: X.0h6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191440h6s extends PagerAdapter implements InterfaceC1182630gsf {
    public final Context LLILLJJLI;
    public final ArrayList<String> LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final List<C1191500h6y> LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public ArrayList<PoiGalleryAnchorData> LLJI;
    public int LLJIJIL;
    public C19HL LLJILJIL;
    public final View LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final Set<Integer> LLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // X.InterfaceC1182630gsf
    public final void Yx() {
        C19GS c19gs;
        C19HL c19hl;
        C1182990gtF c1182990gtF = C1182990gtF.LIZ;
        ArrayList<PoiGalleryAnchorData> arrayList = this.LLJI;
        int i = this.LLJIJIL;
        c1182990gtF.getClass();
        if (!C1182990gtF.LJFF(i, arrayList) || (c19hl = this.LLJILJIL) == null) {
            Context context = this.LLILLJJLI;
            if (!(context instanceof C19GS) || (c19gs = (C19GS) context) == null) {
                return;
            }
            C1182990gtF.LJ(c19gs);
            return;
        }
        Context context2 = this.LLILLJJLI;
        ArrayList<PoiGalleryAnchorData> arrayList2 = this.LLJI;
        if (arrayList2 == null) {
            return;
        }
        C1182990gtF.LIZLLL(context2, arrayList2, c19hl, this.LLJIJIL);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        ArrayList<String> arrayList = this.LLILLL;
        if (arrayList != null) {
            return arrayList.size();
        }
        "Required image list must be non-null".toString();
        throw new IllegalArgumentException("Required image list must be non-null");
    }

    @Override // X.InterfaceC1182630gsf
    public final void yt(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDragByDistance: ");
        sbLIZ.append(f);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.e3y, viewGroup, false);
        C19HL c19hl = (C19HL) viewTd.findViewById(R.id.r2o);
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.r30);
        ArrayList<String> arrayList = this.LLILLL;
        if (arrayList != null) {
            String str = (String) ListProtector.get(arrayList, i);
            PageFinder pageFinderVia = PageFinder.via((View) viewGroup);
            Uri uri = UriProtector.parse(str);
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            if (interfaceC1325460kb2LIZJ != null) {
                interfaceC1325460kb2LIZJ.LJIIL(uri, new C1191450h6t(i, uri, c1749280vcc, c19hl, this));
            }
            C2211631BhB.LJ(c19hl, new AwS57S1300000_18(str, c19hl, this, pageFinderVia, 8));
            c19hl.setOnDragOuterWidgetsChangeListener(this);
            if (this.LLJ) {
                c19hl.setPreferViewPagerOnHorizontalSwipe(true);
            }
            viewGroup.addView(viewTd);
            return viewTd;
        }
        "Required image list must be non-null".toString();
        throw new IllegalArgumentException("Required image list must be non-null");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLIZLLLIL) {
            this.LLJJI.remove(Integer.valueOf(i));
        }
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        this.LLJIJIL = i;
        C19HL c19hl = null;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            c19hl = (C19HL) view.findViewById(R.id.r2o);
        }
        this.LLJILJIL = c19hl;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(X.C19HL r11, int r12, X.C1749280vcc r13, boolean r14, android.net.Uri r15) {
        /*
            r10 = this;
            r3 = 0
            r2 = 8
            r6 = r13
            r4 = r12
            r7 = r11
            r8 = r10
            if (r14 == 0) goto L2d
            X.C786410Ut5.LLLZLZ(r6, r2)
            X.C786410Ut5.LLFZ(r3, r7)
        Lf:
            int r0 = r8.LLILZ
            if (r4 != r0) goto L6b
            boolean r0 = r8.LLJILLL
            if (r0 != 0) goto L6b
            if (r14 == 0) goto L52
            X.0gtF r1 = X.C1182990gtF.LIZ
            java.util.ArrayList<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData> r0 = r8.LLJI
            r1.getClass()
            boolean r0 = X.C1182990gtF.LJFF(r4, r0)
            if (r0 == 0) goto L52
            android.content.Context r1 = r8.LLILLJJLI
            java.util.ArrayList<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData> r0 = r8.LLJI
            if (r0 != 0) goto L65
            return
        L2d:
            boolean r0 = r8.LLIZLLLIL
            if (r0 == 0) goto L4e
            java.util.Set<java.lang.Integer> r1 = r8.LLJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
            X.C786410Ut5.LLLZLZ(r6, r2)
        L40:
            kotlin.jvm.internal.AwS23S0401000_18 r3 = new kotlin.jvm.internal.AwS23S0401000_18
            r9 = 1
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = ""
            r0 = 0
            X.C1264160j0A.LIZIZ(r6, r1, r0, r3)
            goto Lf
        L4e:
            X.C786410Ut5.LLLZLZ(r6, r3)
            goto L40
        L52:
            android.content.Context r1 = r8.LLILLJJLI
            boolean r0 = r1 instanceof X.C19GS
            if (r0 == 0) goto L68
            X.19GS r1 = (X.C19GS) r1
            if (r1 == 0) goto L68
            X.0gtF r0 = X.C1182990gtF.LIZ
            r0.getClass()
            X.C1182990gtF.LIZJ(r1)
            goto L68
        L65:
            X.C1182990gtF.LIZIZ(r1, r0, r7, r4)
        L68:
            r0 = 1
            r8.LLJILLL = r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191440h6s.LJJIJIL(X.19HL, int, X.0vcc, boolean, android.net.Uri):void");
    }

    public C1191440h6s(Context context, ArrayList arrayList, int i, String str, List list, String str2, boolean z, boolean z2, int i2) {
        View viewFindViewById;
        C19GS c19gs;
        i = (i2 & 4) != 0 ? 0 : i;
        str = (i2 & 8) != 0 ? null : str;
        list = (i2 & 16) != 0 ? null : list;
        str2 = (i2 & 32) != 0 ? null : str2;
        z = (i2 & 64) != 0 ? false : z;
        z2 = (i2 & 128) != 0 ? false : z2;
        this.LLILLJJLI = context;
        this.LLILLL = arrayList;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJJI = new LinkedHashSet();
        if ((context instanceof C19GS) && (c19gs = (C19GS) context) != null) {
            viewFindViewById = c19gs.findViewById(R.id.r2i);
        } else {
            viewFindViewById = null;
        }
        this.LLJILJILJ = viewFindViewById instanceof View ? viewFindViewById : null;
    }
}
