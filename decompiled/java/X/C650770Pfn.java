package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650770Pfn implements InterfaceC650760Pfm {
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC650860Pfw LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(510));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(511));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(509));
    public C650820Pfs LJI = new C650820Pfs();
    public C648660PcO LJII = new C648660PcO(EnumC587120N1a.STATE_IDLE, null);

    @Override // X.InterfaceC650760Pfm
    public final List<InterfaceC650860Pfw> LIZ(RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list) {
        return null;
    }

    @Override // X.InterfaceC650760Pfm
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView) {
        InterfaceC650860Pfw interfaceC650860Pfw = this.LJFF;
        if (!this.LIZLLL && interfaceC650860Pfw != null) {
            if (interfaceC650860Pfw.LJFF() != 1) {
                int height = interfaceC650860Pfw.getView().getHeight();
                C650830Pft.LIZ(recyclerView, interfaceC650860Pfw.getView(), new int[2]);
                float fFloatValue = (height * ((Number) C0A0B.LIZ.getValue()).floatValue()) + r2[1];
                if (fFloatValue > 0.0f) {
                    canvas.drawLine(0.0f, fFloatValue, recyclerView.getWidth(), fFloatValue, (Paint) this.LIZ.getValue());
                }
            } else {
                int height2 = interfaceC650860Pfw.getView().getHeight();
                C650830Pft.LIZ(recyclerView, interfaceC650860Pfw.getView(), new int[2]);
                float fAbs = (height2 * 0.25f) - Math.abs(r2[1]);
                if (fAbs > 0.0f) {
                    canvas.drawLine(0.0f, fAbs, recyclerView.getWidth(), fAbs, (Paint) this.LIZ.getValue());
                }
            }
        }
        float height3 = recyclerView.getHeight() - C650820Pfs.LJFF;
        canvas.drawLine(0.0f, height3, recyclerView.getWidth(), height3, (Paint) this.LIZIZ.getValue());
        float f = C650820Pfs.LJ;
        canvas.drawLine(0.0f, f, recyclerView.getWidth(), f, (Paint) this.LIZJ.getValue());
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(50.0f);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJI.LIZIZ);
        sbLIZ.append(" : ");
        sbLIZ.append(C650820Pfs.LIZLLL);
        canvas.drawText(C2188811AlT.LIZIZ(sbLIZ), C418440Gaw.LIZIZ(50), C418440Gaw.LIZIZ(100), paint);
    }

    public final void LJ(EnumC650850Pfv enumC650850Pfv, int i) {
        if (!this.LIZLLL) {
            return;
        }
        if (C650820Pfs.LIZ(this.LJI, null, 0, 7).LIZ != enumC650850Pfv) {
            this.LJI = C650820Pfs.LIZ(this.LJI, enumC650850Pfv, i, 4);
        } else {
            C650820Pfs c650820Pfs = this.LJI;
            this.LJI = C650820Pfs.LIZ(c650820Pfs, enumC650850Pfv, c650820Pfs.LIZIZ + i, 4);
        }
    }

    @Override // X.InterfaceC650760Pfm
    public final List<InterfaceC650860Pfw> LIZIZ(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i, boolean z) {
        int iAbs;
        EnumC650850Pfv enumC650850Pfv;
        InterfaceC650860Pfw interfaceC650860Pfw;
        InterfaceC650860Pfw interfaceC650860Pfw2 = (InterfaceC650860Pfw) C13LP.LJJJLL(list);
        InterfaceC650860Pfw interfaceC650860Pfw3 = null;
        if (interfaceC650860Pfw2 == null) {
            return null;
        }
        if (this.LJFF == null) {
            this.LJFF = interfaceC650860Pfw2;
        }
        if (!this.LIZLLL && !Intrinsics.LJFF(interfaceC650860Pfw2, this.LJFF) && interfaceC650860Pfw2.LJFF() == 1) {
            this.LIZLLL = true;
        }
        if (this.LIZLLL) {
            InterfaceC650860Pfw interfaceC650860Pfw4 = this.LJI.LIZJ;
            List<InterfaceC650860Pfw> listLIZLLL = LIZLLL(enumC648690PcR, recyclerView, list, i, z);
            if (Intrinsics.LJFF(interfaceC650860Pfw4, this.LJI.LIZJ) || z) {
                return listLIZLLL;
            }
        } else {
            InterfaceC650860Pfw interfaceC650860Pfw5 = this.LJFF;
            if (interfaceC650860Pfw5 != null) {
                if (!this.LJ && interfaceC650860Pfw5.LJFF() == 1) {
                    this.LJ = true;
                }
                if (!this.LJ) {
                    C650830Pft.LIZ(recyclerView, interfaceC650860Pfw5.getView(), new int[2]);
                    if (r1[1] + (((Number) C0A0B.LIZ.getValue()).floatValue() * interfaceC650860Pfw5.getView().getHeight()) < 0.0f) {
                        InterfaceC650860Pfw interfaceC650860Pfw6 = (InterfaceC650860Pfw) C13LP.LJJJLZIJ(list.indexOf(interfaceC650860Pfw5) + 1, list);
                        if (interfaceC650860Pfw6 != null) {
                            this.LJFF = interfaceC650860Pfw6;
                            this.LIZLLL = true;
                            return LIZLLL(enumC648690PcR, recyclerView, list, i, z);
                        }
                        return Collections.singletonList(interfaceC650860Pfw5);
                    }
                    return Collections.singletonList(interfaceC650860Pfw5);
                }
                int height = interfaceC650860Pfw5.getView().getHeight();
                int[] iArr = new int[2];
                C650830Pft.LIZ(recyclerView, interfaceC650860Pfw5.getView(), iArr);
                C01GW c01gw = C304750Bx3.LIZIZ;
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    iAbs = iArr[1];
                } else {
                    iAbs = Math.abs(iArr[1]);
                }
                if (enumC648690PcR == EnumC648690PcR.CONSUME_FROM_TOP_TO_BOTTOM) {
                    enumC650850Pfv = EnumC650850Pfv.TOP_TO_BOTTOM;
                } else {
                    enumC650850Pfv = EnumC650850Pfv.BOTTOM_TO_TOP;
                }
                if ((((Boolean) c01gw.getValue()).booleanValue() && iAbs >= height * (-0.25f)) || (!((Boolean) c01gw.getValue()).booleanValue() && iAbs <= height * 0.25f)) {
                    InterfaceC650860Pfw interfaceC650860Pfw7 = this.LJFF;
                    if (interfaceC650860Pfw7 != null) {
                        InterfaceC650860Pfw[] interfaceC650860PfwArr = new InterfaceC650860Pfw[2];
                        InterfaceC650860Pfw interfaceC650860PfwLJII = interfaceC650860Pfw7.LJII();
                        if (interfaceC650860PfwLJII == null || !interfaceC650860PfwLJII.N1()) {
                            interfaceC650860PfwLJII = null;
                        }
                        interfaceC650860PfwArr[0] = interfaceC650860PfwLJII;
                        if (interfaceC650860Pfw7.N1()) {
                            interfaceC650860Pfw3 = interfaceC650860Pfw7;
                        }
                        interfaceC650860PfwArr[1] = interfaceC650860Pfw3;
                        return C13LQ.LJIJI(interfaceC650860PfwArr);
                    }
                } else {
                    this.LIZLLL = true;
                    if (((Boolean) C304750Bx3.LIZJ.getValue()).booleanValue()) {
                        return LIZLLL(enumC648690PcR, recyclerView, list, i, z);
                    }
                    Iterator<? extends InterfaceC650860Pfw> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC650860Pfw next = it2.next();
                        if (!Intrinsics.LJFF(next, interfaceC650860Pfw5) && !Intrinsics.LJFF(next, interfaceC650860Pfw5.LJII())) {
                            this.LJFF = next;
                            break;
                        }
                    }
                    InterfaceC650860Pfw interfaceC650860Pfw8 = this.LJFF;
                    if (interfaceC650860Pfw8 != null) {
                        this.LJI.getClass();
                        this.LJI = new C650820Pfs(enumC650850Pfv, 0, interfaceC650860Pfw8);
                        if (interfaceC650860Pfw8.N1()) {
                            InterfaceC650860Pfw[] interfaceC650860PfwArr2 = new InterfaceC650860Pfw[2];
                            if (interfaceC650860Pfw8.N1()) {
                                interfaceC650860Pfw = interfaceC650860Pfw8;
                            } else {
                                interfaceC650860Pfw = null;
                            }
                            interfaceC650860PfwArr2[0] = interfaceC650860Pfw;
                            InterfaceC650860Pfw interfaceC650860PfwLJII2 = interfaceC650860Pfw8.LJII();
                            if (interfaceC650860PfwLJII2 != null && interfaceC650860PfwLJII2.N1()) {
                                interfaceC650860Pfw3 = interfaceC650860PfwLJII2;
                            }
                            interfaceC650860PfwArr2[1] = interfaceC650860Pfw3;
                            return C13LQ.LJIJI(interfaceC650860PfwArr2);
                        }
                    }
                }
            }
        }
        return null;
    }

    public final List<InterfaceC650860Pfw> LIZLLL(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i, boolean z) {
        EnumC650850Pfv enumC650850Pfv;
        InterfaceC650860Pfw interfaceC650860Pfw;
        InterfaceC650860Pfw interfaceC650860Pfw2;
        int i2 = i;
        if (enumC648690PcR == EnumC648690PcR.CONSUME_FROM_TOP_TO_BOTTOM) {
            enumC650850Pfv = EnumC650850Pfv.TOP_TO_BOTTOM;
        } else {
            enumC650850Pfv = EnumC650850Pfv.BOTTOM_TO_TOP;
        }
        if (this.LJII.LIZ == EnumC587120N1a.STATE_IDLE && z) {
            LJ(enumC650850Pfv, i2);
        } else {
            EnumC650850Pfv enumC650850Pfv2 = this.LJI.LIZ;
            if (enumC650850Pfv2 != enumC650850Pfv) {
                i2 = -i2;
            }
            LJ(enumC650850Pfv2, i2);
        }
        C650820Pfs c650820Pfs = this.LJI;
        EnumC650850Pfv enumC650850Pfv3 = c650820Pfs.LIZ;
        InterfaceC650860Pfw interfaceC650860Pfw3 = c650820Pfs.LIZJ;
        ArrayList<InterfaceC650860Pfw> arrayList = new ArrayList();
        for (InterfaceC650860Pfw interfaceC650860Pfw4 : list) {
            if (interfaceC650860Pfw4.LJIIIZ() == 0) {
                arrayList.add(interfaceC650860Pfw4);
            }
        }
        InterfaceC650860Pfw interfaceC650860Pfw5 = null;
        int i3 = Integer.MIN_VALUE;
        int height = Integer.MAX_VALUE;
        InterfaceC650860Pfw interfaceC650860Pfw6 = null;
        for (InterfaceC650860Pfw interfaceC650860Pfw7 : arrayList) {
            int i4 = C650840Pfu.LIZ[enumC650850Pfv3.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = C650820Pfs.LJ;
                    int[] iArr = new int[2];
                    C650830Pft.LIZ(recyclerView, interfaceC650860Pfw7.getView(), iArr);
                    int i6 = iArr[1];
                    if (interfaceC650860Pfw7.getView().getHeight() + i6 > i5 && interfaceC650860Pfw7.getView().getHeight() + i6 < height) {
                        height = interfaceC650860Pfw7.getView().getHeight() + i6;
                        interfaceC650860Pfw6 = interfaceC650860Pfw7;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                int height2 = recyclerView.getHeight() - C650820Pfs.LJFF;
                int[] iArr2 = new int[2];
                C650830Pft.LIZ(recyclerView, interfaceC650860Pfw7.getView(), iArr2);
                int i7 = iArr2[1];
                if (i7 <= height2 && i7 > i3) {
                    interfaceC650860Pfw6 = interfaceC650860Pfw7;
                    i3 = i7;
                }
            }
        }
        if (!Intrinsics.LJFF(interfaceC650860Pfw6, interfaceC650860Pfw3)) {
            this.LJI.getClass();
            this.LJI = new C650820Pfs(enumC650850Pfv3, 0, interfaceC650860Pfw6);
        }
        C648660PcO c648660PcO = this.LJII;
        EnumC587120N1a enumC587120N1a = c648660PcO.LIZ;
        if (enumC587120N1a == EnumC587120N1a.STATE_IDLE && z) {
            this.LJII = new C648660PcO(EnumC587120N1a.STATE_SCROLLING, interfaceC650860Pfw6);
        } else if (enumC587120N1a == EnumC587120N1a.STATE_SCROLLING && !Intrinsics.LJFF(interfaceC650860Pfw6, c648660PcO.LIZIZ)) {
            this.LJI = C650820Pfs.LIZ(this.LJI, enumC650850Pfv, 0, 6);
            this.LJII = new C648660PcO(this.LJII.LIZ, interfaceC650860Pfw6);
        }
        if (interfaceC650860Pfw6 == null) {
            return null;
        }
        C650820Pfs c650820Pfs2 = this.LJI;
        if (interfaceC650860Pfw6.LJFF() > 1) {
            if (!interfaceC650860Pfw6.N1()) {
                return null;
            }
            return Collections.singletonList(interfaceC650860Pfw6);
        }
        int i8 = C650840Pfu.LIZ[c650820Pfs2.LIZ.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (c650820Pfs2.LIZIZ <= C650820Pfs.LIZLLL) {
                    InterfaceC650860Pfw interfaceC650860PfwLJII = interfaceC650860Pfw6.LJII();
                    if (interfaceC650860PfwLJII == null || !interfaceC650860PfwLJII.N1()) {
                        return null;
                    }
                    InterfaceC650860Pfw[] interfaceC650860PfwArr = new InterfaceC650860Pfw[2];
                    InterfaceC650860Pfw interfaceC650860PfwLJII2 = interfaceC650860Pfw6.LJII();
                    if (interfaceC650860PfwLJII2 == null || !interfaceC650860PfwLJII2.N1()) {
                        interfaceC650860PfwLJII2 = null;
                    }
                    interfaceC650860PfwArr[0] = interfaceC650860PfwLJII2;
                    if (interfaceC650860Pfw6.N1()) {
                        interfaceC650860Pfw5 = interfaceC650860Pfw6;
                    }
                    interfaceC650860PfwArr[1] = interfaceC650860Pfw5;
                    return C13LQ.LJIJI(interfaceC650860PfwArr);
                }
                if (!interfaceC650860Pfw6.N1()) {
                    return null;
                }
                InterfaceC650860Pfw[] interfaceC650860PfwArr2 = new InterfaceC650860Pfw[2];
                if (interfaceC650860Pfw6.N1()) {
                    interfaceC650860Pfw2 = interfaceC650860Pfw6;
                } else {
                    interfaceC650860Pfw2 = null;
                }
                interfaceC650860PfwArr2[0] = interfaceC650860Pfw2;
                InterfaceC650860Pfw interfaceC650860PfwLJII3 = interfaceC650860Pfw6.LJII();
                if (interfaceC650860PfwLJII3 != null && interfaceC650860PfwLJII3.N1()) {
                    interfaceC650860Pfw5 = interfaceC650860PfwLJII3;
                }
                interfaceC650860PfwArr2[1] = interfaceC650860Pfw5;
                return C13LQ.LJIJI(interfaceC650860PfwArr2);
            }
            throw new C1954807lC();
        }
        if (c650820Pfs2.LIZIZ <= C650820Pfs.LIZLLL) {
            if (!interfaceC650860Pfw6.N1()) {
                return null;
            }
            InterfaceC650860Pfw[] interfaceC650860PfwArr3 = new InterfaceC650860Pfw[2];
            if (interfaceC650860Pfw6.N1()) {
                interfaceC650860Pfw = interfaceC650860Pfw6;
            } else {
                interfaceC650860Pfw = null;
            }
            interfaceC650860PfwArr3[0] = interfaceC650860Pfw;
            InterfaceC650860Pfw interfaceC650860PfwLJII4 = interfaceC650860Pfw6.LJII();
            if (interfaceC650860PfwLJII4 != null && interfaceC650860PfwLJII4.N1()) {
                interfaceC650860Pfw5 = interfaceC650860PfwLJII4;
            }
            interfaceC650860PfwArr3[1] = interfaceC650860Pfw5;
            return C13LQ.LJIJI(interfaceC650860PfwArr3);
        }
        InterfaceC650860Pfw interfaceC650860PfwLJII5 = interfaceC650860Pfw6.LJII();
        if (interfaceC650860PfwLJII5 == null || !interfaceC650860PfwLJII5.N1()) {
            return null;
        }
        InterfaceC650860Pfw[] interfaceC650860PfwArr4 = new InterfaceC650860Pfw[2];
        InterfaceC650860Pfw interfaceC650860PfwLJII6 = interfaceC650860Pfw6.LJII();
        if (interfaceC650860PfwLJII6 == null || !interfaceC650860PfwLJII6.N1()) {
            interfaceC650860PfwLJII6 = null;
        }
        interfaceC650860PfwArr4[0] = interfaceC650860PfwLJII6;
        if (interfaceC650860Pfw6.N1()) {
            interfaceC650860Pfw5 = interfaceC650860Pfw6;
        }
        interfaceC650860PfwArr4[1] = interfaceC650860Pfw5;
        return C13LQ.LJIJI(interfaceC650860PfwArr4);
    }
}
