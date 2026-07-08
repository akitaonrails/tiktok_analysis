package X;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0989, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel$openPreviewForUri$2", f = "AlbumUpdateGuideViewModel.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0989 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AlbumUpdateGuideViewModel LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C07WI LLILLL;
    public final /* synthetic */ SessionInfo LLILZ;
    public final /* synthetic */ MediaModel LLILZIL;
    public final /* synthetic */ QuoteMode LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0989(AlbumUpdateGuideViewModel albumUpdateGuideViewModel, Activity activity, C07WI c07wi, SessionInfo sessionInfo, MediaModel mediaModel, QuoteMode quoteMode, InterfaceC1364105Vn<? super AnonymousClass0989> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = albumUpdateGuideViewModel;
        this.LLILLJJLI = activity;
        this.LLILLL = c07wi;
        this.LLILZ = sessionInfo;
        this.LLILZIL = mediaModel;
        this.LLILZLL = quoteMode;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0989(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AlbumUpdateGuideViewModel albumUpdateGuideViewModel = this.LL;
        Activity activity = this.LLILLJJLI;
        C07WI c07wi = this.LLILLL;
        Uri uri = c07wi.LIZ;
        boolean z = c07wi.LIZIZ;
        SessionInfo sessionInfo = this.LLILZ;
        MediaModel mediaModel = this.LLILZIL;
        QuoteMode quoteMode = this.LLILZLL;
        albumUpdateGuideViewModel.getClass();
        AlbumUpdateGuideViewModel.BQ2(activity, uri, z, "clipboard_paste", sessionInfo, mediaModel, quoteMode);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumUpdateGuideViewModel@c21.openPreviewForUri$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
