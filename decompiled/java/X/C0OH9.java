package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0OH9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinShareMusicRepository$shareMusicRepoOperator$1", f = "BulletinShareMusicRepository.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "fetchBulletinShareMusicList")
public final class C0OH9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0OH8 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OH9(C0OH8 c0oh8, InterfaceC1364105Vn<? super C0OH9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0oh8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinShareMusicRepository@d4ef.shareMusicRepoOperator$1$fetchBulletinShareMusicList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(0, 0, this);
        C1C7U.LIZIZ("BulletinShareMusicRepository@d4ef.shareMusicRepoOperator$1$fetchBulletinShareMusicList$1");
        return objLJIIIIZZ;
    }
}
