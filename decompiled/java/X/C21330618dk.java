package X;

import Y.AsS57S0100000_32;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.elements.list.MynaLinearLayoutManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21330618dk extends AbstractC21333318eB<C1338450kvz> {
    public String LLZZJLIL;
    public Object LLZZLLIL;
    public Object LLZZZIL;
    public Object LLZZZZ;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public boolean f;
    public C1319220kQy g;
    public InterfaceC1547330qMt h;
    public InterfaceC1547330qMt i;
    public InterfaceC1547330qMt j;
    public final C01GW k;
    public AsS57S0100000_32 l;
    public AsS57S0100000_32 m;

    public final C1338460kw0 LJLLJ() {
        return (C1338460kw0) this.k.getValue();
    }

    public final boolean LJLLILLLL() {
        Set hashSet;
        String elementId = getElementId();
        if (elementId == null || elementId.length() == 0) {
            Context contextLJJIJLIJ = LJJIJLIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LJIIJJI());
            sbLIZ.append(": initial-scroll-index is configured, but key is missing.");
            C1325860kbg.LJIIIZ(contextLJJIJLIJ, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            String str = this.LL.LJIILJJIL;
            if (str == null || str.length() == 0) {
                Context contextLJJIJLIJ2 = LJJIJLIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LL.LJIIJJI());
                sbLIZ2.append(": initial-scroll-index is configured, but uniqueNodeId is missing.");
                C1325860kbg.LJIIIZ(contextLJJIJLIJ2, C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
            Object obj = this.LL.LIZ.LJII.get("_myna_initial_scroll");
            if (!C19719512Dh.LJIIIIZZ(obj) || (hashSet = (Set) obj) == null) {
                hashSet = new HashSet();
                this.LL.LIZ.LJII.put("_myna_initial_scroll", hashSet);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LL.LJIILJJIL);
            sbLIZ3.append(getElementId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            if (!hashSet.contains(strLIZIZ)) {
                hashSet.add(strLIZIZ);
                return true;
            }
        }
        return false;
    }

    public C21330618dk(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.e = 0;
        this.k = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(348));
    }

    @Override // X.AbstractC21333318eB
    public final AbstractC21333318eB<?> LJJIFFI(String str) {
        C21327818dI c21327818dI;
        AbstractC21333318eB<?> rootViewManager;
        AbstractC21333318eB<?> abstractC21333318eBLJJIFFI;
        AbstractC21333318eB<?> abstractC21333318eBLJJIFFI2 = super.LJJIFFI(str);
        if (abstractC21333318eBLJJIFFI2 != null) {
            return abstractC21333318eBLJJIFFI2;
        }
        C1338450kvz view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = view.getChildAt(i);
            if ((childAt instanceof C21327818dI) && (c21327818dI = (C21327818dI) childAt) != null && (rootViewManager = c21327818dI.getRootViewManager()) != null && (abstractC21333318eBLJJIFFI = rootViewManager.LJJIFFI(str)) != null) {
                return abstractC21333318eBLJJIFFI;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(java.util.Map<java.lang.String, ? extends java.lang.Object> r12) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21330618dk.LJJJJZI(java.util.Map):void");
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLIIL(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new MynaLinearLayoutManager(LJJIJLIJ(), 0, this.LL.LIZ.LJJIIJZLJL));
        recyclerView.setOverScrollMode(1);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLL(MynaElement mynaElement) {
        if (mynaElement == null) {
            return;
        }
        getView().setAdapter(new C21330218dg(this.LL, mynaElement.getElements(), new AwS646S0100000_32(this, 35)));
        C1337990kvF.LJIIJJI(getView(), true);
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        return new C1338450kvz(context, null, 0);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJ(Map<String, ? extends Object> map) {
        InterfaceC1547330qMt interfaceC1547330qMtLIZ = C1547350qMv.LIZ(map.get("bind_scroll"));
        InterfaceC1547330qMt interfaceC1547330qMtLIZ2 = C1547350qMv.LIZ(map.get("bind_scroll_state"));
        if (!Intrinsics.LJFF(interfaceC1547330qMtLIZ, this.h) || !Intrinsics.LJFF(interfaceC1547330qMtLIZ2, this.i)) {
            if (this.h != null || this.i != null) {
                C1338450kvz view = getView();
                AsS57S0100000_32 asS57S0100000_32 = this.l;
                if (asS57S0100000_32 == null) {
                    asS57S0100000_32 = new AsS57S0100000_32(this, 11);
                    this.l = asS57S0100000_32;
                }
                view.removeOnScrollListener(asS57S0100000_32);
            }
            if (interfaceC1547330qMtLIZ == null) {
                if (interfaceC1547330qMtLIZ2 != null) {
                }
                this.h = interfaceC1547330qMtLIZ;
                this.i = interfaceC1547330qMtLIZ2;
            } else {
                C1338460kw0 c1338460kw0LJLLJ = LJLLJ();
                c1338460kw0LJLLJ.LIZ = 0L;
                c1338460kw0LJLLJ.LIZIZ = false;
            }
            C1338450kvz view2 = getView();
            AsS57S0100000_32 asS57S0100000_322 = this.l;
            if (asS57S0100000_322 == null) {
                asS57S0100000_322 = new AsS57S0100000_32(this, 11);
                this.l = asS57S0100000_322;
            }
            view2.addOnScrollListener(asS57S0100000_322);
            this.h = interfaceC1547330qMtLIZ;
            this.i = interfaceC1547330qMtLIZ2;
        }
        this.j = C1547350qMv.LIZ(map.get("bind_item_position"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        boolean z;
        String str;
        int i;
        int i2 = 1;
        if (getView().getLayoutManager() == null) {
            z = true;
        } else {
            z = false;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -2083074934:
                    if (!key.equals("initial_scroll_offset")) {
                        continue;
                    } else if (!Intrinsics.LJFF(this.e, value)) {
                        this.e = value;
                        if (!this.f && LJLLILLLL()) {
                            this.f = true;
                        }
                    }
                    break;
                case -1379059504:
                    if (!key.equals("scroll_throttle_time")) {
                        continue;
                    } else if (!Intrinsics.LJFF(this.c, value)) {
                        this.c = value;
                        int iLJ = C1337850kv1.LJ(0, value);
                        if (iLJ > 0) {
                            LJLLJ().LIZLLL = iLJ;
                        }
                    }
                    break;
                case -1224062405:
                    if (key.equals("list_type") && (!Intrinsics.LJFF(this.LLZZJLIL, value))) {
                        if (!(value instanceof String) || (str = (String) value) == null) {
                            str = "single";
                        }
                        this.LLZZJLIL = str;
                    }
                    break;
                case -765237765:
                    if (!key.equals("initial_scroll_index")) {
                        continue;
                    } else if (!Intrinsics.LJFF(this.d, value)) {
                        this.d = value;
                        if (!this.f && LJLLILLLL()) {
                            this.f = true;
                        }
                    }
                    break;
                case -499398312:
                    if (key.equals("over_scroll_anim")) {
                        C1338450kvz view = getView();
                        if (C1337850kv1.LIZ(value)) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        view.setOverScrollMode(i);
                    } else {
                        continue;
                    }
                    break;
                case -478434891:
                    if (!key.equals("scroll_grounding_threshold")) {
                        continue;
                    } else if (!Intrinsics.LJFF(this.b, value)) {
                        this.b = value;
                        int iLJ2 = C1337850kv1.LJ(0, value);
                        if (iLJ2 > 0) {
                            LJLLJ().LIZJ = iLJ2;
                        }
                    }
                    break;
                case -52544889:
                    if (key.equals("vertical_orientation") && (!Intrinsics.LJFF(this.LLZZZIL, value))) {
                        this.LLZZZIL = value;
                    }
                    break;
                case 1509002202:
                    if (key.equals("span_count") && (!Intrinsics.LJFF(this.LLZZLLIL, value))) {
                        this.LLZZLLIL = value;
                    }
                    break;
            }
            z = true;
        }
        if (z) {
            boolean zLIZ = C1337850kv1.LIZ(this.LLZZZIL);
            String str2 = this.LLZZJLIL;
            if (Intrinsics.LJFF(str2, "grid")) {
                int iLJ3 = C1337850kv1.LJ(1, this.LLZZLLIL);
                if (iLJ3 >= 1) {
                    i2 = iLJ3;
                }
                getView().setLayoutManager(new GridLayoutManager(i2, zLIZ ? 1 : 0, LJJIJLIJ(), false));
            } else if (Intrinsics.LJFF(str2, "waterfall")) {
                int iLJ4 = C1337850kv1.LJ(1, this.LLZZLLIL);
                if (iLJ4 >= 1) {
                    i2 = iLJ4;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(i2, zLIZ ? 1 : 0);
                staggeredGridLayoutManager.LJJIL(0);
                getView().setLayoutManager(staggeredGridLayoutManager);
            } else {
                getView().setLayoutManager(new MynaLinearLayoutManager(LJJIJLIJ(), zLIZ ? 1 : 0, this.LL.LIZ.LJJIIJZLJL));
            }
            AsS57S0100000_32 asS57S0100000_32 = this.m;
            if (asS57S0100000_32 != null) {
                getView().removeOnScrollListener(asS57S0100000_32);
            }
            if (Intrinsics.LJFF(this.LLZZJLIL, "waterfall")) {
                C1338450kvz view2 = getView();
                AsS57S0100000_32 asS57S0100000_322 = this.m;
                if (asS57S0100000_322 == null) {
                    asS57S0100000_322 = new AsS57S0100000_32(this, 12);
                    this.m = asS57S0100000_322;
                }
                view2.addOnScrollListener(asS57S0100000_322);
            }
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJJI(Map<String, ? extends Object> map) {
        int i = 0;
        boolean z = false;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (Intrinsics.LJFF(key, "column_gap")) {
                if (!Intrinsics.LJFF(this.LLZZZZ, value)) {
                    this.LLZZZZ = value;
                    z = true;
                }
            } else if (Intrinsics.LJFF(key, "row_gap") && (!Intrinsics.LJFF(this.a, value))) {
                this.a = value;
                z = true;
            }
        }
        if (z) {
            int iLIZ = C1337970kvD.LIZ(Float.valueOf(C1337850kv1.LIZIZ(0.0f, this.LLZZZZ)), this.LL.LJIIJ());
            if (iLIZ < 0) {
                iLIZ = 0;
            }
            int iLIZ2 = C1337970kvD.LIZ(Float.valueOf(C1337850kv1.LIZIZ(0.0f, this.a)), this.LL.LJIIJ());
            if (iLIZ2 >= 0) {
                i = iLIZ2;
            }
            C1319220kQy c1319220kQy = this.g;
            if (c1319220kQy == null) {
                C1319220kQy c1319220kQy2 = new C1319220kQy(iLIZ, i);
                getView().addItemDecoration(c1319220kQy2);
                this.g = c1319220kQy2;
            } else {
                c1319220kQy.LL = iLIZ;
                c1319220kQy.LLILLJJLI = i;
                LJJLIIIJJIZ();
            }
        }
    }

    public final void LJLLL(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = getView().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
        }
    }
}
