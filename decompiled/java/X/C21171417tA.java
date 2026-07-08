package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.17tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21171417tA implements Serializable {
    public static final int $stable = 8;
    public final List<String> mediaUrlList;
    public final String selectedPromptId;
    public final String textContent;

    public C21171417tA() {
        this(null, null, null, 7, null);
    }

    public C21171417tA(String str, List<String> list, String str2) {
        this.textContent = str;
        this.mediaUrlList = list;
        this.selectedPromptId = str2;
    }

    public C21171417tA(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2);
    }
}
