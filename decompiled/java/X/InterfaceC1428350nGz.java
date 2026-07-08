package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1428350nGz {
    String LIZ(NLEModel nLEModel);

    void LIZIZ(SingleImageData singleImageData);

    void LIZJ();

    PhotoTemplateAsset LIZLLL();

    AbstractC19484711Kz<NLEModel> LJ(int i, PhotoTemplateAsset photoTemplateAsset, NLETrackSlot nLETrackSlot, NLEModel nLEModel, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1);

    void LJFF();

    NLEModel LJI(PhotoTemplateAsset photoTemplateAsset);

    boolean LJII(PhotoTemplateAsset photoTemplateAsset);
}
