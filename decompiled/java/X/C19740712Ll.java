package X;

import com.bytedance.createx.editor.gesture.GestureInteractItem;
import java.util.Comparator;

/* JADX INFO: renamed from: X.12Ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19740712Ll<T> implements Comparator {
    public static final C19740712Ll<T> LL = new C19740712Ll<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((GestureInteractItem) obj2).LLILLJJLI - ((GestureInteractItem) obj).LLILLJJLI;
    }
}
