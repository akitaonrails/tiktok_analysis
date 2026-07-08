package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$downloadMusicTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {1024, 1049}, m = "invokeSuspend")
public final class C531340Kse extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends List<? extends C531370Ksh>>>, Object> {
    public long LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0L7R LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ShortVideoContext LLIZ;
    public final /* synthetic */ Intent LLIZLLLIL;
    public final /* synthetic */ Intent LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531340Kse(C0L7R c0l7r, String str, ShortVideoContext shortVideoContext, Intent intent, Intent intent2, InterfaceC1364105Vn<? super C531340Kse> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0l7r;
        this.LLILZLL = str;
        this.LLIZ = shortVideoContext;
        this.LLIZLLLIL = intent;
        this.LLJ = intent2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531340Kse(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531340Kse.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends List<? extends C531370Ksh>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
