package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.01aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleRepository", f = "NimbleRepository.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "fetchUserOther")
public final class C358601aK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C358401aI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358601aK(C358401aI c358401aI, InterfaceC1364105Vn<? super C358601aK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c358401aI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NimbleRepository@800d.fetchUserOther$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("NimbleRepository@800d.fetchUserOther$1");
        return objLIZ;
    }
}
