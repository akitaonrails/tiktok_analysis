package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0LFA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LFA extends C2217421BqW implements Function1<MediaModel, Unit> {
    public C0LFA(C0LF3 c0lf3) {
        super(1, c0lf3, C0LF3.class, "onSelectImage", "onSelectImage(Lcom/ss/android/ugc/aweme/mediachoose/helper/MediaModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MediaModel mediaModel) throws JSONException {
        ((C0LF3) this.receiver).d5(mediaModel);
        return Unit.LIZ;
    }
}
