package Y;

import X.C09JN;
import X.C1043010dFT;
import X.C1159460gHI;
import X.C1159680gHe;
import X.C1C7U;
import X.C742100T9c;
import androidx.lifecycle.LiveData;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsCacheConfig;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S0201000_2;

/* JADX INFO: loaded from: classes19.dex */
public class AfS84S0101000_18 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS84S0101000_18 afS84S0101000_18, Object obj) {
        C1C7U.LIZ("RavenFragment@d0e1.performInsert$disposable$3");
        Throwable th = (Throwable) obj;
        ((RavenFragment) afS84S0101000_18.l0).zT("performInsert error");
        RavenFragment ravenFragment = (RavenFragment) afS84S0101000_18.l0;
        ravenFragment.LLL = false;
        ravenFragment.LLLFZ = false;
        ravenFragment.hS();
        ((RavenFragment) afS84S0101000_18.l0).uT("performInsert error", true);
        ((RavenFragment) afS84S0101000_18.l0).hT("performInsert error");
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS129S0201000_2(afS84S0101000_18.i1, (int) th, (Throwable) afS84S0101000_18.l0, (RavenFragment<Object>) 2));
        ((RavenFragment) afS84S0101000_18.l0).yS().onError(th);
        C1C7U.LIZIZ("RavenFragment@d0e1.performInsert$disposable$3");
    }

    public static final void accept$1(AfS84S0101000_18 afS84S0101000_18, Object obj) {
        C1C7U.LIZ("ManageTopicsContentRepository@1168.updatePreferences$1");
        ManageTopicsResponse manageTopicsResponse = (ManageTopicsResponse) obj;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel = ManageTopicsCacheConfig.LIZ;
        ManageTopicsCacheConfig.ManageTopicsCacheModel manageTopicsCacheModel2 = (ManageTopicsCacheConfig.ManageTopicsCacheModel) settingsManagerLIZLLL.LJIIIIZZ("manage_topics_cache_config", ManageTopicsCacheConfig.ManageTopicsCacheModel.class, manageTopicsCacheModel);
        if (manageTopicsCacheModel2 != null) {
            manageTopicsCacheModel = manageTopicsCacheModel2;
        }
        if (manageTopicsCacheModel.enable) {
            C1159680gHe.LIZJ = manageTopicsResponse;
            C1159680gHe.LIZLLL = System.currentTimeMillis();
        }
        C742100T9c c742100T9c = C742100T9c.LIZ;
        C1159460gHI c1159460gHI = new C1159460gHI(manageTopicsResponse, afS84S0101000_18.i1);
        c742100T9c.getClass();
        ((LiveData) C742100T9c.LIZIZ.getValue()).postValue(c1159460gHI);
        Function0 function0 = (Function0) afS84S0101000_18.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("ManageTopicsContentRepository@1168.updatePreferences$1");
    }

    public AfS84S0101000_18(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
