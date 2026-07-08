package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0M0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561550M0r {
    public static final C561550M0r LIZ = new C561550M0r();

    public static void LIZ(C19EG c19eg) {
        String strLIZJ;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        InterfaceC528120KnS interfaceC528120KnSLIZIZ;
        String strLIZ;
        InterfaceC1429470nIn interfaceC1429470nInLJFF2;
        InterfaceC528120KnS interfaceC528120KnSLIZIZ2;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.p5, null, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.rit);
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        String str = "";
        if (iAiChatFeatureService == null || (interfaceC1429470nInLJFF2 = iAiChatFeatureService.LJFF()) == null || (interfaceC528120KnSLIZIZ2 = interfaceC1429470nInLJFF2.LIZIZ()) == null || (strLIZJ = interfaceC528120KnSLIZIZ2.LIZJ()) == null) {
            strLIZJ = "";
        }
        textView.setText(strLIZJ);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        IAiChatFeatureService iAiChatFeatureService2 = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService2 != null && (interfaceC1429470nInLJFF = iAiChatFeatureService2.LJFF()) != null && (interfaceC528120KnSLIZIZ = interfaceC1429470nInLJFF.LIZIZ()) != null && (strLIZ = interfaceC528120KnSLIZIZ.LIZ()) != null) {
            str = strLIZ;
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = viewTd;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLLL = true;
        tuxSheet2.LLJLILLLLZIIL = true;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJI = numLIZJ;
        tuxSheet3.show(c19eg.getSupportFragmentManager(), "AiChat");
        c1251150ifB.LIZJ(new AwS552S0100000_8(tuxSheet3, 822));
    }
}
