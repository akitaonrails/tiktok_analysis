package X;

import Y.ARunnableS50S0300000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0flE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139580flE extends AbstractC1139430fkz {
    public final List<C1136560fgM> LLJ = new LinkedList();

    @Override // X.AbstractC1139430fkz
    public final String LIZJ() {
        return "gift_music__ttlive_gift_render";
    }

    @Override // X.AbstractC1139430fkz
    public final void LJ() {
    }

    @Override // X.AbstractC1139430fkz
    public final void LIZLLL() {
        C1136560fgM c1136560fgM = this.LLILZIL;
        if (c1136560fgM != null) {
            c1136560fgM.LIZJ().onPlayEnd();
        }
        LJIILJJIL();
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJJIL("");
        LJIIZILJ();
    }

    public final void LJIIZILJ() {
        if (this.LLILLL || LJFF() || this.LLJ.isEmpty()) {
            return;
        }
        C1136560fgM c1136560fgM = (C1136560fgM) ListProtector.remove(this.LLJ, 0);
        c1136560fgM.LIZJ().LJIIJJI();
        LJIILJJIL();
        this.LLILZIL = c1136560fgM;
        LJIIL(c1136560fgM);
    }

    @Override // X.AbstractC1139430fkz
    public final InterfaceC1141260fnw LIZIZ() {
        return C1140650fmx.LIZ;
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIIZ(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlayDelay: ");
        sbLIZ.append(1000L);
        C20441214yg.LJIIIZ("gift_music__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.postDelayed(new ARunnableS50S0300000_17(this, c1136560fgM, assetsModel, 27), 1000L);
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        LJIILIIL(c1136560fgM, assetsModel);
    }
}
