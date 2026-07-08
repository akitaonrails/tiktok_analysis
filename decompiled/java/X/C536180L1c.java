package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ExtractMusicChosenResultImpl$onChosenResult$extractTask$1$1", f = "ExtractMusicChosenResultImpl.kt", l = {143, 147}, m = "invokeSuspend")
public final class C536180L1c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C536160L1a LLILZ;
    public final /* synthetic */ MediaModel LLILZIL;
    public final /* synthetic */ Intent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536180L1c(C536160L1a c536160L1a, MediaModel mediaModel, Intent intent, InterfaceC1364105Vn<? super C536180L1c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c536160L1a;
        this.LLILZIL = mediaModel;
        this.LLILZLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536180L1c(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536180L1c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
