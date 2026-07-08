package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tiktok.myna.render.render.MynaElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21331018do extends AbstractC21332518e3<C21333018e8> {
    public InterfaceC1547330qMt h;
    public Object i;
    public Object j;
    public final C01GW k;
    public C21330818dm l;

    @Override // X.AbstractC21333318eB
    public final C21339618fC LJJJZ() {
        C21339618fC c21339618fCLJ = C21333518eD.LJ(this, false);
        c21339618fCLJ.setOverflow(EnumC21334618eO.SCROLL);
        return c21339618fCLJ;
    }

    @Override // X.AbstractC21332518e3
    public final int LL() {
        return -Math.round(this.LLILZLL.getLayoutBorder(EnumC1321440kUY.LEFT));
    }

    @Override // X.AbstractC21332518e3
    public final int LLD() {
        return -Math.round(this.LLILZLL.getLayoutBorder(EnumC1321440kUY.TOP));
    }

    public final C1338460kw0 LLIIIZ() {
        return (C1338460kw0) this.k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21332518e3
    public final ViewGroup LLIFFJFJJ() {
        return ((C21333018e8) getView()).getContentView();
    }

    public C21331018do(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.k = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(19));
    }

    @Override // X.AbstractC21332518e3, X.AbstractC21333318eB
    public final void LJJJJZI(Map<String, ? extends Object> map) {
        AbstractC21332518e3<?> abstractC21332518e3;
        MynaElement mynaElement;
        C21329618da c21329618da;
        Map<String, String> map2;
        super.LJJJJZI(map);
        if (C1325860kbg.LJII() && (abstractC21332518e3 = this.LLILZ) != null && (mynaElement = abstractC21332518e3.LLILZIL) != null) {
            Map<String, Object> style = mynaElement.getStyle();
            if ((style != null && style.containsKey("overflow")) || ((c21329618da = mynaElement.bindInfo) != null && (map2 = c21329618da.LIZJ) != null && map2.containsKey("overflow"))) {
                C1325860kbg.LJFF(null, "The parent node of Scroll cannot have overflow: visible");
                C1325860kbg.LJIIIZ(LJJIJLIJ(), "The parent node of Scroll cannot have overflow: visible");
            }
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLIIL(View view) {
        C21333018e8 c21333018e8 = (C21333018e8) view;
        c21333018e8.setYogaNode$myna_render_release(this.LLILZLL);
        c21333018e8.setFixScrollClick$myna_render_release(this.LL.LIZ.LJJIIJ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    @Override // X.AbstractC21332518e3, X.AbstractC21333318eB
    public final void LJJJLL(MynaElement mynaElement) {
        super.LJJJLL(mynaElement);
        C1337990kvF.LJIIJJI(getView(), true);
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        return new C21333018e8(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.18dm] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJ(Map<String, ? extends Object> map) {
        C21330818dm c21330818dm;
        ArrayList<InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>> arrayList;
        InterfaceC1547330qMt interfaceC1547330qMtLIZ = C1547350qMv.LIZ(map.get("bind_scroll"));
        if (!Intrinsics.LJFF(interfaceC1547330qMtLIZ, this.h)) {
            if (this.h != null && (c21330818dm = this.l) != null && (arrayList = ((C21333018e8) getView()).LLILZ) != null) {
                arrayList.remove(c21330818dm);
            }
            if (interfaceC1547330qMtLIZ != null) {
                C1338460kw0 c1338460kw0LLIIIZ = LLIIIZ();
                c1338460kw0LLIIIZ.LIZ = 0L;
                c1338460kw0LLIIIZ.LIZIZ = false;
                C21330818dm c21330818dm2 = this.l;
                ?? r2 = c21330818dm2;
                if (c21330818dm2 == null) {
                    ?? r22 = new InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>() { // from class: X.18dm
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC1631630sYr
                        public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            num3.intValue();
                            num4.intValue();
                            C21331018do c21331018do = this.LL;
                            InterfaceC1547330qMt interfaceC1547330qMt = c21331018do.h;
                            if (interfaceC1547330qMt != null) {
                                c21331018do.LLIIIZ().LIZIZ((ViewGroup) this.LL.getView(), new C21330718dl(this.LL, interfaceC1547330qMt, iIntValue, iIntValue2));
                            }
                            return Unit.LIZ;
                        }
                    };
                    this.l = r22;
                    r2 = r22;
                }
                C21333018e8 c21333018e8 = (C21333018e8) getView();
                ArrayList<InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>> arrayList2 = c21333018e8.LLILZ;
                ?? r1 = arrayList2;
                if (arrayList2 == null) {
                    ArrayList<InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit>> arrayList3 = new ArrayList<>();
                    c21333018e8.LLILZ = arrayList3;
                    r1 = arrayList3;
                }
                if (!r1.contains(r2)) {
                    r1.add(r2);
                }
            }
        }
        this.h = interfaceC1547330qMtLIZ;
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (Intrinsics.LJFF(key, "scroll_grounding_threshold")) {
                if (!Intrinsics.LJFF(this.i, value)) {
                    this.i = value;
                    int iLJ = C1337850kv1.LJ(0, value);
                    if (iLJ > 0) {
                        LLIIIZ().LIZJ = iLJ;
                    }
                }
            } else if (Intrinsics.LJFF(key, "scroll_throttle_time") && (!Intrinsics.LJFF(this.j, value))) {
                this.j = value;
                int iLJ2 = C1337850kv1.LJ(0, value);
                if (iLJ2 > 0) {
                    LLIIIZ().LIZLLL = iLJ2;
                }
            }
        }
    }

    @Override // X.AbstractC21332518e3
    public final void LLII(AbstractC21333318eB<?> abstractC21333318eB) {
        abstractC21333318eB.LLILZLL.setFlexShrink(0.0f);
        abstractC21333318eB.LJJLIIIJJIZ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // X.AbstractC21333318eB
    public final void LJJZZIII(List<C1337880kv4> list, C1337880kv4 c1337880kv4) {
        int i = 0;
        if (c1337880kv4.LIZIZ == 1) {
            i = (int) c1337880kv4.LIZ;
        }
        getView().setPadding(i, i, i, i);
        this.LLILZLL.setBorder(EnumC1321440kUY.ALL, i);
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    @Override // X.AbstractC21333318eB
    public final long LJJJJZ(float f, EnumC1321460kUa enumC1321460kUa, float f2, EnumC1321460kUa enumC1321460kUa2) {
        return C1321430kUX.LIZ(0, 0);
    }
}
