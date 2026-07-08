package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoFloatingSugAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS121S1200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yP5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856210yP5 extends C09AY implements InterfaceC1631620sYq<UIAssem, C291001Au<? extends Integer>, C1856430yPR, Unit> {
    public final /* synthetic */ TakoFloatingSugAssem LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;
    public final /* synthetic */ TuxTextView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856210yP5(TakoFloatingSugAssem takoFloatingSugAssem, TuxTextView tuxTextView, SmartImageView smartImageView, TuxTextView tuxTextView2) {
        super(3);
        this.LL = takoFloatingSugAssem;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = smartImageView;
        this.LLILZ = tuxTextView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Integer> c291001Au, C1856430yPR c1856430yPR) {
        Map<String, String> commonParams;
        String str;
        List list;
        Map<String, String> mapLJ;
        String str2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1856430yPR c1856430yPR2 = c1856430yPR;
        if (C1697810uHb.LJIIJJI(4, 6).contains(Integer.valueOf(((Number) c291001Au.LIZ).intValue())) && c1856430yPR2 != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            TakoSug takoSug = c1856430yPR2.LLILLJJLI;
            String str3 = takoSug.sugFloatingContent;
            Map<String, String> map = takoSug.passExtra;
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LL.LLJJIII.getValue();
            String str4 = null;
            if (iTakoContextAbility != null) {
                commonParams = iTakoContextAbility.getCommonParams();
            } else {
                commonParams = null;
            }
            c1862330yYx.getClass();
            C13MK.LIZJ("mob:guide_bar_show", "tikbot_guide_bar_show", new AwS121S1200000_4(str3, (String) map, commonParams, (Map<String, String>) 3));
            TakoFloatingSugAssem takoFloatingSugAssem = this.LL;
            takoFloatingSugAssem.LLJJIJIIJIL = c1856430yPR2;
            ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) takoFloatingSugAssem.LLJJIII.getValue();
            if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                str4 = c1863850ybP.LL;
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            if (Intrinsics.LJFF(str4, "notification_page_tikbot")) {
                TuxTextView tuxTextView = this.LLILLJJLI;
                C786410Ut5.LLFF(8, this.LLILLL);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
                String str6 = c1856430yPR2.LLJI;
                if (str6 != null) {
                    str5 = str6;
                }
                tuxTextView.setText(str5);
            } else {
                SmartImageView smartImageView = this.LLILLL;
                TuxTextView tuxTextView2 = this.LLILLJJLI;
                TakoFloatingSugAssem takoFloatingSugAssem2 = this.LL;
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                C786410Ut5.LLFF(0, smartImageView);
                BaseImage baseImage = c1856430yPR2.LLIZLLLIL;
                if (baseImage == null || (str = baseImage.imageId) == null) {
                    str = "";
                }
                if (baseImage == null || (list = baseImage.urlList) == null) {
                    list = C13BV.INSTANCE;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(str, list));
                c1331670kl3LJIIIIZZ.LIZLLL("TakoSugListCardAssem");
                int width = smartImageView.getWidth();
                int height = smartImageView.getHeight();
                c1331670kl3LJIIIIZZ.LJIIIIZZ = width;
                c1331670kl3LJIIIIZZ.LJIIIZ = height;
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(8);
                c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) takoFloatingSugAssem2.LLJJIII.getValue();
                if (iTakoContextAbility3 == null || (mapLJ = iTakoContextAbility3.getCommonParams()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                BaseImage baseImage2 = c1856430yPR2.LLIZLLLIL;
                if (baseImage2 != null && (str2 = baseImage2.imageId) != null) {
                    str5 = str2;
                }
                c1331670kl3LJIIIIZZ.LJJJIL = new C1338340kvo(smartImageView, "floating_sug", str5, mapLJ);
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            this.LLILZ.setText(c1856430yPR2.LLJ);
        }
        return Unit.LIZ;
    }
}
