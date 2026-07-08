package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.poi.collect.videocollection.VideoCollectionSensor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609320Nv8 extends C09AY implements Function1<Lifecycle, VideoCollectionSensor> {
    public C609320Nv8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VideoCollectionSensor invoke(Lifecycle lifecycle) {
        return new VideoCollectionSensor(lifecycle);
    }
}
