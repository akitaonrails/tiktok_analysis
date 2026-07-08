package X;

import Y.AObjectS360S0100000_17;
import Y.ARunnableS25S0400000_17;
import Y.AfS186S0100000_17;
import android.os.Message;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftStickerComposerPreloadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0fl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139460fl2 extends AbstractC1139430fkz {
    public final C1136550fgL LLJ = new AbstractC1139490fl5<C1136560fgM>() { // from class: X.0fgL
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // X.AbstractC1139490fl5
        public final boolean LJI(C1136560fgM c1136560fgM) {
            C1136560fgM c1136560fgM2 = c1136560fgM;
            int i = c1136560fgM2.LJI;
            if (i < 0) {
                C1133910fc5.LJ("GiftBucketQueueSticker", "offer, gift == null || gift.diamondCount < 0");
                return false;
            }
            LinkedList linkedList = (LinkedList) this.LIZJ.get(Integer.valueOf(i));
            if (linkedList == null) {
                TreeMap<Integer, LinkedList<DATA>> treeMap = this.LIZJ;
                Integer numValueOf = Integer.valueOf(c1136560fgM2.LJI);
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(c1136560fgM2);
                treeMap.put(numValueOf, (LinkedList<DATA>) linkedList2);
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("incoming queue message; role: ");
            sbLIZ.append(c1136560fgM2.LJJIIJZLJL);
            sbLIZ.append("; price: ");
            sbLIZ.append(c1136560fgM2.LJI);
            C1133910fc5.LJ("GiftBucketQueueSticker", C2188811AlT.LIZIZ(sbLIZ));
            if (LiveGiftCrossScreenSetting.INSTANCE.shouldInsertByPriority()) {
                ListIterator listIterator = linkedList.listIterator();
                while (listIterator.hasNext()) {
                    C1136560fgM c1136560fgM3 = (C1136560fgM) listIterator.next();
                    if (c1136560fgM2.LJJIIJZLJL != 0) {
                        if (c1136560fgM3.LJJIIJZLJL == 0) {
                            listIterator.previous();
                            listIterator.add(c1136560fgM2);
                            return true;
                        }
                    } else if (c1136560fgM3.LJJIIJZLJL != 0) {
                        continue;
                    } else {
                        LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM2.LJJII;
                        if (stickerSDKExtra == null || !stickerSDKExtra.enableReplay) {
                            break;
                        }
                        if (c1136560fgM2.LJFF == c1136560fgM3.LJFF) {
                            listIterator.previous();
                            listIterator.add(c1136560fgM2);
                            return true;
                        }
                    }
                }
                linkedList.add(c1136560fgM2);
                return true;
            }
            if (c1136560fgM2.LJIIIIZZ) {
                linkedList.add(0, c1136560fgM2);
                return true;
            }
            linkedList.add(c1136560fgM2);
            return true;
        }
    };
    public C1136560fgM LLJI;
    public final AObjectS360S0100000_17 LLJIJIL;
    public final C1139820flc LLJILJIL;

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
        LJIJI();
    }

    public final void LJIJI() {
        synchronized (this.LLILZ) {
            try {
                if (this.LLILLL || LJFF() || LIZJ()) {
                    return;
                }
                C1136560fgM c1136560fgMLJII = LJII(null);
                if (c1136560fgMLJII == null) {
                    return;
                }
                this.LL.removeCallbacksAndMessages(null);
                this.LLILZLL = null;
                this.LLILZIL = c1136560fgMLJII;
                c1136560fgMLJII.LIZJ().LJIIJJI();
                C1136380fg4 c1136380fg4 = C1136380fg4.LIZ;
                DataChannel dataChannel = this.LLILLJJLI;
                c1136380fg4.getClass();
                if (C1136380fg4.LIZLLL(c1136560fgMLJII, dataChannel)) {
                    LJIIL(c1136560fgMLJII);
                    return;
                }
                synchronized (this.LLILZ) {
                    try {
                        if (this.LLILZIL == c1136560fgMLJII) {
                            this.LLILZIL = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                LJIIJ(202);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0fgL] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0flc] */
    public C1139460fl2() {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0flX
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("GiftStickerMessageQueue@d013.<init>$1");
                String strLIZLLL = C1136390fg5.LIZLLL(C497740JfY.LJII());
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                c09aj.onNext(strLIZLLL);
                C1C7U.LIZIZ("GiftStickerMessageQueue@d013.<init>$1");
            }
        }).LJIILIIL(new C0UO0()).LJJLJLI(new AfS186S0100000_17(this, 94));
        this.LLJIJIL = new AObjectS360S0100000_17(this, 108);
        this.LLJILJIL = new InterfaceC1141260fnw() { // from class: X.0flc
            @Override // X.InterfaceC1141260fnw
            public final boolean LIZJ() {
                return C1138340fjE.LIZJ(this.LIZ.LLILZIL, LIZIZ(null));
            }

            @Override // X.InterfaceC1141260fnw
            public final boolean LIZLLL() {
                return C1138340fjE.LIZIZ(this.LIZ.LLILZIL, this.LIZ.LLJI);
            }

            @Override // X.InterfaceC1141260fnw
            public final void LJ() {
                C1136560fgM c1136560fgMLIZIZ = LIZIZ(null);
                if (c1136560fgMLIZIZ == null) {
                    return;
                }
                c1136560fgMLIZIZ.LJFF(true);
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
                C1139460fl2 c1139460fl2 = this.LIZ;
                if (z) {
                    c1136560fgM = c1139460fl2.LLILZIL;
                } else {
                    c1136560fgM = null;
                }
                c1139460fl2.LLJI = c1136560fgM;
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

    public static final void LJIJ(String str) {
        C1133910fc5.LIZLLL("gift_sticker_ttlive_gift_render", str);
    }

    public final void LJIIZILJ(C1136560fgM c1136560fgM) {
        int i;
        if (this.LLILLL || c1136560fgM == null) {
            return;
        }
        c1136560fgM.LIZJ().LJIIIIZZ();
        LJFF(c1136560fgM);
        C1136550fgL c1136550fgL = this.LLJ;
        synchronized (c1136550fgL) {
            if (!c1136550fgL.LIZJ()) {
                if (c1136550fgL.LIZJ.isEmpty()) {
                    c1136550fgL.LIZ.set(0L);
                } else {
                    Iterator it2 = c1136550fgL.LIZJ.entrySet().iterator();
                    int size = 0;
                    while (it2.hasNext()) {
                        LinkedList linkedList = (LinkedList) ((Map.Entry) it2.next()).getValue();
                        if (!linkedList.isEmpty()) {
                            int iIndexOf = linkedList.indexOf(c1136560fgM);
                            if (iIndexOf < 0) {
                                size += linkedList.size();
                            } else {
                                i = size + iIndexOf;
                                break;
                            }
                        } else {
                            it2.remove();
                        }
                    }
                }
            }
            i = -1;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        C1136560fgM c1136560fgM2 = this.LLILZIL;
        if (C1136510fgH.LIZ() && i < GiftStickerComposerPreloadSetting.INSTANCE.getPreloadCount()) {
            C1136510fgH.LIZIZ(dataChannel, c1136560fgM2, String.valueOf(i), c1136560fgM, null);
        }
        LJIJI();
    }

    @Override // X.AbstractC1139430fkz
    public final void LJI(String str, Throwable th) {
        C1133910fc5.LIZJ("gift_sticker_ttlive_gift_render", str, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.bytedance.android.livesdkapi.depend.model.LiveEffect] */
    @Override // X.AbstractC1139430fkz
    public final void LJIIIZ(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        long j;
        Object obj;
        C259800zU c259800zU = new C259800zU();
        if (C1136510fgH.LIZ()) {
            c259800zU.element = C1136390fg5.LJII(c1136560fgM, this.LLILLJJLI);
            DataChannel dataChannel = this.LLILLJJLI;
            C1136550fgL c1136550fgL = this.LLJ;
            C1136560fgM c1136560fgM2 = this.LLILZIL;
            LiveEffect liveEffect = (LiveEffect) c259800zU.element;
            if (C1136510fgH.LIZ()) {
                C1136510fgH.LIZIZ(dataChannel, null, "will_play", c1136560fgM, liveEffect);
                int preloadCount = GiftStickerComposerPreloadSetting.INSTANCE.getPreloadCount() - 1;
                for (int i = 0; i < preloadCount; i++) {
                    long j2 = i;
                    if (j2 >= c1136550fgL.LJIIJJI()) {
                        break;
                    }
                    synchronized (c1136550fgL) {
                        if (i >= 0) {
                            if (!c1136550fgL.LIZJ()) {
                                if (c1136550fgL.LIZJ.isEmpty()) {
                                    c1136550fgL.LIZ.set(0L);
                                } else if (j2 < c1136550fgL.LJIIJJI()) {
                                    Iterator it2 = c1136550fgL.LIZJ.entrySet().iterator();
                                    int size = 0;
                                    while (it2.hasNext()) {
                                        LinkedList linkedList = (LinkedList) ((Map.Entry) it2.next()).getValue();
                                        int i2 = i - size;
                                        if (!linkedList.isEmpty()) {
                                            if (i2 < linkedList.size()) {
                                                obj = linkedList.get(i2);
                                                break;
                                            }
                                            size += linkedList.size();
                                        } else {
                                            it2.remove();
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                    }
                    C1136560fgM c1136560fgM3 = (C1136560fgM) obj;
                    if (c1136560fgM3 == null) {
                        break;
                    }
                    C1136510fgH.LIZIZ(dataChannel, c1136560fgM2, String.valueOf(i), c1136560fgM3, null);
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
        LJIJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.postDelayed(new ARunnableS25S0400000_17(assetsModel, c1136560fgM, this, c259800zU, 4), j);
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        LJIILIIL(c1136560fgM, assetsModel);
    }
}
