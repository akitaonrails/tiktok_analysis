package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Poi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C656300Poi implements InterfaceC435460H5s, InterfaceC645880PVa {
    public final Aweme LL;
    public final Map<String, String> LLILLJJLI;
    public final C650430PfF LLILLL = new C650430PfF(new AwS589S0100000_10(this, 384));
    public final boolean LLILZ = C650410PfD.LIZ();

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C650430PfF LLIZLLLIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC435460H5s
    public Aweme getAweme() {
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

    public C656300Poi(Aweme aweme, Map map) {
        this.LL = aweme;
        this.LLILLJJLI = map;
    }
}
