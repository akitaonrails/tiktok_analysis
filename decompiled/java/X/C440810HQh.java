package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C440810HQh extends C2217421BqW implements Function1<EnumC440980HQy, Unit> {
    public C440810HQh(MixStudioResultsBaseAssem mixStudioResultsBaseAssem) {
        super(1, mixStudioResultsBaseAssem, MixStudioResultsPageV2Assem.class, "reportClick", "reportClick(Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/MixStudioEventTracking$ResultPageActionType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC440980HQy enumC440980HQy) {
        ((MixStudioResultsBaseAssem) this.receiver).Ep(enumC440980HQy);
        return Unit.LIZ;
    }
}
