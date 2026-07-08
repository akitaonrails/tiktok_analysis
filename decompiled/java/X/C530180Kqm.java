package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.List;
import kotlin.jvm.internal.AwS12S1100100_8;

/* JADX INFO: renamed from: X.0Kqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530180Kqm {
    public static final long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = ((long) SettingsManager.LJ("ttk_upload_video_selectable_max_seconds", 3600)) * 1000;
    }

    public static C443120HZe LIZ(Context context, List list, long j, long j2) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        int size = list.size();
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((int) ((MediaModel) ListProtector.get(list, i2)).duration) < j) {
                String string = context.getString(2131857944, Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VQEvaluation; checkMediaDurationValid; ");
                sbLIZ.append(string);
                C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Media invalid for duration: \n real duration = ");
                sbLIZ2.append(((MediaModel) ListProtector.get(list, i2)).duration);
                sbLIZ2.append(" \n minDuration = ");
                sbLIZ2.append(j);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (activityLIZ != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    C1390380mHk.LIZ(activityLIZ, 3047, creativeToastBuilder);
                }
                C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AwS12S1100100_8(j, list, string, 0));
                C526770KlH.LIZJ(1, 0);
                return new C443120HZe(Boolean.FALSE, -1, -1L);
            }
            j3 += (long) ((int) ((MediaModel) ListProtector.get(list, i2)).duration);
            if (((MediaModel) ListProtector.get(list, i2)).type == 4) {
                i++;
            }
        }
        if (j3 < j) {
            String string2 = context.getString(2131857944, Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Media invalid for duration: \n all real duration = ");
            sbLIZ3.append(j3);
            sbLIZ3.append(" \n minDuration = ");
            sbLIZ3.append(j);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("VQEvaluation ; checkMediaDurationValid; ");
            sbLIZ4.append(string2);
            C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
            if (activityLIZ != null) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.message(string2);
                C1390380mHk.LIZ(activityLIZ, 3047, creativeToastBuilder2);
            }
            C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new AwS12S1100100_8(j, list, string2, 1));
            C526770KlH.LIZJ(1, 0);
            return new C443120HZe(Boolean.FALSE, -1, -1L);
        }
        if (1 <= j2 && j2 < j3) {
            String string3 = context.getString(2131837609);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("VQEvaluation ; checkMediaDurationValid; ");
            sbLIZ5.append(string3);
            C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
            if (activityLIZ != null) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.message(string3);
                C1390380mHk.LIZ(activityLIZ, 3047, creativeToastBuilder3);
            }
            C526770KlH.LIZJ(2, 0);
            return new C443120HZe(Boolean.FALSE, -1, -1L);
        }
        return new C443120HZe(Boolean.TRUE, Integer.valueOf(i), Long.valueOf(j3));
    }
}
