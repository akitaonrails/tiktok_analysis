package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242210iQl implements InterfaceC1240590iO9 {
    public final String LL;
    public final Map<String, String> LLILLJJLI;
    public final C1242230iQn LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C0PGF LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;

    public C1242210iQl() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1240590iO9
    public final Map<String, String> getEventParams() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getId() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1240590iO9
    public final boolean getNeedReport() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getTabName() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1240590iO9
    public final C0PGF getType() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1240590iO9
    public final String getUniqueId() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1242210iQl(String str, Map map, C1242230iQn c1242230iQn, String str2, String str3, String str4) {
        C0PGF c0pgf = C0PGF.NORMAL;
        this.LL = str;
        this.LLILLJJLI = map;
        this.LLILLL = c1242230iQn;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = c0pgf;
        this.LLIZ = null;
        this.LLIZLLLIL = str4;
        this.LLJ = true;
    }
}
