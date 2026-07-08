package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.096M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.core.SmartMovieMediaProcessor$compressMeta$event$1", f = "SmartMovieMediaProcessor.kt", l = {82}, m = "invokeSuspend")
public final class C096M extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096Q>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C096M(InterfaceC1364105Vn<? super C096M> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieMediaProcessor@7e98.compressMeta$event$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Throwable th = (Throwable) this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Compression failed with exception: ");
            sbLIZ.append(th.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AnonymousClass0968 anonymousClass0968 = AnonymousClass0968.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SmartMovieMediaProcessor ");
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            LogLevel logLevel = LogLevel.LEVEL_ERROR;
            anonymousClass0968.getClass();
            AnonymousClass0968.LIZ(logLevel, strLIZIZ2);
            C096P c096p = new C096P(strLIZIZ, -1);
            this.LLILLJJLI = null;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c096p, this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMeta$event$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieMediaProcessor@7e98.compressMeta$event$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096Q> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C096M c096m = new C096M(interfaceC1364105Vn);
        c096m.LLILLJJLI = interfaceC346701Wf;
        c096m.LLILLL = th;
        return c096m.invokeSuspend(Unit.LIZ);
    }
}
