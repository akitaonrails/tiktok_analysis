package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.layout.UploadLayoutChooseResultImpl$goVideoEditPage$1$2", f = "UploadLayoutChooseResultImpl.kt", l = {482}, m = "invokeSuspend")
public final class C534060Kx2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0L2T LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ List<MediaModel> LLILZIL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZLL;
    public final /* synthetic */ ShortVideoContext LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C534060Kx2(C0L2T c0l2t, Intent intent, Intent intent2, List<? extends MediaModel> list, ArrayList<MediaModel> arrayList, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C534060Kx2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l2t;
        this.LLILLL = intent;
        this.LLILZ = intent2;
        this.LLILZIL = list;
        this.LLILZLL = arrayList;
        this.LLIZ = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534060Kx2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadLayoutChooseResultImpl@9bfc.goVideoEditPage$1$2");
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
            C534030Kwz c534030Kwz = (C534030Kwz) this.LLILLJJLI.LLJILLL.getValue();
            Intent intent = this.LLILLL;
            Intent intent2 = this.LLILZ;
            List<MediaModel> list = this.LLILZIL;
            ArrayList<MediaModel> arrayList = this.LLILZLL;
            ShortVideoContext shortVideoContext = this.LLIZ;
            this.LL = 1;
            if (c534030Kwz.LJJJJZI(intent, intent2, list, arrayList, shortVideoContext, this) == objLJFF) {
                C1C7U.LIZIZ("UploadLayoutChooseResultImpl@9bfc.goVideoEditPage$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadLayoutChooseResultImpl@9bfc.goVideoEditPage$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
