package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewParent;
import android.widget.FrameLayout;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0b0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957020b0m extends FrameLayout {
    public long LL;
    public String LLILLJJLI;
    public PosIdentity LLILLL;
    public String LLILZ;
    public EnumC955290axz LLILZIL;
    public EnumC942070acf LLILZLL;
    public MultiGuestSpotExtra LLIZ;
    public MultiGuestSpotNonSeiExtra LLIZLLLIL;
    public String LLJ;
    public C915830ZwL LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;

    public final String getLinkMicId() {
        PosIdentity posIdentity = this.LLILLL;
        if (posIdentity == null || posIdentity.type != 1) {
            if (0 == 0) {
                if (posIdentity == null || posIdentity.type != 2) {
                    return null;
                }
                return this.LLILZ;
            }
            if (posIdentity == null) {
                return null;
            }
        }
        return posIdentity.value;
    }

    public final String getStreamId() {
        PosIdentity posIdentity = this.LLILLL;
        if ((posIdentity == null || posIdentity.type != 2) && (0 == 0 || posIdentity == null)) {
            return null;
        }
        return posIdentity.value;
    }

    public final Rect getRenderViewFrame() {
        ViewParent parent = getParent();
        if (parent instanceof C963800bBi) {
            return ((C963800bBi) parent).getRenderViewFrame();
        }
        return null;
    }

    public final String getCohostSpotExtra() {
        return this.LLJ;
    }

    public final String getContentLinkMicId() {
        return this.LLILZ;
    }

    public final String getIdentity() {
        return this.LLILLJJLI;
    }

    public final MultiGuestSpotExtra getMultiGuestExtra() {
        return this.LLIZ;
    }

    public final MultiGuestSpotNonSeiExtra getMultiGuestNoSeiExtra() {
        return this.LLIZLLLIL;
    }

    public final EnumC942070acf getOnlineState() {
        return this.LLILZLL;
    }

    public final PosIdentity getPosIdentity() {
        return this.LLILLL;
    }

    public final C915830ZwL getShapeDescriptor() {
        return this.LLJI;
    }

    public final long getSpotId() {
        return this.LL;
    }

    public final EnumC955290axz getWinState() {
        return this.LLILZIL;
    }

    public final long getZOrder() {
        return this.LLJILJILJ;
    }

    public final void setAnchor(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setCohostSpotExtra(String str) {
        this.LLJ = str;
    }

    public final void setContentLinkMicId(String str) {
        this.LLILZ = str;
    }

    public final void setIdentity(String str) {
        this.LLILLJJLI = str;
    }

    public final void setMultiGuestExtra(MultiGuestSpotExtra multiGuestSpotExtra) {
        this.LLIZ = multiGuestSpotExtra;
    }

    public final void setMultiGuestNoSeiExtra(MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra) {
        this.LLIZLLLIL = multiGuestSpotNonSeiExtra;
    }

    public final void setOnlineState(EnumC942070acf enumC942070acf) {
        this.LLILZLL = enumC942070acf;
    }

    public final void setPosIdentity(PosIdentity posIdentity) {
        this.LLILLL = posIdentity;
    }

    public final void setSelf(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setShapeDescriptor(C915830ZwL c915830ZwL) {
        this.LLJI = c915830ZwL;
    }

    public final void setSpotId(long j) {
        this.LL = j;
    }

    public final void setWinState(EnumC955290axz enumC955290axz) {
        this.LLILZIL = enumC955290axz;
    }

    public final void setZOrder(long j) {
        this.LLJILJILJ = j;
    }

    public C957020b0m(long j, String str, PosIdentity posIdentity, String str2, EnumC955290axz enumC955290axz, EnumC942070acf enumC942070acf, MultiGuestSpotExtra multiGuestSpotExtra, MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra, String str3, C915830ZwL c915830ZwL, boolean z, boolean z2, long j2, Context context) {
        super(context, null, 0);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = posIdentity;
        this.LLILZ = str2;
        this.LLILZIL = enumC955290axz;
        this.LLILZLL = enumC942070acf;
        this.LLIZ = multiGuestSpotExtra;
        this.LLIZLLLIL = multiGuestSpotNonSeiExtra;
        this.LLJ = str3;
        this.LLJI = c915830ZwL;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = j2;
    }
}
