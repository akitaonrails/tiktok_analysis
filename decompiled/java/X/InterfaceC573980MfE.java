package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC573980MfE {
    void LIZ();

    boolean LIZIZ();

    void LIZJ(String str, Function0<Unit> function0);

    void LIZLLL();

    boolean LJ(Activity activity);

    void LJFF();

    void LJI(int i, VideoPublishEditModel videoPublishEditModel, String str);

    AwemeDraft LJII();

    AwemeDraft LJIIIIZZ();

    boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel);

    boolean LJIIJ();

    boolean LJIIJJI();

    AwemeDraft LJIIL();

    void LJIILIIL(VideoPublishEditModel videoPublishEditModel, String str, int i, Function0<Unit> function0, Function1<? super C540340LHc, Unit> function1);

    void deleteUselessCheckPointFile();

    void saveCheckPointToDraft(Activity activity, int i);

    Dialog showRestoreWorkDialog(Activity activity, LifecycleOwner lifecycleOwner, String str);
}
