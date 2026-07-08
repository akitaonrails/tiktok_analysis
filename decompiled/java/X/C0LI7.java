package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LI7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene$generateTextCover$2", f = "TextToImageEditScene.kt", l = {375, 375, 375}, m = "invokeSuspend")
public final class C0LI7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ TextToImageEditScene LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LI7(TextToImageEditScene textToImageEditScene, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super C0LI7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = textToImageEditScene;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LI7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C1C7U.LIZ("TextToImageEditScene@591c.generateTextCover$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) this.LL;
                C155000ia.LIZIZ(obj);
                throw th;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TextView textView = (TextView) this.LLILLL.mView.findViewById(R.id.hcw);
            String str = this.LLILLL.getEditModel().creativeModel.text2ImageModel.text;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2");
                return unit;
            }
            textView.setText(this.LLILLL.getEditModel().creativeModel.text2ImageModel.text);
            C259800zU c259800zU = new C259800zU();
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = "";
            try {
                try {
                    c259800zU.element = C19724012Fa.LIZ(textView, Bitmap.Config.ARGB_8888);
                    c259800zU2.element = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(this.LLILLL.getEditModel().getCreativeInfo());
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C0LI8 c0li8 = new C0LI8(c259800zU, c259800zU2, this.LLILLL, this.LLILZ, null);
                    this.LLILLJJLI = 1;
                    if (C23250099c.LJI(this, c1dfb, c0li8) == objLJFF) {
                        C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2");
                        return objLJFF;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("text2image error ");
                    sbLIZ.append(e);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1DFB c1dfb2 = C0PEM.LIZJ;
                    C0LI8 c0li82 = new C0LI8(c259800zU, c259800zU2, this.LLILLL, this.LLILZ, null);
                    this.LLILLJJLI = 2;
                    if (C23250099c.LJI(this, c1dfb2, c0li82) == objLJFF) {
                        C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2");
                        return objLJFF;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1DFB c1dfb3 = C0PEM.LIZJ;
                C0LI8 c0li83 = new C0LI8(c259800zU, c259800zU2, this.LLILLL, this.LLILZ, null);
                this.LL = th2;
                this.LLILLJJLI = 3;
                if (C23250099c.LJI(this, c1dfb3, c0li83) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2");
                    return objLJFF;
                }
                throw th2;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageEditScene@591c.generateTextCover$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
