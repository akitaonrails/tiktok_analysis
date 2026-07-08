package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0M4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.widget.DraftEntranceViewHolder$bindData$1$1$1", f = "DraftEntranceViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C562640M4w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ C1401470mZd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562640M4w(AwemeDraft awemeDraft, C1401470mZd c1401470mZd, InterfaceC1364105Vn<? super C562640M4w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = c1401470mZd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562640M4w(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        C1C7U.LIZ("DraftEntranceViewHolder@703e.bindData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraft = this.LL;
        if (awemeDraft != null) {
            final C1401470mZd c1401470mZd = this.LLILLJJLI;
            String strLIZ2 = awemeDraft.LIZ();
            AwemeDraft awemeDraft2 = c1401470mZd.LLJILJILJ;
            if (awemeDraft2 != null) {
                strLIZ = awemeDraft2.LIZ();
            } else {
                strLIZ = null;
            }
            if (Intrinsics.LJFF(strLIZ2, strLIZ)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftEntranceViewHolder@703e.bindData$1$1$1");
                return unit;
            }
            c1401470mZd.LLJILJILJ = awemeDraft;
            C0MZ9.LJIIIZ(awemeDraft, new VideoCoverConfig(((View) c1401470mZd.LLJ.getValue()).getWidth(), ((View) c1401470mZd.LLJ.getValue()).getHeight(), Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0M4x
                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i) {
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    C1401470mZd c1401470mZd2 = c1401470mZd;
                    c1401470mZd2.getClass();
                    C421540Gfw.LIZ(new AwS409S0200000_8(c1401470mZd2, bitmap, 164));
                }
            });
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftEntranceViewHolder@703e.bindData$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
