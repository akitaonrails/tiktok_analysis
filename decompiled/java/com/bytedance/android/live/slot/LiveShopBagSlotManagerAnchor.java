package com.bytedance.android.live.slot;

import X.AbstractC1136060ffY;
import X.C00EZ;
import X.C20441214yg;
import X.C21266818Kk;
import X.C2188811AlT;
import X.C756930Tmd;
import X.C756940Tme;
import X.EnumC1153660g7w;
import X.EnumC21266618Ki;
import X.EnumC21266718Kj;
import X.InterfaceC1124130fMJ;
import X.InterfaceC212386189o;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.TTLSLiveControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveShopBagSlotManagerAnchor implements ILiveShopBagSlotManager {
    public Room LL;
    public EnumC1153660g7w LLILLJJLI = EnumC1153660g7w.MUTABLE;
    public EnumC21266718Kj LLILLL = EnumC21266718Kj.NONE;
    public EnumC21266618Ki LLILZ;
    public String LLILZIL;
    public long LLILZLL;
    public C756930Tmd LLIZ;
    public final Map<EnumC21266618Ki, Integer> LLIZLLLIL;
    public final Map<EnumC21266618Ki, InterfaceC212386189o> LLJ;
    public InterfaceC1124130fMJ LLJI;
    public long LLJIJIL;
    public long LLJILJIL;

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void RZ(int i) {
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void bC2(String str, LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, InterfaceC212386189o interfaceC212386189o) {
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void kJ1(C756940Tme c756940Tme, InterfaceC212386189o interfaceC212386189o) {
    }

    public final boolean LIZIZ() {
        Room room = this.LL;
        return room == null || room.getId() <= 0;
    }

    public LiveShopBagSlotManagerAnchor() {
        EnumC21266618Ki enumC21266618Ki = EnumC21266618Ki.UNKNOWN;
        this.LLILZ = enumC21266618Ki;
        this.LLILZIL = enumC21266618Ki.getValue();
        this.LLIZLLLIL = new ConcurrentHashMap();
        this.LLJ = new ConcurrentHashMap();
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
        if (LIZIZ()) {
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
                if (Intrinsics.LJFF(str2, enumC21266618Ki.getValue())) {
                    long j = this.LLILZLL;
                    long j2 = tTLSLiveControlMessage.timestamp;
                    if (j > j2) {
                        this.LLILZLL = j2;
                        this.LLILZIL = enumC21266618Ki.getValue();
                        this.LLILLL = EnumC21266718Kj.LOCAL_SERVICE;
                        LIZ(false);
                    }
                }
            }
        }
    }

    public final void LIZ(boolean z) {
        if (LIZIZ()) {
            return;
        }
        C756930Tmd c756930Tmd = new C756930Tmd(this.LLILLL, true, this.LLILZ.getValue());
        if (Intrinsics.LJFF(c756930Tmd, this.LLIZ) && !z) {
            return;
        }
        this.LLIZ = c756930Tmd;
        InterfaceC1124130fMJ interfaceC1124130fMJ = this.LLJI;
        if (interfaceC1124130fMJ != null) {
            interfaceC1124130fMJ.LJIJI(c756930Tmd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[PHI: r2
      0x0087: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:43:0x0084, B:23:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RT0(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = r9.LIZIZ()
            if (r0 == 0) goto L7
            return
        L7:
            X.0g7w r1 = r9.LLILLJJLI
            X.0g7w r0 = X.EnumC1153660g7w.MUTABLE
            r4 = 0
            if (r1 != r0) goto L6e
            X.18Kk r0 = X.EnumC21266618Ki.Companion
            r0.getClass()
            X.18Ki r1 = X.C21266818Kk.LIZ(r10)
            X.18Ki r5 = X.EnumC21266618Ki.EC
            r8 = 1
            if (r1 == r5) goto L8b
            X.18Ki r0 = X.EnumC21266618Ki.BUSINESS
            if (r1 == r0) goto L8b
            r7 = 0
        L21:
            X.18Ki r6 = X.EnumC21266618Ki.LOCAL_SERVICE
            if (r1 == r6) goto L89
            X.18Ki r0 = X.EnumC21266618Ki.BUSINESS
            if (r1 == r0) goto L89
            r3 = 0
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "anchor lockOnRoom ecV="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " lsV="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveShopBagSlotManagerAnchor"
            X.C20441214yg.LIZIZ(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r9.LL
            if (r1 == 0) goto L83
            boolean r0 = r1.existedCommerceGoods
            if (r0 != r8) goto L83
            r2 = 1
        L50:
            boolean r0 = r1.existedTtlsGoods
            if (r0 != r8) goto L87
            r1 = 1
        L55:
            if (r2 == 0) goto L75
            if (r1 == 0) goto L5a
        L59:
            r5 = r6
        L5a:
            java.lang.String r0 = r5.getValue()
            X.18Kj r0 = X.C21266818Kk.LIZJ(r0)
            r9.LLILLL = r0
            r9.LLILZ = r5
            if (r2 != 0) goto L72
            if (r1 != 0) goto L72
            X.0g7w r0 = X.EnumC1153660g7w.STABLE_ON_ROOM
        L6c:
            r9.LLILLJJLI = r0
        L6e:
            r9.LIZ(r4)
            return
        L72:
            X.0g7w r0 = X.EnumC1153660g7w.STABLE_BY_MESSAGE
            goto L6c
        L75:
            if (r1 != 0) goto L59
            if (r7 == 0) goto L7e
            if (r3 == 0) goto L5a
            X.18Ki r5 = X.EnumC21266618Ki.BUSINESS
            goto L5a
        L7e:
            if (r3 != 0) goto L59
            X.18Ki r5 = X.EnumC21266618Ki.UNKNOWN
            goto L5a
        L83:
            r2 = 0
            if (r1 == 0) goto L87
            goto L50
        L87:
            r1 = 0
            goto L55
        L89:
            r3 = 1
            goto L2a
        L8b:
            r7 = 1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.LiveShopBagSlotManagerAnchor.RT0(java.lang.String):void");
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void pC2(Room room) {
        this.LL = null;
        this.LLILLJJLI = EnumC1153660g7w.MUTABLE;
        this.LLILLL = EnumC21266718Kj.NONE;
        EnumC21266618Ki enumC21266618Ki = EnumC21266618Ki.UNKNOWN;
        this.LLILZ = enumC21266618Ki;
        this.LLILZIL = enumC21266618Ki.getValue();
        this.LLILZLL = 0L;
        this.LLIZ = null;
        ((ConcurrentHashMap) this.LLIZLLLIL).clear();
        ((ConcurrentHashMap) this.LLJ).clear();
        this.LLJI = null;
        this.LLJIJIL = 0L;
        this.LLJILJIL = 0L;
        this.LL = room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchor onRoom addTtlsProductTs=");
        sbLIZ.append(Long.valueOf(room.addTtlsProductTs));
        sbLIZ.append(" existedCommerceGoodsTs=");
        sbLIZ.append(Long.valueOf(room.existedCommerceGoodsTs));
        sbLIZ.append(" existedCommerceGoods=");
        sbLIZ.append(Boolean.valueOf(room.existedCommerceGoods));
        sbLIZ.append(" existedTtlsGoods=");
        sbLIZ.append(Boolean.valueOf(room.existedTtlsGoods));
        C20441214yg.LIZIZ("LiveShopBagSlotManagerAnchor", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.live.slot.ILiveShopBagSlotManager
    public final void y10(InterfaceC1124130fMJ interfaceC1124130fMJ) {
        if (LIZIZ()) {
            return;
        }
        this.LLJI = interfaceC1124130fMJ;
        interfaceC1124130fMJ.LJIILIIL(new AwS611S0100000_32(this, 19));
    }
}
