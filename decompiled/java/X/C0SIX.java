package X;

import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SIX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoDescVM LL;
    public final /* synthetic */ IPhotoModeAbility LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIX(VideoDescVM videoDescVM, IPhotoModeAbility iPhotoModeAbility) {
        super(0);
        this.LL = videoDescVM;
        this.LLILLJJLI = iPhotoModeAbility;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VideoDescVM videoDescVM = this.LL;
        IPhotoModeAbility iPhotoModeAbility = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoDescVM.LLJLLIL;
        C20684815ws.LJIILLIIL("video_title", videoDescVM.zQ2("show", iPhotoModeAbility, ""));
        return Unit.LIZ;
    }
}
