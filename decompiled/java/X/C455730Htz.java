package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Htz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputClipboardPasteExtKt$handleCommitContent$1", f = "InputClipboardPasteExt.kt", l = {116}, m = "invokeSuspend")
public final class C455730Htz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAlbumUpdateGuideViewModel LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ Uri LLILZ;
    public final /* synthetic */ SessionInfo LLILZIL;
    public final /* synthetic */ C0I20 LLILZLL;
    public final /* synthetic */ C0I70 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455730Htz(IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel, Activity activity, Uri uri, SessionInfo sessionInfo, C0I20 c0i20, C0I70 c0i70, InterfaceC1364105Vn<? super C455730Htz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iAlbumUpdateGuideViewModel;
        this.LLILLL = activity;
        this.LLILZ = uri;
        this.LLILZIL = sessionInfo;
        this.LLILZLL = c0i20;
        this.LLIZ = c0i70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455730Htz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ReferenceInfo referenceInfoLJII;
        C869590Y9l c869590Y9l;
        C1C7U.LIZ("InputClipboardPasteExtKt@a8a0.handleCommitContent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel = this.LLILLJJLI;
                    Activity activity = this.LLILLL;
                    Uri uri = this.LLILZ;
                    SessionInfo sessionInfo = this.LLILZIL;
                    C896410ZEp c896410ZEp = QuoteMode.Companion;
                    C454980Hsm c454980Hsm = (C454980Hsm) this.LLILZLL.Sc0().getValue();
                    if (c454980Hsm != null && (c869590Y9l = c454980Hsm.LIZ) != null) {
                        C0ZDT.LIZ.getClass();
                        referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
                    } else {
                        referenceInfoLJII = null;
                    }
                    c896410ZEp.getClass();
                    QuoteMode quoteModeLIZ = C896410ZEp.LIZ(referenceInfoLJII);
                    this.LL = 1;
                    if (iAlbumUpdateGuideViewModel.AQ2(activity, uri, sessionInfo, quoteModeLIZ, this) == objLJFF) {
                        C1C7U.LIZIZ("InputClipboardPasteExtKt@a8a0.handleCommitContent$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLIZ.LIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InputClipboardPasteExtKt@a8a0.handleCommitContent$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLIZ.LIZ();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
