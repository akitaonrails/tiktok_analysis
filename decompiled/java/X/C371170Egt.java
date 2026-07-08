package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Egt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.preview.CutoutPreviewComponent$capturePreviewBitmap$1", f = "CutoutPreviewComponent.kt", l = {538}, m = "invokeSuspend")
public final class C371170Egt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Size LLILZIL;
    public final /* synthetic */ C373940ElM LLILZLL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C371170Egt(NLETrackSlot nLETrackSlot, long j, Size size, C373940ElM c373940ElM, Function1<? super Bitmap, Unit> function1, InterfaceC1364105Vn<? super C371170Egt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = nLETrackSlot;
        this.LLILZ = j;
        this.LLILZIL = size;
        this.LLILZLL = c373940ElM;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C371170Egt c371170Egt = new C371170Egt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c371170Egt.LLILLJJLI = obj;
        return c371170Egt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutoutPreviewComponent@35f0.capturePreviewBitmap$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C370720EgA c370720EgA = C370720EgA.LIZ;
            NLETrackSlot nLETrackSlot = this.LLILLL;
            int i2 = (int) this.LLILZ;
            Size size = this.LLILZIL;
            String strT4 = this.LLILZLL.T4();
            C020W c020w = new C020W(this.LLIZ, interfaceC497601wk, 16);
            this.LL = 1;
            if (c370720EgA.LIZLLL(nLETrackSlot, i2, size, strT4, c020w, this) == objLJFF) {
                C1C7U.LIZIZ("CutoutPreviewComponent@35f0.capturePreviewBitmap$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutoutPreviewComponent@35f0.capturePreviewBitmap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
