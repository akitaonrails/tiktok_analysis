package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import java.io.File;
import java.nio.file.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.story.RevealStorySynthesisTask$synthesizeRevealStoryImage$4$1", f = "RevealStorySynthesisTask.kt", l = {}, m = "invokeSuspend")
public final class C2300308zp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ImageSynthesisResult>, Object> {
    public final /* synthetic */ Path LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300308zp(Path path, Bitmap bitmap, InterfaceC1364105Vn<? super C2300308zp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = path;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2300308zp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RevealStorySynthesisTask@353b.synthesizeRevealStoryImage$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File fileLIZJ = C2137908Zd.LIZJ.LIZJ(this.LL.toAbsolutePath().toString());
        if (fileLIZJ == null) {
            C1C7U.LIZIZ("RevealStorySynthesisTask@353b.synthesizeRevealStoryImage$4$1");
            return null;
        }
        C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, this.LLILLJJLI, fileLIZJ);
        ImageSynthesisResult imageSynthesisResult = new ImageSynthesisResult(fileLIZJ.getAbsolutePath(), this.LLILLJJLI.getWidth(), this.LLILLJJLI.getHeight(), null, null, null, null, null, null, 504, null);
        C1C7U.LIZIZ("RevealStorySynthesisTask@353b.synthesizeRevealStoryImage$4$1");
        return imageSynthesisResult;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ImageSynthesisResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
