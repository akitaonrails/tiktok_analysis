package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.bytedance.ies.cutsame.prepare.VEEditorUtils$optimizeMediaSize$1", f = "VEEditorUtils.kt", l = {}, m = "invokeSuspend")
public final class C352520Dru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC352560Dry LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C2473609mg LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ int[] LLJI;
    public final /* synthetic */ int[] LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352520Dru(Context context, String str, int i, int i2, InterfaceC352560Dry interfaceC352560Dry, String str2, C2473609mg c2473609mg, String str3, Integer num, int[] iArr, int[] iArr2, InterfaceC1364105Vn<? super C352520Dru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = interfaceC352560Dry;
        this.LLILZLL = str2;
        this.LLIZ = c2473609mg;
        this.LLIZLLLIL = str3;
        this.LLJ = num;
        this.LLJI = iArr;
        this.LLJIJIL = iArr2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352520Dru(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("VEEditorUtils@1e99.optimizeMediaSize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        Context context = this.LL;
        String str = this.LLILLJJLI;
        mediaUtil.getClass();
        if (MediaUtil.LIZIZ(context, str)) {
            C539510LDx c539510LDx = C539510LDx.LIZ;
            Context context2 = this.LL;
            String str2 = this.LLILLJJLI;
            int i = this.LLILLL;
            int i2 = this.LLILZ;
            InterfaceC352560Dry interfaceC352560Dry = this.LLILZIL;
            String str3 = this.LLILZLL;
            C2473609mg c2473609mg = this.LLIZ;
            c539510LDx.getClass();
            C539510LDx.LIZ(context2, str2, i, i2, interfaceC352560Dry, str3, c2473609mg);
        } else {
            C539510LDx c539510LDx2 = C539510LDx.LIZ;
            Context context3 = this.LL;
            String str4 = this.LLILLJJLI;
            int i3 = this.LLILLL;
            int i4 = this.LLILZ;
            InterfaceC352560Dry interfaceC352560Dry2 = this.LLILZIL;
            String str5 = this.LLILZLL;
            String str6 = this.LLIZLLLIL;
            Integer num = this.LLJ;
            int[] iArr = this.LLJI;
            int[] iArr2 = this.LLJIJIL;
            c539510LDx2.getClass();
            C539510LDx.LIZLLL(context3, str4, i3, i4, interfaceC352560Dry2, str5, str6, num, iArr, iArr2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEEditorUtils@1e99.optimizeMediaSize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
