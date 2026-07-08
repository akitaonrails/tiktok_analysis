package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DHO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DHO implements Serializable {
    public static final C0DHP Companion;
    public static final /* synthetic */ C0DHO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DHO ONESTEP_AUTO;
    public static final C0DHO ONESTEP_MANUAL;
    public static final C0DHO STANDARD;
    public final int LL;

    public static InterfaceC2044707zh<C0DHO> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0DHP] */
    static {
        C0DHO c0dho = new C0DHO("STANDARD", 0, 0);
        STANDARD = c0dho;
        C0DHO c0dho2 = new C0DHO("ONESTEP_MANUAL", 1, 1);
        ONESTEP_MANUAL = c0dho2;
        C0DHO c0dho3 = new C0DHO("ONESTEP_AUTO", 2, 2);
        ONESTEP_AUTO = c0dho3;
        C0DHO[] c0dhoArr = {c0dho, c0dho2, c0dho3};
        LLILLJJLI = c0dhoArr;
        LLILLL = new C2254308sP(c0dhoArr);
        Companion = new Object() { // from class: X.0DHP
        };
    }

    public static C0DHO[] values() {
        return (C0DHO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0DHO valueOf(String str) {
        return (C0DHO) C08FF.LIZ(C0DHO.class, str);
    }

    public C0DHO(String str, int i, int i2) {
        this.LL = i2;
    }
}
