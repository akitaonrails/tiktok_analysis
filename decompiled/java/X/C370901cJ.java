package X;

import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2", f = "EffectParser.kt", l = {78, 79, 80, 81, 82}, m = "invokeSuspend")
public final class C370901cJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C371301cN, ? extends C371801cS>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Gson LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370901cJ(String str, Gson gson, InterfaceC1364105Vn<? super C370901cJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = str;
        this.LLJ = gson;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C370901cJ c370901cJ = new C370901cJ(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c370901cJ.LLIZ = obj;
        return c370901cJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370901cJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C371301cN, ? extends C371801cS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
