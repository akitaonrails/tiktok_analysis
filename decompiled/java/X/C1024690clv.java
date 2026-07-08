package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0clv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024690clv extends C09AY implements InterfaceC1631620sYq<SessionInfo, String, Map<String, ? extends Object>, Unit> {
    public final /* synthetic */ Map<String, Function0<Object>> LL;
    public final /* synthetic */ Gson LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024690clv(Map<String, Function0<Object>> map, Gson gson) {
        super(3);
        this.LL = map;
        this.LLILLJJLI = gson;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo r7 = (com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo) r7
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r9 = (java.util.Map) r9
            r1 = 1
            if (r8 == 0) goto L64
            boolean r0 = kotlin.text.a0.LJJJIL(r8)
            if (r0 != 0) goto L64
            r0 = 0
        L10:
            java.lang.String r3 = "session_info"
            if (r0 != 0) goto L57
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "iab_custom_session_switch"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 == 0) goto L57
            java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> r2 = r6.LL
            kotlin.jvm.internal.AwS101S1000000_16 r1 = new kotlin.jvm.internal.AwS101S1000000_16
            r0 = 3
            r1.<init>(r8, r0)
            r2.put(r3, r1)
        L2e:
            java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> r5 = r6.LL
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L38:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            kotlin.jvm.internal.AwS560S0100000_16 r1 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 685(0x2ad, float:9.6E-43)
            r1.<init>(r2, r0)
            r5.put(r3, r1)
            goto L38
        L57:
            java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> r2 = r6.LL
            X.0clw r1 = new X.0clw
            com.google.gson.Gson r0 = r6.LLILLJJLI
            r1.<init>(r7, r0)
            r2.put(r3, r1)
            goto L2e
        L64:
            r0 = 1
            goto L10
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1024690clv.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
