package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0TQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746540TQe implements Serializable {
    public static final int $stable = 8;
    public final List<C0DL5> data;
    public final int hintTitle;
    public final int naviCloseDrawable;
    public final int naviTitle;
    public final int submitTitle;
    public final String tag;

    public C746540TQe(String str, int i, int i2, int i3, int i4, List<C0DL5> list) {
        this.tag = str;
        this.naviTitle = i;
        this.naviCloseDrawable = i2;
        this.submitTitle = i3;
        this.hintTitle = i4;
        this.data = list;
    }

    public C746540TQe(String str, int i, int i2, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, i4, (i5 & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
