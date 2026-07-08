package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0srT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643170srT implements InterfaceC1643320sri {
    public final /* synthetic */ OptionCategoryViewModel LIZ;
    public final /* synthetic */ C1643220srY LIZIZ;

    @Override // X.InterfaceC1643320sri
    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        String strName;
        this.LIZ.LLIZLLLIL.setValue(C1643010srD.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to select Green Screen data {");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(".optionName} with ");
        if (uIAnnotationErrorCode != null) {
            strName = uIAnnotationErrorCode.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("OptionCategoryPanelViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1643320sri
    public final void LIZIZ(Pair<Integer, Integer> pair) {
        this.LIZ.LLIZLLLIL.setValue(new C1643000srC(pair));
    }

    public C1643170srT(OptionCategoryViewModel optionCategoryViewModel, C1643220srY c1643220srY) {
        this.LIZ = optionCategoryViewModel;
        this.LIZIZ = c1643220srY;
    }
}
