package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1391, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AnonymousClass1391 {
    public static final AnonymousClass1391 COLLECTED;
    public static final AnonymousClass1391 EXPIRED;
    public static final AnonymousClass1391 EXPLICIT;
    public static final /* synthetic */ AnonymousClass1391[] LL;
    public static final AnonymousClass1391 REPLACED;
    public static final AnonymousClass1391 SIZE;

    public AnonymousClass1391() {
        throw null;
    }

    public abstract boolean LIZJ();

    static {
        AnonymousClass1391 anonymousClass1391 = new AnonymousClass1391() { // from class: X.139D
            @Override // X.AnonymousClass1391
            public final boolean LIZJ() {
                return false;
            }
        };
        EXPLICIT = anonymousClass1391;
        AnonymousClass1391 anonymousClass13912 = new AnonymousClass1391() { // from class: X.139E
            @Override // X.AnonymousClass1391
            public final boolean LIZJ() {
                return false;
            }
        };
        REPLACED = anonymousClass13912;
        AnonymousClass1391 anonymousClass13913 = new AnonymousClass1391() { // from class: X.139F
            @Override // X.AnonymousClass1391
            public final boolean LIZJ() {
                return true;
            }
        };
        COLLECTED = anonymousClass13913;
        AnonymousClass1391 anonymousClass13914 = new AnonymousClass1391() { // from class: X.139G
            @Override // X.AnonymousClass1391
            public final boolean LIZJ() {
                return true;
            }
        };
        EXPIRED = anonymousClass13914;
        AnonymousClass1391 anonymousClass13915 = new AnonymousClass1391() { // from class: X.139H
            @Override // X.AnonymousClass1391
            public final boolean LIZJ() {
                return true;
            }
        };
        SIZE = anonymousClass13915;
        LL = new AnonymousClass1391[]{anonymousClass1391, anonymousClass13912, anonymousClass13913, anonymousClass13914, anonymousClass13915};
    }

    public static AnonymousClass1391[] values() {
        return (AnonymousClass1391[]) LL.clone();
    }

    public static AnonymousClass1391 valueOf(String str) {
        return (AnonymousClass1391) C08FF.LIZ(AnonymousClass1391.class, str);
    }

    public AnonymousClass1391(String str, int i) {
    }
}
