package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1E6N, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1E6N {
    public static final C1E6U Companion;
    public static final /* synthetic */ C1E6N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1E6N SPARK_SECURITY_SOLUTION_ENDPOINT_GECKOCDN;
    public static final C1E6N SparkSecuritySolutionEndpointLocalStorage;
    public static final C1E6N SparkSecuritySolutionEndpointLynx;
    public static final C1E6N SparkSecuritySolutionEndpointNative;
    public static final C1E6N SparkSecuritySolutionEndpointNone;
    public static final C1E6N SparkSecuritySolutionEndpointRemoteServer;
    public static final C1E6N SparkSecuritySolutionEndpointSystemAPI;
    public static final C1E6N SparkSecuritySolutionEndpointWebView;

    public C1E6N() {
        throw null;
    }

    public static InterfaceC2044707zh<C1E6N> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1E6U] */
    static {
        C1E6N c1e6n = new C1E6N() { // from class: X.1E6O
            @Override // java.lang.Enum
            public final String toString() {
                return "geckocdn";
            }
        };
        SPARK_SECURITY_SOLUTION_ENDPOINT_GECKOCDN = c1e6n;
        C1E6N c1e6n2 = new C1E6N() { // from class: X.1E6M
            @Override // java.lang.Enum
            public final String toString() {
                return "none";
            }
        };
        SparkSecuritySolutionEndpointNone = c1e6n2;
        C1E6N c1e6n3 = new C1E6N() { // from class: X.1E6L
            @Override // java.lang.Enum
            public final String toString() {
                return "webview";
            }
        };
        SparkSecuritySolutionEndpointWebView = c1e6n3;
        C1E6N c1e6n4 = new C1E6N() { // from class: X.1E6Q
            @Override // java.lang.Enum
            public final String toString() {
                return "lynx";
            }
        };
        SparkSecuritySolutionEndpointLynx = c1e6n4;
        C1E6N c1e6n5 = new C1E6N() { // from class: X.1E6R
            @Override // java.lang.Enum
            public final String toString() {
                return "native";
            }
        };
        SparkSecuritySolutionEndpointNative = c1e6n5;
        C1E6N c1e6n6 = new C1E6N() { // from class: X.1E6S
            @Override // java.lang.Enum
            public final String toString() {
                return "server";
            }
        };
        SparkSecuritySolutionEndpointRemoteServer = c1e6n6;
        C1E6N c1e6n7 = new C1E6N() { // from class: X.1E6P
            @Override // java.lang.Enum
            public final String toString() {
                return "localStorage";
            }
        };
        SparkSecuritySolutionEndpointLocalStorage = c1e6n7;
        C1E6N c1e6n8 = new C1E6N() { // from class: X.1E6T
            @Override // java.lang.Enum
            public final String toString() {
                return "SystemApi";
            }
        };
        SparkSecuritySolutionEndpointSystemAPI = c1e6n8;
        C1E6N[] c1e6nArr = {c1e6n, c1e6n2, c1e6n3, c1e6n4, c1e6n5, c1e6n6, c1e6n7, c1e6n8};
        LL = c1e6nArr;
        LLILLJJLI = new C2254308sP(c1e6nArr);
        Companion = new Object() { // from class: X.1E6U
        };
    }

    public static C1E6N[] values() {
        return (C1E6N[]) LL.clone();
    }

    public static C1E6N valueOf(String str) {
        return (C1E6N) C08FF.LIZ(C1E6N.class, str);
    }

    public C1E6N(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
