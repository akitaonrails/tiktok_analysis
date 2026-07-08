package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Dpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351140Dpg implements InterfaceC351730Dqd {
    public final C0E48 LIZ;

    public C351140Dpg(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    @Override // X.InterfaceC351730Dqd
    public final void LIZ(C350800Dp8 c350800Dp8) {
        this.LIZ.LLFII().LIZ(c350800Dp8);
    }

    @Override // X.InterfaceC351730Dqd
    public final C443120HZe LJFF(C350780Dp6 c350780Dp6) {
        return this.LIZ.LLFII().LJIJJLI(c350780Dp6, EnumC356070Dxd.NONE);
    }

    @Override // X.InterfaceC351730Dqd
    public final Pair<NLETrack, NLETrackSlot> LIZIZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        return this.LIZ.LLFII().LIZIZ(nLETrackSlot, EnumC356070Dxd.NONE);
    }

    @Override // X.InterfaceC351730Dqd
    public final void LIZJ(C350790Dp7 c350790Dp7, EnumC356070Dxd enumC356070Dxd) {
        this.LIZ.LLFII().LIZJ(c350790Dp7, EnumC356070Dxd.NONE);
    }

    @Override // X.InterfaceC351730Dqd
    public final void LJ(C350650Dot c350650Dot, EnumC356070Dxd enumC356070Dxd) {
        this.LIZ.LLFII().LJ(c350650Dot, EnumC356070Dxd.NONE);
    }

    @Override // X.InterfaceC351730Dqd
    public final NLETrackSlot LIZLLL(C350780Dp6 c350780Dp6, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        return this.LIZ.LLFII().LIZLLL(c350780Dp6, EnumC356070Dxd.NONE, nLEModel);
    }
}
