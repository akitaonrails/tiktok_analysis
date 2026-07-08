package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9K {
    public static final C0L9K IMAGE;
    public static final /* synthetic */ C0L9K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9K VIDEO;
    public final NLEResType LL;

    public static InterfaceC2044707zh<C0L9K> getEntries() {
        return LLILLL;
    }

    static {
        C0L9K c0l9k = new C0L9K("VIDEO", 0, NLEResType.VIDEO);
        VIDEO = c0l9k;
        C0L9K c0l9k2 = new C0L9K("IMAGE", 1, NLEResType.IMAGE);
        IMAGE = c0l9k2;
        C0L9K[] c0l9kArr = {c0l9k, c0l9k2};
        LLILLJJLI = c0l9kArr;
        LLILLL = new C2254308sP(c0l9kArr);
    }

    public static C0L9K[] values() {
        return (C0L9K[]) LLILLJJLI.clone();
    }

    public final NLEResType getNleResType() {
        return this.LL;
    }

    public static C0L9K valueOf(String str) {
        return (C0L9K) C08FF.LIZ(C0L9K.class, str);
    }

    public C0L9K(String str, int i, NLEResType nLEResType) {
        this.LL = nLEResType;
    }
}
