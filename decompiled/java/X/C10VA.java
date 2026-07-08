package X;

import java.util.List;

/* JADX INFO: renamed from: X.10VA, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10VA implements C10S6 {
    public abstract boolean LIZIZ(EnumC19255510Uv enumC19255510Uv, String str);

    public abstract List<EnumC19255510Uv> LIZJ();

    @Override // X.C10S6
    public final boolean LIZ(EnumC19255510Uv enumC19255510Uv, String str) {
        if (!LIZJ().contains(enumC19255510Uv)) {
            return false;
        }
        return LIZIZ(enumC19255510Uv, str);
    }
}
