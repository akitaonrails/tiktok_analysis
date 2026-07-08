package Y;

import X.C18VN;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.tools.chat.message.cell.aigenimagecell.AIGenImageAssem;

/* JADX INFO: loaded from: classes33.dex */
public class ACListenerS65S1200000_32 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final void onClick$0(ACListenerS65S1200000_32 aCListenerS65S1200000_32, View view) {
        Context context;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(((AIGenImageAssem) aCListenerS65S1200000_32.l1).getContext(), "AIGenImageAssem_click_post_btn", true) && (context = ((AIGenImageAssem) aCListenerS65S1200000_32.l1).getContext()) != null) {
            AIGenImageAssem aIGenImageAssem = (AIGenImageAssem) aCListenerS65S1200000_32.l1;
            String str = aCListenerS65S1200000_32.s0;
            AIChatGenNode aIChatGenNode = (AIChatGenNode) aCListenerS65S1200000_32.l2;
            C18VN c18vn = (C18VN) aIGenImageAssem.LLJZ.getValue();
            if (c18vn != null) {
                c18vn.KX(context, str, "chat_page", aIChatGenNode);
            }
        }
    }

    public static final void onClick$1(ACListenerS65S1200000_32 aCListenerS65S1200000_32, View view) {
        C18VN c18vn = (C18VN) ((AIGenImageAssem) aCListenerS65S1200000_32.l1).LLJZ.getValue();
        if (c18vn != null) {
            c18vn.Fg0(((AIGenImageAssem) aCListenerS65S1200000_32.l1).LJJIJL().getContext(), aCListenerS65S1200000_32.s0, ".png", "chat_page", (AIChatGenNode) aCListenerS65S1200000_32.l2);
        }
    }

    public ACListenerS65S1200000_32(AIGenImageAssem aIGenImageAssem, String str, AIChatGenNode aIChatGenNode, int i) {
        this.$t = i;
        this.l1 = aIGenImageAssem;
        this.s0 = str;
        this.l2 = aIChatGenNode;
    }
}
