package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.Krypton;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.ref.WeakReference;
import java.util.Set;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.144b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202051144b {
    public static final C202051144b LIZ = new C202051144b();

    public static void LIZIZ() {
        try {
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("lynx", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("krypton", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("kryptonaudio", true);
            Krypton.LIZIZ().getClass();
            Krypton.LIZJ("kryptoni18n", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadKryptonLib failed: ");
            sbLIZ.append(th.getMessage());
            C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LIZJ(String str) {
        try {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadLibrary lib");
            sbLIZ.append(str);
            sbLIZ.append(".so success");
            C2188811AlT.LIZIZ(sbLIZ);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadLibrary lib");
            sbLIZ2.append(str);
            sbLIZ2.append(".so error: ");
            sbLIZ2.append(th.getMessage());
            C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public static boolean LIZ(String str, Set set) {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        C844470XAv.LIZ.getClass();
        boolean zContains = set.contains(C844470XAv.LJIILL);
        if ((iPluginService != null && iPluginService.checkPluginInstalled(str)) || zContains) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.app.Activity r14, com.ss.android.ugc.aweme.minis.common.SchemaParserData r15, X.InterfaceC1364105Vn<? super X.AbstractC1868510yiv> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C202052144c
            if (r0 == 0) goto L83
            r12 = r3
            X.144c r12 = (X.C202052144c) r12
            int r2 = r12.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r12.LLILZIL = r2
        L14:
            java.lang.Object r3 = r12.LLILLL
            java.lang.Object r0 = X.C099R.LJFF()
            int r2 = r12.LLILZIL
            r1 = 2
            r4 = 1
            if (r2 == 0) goto L28
            if (r2 == r4) goto L50
            if (r2 != r1) goto L89
            X.C155000ia.LIZIZ(r3)
        L27:
            return r3
        L28:
            X.C155000ia.LIZIZ(r3)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r14)
            java.lang.String r6 = "com.bytedance.tiktok.vmsdk"
            X.08CX r7 = X.C08CX.INSTANCE
            X.144e r8 = new X.144e
            r8.<init>(r13)
            r9 = 1003(0x3eb, float:1.406E-42)
            r10 = 1004(0x3ec, float:1.407E-42)
            kotlin.jvm.internal.AwS679S0100000_30 r11 = new kotlin.jvm.internal.AwS679S0100000_30
            r2 = 1
            r11.<init>(r15, r2)
            r12.LL = r15
            r12.LLILLJJLI = r5
            r12.LLILZIL = r4
            java.lang.Object r3 = LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r0) goto L59
            return r0
        L50:
            java.lang.Object r5 = r12.LLILLJJLI
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r15 = r12.LL
            X.C155000ia.LIZIZ(r3)
        L59:
            boolean r2 = r3 instanceof X.C1868500yiu
            if (r2 == 0) goto L5e
            return r3
        L5e:
            java.lang.String r6 = "com.bytedance.tiktok.ship"
            java.lang.String r2 = "local_test"
            java.util.Set r7 = java.util.Collections.singleton(r2)
            X.144d r8 = new X.144d
            r8.<init>(r13)
            r9 = 1005(0x3ed, float:1.408E-42)
            r10 = 1006(0x3ee, float:1.41E-42)
            kotlin.jvm.internal.AwS679S0100000_30 r11 = new kotlin.jvm.internal.AwS679S0100000_30
            r2 = 0
            r11.<init>(r15, r2)
            r2 = 0
            r12.LL = r2
            r12.LLILLJJLI = r2
            r12.LLILZIL = r1
            java.lang.Object r3 = LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r0) goto L27
            return r0
        L83:
            X.144c r12 = new X.144c
            r12.<init>(r13, r3)
            goto L14
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202051144b.LJ(android.app.Activity, com.ss.android.ugc.aweme.minis.common.SchemaParserData, X.05Vn):java.lang.Object");
    }

    public static AbstractC1868510yiv LJFF(String str, Function0 function0, int i, InterfaceC1631620sYq interfaceC1631620sYq) {
        if (((Boolean) function0.invoke()).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            interfaceC1631620sYq.invoke(bool, bool, "");
            return C1868520yiw.LIZ;
        }
        interfaceC1631620sYq.invoke(Boolean.TRUE, Boolean.FALSE, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": System.loadLibrary failed");
        return new C1868500yiu(i, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object LIZLLL(final WeakReference weakReference, final String str, Set set, final Function0 function0, final int i, final int i2, final InterfaceC1631620sYq interfaceC1631620sYq, C202052144c c202052144c) {
        final IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (LIZ(str, set)) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" already installed (or bundled)");
            C2188811AlT.LIZIZ(sbLIZ);
            return C23250099c.LJI(c202052144c, C0PEM.LIZJ, new C862210Xs3(str, function0, i, interfaceC1631620sYq, null));
        }
        if (iPluginService == null) {
            interfaceC1631620sYq.invoke(false, false, "IPluginService unavailable");
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(": IPluginService unavailable, cannot install");
            C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(": IPluginService unavailable");
            return new C1868500yiu(i, C2188811AlT.LIZIZ(sbLIZ3));
        }
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c202052144c));
        c2252611DEt.LJIJJ();
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZIZ = true;
        c844020X9c.LIZ = str;
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LJII = EnumC202055144f.APPEND;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.144a
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z) {
                String str3 = "";
                try {
                    Activity activity = weakReference.get();
                    C1BLW c1blwLIZLLL = iPluginService.LIZLLL();
                    if (activity != null && c1blwLIZLLL != null) {
                        a.install(activity);
                        a.LIZLLL(activity);
                        C202051144b c202051144b = C202051144b.LIZ;
                        String str4 = str;
                        Function0<Boolean> function02 = function0;
                        int i5 = i;
                        InterfaceC1631620sYq<Boolean, Boolean, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        c202051144b.getClass();
                        AbstractC1868510yiv abstractC1868510yivLJFF = C202051144b.LJFF(str4, function02, i5, interfaceC1631620sYq2);
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<AbstractC1868510yiv> interfaceC20236714Gf = c2252611DEt;
                            C189200o6.m2constructorimpl(abstractC1868510yivLJFF);
                            interfaceC20236714Gf.resumeWith(abstractC1868510yivLJFF);
                            return;
                        }
                        return;
                    }
                    interfaceC1631620sYq.invoke(Boolean.TRUE, Boolean.FALSE, "");
                    int i6 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" onSuccess but aabService=");
                    sbLIZ4.append(c1blwLIZLLL);
                    sbLIZ4.append(" activity=");
                    sbLIZ4.append(activity);
                    C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ4));
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<AbstractC1868510yiv> interfaceC20236714Gf2 = c2252611DEt;
                        int i7 = i;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(str);
                        sbLIZ5.append(": aabService or activity null after install");
                        C1868500yiu c1868500yiu = new C1868500yiu(i7, C2188811AlT.LIZIZ(sbLIZ5));
                        C189200o6.m2constructorimpl(c1868500yiu);
                        interfaceC20236714Gf2.resumeWith(c1868500yiu);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    InterfaceC1631620sYq<Boolean, Boolean, String, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq;
                    Boolean bool = Boolean.TRUE;
                    Boolean bool2 = Boolean.FALSE;
                    String message = th.getMessage();
                    if (message != null) {
                        str3 = message;
                    }
                    interfaceC1631620sYq3.invoke(bool, bool2, str3);
                    int i8 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str);
                    sbLIZ6.append(" onPluginInstallSuccess callback failed: ");
                    sbLIZ6.append(th.getMessage());
                    C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ6));
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<AbstractC1868510yiv> interfaceC20236714Gf3 = c2252611DEt;
                        int i9 = i2;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(str);
                        sbLIZ7.append(" onPluginInstallSuccess callback failed: ");
                        sbLIZ7.append(th.getMessage());
                        C1868500yiu c1868500yiu2 = new C1868500yiu(i9, C2188811AlT.LIZIZ(sbLIZ7));
                        C189200o6.m2constructorimpl(c1868500yiu2);
                        interfaceC20236714Gf3.resumeWith(c1868500yiu2);
                    }
                }
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i5, String str2, boolean z) {
                InterfaceC1631620sYq<Boolean, Boolean, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                Boolean bool = Boolean.FALSE;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("reason:");
                sbLIZ4.append(i5);
                interfaceC1631620sYq2.invoke(bool, bool, C2188811AlT.LIZIZ(sbLIZ4));
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append(" onPluginInstallFailed reason:");
                sbLIZ5.append(i5);
                C1720106oR.LIZ("MinisVmsdkShipPluginLoader", C2188811AlT.LIZIZ(sbLIZ5));
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<AbstractC1868510yiv> interfaceC20236714Gf = c2252611DEt;
                    int i7 = i;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str);
                    sbLIZ6.append(" onPluginInstallFailed reason:");
                    sbLIZ6.append(i5);
                    C1868500yiu c1868500yiu = new C1868500yiu(i7, C2188811AlT.LIZIZ(sbLIZ6));
                    C189200o6.m2constructorimpl(c1868500yiu);
                    interfaceC20236714Gf.resumeWith(c1868500yiu);
                }
            }
        };
        iPluginService.LJJI(new C202068144s(c844020X9c));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c202052144c);
        }
        return objLJIJ;
    }
}
