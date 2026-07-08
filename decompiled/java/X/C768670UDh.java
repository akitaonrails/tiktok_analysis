package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768670UDh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<LiveEffect> LL;
    public final /* synthetic */ C938970aXf LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C768670UDh(List<? extends LiveEffect> list, C938970aXf c938970aXf, boolean z, boolean z2) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = c938970aXf;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r10 = this;
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r10.LL
            if (r0 == 0) goto Laf
            X.0aXf r4 = r10.LLILLJJLI
            boolean r3 = r10.LLILLL
            boolean r2 = r10.LLILZ
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r0.iterator()
        L16:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r1 = r9.next()
            r0 = r1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            r6 = 0
            java.lang.String r7 = r0.getExtra()     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5e
            X.0av3 r0 = X.C953470av3.LIZ     // Catch: java.lang.Throwable -> L5a
            r0.getClass()     // Catch: java.lang.Throwable -> L5a
            com.google.gson.n r7 = X.C953470av3.LJ(r7)     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5e
            java.lang.String r0 = "effectsdk_config"
            com.google.gson.k r0 = r7.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.LJIL()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5e
            com.google.gson.n r8 = X.C953470av3.LJ(r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 == 0) goto L5f
            java.lang.String r0 = "mg_is_hidden"
            com.google.gson.k r0 = r8.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L5f
            boolean r0 = r0.LJ()     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L61
            goto L67
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            r8 = r6
        L5f:
            r7 = r6
            goto L67
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicWallpaperAbGroupSetting.getValue()
            int r0 = r0.length()
            if (r0 == 0) goto L96
            if (r8 == 0) goto L8c
            java.lang.String r0 = "multi_wallpaper_ab_group"
            com.google.gson.k r0 = r8.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8c
            java.lang.String r6 = r0.LJIL()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8c:
            java.lang.String r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicWallpaperAbGroupSetting.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L16
        L96:
            r5.add(r1)
            goto L16
        L9b:
            java.util.Iterator r1 = r5.iterator()
        L9f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            r4.LJ(r0, r3, r2)
            goto L9f
        Laf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C768670UDh.invoke():java.lang.Object");
    }
}
