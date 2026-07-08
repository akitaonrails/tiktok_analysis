package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Drl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352430Drl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int[] LLILZLL;
    public final /* synthetic */ int[] LLIZ;
    public final /* synthetic */ C352440Drm LLIZLLLIL;
    public final /* synthetic */ C2473609mg LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352430Drl(String str, C351920Dqw c351920Dqw, Context context, String str2, String str3, int[] iArr, int[] iArr2, C352440Drm c352440Drm, C2473609mg c2473609mg) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c351920Dqw;
        this.LLILLL = context;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = iArr;
        this.LLIZ = iArr2;
        this.LLIZLLLIL = c352440Drm;
        this.LLJ = c2473609mg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.length() <= 0 || !C2286708xd.LIZJ(this.LL)) {
            C201955140j.LJIIL("TemplateProducer pre-resize wait -> fail -> retry");
            C539510LDx c539510LDx = C539510LDx.LIZ;
            Context context = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LL;
            String str3 = this.LLILZIL;
            int[] iArr = this.LLILZLL;
            int[] iArr2 = this.LLIZ;
            C352440Drm c352440Drm = this.LLIZLLLIL;
            C2473609mg c2473609mg = this.LLJ;
            c539510LDx.getClass();
            C539510LDx.LIZIZ(context, str, str2, 1080, 1080, str3, null, iArr, iArr2, c352440Drm, c2473609mg);
        } else {
            C201955140j.LJIIL("TemplateProducer pre-resize wait -> success");
            this.LLILLJJLI.invoke(this.LL);
        }
        return Unit.LIZ;
    }
}
