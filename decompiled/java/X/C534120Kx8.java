package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.layout.UploadLayoutChooseResultImpl$onChosenResult$2", f = "UploadLayoutChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C534120Kx8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L2T LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ ShortVideoContext LLILZIL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZLL;
    public final /* synthetic */ C534100Kx6 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534120Kx8(C0L2T c0l2t, int i, int i2, Intent intent, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, C534100Kx6 c534100Kx6, InterfaceC1364105Vn<? super C534120Kx8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l2t;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = intent;
        this.LLILZIL = shortVideoContext;
        this.LLILZLL = arrayList;
        this.LLIZ = c534100Kx6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534120Kx8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadLayoutChooseResultImpl@9bfc.onChosenResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLIZ, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadLayoutChooseResultImpl@9bfc.onChosenResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
