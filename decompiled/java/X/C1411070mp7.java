package X;

import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.assem.MusicDraftAssem$updateCoverAndSubtitleView$1$onGetVideoCoverSuccess$2", f = "MusicDraftAssem.kt", l = {478}, m = "invokeSuspend")
public final class C1411070mp7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ VideoCoverConfig LLILLL;
    public final /* synthetic */ MusicDraftAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411070mp7(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, MusicDraftAssem musicDraftAssem, InterfaceC1364105Vn<? super C1411070mp7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = videoCoverConfig;
        this.LLILZ = musicDraftAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411070mp7(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicDraftAssem@abb.updateCoverAndSubtitleView$1$onGetVideoCoverSuccess$2");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("MusicDraftAssem@abb.updateCoverAndSubtitleView$1$onGetVideoCoverSuccess$2");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = this.LLILLJJLI;
        VideoCoverConfig videoCoverConfig = this.LLILLL;
        final MusicDraftAssem musicDraftAssem = this.LLILZ;
        C0MZ9.LJIIIZ(awemeDraft, videoCoverConfig, new IEffectService.OnVideoCoverCallback() { // from class: X.0mp8
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i2) {
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) musicDraftAssem.LLJJJJLIIL.getValue();
                if (appCompatImageView != null) {
                    appCompatImageView.setImageBitmap(bitmap);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDraftAssem@abb.updateCoverAndSubtitleView$1$onGetVideoCoverSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
