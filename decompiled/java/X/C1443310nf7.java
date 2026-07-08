package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.EditPostCheckResult;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EditPostNewsAnchorChangeType;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443310nf7 implements InterfaceC1443320nf8 {
    public static final C1443310nf7 LIZIZ = new C1443310nf7();
    public final /* synthetic */ InterfaceC1443320nf8 LIZ = C0CHQ.LIZ().LJJJIL();

    @Override // X.InterfaceC1443320nf8
    public final C0JHI LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1443320nf8
    public final void LIZIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ.LIZIZ(c19eg, videoPublishEditModel);
    }

    @Override // X.InterfaceC1443320nf8
    public final void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        this.LIZ.LIZJ(videoPublishEditModel, str);
    }

    @Override // X.InterfaceC1443320nf8
    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return this.LIZ.LIZLLL(videoPublishEditModel);
    }

    @Override // X.InterfaceC1443320nf8
    public final VideoPublishEditModel LJ(Aweme aweme, Activity activity) {
        return this.LIZ.LJ(aweme, activity);
    }

    @Override // X.InterfaceC1443320nf8
    public final void LJFF(C19EG c19eg, LifecycleOwner lifecycleOwner, RemoteImageView remoteImageView, VideoPublishEditModel videoPublishEditModel, Function1 function1) {
        this.LIZ.LJFF(c19eg, lifecycleOwner, remoteImageView, videoPublishEditModel, function1);
    }

    @Override // X.InterfaceC1443320nf8
    public final void LJI(int i, Intent intent, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
        this.LIZ.LJI(i, intent, videoPublishEditModel, function0);
    }

    @Override // X.InterfaceC1443320nf8
    public final String LJII(String str) {
        return this.LIZ.LJII(str);
    }

    @Override // X.InterfaceC1443320nf8
    public final NLEError LJIIIIZZ(String str, NLEModel nLEModel) {
        return this.LIZ.LJIIIIZZ(str, nLEModel);
    }

    @Override // X.InterfaceC1443320nf8
    public final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, String str, Function0<Unit> function0) {
        this.LIZ.LJIIIZ(videoPublishEditModel, bitmap, str, function0);
    }

    public static PublishModel LJIIJ(C1443310nf7 c1443310nf7, VideoPublishEditModel videoPublishEditModel, Boolean bool, Boolean bool2, int i) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean boolValueOf;
        String creationId;
        EditPostCheckResult editPostCheckResult = null;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        c1443310nf7.getClass();
        EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
        if (editPostModel != null) {
            editPostCheckResult = editPostModel.getEditPostCheckResult();
        }
        if (bool != null || (editPostCheckResult != null && (bool = Boolean.valueOf(editPostCheckResult.isTitleChanged())) != null)) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else if (editPostCheckResult != null && (boolValueOf = Boolean.valueOf(editPostCheckResult.isCoverEdited())) != null) {
            zBooleanValue2 = boolValueOf.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        EditPostCheckResult editPostCheckResult2 = new EditPostCheckResult(zBooleanValue, false, false, false, zBooleanValue2, EditPostPoiChangeType.UNKNOWN, false, false, EditPostNewsAnchorChangeType.UNKNOWN);
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        String str = "";
        if (creativeInfo == null || (creationId = creativeInfo.getCreationId()) == null) {
            creationId = "";
        }
        EnumC1405170mfb enumC1405170mfb = EnumC1405170mfb.NOT_RETRY;
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        if (videoCoverPath != null) {
            str = videoCoverPath;
        }
        List listSingletonList = Collections.singletonList(str);
        EditPostModel editPostModel2 = videoPublishEditModel.creativeModel.editPostModel;
        if (editPostModel2 != null) {
            editPostModel2.setEditPostCheckResult(editPostCheckResult2);
        }
        return new PublishModel("pcs_paid_video", creationId, 3, enumC1405170mfb, 0, 0, listSingletonList, videoPublishEditModel, null, false, CardStruct.IStatusCode.DEFAULT, false, false, false, false, true, null, false, null, null, false);
    }
}
