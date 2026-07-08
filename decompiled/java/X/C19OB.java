package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19OB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OB {
    public final C19O9 LIZ;
    public final C19O9 LIZLLL;
    public C19O0 LJFF;
    public final C21530919Nz LJI;
    public final ArrayList<C19OR> LJII;
    public boolean LIZIZ = true;
    public boolean LIZJ = true;
    public final ArrayList<C19OF> LJ = new ArrayList<>();

    /* JADX WARN: Type inference failed for: r0v31, types: [X.19OC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.19OC] */
    public final void LIZJ() {
        ArrayList<C19OF> arrayList = this.LJ;
        arrayList.clear();
        this.LIZLLL.horizontalRun.LJFF();
        this.LIZLLL.verticalRun.LJFF();
        arrayList.add(this.LIZLLL.horizontalRun);
        arrayList.add(this.LIZLLL.verticalRun);
        Iterator<C19OA> it2 = this.LIZLLL.LIZ.iterator();
        HashSet hashSet = null;
        while (true) {
            final int i = 1;
            final int i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            final C19OA next = it2.next();
            if (next instanceof C19OI) {
                arrayList.add(new C19OF(next) { // from class: X.19OO
                    @Override // X.C19OF
                    public final boolean LJIIJ() {
                        return false;
                    }

                    @Override // X.C19OF
                    public final void LIZLLL() {
                        C19OA c19oa = this.LIZIZ;
                        C19OI c19oi = (C19OI) c19oa;
                        int i3 = c19oi.LIZIZ;
                        int i4 = c19oi.LIZJ;
                        if (c19oi.LJ == 1) {
                            if (i3 != -1) {
                                ((ArrayList) this.LJII.LJIIJJI).add(c19oa.mParent.horizontalRun.LJII);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJII.LJIIJ).add(this.LJII);
                                this.LJII.LJFF = i3;
                            } else if (i4 != -1) {
                                ((ArrayList) this.LJII.LJIIJJI).add(c19oa.mParent.horizontalRun.LJIIIIZZ);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                                this.LJII.LJFF = -i4;
                            } else {
                                C19OL c19ol = this.LJII;
                                c19ol.LIZIZ = true;
                                ((ArrayList) c19ol.LJIIJJI).add(c19oa.mParent.horizontalRun.LJIIIIZZ);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                            }
                            LJIIL(this.LIZIZ.horizontalRun.LJII);
                            LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                            return;
                        }
                        if (i3 != -1) {
                            ((ArrayList) this.LJII.LJIIJJI).add(c19oa.mParent.verticalRun.LJII);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJII.LJIIJ).add(this.LJII);
                            this.LJII.LJFF = i3;
                        } else if (i4 != -1) {
                            ((ArrayList) this.LJII.LJIIJJI).add(c19oa.mParent.verticalRun.LJIIIIZZ);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                            this.LJII.LJFF = -i4;
                        } else {
                            C19OL c19ol2 = this.LJII;
                            c19ol2.LIZIZ = true;
                            ((ArrayList) c19ol2.LJIIJJI).add(c19oa.mParent.verticalRun.LJIIIIZZ);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                        }
                        LJIIL(this.LIZIZ.verticalRun.LJII);
                        LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                    }

                    @Override // X.C19OF
                    public final void LJ() {
                        C19OA c19oa = this.LIZIZ;
                        if (((C19OI) c19oa).LJ == 1) {
                            c19oa.mX = this.LJII.LJI;
                        } else {
                            c19oa.mY = this.LJII.LJI;
                        }
                    }

                    @Override // X.C19OF
                    public final void LJFF() {
                        this.LJII.LIZJ();
                    }

                    {
                        super(next);
                        next.horizontalRun.LJFF();
                        next.verticalRun.LJFF();
                        this.LJFF = ((C19OI) next).LJ;
                    }

                    @Override // X.C19OF, X.InterfaceC21531119Ob
                    public final void LIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
                        C19OL c19ol = this.LJII;
                        if (!c19ol.LIZJ || c19ol.LJIIIZ) {
                            return;
                        }
                        this.LJII.LIZLLL((int) ((((C19OL) ListProtector.get(c19ol.LJIIJJI, 0)).LJI * ((C19OI) this.LIZIZ).LIZ) + 0.5f));
                    }

                    public final void LJIIL(C19OL c19ol) {
                        ((ArrayList) this.LJII.LJIIJ).add(c19ol);
                        ((ArrayList) c19ol.LJIIJJI).add(this.LJII);
                    }
                });
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new C19OF(next, i2) { // from class: X.19OC
                            public final ArrayList<C19OF> LJIIJ = new ArrayList<>();
                            public int LJIIJJI;

                            @Override // X.C19OF
                            public final void LJ() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    ((C19OF) ListProtector.get(this.LJIIJ, i3)).LJ();
                                }
                            }

                            @Override // X.C19OF
                            public final void LJFF() {
                                this.LIZJ = null;
                                Iterator<C19OF> it3 = this.LJIIJ.iterator();
                                while (it3.hasNext()) {
                                    it3.next().LJFF();
                                }
                            }

                            public final C19OA LJIIL() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, i3)).LIZIZ;
                                    if (c19oa.mVisibility != 8) {
                                        return c19oa;
                                    }
                                }
                                return null;
                            }

                            @Override // X.C19OF
                            public final void LIZLLL() {
                                Iterator<C19OF> it3 = this.LJIIJ.iterator();
                                while (it3.hasNext()) {
                                    it3.next().LIZLLL();
                                }
                                int size = this.LJIIJ.size();
                                if (size < 1) {
                                    return;
                                }
                                C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, 0)).LIZIZ;
                                C19OA c19oa2 = ((C19OF) ListProtector.get(this.LJIIJ, size - 1)).LIZIZ;
                                if (this.LJFF == 0) {
                                    C19OG c19og = c19oa.mLeft;
                                    C19OG c19og2 = c19oa2.mRight;
                                    C19OL c19olLJIIIIZZ = C19OF.LJIIIIZZ(c19og, 0);
                                    int iLJ = c19og.LJ();
                                    C19OA c19oaLJIIL = LJIIL();
                                    if (c19oaLJIIL != null) {
                                        iLJ = c19oaLJIIL.mLeft.LJ();
                                    }
                                    if (c19olLJIIIIZZ != null) {
                                        C19OF.LIZIZ(this.LJII, c19olLJIIIIZZ, iLJ);
                                    }
                                    C19OL c19olLJIIIIZZ2 = C19OF.LJIIIIZZ(c19og2, 0);
                                    int iLJ2 = c19og2.LJ();
                                    C19OA c19oaLJIILIIL = LJIILIIL();
                                    if (c19oaLJIILIIL != null) {
                                        iLJ2 = c19oaLJIILIIL.mRight.LJ();
                                    }
                                    if (c19olLJIIIIZZ2 != null) {
                                        C19OF.LIZIZ(this.LJIIIIZZ, c19olLJIIIIZZ2, -iLJ2);
                                    }
                                } else {
                                    C19OG c19og3 = c19oa.mTop;
                                    C19OG c19og4 = c19oa2.mBottom;
                                    C19OL c19olLJIIIIZZ3 = C19OF.LJIIIIZZ(c19og3, 1);
                                    int iLJ3 = c19og3.LJ();
                                    C19OA c19oaLJIIL2 = LJIIL();
                                    if (c19oaLJIIL2 != null) {
                                        iLJ3 = c19oaLJIIL2.mTop.LJ();
                                    }
                                    if (c19olLJIIIIZZ3 != null) {
                                        C19OF.LIZIZ(this.LJII, c19olLJIIIIZZ3, iLJ3);
                                    }
                                    C19OL c19olLJIIIIZZ4 = C19OF.LJIIIIZZ(c19og4, 1);
                                    int iLJ4 = c19og4.LJ();
                                    C19OA c19oaLJIILIIL2 = LJIILIIL();
                                    if (c19oaLJIILIIL2 != null) {
                                        iLJ4 = c19oaLJIILIIL2.mBottom.LJ();
                                    }
                                    if (c19olLJIIIIZZ4 != null) {
                                        C19OF.LIZIZ(this.LJIIIIZZ, c19olLJIIIIZZ4, -iLJ4);
                                    }
                                }
                                this.LJII.LIZ = this;
                                this.LJIIIIZZ.LIZ = this;
                            }

                            @Override // X.C19OF
                            public final long LJIIIZ() {
                                int size = this.LJIIJ.size();
                                long jLJIIIZ = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    C19OF c19of = (C19OF) ListProtector.get(this.LJIIJ, i3);
                                    jLJIIIZ = jLJIIIZ + ((long) c19of.LJII.LJFF) + c19of.LJIIIZ() + ((long) c19of.LJIIIIZZ.LJFF);
                                }
                                return jLJIIIZ;
                            }

                            @Override // X.C19OF
                            public final boolean LJIIJ() {
                                int size = this.LJIIJ.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (!((C19OF) ListProtector.get(this.LJIIJ, i3)).LJIIJ()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            public final C19OA LJIILIIL() {
                                for (int size = this.LJIIJ.size() - 1; size >= 0; size--) {
                                    C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, size)).LIZIZ;
                                    if (c19oa.mVisibility != 8) {
                                        return c19oa;
                                    }
                                }
                                return null;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ChainRun ");
                                sbLIZ.append(this.LJFF == 0 ? "horizontal : " : "vertical : ");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                for (C19OF c19of : this.LJIIJ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZIZ);
                                    sbLIZ2.append("<");
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLIZIZ2);
                                    sbLIZ3.append(c19of);
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(strLIZIZ3);
                                    sbLIZ4.append("> ");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                }
                                return strLIZIZ;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:100:0x0187, code lost:
                            
                                r14 = r14 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
                            
                                r1 = r11;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:102:0x018c, code lost:
                            
                                r15 = r0.mMatchConstraintMaxHeight;
                                r0 = r0.mMatchConstraintMinHeight;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:103:0x019a, code lost:
                            
                                if (r0.LIZ != 1) goto L110;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:104:0x019c, code lost:
                            
                                r1 = java.lang.Math.min(r11, r12.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:105:0x01a2, code lost:
                            
                                r0 = java.lang.Math.max(r0, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:106:0x01a8, code lost:
                            
                                if (r15 <= 0) goto L108;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:107:0x01aa, code lost:
                            
                                r0 = java.lang.Math.min(r15, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
                            
                                if (r0 == r11) goto L99;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
                            
                                r17 = r17 + 1;
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:110:0x01b4, code lost:
                            
                                r1 = r11;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:111:0x01b6, code lost:
                            
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:112:0x01b9, code lost:
                            
                                r13 = r13 - ((int) (((r4 - r20) / 2.0f) + 0.5f));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:113:0x01c2, code lost:
                            
                                if (r17 <= 0) goto L126;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:114:0x01c4, code lost:
                            
                                r3 = r3 - r17;
                                r1 = 0;
                                r4 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
                            
                                if (r1 >= r8) goto L287;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
                            
                                r11 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:117:0x01d8, code lost:
                            
                                if (r11.LIZIZ.mVisibility == 8) goto L289;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:118:0x01da, code lost:
                            
                                if (r1 <= 0) goto L121;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:119:0x01dc, code lost:
                            
                                if (r1 < r7) goto L121;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
                            
                                r4 = r4 + r11.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:121:0x01e3, code lost:
                            
                                r4 = r4 + r11.LJ.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:122:0x01e8, code lost:
                            
                                if (r1 >= r5) goto L290;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:123:0x01ea, code lost:
                            
                                if (r1 >= r6) goto L291;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:124:0x01ec, code lost:
                            
                                r4 = r4 + (-r11.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:125:0x01f2, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:126:0x01f5, code lost:
                            
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:127:0x01f8, code lost:
                            
                                if (r23.LJIIJJI != 2) goto L131;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:128:0x01fa, code lost:
                            
                                if (r17 != 0) goto L131;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:129:0x01fc, code lost:
                            
                                r23.LJIIJJI = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:130:0x0200, code lost:
                            
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:132:0x0203, code lost:
                            
                                if (r4 <= r20) goto L134;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:133:0x0205, code lost:
                            
                                r23.LJIIJJI = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:134:0x0207, code lost:
                            
                                if (r2 <= 0) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:135:0x0209, code lost:
                            
                                if (r3 != 0) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:136:0x020b, code lost:
                            
                                if (r7 != r6) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:137:0x020d, code lost:
                            
                                r23.LJIIJJI = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:138:0x020f, code lost:
                            
                                r1 = r23.LJIIJJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:139:0x0212, code lost:
                            
                                if (r1 != 1) goto L182;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:140:0x0214, code lost:
                            
                                if (r2 <= 1) goto L179;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:141:0x0216, code lost:
                            
                                r20 = (r20 - r4) / (r2 - 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:142:0x021c, code lost:
                            
                                if (r3 <= 0) goto L144;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:143:0x021e, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:144:0x0220, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:145:0x0221, code lost:
                            
                                if (r1 >= r8) goto L292;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:146:0x0223, code lost:
                            
                                if (r9 == false) goto L178;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:147:0x0225, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:148:0x0229, code lost:
                            
                                r2 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:149:0x0237, code lost:
                            
                                if (r2.LIZIZ.mVisibility != 8) goto L152;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:150:0x0239, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:151:0x0243, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:152:0x0246, code lost:
                            
                                if (r1 <= 0) goto L173;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:153:0x0248, code lost:
                            
                                if (r9 == false) goto L172;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:154:0x024a, code lost:
                            
                                r13 = r13 - r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:155:0x024c, code lost:
                            
                                if (r1 < r7) goto L173;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:156:0x024e, code lost:
                            
                                if (r9 == false) goto L175;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:157:0x0250, code lost:
                            
                                r13 = r13 - r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:158:0x0255, code lost:
                            
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:159:0x025a, code lost:
                            
                                r11 = r2.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:160:0x0262, code lost:
                            
                                if (r2.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L164;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:162:0x0267, code lost:
                            
                                if (r2.LIZ != 1) goto L164;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:163:0x0269, code lost:
                            
                                r4 = r11.LJIIL;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:164:0x026b, code lost:
                            
                                if (r9 == false) goto L171;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:165:0x026d, code lost:
                            
                                r13 = r13 - r4;
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:166:0x0273, code lost:
                            
                                r2.LJI = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:167:0x0276, code lost:
                            
                                if (r1 >= r5) goto L294;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:168:0x0278, code lost:
                            
                                if (r1 >= r6) goto L295;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:169:0x027a, code lost:
                            
                                if (r9 == false) goto L177;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:170:0x027c, code lost:
                            
                                r13 = r13 - (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:171:0x0283, code lost:
                            
                                r13 = r13 + r4;
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:172:0x028a, code lost:
                            
                                r13 = r13 + r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:173:0x028d, code lost:
                            
                                if (r9 == false) goto L176;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:175:0x0290, code lost:
                            
                                r13 = r13 + r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:176:0x0295, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:177:0x029b, code lost:
                            
                                r13 = r13 + (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:178:0x02a2, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:179:0x02a4, code lost:
                            
                                if (r2 != 1) goto L181;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:180:0x02a6, code lost:
                            
                                r20 = (r20 - r4) / 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:181:0x02ad, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:182:0x02b1, code lost:
                            
                                if (r1 != 0) goto L220;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:183:0x02b3, code lost:
                            
                                r20 = (r20 - r4) / (r2 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:184:0x02b9, code lost:
                            
                                if (r3 <= 0) goto L186;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:185:0x02bb, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:186:0x02bd, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:187:0x02be, code lost:
                            
                                if (r1 >= r8) goto L298;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:188:0x02c0, code lost:
                            
                                if (r9 == false) goto L219;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:189:0x02c2, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:190:0x02c6, code lost:
                            
                                r2 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:191:0x02d4, code lost:
                            
                                if (r2.LIZIZ.mVisibility != 8) goto L194;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:192:0x02d6, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:193:0x02e0, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:194:0x02e3, code lost:
                            
                                if (r9 == false) goto L217;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:195:0x02e5, code lost:
                            
                                r13 = r13 - r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:196:0x02e7, code lost:
                            
                                if (r1 <= 0) goto L213;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:197:0x02e9, code lost:
                            
                                if (r1 < r7) goto L213;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:198:0x02eb, code lost:
                            
                                if (r9 == false) goto L215;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:199:0x02ed, code lost:
                            
                                r13 = r13 - r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:200:0x02f2, code lost:
                            
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:201:0x02f7, code lost:
                            
                                r11 = r2.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:202:0x02ff, code lost:
                            
                                if (r2.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L206;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:204:0x0304, code lost:
                            
                                if (r2.LIZ != 1) goto L206;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:205:0x0306, code lost:
                            
                                r4 = java.lang.Math.min(r4, r11.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:206:0x030c, code lost:
                            
                                if (r9 == false) goto L212;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:207:0x030e, code lost:
                            
                                r13 = r13 - r4;
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:208:0x0314, code lost:
                            
                                if (r1 >= r5) goto L300;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:209:0x0316, code lost:
                            
                                if (r1 >= r6) goto L301;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:210:0x0318, code lost:
                            
                                if (r9 == false) goto L218;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:211:0x031a, code lost:
                            
                                r13 = r13 - (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:212:0x0321, code lost:
                            
                                r13 = r13 + r4;
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:213:0x0328, code lost:
                            
                                if (r9 == false) goto L216;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:215:0x032b, code lost:
                            
                                r13 = r13 + r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:216:0x0330, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:217:0x0336, code lost:
                            
                                r13 = r13 + r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:218:0x0339, code lost:
                            
                                r13 = r13 + (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:219:0x0340, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:221:0x0343, code lost:
                            
                                if (r1 != 2) goto L311;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:223:0x0347, code lost:
                            
                                if (r23.LJFF != 0) goto L265;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:224:0x0349, code lost:
                            
                                r2 = r23.LIZIZ.mHorizontalBiasPercent;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:225:0x034d, code lost:
                            
                                if (r9 == false) goto L227;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:226:0x034f, code lost:
                            
                                r2 = 1.0f - r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:227:0x0353, code lost:
                            
                                r0 = (int) (((r20 - r4) * r2) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:228:0x035d, code lost:
                            
                                if (r0 < 0) goto L230;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:229:0x035f, code lost:
                            
                                if (r3 <= 0) goto L231;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:230:0x0361, code lost:
                            
                                r0 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:231:0x0362, code lost:
                            
                                if (r9 == false) goto L264;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:232:0x0364, code lost:
                            
                                r13 = r13 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:233:0x0365, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:234:0x0366, code lost:
                            
                                if (r1 >= r8) goto L304;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:235:0x0368, code lost:
                            
                                if (r9 == false) goto L263;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:236:0x036a, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:237:0x036e, code lost:
                            
                                r3 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:238:0x037c, code lost:
                            
                                if (r3.LIZIZ.mVisibility != 8) goto L241;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:239:0x037e, code lost:
                            
                                r3.LJII.LIZLLL(r13);
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:240:0x0388, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:241:0x038b, code lost:
                            
                                if (r1 <= 0) goto L258;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:242:0x038d, code lost:
                            
                                if (r1 < r7) goto L258;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:243:0x038f, code lost:
                            
                                if (r9 == false) goto L260;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:244:0x0391, code lost:
                            
                                r13 = r13 - r3.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:245:0x0396, code lost:
                            
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:246:0x039b, code lost:
                            
                                r11 = r3.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:247:0x03a3, code lost:
                            
                                if (r3.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L251;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:249:0x03a8, code lost:
                            
                                if (r3.LIZ != 1) goto L251;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:250:0x03aa, code lost:
                            
                                r4 = r11.LJIIL;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:251:0x03ac, code lost:
                            
                                if (r9 == false) goto L257;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:252:0x03ae, code lost:
                            
                                r13 = r13 - r4;
                                r3.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:253:0x03b4, code lost:
                            
                                if (r1 >= r5) goto L306;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:254:0x03b6, code lost:
                            
                                if (r1 >= r6) goto L307;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:255:0x03b8, code lost:
                            
                                if (r9 == false) goto L262;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:256:0x03ba, code lost:
                            
                                r13 = r13 - (-r3.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:257:0x03c1, code lost:
                            
                                r13 = r13 + r4;
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:258:0x03c8, code lost:
                            
                                if (r9 == false) goto L261;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:260:0x03cb, code lost:
                            
                                r13 = r13 + r3.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:261:0x03d0, code lost:
                            
                                r3.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:262:0x03d6, code lost:
                            
                                r13 = r13 + (-r3.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:263:0x03dd, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:264:0x03df, code lost:
                            
                                r13 = r13 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:265:0x03e1, code lost:
                            
                                r2 = r23.LIZIZ.mVerticalBiasPercent;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:313:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
                            
                                r13 = r23.LJII.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
                            
                                if (r9 == false) goto L72;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
                            
                                r13 = r23.LJIIIIZZ.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:73:0x00fc, code lost:
                            
                                if (r4 <= r20) goto L77;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
                            
                                if (r9 == false) goto L112;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
                            
                                r13 = r13 + ((int) (((r4 - r20) / 2.0f) + 0.5f));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:77:0x0109, code lost:
                            
                                if (r3 <= 0) goto L130;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
                            
                                r0 = r20 - r4;
                                r0 = (int) ((r0 / r3) + 0.5f);
                                r14 = 0;
                                r17 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x011a, code lost:
                            
                                if (r14 >= r8) goto L282;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:80:0x011c, code lost:
                            
                                r0 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r14);
                                r0 = r0.LIZIZ;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
                            
                                if (r0.mVisibility == 8) goto L284;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
                            
                                if (r0.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L285;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
                            
                                r12 = r0.LJ;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:85:0x0140, code lost:
                            
                                if (r12.LJIIIZ != false) goto L286;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
                            
                                if (r19 <= 0.0f) goto L111;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
                            
                                r11 = (int) (((r0.mWeight[r23.LJFF] * r0) / r19) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
                            
                                if (r23.LJFF != 0) goto L102;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
                            
                                r15 = r0.mMatchConstraintMaxWidth;
                                r0 = r0.mMatchConstraintMinWidth;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0167, code lost:
                            
                                if (r0.LIZ != 1) goto L101;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:93:0x0169, code lost:
                            
                                r1 = java.lang.Math.min(r11, r12.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
                            
                                r0 = java.lang.Math.max(r0, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:95:0x0175, code lost:
                            
                                if (r15 <= 0) goto L97;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:96:0x0177, code lost:
                            
                                r0 = java.lang.Math.min(r15, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
                            
                                if (r0 == r11) goto L99;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
                            
                                r17 = r17 + 1;
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
                            
                                r0.LJ.LIZLLL(r11);
                             */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
                            @Override // X.C19OF, X.InterfaceC21531119Ob
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.InterfaceC21531119Ob r24) {
                                /*
                                    Method dump skipped, instruction units count: 1000
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C19OC.LIZ(X.19Ob):void");
                            }

                            {
                                C19OA c19oa;
                                int i3;
                                this.LJFF = i2;
                                C19OA c19oa2 = this.LIZIZ;
                                C19OA previousChainMember = c19oa2.getPreviousChainMember(i2);
                                while (true) {
                                    c19oa = c19oa2;
                                    c19oa2 = previousChainMember;
                                    if (previousChainMember == null) {
                                        break;
                                    } else {
                                        previousChainMember = previousChainMember.getPreviousChainMember(this.LJFF);
                                    }
                                }
                                this.LIZIZ = c19oa;
                                this.LJIIJ.add(c19oa.getRun(this.LJFF));
                                C19OA nextChainMember = c19oa.getNextChainMember(this.LJFF);
                                while (nextChainMember != null) {
                                    this.LJIIJ.add(nextChainMember.getRun(this.LJFF));
                                    nextChainMember = nextChainMember.getNextChainMember(this.LJFF);
                                }
                                for (C19OF c19of : this.LJIIJ) {
                                    int i4 = this.LJFF;
                                    if (i4 == 0) {
                                        c19of.LIZIZ.horizontalChainRun = this;
                                    } else if (i4 == 1) {
                                        c19of.LIZIZ.verticalChainRun = this;
                                    }
                                }
                                if (this.LJFF == 0 && ((C19O9) this.LIZIZ.mParent).LJ && this.LJIIJ.size() > 1) {
                                    ArrayList<C19OF> arrayList2 = this.LJIIJ;
                                    this.LIZIZ = ((C19OF) ListProtector.get(arrayList2, arrayList2.size() - 1)).LIZIZ;
                                }
                                if (this.LJFF == 0) {
                                    i3 = this.LIZIZ.mHorizontalChainStyle;
                                } else {
                                    i3 = this.LIZIZ.mVerticalChainStyle;
                                }
                                this.LJIIJJI = i3;
                            }
                        };
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new C19OF(next, i) { // from class: X.19OC
                            public final ArrayList<C19OF> LJIIJ = new ArrayList<>();
                            public int LJIIJJI;

                            @Override // X.C19OF
                            public final void LJ() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    ((C19OF) ListProtector.get(this.LJIIJ, i3)).LJ();
                                }
                            }

                            @Override // X.C19OF
                            public final void LJFF() {
                                this.LIZJ = null;
                                Iterator<C19OF> it3 = this.LJIIJ.iterator();
                                while (it3.hasNext()) {
                                    it3.next().LJFF();
                                }
                            }

                            public final C19OA LJIIL() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, i3)).LIZIZ;
                                    if (c19oa.mVisibility != 8) {
                                        return c19oa;
                                    }
                                }
                                return null;
                            }

                            @Override // X.C19OF
                            public final void LIZLLL() {
                                Iterator<C19OF> it3 = this.LJIIJ.iterator();
                                while (it3.hasNext()) {
                                    it3.next().LIZLLL();
                                }
                                int size = this.LJIIJ.size();
                                if (size < 1) {
                                    return;
                                }
                                C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, 0)).LIZIZ;
                                C19OA c19oa2 = ((C19OF) ListProtector.get(this.LJIIJ, size - 1)).LIZIZ;
                                if (this.LJFF == 0) {
                                    C19OG c19og = c19oa.mLeft;
                                    C19OG c19og2 = c19oa2.mRight;
                                    C19OL c19olLJIIIIZZ = C19OF.LJIIIIZZ(c19og, 0);
                                    int iLJ = c19og.LJ();
                                    C19OA c19oaLJIIL = LJIIL();
                                    if (c19oaLJIIL != null) {
                                        iLJ = c19oaLJIIL.mLeft.LJ();
                                    }
                                    if (c19olLJIIIIZZ != null) {
                                        C19OF.LIZIZ(this.LJII, c19olLJIIIIZZ, iLJ);
                                    }
                                    C19OL c19olLJIIIIZZ2 = C19OF.LJIIIIZZ(c19og2, 0);
                                    int iLJ2 = c19og2.LJ();
                                    C19OA c19oaLJIILIIL = LJIILIIL();
                                    if (c19oaLJIILIIL != null) {
                                        iLJ2 = c19oaLJIILIIL.mRight.LJ();
                                    }
                                    if (c19olLJIIIIZZ2 != null) {
                                        C19OF.LIZIZ(this.LJIIIIZZ, c19olLJIIIIZZ2, -iLJ2);
                                    }
                                } else {
                                    C19OG c19og3 = c19oa.mTop;
                                    C19OG c19og4 = c19oa2.mBottom;
                                    C19OL c19olLJIIIIZZ3 = C19OF.LJIIIIZZ(c19og3, 1);
                                    int iLJ3 = c19og3.LJ();
                                    C19OA c19oaLJIIL2 = LJIIL();
                                    if (c19oaLJIIL2 != null) {
                                        iLJ3 = c19oaLJIIL2.mTop.LJ();
                                    }
                                    if (c19olLJIIIIZZ3 != null) {
                                        C19OF.LIZIZ(this.LJII, c19olLJIIIIZZ3, iLJ3);
                                    }
                                    C19OL c19olLJIIIIZZ4 = C19OF.LJIIIIZZ(c19og4, 1);
                                    int iLJ4 = c19og4.LJ();
                                    C19OA c19oaLJIILIIL2 = LJIILIIL();
                                    if (c19oaLJIILIIL2 != null) {
                                        iLJ4 = c19oaLJIILIIL2.mBottom.LJ();
                                    }
                                    if (c19olLJIIIIZZ4 != null) {
                                        C19OF.LIZIZ(this.LJIIIIZZ, c19olLJIIIIZZ4, -iLJ4);
                                    }
                                }
                                this.LJII.LIZ = this;
                                this.LJIIIIZZ.LIZ = this;
                            }

                            @Override // X.C19OF
                            public final long LJIIIZ() {
                                int size = this.LJIIJ.size();
                                long jLJIIIZ = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    C19OF c19of = (C19OF) ListProtector.get(this.LJIIJ, i3);
                                    jLJIIIZ = jLJIIIZ + ((long) c19of.LJII.LJFF) + c19of.LJIIIZ() + ((long) c19of.LJIIIIZZ.LJFF);
                                }
                                return jLJIIIZ;
                            }

                            @Override // X.C19OF
                            public final boolean LJIIJ() {
                                int size = this.LJIIJ.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (!((C19OF) ListProtector.get(this.LJIIJ, i3)).LJIIJ()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            public final C19OA LJIILIIL() {
                                for (int size = this.LJIIJ.size() - 1; size >= 0; size--) {
                                    C19OA c19oa = ((C19OF) ListProtector.get(this.LJIIJ, size)).LIZIZ;
                                    if (c19oa.mVisibility != 8) {
                                        return c19oa;
                                    }
                                }
                                return null;
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ChainRun ");
                                sbLIZ.append(this.LJFF == 0 ? "horizontal : " : "vertical : ");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                for (C19OF c19of : this.LJIIJ) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLIZIZ);
                                    sbLIZ2.append("<");
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strLIZIZ2);
                                    sbLIZ3.append(c19of);
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(strLIZIZ3);
                                    sbLIZ4.append("> ");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                }
                                return strLIZIZ;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:100:0x0187, code lost:
                            
                                r14 = r14 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
                            
                                r1 = r11;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:102:0x018c, code lost:
                            
                                r15 = r0.mMatchConstraintMaxHeight;
                                r0 = r0.mMatchConstraintMinHeight;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:103:0x019a, code lost:
                            
                                if (r0.LIZ != 1) goto L110;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:104:0x019c, code lost:
                            
                                r1 = java.lang.Math.min(r11, r12.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:105:0x01a2, code lost:
                            
                                r0 = java.lang.Math.max(r0, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:106:0x01a8, code lost:
                            
                                if (r15 <= 0) goto L108;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:107:0x01aa, code lost:
                            
                                r0 = java.lang.Math.min(r15, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
                            
                                if (r0 == r11) goto L99;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
                            
                                r17 = r17 + 1;
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:110:0x01b4, code lost:
                            
                                r1 = r11;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:111:0x01b6, code lost:
                            
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:112:0x01b9, code lost:
                            
                                r13 = r13 - ((int) (((r4 - r20) / 2.0f) + 0.5f));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:113:0x01c2, code lost:
                            
                                if (r17 <= 0) goto L126;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:114:0x01c4, code lost:
                            
                                r3 = r3 - r17;
                                r1 = 0;
                                r4 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
                            
                                if (r1 >= r8) goto L287;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
                            
                                r11 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:117:0x01d8, code lost:
                            
                                if (r11.LIZIZ.mVisibility == 8) goto L289;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:118:0x01da, code lost:
                            
                                if (r1 <= 0) goto L121;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:119:0x01dc, code lost:
                            
                                if (r1 < r7) goto L121;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:120:0x01de, code lost:
                            
                                r4 = r4 + r11.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:121:0x01e3, code lost:
                            
                                r4 = r4 + r11.LJ.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:122:0x01e8, code lost:
                            
                                if (r1 >= r5) goto L290;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:123:0x01ea, code lost:
                            
                                if (r1 >= r6) goto L291;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:124:0x01ec, code lost:
                            
                                r4 = r4 + (-r11.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:125:0x01f2, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:126:0x01f5, code lost:
                            
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:127:0x01f8, code lost:
                            
                                if (r23.LJIIJJI != 2) goto L131;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:128:0x01fa, code lost:
                            
                                if (r17 != 0) goto L131;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:129:0x01fc, code lost:
                            
                                r23.LJIIJJI = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:130:0x0200, code lost:
                            
                                r1 = 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:132:0x0203, code lost:
                            
                                if (r4 <= r20) goto L134;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:133:0x0205, code lost:
                            
                                r23.LJIIJJI = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:134:0x0207, code lost:
                            
                                if (r2 <= 0) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:135:0x0209, code lost:
                            
                                if (r3 != 0) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:136:0x020b, code lost:
                            
                                if (r7 != r6) goto L138;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:137:0x020d, code lost:
                            
                                r23.LJIIJJI = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:138:0x020f, code lost:
                            
                                r1 = r23.LJIIJJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:139:0x0212, code lost:
                            
                                if (r1 != 1) goto L182;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:140:0x0214, code lost:
                            
                                if (r2 <= 1) goto L179;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:141:0x0216, code lost:
                            
                                r20 = (r20 - r4) / (r2 - 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:142:0x021c, code lost:
                            
                                if (r3 <= 0) goto L144;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:143:0x021e, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:144:0x0220, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:145:0x0221, code lost:
                            
                                if (r1 >= r8) goto L292;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:146:0x0223, code lost:
                            
                                if (r9 == false) goto L178;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:147:0x0225, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:148:0x0229, code lost:
                            
                                r2 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:149:0x0237, code lost:
                            
                                if (r2.LIZIZ.mVisibility != 8) goto L152;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:150:0x0239, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:151:0x0243, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:152:0x0246, code lost:
                            
                                if (r1 <= 0) goto L173;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:153:0x0248, code lost:
                            
                                if (r9 == false) goto L172;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:154:0x024a, code lost:
                            
                                r13 = r13 - r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:155:0x024c, code lost:
                            
                                if (r1 < r7) goto L173;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:156:0x024e, code lost:
                            
                                if (r9 == false) goto L175;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:157:0x0250, code lost:
                            
                                r13 = r13 - r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:158:0x0255, code lost:
                            
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:159:0x025a, code lost:
                            
                                r11 = r2.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:160:0x0262, code lost:
                            
                                if (r2.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L164;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:162:0x0267, code lost:
                            
                                if (r2.LIZ != 1) goto L164;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:163:0x0269, code lost:
                            
                                r4 = r11.LJIIL;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:164:0x026b, code lost:
                            
                                if (r9 == false) goto L171;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:165:0x026d, code lost:
                            
                                r13 = r13 - r4;
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:166:0x0273, code lost:
                            
                                r2.LJI = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:167:0x0276, code lost:
                            
                                if (r1 >= r5) goto L294;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:168:0x0278, code lost:
                            
                                if (r1 >= r6) goto L295;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:169:0x027a, code lost:
                            
                                if (r9 == false) goto L177;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:170:0x027c, code lost:
                            
                                r13 = r13 - (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:171:0x0283, code lost:
                            
                                r13 = r13 + r4;
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:172:0x028a, code lost:
                            
                                r13 = r13 + r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:173:0x028d, code lost:
                            
                                if (r9 == false) goto L176;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:175:0x0290, code lost:
                            
                                r13 = r13 + r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:176:0x0295, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:177:0x029b, code lost:
                            
                                r13 = r13 + (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:178:0x02a2, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:179:0x02a4, code lost:
                            
                                if (r2 != 1) goto L181;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:180:0x02a6, code lost:
                            
                                r20 = (r20 - r4) / 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:181:0x02ad, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:182:0x02b1, code lost:
                            
                                if (r1 != 0) goto L220;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:183:0x02b3, code lost:
                            
                                r20 = (r20 - r4) / (r2 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:184:0x02b9, code lost:
                            
                                if (r3 <= 0) goto L186;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:185:0x02bb, code lost:
                            
                                r20 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:186:0x02bd, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:187:0x02be, code lost:
                            
                                if (r1 >= r8) goto L298;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:188:0x02c0, code lost:
                            
                                if (r9 == false) goto L219;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:189:0x02c2, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:190:0x02c6, code lost:
                            
                                r2 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:191:0x02d4, code lost:
                            
                                if (r2.LIZIZ.mVisibility != 8) goto L194;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:192:0x02d6, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:193:0x02e0, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:194:0x02e3, code lost:
                            
                                if (r9 == false) goto L217;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:195:0x02e5, code lost:
                            
                                r13 = r13 - r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:196:0x02e7, code lost:
                            
                                if (r1 <= 0) goto L213;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:197:0x02e9, code lost:
                            
                                if (r1 < r7) goto L213;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:198:0x02eb, code lost:
                            
                                if (r9 == false) goto L215;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:199:0x02ed, code lost:
                            
                                r13 = r13 - r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:200:0x02f2, code lost:
                            
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:201:0x02f7, code lost:
                            
                                r11 = r2.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:202:0x02ff, code lost:
                            
                                if (r2.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L206;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:204:0x0304, code lost:
                            
                                if (r2.LIZ != 1) goto L206;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:205:0x0306, code lost:
                            
                                r4 = java.lang.Math.min(r4, r11.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:206:0x030c, code lost:
                            
                                if (r9 == false) goto L212;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:207:0x030e, code lost:
                            
                                r13 = r13 - r4;
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:208:0x0314, code lost:
                            
                                if (r1 >= r5) goto L300;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:209:0x0316, code lost:
                            
                                if (r1 >= r6) goto L301;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:210:0x0318, code lost:
                            
                                if (r9 == false) goto L218;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:211:0x031a, code lost:
                            
                                r13 = r13 - (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:212:0x0321, code lost:
                            
                                r13 = r13 + r4;
                                r2.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:213:0x0328, code lost:
                            
                                if (r9 == false) goto L216;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:215:0x032b, code lost:
                            
                                r13 = r13 + r2.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:216:0x0330, code lost:
                            
                                r2.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:217:0x0336, code lost:
                            
                                r13 = r13 + r20;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:218:0x0339, code lost:
                            
                                r13 = r13 + (-r2.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:219:0x0340, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:221:0x0343, code lost:
                            
                                if (r1 != 2) goto L311;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:223:0x0347, code lost:
                            
                                if (r23.LJFF != 0) goto L265;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:224:0x0349, code lost:
                            
                                r2 = r23.LIZIZ.mHorizontalBiasPercent;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:225:0x034d, code lost:
                            
                                if (r9 == false) goto L227;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:226:0x034f, code lost:
                            
                                r2 = 1.0f - r2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:227:0x0353, code lost:
                            
                                r0 = (int) (((r20 - r4) * r2) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:228:0x035d, code lost:
                            
                                if (r0 < 0) goto L230;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:229:0x035f, code lost:
                            
                                if (r3 <= 0) goto L231;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:230:0x0361, code lost:
                            
                                r0 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:231:0x0362, code lost:
                            
                                if (r9 == false) goto L264;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:232:0x0364, code lost:
                            
                                r13 = r13 - r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:233:0x0365, code lost:
                            
                                r1 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:234:0x0366, code lost:
                            
                                if (r1 >= r8) goto L304;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:235:0x0368, code lost:
                            
                                if (r9 == false) goto L263;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:236:0x036a, code lost:
                            
                                r2 = r8 - (r1 + 1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:237:0x036e, code lost:
                            
                                r3 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r2);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:238:0x037c, code lost:
                            
                                if (r3.LIZIZ.mVisibility != 8) goto L241;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:239:0x037e, code lost:
                            
                                r3.LJII.LIZLLL(r13);
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:240:0x0388, code lost:
                            
                                r1 = r1 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:241:0x038b, code lost:
                            
                                if (r1 <= 0) goto L258;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:242:0x038d, code lost:
                            
                                if (r1 < r7) goto L258;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:243:0x038f, code lost:
                            
                                if (r9 == false) goto L260;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:244:0x0391, code lost:
                            
                                r13 = r13 - r3.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:245:0x0396, code lost:
                            
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:246:0x039b, code lost:
                            
                                r11 = r3.LJ;
                                r4 = r11.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:247:0x03a3, code lost:
                            
                                if (r3.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L251;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:249:0x03a8, code lost:
                            
                                if (r3.LIZ != 1) goto L251;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:250:0x03aa, code lost:
                            
                                r4 = r11.LJIIL;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:251:0x03ac, code lost:
                            
                                if (r9 == false) goto L257;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:252:0x03ae, code lost:
                            
                                r13 = r13 - r4;
                                r3.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:253:0x03b4, code lost:
                            
                                if (r1 >= r5) goto L306;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:254:0x03b6, code lost:
                            
                                if (r1 >= r6) goto L307;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:255:0x03b8, code lost:
                            
                                if (r9 == false) goto L262;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:256:0x03ba, code lost:
                            
                                r13 = r13 - (-r3.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:257:0x03c1, code lost:
                            
                                r13 = r13 + r4;
                                r3.LJIIIIZZ.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:258:0x03c8, code lost:
                            
                                if (r9 == false) goto L261;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:260:0x03cb, code lost:
                            
                                r13 = r13 + r3.LJII.LJFF;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:261:0x03d0, code lost:
                            
                                r3.LJII.LIZLLL(r13);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:262:0x03d6, code lost:
                            
                                r13 = r13 + (-r3.LJIIIIZZ.LJFF);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:263:0x03dd, code lost:
                            
                                r2 = r1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:264:0x03df, code lost:
                            
                                r13 = r13 + r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:265:0x03e1, code lost:
                            
                                r2 = r23.LIZIZ.mVerticalBiasPercent;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:313:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
                            
                                r13 = r23.LJII.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
                            
                                if (r9 == false) goto L72;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
                            
                                r13 = r23.LJIIIIZZ.LJI;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:73:0x00fc, code lost:
                            
                                if (r4 <= r20) goto L77;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
                            
                                if (r9 == false) goto L112;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
                            
                                r13 = r13 + ((int) (((r4 - r20) / 2.0f) + 0.5f));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:77:0x0109, code lost:
                            
                                if (r3 <= 0) goto L130;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
                            
                                r0 = r20 - r4;
                                r0 = (int) ((r0 / r3) + 0.5f);
                                r14 = 0;
                                r17 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x011a, code lost:
                            
                                if (r14 >= r8) goto L282;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:80:0x011c, code lost:
                            
                                r0 = (X.C19OF) com.bytedance.mt.protector.impl.collections.ListProtector.get(r23.LJIIJ, r14);
                                r0 = r0.LIZIZ;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
                            
                                if (r0.mVisibility == 8) goto L284;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:83:0x0138, code lost:
                            
                                if (r0.LIZLLL != X.C19O3.MATCH_CONSTRAINT) goto L285;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
                            
                                r12 = r0.LJ;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:85:0x0140, code lost:
                            
                                if (r12.LJIIIZ != false) goto L286;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
                            
                                if (r19 <= 0.0f) goto L111;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
                            
                                r11 = (int) (((r0.mWeight[r23.LJFF] * r0) / r19) + 0.5f);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
                            
                                if (r23.LJFF != 0) goto L102;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
                            
                                r15 = r0.mMatchConstraintMaxWidth;
                                r0 = r0.mMatchConstraintMinWidth;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:92:0x0167, code lost:
                            
                                if (r0.LIZ != 1) goto L101;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:93:0x0169, code lost:
                            
                                r1 = java.lang.Math.min(r11, r12.LJIIL);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
                            
                                r0 = java.lang.Math.max(r0, r1);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:95:0x0175, code lost:
                            
                                if (r15 <= 0) goto L97;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:96:0x0177, code lost:
                            
                                r0 = java.lang.Math.min(r15, r0);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
                            
                                if (r0 == r11) goto L99;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
                            
                                r17 = r17 + 1;
                                r11 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
                            
                                r0.LJ.LIZLLL(r11);
                             */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
                            @Override // X.C19OF, X.InterfaceC21531119Ob
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.InterfaceC21531119Ob r24) {
                                /*
                                    Method dump skipped, instruction units count: 1000
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C19OC.LIZ(X.19Ob):void");
                            }

                            {
                                C19OA c19oa;
                                int i3;
                                this.LJFF = i;
                                C19OA c19oa2 = this.LIZIZ;
                                C19OA previousChainMember = c19oa2.getPreviousChainMember(i);
                                while (true) {
                                    c19oa = c19oa2;
                                    c19oa2 = previousChainMember;
                                    if (previousChainMember == null) {
                                        break;
                                    } else {
                                        previousChainMember = previousChainMember.getPreviousChainMember(this.LJFF);
                                    }
                                }
                                this.LIZIZ = c19oa;
                                this.LJIIJ.add(c19oa.getRun(this.LJFF));
                                C19OA nextChainMember = c19oa.getNextChainMember(this.LJFF);
                                while (nextChainMember != null) {
                                    this.LJIIJ.add(nextChainMember.getRun(this.LJFF));
                                    nextChainMember = nextChainMember.getNextChainMember(this.LJFF);
                                }
                                for (C19OF c19of : this.LJIIJ) {
                                    int i4 = this.LJFF;
                                    if (i4 == 0) {
                                        c19of.LIZIZ.horizontalChainRun = this;
                                    } else if (i4 == 1) {
                                        c19of.LIZIZ.verticalChainRun = this;
                                    }
                                }
                                if (this.LJFF == 0 && ((C19O9) this.LIZIZ.mParent).LJ && this.LJIIJ.size() > 1) {
                                    ArrayList<C19OF> arrayList2 = this.LJIIJ;
                                    this.LIZIZ = ((C19OF) ListProtector.get(arrayList2, arrayList2.size() - 1)).LIZIZ;
                                }
                                if (this.LJFF == 0) {
                                    i3 = this.LIZIZ.mHorizontalChainStyle;
                                } else {
                                    i3 = this.LIZIZ.mVerticalChainStyle;
                                }
                                this.LJIIJJI = i3;
                            }
                        };
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof C21530019Nq) {
                    arrayList.add(new C19OF(next) { // from class: X.19OM
                        @Override // X.C19OF
                        public final void LJFF() {
                            this.LIZJ = null;
                            this.LJII.LIZJ();
                        }

                        @Override // X.C19OF
                        public final boolean LJIIJ() {
                            return false;
                        }

                        @Override // X.C19OF
                        public final void LIZLLL() {
                            C19OA c19oa = this.LIZIZ;
                            if (c19oa instanceof C19OH) {
                                C19OL c19ol = this.LJII;
                                c19ol.LIZIZ = true;
                                C19OH c19oh = (C19OH) c19oa;
                                int i3 = c19oh.LIZJ;
                                boolean z = c19oh.LIZLLL;
                                int i4 = 0;
                                if (i3 == 0) {
                                    c19ol.LJ = C19OW.LEFT;
                                    while (i4 < c19oh.LIZIZ) {
                                        C19OA c19oa2 = c19oh.LIZ[i4];
                                        if (z || c19oa2.mVisibility != 8) {
                                            C19OL c19ol2 = c19oa2.horizontalRun.LJII;
                                            ((ArrayList) c19ol2.LJIIJ).add(this.LJII);
                                            ((ArrayList) this.LJII.LJIIJJI).add(c19ol2);
                                        }
                                        i4++;
                                    }
                                    LJIIL(this.LIZIZ.horizontalRun.LJII);
                                    LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                                    return;
                                }
                                if (i3 == 1) {
                                    c19ol.LJ = C19OW.RIGHT;
                                    while (i4 < c19oh.LIZIZ) {
                                        C19OA c19oa3 = c19oh.LIZ[i4];
                                        if (z || c19oa3.mVisibility != 8) {
                                            C19OL c19ol3 = c19oa3.horizontalRun.LJIIIIZZ;
                                            ((ArrayList) c19ol3.LJIIJ).add(this.LJII);
                                            ((ArrayList) this.LJII.LJIIJJI).add(c19ol3);
                                        }
                                        i4++;
                                    }
                                    LJIIL(this.LIZIZ.horizontalRun.LJII);
                                    LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                                    return;
                                }
                                if (i3 == 2) {
                                    c19ol.LJ = C19OW.TOP;
                                    while (i4 < c19oh.LIZIZ) {
                                        C19OA c19oa4 = c19oh.LIZ[i4];
                                        if (z || c19oa4.mVisibility != 8) {
                                            C19OL c19ol4 = c19oa4.verticalRun.LJII;
                                            ((ArrayList) c19ol4.LJIIJ).add(this.LJII);
                                            ((ArrayList) this.LJII.LJIIJJI).add(c19ol4);
                                        }
                                        i4++;
                                    }
                                    LJIIL(this.LIZIZ.verticalRun.LJII);
                                    LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                                    return;
                                }
                                if (i3 == 3) {
                                    c19ol.LJ = C19OW.BOTTOM;
                                    while (i4 < c19oh.LIZIZ) {
                                        C19OA c19oa5 = c19oh.LIZ[i4];
                                        if (z || c19oa5.mVisibility != 8) {
                                            C19OL c19ol5 = c19oa5.verticalRun.LJIIIIZZ;
                                            ((ArrayList) c19ol5.LJIIJ).add(this.LJII);
                                            ((ArrayList) this.LJII.LJIIJJI).add(c19ol5);
                                        }
                                        i4++;
                                    }
                                    LJIIL(this.LIZIZ.verticalRun.LJII);
                                    LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                                }
                            }
                        }

                        @Override // X.C19OF
                        public final void LJ() {
                            C19OA c19oa = this.LIZIZ;
                            if (c19oa instanceof C19OH) {
                                int i3 = ((C19OH) c19oa).LIZJ;
                                if (i3 == 0 || i3 == 1) {
                                    c19oa.mX = this.LJII.LJI;
                                } else {
                                    c19oa.mY = this.LJII.LJI;
                                }
                            }
                        }

                        @Override // X.C19OF, X.InterfaceC21531119Ob
                        public final void LIZ(InterfaceC21531119Ob interfaceC21531119Ob) {
                            C19OH c19oh = (C19OH) this.LIZIZ;
                            int i3 = c19oh.LIZJ;
                            Iterator it3 = ((ArrayList) this.LJII.LJIIJJI).iterator();
                            int i4 = 0;
                            int i5 = -1;
                            while (it3.hasNext()) {
                                int i6 = ((C19OL) it3.next()).LJI;
                                if (i5 == -1 || i6 < i5) {
                                    i5 = i6;
                                }
                                if (i4 < i6) {
                                    i4 = i6;
                                }
                            }
                            if (i3 != 0 && i3 != 2) {
                                this.LJII.LIZLLL(i4 + c19oh.LJ);
                            } else {
                                this.LJII.LIZLLL(i5 + c19oh.LJ);
                            }
                        }

                        public final void LJIIL(C19OL c19ol) {
                            ((ArrayList) this.LJII.LJIIJ).add(c19ol);
                            ((ArrayList) c19ol.LJIIJJI).add(this.LJII);
                        }
                    });
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C19OF> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next().LJFF();
        }
        for (C19OF c19of : arrayList) {
            if (c19of.LIZIZ != this.LIZLLL) {
                c19of.LIZLLL();
            }
        }
        this.LJII.clear();
        LJ(this.LIZ.horizontalRun, 0, this.LJII);
        LJ(this.LIZ.verticalRun, 1, this.LJII);
        this.LIZIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r18 = this;
            r10 = r18
            X.19O9 r0 = r10.LIZ
            java.util.ArrayList<X.19OA> r0 = r0.LIZ
            java.util.Iterator r9 = r0.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r11 = r9.next()
            X.19OA r11 = (X.C19OA) r11
            boolean r0 = r11.measured
            if (r0 != 0) goto La
            X.19O3[] r0 = r11.mListDimensionBehaviors
            r8 = 0
            r6 = r0[r8]
            r2 = 1
            r5 = r0[r2]
            int r3 = r11.mMatchConstraintDefaultWidth
            int r1 = r11.mMatchConstraintDefaultHeight
            X.19O3 r14 = X.C19O3.WRAP_CONTENT
            if (r6 == r14) goto L30
            X.19O3 r0 = X.C19O3.MATCH_CONSTRAINT
            if (r6 != r0) goto Lbe
            if (r3 != r2) goto Lbe
        L30:
            r7 = 1
        L31:
            if (r5 == r14) goto L39
            X.19O3 r0 = X.C19O3.MATCH_CONSTRAINT
            if (r5 != r0) goto L3a
            if (r1 != r2) goto L3a
        L39:
            r8 = 1
        L3a:
            X.19OD r0 = r11.horizontalRun
            X.19OX r4 = r0.LJ
            boolean r1 = r4.LJIIIZ
            X.19OE r0 = r11.verticalRun
            X.19OX r3 = r0.LJ
            boolean r0 = r3.LJIIIZ
            if (r1 == 0) goto L8e
            if (r0 == 0) goto L66
            X.19O3 r12 = X.C19O3.FIXED
            int r13 = r4.LJI
            int r15 = r3.LJI
            r14 = r12
            r10.LJFF(r11, r12, r13, r14, r15)
            r11.measured = r2
        L56:
            boolean r0 = r11.measured
            if (r0 == 0) goto La
            X.19OE r0 = r11.verticalRun
            X.19Oa r1 = r0.LJIIJJI
            if (r1 == 0) goto La
            int r0 = r11.mBaselineDistance
            r1.LIZLLL(r0)
            goto La
        L66:
            if (r8 == 0) goto L8e
            X.19O3 r12 = X.C19O3.FIXED
            int r13 = r4.LJI
            int r15 = r3.LJI
            r10.LJFF(r11, r12, r13, r14, r15)
            X.19O3 r0 = X.C19O3.MATCH_CONSTRAINT
            if (r5 != r0) goto L80
            X.19OE r0 = r11.verticalRun
            X.19OX r1 = r0.LJ
            int r0 = r11.getHeight()
            r1.LJIIL = r0
            goto L56
        L80:
            X.19OE r0 = r11.verticalRun
            X.19OX r1 = r0.LJ
            int r0 = r11.getHeight()
            r1.LIZLLL(r0)
            r11.measured = r2
            goto L56
        L8e:
            if (r0 == 0) goto L56
            if (r7 == 0) goto L56
            int r1 = r4.LJI
            X.19O3 r16 = X.C19O3.FIXED
            int r0 = r3.LJI
            r12 = r10
            r13 = r11
            r14 = r14
            r15 = r1
            r17 = r0
            r12.LJFF(r13, r14, r15, r16, r17)
            X.19O3 r0 = X.C19O3.MATCH_CONSTRAINT
            if (r6 != r0) goto Lb0
            X.19OD r0 = r11.horizontalRun
            X.19OX r1 = r0.LJ
            int r0 = r11.getWidth()
            r1.LJIIL = r0
            goto L56
        Lb0:
            X.19OD r0 = r11.horizontalRun
            X.19OX r1 = r0.LJ
            int r0 = r11.getWidth()
            r1.LIZLLL(r0)
            r11.measured = r2
            goto L56
        Lbe:
            r7 = 0
            goto L31
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OB.LJI():void");
    }

    public C19OB(C19O9 c19o9) {
        new ArrayList();
        this.LJFF = null;
        this.LJI = new C21530919Nz();
        this.LJII = new ArrayList<>();
        this.LIZ = c19o9;
        this.LIZLLL = c19o9;
    }

    public final void LIZIZ(C19O9 c19o9) {
        C19O3[] c19o3Arr;
        C19O3 c19o3;
        C19O3 c19o32;
        C19O3 c19o33;
        C19O3 c19o34;
        for (C19OA c19oa : c19o9.LIZ) {
            C19O3[] c19o3Arr2 = c19oa.mListDimensionBehaviors;
            C19O3 c19o35 = c19o3Arr2[0];
            C19O3 c19o36 = c19o3Arr2[1];
            if (c19oa.mVisibility == 8) {
                c19oa.measured = true;
            } else {
                float f = c19oa.mMatchConstraintPercentWidth;
                if (f < 1.0f && c19o35 == C19O3.MATCH_CONSTRAINT) {
                    c19oa.mMatchConstraintDefaultWidth = 2;
                }
                float f2 = c19oa.mMatchConstraintPercentHeight;
                if (f2 < 1.0f && c19o36 == C19O3.MATCH_CONSTRAINT) {
                    c19oa.mMatchConstraintDefaultHeight = 2;
                }
                if (c19oa.mDimensionRatio > 0.0f) {
                    C19O3 c19o37 = C19O3.MATCH_CONSTRAINT;
                    if (c19o35 == c19o37 && (c19o36 == C19O3.WRAP_CONTENT || c19o36 == C19O3.FIXED)) {
                        c19oa.mMatchConstraintDefaultWidth = 3;
                    } else if (c19o36 == c19o37 && (c19o35 == C19O3.WRAP_CONTENT || c19o35 == C19O3.FIXED)) {
                        c19oa.mMatchConstraintDefaultHeight = 3;
                    } else if (c19o35 == c19o37 && c19o36 == c19o37) {
                        if (c19oa.mMatchConstraintDefaultWidth == 0) {
                            c19oa.mMatchConstraintDefaultWidth = 3;
                        }
                        if (c19oa.mMatchConstraintDefaultHeight == 0) {
                            c19oa.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                C19O3 c19o38 = C19O3.MATCH_CONSTRAINT;
                if (c19o35 == c19o38 && c19oa.mMatchConstraintDefaultWidth == 1 && (c19oa.mLeft.LJFF == null || c19oa.mRight.LJFF == null)) {
                    c19o35 = C19O3.WRAP_CONTENT;
                }
                if (c19o36 == c19o38 && c19oa.mMatchConstraintDefaultHeight == 1 && (c19oa.mTop.LJFF == null || c19oa.mBottom.LJFF == null)) {
                    c19o36 = C19O3.WRAP_CONTENT;
                }
                C19OD c19od = c19oa.horizontalRun;
                c19od.LIZLLL = c19o35;
                int i = c19oa.mMatchConstraintDefaultWidth;
                c19od.LIZ = i;
                C19OE c19oe = c19oa.verticalRun;
                c19oe.LIZLLL = c19o36;
                int i2 = c19oa.mMatchConstraintDefaultHeight;
                c19oe.LIZ = i2;
                C19O3 c19o39 = C19O3.MATCH_PARENT;
                if ((c19o35 == c19o39 || c19o35 == C19O3.FIXED || c19o35 == C19O3.WRAP_CONTENT) && (c19o36 == c19o39 || c19o36 == C19O3.FIXED || c19o36 == C19O3.WRAP_CONTENT)) {
                    int width = c19oa.getWidth();
                    if (c19o35 == c19o39) {
                        width = (c19o9.getWidth() - c19oa.mLeft.LJI) - c19oa.mRight.LJI;
                        c19o35 = C19O3.FIXED;
                    }
                    int height = c19oa.getHeight();
                    if (c19o36 == c19o39) {
                        height = (c19o9.getHeight() - c19oa.mTop.LJI) - c19oa.mBottom.LJI;
                        c19o36 = C19O3.FIXED;
                    }
                    LJFF(c19oa, c19o35, width, c19o36, height);
                    c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                    c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                    c19oa.measured = true;
                } else {
                    if (c19o35 == c19o38 && (c19o36 == (c19o34 = C19O3.WRAP_CONTENT) || c19o36 == C19O3.FIXED)) {
                        if (i == 3) {
                            if (c19o36 == c19o34) {
                                LJFF(c19oa, c19o34, 0, c19o34, 0);
                            }
                            int height2 = c19oa.getHeight();
                            int i3 = (int) ((height2 * c19oa.mDimensionRatio) + 0.5f);
                            C19O3 c19o310 = C19O3.FIXED;
                            LJFF(c19oa, c19o310, i3, c19o310, height2);
                            c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                            c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                            c19oa.measured = true;
                        } else if (i == 1) {
                            LJFF(c19oa, c19o34, 0, c19o36, 0);
                            c19oa.horizontalRun.LJ.LJIIL = c19oa.getWidth();
                        } else if (i == 2) {
                            C19O3 c19o311 = c19o9.mListDimensionBehaviors[0];
                            C19O3 c19o312 = C19O3.FIXED;
                            if (c19o311 == c19o312 || c19o311 == c19o39) {
                                LJFF(c19oa, c19o312, (int) ((f * c19o9.getWidth()) + 0.5f), c19o36, c19oa.getHeight());
                                c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                                c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                                c19oa.measured = true;
                            }
                        } else {
                            C19OG[] c19ogArr = c19oa.mListAnchors;
                            if (c19ogArr[0].LJFF == null || c19ogArr[1].LJFF == null) {
                                LJFF(c19oa, c19o34, 0, c19o36, 0);
                                c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                                c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                                c19oa.measured = true;
                            }
                        }
                    }
                    if (c19o36 == c19o38 && (c19o35 == (c19o33 = C19O3.WRAP_CONTENT) || c19o35 == C19O3.FIXED)) {
                        if (i2 == 3) {
                            if (c19o35 == c19o33) {
                                LJFF(c19oa, c19o33, 0, c19o33, 0);
                            }
                            int width2 = c19oa.getWidth();
                            float f3 = c19oa.mDimensionRatio;
                            if (c19oa.mDimensionRatioSide == -1) {
                                f3 = 1.0f / f3;
                            }
                            C19O3 c19o313 = C19O3.FIXED;
                            LJFF(c19oa, c19o313, width2, c19o313, (int) ((width2 * f3) + 0.5f));
                            c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                            c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                            c19oa.measured = true;
                        } else if (i2 == 1) {
                            LJFF(c19oa, c19o35, 0, c19o33, 0);
                            c19oa.verticalRun.LJ.LJIIL = c19oa.getHeight();
                        } else if (i2 == 2) {
                            C19O3 c19o314 = c19o9.mListDimensionBehaviors[1];
                            C19O3 c19o315 = C19O3.FIXED;
                            if (c19o314 == c19o315 || c19o314 == c19o39) {
                                LJFF(c19oa, c19o35, c19oa.getWidth(), c19o315, (int) ((f2 * c19o9.getHeight()) + 0.5f));
                                c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                                c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                                c19oa.measured = true;
                            }
                        } else {
                            C19OG[] c19ogArr2 = c19oa.mListAnchors;
                            if (c19ogArr2[2].LJFF == null || c19ogArr2[3].LJFF == null) {
                                LJFF(c19oa, c19o33, 0, c19o36, 0);
                                c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                                c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                                c19oa.measured = true;
                            }
                        }
                    }
                    if (c19o35 == c19o38 && c19o36 == c19o38) {
                        if (i != 1 && i2 != 1) {
                            if (i2 == 2 && i == 2 && ((c19o3 = (c19o3Arr = c19o9.mListDimensionBehaviors)[0]) == (c19o32 = C19O3.FIXED) || c19o3 == c19o32)) {
                                C19O3 c19o316 = c19o3Arr[1];
                                if (c19o316 == c19o32 || c19o316 == c19o32) {
                                    LJFF(c19oa, c19o32, (int) ((f * c19o9.getWidth()) + 0.5f), c19o32, (int) ((f2 * c19o9.getHeight()) + 0.5f));
                                    c19oa.horizontalRun.LJ.LIZLLL(c19oa.getWidth());
                                    c19oa.verticalRun.LJ.LIZLLL(c19oa.getHeight());
                                    c19oa.measured = true;
                                }
                            }
                        } else {
                            C19O3 c19o317 = C19O3.WRAP_CONTENT;
                            LJFF(c19oa, c19o317, 0, c19o317, 0);
                            c19oa.horizontalRun.LJ.LJIIL = c19oa.getWidth();
                            c19oa.verticalRun.LJ.LJIIL = c19oa.getHeight();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        if ((r5 instanceof X.C19OD) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if ((r5 instanceof X.C19OE) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(X.C19O9 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OB.LIZLLL(X.19O9, int):int");
    }

    public final void LJ(C19OF c19of, int i, ArrayList<C19OR> arrayList) {
        for (InterfaceC21531119Ob interfaceC21531119Ob : (ArrayList) c19of.LJII.LJIIJ) {
            if (interfaceC21531119Ob instanceof C19OL) {
                LIZ((C19OL) interfaceC21531119Ob, i, 0, arrayList, null);
            } else if (interfaceC21531119Ob instanceof C19OF) {
                LIZ(((C19OF) interfaceC21531119Ob).LJII, i, 0, arrayList, null);
            }
        }
        for (InterfaceC21531119Ob interfaceC21531119Ob2 : (ArrayList) c19of.LJIIIIZZ.LJIIJ) {
            if (interfaceC21531119Ob2 instanceof C19OL) {
                LIZ((C19OL) interfaceC21531119Ob2, i, 1, arrayList, null);
            } else if (interfaceC21531119Ob2 instanceof C19OF) {
                LIZ(((C19OF) interfaceC21531119Ob2).LJIIIIZZ, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC21531119Ob interfaceC21531119Ob3 : (ArrayList) ((C19OE) c19of).LJIIJ.LJIIJ) {
                if (interfaceC21531119Ob3 instanceof C19OL) {
                    LIZ((C19OL) interfaceC21531119Ob3, 1, 2, arrayList, null);
                }
            }
        }
    }

    public final void LIZ(C19OL c19ol, int i, int i2, ArrayList arrayList, C19OR c19or) {
        int i3;
        C19OR c19or2 = c19or;
        C19OF c19of = c19ol.LIZLLL;
        if (c19of.LIZJ == null) {
            C19OB c19ob = this;
            C19O9 c19o9 = c19ob.LIZ;
            if (c19of != c19o9.horizontalRun && c19of != c19o9.verticalRun) {
                ArrayList arrayList2 = arrayList;
                if (c19or2 == null) {
                    c19or2 = new C19OR(c19of);
                    arrayList2.add(c19or2);
                }
                c19of.LIZJ = c19or2;
                c19or2.LIZIZ.add(c19of);
                Iterator it2 = ((ArrayList) c19of.LJII.LJIIJ).iterator();
                while (true) {
                    i3 = i;
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC21531119Ob interfaceC21531119Ob = (InterfaceC21531119Ob) it2.next();
                    if (interfaceC21531119Ob instanceof C19OL) {
                        c19ob.LIZ((C19OL) interfaceC21531119Ob, i3, 0, arrayList2, c19or2);
                    }
                }
                for (InterfaceC21531119Ob interfaceC21531119Ob2 : (ArrayList) c19of.LJIIIIZZ.LJIIJ) {
                    if (interfaceC21531119Ob2 instanceof C19OL) {
                        c19ob.LIZ((C19OL) interfaceC21531119Ob2, i3, 1, arrayList2, c19or2);
                    }
                }
                if (i3 == 1 && (c19of instanceof C19OE)) {
                    for (InterfaceC21531119Ob interfaceC21531119Ob3 : (ArrayList) ((C19OE) c19of).LJIIJ.LJIIJ) {
                        if (interfaceC21531119Ob3 instanceof C19OL) {
                            c19ob.LIZ((C19OL) interfaceC21531119Ob3, 1, 2, arrayList2, c19or2);
                        }
                    }
                }
                Iterator it3 = ((ArrayList) c19of.LJII.LJIIJJI).iterator();
                while (it3.hasNext()) {
                    c19ob.LIZ((C19OL) it3.next(), i3, 0, arrayList2, c19or2);
                }
                Iterator it4 = ((ArrayList) c19of.LJIIIIZZ.LJIIJJI).iterator();
                while (it4.hasNext()) {
                    c19ob = c19ob;
                    i3 = i3;
                    arrayList2 = arrayList2;
                    c19or2 = c19or2;
                    c19ob.LIZ((C19OL) it4.next(), i3, 1, arrayList2, c19or2);
                }
                if (i3 == 1 && (c19of instanceof C19OE)) {
                    Iterator it5 = ((ArrayList) ((C19OE) c19of).LJIIJ.LJIIJJI).iterator();
                    while (it5.hasNext()) {
                        c19ob.LIZ((C19OL) it5.next(), 1, 2, arrayList2, c19or2);
                    }
                }
            }
        }
    }

    public final void LJFF(C19OA c19oa, C19O3 c19o3, int i, C19O3 c19o32, int i2) {
        C21530919Nz c21530919Nz = this.LJI;
        c21530919Nz.LIZ = c19o3;
        c21530919Nz.LIZIZ = c19o32;
        c21530919Nz.LIZJ = i;
        c21530919Nz.LIZLLL = i2;
        this.LJFF.LIZIZ(c19oa, c21530919Nz);
        c19oa.setWidth(this.LJI.LJ);
        c19oa.setHeight(this.LJI.LJFF);
        C21530919Nz c21530919Nz2 = this.LJI;
        c19oa.hasBaseline = c21530919Nz2.LJII;
        c19oa.setBaselineDistance(c21530919Nz2.LJI);
    }
}
