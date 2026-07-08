package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveDropsRoomInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655740Pno implements InterfaceC657240PqE, InterfaceC655730Pnn {
    public final Aweme LL;
    public final InterfaceC655790Pnt LLILLJJLI;
    public final EnumC656150PoT LLILZ;
    public final boolean LLILLL = false;
    public final boolean LLILZIL = false;

    @Override // X.InterfaceC657240PqE
    public final Integer LJJII() {
        return null;
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

    @Override // X.InterfaceC657240PqE, X.InterfaceC655730Pnn
    public final InterfaceC655080Pmk getAnchorType() {
        LiveDropsRoomInfo liveDropsRoomInfo;
        Aweme aweme = this.LL;
        if (aweme.isAd()) {
            return C655090Pml.LIZ;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        return (newLiveRoomDataExt == null || (liveDropsRoomInfo = newLiveRoomDataExt.dropsRoomInfo) == null) ? C655090Pml.LIZ : new C655100Pmm(liveDropsRoomInfo);
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657230PqD LJJJJL() {
        return EnumC657230PqD.ONE_LINE;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LJJJJZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LLFZ() {
        return this.LLILZIL;
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

    public C655740Pno(Aweme aweme, C652290PiF c652290PiF, EnumC656150PoT enumC656150PoT) {
        this.LL = aweme;
        this.LLILLJJLI = c652290PiF;
        this.LLILZ = enumC656150PoT;
    }
}
