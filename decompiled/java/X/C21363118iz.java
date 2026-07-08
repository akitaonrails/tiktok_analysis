package X;

import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$updateNewVideoPipelineState$1", f = "BackgroundVideoStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C21363118iz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ BackgroundVideoStickerPresenter LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21363118iz(boolean z, BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, InterfaceC1364105Vn<? super C21363118iz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = backgroundVideoStickerPresenter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21363118iz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String strLIZIZ;
        C1C7U.LIZ("BackgroundVideoStickerPresenter@77bb.updateNewVideoPipelineState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        if (!z) {
            strLIZIZ = C21363018iy.LIZJ(this.LLILLJJLI.LLJLILLLLZIIL, z);
        } else {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.LLILLJJLI;
            int i = backgroundVideoStickerPresenter.LLJL;
            if (i != 1) {
                if (i == 2 || i != 4) {
                    strLIZIZ = C21363018iy.LIZJ(backgroundVideoStickerPresenter.LLJLILLLLZIIL, z);
                } else {
                    strLIZIZ = C21363018iy.LIZ(backgroundVideoStickerPresenter.LLJLLL, backgroundVideoStickerPresenter.LLJZ, backgroundVideoStickerPresenter.LLJLLIL, backgroundVideoStickerPresenter.LLJLILLLLZIIL, z);
                }
            } else {
                strLIZIZ = C21363018iy.LIZIZ(backgroundVideoStickerPresenter.LLJLLL, backgroundVideoStickerPresenter.LLJLILLLLZIIL, z);
            }
        }
        this.LLILLJJLI.LLILZLL.get().LJIIJ(0L, strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundVideoStickerPresenter@77bb.updateNewVideoPipelineState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
