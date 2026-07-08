package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.music.addtodsp.feed.button.presave.MusicPresaveToDspButtonConditionSensor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1433405jI extends C09AY implements Function1<Lifecycle, MusicPresaveToDspButtonConditionSensor> {
    public C1433405jI() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MusicPresaveToDspButtonConditionSensor invoke(Lifecycle lifecycle) {
        return new MusicPresaveToDspButtonConditionSensor(lifecycle);
    }
}
