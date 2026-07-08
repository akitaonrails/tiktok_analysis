package X;

import Y.AObjectS360S0100000_17;
import Y.ARunnableS25S0400000_17;
import Y.AfS186S0100000_17;
import android.os.Message;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftStickerComposerPreloadSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0fl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139470fl3 extends AbstractC1139430fkz {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final List<C1136560fgM> LLJ = new LinkedList();
    public C1136560fgM LLJI;
    public final AObjectS360S0100000_17 LLJIJIL;
    public final C1139860flg LLJILJIL;

    @Override // X.AbstractC1139430fkz
    public final String LIZJ() {
        return "gift_sticker_ttlive_gift_render";
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
        LJIJ();
    }

    public final void LJIJ() {
        if (this.LLILLL || LJFF() || this.LLJ.isEmpty()) {
            return;
        }
        C1136560fgM c1136560fgM = (C1136560fgM) ListProtector.remove(this.LLJ, 0);
        c1136560fgM.LIZJ().LJIIJJI();
        C1136380fg4 c1136380fg4 = C1136380fg4.LIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        c1136380fg4.getClass();
        if (!C1136380fg4.LIZLLL(c1136560fgM, dataChannel)) {
            LJIIJ(202);
            return;
        }
        LJIILJJIL();
        this.LLILZIL = c1136560fgM;
        LJIIL(c1136560fgM);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0flg] */
    public C1139470fl3() {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0flZ
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("StickerMessageQueueRender@15fb.<init>$1");
                String strLIZLLL = C1136390fg5.LIZLLL(C497740JfY.LJII());
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                c09aj.onNext(strLIZLLL);
                C1C7U.LIZIZ("StickerMessageQueueRender@15fb.<init>$1");
            }
        }).LJIILIIL(new C0UO0()).LJJLJLI(new AfS186S0100000_17(this, 64));
        this.LLJIJIL = new AObjectS360S0100000_17(this, 81);
        this.LLJILJIL = new InterfaceC1141260fnw() { // from class: X.0flg
            @Override // X.InterfaceC1141260fnw
            public final boolean LIZJ() {
                return C1138340fjE.LIZJ(this.LIZ.LLILZIL, (C1136560fgM) C13LP.LJJJLZIJ(0, this.LIZ.LLJ));
            }

            @Override // X.InterfaceC1141260fnw
            public final boolean LIZLLL() {
                return C1138340fjE.LIZIZ(this.LIZ.LLILZIL, this.LIZ.LLJI);
            }

            @Override // X.InterfaceC1141260fnw
            public final void LJ() {
                C1136560fgM c1136560fgM = (C1136560fgM) C13LP.LJJJLZIJ(0, this.LIZ.LLJ);
                if (c1136560fgM == null) {
                    return;
                }
                c1136560fgM.LJFF(true);
            }

            @Override // X.InterfaceC1141260fnw
            public final void LIZ(boolean z) {
                InterfaceC1139780flY interfaceC1139780flY;
                C1136560fgM c1136560fgM = this.LIZ.LLILZIL;
                if (c1136560fgM != null && (interfaceC1139780flY = c1136560fgM.LJJIFFI) != null) {
                    interfaceC1139780flY.LJIIZILJ(z);
                }
            }

            @Override // X.InterfaceC1141260fnw
            public final void LIZIZ(boolean z) {
                C1136560fgM c1136560fgM;
                C1139470fl3 c1139470fl3 = this.LIZ;
                if (z) {
                    c1136560fgM = c1139470fl3.LLILZIL;
                } else {
                    c1136560fgM = null;
                }
                c1139470fl3.LLJI = c1136560fgM;
            }

            @Override // X.InterfaceC1141260fnw
            public final boolean LJFF(Message message) {
                return C1138340fjE.LIZ(this.LIZ.LLILZIL, message);
            }
        };
    }

    @Override // X.AbstractC1139430fkz
    public final InterfaceC1141260fnw LIZIZ() {
        return this.LLJILJIL;
    }

    public final void LJIIZILJ(C1136560fgM c1136560fgM) {
        if (this.LLILLL || c1136560fgM == null) {
            return;
        }
        c1136560fgM.LIZJ().LJIIIIZZ();
        int iLIZ = C1136580fgO.LIZ(this.LLJ, c1136560fgM);
        DataChannel dataChannel = this.LLILLJJLI;
        List<C1136560fgM> list = this.LLJ;
        C1136560fgM c1136560fgM2 = this.LLILZIL;
        if (C1136510fgH.LIZ() && iLIZ < GiftStickerComposerPreloadSetting.INSTANCE.getPreloadCount()) {
            String strValueOf = String.valueOf(iLIZ);
            C1136560fgM c1136560fgM3 = (C1136560fgM) C13LP.LJJJLZIJ(iLIZ, list);
            if (c1136560fgM3 != null) {
                C1136510fgH.LIZIZ(dataChannel, c1136560fgM2, strValueOf, c1136560fgM3, null);
            }
        }
        LJIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.bytedance.android.livesdkapi.depend.model.LiveEffect] */
    @Override // X.AbstractC1139430fkz
    public final void LJIIIZ(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        long j;
        C259800zU c259800zU = new C259800zU();
        if (C1136510fgH.LIZ()) {
            c259800zU.element = C1136390fg5.LJII(c1136560fgM, this.LLILLJJLI);
            DataChannel dataChannel = this.LLILLJJLI;
            List<C1136560fgM> list = this.LLJ;
            C1136560fgM c1136560fgM2 = this.LLILZIL;
            LiveEffect liveEffect = (LiveEffect) c259800zU.element;
            if (C1136510fgH.LIZ()) {
                C1136510fgH.LIZIZ(dataChannel, null, "will_play", c1136560fgM, liveEffect);
                int preloadCount = GiftStickerComposerPreloadSetting.INSTANCE.getPreloadCount() - 1;
                for (int i = 0; i < preloadCount; i++) {
                    LinkedList linkedList = (LinkedList) list;
                    if (i >= linkedList.size()) {
                        break;
                    }
                    C1136510fgH.LIZIZ(dataChannel, c1136560fgM2, String.valueOf(i), (C1136560fgM) ListProtector.get(linkedList, i), null);
                }
            }
        }
        if (c1136560fgM.LJJIIJZLJL != 0) {
            j = 100;
        } else {
            j = 1000;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlayDelay: ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.postDelayed(new ARunnableS25S0400000_17(assetsModel, c1136560fgM, this, c259800zU, 2), j);
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        LJIILIIL(c1136560fgM, assetsModel);
    }
}
