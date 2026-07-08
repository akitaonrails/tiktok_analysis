package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickTemplateDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538720LAw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AwemeDraft awemeDraft, final Activity activity) {
        final AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(awemeDraft, activity, 207);
        C542610LPv.LIZLLL(new C542550LPp(new InterfaceC537370L5r(activity) { // from class: X.0L5i
            public final Context LIZ;

            @Override // X.InterfaceC537370L5r
            public final IDraftListener LIZ() {
                return null;
            }

            @Override // X.InterfaceC537370L5r
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC537370L5r
            public final LifecycleOwner getLifecycleOwner() {
                return C537270L5h.LIZ(this);
            }

            @Override // X.InterfaceC537370L5r
            public final Context getContext() {
                return this.LIZ;
            }

            {
                this.LIZ = activity;
            }
        }, awemeDraft, new C0M2T(false, null, "fromDraftPage", 0, false, 23)), new InterfaceC542470LPh() { // from class: X.0LB3
            @Override // X.InterfaceC542470LPh
            public final void LIZ(C0LBJ c0lbj) {
                VideoPublishEditModel videoPublishEditModel = c0lbj.LIZIZ;
                if (videoPublishEditModel != null) {
                    awS374S0200000_8.invoke(videoPublishEditModel);
                } else {
                    C0MYY.LIZ(c0lbj.LIZ, activity);
                }
            }

            @Override // X.InterfaceC542470LPh
            public final void LIZIZ(C0LBJ c0lbj) {
                C0MYY.LIZ(c0lbj.LIZ, activity);
            }
        });
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, AwemeDraft awemeDraft) {
        AutoPickModel autoPickModel;
        List<AutoPickMediaModel> list;
        CreativeModel creativeModel;
        Integer num;
        String creationId;
        int i;
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        if (creativeModel2 != null && (autoPickModel = creativeModel2.autoPickModel) != null && (list = autoPickModel.mediaList) != null && !list.isEmpty() && (creativeModel = awemeDraft.LIZ) != null && (num = creativeModel.asyncStatus) != null && num.intValue() == EnumC545550LaT.COMPLETE.ordinal() && (creationId = videoPublishEditModel.getCreationId()) != null && !a0.LJJJIL(creationId)) {
            C538790LBd c538790LBdLJIL = C0CHQ.LIZ().LJIL();
            String str = awemeDraft.LJJJJIZL.shootWay;
            if (str == null) {
                str = "";
            }
            String str2 = autoPickModel.trackEnterFrom;
            int i2 = autoPickModel.taskCount;
            List<AutoPickTemplateDraft> list2 = autoPickModel.templateInfos;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<AutoPickTemplateDraft> it2 = list2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().getNleDraft().length() > 0 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            c538790LBdLJIL.LJIILLIIL(creationId, i2, i, str, str2, autoPickModel.pickId, autoPickModel.maeRequestId);
        }
    }
}
