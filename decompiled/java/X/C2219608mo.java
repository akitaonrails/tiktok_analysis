package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;

/* JADX INFO: renamed from: X.08mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel", f = "IdAndElementViewModel.kt", l = {411, 425}, m = "stickerHasFace")
public final class C2219608mo extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IdAndElementViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219608mo(IdAndElementViewModel idAndElementViewModel, InterfaceC1364105Vn<? super C2219608mo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = idAndElementViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IdAndElementViewModel@a6fe.stickerHasFace$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLL.EQ2(null, this);
        C1C7U.LIZIZ("IdAndElementViewModel@a6fe.stickerHasFace$1");
        return objEQ2;
    }
}
