package X;

import com.ss.android.ugc.aweme.music.model.report.ReportReviewStatus;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632560OrW implements InterfaceC1891350zJl, Serializable {
    public static final int $stable = 8;
    public final C632090Oql LL;
    public final ReportReviewStatus LLILLJJLI;

    public final C632560OrW copy(C632090Oql c632090Oql, ReportReviewStatus reportReviewStatus) {
        return new C632560OrW(c632090Oql, reportReviewStatus);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportMusicItem(musicItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reportReviewStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return this.LL.getMusicModel().getMusicId().hashCode();
    }

    public final C632090Oql getMusicItem() {
        return this.LL;
    }

    public final ReportReviewStatus getReportReviewStatus() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C632560OrW) {
            C632560OrW c632560OrW = (C632560OrW) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c632560OrW.LL.getMusicModel().getMusicId(), this.LL.getMusicModel().getMusicId()) && c632560OrW.LLILLJJLI == this.LLILLJJLI) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C632560OrW) {
            return Intrinsics.LJFF(((C632560OrW) interfaceC1891350zJl).LL.getMusicModel().getMusicId(), this.LL.getMusicModel().getMusicId());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C632560OrW) {
            return Intrinsics.LJFF(((C632560OrW) obj).LL.getMusicModel().getMusicId(), this.LL.getMusicModel().getMusicId());
        }
        return super.equals(obj);
    }

    public C632560OrW(C632090Oql c632090Oql, ReportReviewStatus reportReviewStatus) {
        this.LL = c632090Oql;
        this.LLILLJJLI = reportReviewStatus;
    }
}
