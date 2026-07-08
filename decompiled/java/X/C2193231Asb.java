package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Asb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C2193231Asb {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC2193221Asa.values().length];
        try {
            iArr[EnumC2193221Asa.DRAFT_SAVED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2193221Asa.DRAFT_DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2193221Asa.DELETE_POST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        EnumC2182608gq.values();
        int[] iArr2 = new int[EnumC2193241Asc.values().length];
        try {
            iArr2[EnumC2193241Asc.PULL_REFRESH.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC2193241Asc.VISIBILITY_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC2193241Asc.CLICK_PUBLISH.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC2193241Asc.DELETE_POST.ordinal()] = 4;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC2193241Asc.DRAFT_SAVED.ordinal()] = 5;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC2193241Asc.DRAFT_DELETED.ordinal()] = 6;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC2193241Asc.USER_INTERACTION.ordinal()] = 7;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC2193181AsW.values().length];
        try {
            iArr3[EnumC2193181AsW.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr3[EnumC2193181AsW.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr3[EnumC2193181AsW.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr3[EnumC2193181AsW.PUBLISH.ordinal()] = 4;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr3[EnumC2193181AsW.FLAG.ordinal()] = 5;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr3[EnumC2193181AsW.DISLIKE.ordinal()] = 6;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        LIZJ = iArr3;
    }
}
