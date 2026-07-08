package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1901810zad implements InterfaceC1891350zJl {
    public final MusNotice LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C1901810zad(MusNotice musNotice) {
        this.LL = musNotice;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1901810zad)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1901810zad) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1901810zad) || this.LL.getUniqueId() != ((C1901810zad) interfaceC1891350zJl).LL.getUniqueId()) {
            return false;
        }
        return true;
    }
}
