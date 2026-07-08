package X;

import java.util.Map;

/* JADX INFO: renamed from: X.18uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21434718uX implements InterfaceC21435018ua {
    public final String LIZ;
    public final int LIZIZ;
    public final Map<String, String> LIZJ;
    public int LIZLLL = -1;
    public String LJ = "";

    @Override // X.InterfaceC21435018ua
    public final boolean isClosed() {
        return this.LIZLLL > -1;
    }

    @Override // X.InterfaceC21435018ua
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC21435018ua
    public Map<String, String> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC21435018ua
    public final int end() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC21435018ua
    public final String name() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21435018ua
    public final int start() {
        return this.LIZIZ;
    }

    public AbstractC21434718uX(String str, int i, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = map;
    }
}
