package com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect;

import X.AnonymousClass0951;
import X.C1133830fbx;
import X.C13BV;
import X.C13LP;
import X.C1557510qdJ;
import X.C1557530qdL;
import X.C156900it;
import X.C1697810uHb;
import X.C2252321DDq;
import X.C497740JfY;
import X.C766270U4b;
import X.C914740Zua;
import X.C946050aj5;
import X.C946060aj6;
import X.C974350bSj;
import X.C978520bZS;
import X.C978560bZW;
import X.InterfaceC963450bB9;
import X.InterfaceC973730bRj;
import X.InterfaceC975810bV5;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGiftPanelBehaviorOpt;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchOnlyGiftViewModel extends ViewModel {
    public final boolean LL;
    public final InterfaceC963450bB9 LLILLJJLI;
    public final C946060aj6<DesignatedGiftConfig> LLILLL;
    public final DataChannel LLILZ;
    public final C914740Zua LLILZIL;
    public final InterfaceC973730bRj LLILZLL;
    public final InterfaceC975810bV5 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final Set<Integer> LLJ;
    public final AnonymousClass0951 LLJI;
    public List<GiftMode> LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;

    public final void yQ2() {
        List<GiftMode> listLIZLLL;
        Object value;
        C946060aj6<DesignatedGiftConfig> c946060aj6 = this.LLILLL;
        GiftMode giftMode = null;
        DesignatedGiftConfig designatedGiftConfigLIZ = c946060aj6 != null ? c946060aj6.LIZ() : null;
        if (this.LLILLL == null || designatedGiftConfigLIZ == null) {
            return;
        }
        InterfaceC975810bV5 interfaceC975810bV5 = this.LLIZ;
        if (interfaceC975810bV5 != null && (listLIZLLL = interfaceC975810bV5.LIZLLL()) != null) {
            Iterator<GiftMode> it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                GiftMode next = it2.next();
                if (next.giftId == designatedGiftConfigLIZ.giftId) {
                    giftMode = next;
                    break;
                }
            }
            GiftMode giftMode2 = giftMode;
            if (giftMode2 != null) {
                InterfaceC975810bV5 interfaceC975810bV52 = this.LLIZ;
                if (interfaceC975810bV52 != null) {
                    interfaceC975810bV52.LJJIIJZLJL(giftMode2, false, true);
                }
                C2252321DDq c2252321DDq = this.LLIZLLLIL;
                do {
                    value = c2252321DDq.getValue();
                } while (!c2252321DDq.compareAndSet(value, C978560bZW.LIZ((C978560bZW) value, giftMode2.giftId)));
            }
        }
        C978520bZS.LJIJJ(designatedGiftConfigLIZ.giftId);
    }

    public final void wQ2() {
        Object value;
        List<GiftMode> list;
        int i;
        boolean z;
        int i2;
        List listLJII = C156900it.LJII(C156900it.LJI());
        List<GiftMode> listLIZIZ = C978520bZS.LIZIZ();
        this.LLJILJILJ = C156900it.LIZ();
        this.LLJILJIL = listLJII.size();
        this.LLJIJIL = C13LP.LJLIL(listLIZIZ, listLJII);
        ArrayList arrayList = new ArrayList();
        if ((listLJII.isEmpty() ^ true) && this.LLILLL == null && C156900it.LJIIJ()) {
            arrayList.add(new C1557510qdJ(2131853765));
            int i3 = 0;
            for (Object obj : listLJII) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                GiftMode giftMode = (GiftMode) obj;
                arrayList.add(new C1557530qdL(giftMode, true, this.LLJILJILJ, i3, xQ2(giftMode, true)));
                i3 = i4;
            }
            arrayList.add(new C1557510qdJ(2131853768));
        }
        int i5 = 0;
        for (GiftMode giftMode2 : listLIZIZ) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            GiftMode giftMode3 = giftMode2;
            arrayList.add(new C1557530qdL(giftMode3, false, true, this.LLJILJIL + i5, xQ2(giftMode3, false)));
            i5 = i6;
        }
        InterfaceC975810bV5 interfaceC975810bV5 = this.LLIZ;
        long jLIZIZ = interfaceC975810bV5 != null ? interfaceC975810bV5.LIZIZ() : 0L;
        if (this.LLJILJILJ && jLIZIZ == 0 && (!listLJII.isEmpty())) {
            GiftMode giftMode4 = (GiftMode) C13LP.LJJJJZI(listLJII);
            jLIZIZ = giftMode4.giftId;
            InterfaceC975810bV5 interfaceC975810bV52 = this.LLIZ;
            if (interfaceC975810bV52 != null) {
                interfaceC975810bV52.LJJIIJZLJL(giftMode4, this.LL, true);
            }
            C978520bZS.LJIJJLI(giftMode4);
            InterfaceC973730bRj interfaceC973730bRj = this.LLILZLL;
            if (interfaceC973730bRj != null) {
                interfaceC973730bRj.LJJLJ(giftMode4);
            }
        }
        C2252321DDq c2252321DDq = this.LLIZLLLIL;
        do {
            value = c2252321DDq.getValue();
            list = this.LLJIJIL;
            C914740Zua c914740Zua = this.LLILZIL;
            if (c914740Zua != null) {
                Iterator<GiftMode> it2 = list.iterator();
                i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (it2.next().giftId == c914740Zua.LIZIZ) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                i = -1;
            }
            z = this.LLJILJILJ;
            i2 = this.LLJILJIL;
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C978560bZW(list, arrayList, jLIZIZ, i, z, i2)));
    }

    public final void vQ2(int i) {
        Object value;
        C946050aj5 c946050aj5LIZIZ;
        List urls;
        if (i >= 0 && i < this.LLJIJIL.size()) {
            if (i < this.LLJILJIL && !this.LLJILJILJ) {
                C766270U4b.LIZLLL(C156900it.LJ(true));
                return;
            }
            GiftMode giftMode = (GiftMode) ListProtector.get(this.LLJIJIL, i);
            InterfaceC973730bRj interfaceC973730bRj = this.LLILZLL;
            if (interfaceC973730bRj != null) {
                interfaceC973730bRj.LJJLJ(giftMode);
            }
            InterfaceC975810bV5 interfaceC975810bV5 = this.LLIZ;
            if (interfaceC975810bV5 != null) {
                interfaceC975810bV5.LJJIIJZLJL(giftMode, this.LL, true);
            }
            C978520bZS.LJIJJLI(giftMode);
            InterfaceC973730bRj interfaceC973730bRj2 = this.LLILZLL;
            if (interfaceC973730bRj2 != null) {
                interfaceC973730bRj2.LJJLJ(giftMode);
            }
            C946060aj6<DesignatedGiftConfig> c946060aj6 = this.LLILLL;
            if (c946060aj6 != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
                long j = giftMode.giftId;
                String str = giftMode.giftName;
                ImageModel imageModel = giftMode.giftIconImage;
                if (imageModel == null || (urls = imageModel.getUrls()) == null) {
                    urls = C13BV.INSTANCE;
                }
                c946050aj5LIZIZ.LIZ(new DesignatedGiftConfig(j, str, urls));
            }
            C2252321DDq c2252321DDq = this.LLIZLLLIL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C978560bZW.LIZ((C978560bZW) value, giftMode.giftId)));
            if (this.LLILLL != null) {
                C974350bSj.LJFF(this.LLILZ, "preview", String.valueOf(giftMode.giftId));
            }
        }
    }

    public final String xQ2(GiftMode giftMode, boolean z) {
        int iLJ;
        Text text;
        String str = "";
        if (LiveMatchGiftPanelBehaviorOpt.INSTANCE.isEnable() && giftMode.giftId != 0 && (text = giftMode.customDescription) != null) {
            String string = C1133830fbx.LJIILIIL(text, "").toString();
            if (string.length() > 0) {
                return string;
            }
        }
        if (z) {
            if (this.LLJILJILJ) {
                iLJ = 2131853766;
            } else {
                iLJ = C156900it.LJ(false);
            }
            return C497740JfY.LJIJI(iLJ);
        }
        if (giftMode.giftId == 0) {
            return C497740JfY.LJIJI(2131843047);
        }
        Object[] objArr = new Object[1];
        String str2 = giftMode.giftName;
        if (str2 != null) {
            str = str2;
        }
        objArr[0] = str;
        return C497740JfY.LJIJJ(2131843048, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[PHI: r5
      0x0099: PHI (r5v2 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) = 
      (r5v1 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode)
      (r5v3 com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode)
     binds: [B:21:0x0094, B:23:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MatchOnlyGiftViewModel(boolean r13, X.InterfaceC963450bB9 r14, X.C946060aj6<com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftConfig> r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, X.C914740Zua r17) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel.<init>(boolean, X.0bB9, X.0aj6, com.bytedance.ies.sdk.datachannel.DataChannel, X.0Zua):void");
    }
}
