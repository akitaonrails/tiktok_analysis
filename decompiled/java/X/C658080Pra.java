package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.InsiteImageData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658080Pra implements C0Q09, InterfaceC657240PqE {
    public final ImageData LL;
    public final InsiteImageData LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC657240PqE
    public final boolean LJJJJZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJLILLLLZI() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final C658800Psk LJLJJLL() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.InterfaceC657240PqE
    public final String LLII() {
        return null;
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LLJLL() {
        return null;
    }

    @Override // X.InterfaceC664660Q5g
    public final C664650Q5f LLJLLIL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C658080Pra) && Intrinsics.LJFF(this.LL, ((C658080Pra) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLandingInsiteItem(imageData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC657240PqE
    public final Integer LJJII() {
        return 61;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        Aweme aweme;
        InsiteImageData insiteImageData = this.LLILLJJLI;
        return (insiteImageData == null || (aweme = insiteImageData.awemeData) == null) ? new Aweme() : aweme;
    }

    @Override // X.InterfaceC657240PqE
    public final InterfaceC655790Pnt getTag() {
        return new C656060PoK();
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC656150PoT LJJIIZI() {
        return EnumC656150PoT.AUTHOR_DIGG;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657230PqD LJJJJL() {
        return EnumC657230PqD.ONE_LINE;
    }

    @Override // X.InterfaceC657240PqE, X.InterfaceC655730Pnn
    public final InterfaceC655080Pmk getAnchorType() {
        return C655090Pml.LIZ;
    }

    @Override // X.C0Q09
    public final ImageData getImageData() {
        return this.LL;
    }

    @Override // X.InterfaceC657240PqE
    public final EnumC657200PqA getRatio() {
        return EnumC657200PqA.AUTO;
    }

    public C658080Pra(ImageData imageData) {
        this.LL = imageData;
        this.LLILLJJLI = imageData.insiteImage;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C658080Pra c658080Pra;
        ImageData imageData;
        InsiteImageData insiteImageData;
        if (C301510Brp.LIZ()) {
            InsiteImageData insiteImageData2 = this.LL.insiteImage;
            String str2 = null;
            if (insiteImageData2 != null) {
                str = insiteImageData2.imageId;
            } else {
                str = null;
            }
            if ((interfaceC1891350zJl instanceof C658080Pra) && (c658080Pra = (C658080Pra) interfaceC1891350zJl) != null && (imageData = c658080Pra.LL) != null && (insiteImageData = imageData.insiteImage) != null) {
                str2 = insiteImageData.imageId;
            }
            return Intrinsics.LJFF(str, str2);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        C658080Pra c658080Pra;
        ImageData imageData;
        InsiteImageData insiteImageData;
        if (!C301510Brp.LIZ()) {
            return null;
        }
        InsiteImageData insiteImageData2 = this.LL.insiteImage;
        if (insiteImageData2 != null) {
            str = insiteImageData2.imageId;
        } else {
            str = null;
        }
        if ((interfaceC1891350zJl instanceof C658080Pra) && (c658080Pra = (C658080Pra) interfaceC1891350zJl) != null && (imageData = c658080Pra.LL) != null && (insiteImageData = imageData.insiteImage) != null) {
            str2 = insiteImageData.imageId;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return null;
        }
        return C1697810uHb.LJIIJJI(EnumC657270PqH.IMAGE_LANDING_INSITE_CELL, EnumC657270PqH.TEXT_DESC_AREA, EnumC657270PqH.AUTHOR_AREA);
    }
}
