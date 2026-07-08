package X;

import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681880Qos implements InterfaceC1891350zJl {
    public final MusicSearchHistory LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C681880Qos(MusicSearchHistory musicSearchHistory) {
        this.LL = musicSearchHistory;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C681880Qos) {
            return Intrinsics.LJFF(this.LL.keyword, ((C681880Qos) interfaceC1891350zJl).LL.keyword);
        }
        return false;
    }
}
