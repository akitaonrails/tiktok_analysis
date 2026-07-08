package X;

import Y.AObserverS226S0100000_24;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ryA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608880ryA extends AbstractC1608840ry6<EnumC1608460rxU, C1257180iou> {
    public static final HashMap<Integer, C1610760s1C> LJFF = new HashMap<>();
    public InterfaceC1608890ryB LIZIZ;
    public C1257180iou LIZJ;
    public EnumC1256840ioM LIZLLL;
    public final EnumC1607270rvZ LIZ = EnumC1607270rvZ.LIVE;
    public final AObserverS226S0100000_24 LJ = new AObserverS226S0100000_24(this, 32);

    @Override // X.InterfaceC1608850ry7
    public final void LIZLLL(InterfaceC1606880ruw interfaceC1606880ruw) {
    }

    public final boolean LJFF() {
        C1256290inT c1256290inT;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        C1257180iou c1257180iou = this.LIZJ;
        return !((c1257180iou == null || (c1256290inT = c1257180iou.LJFF) == null || (mutableLiveData = c1256290inT.LIZ) == null || (value = mutableLiveData.getValue()) == null) ? false : value.booleanValue());
    }

    @Override // X.InterfaceC1608850ry7
    public final EnumC1607270rvZ LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1608850ry7
    public final void LIZJ(InterfaceC426680GoE interfaceC426680GoE, AvatarComponentView avatarComponentView) {
        EnumC1610470s0j enumC1610470s0j;
        C1256290inT c1256290inT;
        LifecycleOwner lifecycleOwner;
        MutableLiveData<Boolean> mutableLiveData;
        View viewLJ = AbstractC1608840ry6.LJ(this, EnumC1608710rxt.AVATAR, avatarComponentView);
        View viewLJ2 = AbstractC1608840ry6.LJ(this, EnumC1608710rxt.RING, avatarComponentView);
        if ((viewLJ2 instanceof C1610770s1D) && viewLJ != null && (interfaceC426680GoE instanceof C1257180iou)) {
            C1257180iou c1257180iou = (C1257180iou) interfaceC426680GoE;
            this.LIZJ = c1257180iou;
            int i = c1257180iou.LIZ;
            if (i != 1) {
                if (i == 2) {
                    HashMap<Integer, C1610760s1C> map = LJFF;
                    if (!map.containsKey(2)) {
                        C1610760s1C c1610760s1C = new C1610760s1C(EnumC1609040ryQ.SKYLIGHT);
                        c1610760s1C.LIZIZ();
                        map.put(2, c1610760s1C);
                    }
                    C1610760s1C c1610760s1C2 = map.get(2);
                    if (c1610760s1C2 != null) {
                        this.LIZIZ = new C1610750s1B(c1610760s1C2, viewLJ, viewLJ, (C1610770s1D) viewLJ2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1256860ioO.LIZ[c1257180iou.LIZJ.ordinal()] == 1) {
                enumC1610470s0j = EnumC1610470s0j.STRONG;
            } else {
                enumC1610470s0j = EnumC1610470s0j.NORMAL;
            }
            this.LIZIZ = new C1610740s1A(enumC1610470s0j, viewLJ, viewLJ, (C1610770s1D) viewLJ2);
            C1257180iou c1257180iou2 = this.LIZJ;
            if (c1257180iou2 == null || (c1256290inT = c1257180iou2.LJFF) == null || (lifecycleOwner = c1256290inT.LIZIZ) == null || (mutableLiveData = c1256290inT.LIZ) == null) {
                return;
            }
            mutableLiveData.observe(lifecycleOwner, this.LJ);
        }
    }

    @Override // X.InterfaceC1608850ry7
    public final void LIZIZ(InterfaceC1606880ruw interfaceC1606880ruw, EnumC1256840ioM enumC1256840ioM, InterfaceC713050Ry3 interfaceC713050Ry3) {
        InterfaceC662550Pyn interfaceC662550Pyn;
        InterfaceC1608890ryB interfaceC1608890ryB;
        InterfaceC662550Pyn interfaceC662550Pyn2;
        InterfaceC662550Pyn interfaceC662550Pyn3;
        InterfaceC1608890ryB interfaceC1608890ryB2;
        InterfaceC662550Pyn interfaceC662550Pyn4;
        this.LIZLLL = enumC1256840ioM;
        int i = C1256860ioO.LIZIZ[enumC1256840ioM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        InterfaceC1608890ryB interfaceC1608890ryB3 = this.LIZIZ;
                        if (interfaceC1608890ryB3 != null) {
                            interfaceC1608890ryB3.LJIIJ();
                        }
                        C1257180iou c1257180iou = this.LIZJ;
                        if (c1257180iou != null && (interfaceC662550Pyn4 = c1257180iou.LIZLLL) != null) {
                            interfaceC662550Pyn4.LJIIZILJ();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (LJFF() && (interfaceC1608890ryB2 = this.LIZIZ) != null) {
                    interfaceC1608890ryB2.xs();
                }
                C1257180iou c1257180iou2 = this.LIZJ;
                if (c1257180iou2 == null || (interfaceC662550Pyn3 = c1257180iou2.LIZLLL) == null) {
                    return;
                }
                interfaceC662550Pyn3.LIZ();
                return;
            }
            InterfaceC1608890ryB interfaceC1608890ryB4 = this.LIZIZ;
            if (interfaceC1608890ryB4 != null) {
                interfaceC1608890ryB4.Ir();
            }
            C1257180iou c1257180iou3 = this.LIZJ;
            if (c1257180iou3 == null || (interfaceC662550Pyn2 = c1257180iou3.LIZLLL) == null) {
                return;
            }
            interfaceC662550Pyn2.LJIIZILJ();
            return;
        }
        if (LJFF() && (interfaceC1608890ryB = this.LIZIZ) != null) {
            interfaceC1608890ryB.LIZ();
        }
        C1257180iou c1257180iou4 = this.LIZJ;
        if (c1257180iou4 == null || (interfaceC662550Pyn = c1257180iou4.LIZLLL) == null) {
            return;
        }
        interfaceC662550Pyn.LIZ();
    }
}
