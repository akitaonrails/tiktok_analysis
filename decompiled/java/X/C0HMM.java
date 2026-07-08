package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HMM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public interface C0HMM extends Serializable {
    void checkValidAndUpload(Activity activity, List<String> list, String str, Function1<? super List<String>, Unit> function1);

    void onSingleImageClicked(MediaModel mediaModel);
}
