package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.feed.platform.ab.UnifyTagStyleExpData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704050RjX extends C09AY implements Function0<C2177251AIx> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C704050RjX(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(0);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2177251AIx invoke() {
        int i;
        C0RF0 c0rf0 = this.LL.jm().LIZLLL;
        if (C704010RjT.LJ(c0rf0 != null ? c0rf0.LJIIIZ : null)) {
            UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
            i = unifyTagStyleExpDataLIZ != null ? unifyTagStyleExpDataLIZ.avatarSizeDp : 15;
        } else {
            i = 16;
        }
        return new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), null, 0, 2, 0.875f, 0.0f, 0, 0, null, null, false, false, false, null, 114488);
    }
}
