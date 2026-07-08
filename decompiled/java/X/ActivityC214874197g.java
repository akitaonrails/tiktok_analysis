package X;

import android.content.Context;
import android.os.Bundle;
import bsj.a5;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import jv6.a;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.197g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ActivityC214874197g extends AbstractActivityC19422710yn implements InterfaceC2077908Cb {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoKD8nKTElHELIOSJiF9CSc/CCwnITMlPTYSLCQ8PS4nISoiCCwnITMlPTY=";

    public String LLLLZI() {
        return null;
    }

    public boolean LLLLZIL() {
        return this instanceof FTCVideoRecordNewActivity;
    }

    public String getCreationId() {
        return null;
    }

    public C1202330hOR LLLLLZL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJFF;
    }

    @Override // X.InterfaceC2077908Cb
    public final Analysis getAnalysis() {
        String strLLLLZI = LLLLZI();
        if (strLLLLZI == null || strLLLLZI.length() <= 0) {
            return null;
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName(LLLLZI());
        analysis.setCreationId(getCreationId());
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            context = i18nServiceApi.LIZ().LIZJ(context);
        }
        a.install(context);
        super.attachBaseContext(context);
    }

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(new AwS611S0100000_32(this, 323));
        super.onCreate(bundle);
        if (a5.LIZ()) {
            getWindow().addFlags(128);
        }
        getLifecycle().addObserver(new AnalysisActivityComponent(this, this));
    }
}
