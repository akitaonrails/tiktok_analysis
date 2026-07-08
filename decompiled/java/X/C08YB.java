package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.recording.js.RecordingNativeContextHandler;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08YB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingNativeContextHandler$onWebRequest$1", f = "RecordingNativeContextHandler.kt", l = {}, m = "invokeSuspend")
public final class C08YB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RecordingNativeContextHandler LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08YB(String str, String str2, RecordingNativeContextHandler recordingNativeContextHandler, long j, String str3, InterfaceC1364105Vn<? super C08YB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = recordingNativeContextHandler;
        this.LLILZ = j;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08YB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingNativeContextHandler@1a36.onWebRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordingNativeContextHandler@1a36.onWebRequest$1");
            return unit;
        }
        String upperCase = this.LLILLJJLI.toUpperCase(Locale.ROOT);
        String strLJZL = C13LN.LJZL(LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        RecordingNativeContextHandler recordingNativeContextHandler = this.LLILLL;
        Object obj2 = recordingNativeContextHandler.LIZJ;
        long j = this.LLILZ;
        String str = this.LLILZIL;
        synchronized (obj2) {
            try {
                recordingNativeContextHandler.getClass();
                ArrayList arrayList = new ArrayList();
                for (C08YC c08yc : recordingNativeContextHandler.LIZIZ) {
                    if (j - c08yc.LIZLLL <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                        break;
                    }
                    arrayList.add(c08yc);
                }
                if (!arrayList.isEmpty()) {
                    recordingNativeContextHandler.LIZIZ.removeAll(arrayList);
                    arrayList.size();
                }
                recordingNativeContextHandler.LIZIZ.add(new C08YC(str, strLJZL, upperCase, j));
                if (recordingNativeContextHandler.LIZIZ.size() > 100) {
                    recordingNativeContextHandler.LIZIZ.remove(0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordingNativeContextHandler@1a36.onWebRequest$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
