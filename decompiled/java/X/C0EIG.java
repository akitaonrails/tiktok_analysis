package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EIG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EIG implements C0EIO {
    public final C19EG LL;
    public final C0E5S LLILLJJLI;
    public final C0EIE LLILLL = C0EIE.MUSIC_STRIP;

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return C363750ENx.LIZIZ("multi_music_strip_guide_has_shown_in_root");
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLILLL;
    }

    public C0EIG(C19EG c19eg, C0E5S c0e5s) {
        this.LL = c19eg;
        this.LLILLJJLI = c0e5s;
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        InterfaceC368720Ecw interfaceC368720EcwJi;
        NLETrackSlot nLETrackSlot = c0e5a.LIZIZ;
        if (nLETrackSlot == null || C363750ENx.LIZIZ("multi_music_strip_guide_has_shown_in_root") || !C351220Dpo.LLLF(nLETrackSlot) || (interfaceC368720EcwJi = this.LLILLJJLI.Ji(new AwS584S0100000_5(nLETrackSlot, 1163))) == null) {
            return false;
        }
        C354270Duj.LIZ(500L, new AwS132S0201000_5(this, interfaceC368720EcwJi, ((-interfaceC368720EcwJi.getView().getWidth()) / 2) + C0EGK.LIZ(20), 12));
        return true;
    }
}
