package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;

/* JADX INFO: renamed from: X.0fEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1119550fEv implements InterfaceC1891350zJl {
    public final BoardCell LL;
    public final HostBoard LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1119550fEv) {
            AbstractC1119550fEv abstractC1119550fEv = (AbstractC1119550fEv) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, abstractC1119550fEv.LL) && Intrinsics.LJFF(this.LLILLJJLI, abstractC1119550fEv.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1119550fEv) {
            AbstractC1119550fEv abstractC1119550fEv = (AbstractC1119550fEv) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL.type, abstractC1119550fEv.LL.type) && Intrinsics.LJFF(this.LL.id, abstractC1119550fEv.LL.id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1119550fEv) {
            AbstractC1119550fEv abstractC1119550fEv = (AbstractC1119550fEv) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, abstractC1119550fEv.LL) && Intrinsics.LJFF(this.LLILLJJLI, abstractC1119550fEv.LLILLJJLI)) {
                return "CONTENT_SAME";
            }
            return "CONTENT_DIFF";
        }
        return "CONTENT_DIFF";
    }

    public AbstractC1119550fEv(BoardCell boardCell, HostBoard hostBoard) {
        this.LL = boardCell;
        this.LLILLJJLI = hostBoard;
    }
}
