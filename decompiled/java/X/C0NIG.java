package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NIG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0NIG extends C2217421BqW implements Function2<Float, Aweme, Unit> {
    public C0NIG(Object obj) {
        super(2, obj, TabletPlaybackSpeedComponent.class, "onSpeedChange", "onSpeedChange(FLcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f, Aweme aweme) {
        f.floatValue();
        Aweme awemeGo = aweme;
        TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent = (TabletPlaybackSpeedComponent) this.receiver;
        if (awemeGo == null) {
            awemeGo = tabletPlaybackSpeedComponent.Go();
        }
        tabletPlaybackSpeedComponent.Jo(awemeGo);
        return Unit.LIZ;
    }
}
