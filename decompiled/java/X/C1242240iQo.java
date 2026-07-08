package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1242240iQo extends C1242250iQp {
    public final MusNotice LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.C1242250iQp, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C1242240iQo) interfaceC1891350zJl).LLILLJJLI);
    }

    @Override // X.C1242250iQp, X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1242240iQo) || this.LLILLJJLI.getUniqueId() != ((C1242240iQo) interfaceC1891350zJl).LLILLJJLI.getUniqueId()) {
            return false;
        }
        return true;
    }

    public C1242240iQo(MusNotice musNotice, boolean z, int i) {
        super(i);
        this.LLILLJJLI = musNotice;
        this.LLILLL = z;
    }
}
