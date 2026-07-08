package X;

import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1863100yaC extends C2217421BqW implements InterfaceC1631630sYr<String, String, Integer, String, Unit> {
    public C1863100yaC(Object obj) {
        super(4, obj, TakoOnboardingAssem.class, "cellShowMob", "cellShowMob(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, Integer num, String str3) throws JSONException {
        int iIntValue = num.intValue();
        ((TakoOnboardingAssem) this.receiver).ip(iIntValue, str, str2, str3);
        return Unit.LIZ;
    }
}
