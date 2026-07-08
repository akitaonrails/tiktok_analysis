package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$generateConsumeImageList$2$1", f = "TextImageForwardResolver.kt", l = {845}, m = "invokeSuspend")
public final class C059J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Text2ImageGenerator LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<List<TextImageTaskInfo>> LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<Integer, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C059J(Text2ImageGenerator text2ImageGenerator, InterfaceC20236714Gf<? super List<TextImageTaskInfo>> interfaceC20236714Gf, VideoPublishEditModel videoPublishEditModel, String str, boolean z, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C059J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = text2ImageGenerator;
        this.LLILZ = interfaceC20236714Gf;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C059J c059j = new C059J(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c059j.LLILLJJLI = obj;
        return c059j;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TextImageForwardResolver@7aa9.generateConsumeImageList$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                Text2ImageGenerator text2ImageGenerator = this.LLILLL;
                VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
                String str = this.LLILZLL;
                boolean z2 = this.LLIZ;
                Function1<Integer, Unit> function1 = this.LLIZLLLIL;
                InterfaceC20236714Gf<List<TextImageTaskInfo>> interfaceC20236714Gf = this.LLILZ;
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C059K(videoPublishEditModel, text2ImageGenerator, null), 3);
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                C059I c059i = new C059I(function1, interfaceC20236714Gf, null);
                this.LLILLJJLI = text2ImageGenerator;
                this.LL = 1;
                if (text2ImageGenerator.LJII(videoPublishEditModel, true, true, str, z, c059i, this) == objLJFF) {
                    C1C7U.LIZIZ("TextImageForwardResolver@7aa9.generateConsumeImageList$2$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LLILZ.isActive()) {
                InterfaceC20236714Gf<List<TextImageTaskInfo>> interfaceC20236714Gf2 = this.LLILZ;
                C13BV c13bv = C13BV.INSTANCE;
                C189200o6.m2constructorimpl(c13bv);
                interfaceC20236714Gf2.resumeWith(c13bv);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextImageForwardResolver@7aa9.generateConsumeImageList$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
