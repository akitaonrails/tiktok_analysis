package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789270wf7 {
    public static final /* synthetic */ C1789270wf7 LIZ = new C1789270wf7();
    public static volatile C1789140weu LIZIZ;

    public final C1789140weu LIZIZ() {
        C1789140weu c1789140weu = LIZIZ;
        if (c1789140weu == null) {
            synchronized (this) {
                try {
                    c1789140weu = LIZIZ;
                    if (c1789140weu == null) {
                        throw new ExceptionInInitializerError("sdk is not initialized. call IAP.init() first");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1789140weu;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0wde] */
    public static C1789140weu LIZ(Context context) {
        InterfaceC1787780wci interfaceC1787780wci = new InterfaceC1787780wci() { // from class: X.0wfG
            @Override // X.InterfaceC1787780wci
            public final void LIZ() {
            }

            @Override // X.InterfaceC1787780wci
            public final void LIZIZ() {
            }
        };
        C1789260wf6 c1789260wf6 = new C1789260wf6(null);
        return new C1789140weu(c1789260wf6, new C1790100wgS(c1789260wf6), new InterfaceC1796290wqR() { // from class: X.0wqI
            public static final C1796220wqK LIZIZ;
            public final InterfaceC1796290wqR LIZ = new InterfaceC1796290wqR() { // from class: X.0wqJ
                public static final C1796220wqK LIZIZ;

                static {
                    InterfaceC1796190wqH.LIZ.getClass();
                    C1796400wqc c1796400wqc = C1796180wqG.LIZIZ;
                    c1796400wqc.getClass();
                    LIZIZ = new C1796220wqK(c1796400wqc, "ClassNameChannelFinder");
                }

                @Override // X.InterfaceC1796290wqR
                public final InterfaceC1786800wb8 LIZ(Context context2, String str) {
                    String str2;
                    if (Intrinsics.LJFF(str, "amazon_int")) {
                        str2 = "com.bytedance.iap.channel.amazon.IAPAmazonChannel";
                    } else {
                        str2 = "com.bytedance.iap.channel.google.IAPGoogleChannel";
                    }
                    try {
                        return (InterfaceC1786800wb8) Class.forName(str2).getDeclaredConstructor(Context.class).newInstance(context2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1796220wqK c1796220wqK = LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fail to create instance of ");
                        sbLIZ.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1796220wqK.LIZ.w();
                        c1796220wqK.LIZ(null);
                        throw new IllegalStateException("no available channel found");
                    }
                }
            };

            static {
                InterfaceC1796190wqH.LIZ.getClass();
                C1796400wqc c1796400wqc = C1796180wqG.LIZIZ;
                c1796400wqc.getClass();
                LIZIZ = new C1796220wqK(c1796400wqc, "ToolingSupportedChannelFinder");
            }

            @Override // X.InterfaceC1796290wqR
            public final InterfaceC1786800wb8 LIZ(Context context2, String str) {
                InterfaceC1786800wb8 interfaceC1786800wb8LIZ = this.LIZ.LIZ(context2, str);
                try {
                    Object objNewInstance = Class.forName("com.bytedance.iap.channel.mock.IAPMockChannel").getDeclaredConstructor(InterfaceC1786800wb8.class, Context.class).newInstance(interfaceC1786800wb8LIZ, context2);
                    C1796220wqK c1796220wqK = LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("created a mock channel wrapping the ");
                    sbLIZ.append(str);
                    sbLIZ.append(" channel");
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1796220wqK.LIZ.d();
                    return (InterfaceC1786800wb8) objNewInstance;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ.LIZ.d();
                    return interfaceC1786800wb8LIZ;
                }
            }
        }.LIZ(context, c1789260wf6.LIZ.LIZIZ()), new InterfaceC1788350wdd() { // from class: X.0wde
            public final C1790040wgM LIZ = new InterfaceC1788290wdX() { // from class: X.0wgM
                @Override // X.InterfaceC1788290wdX
                public final EnumC1787200wbm LIZ(Activity activity) {
                    C742170T9j.LIZ(new AwS545S0100000_1(activity, 1638));
                    return EnumC1787200wbm.CLOSE;
                }

                @Override // X.InterfaceC1788290wdX
                public final EnumC1787200wbm LIZIZ(Activity activity) {
                    C742170T9j.LIZ(new AwS545S0100000_1(activity, 1639));
                    return EnumC1787200wbm.CLOSE;
                }

                @Override // X.InterfaceC1788290wdX
                public final EnumC1787200wbm LIZJ(Activity activity) {
                    C742170T9j.LIZ(new AwS545S0100000_1(activity, 1636));
                    return EnumC1787200wbm.CLOSE;
                }

                @Override // X.InterfaceC1788290wdX
                public final EnumC1787200wbm LJI(Activity activity) {
                    C742170T9j.LIZ(new AwS545S0100000_1(activity, 1637));
                    return EnumC1787200wbm.CLOSE;
                }

                @Override // X.InterfaceC1788290wdX
                public final Object LIZLLL(Activity activity, C1788270wdV c1788270wdV) {
                    return new C1790070wgP().LIZ(activity, c1788270wdV);
                }

                @Override // X.InterfaceC1788290wdX
                public final Object LJ(Activity activity, C1788270wdV c1788270wdV) {
                    return new C1790080wgQ().LIZ(activity, c1788270wdV);
                }

                @Override // X.InterfaceC1788290wdX
                public final Object LJFF(Activity activity, C1788270wdV c1788270wdV) {
                    return new C1790070wgP().LIZ(activity, c1788270wdV);
                }
            };

            @Override // X.InterfaceC1788350wdd
            public final C1790040wgM LIZ() {
                return this.LIZ;
            }
        }, interfaceC1787780wci);
    }

    public final void LIZJ(Context context) {
        if (LIZIZ != null) {
            return;
        }
        synchronized (this) {
            try {
                LIZIZ = LIZ(context);
                C23250099c.LIZLLL(C352701Yn.LIZ, C0PEM.LIZ, null, new C352801Yo(null), 2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
