package X;

import Y.ARunnableS50S0300000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0fl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139530fl9 extends AbstractC1139430fkz {
    public final C1136360fg2 LLJ = new AbstractC1139490fl5<C1136560fgM>() { // from class: X.0fg2
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // X.AbstractC1139490fl5
        public final boolean LJI(C1136560fgM c1136560fgM) {
            C1136560fgM c1136560fgM2 = c1136560fgM;
            int i = c1136560fgM2.LJI;
            if (i < 0) {
                C1133910fc5.LJ("GiftBucketQueueMusic", "offer, gift == null || gift.diamondCount < 0");
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
            if (LiveGiftCrossScreenSetting.INSTANCE.shouldInsertByPriority()) {
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
                LJIIL(c1136560fgMLJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
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
        this.LL.postDelayed(new ARunnableS50S0300000_17(this, c1136560fgM, assetsModel, 9), 1000L);
    }

    @Override // X.AbstractC1139430fkz
    public final void LJIIJJI(C1136560fgM c1136560fgM, AssetsModel assetsModel) {
        LJIILIIL(c1136560fgM, assetsModel);
    }
}
