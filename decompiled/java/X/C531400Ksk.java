package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ksk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$downloadMusicTask$2", f = "CutOptimizedVideoChosenHandler.kt", l = {1059}, m = "invokeSuspend")
public final class C531400Ksk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends List<? extends C531370Ksh>>>, Object> {
    public C259800zU LL;
    public C0L7R LLILLJJLI;
    public ShortVideoContext LLILLL;
    public CreativeModel LLILZ;
    public C259800zU LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C0L7R LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ ShortVideoContext LLJ;
    public final /* synthetic */ CreativeModel LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531400Ksk(C0L7R c0l7r, List<String> list, ShortVideoContext shortVideoContext, CreativeModel creativeModel, InterfaceC1364105Vn<? super C531400Ksk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c0l7r;
        this.LLIZLLLIL = list;
        this.LLJ = shortVideoContext;
        this.LLJI = creativeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531400Ksk(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531400Ksk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends List<? extends C531370Ksh>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
