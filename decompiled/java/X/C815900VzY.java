package X;

import android.graphics.drawable.Icon;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815900VzY {
    public final String LIZ;
    public final String LIZIZ;
    public final Icon LIZJ;
    public final List<String> LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final Integer LJI;
    public final String LJII;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Shortcut(label='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', shortcutId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', urls=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", preferRank=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C815900VzY.class, cls) && Intrinsics.LJFF(this.LIZIZ, ((C815900VzY) obj).LIZIZ)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C815900VzY(EnumC815990Vzh enumC815990Vzh, String str, Icon icon, List list, Integer num) {
        this(enumC815990Vzh, str, icon, (List<String>) list, num, (String) null);
    }

    public C815900VzY(EnumC815990Vzh enumC815990Vzh, String str, Icon icon, List<String> list, Integer num, String str2) {
        this(enumC815990Vzh, str, icon, list, true, num, str2);
    }

    public /* synthetic */ C815900VzY(EnumC815990Vzh enumC815990Vzh, String str, Icon icon, List list, boolean z, Integer num) {
        this(enumC815990Vzh, str, icon, list, z, num, null);
    }

    public C815900VzY(EnumC815990Vzh enumC815990Vzh, String str, Icon icon, List<String> list, boolean z, Integer num, String str2) {
        this(str, enumC815990Vzh.getShortcutId(), icon, list, enumC815990Vzh.getShortcutPriority(), z, num, str2);
    }

    public C815900VzY(String str, String str2, Icon icon, List<String> list, int i, boolean z, Integer num, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = icon;
        this.LIZLLL = list;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = num;
        this.LJII = str3;
    }
}
