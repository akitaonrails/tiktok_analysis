package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656090PoN implements InterfaceC657240PqE {
    public final Aweme LL;
    public final EnumC656150PoT LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Integer LLILZIL;
    public final Integer LLILZLL;
    public final EnumC657200PqA LLIZ;

    @Override // X.InterfaceC657240PqE
    public final boolean LJJJJZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final C658800Psk LJLJJLL() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LLFZ() {
        return false;
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
    public final InterfaceC655790Pnt getTag() {
        return new C656060PoK();
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJJII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657230PqD LJJJJL() {
        return EnumC657230PqD.ONE_LINE;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJLILLLLZI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC657240PqE
    public final String LLII() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LLJLL() {
        return this.LLILZIL;
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
        return this.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C655770Pnr.LIZ(this, interfaceC1891350zJl);
    }

    public C656090PoN(Aweme aweme, EnumC656150PoT enumC656150PoT, Integer num, String str, Integer num2, Integer num3, EnumC657200PqA enumC657200PqA) {
        this.LL = aweme;
        this.LLILLJJLI = enumC656150PoT;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = num2;
        this.LLILZLL = num3;
        this.LLIZ = enumC657200PqA;
    }
}
