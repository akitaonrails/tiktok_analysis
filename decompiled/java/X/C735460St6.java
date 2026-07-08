package X;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0St6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735460St6 implements Serializable {
    public static final C735470St7 Companion = new Object() { // from class: X.0St7
    };
    public final String authorId;
    public final Map<String, Object> extraParam;
    public final String groupId;
    public final String logPb;
    public final Integer multiAnchor;
    public final String musicId;

    public C735460St6() {
        this(null, null, null, null, null, null);
    }

    public C735460St6(Integer num, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.multiAnchor = num;
        this.groupId = str;
        this.authorId = str2;
        this.musicId = str3;
        this.logPb = str4;
        this.extraParam = map;
    }
}
