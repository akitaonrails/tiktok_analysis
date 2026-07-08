package X;

import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681870Qor implements InterfaceC1891350zJl {
    public final MusicSearchHistory LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C681870Qor(MusicSearchHistory musicSearchHistory) {
        this.LL = musicSearchHistory;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C681870Qor) {
            return Intrinsics.LJFF(this.LL.keyword, ((C681870Qor) interfaceC1891350zJl).LL.keyword);
        }
        return false;
    }
}
