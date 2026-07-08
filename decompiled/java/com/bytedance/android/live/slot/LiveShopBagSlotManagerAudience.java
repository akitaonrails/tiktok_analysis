package com.bytedance.android.live.slot;

import X.AbstractC1136060ffY;
import X.C00EZ;
import X.C1892750zM1;
import X.C20441214yg;
import X.C21266818Kk;
import X.C21266918Kl;
import X.C2188811AlT;
import X.C756930Tmd;
import X.C756940Tme;
import X.EnumC1153660g7w;
import X.EnumC147200hK;
import X.EnumC21266618Ki;
import X.EnumC21266718Kj;
import X.InterfaceC1124130fMJ;
import X.InterfaceC212386189o;
import X.InterfaceC212387189p;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.AnchorCommerceLifeMakeWaySetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.AggregationData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveShopBagSlotManagerAudience implements ILiveShopBagSlotManager {
    public Room LL;
    public EnumC1153660g7w LLILLJJLI = EnumC1153660g7w.MUTABLE;
    public EnumC21266718Kj LLILLL = EnumC21266718Kj.NONE;
    public EnumC21266618Ki LLILZ;
    public String LLILZIL;
    public long LLILZLL;
    public C756930Tmd LLIZ;
    public final Map<EnumC21266618Ki, Boolean> LLIZLLLIL;
    public final Map<EnumC21266618Ki, Integer> LLJ;
    public final Map<EnumC21266618Ki, InterfaceC212386189o> LLJI;
    public InterfaceC1124130fMJ LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public EnumC147200hK LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void RT0(String str) {
    }

    public final boolean LIZLLL() {
        return this.LLILLJJLI == EnumC1153660g7w.STABLE_BY_MESSAGE || this.LLJJIJIIJIL > 0 || this.LLJJIJIL > 0;
    }

    public final boolean LJ() {
        Room room = this.LL;
        return room == null || room.getId() <= 0;
    }

    public LiveShopBagSlotManagerAudience() {
        EnumC21266618Ki enumC21266618Ki = EnumC21266618Ki.UNKNOWN;
        this.LLILZ = enumC21266618Ki;
        this.LLILZIL = enumC21266618Ki.getValue();
        this.LLIZLLLIL = new ConcurrentHashMap();
        this.LLJ = new ConcurrentHashMap();
        this.LLJI = new ConcurrentHashMap();
        this.LLJILLL = EnumC147200hK.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC21266618Ki LIZJ() {
        /*
            r12 = this;
            boolean r0 = r12.LIZLLL()
            r11 = 1
            r10 = r0 ^ 1
            long r3 = r12.LLJJIJIL
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r6 = 1
            if (r0 != 0) goto L17
            long r1 = r12.LLJJIJIIJIL
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L21
        L17:
            long r1 = r12.LLJJIJIIJIL
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L3b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3b
        L21:
            r5 = 1
        L22:
            long r1 = r12.LLJJIJIIJIL
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L2c
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L34
        L2c:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L39
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L39
        L34:
            if (r10 == 0) goto L3d
            X.18Ki r0 = X.EnumC21266618Ki.BUSINESS
            return r0
        L39:
            r11 = 0
            goto L34
        L3b:
            r5 = 0
            goto L22
        L3d:
            if (r5 == 0) goto L42
            X.18Ki r0 = X.EnumC21266618Ki.EC
            return r0
        L42:
            if (r11 == 0) goto L47
            X.18Ki r0 = X.EnumC21266618Ki.LOCAL_SERVICE
            return r0
        L47:
            X.18Ki r0 = X.EnumC21266618Ki.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.LiveShopBagSlotManagerAudience.LIZJ():X.18Ki");
    }

    public final void LJII() {
        if (LJ()) {
            return;
        }
        int i = this.LLJILJILJ;
        int i2 = this.LLJILJIL;
        if (i != i2 || i2 <= 0) {
            return;
        }
        Room room = this.LL;
        if (room != null && room.existedCommerceGoods) {
            this.LLJJI = true;
            LJIIIIZZ(room != null ? Long.valueOf(room.existedCommerceGoodsTs) : null);
        }
        Room room2 = this.LL;
        if (room2 != null && room2.existedTtlsGoods) {
            this.LLJJIJI = true;
            LJIIIZ(room2 != null ? Long.valueOf(room2.addTtlsProductTs) : null);
        }
        LIZIZ(false, false, this.LLJJI, this.LLJJIJI);
        LIZ(false);
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final boolean DN2(String str) {
        EnumC21266618Ki.Companion.getClass();
        if (C21266818Kk.LIZ(str) != EnumC21266618Ki.EC && C21266818Kk.LIZ(str) != EnumC21266618Ki.LOCAL_SERVICE) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void GV(C00EZ c00ez) {
        String idStr;
        if (LJ()) {
            return;
        }
        IMessage iMessage = c00ez.LIZIZ;
        if ((iMessage instanceof AbstractC1136060ffY) && this.LLILLJJLI == EnumC1153660g7w.STABLE_BY_MESSAGE && (iMessage instanceof TTLSLiveControlMessage)) {
            TTLSLiveControlMessage tTLSLiveControlMessage = (TTLSLiveControlMessage) iMessage;
            String str = tTLSLiveControlMessage.roomId;
            Room room = this.LL;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            if (Intrinsics.LJFF(str, idStr)) {
                String str2 = this.LLILZIL;
                EnumC21266618Ki enumC21266618Ki = EnumC21266618Ki.EC;
                if (Intrinsics.LJFF(str2, enumC21266618Ki.getValue()) && this.LLILZLL > tTLSLiveControlMessage.timestamp && !AnchorCommerceLifeMakeWaySetting.INSTANCE.enable()) {
                    this.LLILZLL = tTLSLiveControlMessage.timestamp;
                    this.LLILZIL = enumC21266618Ki.getValue();
                    this.LLILZ = EnumC21266618Ki.LOCAL_SERVICE;
                    this.LLILLL = EnumC21266718Kj.LOCAL_SERVICE;
                    LIZIZ(false, false, false, false);
                }
            }
        }
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i = memberMessage.action;
            if (i != 5 && i != 6 && i != 20) {
                return;
            }
            LJIIJ(memberMessage.adminPermissions);
            LIZIZ(false, false, false, false);
        }
    }

    public final void LIZ(boolean z) {
        boolean z2;
        boolean z3;
        if (LJ()) {
            return;
        }
        EnumC21266718Kj enumC21266718Kj = this.LLILLL;
        if (enumC21266718Kj != EnumC21266718Kj.NONE) {
            z2 = true;
        } else {
            z2 = false;
        }
        C756930Tmd c756930Tmd = new C756930Tmd(enumC21266718Kj, z2, this.LLILZ.getValue());
        if (Intrinsics.LJFF(c756930Tmd, this.LLIZ) && !z) {
            return;
        }
        this.LLIZ = c756930Tmd;
        InterfaceC1124130fMJ interfaceC1124130fMJ = this.LLJIJIL;
        if (interfaceC1124130fMJ != null) {
            interfaceC1124130fMJ.LJIJI(c756930Tmd);
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.LLJI).entrySet()) {
            EnumC21266618Ki enumC21266618Ki = (EnumC21266618Ki) entry.getKey();
            InterfaceC212387189p interfaceC212387189p = (InterfaceC212387189p) entry.getValue();
            String value = enumC21266618Ki.getValue();
            if (c756930Tmd.LIZIZ && (Intrinsics.LJFF(c756930Tmd.LIZJ, EnumC21266618Ki.BUSINESS.getValue()) || Intrinsics.LJFF(c756930Tmd.LIZJ, enumC21266618Ki.getValue()))) {
                z3 = true;
            } else {
                z3 = false;
            }
            interfaceC212387189p.LJIJI(new C756930Tmd(c756930Tmd.LIZ, z3, value));
        }
    }

    public final void LJFF(C1892750zM1 c1892750zM1) {
        int iIntValue;
        boolean z;
        Integer num;
        EnumC21266618Ki enumC21266618Ki;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Integer num2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience onProductCountChanged timestamp=");
        sbLIZ.append(c1892750zM1.LJ);
        sbLIZ.append(" bizType=");
        sbLIZ.append(c1892750zM1.LIZ);
        sbLIZ.append(" productCount=");
        sbLIZ.append(c1892750zM1.LIZLLL);
        C20441214yg.LIZIZ("LiveShopBagSlotManagerAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJ()) {
            C21266818Kk c21266818Kk = EnumC21266618Ki.Companion;
            String str = c1892750zM1.LIZ;
            c21266818Kk.getClass();
            if (C21266818Kk.LIZIZ(str)) {
                EnumC21266618Ki enumC21266618KiLIZ = C21266818Kk.LIZ(c1892750zM1.LIZ);
                Integer num3 = (Integer) ((ConcurrentHashMap) this.LLJ).get(enumC21266618KiLIZ);
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                int i = c1892750zM1.LIZLLL;
                ((ConcurrentHashMap) this.LLJ).put(enumC21266618KiLIZ, Integer.valueOf(i));
                int[] iArr = C21266918Kl.LIZ;
                int i2 = iArr[enumC21266618KiLIZ.ordinal()];
                boolean z8 = true;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (this.LLJJIJI || ((num2 = (Integer) ((ConcurrentHashMap) this.LLJ).get(enumC21266618KiLIZ)) != null && num2.intValue() > 0)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        this.LLJJIJI = z7;
                    }
                } else {
                    if (this.LLJJI || ((num = (Integer) ((ConcurrentHashMap) this.LLJ).get(enumC21266618KiLIZ)) != null && num.intValue() > 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLJJI = z;
                }
                AnchorCommerceLifeMakeWaySetting anchorCommerceLifeMakeWaySetting = AnchorCommerceLifeMakeWaySetting.INSTANCE;
                if (anchorCommerceLifeMakeWaySetting.enable()) {
                    if (LIZLLL()) {
                        int i3 = iArr[enumC21266618KiLIZ.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                LJIIIZ(Long.valueOf(c1892750zM1.LJ));
                            }
                        } else {
                            LJIIIIZZ(Long.valueOf(c1892750zM1.LJ));
                        }
                        if (LIZJ() != this.LLILZ) {
                            this.LLILZ = LIZJ();
                        }
                    }
                } else if (LIZLLL() && (enumC21266618Ki = this.LLILZ) != EnumC21266618Ki.UNKNOWN && enumC21266618KiLIZ != enumC21266618Ki && !anchorCommerceLifeMakeWaySetting.enable()) {
                    return;
                }
                if (iIntValue == 0 && i > 0) {
                    this.LLILLJJLI = EnumC1153660g7w.STABLE_BY_MESSAGE;
                    this.LLILZ = C21266818Kk.LIZ(c1892750zM1.LIZ);
                    this.LLILLL = C21266818Kk.LIZJ(c1892750zM1.LIZ);
                } else if (i == 0) {
                    boolean z9 = this.LLJJ;
                    boolean z10 = this.LLJJIII;
                    boolean z11 = z9 ^ z10;
                    if (z9 && this.LLILZ == EnumC21266618Ki.LOCAL_SERVICE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10 && this.LLILZ == EnumC21266618Ki.EC) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z9 && this.LLILZ == EnumC21266618Ki.UNKNOWN && LIZLLL()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.LLJJIII && this.LLILZ == EnumC21266618Ki.UNKNOWN && LIZLLL()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z2 && !z4 && !z3 && !z5) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (!z11 || !LIZLLL() || !z6) {
                        z8 = false;
                    }
                    if (this.LLJILLL == EnumC147200hK.AUDIENCE || z8) {
                        this.LLILZ = EnumC21266618Ki.UNKNOWN;
                        this.LLILLL = EnumC21266718Kj.NONE;
                    }
                }
                LIZ(false);
            }
        }
    }

    public final void LJIIIIZZ(Long l) {
        if (l != null) {
            l.longValue();
            if (this.LLJJIJIIJIL == 0) {
                this.LLJJIJIIJIL = l.longValue();
            } else {
                this.LLJJIJIIJIL = Math.min(l.longValue(), this.LLJJIJIIJIL);
            }
        }
    }

    public final void LJIIIZ(Long l) {
        if (l != null) {
            l.longValue();
            if (this.LLJJIJIL == 0) {
                this.LLJJIJIL = l.longValue();
            } else {
                this.LLJJIJIL = Math.min(l.longValue(), this.LLJJIJIL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[PHI: r1
      0x0076: PHI (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean), (r1v5 boolean) binds: [B:27:0x0073, B:22:0x0069, B:24:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.util.Map<java.lang.Integer, java.lang.Integer> r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L72
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            if (r0 != r2) goto L72
            r1 = 1
        L17:
            r0 = 19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L5d
            int r0 = r0.intValue()
            if (r0 != r2) goto L5d
        L2b:
            r0 = 1
        L2c:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r1, r0)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            java.lang.Object r0 = r2.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3.LLJJ = r1
            r3.LLJJIII = r0
            if (r0 != 0) goto L5a
            if (r1 != 0) goto L5a
            X.00hK r0 = X.EnumC147200hK.AUDIENCE
        L57:
            r3.LLJILLL = r0
            return
        L5a:
            X.00hK r0 = X.EnumC147200hK.ADMIN
            goto L57
        L5d:
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L76
            int r0 = r0.intValue()
            if (r0 != r2) goto L76
            goto L2b
        L72:
            r1 = 0
            if (r4 == 0) goto L76
            goto L17
        L76:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.LiveShopBagSlotManagerAudience.LJIIJ(java.util.Map):void");
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void RZ(int i) {
        this.LLJILJIL = i;
        LJII();
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void pC2(Room room) {
        AggregationData aggregationData;
        User user;
        UserAttr userAttr;
        Map<Integer, Integer> map = null;
        this.LL = null;
        this.LLJILLL = EnumC147200hK.UNKNOWN;
        this.LLILLJJLI = EnumC1153660g7w.MUTABLE;
        this.LLILLL = EnumC21266718Kj.NONE;
        EnumC21266618Ki enumC21266618Ki = EnumC21266618Ki.UNKNOWN;
        this.LLILZ = enumC21266618Ki;
        this.LLILZIL = enumC21266618Ki.getValue();
        this.LLILZLL = 0L;
        this.LLIZ = null;
        ((ConcurrentHashMap) this.LLIZLLLIL).clear();
        ((ConcurrentHashMap) this.LLJ).clear();
        ((ConcurrentHashMap) this.LLJI).clear();
        this.LLJIJIL = null;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJJIJIIJIL = 0L;
        this.LLJJIJIL = 0L;
        this.LL = room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience onRoom addTtlsProductTs=");
        sbLIZ.append(Long.valueOf(room.addTtlsProductTs));
        sbLIZ.append(" existedCommerceGoodsTs=");
        sbLIZ.append(Long.valueOf(room.existedCommerceGoodsTs));
        sbLIZ.append(" existedCommerceGoods=");
        sbLIZ.append(Boolean.valueOf(room.existedCommerceGoods));
        sbLIZ.append(" existedTtlsGoods=");
        sbLIZ.append(Boolean.valueOf(room.existedTtlsGoods));
        C20441214yg.LIZIZ("LiveShopBagSlotManagerAudience", C2188811AlT.LIZIZ(sbLIZ));
        Room room2 = this.LL;
        if (room2 != null && (aggregationData = room2.aggregationData) != null && (user = aggregationData.audience) != null && (userAttr = user.getUserAttr()) != null) {
            map = userAttr.adminPermissions;
        }
        LJIIJ(map);
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void y10(InterfaceC1124130fMJ interfaceC1124130fMJ) {
        if (LJ()) {
            return;
        }
        this.LLJIJIL = interfaceC1124130fMJ;
        LIZ(true);
        interfaceC1124130fMJ.LJIILIIL(new AwS611S0100000_32(this, 20));
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void kJ1(C756940Tme c756940Tme, InterfaceC212386189o interfaceC212386189o) {
        if (!LJ()) {
            C21266818Kk c21266818Kk = EnumC21266618Ki.Companion;
            String str = c756940Tme.LIZIZ;
            c21266818Kk.getClass();
            if (C21266818Kk.LIZIZ(str)) {
                ((ConcurrentHashMap) this.LLJI).put(C21266818Kk.LIZ(c756940Tme.LIZIZ), interfaceC212386189o);
                this.LLJILJILJ++;
                LJII();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.LiveShopBagSlotManagerAudience.LIZIZ(boolean, boolean, boolean, boolean):void");
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void bC2(String str, LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, InterfaceC212386189o interfaceC212386189o) {
        if (!LJ()) {
            EnumC21266618Ki.Companion.getClass();
            if (C21266818Kk.LIZIZ(str)) {
                interfaceC212386189o.LJIILJJIL(lifecycleOwner, new AwS146S1100000_32(this, str, 0));
                interfaceC212386189o.LJIILIIL(new AwS611S0100000_32(this, 18));
                ((ConcurrentHashMap) this.LLIZLLLIL).put(C21266818Kk.LIZ(str), Boolean.valueOf(Intrinsics.LJFF(slotViewModel.LLILZ.getValue(), Boolean.TRUE)));
            }
        }
    }
}
