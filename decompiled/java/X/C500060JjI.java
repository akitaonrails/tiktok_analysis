package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0JjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500060JjI {
    public CharSequence LIZIZ;
    public final ArrayList<C510160Jza> LIZ = new ArrayList<>();
    public Integer LIZJ = 1;
    public EnumC500050JjH LIZLLL = EnumC500050JjH.PADDING_STYLE_NORMAL;

    public final void LIZ(List<C510160Jza> list) {
        this.LIZ.clear();
        if (list != null && !list.isEmpty()) {
            this.LIZ.addAll(list);
        }
    }
}
