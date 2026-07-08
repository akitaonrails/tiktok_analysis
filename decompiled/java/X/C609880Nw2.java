package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.favorites.guide.button.sensor.FavoriteGuideButtonSensor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609880Nw2 extends C09AY implements Function1<Lifecycle, FavoriteGuideButtonSensor> {
    public C609880Nw2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FavoriteGuideButtonSensor invoke(Lifecycle lifecycle) {
        return new FavoriteGuideButtonSensor(lifecycle);
    }
}
