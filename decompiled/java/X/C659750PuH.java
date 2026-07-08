package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659750PuH implements InterfaceC1587906Jp, InterfaceC435460H5s, InterfaceC660770Pvv {
    public final Aweme LL;
    public final C653660PkS LLILLJJLI;
    public final InterfaceC660490PvT LLILLL;
    public final Object LLILZ;
    public final C0PT4 LLILZIL;
    public final Function0<Integer> LLILZLL;
    public final boolean LLIZ;
    public final C660780Pvw LLIZLLLIL;

    public C659750PuH() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC660770Pvv
    public final C660780Pvw LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
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

    public C659750PuH(Aweme aweme, C653660PkS c653660PkS, InterfaceC660490PvT interfaceC660490PvT, Object obj, Function0 function0, boolean z, C660780Pvw c660780Pvw, int i) {
        interfaceC660490PvT = (i & 4) != 0 ? C659270PtV.LIZ : interfaceC660490PvT;
        obj = (i & 8) != 0 ? null : obj;
        z = (i & 64) != 0 ? false : z;
        c660780Pvw = (i & 256) != 0 ? null : c660780Pvw;
        this.LL = aweme;
        this.LLILLJJLI = c653660PkS;
        this.LLILLL = interfaceC660490PvT;
        this.LLILZ = obj;
        this.LLILZIL = null;
        this.LLILZLL = function0;
        this.LLIZ = z;
        this.LLIZLLLIL = c660780Pvw;
    }
}
