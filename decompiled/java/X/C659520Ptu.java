package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ptu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659520Ptu implements InterfaceC664660Q5g, InterfaceC435460H5s, InterfaceC660770Pvv {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final InterfaceC660500PvU LLILLL;
    public final Object LLILZ;
    public final C0H81 LLILZIL;
    public final C0PT4 LLILZLL;
    public final Aweme LLIZ;
    public final C660780Pvw LLIZLLLIL;
    public final C664650Q5f LLJ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC660770Pvv
    public final C660780Pvw LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC664660Q5g
    public final C664650Q5f LLJLLIL() {
        return this.LLJ;
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

    public /* synthetic */ C659520Ptu(Aweme aweme, String str, InterfaceC660500PvU interfaceC660500PvU, Object obj, C0PT4 c0pt4) {
        this(aweme, str, interfaceC660500PvU, obj, null, c0pt4, null, null);
    }

    public C659520Ptu(Aweme aweme, String str, InterfaceC660500PvU interfaceC660500PvU, Object obj, C0H81 c0h81, C0PT4 c0pt4, Aweme aweme2, C660780Pvw c660780Pvw) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC660500PvU;
        this.LLILZ = obj;
        this.LLILZIL = c0h81;
        this.LLILZLL = c0pt4;
        this.LLIZ = aweme2;
        this.LLIZLLLIL = c660780Pvw;
        this.LLJ = new C664650Q5f(aweme, str, null, interfaceC660500PvU, true, 16);
    }
}
