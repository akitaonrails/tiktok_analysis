package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.09qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.album.AIPortraitFaceCountDetector", f = "AIPortraitFaceCountDetector.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "detectFaceCount")
public final class C2496909qR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2496809qQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2496909qR(C2496809qQ c2496809qQ, InterfaceC1364105Vn<? super C2496909qR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2496809qQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitFaceCountDetector@9f9e.detectFaceCount$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("AIPortraitFaceCountDetector@9f9e.detectFaceCount$1");
        return objLIZ;
    }
}
