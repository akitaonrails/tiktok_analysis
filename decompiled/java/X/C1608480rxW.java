package X;

import com.ss.android.ugc.aweme.live.avatar.AvatarLiveDataAdapter;

/* JADX INFO: renamed from: X.0rxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608480rxW extends AbstractC1608810ry3<EnumC1608460rxU, C1257180iou> {
    @Override // X.AbstractC1608810ry3, X.InterfaceC1608800ry2
    public final AbstractC1608840ry6<EnumC1608460rxU, C1257180iou> LIZLLL() {
        return new C1608880ryA();
    }

    @Override // X.InterfaceC1608800ry2
    public final EnumC1607270rvZ LIZ() {
        return EnumC1607270rvZ.LIVE;
    }

    @Override // X.InterfaceC1608800ry2
    public final InterfaceC1608870ry9 LIZIZ(InterfaceC426680GoE interfaceC426680GoE) {
        return new AvatarLiveDataAdapter((C1257180iou) interfaceC426680GoE);
    }

    @Override // X.InterfaceC1608800ry2
    public final AbstractC1608790ry1 LIZJ(InterfaceC426680GoE interfaceC426680GoE) {
        return new C1608450rxT((C1257180iou) interfaceC426680GoE);
    }

    @Override // X.AbstractC1608810ry3
    public final InterfaceC1606880ruw LJ(InterfaceC1606880ruw interfaceC1606880ruw) {
        if (!(interfaceC1606880ruw instanceof EnumC1608460rxU)) {
            return null;
        }
        return interfaceC1606880ruw;
    }
}
