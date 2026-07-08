package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18e3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21332518e3<VTYPE extends ViewGroup> extends AbstractC21333318eB<VTYPE> {
    public List<MynaElement> LLZZJLIL;
    public final List<AbstractC21333318eB<?>> LLZZLLIL;
    public int LLZZZIL;
    public int LLZZZZ;
    public int a;
    public boolean b;
    public int c;
    public final boolean d;
    public final C01GW e;
    public int f;
    public int g;

    public int LL() {
        return 0;
    }

    public int LLD() {
        return 0;
    }

    public void LLFZ(AbstractC21333318eB<?> abstractC21333318eB) {
    }

    public void LLII(AbstractC21333318eB<?> abstractC21333318eB) {
    }

    public void LLIIII(AbstractC21333318eB<?> abstractC21333318eB) {
    }

    @Override // X.AbstractC21333318eB
    public final boolean LJIILL() {
        return this.LLLZ && this.LL.LIZ.LJJJJLI;
    }

    public final AbstractC21333318eB<?> LJLZ() {
        int size = ((ArrayList) this.LLZZLLIL).size();
        for (int i = 0; i < size; i++) {
            AbstractC21333318eB<?> abstractC21333318eB = (AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i);
            if (!abstractC21333318eB.LJIILL()) {
                return abstractC21333318eB;
            }
            if (abstractC21333318eB instanceof AbstractC21332518e3) {
                AbstractC21332518e3 abstractC21332518e3 = (AbstractC21332518e3) abstractC21333318eB;
                if (abstractC21332518e3.LLZZZIL > 0) {
                    return abstractC21332518e3.LJLZ();
                }
            }
        }
        return null;
    }

    public final int LJZL() {
        return ((ArrayList) this.LLZZLLIL).size();
    }

    public final boolean LLF() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final void LLIIIJ() {
        AbstractC21332518e3<?> abstractC21332518e3;
        if (this.b) {
            return;
        }
        this.b = true;
        if (!LJIILL() || (abstractC21332518e3 = this.LLILZ) == null) {
            return;
        }
        abstractC21332518e3.LLIIIJ();
    }

    public ViewGroup LLIFFJFJJ() {
        return getView();
    }

    public AbstractC21332518e3(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.LLZZLLIL = new ArrayList();
        this.d = true;
        this.e = C452501pT.LIZ(EnumC452301pR.NONE, new AwS576S0100000_32(this, 765));
    }

    @Override // X.AbstractC21333318eB
    public final void LJIIJJI(AbstractC21332518e3<?> abstractC21332518e3) {
        if (LJIILL()) {
            if (this.b) {
                int iLJZL = LJZL();
                for (int i = 0; i < iLJZL; i++) {
                    ((AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i)).LJIIJJI(abstractC21332518e3);
                }
            }
        } else {
            abstractC21332518e3.LJLLILLLL(this, -1);
        }
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21332518e3.LJIJI(android.view.MotionEvent):void");
    }

    @Override // X.AbstractC21333318eB
    public final AbstractC21333318eB<?> LJJIFFI(String str) {
        AbstractC21333318eB<?> abstractC21333318eBLJJIFFI = super.LJJIFFI(str);
        if (abstractC21333318eBLJJIFFI != null) {
            return abstractC21333318eBLJJIFFI;
        }
        int size = this.LLZZLLIL.size();
        for (int i = 0; i < size; i++) {
            AbstractC21333318eB<?> abstractC21333318eBLJJIFFI2 = ((AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i)).LJJIFFI(str);
            if (abstractC21333318eBLJJIFFI2 != null) {
                return abstractC21333318eBLJJIFFI2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0197 A[PHI: r6
      0x0197: PHI (r6v2 java.util.List<com.tiktok.myna.render.render.MynaElement>) = 
      (r6v1 java.util.List<com.tiktok.myna.render.render.MynaElement>)
      (r6v4 java.util.List<com.tiktok.myna.render.render.MynaElement>)
     binds: [B:116:0x0194, B:83:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0322 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 java.util.List<com.tiktok.myna.render.render.MynaElement>) = 
      (r6v6 java.util.List<com.tiktok.myna.render.render.MynaElement>)
      (r6v9 java.util.List<com.tiktok.myna.render.render.MynaElement>)
     binds: [B:51:0x0096, B:24:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    @Override // X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJZI(java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21332518e3.LJJJJZI(java.util.Map):void");
    }

    @Override // X.AbstractC21333318eB
    public void LJJJLL(MynaElement mynaElement) {
        List<MynaElement> elements;
        if (mynaElement != null && (elements = mynaElement.getElements()) != null && !elements.isEmpty()) {
            C21325918cz c21325918cz = this.LL;
            if (c21325918cz.LJFF || !c21325918cz.LIZ.LJIJJLI) {
                if (c21325918cz.LIZ.LJJJJL) {
                    this.LLZZZIL = 0;
                    LLFFF(elements, true);
                    if (!LJIILL() && this.b) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int size = ((ArrayList) this.LLZZLLIL).size();
                        for (int i = 0; i < size; i++) {
                            ((AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i)).LJIIJJI(this);
                        }
                        this.b = false;
                        this.LL.LJIIJ.LIZJ.LJIIZILJ += System.currentTimeMillis() - jCurrentTimeMillis;
                        return;
                    }
                    return;
                }
                LLI(elements, false);
            }
        }
    }

    public final void LJZ(List<AbstractC21333318eB<?>> list) {
        for (AbstractC21333318eB abstractC21333318eB : (ArrayList) this.LLZZLLIL) {
            if (!abstractC21333318eB.LJIILL()) {
                ((ArrayList) list).add(abstractC21333318eB);
            } else if (abstractC21333318eB instanceof AbstractC21332518e3) {
                ((AbstractC21332518e3) abstractC21333318eB).LJZ(list);
            }
        }
    }

    public final AbstractC21333318eB<?> LJZI(int i) {
        if (i >= 0 && i < LJZL()) {
            return (AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i);
        }
        C1325860kbg.LIZIZ(null, new AwS169S0101000_32(i, (int) this, 13), C2097608Jq.LJ());
        return null;
    }

    public final boolean LLFII(MynaElement mynaElement) {
        boolean z;
        if (mynaElement.canFlatten && this.LL.LIZ.LJJJJL) {
            z = true;
        } else {
            z = false;
        }
        Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
        String type = mynaElement.getType();
        if (type != null && (Intrinsics.LJFF(type, "view") || Intrinsics.LJFF(type, "x-countdown"))) {
            if (mynaElement.canFlatten && this.LL.LIZ.LJJJJLI) {
                return true;
            }
            return false;
        }
        return z;
    }

    public final void LLIIIILZ(ViewGroup viewGroup) {
        int childCount = this.LLILZLL.getChildCount();
        if (childCount > 0) {
            for (int i = childCount - 1; -1 < i; i--) {
                this.LLILZLL.removeChildAt(i);
            }
        }
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        for (AbstractC21333318eB<?> abstractC21333318eB : this.LLZZLLIL) {
            if (LLF()) {
                LLIIII(abstractC21333318eB);
            }
            abstractC21333318eB.LLILZ = null;
            abstractC21333318eB.LJIIZILJ();
            abstractC21333318eB.LJJLJ(null);
        }
        ((ArrayList) this.LLZZLLIL).clear();
        this.c = 0;
        this.LLZZZZ = 0;
        this.a = 0;
        this.LLZZZIL = 0;
    }

    public final void LJLLILLLL(AbstractC21333318eB<?> abstractC21333318eB, int i) {
        if (i < 0) {
            i = this.a;
        }
        this.a++;
        ViewGroup viewGroupLLIFFJFJJ = LLIFFJFJJ();
        View view = abstractC21333318eB.getView();
        if (!C21140017o6.LIZ.booleanValue()) {
            viewGroupLLIFFJFJJ.addView(view, i);
            return;
        }
        System.nanoTime();
        viewGroupLLIFFJFJJ.addView(view, i);
        System.nanoTime();
        this.LL.LJIIJ.LIZJ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJLLL(AbstractC21333318eB<?> abstractC21333318eB, int i) {
        AbstractC21332518e3 abstractC21332518e3;
        ListProtector.add(this.LLZZLLIL, i, abstractC21333318eB);
        if (this.d) {
            this.LLILZLL.setMeasureFunction(null);
            this.LLILZLL.addChildAt(abstractC21333318eB.LLILZLL, i);
        }
        abstractC21333318eB.LLILZ = this;
        if (abstractC21333318eB.LJIILL()) {
            this.c++;
            if (LJIILL()) {
                abstractC21332518e3 = this.LLLZI;
            } else {
                abstractC21332518e3 = this;
            }
            abstractC21333318eB.LJJLJ(abstractC21332518e3);
        } else {
            this.LLZZZZ++;
        }
        if (LLF()) {
            LLFZ(abstractC21333318eB);
        }
        LJJLIIIJJIZ();
        LJJJJJL();
    }

    public final void LJLLLL(final List<MynaElement> list, boolean z) {
        ViewGroup viewGroupLLIFFJFJJ;
        List<MynaElement> list2;
        boolean z2 = true;
        if (LJZL() == 0) {
            LLFFF(list, false);
        } else if (z || (list2 = this.LLZZJLIL) == null || !list.equals(list2)) {
            try {
                List list3 = this.LLZZJLIL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                C21339318f9.LIZ(C21342318fd.LIZ(new C21332818e6(list3, list), false), new InterfaceC1891370zJn() { // from class: X.18e4
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // X.InterfaceC1891370zJn
                    public final void LJZL(int i, int i2) {
                        int i3 = i2 + i;
                        while (i < i3) {
                            MynaElement mynaElement = (MynaElement) ListProtector.get(list, i);
                            boolean zLLFII = this.LLFII(mynaElement);
                            if (!zLLFII) {
                                this.LLIIIJ();
                            }
                            AbstractC21333318eB<?> abstractC21333318eBLIZIZ = this.LL.LIZIZ(mynaElement.getType(), true, zLLFII);
                            this.LJLLL(abstractC21333318eBLIZIZ, i);
                            abstractC21333318eBLIZIZ.LJJJJJ(mynaElement);
                            i++;
                        }
                    }

                    @Override // X.InterfaceC1891370zJn
                    public final void LLI(int i, int i2) {
                        throw new UnsupportedOperationException("Does not support move");
                    }

                    @Override // X.InterfaceC1891370zJn
                    public final void LLIZLLLIL(int i, int i2) {
                        AbstractC21332518e3 abstractC21332518e3;
                        int i3 = (i2 + i) - 1;
                        if (i > i3) {
                            return;
                        }
                        while (true) {
                            AbstractC21332518e3 abstractC21332518e32 = this;
                            AbstractC21333318eB<?> abstractC21333318eB = (AbstractC21333318eB) ListProtector.get(abstractC21332518e32.LLZZLLIL, i3);
                            if (abstractC21332518e32.LLF()) {
                                abstractC21332518e32.LLIIII(abstractC21333318eB);
                            }
                            if (abstractC21332518e32.LJIILL()) {
                                abstractC21332518e3 = abstractC21332518e32.LLLZI;
                            } else {
                                abstractC21332518e3 = abstractC21332518e32;
                            }
                            if (abstractC21332518e3 != null) {
                                ViewGroup viewGroupLLIFFJFJJ2 = abstractC21332518e3.LLIFFJFJJ();
                                if (!abstractC21333318eB.LJIILL()) {
                                    abstractC21332518e32.LLZZZZ--;
                                    abstractC21332518e3.a--;
                                    C786410Ut5.LJJJLZIJ(abstractC21333318eB.getView(), viewGroupLLIFFJFJJ2);
                                } else if (abstractC21333318eB instanceof AbstractC21332518e3) {
                                    AbstractC21332518e3 abstractC21332518e33 = (AbstractC21332518e3) abstractC21333318eB;
                                    if (abstractC21332518e33.LLZZZIL > 0) {
                                        AbstractC21333318eB<?> abstractC21333318eBLJLZ = abstractC21332518e33.LJLZ();
                                        if (abstractC21333318eBLJLZ != null) {
                                            int i4 = abstractC21332518e33.LLZZZIL;
                                            int iIndexOfChild = viewGroupLLIFFJFJJ2.indexOfChild(abstractC21333318eBLJLZ.getView());
                                            if (iIndexOfChild >= 0) {
                                                int i5 = (i4 + iIndexOfChild) - 1;
                                                if (iIndexOfChild <= i5) {
                                                    while (true) {
                                                        abstractC21332518e3.a--;
                                                        C786410Ut5.LJJLIL(i5, viewGroupLLIFFJFJJ2);
                                                        if (i5 == iIndexOfChild) {
                                                            break;
                                                        } else {
                                                            i5--;
                                                        }
                                                    }
                                                }
                                            } else {
                                                C1325860kbg.LIZIZ(null, new AwS576S0100000_32(abstractC21332518e32, 768), C2097608Jq.LJ());
                                            }
                                        } else {
                                            C1325860kbg.LIZIZ(null, new AwS576S0100000_32(abstractC21332518e32, 769), C2097608Jq.LJ());
                                        }
                                    }
                                }
                            } else {
                                C1325860kbg.LIZIZ(null, new AwS576S0100000_32(abstractC21332518e32, 770), C2097608Jq.LJ());
                            }
                            abstractC21333318eB.LLILZ = null;
                            abstractC21333318eB.LJIIZILJ();
                            abstractC21333318eB.LJJLJ(null);
                            if (abstractC21333318eB.LJIILL()) {
                                abstractC21332518e32.c--;
                            }
                            ListProtector.remove(abstractC21332518e32.LLZZLLIL, i3);
                            if (abstractC21332518e32.d) {
                                abstractC21332518e32.LLILZLL.removeChildAt(i3);
                            }
                            abstractC21332518e32.LJJLIIIJJIZ();
                            abstractC21332518e32.LJJJJJL();
                            if (i3 != i) {
                                i3--;
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // X.InterfaceC1891370zJn
                    public final void LLJJJJJIL(int i, int i2, Object obj) {
                        int i3 = i2 + i;
                        while (i < i3) {
                            ((AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i)).LJJJJJ((MynaElement) ListProtector.get(list, i));
                            i++;
                        }
                    }
                }, true);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.LL.LJIIJ.LIZJ.LJIIJ += jCurrentTimeMillis2 - jCurrentTimeMillis;
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                C1325860kbg.LIZIZ(e, AFwS223S0000000_32.get$arr$(247), C2097608Jq.LJ());
                if (LJIILL()) {
                    viewGroupLLIFFJFJJ = null;
                } else {
                    viewGroupLLIFFJFJJ = LLIFFJFJJ();
                }
                LLIIIILZ(viewGroupLLIFFJFJJ);
                LLFFF(list, false);
            }
        }
        if (((ArrayList) this.LLZZLLIL).size() != list.size()) {
            z2 = false;
        }
        C1325860kbg.LIZLLL(z2, null, null, C2097608Jq.LJ());
        this.LLZZJLIL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List LJLLLLLL(List list, Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map mapLIZJ;
        if (!list.isEmpty() && map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            C21329718db c21329718db = new C21329718db();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                MynaElement mynaElement = (MynaElement) ListProtector.get(list, i);
                c21329718db.LIZ(mynaElement);
                C21329618da c21329618da = mynaElement.bindInfo;
                if (c21329618da == 0 || (((str = c21329618da.LJIIIZ) == null || str.length() == 0) && (((str2 = c21329618da.LJIIJ) == null || str2.length() == 0) && (((str3 = c21329618da.LJIIJJI) == null || str3.length() == 0) && (((str4 = c21329618da.LJII) == null || str4.length() == 0) && ((str5 = c21329618da.LJIIIIZZ) == null || str5.length() == 0)))))) {
                    arrayList.add(mynaElement);
                } else {
                    MynaBindForConfig mynaBindForConfig = c21329618da.LJ;
                    if (mynaBindForConfig != null) {
                        C21330518dj c21330518dj = mynaElement.forConfigValue;
                        mapLIZJ = C21330418di.LIZJ(map, mynaBindForConfig, c21330518dj);
                        if (c21330518dj != null) {
                            c21330518dj.LIZJ = mapLIZJ;
                        }
                    } else {
                        mapLIZJ = map;
                    }
                    if (c21329618da.LIZ(this.LL, mapLIZJ, c21329718db)) {
                        arrayList.add(mynaElement);
                    }
                }
            }
            return arrayList;
        }
        return list;
    }

    public final void LLFF(ViewGroup viewGroup, List<MynaElement> list) {
        String type;
        Integer numValueOf;
        Boolean boolValueOf;
        String type2;
        MynaElement mynaElement;
        List<MynaElement> elements;
        MynaElement mynaElement2;
        List<MynaElement> elements2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer numValueOf2 = null;
        if (((ArrayList) this.LLZZLLIL).isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    LJLLJ(viewGroup, this.LL.LIZIZ(((MynaElement) ListProtector.get(list, i)).getType(), true, false), -1);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OutOfBounds:");
                    sbLIZ.append(th);
                    sbLIZ.append(':');
                    sbLIZ.append(this.LL.LJIIJJI());
                    sbLIZ.append(',');
                    MynaElement mynaElement3 = this.LLILZIL;
                    if (mynaElement3 != null) {
                        type = mynaElement3.getType();
                    } else {
                        type = null;
                    }
                    sbLIZ.append(type);
                    sbLIZ.append(',');
                    MynaElement mynaElement4 = this.LLILZIL;
                    if (mynaElement4 != null && (elements2 = mynaElement4.getElements()) != null) {
                        numValueOf = Integer.valueOf(elements2.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(",bindCount:");
                    sbLIZ.append(this.LL.LJIJ);
                    sbLIZ.append(",failCount:");
                    sbLIZ.append(this.LL.LJIJI);
                    sbLIZ.append(",hitViewCache:");
                    sbLIZ.append(this.LL.LJI);
                    sbLIZ.append(",childCount:");
                    sbLIZ.append(list.size());
                    sbLIZ.append(",childHasFor:");
                    MynaElement mynaElement5 = this.LLILZIL;
                    if (mynaElement5 != null) {
                        boolValueOf = Boolean.valueOf(mynaElement5.childrenHasFor);
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ.append(boolValueOf);
                    sbLIZ.append(",parent:");
                    AbstractC21332518e3<?> abstractC21332518e3 = this.LLILZ;
                    if (abstractC21332518e3 != null && (mynaElement2 = abstractC21332518e3.LLILZIL) != null) {
                        type2 = mynaElement2.getType();
                    } else {
                        type2 = null;
                    }
                    sbLIZ.append(type2);
                    sbLIZ.append(',');
                    AbstractC21332518e3<?> abstractC21332518e32 = this.LLILZ;
                    if (abstractC21332518e32 != null && (mynaElement = abstractC21332518e32.LLILZIL) != null && (elements = mynaElement.getElements()) != null) {
                        numValueOf2 = Integer.valueOf(elements.size());
                    }
                    sbLIZ.append(numValueOf2);
                    C1325860kbg.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
                    throw th;
                }
            }
        }
        if (viewGroup.getChildCount() != LJZL() || LJZL() != list.size()) {
            C1325860kbg.LIZIZ(null, new AwS276S0300000_32(viewGroup, this, list, 17), C2097608Jq.LJ());
        }
        int size2 = ((ArrayList) this.LLZZLLIL).size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i2)).LJJJJJ((MynaElement) ListProtector.get(list, i2));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.LL.LJIIJ.LIZJ.LJIIJJI += jCurrentTimeMillis2 - jCurrentTimeMillis;
    }

    public final void LLFFF(List<MynaElement> list, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1325860kbg.LIZLLL(((ArrayList) this.LLZZLLIL).isEmpty(), null, null, C2097608Jq.LJ());
        if (((ArrayList) this.LLZZLLIL).isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                MynaElement mynaElement = (MynaElement) ListProtector.get(list, i);
                boolean zLLFII = LLFII(mynaElement);
                if (!zLLFII) {
                    LLIIIJ();
                }
                AbstractC21333318eB<?> abstractC21333318eBLIZIZ = this.LL.LIZIZ(mynaElement.getType(), true, zLLFII);
                LJLLL(abstractC21333318eBLIZIZ, i);
                abstractC21333318eBLIZIZ.LJJJJJ(mynaElement);
                if (z) {
                    if (!abstractC21333318eBLIZIZ.LJIILL()) {
                        this.LLZZZIL++;
                    } else if (abstractC21333318eBLIZIZ instanceof AbstractC21332518e3) {
                        this.LLZZZIL += ((AbstractC21332518e3) abstractC21333318eBLIZIZ).LLZZZIL;
                    }
                }
            }
        }
        this.LLZZJLIL = list;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.LL.LJIIJ.LIZJ.LJIIJJI += jCurrentTimeMillis2 - jCurrentTimeMillis;
    }

    public final void LLI(final List<MynaElement> list, boolean z) {
        List<MynaElement> list2;
        final ViewGroup viewGroupLLIFFJFJJ = LLIFFJFJJ();
        if (((ArrayList) this.LLZZLLIL).size() != viewGroupLLIFFJFJJ.getChildCount() && this.LL.LIZ.LJJIJL) {
            C1325860kbg.LIZIZ(null, new AwS433S0200000_32((AbstractC21332518e3) this, viewGroupLLIFFJFJJ, (ViewGroup) 75), C2097608Jq.LJ());
            LLIIIILZ(viewGroupLLIFFJFJJ);
        }
        if (((ArrayList) this.LLZZLLIL).isEmpty() || (!z && (list2 = this.LLZZJLIL) != null && list.equals(list2))) {
            LLFF(viewGroupLLIFFJFJJ, list);
        } else {
            try {
                try {
                    List list3 = this.LLZZJLIL;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (list3 == null) {
                        list3 = C13BV.INSTANCE;
                    }
                    C21339318f9.LIZ(C21342318fd.LIZ(new C21332818e6(list3, list), false), new InterfaceC1891370zJn() { // from class: X.18e5
                        @Override // X.InterfaceC1891370zJn
                        public final void LLJJJJJIL(int i, int i2, Object obj) {
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // X.InterfaceC1891370zJn
                        public final void LJZL(int i, int i2) {
                            AbstractC21333318eB<?> abstractC21333318eBLIZIZ;
                            C21339818fE c21339818fE;
                            int i3 = i2 + i;
                            while (i < i3) {
                                MynaElement mynaElement = (MynaElement) ListProtector.get(list, i);
                                C21325918cz c21325918cz = this.LL;
                                C21326718d7 c21326718d7 = c21325918cz.LIZ;
                                if (c21326718d7.LJJJJI) {
                                    C21338218ey c21338218eyLJI = c21326718d7.LJI();
                                    if (c21338218eyLJI == null || (c21339818fE = (C21339818fE) c21338218eyLJI.LIZ.getValue()) == null || (abstractC21333318eBLIZIZ = (AbstractC21333318eB) c21339818fE.LIZ(mynaElement.itemOriginKey, Long.valueOf(mynaElement.itemKey))) == null) {
                                        abstractC21333318eBLIZIZ = this.LL.LIZIZ(mynaElement.getType(), true, false);
                                    }
                                } else {
                                    abstractC21333318eBLIZIZ = c21325918cz.LIZIZ(mynaElement.getType(), true, false);
                                }
                                this.LJLLJ(viewGroupLLIFFJFJJ, abstractC21333318eBLIZIZ, i);
                                i++;
                            }
                        }

                        @Override // X.InterfaceC1891370zJn
                        public final void LLI(int i, int i2) {
                            throw new UnsupportedOperationException("Does not support move");
                        }

                        @Override // X.InterfaceC1891370zJn
                        public final void LLIZLLLIL(int i, int i2) {
                            boolean z2;
                            MynaElement mynaElement;
                            C21338218ey c21338218eyLJI;
                            C21337418eq c21337418eq;
                            int i3 = (i2 + i) - 1;
                            if (i > i3) {
                                return;
                            }
                            while (true) {
                                AbstractC21332518e3<VTYPE> abstractC21332518e3 = this;
                                ViewGroup viewGroup = viewGroupLLIFFJFJJ;
                                AbstractC21333318eB abstractC21333318eB = (AbstractC21333318eB) ListProtector.get(abstractC21332518e3.LLZZLLIL, i3);
                                View view = abstractC21333318eB.getView();
                                View childAt = viewGroup.getChildAt(i3);
                                if (childAt != null && view.equals(childAt)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C1325860kbg.LIZLLL(z2, null, AFwS223S0000000_32.get$arr$(248), C21323718cd.LIZ(abstractC21332518e3));
                                C786410Ut5.LJJLIL(i3, viewGroup);
                                ((AbstractC21333318eB) ListProtector.get(abstractC21332518e3.LLZZLLIL, i3)).LLILZ = null;
                                AbstractC21333318eB<?> abstractC21333318eB2 = (AbstractC21333318eB) ListProtector.remove(abstractC21332518e3.LLZZLLIL, i3);
                                if (abstractC21332518e3.LL.LIZ.LJJJJI && (mynaElement = abstractC21333318eB.LLILZIL) != null && ((Intrinsics.LJFF(mynaElement.getType(), "image") || !abstractC21332518e3.LL.LIZ.LJJJJJ) && (c21338218eyLJI = abstractC21332518e3.LL.LIZ.LJI()) != null && (c21337418eq = (C21337418eq) c21338218eyLJI.LIZ.getValue()) != null)) {
                                    c21337418eq.LIZJ(mynaElement.itemOriginKey, Long.valueOf(mynaElement.itemKey), abstractC21333318eB2);
                                }
                                if (abstractC21332518e3.d) {
                                    abstractC21332518e3.LLILZLL.removeChildAt(i3);
                                }
                                abstractC21333318eB.LJIIZILJ();
                                if (i3 != i) {
                                    i3--;
                                } else {
                                    return;
                                }
                            }
                        }
                    }, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    this.LL.LJIIJ.LIZJ.LJIIJ += jCurrentTimeMillis2 - jCurrentTimeMillis;
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1325860kbg.LIZIZ(e, new AwS433S0200000_32((AbstractC21332518e3) this, e, (IndexOutOfBoundsException) 76), C2097608Jq.LJ());
                    LLIIIILZ(viewGroupLLIFFJFJJ);
                }
                LLFF(viewGroupLLIFFJFJJ, list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LLFF(viewGroupLLIFFJFJJ, list);
                throw th;
            }
        }
        if (((ArrayList) this.LLZZLLIL).size() != list.size()) {
            C1325860kbg.LIZIZ(null, new AwS276S0300000_32(viewGroupLLIFFJFJJ, this, list, 18), C2097608Jq.LJ());
        }
        this.LLZZJLIL = list;
    }

    public final int LLIIIL(int i, AbstractC21332518e3 abstractC21332518e3) {
        int size = ((ArrayList) this.LLZZLLIL).size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC21333318eB<?> abstractC21333318eB = (AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i2);
            if (abstractC21333318eB.LJIILL()) {
                if (abstractC21333318eB instanceof AbstractC21332518e3) {
                    AbstractC21332518e3 abstractC21332518e32 = (AbstractC21332518e3) abstractC21333318eB;
                    if (abstractC21332518e32.b) {
                        i = abstractC21332518e32.LLIIIL(i, abstractC21332518e3);
                    } else {
                        i += abstractC21332518e32.LLZZZIL;
                    }
                }
            } else {
                if (i >= abstractC21332518e3.a || !Intrinsics.LJFF(abstractC21332518e3.LLIFFJFJJ().getChildAt(i), abstractC21333318eB.getView())) {
                    abstractC21332518e3.LJLLILLLL(abstractC21333318eB, i);
                }
                i++;
            }
        }
        this.b = false;
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJLLJ(ViewGroup viewGroup, AbstractC21333318eB<?> abstractC21333318eB, int i) {
        if (i < 0) {
            i = LJZL();
        }
        ListProtector.add(this.LLZZLLIL, i, abstractC21333318eB);
        if (this.d) {
            this.LLILZLL.setMeasureFunction(null);
            this.LLILZLL.addChildAt(abstractC21333318eB.LLILZLL, i);
        }
        abstractC21333318eB.LLILZ = this;
        View view = abstractC21333318eB.getView();
        if (!C21140017o6.LIZ.booleanValue()) {
            viewGroup.addView(view, i);
            return;
        }
        System.nanoTime();
        viewGroup.addView(view, i);
        System.nanoTime();
        this.LL.LJIIJ.LIZJ.getClass();
    }

    @Override // X.AbstractC21333318eB
    public final void LJIIL(int i, int i2, int i3, int i4) {
        int iRound;
        int iRound2;
        int i5;
        int i6;
        super.LJIIL(i, i2, i3, i4);
        if (!LJJJJLI() && this.d) {
            if (LJIILL()) {
                AbstractC21332518e3<?> abstractC21332518e3 = this.LLILZ;
                if (abstractC21332518e3 != null) {
                    i5 = abstractC21332518e3.f;
                } else {
                    i5 = 0;
                }
                this.f = i5 + i;
                if (abstractC21332518e3 != null) {
                    i6 = abstractC21332518e3.g;
                } else {
                    i6 = 0;
                }
                this.g = i6 + i2;
            }
            int iLL = LL();
            int iLLD = LLD();
            int size = this.LLZZLLIL.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC21333318eB abstractC21333318eB = (AbstractC21333318eB) ListProtector.get(this.LLZZLLIL, i7);
                if (!abstractC21333318eB.LJIILL()) {
                    iRound = Math.round(iLL + abstractC21333318eB.LLILZLL.getLayoutX() + this.f);
                    iRound2 = Math.round(iLLD + abstractC21333318eB.LLILZLL.getLayoutY() + this.g);
                } else {
                    iRound = Math.round(iLL + abstractC21333318eB.LLILZLL.getLayoutX());
                    iRound2 = Math.round(iLLD + abstractC21333318eB.LLILZLL.getLayoutY());
                }
                abstractC21333318eB.LJIIL(iRound, iRound2, Math.round(abstractC21333318eB.LLILZLL.getLayoutWidth()) + iRound, Math.round(abstractC21333318eB.LLILZLL.getLayoutHeight()) + iRound2);
            }
        }
    }
}
