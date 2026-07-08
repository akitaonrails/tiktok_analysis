package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateReverseTask$start$2$1$1", f = "TemplateReverseTask.kt", l = {83}, m = "invokeSuspend")
public final class C353580Dtc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C353570Dtb LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<C353610Dtf> LLILZIL;
    public final /* synthetic */ NLETrackSlot LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Function1<Float, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C353580Dtc(C353570Dtb c353570Dtb, String str, String str2, C259800zU<C353610Dtf> c259800zU, NLETrackSlot nLETrackSlot, int i, Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C353580Dtc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c353570Dtb;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = nLETrackSlot;
        this.LLIZ = i;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353580Dtc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, X.0Dtf] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        C1C7U.LIZ("TemplateReverseTask@c549.start$2$1$1");
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
            final C362440EIw c362440EIw = new C362440EIw();
            C353570Dtb c353570Dtb = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            final int i2 = this.LLIZ;
            final Function1<Float, Unit> function1 = this.LLIZLLLIL;
            INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged = new INLEMediaReverseOnProgressChanged() { // from class: X.0Dte
                @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged
                public final void onChanged(double d) {
                    double d2 = d / ((double) i2);
                    if ((d2 - c362440EIw.element) * ((double) C0L7R.LJJIJLIJ) > 1.0d) {
                        function1.invoke(Float.valueOf((float) d2));
                        c362440EIw.element = d2;
                    }
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Template_Reverse changed progress=");
                    sbLIZ.append(d);
                    C201955140j.LIZLLL(c1398350mUb, "TemplateReverseTask", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            this.LL = 1;
            c353570Dtb.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            File fileLIZIZ = C353710Dtp.LIZIZ();
            C351510DqH c351510DqH = C351510DqH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (fileLIZIZ == null || (absolutePath = fileLIZIZ.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            sbLIZ.append(absolutePath);
            sbLIZ.append(File.separator);
            if (C351510DqH.LJIJJLI(c351510DqH, str, str2, C2188811AlT.LIZIZ(sbLIZ), iNLEMediaReverseOnProgressChanged, new INLEMediaReverseOnDone() { // from class: X.0DrJ
                @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone
                public final void onDone(int i3) {
                    if (i3 == 0) {
                        InterfaceC1364105Vn<NLEError> interfaceC1364105Vn = c23260099m;
                        NLEError nLEError = NLEError.SUCCESS;
                        C189200o6.m2constructorimpl(nLEError);
                        interfaceC1364105Vn.resumeWith(nLEError);
                        return;
                    }
                    InterfaceC1364105Vn<NLEError> interfaceC1364105Vn2 = c23260099m;
                    NLEError nLEError2 = NLEError.FAILED;
                    C189200o6.m2constructorimpl(nLEError2);
                    interfaceC1364105Vn2.resumeWith(nLEError2);
                }
            }) != NLEError.SUCCESS) {
                NLEError nLEError = NLEError.FAILED;
                C189200o6.m2constructorimpl(nLEError);
                c23260099m.resumeWith(nLEError);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateReverseTask@c549.start$2$1$1");
                return objLJFF;
            }
        }
        if (obj != NLEError.SUCCESS) {
            C201955140j.LJIIIIZZ(C1398350mUb.LIZIZ, "TemplateReverseTask", "executeVideoReverse failed!");
            this.LLILZIL.element = new C353610Dtf(0);
        } else {
            C353570Dtb c353570Dtb2 = this.LLILLJJLI;
            NLETrackSlot nLETrackSlot = this.LLILZLL;
            String str3 = this.LLILZ;
            c353570Dtb2.getClass();
            C353570Dtb.LIZ(nLETrackSlot, str3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateReverseTask@c549.start$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
