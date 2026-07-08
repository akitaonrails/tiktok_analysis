package X;

import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS612S0100000_33;
import njp.a;

/* JADX INFO: renamed from: X.1A1T, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssem$tryToDisplayComponent$1", f = "MUFQuickDMBoxAssem.kt", l = {386, 407, 447, 489}, m = "invokeSuspend")
public final class C1A1T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AwS612S0100000_33 LL;
    public Object LLILLJJLI;
    public MUFQuickDMBoxAssem LLILLL;
    public C1A1K LLILZ;
    public VideoItemParams LLILZIL;
    public User LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ MUFQuickDMBoxAssem LLJI;
    public final /* synthetic */ VideoItemParams LLJIJIL;
    public final /* synthetic */ C1A1K LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A1T(boolean z, MUFQuickDMBoxAssem mUFQuickDMBoxAssem, VideoItemParams videoItemParams, C1A1K c1a1k, InterfaceC1364105Vn<? super C1A1T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = z;
        this.LLJI = mUFQuickDMBoxAssem;
        this.LLJIJIL = videoItemParams;
        this.LLJILJIL = c1a1k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1A1T(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A1T.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
