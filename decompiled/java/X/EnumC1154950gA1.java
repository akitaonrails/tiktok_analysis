package X;

/* JADX INFO: renamed from: X.0gA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public enum EnumC1154950gA1 {
    UNKNOWN(-1),
    SOURCE_HTTPDNS(3),
    SOURCE_PROC(6),
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_PRELOAD_BATCH_HTTPDNS(7),
    /* JADX INFO: Fake field, exist only in values array */
    SOURCE_ASYNC_BATCH_HTTPDNS(8);

    public final int LL;

    public static EnumC1154950gA1 valueOf(String str) {
        return (EnumC1154950gA1) C08FF.LIZ(EnumC1154950gA1.class, str);
    }

    EnumC1154950gA1(int i) {
        this.LL = i;
    }
}
