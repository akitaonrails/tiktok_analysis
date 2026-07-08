package X;

import com.ss.android.ugc.aweme.aigc.AIGCNotifyRouteAction;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LOP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LOP extends C2217421BqW implements Function2<String, String, InterfaceC542330LOt> {
    public C0LOP(Object obj) {
        super(2, obj, AIGCNotifyRouteAction.class, "createNotifyLogger", "createNotifyLogger(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/aigc/NotifyLogger;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC542330LOt invoke(String str, String str2) {
        final String str3 = str;
        final String str4 = str2;
        this.receiver.getClass();
        return new InterfaceC542330LOt() { // from class: X.0LOO
            @Override // X.InterfaceC542330LOt
            public final void LIZ(String str5) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                String str6 = str4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str3);
                sbLIZ.append("] ");
                sbLIZ.append(str5);
                c547140Ld2.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.InterfaceC542330LOt
            public final void d(String str5) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                String str6 = str4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str3);
                sbLIZ.append("] ");
                sbLIZ.append(str5);
                c547140Ld2.LIZ(str6, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC542330LOt
            public final void i(String str5) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                String str6 = str4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str3);
                sbLIZ.append("] ");
                sbLIZ.append(str5);
                c547140Ld2.LIZJ(str6, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC542330LOt
            public final void e(String str5, Throwable th) {
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                String str6 = str4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str3);
                sbLIZ.append("] ");
                sbLIZ.append(str5);
                c547140Ld2.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ), th);
            }
        };
    }
}
