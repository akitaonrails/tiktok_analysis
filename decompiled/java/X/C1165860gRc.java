package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165860gRc implements InterfaceC1891350zJl {
    public final String LL;
    public final UrlModel LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1631630sYr<String, Boolean, Boolean, Context, Unit> LLILZLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistMusicAwemeItem(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", musicStarter=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", musicStarterText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pictureUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clickListener=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        UrlModel urlModel = this.LLILLJJLI;
        return ((((((iHashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!areItemTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C1165860gRc) || this.LLILZIL != ((C1165860gRc) interfaceC1891350zJl).LLILZIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1165860gRc)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1165860gRc) interfaceC1891350zJl).LL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1165860gRc)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1165860gRc) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1165860gRc) || areContentsTheSame(interfaceC1891350zJl)) {
            return null;
        }
        return new C1165870gRd(((C1165860gRc) interfaceC1891350zJl).LLILZIL);
    }

    public static C1165860gRc LIZ(C1165860gRc c1165860gRc, boolean z) {
        String str = c1165860gRc.LL;
        UrlModel urlModel = c1165860gRc.LLILLJJLI;
        String str2 = c1165860gRc.LLILLL;
        UrlModel urlModel2 = c1165860gRc.LLILZ;
        InterfaceC1631630sYr<String, Boolean, Boolean, Context, Unit> interfaceC1631630sYr = c1165860gRc.LLILZLL;
        c1165860gRc.getClass();
        return new C1165860gRc(str, urlModel, str2, urlModel2, z, interfaceC1631630sYr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1165860gRc(String str, UrlModel urlModel, String str2, UrlModel urlModel2, boolean z, InterfaceC1631630sYr<? super String, ? super Boolean, ? super Boolean, ? super Context, Unit> interfaceC1631630sYr) {
        this.LL = str;
        this.LLILLJJLI = urlModel;
        this.LLILLL = str2;
        this.LLILZ = urlModel2;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC1631630sYr;
    }
}
