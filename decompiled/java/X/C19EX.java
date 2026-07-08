package X;

/* JADX INFO: renamed from: X.19EX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C19EX {
    PENALTY_LOG,
    PENALTY_DEATH,
    DETECT_FRAGMENT_REUSE,
    DETECT_FRAGMENT_TAG_USAGE,
    DETECT_WRONG_NESTED_HIERARCHY,
    DETECT_RETAIN_INSTANCE_USAGE,
    DETECT_SET_USER_VISIBLE_HINT,
    DETECT_TARGET_FRAGMENT_USAGE,
    DETECT_WRONG_FRAGMENT_CONTAINER;

    public static C19EX valueOf(String str) {
        return (C19EX) C08FF.LIZ(C19EX.class, str);
    }
}
