package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* JADX INFO: renamed from: X.0L82, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L82 {
    public final Activity LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Intent LIZLLL;
    public final CutsameDataItem LJ;
    public final AVMusic LJFF;
    public final String LJI;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit LIZ() {
        /*
            Method dump skipped, instruction units count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L82.LIZ():kotlin.Unit");
    }

    public static void LIZJ(Activity activity) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131834214);
        C1390380mHk.LIZ(activity, 1025, creativeToastBuilder);
    }

    public static void LIZIZ(CutsameDataItem cutsameDataItem, long j, int i, String str) {
        C0L95 c0l95;
        ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        if (iTemplateMobService != null) {
            String str2 = cutsameDataItem.templateId;
            Integer numValueOf = Integer.valueOf(cutsameDataItem.templateType);
            String str3 = cutsameDataItem.templateUrl;
            if (cutsameDataItem.isMvAnchor == 1) {
                c0l95 = C0L95.ANCHOR;
            } else {
                c0l95 = C0L95.TEMPLATE_TAB;
            }
            iTemplateMobService.LJIIIZ(str2, numValueOf, str3, c0l95.getValue(), Long.valueOf(j), Integer.valueOf(i), str, null, false);
        }
    }

    public C0L82(Activity activity, int i, int i2, Intent intent, CutsameDataItem cutsameDataItem, AVMusic aVMusic, String str) {
        this.LIZ = activity;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = intent;
        this.LJ = cutsameDataItem;
        this.LJFF = aVMusic;
        this.LJI = str;
    }
}
