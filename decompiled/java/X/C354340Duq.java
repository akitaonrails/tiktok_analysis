package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Duq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C354340Duq extends C2217421BqW implements Function1<EnumC360750ECj, Boolean> {
    public C354340Duq(Object obj) {
        super(1, obj, VideoAnimFragment.class, "checkCanDrawEnable", "checkCanDrawEnable(Lcom/ss/android/ugc/gamora/editorpro/common/views/AnimationTimelineSeekBar$AnimationType;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(EnumC360750ECj enumC360750ECj) {
        return Boolean.valueOf(((VideoAnimFragment) this.receiver).jT(enumC360750ECj));
    }
}
