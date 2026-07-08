package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightActionData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0MTI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MTI implements InterfaceC1599360rio {
    public StoryCelebrationInboxParam LIZ;
    public String LIZIZ;
    public int LIZJ;
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC1599360rio
    public final void LIZIZ(C1599370rip c1599370rip) {
    }

    @Override // X.InterfaceC1599360rio
    public final void LIZJ(C1599370rip c1599370rip) {
    }

    @Override // X.InterfaceC1599360rio
    public final Map<String, String> LIZ() {
        Integer num;
        int i = this.LIZJ;
        if (i != 0) {
            this.LIZLLL.put("story_theme", C0MLA.LIZ(Integer.valueOf(i)));
            Map<String, String> map = this.LIZLLL;
            StoryCelebrationInboxParam storyCelebrationInboxParam = this.LIZ;
            map.put("cover_type", String.valueOf((storyCelebrationInboxParam == null || (num = storyCelebrationInboxParam.coverType) == null) ? -1 : num.intValue()));
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1599360rio
    public final boolean LIZLLL(C0MTL c0mtl) {
        List<SkylightActionData> list;
        SkylightActionData skylightActionData;
        String str;
        TemplateData templateData = c0mtl.LIZ.templateData;
        if (templateData != null && (list = templateData.actionData) != null && (skylightActionData = (SkylightActionData) ListProtector.get(list, 0)) != null && (str = skylightActionData.schemaUrl) != null) {
            SmartRouter.buildRoute(c0mtl.LIZIZ.getContext(), str).open();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0MQA(this, c0mtl, null), 3);
        return true;
    }

    @Override // X.InterfaceC1599360rio
    public final void LJ(C1599370rip c1599370rip, View view) {
        StoryCelebrationInboxParam storyCelebrationInboxParamLIZ;
        int iIntValue;
        SkylightData skylightData = c1599370rip.LIZ;
        if (skylightData != null && (storyCelebrationInboxParamLIZ = C0MTJ.LIZ(skylightData)) != null) {
            this.LIZ = storyCelebrationInboxParamLIZ;
            this.LIZIZ = storyCelebrationInboxParamLIZ.uniqueId;
            Integer num = storyCelebrationInboxParamLIZ.celebrationType;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LIZJ = iIntValue;
        }
    }
}
