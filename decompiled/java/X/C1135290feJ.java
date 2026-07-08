package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS22S0401000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0feJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135290feJ implements InterfaceC1132740faC, InterfaceC1135400feU {
    public final InterfaceC1132530fZr LIZ;
    public final InterfaceC1135310feL LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final C1136200ffm LJ;
    public final C1135300feK LJFF;
    public final C1135590fen LJI;
    public final C1135350feP LJII;
    public volatile boolean LJIIIIZZ;

    @Override // X.InterfaceC1132740faC
    public final void LIZ() {
        C1135590fen c1135590fen = this.LJI;
        if (c1135590fen == null || c1135590fen.LIZJ == null) {
            return;
        }
        C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", "clearMsg");
        c1135590fen.LJFF(new AwS561S0100000_17(c1135590fen, 607));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0feO] */
    public C1135290feJ(InterfaceC1132530fZr interfaceC1132530fZr) {
        InterfaceC1135310feL interfaceC1135310feLLIZIZ;
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        this.LIZ = interfaceC1132530fZr;
        C1135590fen c1135590fen = null;
        if (interfaceC1132530fZr != null) {
            interfaceC1135310feLLIZIZ = interfaceC1132530fZr.LIZIZ();
        } else {
            interfaceC1135310feLLIZIZ = null;
        }
        this.LIZIZ = interfaceC1135310feLLIZIZ;
        this.LJ = new C1136200ffm(interfaceC1132530fZr);
        this.LJFF = new C1135300feK(interfaceC1132530fZr, this);
        if (interfaceC1132530fZr != null && (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) != null && (c1133250fb1 = c1131090fXXLIZ.LIZJ) != null) {
            c1135590fen = c1133250fb1.LIZ;
        }
        this.LJI = c1135590fen;
        this.LJII = new C1135350feP(new InterfaceC1135560fek() { // from class: X.0feO
            @Override // X.InterfaceC1135560fek
            public final InterfaceC1132530fZr LIZ() {
                return this.LIZ.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1132740faC
    public final void LIZIZ(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.InterfaceC1135400feU
    public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        LJII(interfaceC1136020ffU);
    }

    @Override // X.InterfaceC1132740faC
    public final void LIZLLL(boolean z) {
        this.LIZJ = z;
        C1135590fen c1135590fen = this.LJI;
        if (c1135590fen != null && c1135590fen.LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setClearScreenMode to ");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", C2188811AlT.LIZIZ(sbLIZ));
            c1135590fen.LJFF = z;
            c1135590fen.LJFF(new AwS135S0110000_17(c1135590fen, z, 9));
        }
        C1135300feK c1135300feK = this.LJFF;
        c1135300feK.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setClearScreenMode to ");
        sbLIZ2.append(z);
        C1133910fc5.LIZLLL("GiftQueueTrafficController", C2188811AlT.LIZIZ(sbLIZ2));
        c1135300feK.LJI = z;
        if (z) {
            c1135300feK.LIZIZ("setClearScreenMode");
        }
    }

    public final boolean LJFF(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (!C1135860ffE.LJII(interfaceC1136020ffU)) {
            return false;
        }
        EnumC1133020fae giftType = GiftManager.inst().getGiftType(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)));
        ArrayList<InterfaceC1136020ffU> arrayList = new ArrayList();
        int repeatCount = interfaceC1136020ffU.getRepeatCount();
        if (!C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU))) && !C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateMockMultiMessages small gift ");
            sbLIZ.append(interfaceC1136020ffU.getRepeatCount());
            C1138230fj3.LIZ("GiftQueueModelConverter", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1136020ffU.getRepeatCount() > 1) {
                GiftQueueMessageModel giftQueueMessageModelLIZ = C1135860ffE.LIZ(interfaceC1136020ffU);
                giftQueueMessageModelLIZ.LJII(1);
                C1136240ffq c1136240ffqLJJIFFI = giftQueueMessageModelLIZ.LJJIFFI();
                if (c1136240ffqLJJIFFI != null) {
                    c1136240ffqLJJIFFI.LIZ(giftQueueMessageModelLIZ.getRepeatCount(), giftQueueMessageModelLIZ.getGiftId());
                }
                arrayList.add(giftQueueMessageModelLIZ);
            }
            interfaceC1136020ffU.LJJI().LJIIIZ = repeatCount;
            interfaceC1136020ffU.LJJI().LJIIJ = repeatCount - 1;
            arrayList.add(interfaceC1136020ffU);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("generateMockMultiMessages big gift ");
            sbLIZ2.append(interfaceC1136020ffU.getRepeatCount());
            C1138230fj3.LIZ("GiftQueueModelConverter", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC1136020ffU.LJ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("generateMockMultiMessages time start: ");
            sbLIZ3.append(C158B.LIZ());
            C1138230fj3.LIZ("GiftQueueModelConverter", C2188811AlT.LIZIZ(sbLIZ3));
            int repeatCount2 = interfaceC1136020ffU.getRepeatCount();
            for (int i = 0; i < repeatCount2; i++) {
                GiftQueueMessageModel giftQueueMessageModelLIZ2 = C1135860ffE.LIZ(interfaceC1136020ffU);
                giftQueueMessageModelLIZ2.LJJJIL(System.currentTimeMillis());
                if (i != 0) {
                    giftQueueMessageModelLIZ2.LJJIIJZLJL(false);
                }
                giftQueueMessageModelLIZ2.LJII(1);
                C1136240ffq c1136240ffqLJJIFFI2 = giftQueueMessageModelLIZ2.LJJIFFI();
                if (c1136240ffqLJJIFFI2 != null) {
                    c1136240ffqLJJIFFI2.LIZ(giftQueueMessageModelLIZ2.getRepeatCount(), giftQueueMessageModelLIZ2.getGiftId());
                }
                giftQueueMessageModelLIZ2.LJJI().LJIIIZ = repeatCount;
                giftQueueMessageModelLIZ2.LJJI().LJIIJ = i;
                arrayList.add(giftQueueMessageModelLIZ2);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("generateMockMultiMessages time end: ");
            sbLIZ4.append(C158B.LIZ());
            C1138230fj3.LIZ("GiftQueueModelConverter", C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sb = new StringBuilder("generateMockMultiMessages msgList = ");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((InterfaceC1136020ffU) it2.next()).getMessageId()));
        }
        sb.append(arrayList2);
        C1138230fj3.LIZ("GiftQueueModelConverter", sb.toString());
        InterfaceC1135310feL interfaceC1135310feL = this.LIZIZ;
        if (interfaceC1135310feL != null && arrayList.size() > 1) {
            LJI(arrayList, 0, giftType, interfaceC1135310feL);
            return true;
        }
        for (InterfaceC1136020ffU interfaceC1136020ffU2 : arrayList) {
            if (this.LIZJ || this.LIZLLL || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
                return true;
            }
            LJ(interfaceC1136020ffU2, giftType);
        }
        return true;
    }

    public final void LJII(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (C1135860ffE.LJII(interfaceC1136020ffU)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("needMultiGenerateMsg, receiveGiftMessage id = ");
            sbLIZ.append(interfaceC1136020ffU.getMessageId());
            sbLIZ.append(", gift_type=");
            sbLIZ.append(C1135870ffF.LJII(interfaceC1136020ffU));
            sbLIZ.append(", gift_id=");
            sbLIZ.append(interfaceC1136020ffU.getGiftId());
            sbLIZ.append(", repeat_count=");
            sbLIZ.append(interfaceC1136020ffU.getRepeatCount());
            C1133910fc5.LIZLLL("GiftMessageHandler", C2188811AlT.LIZIZ(sbLIZ));
            C1136380fg4.LIZ.getClass();
            GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
            if (interactiveGiftInfoLJJIII != null && C1134100fcO.LIZ(interfaceC1136020ffU) && interactiveGiftInfoLJJIII.crossScreenRole == 1) {
                ((ConcurrentHashMap) C1136380fg4.LJ).put(Long.valueOf(interactiveGiftInfoLJJIII.uniqId), new C1133660fbg(interfaceC1136020ffU.getRepeatCount()));
            }
        }
        C1135590fen c1135590fen = this.LJI;
        if (c1135590fen != null) {
            boolean z = false;
            if (c1135590fen.LIZJ != null) {
                if (c1135590fen.LJFF) {
                    c1135590fen.LIZLLL(interfaceC1136020ffU);
                    return;
                }
                if (!C1135870ffF.LJIIZILJ(interfaceC1136020ffU)) {
                    c1135590fen.LJ(interfaceC1136020ffU);
                    return;
                }
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
                    c1135590fen.LJ(interfaceC1136020ffU);
                    return;
                }
                for (AbstractC1135650fet abstractC1135650fet : c1135590fen.LIZIZ) {
                    if (abstractC1135650fet.LIZIZ(interfaceC1136020ffU)) {
                        c1135590fen.LJ.put(interfaceC1136020ffU, Long.valueOf(C158B.LIZ()));
                        abstractC1135650fet.LJIIIIZZ(new AwS418S0200000_17(abstractC1135650fet, interfaceC1136020ffU, 110));
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                c1135590fen.LJ(interfaceC1136020ffU);
                return;
            }
            c1135590fen.LIZLLL(interfaceC1136020ffU);
        }
    }

    public static void LJIIIIZZ(InterfaceC1136020ffU interfaceC1136020ffU, EnumC1133020fae enumC1133020fae) {
        if (enumC1133020fae == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip handle gift here, giftType = ");
            sbLIZ.append(enumC1133020fae);
            C1133910fc5.LJ("GiftMessageHandler", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!enumC1133020fae.isStickerRender()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("skip handle gift here, giftType = ");
            sbLIZ2.append(enumC1133020fae);
            C1133910fc5.LJ("GiftMessageHandler", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (enumC1133020fae == EnumC1133020fae.INTERACTIVE_GAME_GIFT) {
            C1133910fc5.LIZLLL("GiftMessageHandler", "skip handle GAME_GIFT here, should handle on TrayQueue dequeue");
            return;
        }
        InterfaceC1133090fal interfaceC1133090falLIZ = C1133210fax.LIZ(interfaceC1136020ffU, enumC1133020fae);
        if (interfaceC1133090falLIZ == null) {
            C1133910fc5.LIZJ("GiftMessageHandler", "handleStickerGiftMessage, no need to render", null);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleStickerGiftMessage, check message if user is anchor passed toID: ");
        sbLIZ3.append(C1135870ffF.LJIJI(interfaceC1136020ffU));
        sbLIZ3.append(" currentID : ");
        sbLIZ3.append(UserService.getInstance().user().getCurrentUserId());
        C1133910fc5.LIZLLL("GiftMessageHandler", C2188811AlT.LIZIZ(sbLIZ3));
        C1136460fgC.LIZ.getClass();
        interfaceC1133090falLIZ.LIZIZ(interfaceC1136020ffU, new C1136470fgD(C1136460fgC.LIZIZ(interfaceC1136020ffU)), null);
    }

    public final void LJ(InterfaceC1136020ffU interfaceC1136020ffU, EnumC1133020fae enumC1133020fae) {
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        C1134950fdl c1134950fdl;
        if (interfaceC1136020ffU == null) {
            return;
        }
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        if (interfaceC1132530fZr != null && (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) != null && (c1133250fb1 = c1131090fXXLIZ.LIZJ) != null && (c1134950fdl = c1133250fb1.LIZIZ) != null) {
            c1134950fdl.LIZJ(interfaceC1136020ffU, null, null);
        }
        LJIIIIZZ(interfaceC1136020ffU, enumC1133020fae);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0418  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.bytedance.android.livesdk.model.message.GiftMessage r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135290feJ.LJIIIZ(com.bytedance.android.livesdk.model.message.GiftMessage, boolean):void");
    }

    public final void LJI(List<? extends InterfaceC1136020ffU> list, int i, EnumC1133020fae enumC1133020fae, InterfaceC1135310feL interfaceC1135310feL) {
        if (i < list.size() && !this.LIZJ && !this.LIZLLL && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            LJ((InterfaceC1136020ffU) ListProtector.get(list, i), enumC1133020fae);
            interfaceC1135310feL.LJ("GiftMessageHandler.dispatchMultiMsg", new AwS22S0401000_17(this, (C1135290feJ) list, (List<? extends InterfaceC1136020ffU>) i, (int) enumC1133020fae, (EnumC1133020fae) interfaceC1135310feL, (InterfaceC1135310feL) 1));
        }
    }
}
