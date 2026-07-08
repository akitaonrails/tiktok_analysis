package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.AbstractC20356314kz;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C19748512Ol;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C5183020f;
import X.C915980Zwa;
import X.C930540aK4;
import X.C937280aUw;
import X.C946060aj6;
import X.C961760b8Q;
import X.EnumC1779270wOz;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class DesignatedGiftEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("designated_gift", 0, 39000003, 1, Collections.singletonList("always_true"), null, 26608);
    public String LLJJJJLIIL;

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV;
        String str;
        String strLJIJJ;
        Gift giftFindGiftById;
        DesignatedGiftConfig designatedGiftConfig = (DesignatedGiftConfig) C937280aUw.LIZJ(DesignatedGiftConfig.class, c20424814w2.LJII, new DesignatedGiftConfig(0L, "", C1697810uHb.LJIIJJI("https://p16-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png", "https://p19-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png")));
        this.LLJJJJLIIL = String.valueOf(designatedGiftConfig.giftId);
        List<String> list = designatedGiftConfig.giftImageUrls;
        if (!list.isEmpty()) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5183020f((List) list, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 270), null, null, 0.6f, 111);
        } else {
            c20365714mV = null;
        }
        if (designatedGiftConfig.giftId == 0) {
            strLJIJJ = C497740JfY.LJIJI(2131853676);
        } else {
            if (!C915980Zwa.LIZLLL().AR0() || (giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(designatedGiftConfig.giftId)) == null || (str = giftFindGiftById.name) == null) {
                str = designatedGiftConfig.giftName;
            }
            strLJIJJ = C497740JfY.LJIJJ(2131853677, str);
        }
        return new C20361314ln(strLJIJJ, "Designated gift", R.drawable.chq, 0, null, c20365714mV, i, EnumC1779270wOz.DRAWABLE, C930540aK4.LIZJ(), null, 3608);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJI(c20361214lm.LIZIZ, GsonProtectorUtils.toJson(C19748512Ol.LIZJ, new DesignatedGiftConfig(0L, "", C1697810uHb.LJIIJJI("https://p16-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png", "https://p19-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png"))), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        Object objLIZJ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 101));
        String str4 = c20361214lm.LJI;
        if (str4 != null && !a0.LJJJIL(str4)) {
            objLIZJ = C937280aUw.LIZJ(DesignatedGiftConfig.class, str4, new DesignatedGiftConfig(0L, "", C1697810uHb.LJIIJJI("https://p16-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png", "https://p19-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png")));
        } else {
            objLIZJ = null;
        }
        C946060aj6 c946060aj6 = new C946060aj6(objLIZJ, str3, new AwS293S0300000_15(this, (DesignatedGiftEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 0), null, new AwS559S0100000_15(this, 102), new AwS224S0300000_15(this, (DesignatedGiftEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 2), null, new AwS224S0300000_15(this, (DesignatedGiftEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 3), false, this.LLIZ, null, null, 13976);
        PlayEntityUtilKt.LJFF(this, c20361214lm, interfaceC20354714kj, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.LC0(MatchOpenDesignatedGiftPanelEvent.class, new C961760b8Q(c946060aj6));
        }
    }
}
