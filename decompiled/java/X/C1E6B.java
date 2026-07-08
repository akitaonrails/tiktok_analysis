package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1E6B, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1E6B {
    public static final C1E6K Companion;
    public static final /* synthetic */ C1E6B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1E6B SparkSecuritySolutionChannelGecko;
    public static final C1E6B SparkSecuritySolutionChannelHybridLoad;
    public static final C1E6B SparkSecuritySolutionChannelJSB;
    public static final C1E6B SparkSecuritySolutionChannelJSExecution;
    public static final C1E6B SparkSecuritySolutionChannelLynxSystemApi;
    public static final C1E6B SparkSecuritySolutionChannelNetwork;
    public static final C1E6B SparkSecuritySolutionChannelNetworkReousrce;
    public static final C1E6B SparkSecuritySolutionChannelNone;
    public static final C1E6B SparkSecuritySolutionChannelWebApi;
    public static final C1E6B SparkSecuritySolutionChannelWebNavigation;
    public static final C1E6B SparkSecuritySolutionJSI;
    public static final C1E6B SparkSecurityWebSolutionChannelResourceLoad;

    public C1E6B() {
        throw null;
    }

    public static InterfaceC2044707zh<C1E6B> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.1E6K] */
    static {
        C1E6B c1e6b = new C1E6B() { // from class: X.1E67
            @Override // java.lang.Enum
            public final String toString() {
                return "None";
            }
        };
        SparkSecuritySolutionChannelNone = c1e6b;
        C1E6B c1e6b2 = new C1E6B() { // from class: X.1E6I
            @Override // java.lang.Enum
            public final String toString() {
                return "WebApi";
            }
        };
        SparkSecuritySolutionChannelWebApi = c1e6b2;
        C1E6B c1e6b3 = new C1E6B() { // from class: X.1E6G
            @Override // java.lang.Enum
            public final String toString() {
                return "LynxSystemApi";
            }
        };
        SparkSecuritySolutionChannelLynxSystemApi = c1e6b3;
        C1E6B c1e6b4 = new C1E6B() { // from class: X.1E6E
            @Override // java.lang.Enum
            public final String toString() {
                return "JSB";
            }
        };
        SparkSecuritySolutionChannelJSB = c1e6b4;
        C1E6B c1e6b5 = new C1E6B() { // from class: X.1E6F
            @Override // java.lang.Enum
            public final String toString() {
                return "JsExecution";
            }
        };
        SparkSecuritySolutionChannelJSExecution = c1e6b5;
        C1E6B c1e6b6 = new C1E6B() { // from class: X.1E6D
            @Override // java.lang.Enum
            public final String toString() {
                return "HybridLoad";
            }
        };
        SparkSecuritySolutionChannelHybridLoad = c1e6b6;
        C1E6B c1e6b7 = new C1E6B() { // from class: X.1E6C
            @Override // java.lang.Enum
            public final String toString() {
                return "Gecko";
            }
        };
        SparkSecuritySolutionChannelGecko = c1e6b7;
        C1E6B c1e6b8 = new C1E6B() { // from class: X.1E68
            @Override // java.lang.Enum
            public final String toString() {
                return "Network";
            }
        };
        SparkSecuritySolutionChannelNetwork = c1e6b8;
        C1E6B c1e6b9 = new C1E6B() { // from class: X.1E69
            @Override // java.lang.Enum
            public final String toString() {
                return "WebNavigation";
            }
        };
        SparkSecuritySolutionChannelWebNavigation = c1e6b9;
        C1E6B c1e6b10 = new C1E6B() { // from class: X.1E6A
            @Override // java.lang.Enum
            public final String toString() {
                return "JSI";
            }
        };
        SparkSecuritySolutionJSI = c1e6b10;
        C1E6B c1e6b11 = new C1E6B() { // from class: X.1E6J
            @Override // java.lang.Enum
            public final String toString() {
                return "WebResourceLoad";
            }
        };
        SparkSecurityWebSolutionChannelResourceLoad = c1e6b11;
        C1E6B c1e6b12 = new C1E6B() { // from class: X.1E6H
            @Override // java.lang.Enum
            public final String toString() {
                return "NetworkResource";
            }
        };
        SparkSecuritySolutionChannelNetworkReousrce = c1e6b12;
        C1E6B[] c1e6bArr = {c1e6b, c1e6b2, c1e6b3, c1e6b4, c1e6b5, c1e6b6, c1e6b7, c1e6b8, c1e6b9, c1e6b10, c1e6b11, c1e6b12};
        LL = c1e6bArr;
        LLILLJJLI = new C2254308sP(c1e6bArr);
        Companion = new Object() { // from class: X.1E6K
        };
    }

    public static C1E6B[] values() {
        return (C1E6B[]) LL.clone();
    }

    public static C1E6B valueOf(String str) {
        return (C1E6B) C08FF.LIZ(C1E6B.class, str);
    }

    public C1E6B(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
