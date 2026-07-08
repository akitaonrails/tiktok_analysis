package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ff9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135810ff9 {
    public final GiftMessage LIZ;
    public InterfaceC1136020ffU LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public EnumC743790TFp LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public HashSet<C1135810ff9> LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final String LJIIZILJ;
    public C0TF7 LJIJ;
    public final boolean LJIJI;
    public final List<Integer> LJIJJ;
    public final GiftTrayInfo LJIJJLI;
    public final List<GiftMessage.SponsorshipInfo> LJIL;
    public int LJJ;
    public boolean LJJI;
    public HashSet<C1136900fgu> LJJIFFI;
    public Queue<Pair<Integer, Boolean>> LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public long LJJIJLIJ;
    public long LJJIL;
    public int LJJIZ;
    public long LJJJ;
    public int LJJJI;
    public String LJJJIL;
    public final ConcurrentHashSet LJJJJ;
    public boolean LJJJJI;
    public final C1135850ffD LJJJJIZL;
    public int LJJJJJ;
    public String LJJJJJL;
    public CharSequence LJJJJL;
    public ImageModel LJJJJLI;
    public CharSequence LJJJJLL;
    public long LJJJJZ;
    public User LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public final int LJJJLZIJ;
    public final GiftMonitorInfo LJJJZ;
    public final User LJJL;
    public long LJJLI;
    public long LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public boolean LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public long LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public C1135280feI LJJLIIJ;
    public ConcurrentHashMap<String, String> LJJLIL;
    public boolean LJJLJ;
    public boolean LJJLJLI;
    public boolean LJJLL;
    public int LJJZ;
    public long LJJZZI;
    public long LJJZZIII;
    public long LJL;
    public InterfaceC1139410fkx LJLI;

    public C1135810ff9() {
        this(null);
    }

    public final int LIZJ() {
        int i;
        if (this.LJJJLIIL) {
            i = this.LJIIJ;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCurProcessShouldShow::other-seeing mCurrentProcess == ");
            sbLIZ.append(this.LJIIJ);
            sbLIZ.append(", interruptedProcess == ");
            sbLIZ.append(this.LJIIJJI);
            C20441214yg.LIZIZ("LiveGiftGeneralTrayMessage", C2188811AlT.LIZIZ(sbLIZ));
            i = this.LJIIJ - this.LJIIJJI;
        }
        if (C2640010k.LIZIZ()) {
            i = this.LJIIJ;
        }
        if (i != 0) {
            return i;
        }
        this.LJIIJ++;
        return 1;
    }

    public final long LIZLLL() {
        Long lValueOf;
        User user;
        User user2 = this.LJJL;
        if (user2 != null) {
            Long lValueOf2 = Long.valueOf(user2.getId());
            if (lValueOf2.longValue() > 0) {
                return lValueOf2.longValue();
            }
        }
        GiftMessage giftMessage = this.LIZ;
        if (giftMessage != null && (user = giftMessage.toUser) != null) {
            return user.getId();
        }
        GiftMonitorInfo giftMonitorInfo = this.LJJJZ;
        if (giftMonitorInfo == null || (lValueOf = Long.valueOf(giftMonitorInfo.to_user_id)) == null) {
            return -1L;
        }
        return lValueOf.longValue();
    }

    public final String toString() {
        Gift gift;
        Gift gift2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        GiftMessage giftMessage = this.LIZ;
        Integer numValueOf = null;
        sbLIZ.append((giftMessage == null || (gift2 = giftMessage.mGift) == null) ? null : gift2.name);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJJJJZ);
        sbLIZ.append(", ");
        GiftMessage giftMessage2 = this.LIZ;
        if (giftMessage2 != null && (gift = giftMessage2.mGift) != null) {
            numValueOf = Integer.valueOf(gift.diamondCount);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", [");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(" / ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("], mSignature=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1135810ff9(com.bytedance.android.livesdk.model.message.GiftMessage r18) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135810ff9.<init>(com.bytedance.android.livesdk.model.message.GiftMessage):void");
    }

    public final void LIZ(ConcurrentHashSet concurrentHashSet) {
        if (concurrentHashSet instanceof Set) {
            this.LJJJJ.removeAll(concurrentHashSet);
            this.LJJJJ.addAll(concurrentHashSet);
            return;
        }
        Iterator it2 = concurrentHashSet.iterator();
        while (it2.hasNext()) {
            C1136650fgV c1136650fgV = (C1136650fgV) it2.next();
            C19719612Di.LJJIII(this.LJJJJ, new AwS596S0100000_17(c1136650fgV, 19), true);
            this.LJJJJ.add(new C1136650fgV(c1136650fgV.LIZIZ, c1136650fgV.LIZ, c1136650fgV.LIZJ));
        }
    }

    public final void LIZIZ(AbstractC1137620fi4 abstractC1137620fi4) {
        int i;
        if (abstractC1137620fi4 instanceof C1137610fi3) {
            i = this.LJIIJ + ((C1137610fi3) abstractC1137620fi4).LIZ;
            int i2 = this.LJIIIZ;
            if (i >= i2) {
                i = i2;
            }
        } else if (Intrinsics.LJFF(abstractC1137620fi4, C1137630fi5.LIZ)) {
            i = this.LJIIIZ;
        } else {
            throw new C1954807lC();
        }
        this.LJIIJ = i;
    }

    public final void LJ(C1135810ff9 c1135810ff9) {
        C1136900fgu next;
        if (c1135810ff9 == null) {
            return;
        }
        Iterator<C1136900fgu> it2 = c1135810ff9.LJJIFFI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1136900fgu c1136900fgu = next;
        if (c1136900fgu != null) {
            c1135810ff9.LJJIFFI.remove(c1136900fgu);
            c1135810ff9.LJJIFFI.add(C1136900fgu.LIZ(c1136900fgu, this.LJIIIZ + 1, 14));
        }
        this.LJJIFFI.addAll(c1135810ff9.LJJIFFI);
    }
}
