package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0XoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859880XoI {
    public static final Pattern LIZ = PatternProtector.compile("/(data|user)/.+?/files/[\\w-]+/[a-zA-Z0-9]+/([\\w-]+)/[a-zA-Z0-9]+/res/([^?]+)");

    public static final void LIZ(int i, int i2, List list) {
        if (i >= i2) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }

    public static final void LIZIZ(C118300cf c118300cf, C013C c013c, C118300cf c118300cf2, int i, C013C c013c2, C118300cf c118300cf3, List<Integer> list, int i2) {
        int i3;
        int i4;
        int i5 = c118300cf.element;
        if (i5 >= i2) {
            return;
        }
        if (c013c.element && i5 <= (i4 = c118300cf2.element) && i4 < i2) {
            i3 = i2 - i4;
        } else {
            i3 = 0;
        }
        if (i3 > i) {
            return;
        }
        if (c013c2.element) {
            int i6 = c118300cf3.element;
            LIZ(i6, i6 + 1, list);
            c013c2.element = false;
        } else {
            LIZ(i5 - 1, i5, list);
        }
        LIZ(c118300cf.element, i2, list);
    }
}
