package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453350Hq9 extends AbstractC21342018fa {
    public List<? extends InterfaceC453420HqG> LIZ;
    public List<? extends InterfaceC453420HqG> LIZIZ;
    public final /* synthetic */ C453330Hq7 LIZJ;

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C453350Hq9(C453330Hq7 c453330Hq7) {
        this.LIZJ = c453330Hq7;
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = c13bv;
        this.LIZIZ = c13bv;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        Long l;
        C453360HqA c453360HqA;
        StickerItem stickerItem;
        StickerBase stickerBase;
        C453360HqA c453360HqA2;
        StickerItem stickerItem2;
        StickerBase stickerBase2;
        C453330Hq7 c453330Hq7 = this.LIZJ;
        InterfaceC453420HqG interfaceC453420HqG = (InterfaceC453420HqG) ListProtector.get(this.LIZ, i);
        InterfaceC453420HqG interfaceC453420HqG2 = (InterfaceC453420HqG) ListProtector.get(this.LIZIZ, i2);
        c453330Hq7.getClass();
        Long l2 = null;
        if ((interfaceC453420HqG instanceof C453360HqA) && (c453360HqA2 = (C453360HqA) interfaceC453420HqG) != null && (stickerItem2 = c453360HqA2.LIZ) != null && (stickerBase2 = stickerItem2.stickerBase) != null) {
            l = stickerBase2.id;
        } else {
            l = null;
        }
        if ((interfaceC453420HqG2 instanceof C453360HqA) && (c453360HqA = (C453360HqA) interfaceC453420HqG2) != null && (stickerItem = c453360HqA.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null) {
            l2 = stickerBase.id;
        }
        if (l != null && l2 != null) {
            return Intrinsics.LJFF(l, l2);
        }
        return Intrinsics.LJFF(interfaceC453420HqG, interfaceC453420HqG2);
    }
}
