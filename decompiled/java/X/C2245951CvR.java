package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.PostRollAbModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245951CvR extends C09AY implements Function0<PostRollAbModel> {
    public C2245951CvR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.feed.assem.midad.PostRollAbModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PostRollAbModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PostRollAbModel postRollAbModel = C2245941CvQ.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("post_roll_experience_opti", PostRollAbModel.class, postRollAbModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : postRollAbModel;
    }
}
