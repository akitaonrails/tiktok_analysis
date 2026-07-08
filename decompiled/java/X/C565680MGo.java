package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0MGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.MusicFollowingHandler", f = "MusicFollowingHandler.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "process")
public final class C565680MGo extends AbstractC23140094w {
    public MusicModel LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C565670MGn LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565680MGo(C565670MGn c565670MGn, InterfaceC1364105Vn<? super C565680MGo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c565670MGn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicFollowingHandler@a569.process$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(this);
        C1C7U.LIZIZ("MusicFollowingHandler@a569.process$1");
        return objLIZ;
    }
}
