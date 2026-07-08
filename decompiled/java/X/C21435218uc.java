package X;

import java.util.Map;

/* JADX INFO: renamed from: X.18uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21435218uc implements InterfaceC21449218ws {
    public final Map<Class<? extends AbstractC21430218to>, InterfaceC21446318wP> LIZ;

    public C21435218uc(Map<Class<? extends AbstractC21430218to>, InterfaceC21446318wP> map) {
        this.LIZ = map;
    }

    public final <N extends AbstractC21430218to> InterfaceC21446318wP LIZ(Class<N> cls) {
        return this.LIZ.get(cls);
    }
}
