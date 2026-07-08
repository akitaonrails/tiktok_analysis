package X;

import android.content.Context;
import com.larus.business.markdown.api.model.CodeBlockConfig;
import com.larus.business.markdown.api.model.CodeStyle;
import com.larus.business.markdown.api.model.TableConfig;
import com.larus.business.markdown.api.model.TitleStyle;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0yV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859890yV1 {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final Regex LIZJ;

    static {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(111);
        LIZ = (int) C445120Hcs.LIZJ(Float.valueOf(c444890HcV.getTextSize()));
        LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        LIZJ = new Regex("<data-inline\\s+([^>]*?)\\s*(?:\\/>|>(.*?)<\\/data-inline>)");
    }

    public static final C21419418s4 LIZ(C328660CuW c328660CuW, InterfaceC665370Q7z interfaceC665370Q7z) {
        C21419418s4 c21419418s4LIZ;
        int iIntValue;
        boolean z;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        Message messageLI2;
        ISearchMarkdownService iSearchMarkdownService = (ISearchMarkdownService) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownService.class, false, false, false, 14, null);
        if (iSearchMarkdownService == null || (c21419418s4LIZ = iSearchMarkdownService.LIZ(c328660CuW.getContext())) == null) {
            return null;
        }
        int i = LIZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c328660CuW.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C21408418qI c21408418qILJII = null;
        ISearchMarkdownService iSearchMarkdownService2 = (ISearchMarkdownService) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownService.class, false, false, false, 14, null);
        if (iSearchMarkdownService2 != null) {
            Context context = c328660CuW.getContext();
            int iLIZIZ = ((int) (((double) C497820Jfg.LIZIZ(c328660CuW.getContext())) * 0.85d)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            int i2 = LIZIZ;
            if (iLIZIZ < i2) {
                iLIZIZ = i2;
            }
            c21408418qILJII = iSearchMarkdownService2.LJII(iLIZIZ, context);
        }
        CommerceAgentCardAbility commerceAgentCardAbility = (CommerceAgentCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, CommerceAgentCardAbility.class, null);
        if (commerceAgentCardAbility != null && (messageLI2 = commerceAgentCardAbility.LI2()) != null && C321730CjL.LIZJ(messageLI2)) {
            z = true;
        } else {
            z = false;
        }
        TitleStyle titleStyle = TitleStyle.TAKO;
        int iLIZIZ2 = C497820Jfg.LIZIZ(c328660CuW.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        int i3 = LIZIZ;
        if (iLIZIZ2 < i3) {
            iLIZIZ2 = i3;
        }
        CodeBlockConfig codeBlockConfig = new CodeBlockConfig(null, null, 0, false, "", false, null, titleStyle, CodeStyle.NORMAL, null, null, null, 0, null, false, false, null, Integer.valueOf(iLIZIZ2), null, null, 1.5f);
        String string = c328660CuW.getContext().getString(2131849684);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, c328660CuW.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, c328660CuW.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.zr, c328660CuW.getContext());
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a03, c328660CuW.getContext());
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1p, c328660CuW.getContext());
        if (numLIZJ6 != null) {
            iIntValue6 = numLIZJ6.intValue();
        } else {
            iIntValue6 = 0;
        }
        return C21419418s4.LIZ(c21419418s4LIZ, null, 0, true, 0.0f, 0, 0, 0, null, c21408418qILJII, listLJIIJJI, null, null, null, false, null, 0, false, false, iIntValue, true, null, null, z, null, codeBlockConfig, new TableConfig(false, null, null, null, null, null, null, null, null, string, 0, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Float.valueOf(fLIZIZ), false, Integer.valueOf(iIntValue6), false, true, titleStyle, null, null, true), false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1074136065, 16777110);
    }
}
