package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655750Pnp implements InterfaceC657240PqE {
    public final Aweme LL;
    public final InterfaceC655790Pnt LLILLJJLI;
    public final EnumC656150PoT LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Map<String, Object> LLILZLL;

    public C655750Pnp() {
        throw null;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJJII() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LJJJJZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJLILLLLZI() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final C658800Psk LJLJJLL() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final String LLII() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LLJLL() {
        return null;
    }

    @Override // X.InterfaceC664660Q5g
    public final C664650Q5f LLJLLIL() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657230PqD LJJJJL() {
        return EnumC657230PqD.ONE_LINE;
    }

    @Override // X.InterfaceC657240PqE, X.InterfaceC655730Pnn
    public final InterfaceC655080Pmk getAnchorType() {
        return C655090Pml.LIZ;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LL;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657200PqA getRatio() {
        return EnumC657200PqA.AUTO;
    }

    @Override // X.InterfaceC657240PqE
    public final InterfaceC655790Pnt getTag() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C655770Pnr.LIZ(this, interfaceC1891350zJl);
    }

    public C655750Pnp(String str, String str2, Map map) {
        Aweme aweme = new Aweme();
        C652840Pj8 c652840Pj8 = new C652840Pj8(0);
        EnumC656150PoT enumC656150PoT = EnumC656150PoT.DIGG;
        this.LL = aweme;
        this.LLILLJJLI = c652840Pj8;
        this.LLILLL = enumC656150PoT;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
    }
}
