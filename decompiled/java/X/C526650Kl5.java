package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.CheckAllMediasExistTask$process$2$2", f = "CheckAllMediasExistTask.kt", l = {}, m = "invokeSuspend")
public final class C526650Kl5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C526700KlA LL;
    public final /* synthetic */ MediaModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526650Kl5(C526700KlA c526700KlA, MediaModel mediaModel, InterfaceC1364105Vn<? super C526650Kl5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c526700KlA;
        this.LLILLJJLI = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C526650Kl5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckAllMediasExistTask@1e34.process$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C526700KlA c526700KlA = this.LL;
        MediaModel mediaModel = this.LLILLJJLI;
        c526700KlA.getClass();
        if (mediaModel.LJIILJJIL()) {
            Context context = c526700KlA.LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131835666);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(context, 3047, creativeToastBuilder);
        } else {
            Context context2 = c526700KlA.LIZ;
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(R.string.nfi);
            creativeToastBuilder2.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(context2, 3076, creativeToastBuilder2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckAllMediasExistTask@1e34.process$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
