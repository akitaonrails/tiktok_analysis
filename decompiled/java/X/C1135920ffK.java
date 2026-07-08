package X;

import Y.ARunnableS18S0210000_17;
import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncAnchorAudienceEffectSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncAnchorAudienceV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS114S0400000_17;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS37S0310000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS98S0210000_17;
import kotlin.jvm.internal.AwS9S0201100_17;

/* JADX INFO: renamed from: X.0ffK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135920ffK implements InterfaceC1136220ffo {
    public final InterfaceC1132530fZr LIZ;
    public final LinkedList<InterfaceC1136020ffU> LIZIZ = new LinkedList<>();
    public final LinkedList<InterfaceC1136020ffU> LIZJ = new LinkedList<>();
    public final C1136100ffc LIZLLL;
    public volatile long LJ;
    public DataChannel LJFF;
    public final HashSet<String> LJI;
    public final HashSet<String> LJII;
    public C1135930ffL LJIIIIZZ;
    public final BPEAHandler LJIIIZ;
    public InterfaceC1136020ffU LJIIJ;
    public final InterfaceC1135310feL LJIIJJI;
    public boolean LJIIL;
    public final HashMap<String, Long> LJIILIIL;
    public final C1139360fks LJIILJJIL;

    @Override // X.InterfaceC1136220ffo
    public final boolean LJIIIIZZ() {
        LJIILJJIL("isSelfQueueEmpty");
        return this.LIZJ.isEmpty();
    }

    @Override // X.InterfaceC1136220ffo
    public final void LJIIJ() {
        LJJIIJ("GiftTrayMessageQueue.clearGiftMessage", new AwS561S0100000_17(this, 385));
    }

    public final void LJIILIIL() {
        for (InterfaceC1136020ffU interfaceC1136020ffU : this.LIZJ) {
            C1134980fdo.LIZ.LIZ(C1135870ffF.LJII(interfaceC1136020ffU), true);
            C1135790ff7.LJI(interfaceC1136020ffU, EnumC1133520fbS.MESSAGE_DISCARDED, EnumC1136250ffr.SHOW);
        }
        this.LIZLLL.LIZJ(new AwS596S0100000_17(new C1140170fmB(0), 364));
    }

    public final void LJIILL() {
        InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
        if (interfaceC1135310feL != null && !C0NKN.LIZ()) {
            interfaceC1135310feL.LIZ("GiftTrayMessageQueue.awakeTrayController", new AwS561S0100000_17(this, 384));
            return;
        }
        C1135930ffL c1135930ffL = this.LJIIIIZZ;
        if (c1135930ffL != null) {
            c1135930ffL.LIZ();
        }
    }

    public final InterfaceC1136020ffU LJIJ() {
        InterfaceC1136020ffU interfaceC1136020ffULJIJI;
        if (!this.LIZJ.isEmpty()) {
            interfaceC1136020ffULJIJI = LJIJI(true, false);
            if (interfaceC1136020ffULJIJI != null) {
                return interfaceC1136020ffULJIJI;
            }
        } else {
            interfaceC1136020ffULJIJI = null;
        }
        return (!(this.LIZIZ.isEmpty() ^ true) || (interfaceC1136020ffULJIJI = LJIJI(false, true)) == null) ? !this.LIZLLL.LIZIZ() ? LJIJI(false, false) : interfaceC1136020ffULJIJI : interfaceC1136020ffULJIJI;
    }

    public final C1136100ffc LJIJJ() {
        LJIILJJIL("getOtherQueue");
        return this.LIZLLL;
    }

    public final List<InterfaceC1136020ffU> LJIJJLI() {
        LJIILJJIL("getSelfQueue");
        return this.LIZJ;
    }

    public final boolean LJJ() {
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        return C500260Jjc.LJIIZILJ(interfaceC1132530fZr != null ? interfaceC1132530fZr.o3() : null);
    }

    public final void LJJII() {
        LJJIIJ("GiftTrayMessageQueue.onDestroy", new AwS561S0100000_17(this, 386));
    }

    public final int LJJIJ() {
        LJIILJJIL("queueSize");
        return this.LIZJ.size() + ((int) this.LIZLLL.LIZLLL());
    }

    @Override // X.InterfaceC1136220ffo
    public final long LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1136220ffo
    public final InterfaceC1139410fkx LJII() {
        return this.LJIILJJIL;
    }

    public C1135920ffK(InterfaceC1132530fZr interfaceC1132530fZr) {
        DataChannel dataChannelO3;
        this.LIZ = interfaceC1132530fZr;
        this.LIZLLL = new C1136100ffc(interfaceC1132530fZr);
        if (interfaceC1132530fZr != null) {
            dataChannelO3 = interfaceC1132530fZr.o3();
        } else {
            dataChannelO3 = null;
        }
        this.LJFF = dataChannelO3;
        this.LJI = new HashSet<>();
        this.LJII = new HashSet<>();
        this.LJIIIZ = new BPEAHandler(Looper.getMainLooper());
        this.LJIIJJI = interfaceC1132530fZr != null ? interfaceC1132530fZr.LIZIZ() : null;
        this.LJIILIIL = new HashMap<>();
        this.LJIILJJIL = new C1139360fks(this);
    }

    public static long LJIIZILJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        long seiDelayMaxMs;
        InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
        if (interfaceC480510Isr != null) {
            seiDelayMaxMs = interfaceC480510Isr.LJJIIJ();
        } else {
            seiDelayMaxMs = 0;
        }
        interfaceC1136020ffU.LJJI().LJIILJJIL = seiDelayMaxMs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delay : ");
        sbLIZ.append(seiDelayMaxMs);
        C1133910fc5.LJIIIIZZ("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        if (seiDelayMaxMs >= 0 && seiDelayMaxMs <= LiveGiftSyncAnchorAudienceEffectSetting.INSTANCE.getSeiDelayMaxMs()) {
            if (seiDelayMaxMs == 0) {
                interfaceC1136020ffU.LJJI().LJIIJJI = 0;
            } else {
                interfaceC1136020ffU.LJJI().LJIIJJI = 1;
            }
        } else {
            seiDelayMaxMs = LiveGiftSyncAnchorAudienceEffectSetting.INSTANCE.getSeiDelayMaxMs();
            interfaceC1136020ffU.LJJI().LJIIJJI = -1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("delay after adjust : ");
        sbLIZ2.append(seiDelayMaxMs);
        C1133910fc5.LJIIIIZZ("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ2));
        return seiDelayMaxMs;
    }

    @Override // X.InterfaceC1136220ffo
    public final void LIZ(Function1<? super InterfaceC1136020ffU, Boolean> function1) {
        LJIILJJIL("loopCheckWaitingQueue");
        if (!LIZJ()) {
            LIZLLL(new AwS383S0200000_17(new C1140170fmB(0), (C1140170fmB) function1, (Function1<? super C1136560fgM, Boolean>) 71));
        }
    }

    @Override // X.InterfaceC1136220ffo
    public final void LIZLLL(C1135930ffL c1135930ffL) {
        this.LJIIIIZZ = c1135930ffL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r3
      0x0041: PHI (r3v1 X.0ffU) = (r3v5 X.0ffU), (r3v6 X.0ffU), (r3v7 X.0ffU) binds: [B:16:0x003f, B:12:0x0031, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    @Override // X.InterfaceC1136220ffo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1135810ff9 LJIIIZ(X.C1136320ffy r7) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJIIIZ(X.0ffy):X.0ff9");
    }

    @Override // X.InterfaceC1136220ffo
    public final void LJIIJJI(C1135810ff9 c1135810ff9) {
        InterfaceC1136020ffU interfaceC1136020ffU = c1135810ff9.LIZIZ;
        List<GiftMessage.SponsorshipInfo> list = null;
        if (interfaceC1136020ffU == null) {
            C1133910fc5.LIZJ("GiftTrayMessageQueue", "interruptMessage ignored, newGiftMsg is null", null);
            return;
        }
        interfaceC1136020ffU.LJII(c1135810ff9.LJIIIZ);
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage != null) {
            list = giftMessage.sponsorshipInfo;
        }
        interfaceC1136020ffU.LJIILIIL(list);
        C1136240ffq c1136240ffqLJJIFFI = interfaceC1136020ffU.LJJIFFI();
        c1136240ffqLJJIFFI.LJFF = c1135810ff9.LJJJJI;
        c1136240ffqLJJIFFI.LIZ.LIZLLL(c1135810ff9.LJJJJIZL.LIZIZ);
        c1136240ffqLJJIFFI.LJIIJJI.clear();
        ConcurrentHashSet<C1136650fgV> concurrentHashSet = c1135810ff9.LJJJJ;
        if (concurrentHashSet instanceof Set) {
            c1136240ffqLJJIFFI.LJIIJJI.removeAll(concurrentHashSet);
            c1136240ffqLJJIFFI.LJIIJJI.addAll(concurrentHashSet);
        } else {
            for (C1136650fgV c1136650fgV : concurrentHashSet) {
                C19719612Di.LJJIII(c1136240ffqLJJIFFI.LJIIJJI, new AwS596S0100000_17(c1136650fgV, 20), true);
                c1136240ffqLJJIFFI.LJIIJJI.add(new C1136650fgV(c1136650fgV.LIZIZ, c1136650fgV.LIZ, c1136650fgV.LIZJ));
            }
        }
        C1135880ffG c1135880ffGLJJI = interfaceC1136020ffU.LJJI();
        c1135880ffGLJJI.LIZLLL = c1135810ff9.LJIIIZ;
        c1135880ffGLJJI.LJI = c1135810ff9.LJIIJ;
        c1135880ffGLJJI.LJII = c1135810ff9.LJIIJJI;
        c1135880ffGLJJI.LJIIIIZZ.clear();
        HashSet<InterfaceC1136020ffU> hashSet = c1135880ffGLJJI.LJIIIIZZ;
        HashSet<C1135810ff9> hashSet2 = c1135810ff9.LJIIL;
        ArrayList arrayList = new ArrayList();
        Iterator<C1135810ff9> it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            InterfaceC1136020ffU interfaceC1136020ffU2 = it2.next().LIZIZ;
            if (interfaceC1136020ffU2 != null) {
                arrayList.add(interfaceC1136020ffU2);
            }
        }
        hashSet.addAll(arrayList);
        c1135880ffGLJJI.LJ.clear();
        HashSet<C1136900fgu> hashSet3 = c1135880ffGLJJI.LJ;
        HashSet<C1136900fgu> hashSet4 = c1135810ff9.LJJIFFI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(hashSet4, 10));
        Iterator<C1136900fgu> it3 = hashSet4.iterator();
        while (it3.hasNext()) {
            arrayList2.add(C1136900fgu.LIZ(it3.next(), 0, 15));
        }
        hashSet3.addAll(arrayList2);
        c1135880ffGLJJI.LIZIZ().clear();
        c1135880ffGLJJI.LIZIZ().addAll(c1135810ff9.LJJII);
        InterfaceC1136020ffU interfaceC1136020ffU3 = c1135810ff9.LIZIZ;
        if (interfaceC1136020ffU3 != null) {
            LJJIIJ("GiftTrayMessageQueue.receiveGiftMessageAsync", new AwS98S0210000_17(this, interfaceC1136020ffU3, 2));
        }
    }

    public final void LJIILJJIL(String str) {
        InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
        if (interfaceC1135310feL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftTrayMessageQueue#");
            sbLIZ.append(str);
            interfaceC1135310feL.LJI(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIL(C1135810ff9 c1135810ff9) {
        GiftMessage giftMessage;
        Integer numValueOf;
        if (c1135810ff9 == null || !LJJ() || (giftMessage = c1135810ff9.LIZ) == null) {
            return;
        }
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.type);
        } else {
            numValueOf = null;
        }
        EnumC1133020fae giftType = interfaceC1128210fStInst.getGiftType(numValueOf);
        if (giftType != EnumC1133020fae.INTERACTIVE_GAME_GIFT) {
            return;
        }
        C20441214yg.LJIIIZ("GiftTrayMessageQueue_gift_sticker", "handle GAME_GIFT here, on TrayQueue dequeue");
        InterfaceC1133090fal interfaceC1133090falLIZIZ = C1133210fax.LIZIZ(giftMessage, giftType);
        if (interfaceC1133090falLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no need to render by engine == null, giftType=");
            sbLIZ.append(giftType);
            C20441214yg.LJIIIZ("GiftTrayMessageQueue_gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("check message if user is anchor passed toID: ");
        sbLIZ2.append(C1133680fbi.LIZIZ(giftMessage));
        sbLIZ2.append(", currentID : ");
        sbLIZ2.append(UserService.getInstance().user().getCurrentUserId());
        C20441214yg.LJIIIZ("GiftTrayMessageQueue_gift_sticker", C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.LJJZZIII(this.LJIIIZ, new ARunnableS86S0200000_17(interfaceC1133090falLIZIZ, giftMessage, 45));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    @Override // X.InterfaceC1136220ffo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1135810ff9 LIZJ(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "canComboBeInterrupted"
            r8.LJIILJJIL(r0)
            r3 = 1
            r2 = 0
            if (r10 != 0) goto L99
            java.util.LinkedList<X.0ffU> r0 = r8.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L68
            java.util.LinkedList<X.0ffU> r0 = r8.LIZJ
            java.util.Iterator r1 = r0.iterator()
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.0ffU r0 = (X.InterfaceC1136020ffU) r0
            boolean r0 = X.C1135870ffF.LJIIL(r0)
            if (r0 == 0) goto L19
        L2c:
            X.0ffU r4 = (X.InterfaceC1136020ffU) r4
            if (r4 != 0) goto Lab
            java.util.LinkedList<X.0ffU> r0 = r8.LIZJ
            java.util.Iterator r7 = r0.iterator()
        L36:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r4 = r7.next()
            r6 = r4
            X.0ffU r6 = (X.InterfaceC1136020ffU) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r9, r0)
            r5.<init>(r0)
            java.util.Iterator r1 = r9.iterator()
        L52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()
            X.0ff9 r0 = (X.C1135810ff9) r0
            java.lang.String r0 = r0.LIZLLL
            r5.add(r0)
            goto L52
        L64:
            r4 = r2
            goto La9
        L66:
            r4 = r2
            goto L2c
        L68:
            java.util.LinkedList<X.0ffU> r0 = r8.LIZIZ
            java.lang.Object r4 = X.C13LP.LJJJLL(r0)
            X.0ffU r4 = (X.InterfaceC1136020ffU) r4
            if (r4 != 0) goto L78
            X.0ffc r0 = r8.LIZLLL
            X.0ffU r4 = r0.LIZ(r2)
        L78:
            if (r4 == 0) goto L97
            boolean r0 = r4.LJIIJJI()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L82:
            boolean r0 = X.C176600m4.LIZIZ(r0)
            if (r0 != 0) goto Lab
            boolean r0 = X.C1135870ffF.LJIIL(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C176600m4.LIZIZ(r0)
            if (r0 == 0) goto L99
            goto Lab
        L97:
            r0 = r2
            goto L82
        L99:
            r4 = r2
            goto Lab
        L9b:
            X.0ffG r0 = r6.LJJI()
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = r5.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L36
        La9:
            X.0ffU r4 = (X.InterfaceC1136020ffU) r4
        Lab:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.LJFF
            if (r1 == 0) goto Lb7
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
        Lb7:
            if (r2 == 0) goto Lc2
            long r0 = r2.getOwnerUserId()
        Lbd:
            X.0ff9 r0 = X.C1135860ffE.LIZIZ(r4, r0, r2, r3)
            return r0
        Lc2:
            r0 = 0
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LIZJ(java.util.List, boolean):X.0ff9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r13.LJIILLIIL(r20, r4, new kotlin.jvm.internal.AwS418S0200000_17(r19, r20, 64), new kotlin.jvm.internal.AwS383S0200000_17(r19, r20, 72)) != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    @Override // X.InterfaceC1136220ffo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC1136020ffU r20, boolean r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJFF(X.0ffU, boolean):void");
    }

    @Override // X.InterfaceC1136220ffo
    public final void LJI(C1136320ffy c1136320ffy, AwS37S0310000_17 awS37S0310000_17) {
        InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
        if (interfaceC1135310feL == null) {
            awS37S0310000_17.invoke(LJIIIZ(c1136320ffy));
        } else {
            interfaceC1135310feL.LJFF("GiftTrayMessageQueue.requestMessageAsync", new AwS418S0200000_17(this, c1136320ffy, 63), new AwS114S0400000_17(awS37S0310000_17, c1136320ffy, interfaceC1135310feL, this, 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1136020ffU LJIJI(boolean r5, boolean r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L11
            if (r5 != 0) goto L35
            X.0ffc r1 = r4.LIZLLL
            r0 = 111(0x6f, float:1.56E-43)
            kotlin.jvm.internal.AFwS254S0000000_17 r0 = kotlin.jvm.internal.AFwS254S0000000_17.get$arr$(r0)
            X.0ffU r0 = r1.LIZ(r0)
            return r0
        L11:
            if (r5 != 0) goto L35
            java.util.LinkedList<X.0ffU> r0 = r4.LIZIZ
        L15:
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0ffU r0 = (X.InterfaceC1136020ffU) r0
            X.0ffG r0 = r0.LJJI()
            int r1 = r0.LJIILL
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r1 == r0) goto L19
        L30:
            X.0ffU r2 = (X.InterfaceC1136020ffU) r2
            return r2
        L33:
            r2 = 0
            goto L30
        L35:
            java.util.LinkedList<X.0ffU> r0 = r4.LIZJ
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJIJI(boolean, boolean):X.0ffU");
    }

    public final boolean LJJI(C1136320ffy c1136320ffy, InterfaceC1136020ffU interfaceC1136020ffU) {
        Long l;
        if (c1136320ffy.LIZ != null || (l = this.LJIILIIL.get(interfaceC1136020ffU.LJJI().LIZIZ)) == null) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - l.longValue() > 3000) {
            this.LJIILIIL.remove(interfaceC1136020ffU.LJJI().LIZIZ);
            return false;
        }
        return true;
    }

    public final void LJJIFFI(String str, C1136320ffy c1136320ffy) {
        String strLIZIZ;
        if (c1136320ffy != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request=");
            sbLIZ.append(c1136320ffy);
            sbLIZ.append(", ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("urgentMessageQueue.size=");
        sbLIZ2.append(this.LIZIZ.size());
        sbLIZ2.append(", selfMessageQueue.size=");
        sbLIZ2.append(this.LIZJ.size());
        sbLIZ2.append(", otherMessageQueue.size=");
        sbLIZ2.append(this.LIZLLL.LIZLLL());
        C1133910fc5.LJ("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJIII(InterfaceC1136020ffU interfaceC1136020ffU, C1135810ff9 c1135810ff9) {
        C1135850ffD c1135850ffD;
        Long lLIZJ;
        if (!interfaceC1136020ffU.LJ() && !interfaceC1136020ffU.LJIIJJI() && !LJJ()) {
            LJIIZILJ(interfaceC1136020ffU);
        }
        LJJIJIIJI(interfaceC1136020ffU, true);
        if (interfaceC1136020ffU.LJIIIIZZ() != null && (c1135850ffD = interfaceC1136020ffU.LJJIFFI().LIZ) != null && (lLIZJ = c1135850ffD.LIZJ("dequeue")) != null) {
            long jLongValue = lLIZJ.longValue();
            ConcurrentLinkedDeque<Pair<Long, Integer>> concurrentLinkedDeque = C826710Wbt.LIZ;
            C826710Wbt.LIZ(C1135870ffF.LIZJ(interfaceC1136020ffU), jLongValue);
        }
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnable() && C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
            this.LJIIJ = interfaceC1136020ffU;
            LJJIIJ("GiftTrayMessageQueue.onDirectShowDequeue.preloadNextVideo", new AwS561S0100000_17(this, 387));
        }
        LJIL(c1135810ff9);
    }

    public final void LJJIIJ(String str, Function0<Unit> function0) {
        InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
        if (interfaceC1135310feL != null && !interfaceC1135310feL.LIZJ()) {
            interfaceC1135310feL.LIZIZ(str, function0);
        } else {
            function0.invoke();
        }
    }

    public final void LJJIIZI(InterfaceC1136020ffU interfaceC1136020ffU, boolean z) {
        Boolean boolValueOf;
        LJIILJJIL("pushMsgInQueueOrStoreInMap");
        if (interfaceC1136020ffU.LJ()) {
            LJJIIJZLJL(interfaceC1136020ffU, z, true, false);
            return;
        }
        if (interfaceC1136020ffU.LJIIJJI()) {
            LJJIIJZLJL(interfaceC1136020ffU, z, false, true);
            return;
        }
        if (!z) {
            DataChannel dataChannel = this.LJFF;
            if (dataChannel != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIJIIJIL(boolValueOf) && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(interfaceC1136020ffU.LJIIJJI()))) {
                long jLJIIZILJ = LJIIZILJ(interfaceC1136020ffU);
                if (jLJIIZILJ > 0 && (C1135870ffF.LJII(interfaceC1136020ffU) == 2 || C176600m4.LIZIZ(LiveGiftSyncAnchorAudienceV2Setting.INSTANCE.isEnabled()))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("delay after adjust : ");
                    sbLIZ.append(jLJIIZILJ);
                    C1133910fc5.LJIIIIZZ("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
                    if (interfaceC1135310feL != null) {
                        interfaceC1135310feL.LIZLLL(jLJIIZILJ, "GiftTrayMessageQueue.pushOtherMessageWithSeiDelay", new AwS98S0210000_17(this, interfaceC1136020ffU, z, 0));
                        return;
                    } else {
                        C786410Ut5.LJLIIL(jLJIIZILJ, this.LJIIIZ, new ARunnableS18S0210000_17(this, interfaceC1136020ffU, z, 3));
                        return;
                    }
                }
                LJJIIJZLJL(interfaceC1136020ffU, z, false, false);
                return;
            }
        }
        LJJIIJZLJL(interfaceC1136020ffU, z, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.InterfaceC1136020ffU r25, boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJJIJIIJI(X.0ffU, boolean):void");
    }

    @Override // X.InterfaceC1137720fiE
    public final void LJ(long j, C1135810ff9 c1135810ff9, int i) {
        LJJIIJ("GiftTrayMessageQueue.updateLynxGiftResourceStatus", new AwS9S0201100_17(this, j, c1135810ff9, i, 0));
    }

    @Override // X.InterfaceC1136220ffo
    public final void LJIIL(List list, AwS226S0300000_17 awS226S0300000_17, boolean z) {
        InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
        if (interfaceC1135310feL != null) {
            interfaceC1135310feL.LJFF("GiftTrayMessageQueue.canComboBeInterruptedAsync", new AwS98S0210000_17(this, (C1135920ffK) z, (boolean) list, (List<C1135810ff9>) 1), awS226S0300000_17);
        } else {
            awS226S0300000_17.invoke(LIZJ(list, z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1136020ffU LJIILLIIL(X.C1136320ffy r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJIILLIIL(X.0ffy, boolean, boolean):X.0ffU");
    }

    public final void LJJIIJZLJL(final InterfaceC1136020ffU interfaceC1136020ffU, final boolean z, final boolean z2, final boolean z3) {
        if (!z3 && C1135980ffQ.LJIIJ()) {
            long jLJFF = C1135980ffQ.LJFF(interfaceC1136020ffU.LJ(), LJJ());
            if (jLJFF > 0) {
                InterfaceC1135310feL interfaceC1135310feL = this.LJIIJJI;
                if (interfaceC1135310feL != null) {
                    interfaceC1135310feL.LIZLLL(jLJFF, "GiftTrayMessageQueue.pushMsgInQueue.delay", new C1136950fgz(this, interfaceC1136020ffU, z, z2, z3));
                    return;
                } else {
                    C786410Ut5.LJLIIL(jLJFF, this.LJIIIZ, new Runnable() { // from class: X.0fge
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GiftTrayMessageQueue@b0e6.pushMsgInQueue$2");
                            try {
                                this.LL.LJJIIZ(interfaceC1136020ffU, z, z2, z3);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GiftTrayMessageQueue@b0e6.pushMsgInQueue$2");
                        }
                    });
                    return;
                }
            }
        }
        LJJIIZ(interfaceC1136020ffU, z, z2, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.InterfaceC1136020ffU r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135920ffK.LJJIIZ(X.0ffU, boolean, boolean, boolean):void");
    }
}
