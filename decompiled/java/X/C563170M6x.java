package X;

import android.content.Context;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel$jumpToAIRemixPage$2", f = "AIRemixChannel.kt", l = {181}, m = "invokeSuspend")
public final class C563170M6x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC563090M6p LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public AIRemixCommonEntranceInfo LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ AIRemixChannel LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563170M6x(AIRemixChannel aIRemixChannel, Context context, Function0<Unit> function0, InterfaceC1364105Vn<? super C563170M6x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = aIRemixChannel;
        this.LLIZLLLIL = context;
        this.LLJ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563170M6x(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C563170M6x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
