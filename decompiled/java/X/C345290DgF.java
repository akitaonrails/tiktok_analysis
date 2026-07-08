package X;

import android.app.Application;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl$forceCopyMusic$2$1", f = "MediaPlayerManagerServiceImpl.kt", l = {201}, m = "invokeSuspend")
public final class C345290DgF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MediaPlayerManagerServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345290DgF(MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl, InterfaceC1364105Vn<? super C345290DgF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaPlayerManagerServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345290DgF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPlayerManagerServiceImpl@312d.forceCopyMusic$2$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.forceCopyMusic$2$1");
                return objLJFF;
            }
        }
        MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this.LLILLJJLI;
        Application application = C0CHQ.LIZ;
        mediaPlayerManagerServiceImpl.getClass();
        MediaPlayerManagerServiceImpl.LJII("show loading");
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.loadingMessage("");
        CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(application, 1104, creativeLoadingDialogBuilder);
        creativeDialogWrapper.show();
        mediaPlayerManagerServiceImpl.LIZJ = creativeDialogWrapper;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.forceCopyMusic$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
