package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.page.backstrace.EcSearchBackNode;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0QUH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUH implements C0QUF, InterfaceC668950QLt {
    public boolean LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public String LJI;
    public boolean LJII;
    public final List<C0QUK> LIZ = new ArrayList();
    public final Map<C0QUK, InterfaceC420801kM> LJFF = new LinkedHashMap();

    @Override // X.C0QUF
    public final void LIZ() {
        this.LJ = false;
    }

    @Override // X.C0QUF
    public final String LJII() {
        String str = this.LJI;
        return str == null ? "" : str;
    }

    @Override // X.C0QUF
    public final int size() {
        return ((ArrayList) this.LIZ).size();
    }

    @Override // X.C0QUF
    public final boolean LIZIZ() {
        return this.LJII;
    }

    @Override // X.C0QUF
    public final boolean LIZLLL() {
        return this.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    @Override // X.C0QUF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(X.C0QUK r5) {
        /*
            r4 = this;
            java.util.List<X.0QUK> r0 = r4.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r5)
            r2 = 0
            if (r0 == 0) goto La3
            java.util.List<X.0QUK> r0 = r4.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.indexOf(r5)
            java.util.List<X.0QUK> r0 = r4.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r3 = 1
            int r0 = r0 - r3
            if (r1 != r0) goto La3
            java.util.List<X.0QUK> r0 = r4.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= r3) goto L40
            java.util.List<X.0QUK> r1 = r4.LIZ
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 - r3
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            X.0QUK r0 = (X.C0QUK) r0
            r4.LJFF(r0)
            r0.g1(r2)
            return r3
        L40:
            X.0QNB r0 = r5.s0()
            if (r0 == 0) goto L67
            int[] r1 = X.C0QNC.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L9a
            r0 = 2
            if (r1 == r0) goto L77
            r0 = 3
            if (r1 != r0) goto L9d
            X.0QUM r1 = new X.C0QUJ() { // from class: X.0QUM
                static {
                    /*
                        X.0QUM r0 = new X.0QUM
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0QUM) X.0QUM.LIZIZ X.0QUM
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUM.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        X.0QNB r0 = X.C0QNB.SUGGEST
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUM.<init>():void");
                }
            }
        L58:
            X.0QUN r0 = new X.C0QUJ() { // from class: X.0QUN
                static {
                    /*
                        X.0QUN r0 = new X.0QUN
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0QUN) X.0QUN.LIZIZ X.0QUN
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUN.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUN.<init>():void");
                }
            }
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L68
            r4.LJFF(r5)
            r5.g1(r3)
            r2 = 1
        L67:
            return r2
        L68:
            if (r1 == 0) goto L67
            X.0QNB r0 = r1.LIZ
            if (r0 == 0) goto L67
            r4.LJII = r3
            boolean r0 = r5.e1(r0)
            r4.LJII = r2
            return r0
        L77:
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L90
            X.13BV r0 = X.C1209204oE.LIZ
            java.lang.String r1 = r4.LIZJ
            X.01GW r0 = X.C1209204oE.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 == 0) goto L90
            X.0QUL r1 = new X.C0QUJ() { // from class: X.0QUL
                static {
                    /*
                        X.0QUL r0 = new X.0QUL
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0QUL) X.0QUL.LIZIZ X.0QUL
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUL.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        X.0QNB r0 = X.C0QNB.SUG
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0QUL.<init>():void");
                }
            }
            goto L58
        L90:
            boolean r0 = r4.LIZLLL
            if (r0 == 0) goto L97
            X.0QUM r1 = X.C0QUM.LIZIZ
            goto L58
        L97:
            X.0QUN r1 = X.C0QUN.LIZIZ
            goto L58
        L9a:
            X.0QUN r1 = X.C0QUN.LIZIZ
            goto L58
        L9d:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QUH.LIZJ(X.0QUK):boolean");
    }

    @Override // X.C0QUF
    public final void LJFF(C0QUK c0quk) {
        if (((ArrayList) this.LIZ).contains(c0quk)) {
            ((ArrayList) this.LIZ).remove(c0quk);
            InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) this.LJFF).get(c0quk);
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LJFF.put(c0quk, null);
        }
    }

    @Override // X.C0QUF
    public final void LJI(EcSearchBackNode ecSearchBackNode) {
        ArrayList arrayList = (ArrayList) this.LIZ;
        arrayList.size();
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) this.LJFF).get(ecSearchBackNode);
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LJFF.put(ecSearchBackNode, ecSearchBackNode.LIZ(this));
        arrayList.add(ecSearchBackNode);
    }

    public final void LJIIIIZZ(InterfaceC669060QMe interfaceC669060QMe) {
        int iIndexOf;
        if ((interfaceC669060QMe instanceof C0QUK) && interfaceC669060QMe != null && (iIndexOf = ((ArrayList) this.LIZ).indexOf(interfaceC669060QMe)) >= 1) {
            for (int i = iIndexOf - 1; i < 1; i++) {
                C0QUK c0quk = (C0QUK) ListProtector.get(this.LIZ, i);
                LJFF(c0quk);
                c0quk.g1(false);
            }
        }
    }

    @Override // X.InterfaceC668950QLt
    public final void LJ(InterfaceC669060QMe interfaceC669060QMe, C0QNB c0qnb, C0QNB c0qnb2, SearchResultParam searchResultParam) {
        String str;
        if (interfaceC669060QMe == null) {
            return;
        }
        this.LJ = false;
        int[] iArr = C0QNC.LIZ;
        int i = iArr[c0qnb2.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.LIZIZ = false;
                if (c0qnb != null) {
                    int i2 = iArr[c0qnb.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            this.LJ = true;
                            if (this.LJII) {
                                if (C0QUG.LIZJ) {
                                    str = "click_return";
                                } else {
                                    str = "swipe";
                                }
                            } else {
                                str = "click_search_bar";
                            }
                            this.LJI = str;
                            return;
                        }
                        return;
                    }
                    this.LJI = "enter";
                    return;
                }
                return;
            }
            return;
        }
        String enterMethod = null;
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        }
        if (C123100dR.LIZ(enterMethod) && enterMethod != null) {
            this.LIZJ = enterMethod;
        }
        if (c0qnb == null) {
            return;
        }
        int i3 = iArr[c0qnb.ordinal()];
        if (i3 != 1) {
            if (i3 != 3) {
                return;
            }
            this.LIZIZ = true;
            this.LIZLLL = true;
            LJIIIIZZ(interfaceC669060QMe);
            return;
        }
        this.LIZIZ = false;
        this.LIZLLL = true;
        LJIIIIZZ(interfaceC669060QMe);
    }
}
