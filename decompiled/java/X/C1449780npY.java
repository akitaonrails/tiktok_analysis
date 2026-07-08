package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS81S0500000_22;

/* JADX INFO: renamed from: X.0npY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449780npY {
    public final EditEffectAnchorManager LIZ;
    public final C0EN4 LIZIZ;
    public CreativeDialogWrapper LIZJ;
    public long LIZLLL;
    public boolean LJ = true;

    public static void LIZIZ(Activity activity) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(activity.getString(2131833305));
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZ(activity, 1044, creativeToastBuilder);
    }

    public C1449780npY(EditEffectAnchorManager editEffectAnchorManager, C0EN4 c0en4) {
        this.LIZ = editEffectAnchorManager;
        this.LIZIZ = c0en4;
    }

    public final void LIZ(EditEffectAnchorInfo editEffectAnchorInfo, VideoPublishEditModel videoPublishEditModel, C356830Dyr c356830Dyr, C1449770npX c1449770npX, Function0 function0, Activity activity) {
        this.LIZ.setServerRenderingCompleted(false);
        Effect effect = editEffectAnchorInfo.effect;
        EffectModel effectModelLIZ = C0F4X.LIZ(0, effect, "", videoPublishEditModel.creativeModel.effectEntrancePosition);
        effectModelLIZ.index = -1;
        effectModelLIZ.selectFrom = videoPublishEditModel.mShootWay;
        effectModelLIZ.entrancePoint = "null";
        if (c356830Dyr != null) {
            c356830Dyr.LJIJJ(effectModelLIZ, activity, c1449770npX, new AwS81S0500000_22(this, function0, c1449770npX, effect, videoPublishEditModel, 1));
        }
    }
}
