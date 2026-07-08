package X;

import com.ss.ugc.android.editor.track.TrackShowType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0E8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C359730E8l extends C2217421BqW implements Function1<TrackShowType, Unit> {
    public C359730E8l(C0E5S c0e5s) {
        super(1, c0e5s, C0E5S.class, "switchSubTrackUIState", "switchSubTrackUIState(Lcom/ss/ugc/android/editor/track/TrackShowType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TrackShowType trackShowType) {
        ((C0E5S) this.receiver).da0(trackShowType);
        return Unit.LIZ;
    }
}
