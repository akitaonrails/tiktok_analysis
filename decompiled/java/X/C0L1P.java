package X;

import com.ss.android.ugc.aweme.music.v2.assem.AILivePhotoOpenAlbumAssem;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.AILivePhotoOpenAlbumAssem$goAlbum$1", f = "AILivePhotoOpenAlbumAssem.kt", l = {75}, m = "invokeSuspend")
public final class C0L1P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AILivePhotoOpenAlbumAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L1P(AILivePhotoOpenAlbumAssem aILivePhotoOpenAlbumAssem, InterfaceC1364105Vn<? super C0L1P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aILivePhotoOpenAlbumAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L1P(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoOpenAlbumAssem@a1d0.goAlbum$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IAILiveService iAILiveServiceEp = this.LLILLJJLI.Ep();
            if (iAILiveServiceEp != null) {
                this.LL = 1;
                if (iAILiveServiceEp.requestNotifyQuotaUpdate(this) == objLJFF) {
                    C1C7U.LIZIZ("AILivePhotoOpenAlbumAssem@a1d0.goAlbum$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoOpenAlbumAssem@a1d0.goAlbum$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
