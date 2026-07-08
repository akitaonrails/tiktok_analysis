package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.09pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.draftorganizer.DraftCoverLoader$FallbackThumbImage$1$1", f = "DraftCoverLoader.kt", l = {217}, m = "invokeSuspend")
public final class C2492009pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C05P0<Bitmap> LLILLL;
    public final /* synthetic */ Function1<String, AwemeDraft> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2492009pe(String str, C05P0<Bitmap> c05p0, Function1<? super String, AwemeDraft> function1, InterfaceC1364105Vn<? super C2492009pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c05p0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2492009pe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
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
            C05P0<Bitmap> c05p0 = this.LLILLL;
            C1667500tUi c1667500tUi = C1667500tUi.LIZ;
            if (c05p0.getValue() != null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
                return unit;
            }
            if (a0.LJJJIL(this.LLILLJJLI)) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
                return unit2;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C09XB c09xb = new C09XB(this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c09xb);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        if (awemeDraft == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
            return unit3;
        }
        VideoCoverConfig videoCoverConfig = new VideoCoverConfig(256, 256, Bitmap.Config.ARGB_8888);
        final String str = this.LLILLJJLI;
        final C05P0<Bitmap> c05p02 = this.LLILLL;
        C0MZ9.LJIIIIZZ(awemeDraft, videoCoverConfig, new IEffectService.OnVideoCoverCallback() { // from class: X.09pf
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i2) {
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FallbackThumbImage: loadThumbCover failed: creationId=");
                sbLIZ.append(str);
                sbLIZ.append(", errorCode=");
                sbLIZ.append(i2);
                C201955140j.LJIIIIZZ(c0may, "DraftCoverLoader", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                if (bitmap.isRecycled()) {
                    return;
                }
                C1667500tUi.LIZJ(bitmap, str);
                c05p02.setValue(bitmap);
            }
        });
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("DraftCoverLoader@4948.FallbackThumbImage$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
