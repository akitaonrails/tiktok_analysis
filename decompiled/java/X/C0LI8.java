package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LI8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene$generateTextCover$2$1", f = "TextToImageEditScene.kt", l = {379, 383, 383, 383}, m = "invokeSuspend")
public final class C0LI8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ TextToImageEditScene LLILZIL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LI8(C259800zU<Bitmap> c259800zU, C259800zU<String> c259800zU2, TextToImageEditScene textToImageEditScene, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super C0LI8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = textToImageEditScene;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LI8(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TextToImageEditScene@591c.generateTextCover$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("text2image error ");
                sbLIZ.append(e);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILZLL;
                if (function1 != null) {
                    this.LLILLJJLI = 3;
                    if (function1.invoke(this) == objLJFF) {
                        C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
                        return objLJFF;
                    }
                }
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.LL;
                        C155000ia.LIZIZ(obj);
                        throw th;
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
                    return unit;
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (C1319770kRr.LJ(60, Bitmap.CompressFormat.PNG, this.LLILLL.element, new C0VSJ(this.LLILZ.element))) {
                    this.LLILZIL.getEditModel().creativeModel.text2ImageModel.coverPath = this.LLILZ.element;
                }
                C0MZB c0mzbLJIILLIIL = C0CHQ.LIZ().LJIILLIIL();
                VideoPublishEditModel editModel = this.LLILZIL.getEditModel();
                String str = this.LLILZ.element;
                this.LLILLJJLI = 1;
                if (c0mzbLJIILLIIL.LIZIZ(str, editModel, this) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
                    return objLJFF;
                }
            }
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function12 = this.LLILZLL;
            if (function12 != null) {
                this.LLILLJJLI = 2;
                if (function12.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
            return unit2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function13 = this.LLILZLL;
            if (function13 != null) {
                this.LL = th2;
                this.LLILLJJLI = 4;
                if (function13.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2$1");
                    return objLJFF;
                }
                throw th2;
            }
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
