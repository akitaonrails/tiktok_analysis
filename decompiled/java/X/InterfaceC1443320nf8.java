package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1443320nf8 {
    C0JHI LIZ();

    void LIZIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel);

    void LIZJ(VideoPublishEditModel videoPublishEditModel, String str);

    boolean LIZLLL(VideoPublishEditModel videoPublishEditModel);

    VideoPublishEditModel LJ(Aweme aweme, Activity activity);

    void LJFF(C19EG c19eg, LifecycleOwner lifecycleOwner, RemoteImageView remoteImageView, VideoPublishEditModel videoPublishEditModel, Function1 function1);

    void LJI(int i, Intent intent, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0);

    String LJII(String str);

    NLEError LJIIIIZZ(String str, NLEModel nLEModel);

    void LJIIIZ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, String str, Function0<Unit> function0);
}
