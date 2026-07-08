package X;

import com.ss.android.ugc.aweme.tako.startup.onboarding.ui.TakoOnboardingAssem;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ya7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1863050ya7 extends C2217421BqW implements InterfaceC1631620sYq<String, String, Integer, Unit> {
    public C1863050ya7(Object obj) {
        super(3, obj, TakoOnboardingAssem.class, "onListCellClickFunc", "onListCellClickFunc(Ljava/lang/String;Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, Integer num) throws JSONException {
        int iIntValue = num.intValue();
        ((TakoOnboardingAssem) this.receiver).op(iIntValue, str, str2);
        return Unit.LIZ;
    }
}
