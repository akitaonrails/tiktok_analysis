package X;

import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0end, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102630end {
    public final DataChannel LIZ;
    public final Set<EnumC1102640ene> LIZIZ = new LinkedHashSet();
    public final Set<EnumC1102640ene> LIZJ = new LinkedHashSet();
    public final Set<EnumC1102640ene> LIZLLL = new LinkedHashSet();
    public final Set<EnumC1102640ene> LJ = new LinkedHashSet();
    public final List<EnumC1102640ene> LJFF;
    public final List<EnumC1102640ene> LJI;
    public final List<EnumC1102640ene> LJII;
    public EnumC951410arj LJIIIIZZ;
    public EnumC1102650enf LJIIIZ;
    public final Map<EnumC1102750enp, EnumC1102640ene> LJIIJ;
    public final Map<EnumC1102640ene, EnumC1102750enp> LJIIJJI;

    public final void LIZIZ() {
        int iLJII;
        int size;
        Set setLLIIIZ = C13LP.LLIIIZ(C13LP.LJLLJ(C13LP.LJJL(this.LIZIZ, this.LJFF)));
        int i = C1102600ena.LIZ[this.LJIIIIZZ.ordinal()];
        if (i == 1) {
            iLJII = LJII();
            size = this.LJ.size();
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            iLJII = LJII() - this.LIZLLL.size();
            size = this.LJ.size();
        }
        int i2 = iLJII - size;
        if (this.LIZIZ.size() > i2 && setLLIIIZ.size() > 1) {
            for (Object obj : C13LP.LJLLJ(setLLIIIZ)) {
                if (this.LIZIZ.size() >= i2) {
                    this.LIZIZ.remove(obj);
                    this.LIZJ.add((EnumC1102640ene) obj);
                }
            }
            if (this.LIZJ.size() > 1) {
                this.LIZIZ.add(EnumC1102640ene.INTERACTION);
                return;
            }
            this.LIZIZ.addAll(this.LIZJ);
            this.LIZIZ.remove(EnumC1102640ene.INTERACTION);
            this.LIZJ.clear();
            return;
        }
        if (this.LIZIZ.size() < i2 || this.LIZJ.size() == 1) {
            Iterator it2 = C13LP.LLIIIZ(C13LP.LJLLL(this.LIZJ)).iterator();
            while (it2.hasNext() && this.LIZIZ.size() < i2) {
                this.LIZIZ.add((EnumC1102640ene) it2.next());
                it2.remove();
            }
            if (this.LIZJ.size() > 1) {
                this.LIZIZ.add(EnumC1102640ene.INTERACTION);
                return;
            }
            this.LIZIZ.addAll(this.LIZJ);
            this.LIZIZ.remove(EnumC1102640ene.INTERACTION);
            this.LIZJ.clear();
        }
    }

    public final void LIZJ() {
        if (this.LIZIZ.size() > LJII()) {
            for (Object obj : C13LP.LJLLJ(C13LP.LJLLJ(C13LP.LJJL(this.LIZIZ, this.LJII)))) {
                if (this.LIZIZ.size() > LJII()) {
                    this.LIZIZ.remove(obj);
                    this.LJ.add((EnumC1102640ene) obj);
                }
            }
            return;
        }
        if (this.LIZIZ.size() < LJII()) {
            Iterator it2 = C13LP.LLIIIZ(C13LP.LJLLL(this.LJ)).iterator();
            while (it2.hasNext() && this.LIZIZ.size() < LJII()) {
                this.LIZIZ.add((EnumC1102640ene) it2.next());
                it2.remove();
            }
        }
    }

    public final void LIZLLL() {
        if (this.LIZIZ.size() > LJII()) {
            for (Object obj : C13LP.LJLLJ(C13LP.LJLLJ(C13LP.LJJL(this.LIZIZ, this.LJI)))) {
                if (this.LIZIZ.size() > LJII()) {
                    this.LIZIZ.remove(obj);
                    this.LIZLLL.add((EnumC1102640ene) obj);
                }
            }
            return;
        }
        if (this.LIZIZ.size() < LJII()) {
            Iterator it2 = C13LP.LLIIIZ(C13LP.LJLLL(this.LIZLLL)).iterator();
            while (it2.hasNext() && this.LIZIZ.size() < LJII()) {
                this.LIZIZ.add((EnumC1102640ene) it2.next());
                it2.remove();
            }
        }
    }

    public static int LJII() {
        int iLJIIZILJ = ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(C1099910ejF.LJFF(EnumC1094650eal.PORTRAIT)))) / ((int) C497740JfY.LIZIZ(44.0f))) - 1;
        if (iLJIIZILJ > 6) {
            return 6;
        }
        return iLJIIZILJ;
    }

    public final void LJI() {
        EnumC1102650enf enumC1102650enf;
        float fLJJI = (C497740JfY.LJJI(C497740JfY.LJIIZILJ()) - C1099910ejF.LJFF(EnumC1094650eal.PORTRAIT)) - (this.LIZIZ.size() * 44.0f);
        int i = C1102600ena.LIZ[this.LJIIIIZZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            if (fLJJI >= 72.0f) {
                EnumC1102650enf enumC1102650enf2 = this.LJIIIZ;
                enumC1102650enf = EnumC1102650enf.LLILLJJLI;
                if (enumC1102650enf2 != enumC1102650enf) {
                    this.LIZ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.FALSE);
                }
            } else {
                EnumC1102650enf enumC1102650enf3 = this.LJIIIZ;
                enumC1102650enf = EnumC1102650enf.LL;
                if (enumC1102650enf3 != enumC1102650enf) {
                    this.LIZ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.TRUE);
                }
            }
        } else if (fLJJI >= 72.0f) {
            EnumC1102650enf enumC1102650enf4 = this.LJIIIZ;
            enumC1102650enf = EnumC1102650enf.LLILLJJLI;
            if (enumC1102650enf4 != enumC1102650enf) {
                this.LIZ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.FALSE);
            }
        } else {
            EnumC1102650enf enumC1102650enf5 = this.LJIIIZ;
            enumC1102650enf = EnumC1102650enf.LL;
            if (enumC1102650enf5 != enumC1102650enf) {
                this.LIZ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.TRUE);
            }
        }
        this.LJIIIZ = enumC1102650enf;
    }

    public C1102630end(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        EnumC1102640ene enumC1102640ene = EnumC1102640ene.CUSTOM_POLL;
        EnumC1102640ene enumC1102640ene2 = EnumC1102640ene.MULTI_GUEST;
        this.LJFF = C1697810uHb.LJIIJJI(enumC1102640ene, enumC1102640ene2);
        EnumC1102640ene enumC1102640ene3 = EnumC1102640ene.MULTI_GUEST_MIC;
        EnumC1102640ene enumC1102640ene4 = EnumC1102640ene.MULTI_GUEST_VIDEO;
        this.LJI = C1697810uHb.LJIIJJI(enumC1102640ene3, enumC1102640ene4);
        EnumC1102640ene enumC1102640ene5 = EnumC1102640ene.FAST_GIFT;
        EnumC1102640ene enumC1102640ene6 = EnumC1102640ene.DUMMY_FAST_GIFT;
        this.LJII = C1697810uHb.LJIIJJI(enumC1102640ene5, enumC1102640ene6);
        this.LJIIIIZZ = EnumC951410arj.NORMAL;
        this.LJIIIZ = EnumC1102650enf.LLILLJJLI;
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.CUSTOM_POLL;
        EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.MULTIGUEST;
        EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.MULTI_GUEST_MIC;
        EnumC1102750enp enumC1102750enp4 = EnumC1102750enp.MULTI_GUEST_VIDEO;
        EnumC1102750enp enumC1102750enp5 = EnumC1102750enp.MULTI_GUEST_MANAGE;
        EnumC1102640ene enumC1102640ene7 = EnumC1102640ene.MULTI_GUEST_MANAGE;
        EnumC1102750enp enumC1102750enp6 = EnumC1102750enp.AUDIENCE_SLOT;
        EnumC1102640ene enumC1102640ene8 = EnumC1102640ene.AUDIENCE_SLOT;
        EnumC1102750enp enumC1102750enp7 = EnumC1102750enp.FAST_GIFT;
        EnumC1102750enp enumC1102750enp8 = EnumC1102750enp.GIFT;
        EnumC1102640ene enumC1102640ene9 = EnumC1102640ene.GIFT;
        EnumC1102750enp enumC1102750enp9 = EnumC1102750enp.DUMMY_FAST_GIFT;
        EnumC1102750enp enumC1102750enp10 = EnumC1102750enp.DUMMY_GIFT;
        EnumC1102640ene enumC1102640ene10 = EnumC1102640ene.DUMMY_GIFT;
        EnumC1102750enp enumC1102750enp11 = EnumC1102750enp.SHARE;
        EnumC1102640ene enumC1102640ene11 = EnumC1102640ene.SHARE;
        EnumC1102750enp enumC1102750enp12 = EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES;
        EnumC1102640ene enumC1102640ene12 = EnumC1102640ene.INTERACTION;
        this.LJIIJ = C2097608Jq.LJIIIIZZ(new Pair(enumC1102750enp, enumC1102640ene), new Pair(enumC1102750enp2, enumC1102640ene2), new Pair(enumC1102750enp3, enumC1102640ene3), new Pair(enumC1102750enp4, enumC1102640ene4), new Pair(enumC1102750enp5, enumC1102640ene7), new Pair(enumC1102750enp6, enumC1102640ene8), new Pair(enumC1102750enp7, enumC1102640ene5), new Pair(enumC1102750enp8, enumC1102640ene9), new Pair(enumC1102750enp9, enumC1102640ene6), new Pair(enumC1102750enp10, enumC1102640ene10), new Pair(enumC1102750enp11, enumC1102640ene11), new Pair(enumC1102750enp12, enumC1102640ene12));
        this.LJIIJJI = C2097608Jq.LJIIIIZZ(new Pair(enumC1102640ene, enumC1102750enp), new Pair(enumC1102640ene2, enumC1102750enp2), new Pair(enumC1102640ene3, enumC1102750enp3), new Pair(enumC1102640ene4, enumC1102750enp4), new Pair(enumC1102640ene7, enumC1102750enp5), new Pair(enumC1102640ene8, enumC1102750enp6), new Pair(enumC1102640ene5, enumC1102750enp7), new Pair(enumC1102640ene9, enumC1102750enp8), new Pair(enumC1102640ene6, enumC1102750enp9), new Pair(enumC1102640ene10, enumC1102750enp10), new Pair(enumC1102640ene11, enumC1102750enp11), new Pair(enumC1102640ene12, enumC1102750enp12));
    }

    public final void LIZ(EnumC1102640ene enumC1102640ene) {
        if (C13LP.LLIIJLIL(this.LIZIZ, this.LIZJ).contains(enumC1102640ene)) {
            return;
        }
        this.LIZIZ.add(enumC1102640ene);
        int i = C1102600ena.LIZ[this.LJIIIIZZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJ(EnumC1102610enb.LL);
                return;
            }
            throw new C1954807lC();
        }
        LJFF(EnumC1102610enb.LL);
    }

    public final void LJ(EnumC1102610enb enumC1102610enb) {
        int iOrdinal = enumC1102610enb.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                LIZIZ();
                LIZJ();
                LIZLLL();
            } else {
                throw new C1954807lC();
            }
        } else {
            LIZIZ();
            LIZLLL();
            LIZJ();
        }
        LJI();
        if (this.LIZJ.isEmpty()) {
            EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.hideBySwitchManager(this.LIZ);
            this.LIZ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
        } else {
            Iterator<EnumC1102640ene> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                EnumC1102750enp enumC1102750enp = this.LJIIJJI.get(it2.next());
                if (enumC1102750enp != null) {
                    enumC1102750enp.hideBySwitchManager(this.LIZ);
                }
            }
            EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.showBySwitchManager(this.LIZ);
            this.LIZ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
        }
        Iterator<EnumC1102640ene> it3 = this.LIZLLL.iterator();
        while (it3.hasNext()) {
            EnumC1102750enp enumC1102750enp2 = this.LJIIJJI.get(it3.next());
            if (enumC1102750enp2 != null) {
                enumC1102750enp2.hideBySwitchManager(this.LIZ);
            }
        }
        Iterator<EnumC1102640ene> it4 = this.LJ.iterator();
        while (it4.hasNext()) {
            EnumC1102750enp enumC1102750enp3 = this.LJIIJJI.get(it4.next());
            if (enumC1102750enp3 != null) {
                enumC1102750enp3.hideBySwitchManager(this.LIZ);
            }
        }
        Iterator<EnumC1102640ene> it5 = this.LIZIZ.iterator();
        while (it5.hasNext()) {
            EnumC1102750enp enumC1102750enp4 = this.LJIIJJI.get(it5.next());
            if (enumC1102750enp4 != null) {
                enumC1102750enp4.showBySwitchManager(this.LIZ);
            }
        }
    }

    public final void LJFF(EnumC1102610enb enumC1102610enb) {
        int iOrdinal = enumC1102610enb.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            LIZIZ();
            LIZJ();
            LJI();
            if (this.LIZJ.isEmpty()) {
                EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.hideBySwitchManager(this.LIZ);
                this.LIZ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
            } else {
                Iterator<EnumC1102640ene> it2 = this.LIZJ.iterator();
                while (it2.hasNext()) {
                    EnumC1102750enp enumC1102750enp = this.LJIIJJI.get(it2.next());
                    if (enumC1102750enp != null) {
                        enumC1102750enp.hideBySwitchManager(this.LIZ);
                    }
                }
                EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.showBySwitchManager(this.LIZ);
                this.LIZ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
            }
            Iterator<EnumC1102640ene> it3 = this.LJ.iterator();
            while (it3.hasNext()) {
                EnumC1102750enp enumC1102750enp2 = this.LJIIJJI.get(it3.next());
                if (enumC1102750enp2 != null) {
                    enumC1102750enp2.hideBySwitchManager(this.LIZ);
                }
            }
            Iterator<EnumC1102640ene> it4 = this.LIZIZ.iterator();
            while (it4.hasNext()) {
                EnumC1102750enp enumC1102750enp3 = this.LJIIJJI.get(it4.next());
                if (enumC1102750enp3 != null) {
                    enumC1102750enp3.showBySwitchManager(this.LIZ);
                }
            }
            return;
        }
        throw new C1954807lC();
    }

    public final void LJIIIIZZ(EnumC1102640ene enumC1102640ene) {
        if (!C13LP.LLIIJLIL(this.LIZIZ, this.LIZJ).contains(enumC1102640ene)) {
            return;
        }
        int i = C1102600ena.LIZ[this.LJIIIIZZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LIZJ.contains(enumC1102640ene)) {
                    this.LIZJ.remove(enumC1102640ene);
                } else {
                    this.LIZIZ.remove(enumC1102640ene);
                }
                LJ(EnumC1102610enb.LLILLJJLI);
                return;
            }
            throw new C1954807lC();
        }
        if (this.LIZJ.contains(enumC1102640ene)) {
            this.LIZJ.remove(enumC1102640ene);
        } else {
            this.LIZIZ.remove(enumC1102640ene);
        }
        LJFF(EnumC1102610enb.LLILLJJLI);
    }
}
