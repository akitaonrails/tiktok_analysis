package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS8S0201100_8;

/* JADX INFO: renamed from: X.0L6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537710L6z {
    public static final C537710L6z LIZ = new C537710L6z();

    public static CreativeDialogWrapper LIZ(Context context) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(context.getString(R.string.txr));
        return (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(context, 2000, creativeLoadingDialogBuilder);
    }

    public static void LIZJ(Context context, VideoPublishEditModel videoPublishEditModel) {
        C201955140j.LJIIIIZZ(C0L76.LIZIZ, "AILiveDraftHelper", "saveDraftWithNewCreationIdBeforePublish call");
        String creationId = videoPublishEditModel.getCreationId();
        String strLIZ = C0DMI.LIZ();
        videoPublishEditModel.creativeModel.draftInfoModel.saveDraftScene = "ai_livephoto_publish_auto_save";
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L70("ai_livephoto_publish_auto_save", videoPublishEditModel, strLIZ, 29, creationId, context, System.currentTimeMillis(), null), 3);
    }

    public static void LIZLLL(int i, C19EG c19eg) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.iconColorRes(R.attr.a1h);
        creativeToastBuilder.messageRes(2131820676);
        creativeToastBuilder.acrossActivities(true);
        switch (i) {
            case 28:
            case 30:
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                    C1390380mHk.LIZ(activityLIZ, 8003, creativeToastBuilder);
                    break;
                }
                break;
            case 29:
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
                C19EG c19egLIZLLL = C19221910Hx.LIZLLL(c19eg, false);
                if (c19egLIZLLL != null) {
                    C1390380mHk.LIZ(c19egLIZLLL, 8003, creativeToastBuilder);
                }
                break;
        }
    }

    public static void LIZIZ(Context context, String str, int i, VideoPublishEditModel videoPublishEditModel, InterfaceC1453420nvQ interfaceC1453420nvQ, Function1 function1) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (videoPublishEditModel.getAILivePhotoModel().getTaskId() == null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        CreativeDialogWrapper creativeDialogWrapperLIZ = LIZ(context);
        creativeDialogWrapperLIZ.show();
        if (interfaceC1453420nvQ != null) {
            interfaceC1453420nvQ.iz(str, i, AFwS239S0000000_8.get$arr$(250), new C537700L6y(creativeDialogWrapperLIZ, i, context, function1, jCurrentTimeMillis), new AwS8S0201100_8(creativeDialogWrapperLIZ, function1, i, jCurrentTimeMillis, 1));
        }
    }
}
