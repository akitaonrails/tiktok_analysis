package Y;

import X.C0RF0;
import X.C1336205Ku;
import X.C1618440sDa;
import X.C424420Gka;
import X.EnumC896890ZGl;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC714600S1i;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssem;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssemV2;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IQuickDmService;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS12S1101000_11 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS12S1101000_11 aCListenerS12S1101000_11, View view) {
        int iIntValue;
        Integer numValueOf;
        Fragment fragment;
        QuickDMEntranceAssem quickDMEntranceAssem = (QuickDMEntranceAssem) aCListenerS12S1101000_11.l1;
        String str = aCListenerS12S1101000_11.s0;
        int i = aCListenerS12S1101000_11.i2;
        quickDMEntranceAssem.getClass();
        C424420Gka.LIZ().LIZJ(str);
        if (quickDMEntranceAssem.Ep() == EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE) {
            quickDMEntranceAssem.Qp(str);
            InterfaceC714600S1i quickReplyAnalytics = ((IIMService) quickDMEntranceAssem.LLLF.getValue()).getQuickReplyAnalytics();
            String str2 = quickDMEntranceAssem.LLLFFI;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC1731706qJ interfaceC1731706qJ = quickDMEntranceAssem.LLJZ;
            InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = QuickDMEntranceAssem.LLLIIII;
            quickReplyAnalytics.LJI(((VideoExposeSharerInformationVM) quickDMEntranceAssem.LLJZ.getValue(quickDMEntranceAssem, interfaceC2217461BqaArr[0])).zQ2(), str2, "emoji", ((VideoExposeSharerInformationVM) interfaceC1731706qJ.getValue(quickDMEntranceAssem, interfaceC2217461BqaArr[0])).AQ2());
        } else {
            Map map = (Map) quickDMEntranceAssem.LLLII.getValue();
            Integer numValueOf2 = Integer.valueOf(i);
            Integer num = (Integer) ((Map) quickDMEntranceAssem.LLLII.getValue()).get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(numValueOf2, Integer.valueOf(iIntValue + 1));
            Integer num2 = (Integer) ((Map) quickDMEntranceAssem.LLLII.getValue()).get(Integer.valueOf(i));
            if (num2 != null && num2.intValue() > 3) {
                return;
            }
            quickDMEntranceAssem.Qp(str);
            quickDMEntranceAssem.Vp();
        }
        IQuickDmService quickDmService = C1336205Ku.LIZ(false).getQuickDmService();
        C0RF0 c0rf0 = quickDMEntranceAssem.jm().LIZLLL;
        if (c0rf0 != null && (fragment = c0rf0.LIZJ) != null) {
            numValueOf = Integer.valueOf(fragment.hashCode());
        } else {
            numValueOf = null;
        }
        quickDmService.onQuickReplyEmojiSendAnimations(view, str, numValueOf, new AwS555S0100000_11(quickDMEntranceAssem, 1677));
        C1618440sDa.LIZIZ.LJJLIIIJL().LJ(view, null, null);
    }

    public static final void onClick$1(ACListenerS12S1101000_11 aCListenerS12S1101000_11, View view) {
        int iIntValue;
        QuickDMEntranceAssemV2 quickDMEntranceAssemV2 = (QuickDMEntranceAssemV2) aCListenerS12S1101000_11.l1;
        String str = aCListenerS12S1101000_11.s0;
        int i = aCListenerS12S1101000_11.i2;
        quickDMEntranceAssemV2.getClass();
        C424420Gka.LIZ().LIZJ(str);
        if (quickDMEntranceAssemV2.Ep() == EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE) {
            quickDMEntranceAssemV2.Jp(str);
            InterfaceC714600S1i quickReplyAnalytics = ((IIMService) quickDMEntranceAssemV2.LLLF.getValue()).getQuickReplyAnalytics();
            String str2 = quickDMEntranceAssemV2.LLLFFI;
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC1731706qJ interfaceC1731706qJ = quickDMEntranceAssemV2.LLJZ;
            InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = QuickDMEntranceAssemV2.LLLIIII;
            quickReplyAnalytics.LJI(((VideoExposeSharerInformationVM) quickDMEntranceAssemV2.LLJZ.getValue(quickDMEntranceAssemV2, interfaceC2217461BqaArr[0])).zQ2(), str2, "emoji", ((VideoExposeSharerInformationVM) interfaceC1731706qJ.getValue(quickDMEntranceAssemV2, interfaceC2217461BqaArr[0])).AQ2());
        } else {
            Map map = (Map) quickDMEntranceAssemV2.LLLII.getValue();
            Integer numValueOf = Integer.valueOf(i);
            Integer num = (Integer) ((Map) quickDMEntranceAssemV2.LLLII.getValue()).get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(numValueOf, Integer.valueOf(iIntValue + 1));
            Integer num2 = (Integer) ((Map) quickDMEntranceAssemV2.LLLII.getValue()).get(Integer.valueOf(i));
            if (num2 != null && num2.intValue() > 3) {
                return;
            }
            quickDMEntranceAssemV2.Jp(str);
            quickDMEntranceAssemV2.Qp();
        }
        C1336205Ku.LIZ(false).getQuickDmService().onQuickReplyEmojiSendAnimations(view, str, null, new AwS555S0100000_11(quickDMEntranceAssemV2, 1678));
        C1618440sDa.LIZIZ.LJJLIIIJL().LJ(view, null, null);
    }

    public ACListenerS12S1101000_11(Object obj, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
