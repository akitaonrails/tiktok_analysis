package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;

/* JADX INFO: renamed from: X.08bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline", f = "BulletinVoicePublishPipeline.kt", l = {365, 374, 404, 417}, m = "runUploadAndCallback")
public final class C2149808bY extends AbstractC23140094w {
    public Object LL;
    public BulletinUploadAuthKeyResponse LLILLJJLI;
    public InterfaceC2149308bT LLILLL;
    public C2152408by LLILZ;
    public C259800zU LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C2149708bX LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149808bY(C2149708bX c2149708bX, InterfaceC1364105Vn<? super C2149808bY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c2149708bX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.runUploadAndCallback$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLJIJIL.LJ(null, null, null, null, this);
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runUploadAndCallback$1");
        return objLJ;
    }
}
