package X;

import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710670RuD implements C160K {
    public final InterfaceC497601wk LL;
    public final InterfaceC20703115zp LLILLJJLI;
    public final Function1<C160B, Unit> LLILLL;
    public final Function1<C710840RuU, Unit> LLILZ;
    public C160B LLILZIL;
    public C160B LLILZLL;
    public C710680RuE LLIZ;
    public C710840RuU LLIZLLLIL;

    @Override // X.C160K
    public final void EK() {
    }

    public final void LIZIZ() {
        C160B c160b;
        Aweme aweme;
        Aweme aweme2;
        C160B c160b2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculating base display state. ");
        VideoItemParams videoItemParams = this.LLILLJJLI.getVideoItemParams();
        sbLIZ.append((videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null) ? null : aweme2.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLJJLI.rK()) {
            ICaptionKevaService iCaptionKevaServiceLIZ = C746760TRa.LIZ();
            VideoItemParams videoItemParams2 = this.LLILLJJLI.getVideoItemParams();
            if (iCaptionKevaServiceLIZ.LJJIL((videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null) ? null : aweme.getAid())) {
                c160b = C160B.HIDDEN;
            } else {
                C20703515zt c20703515zt = C20703515zt.LIZ;
                VideoItemParams videoItemParams3 = this.LLILLJJLI.getVideoItemParams();
                Aweme aweme3 = videoItemParams3 != null ? videoItemParams3.getAweme() : null;
                c20703515zt.getClass();
                c160b = C20703515zt.LJJIJIIJIL(aweme3, true) ? C160B.EXPANDED : C160B.HIDDEN;
            }
        } else {
            c160b = C160B.HIDDEN;
        }
        this.LLILZIL = c160b;
        if (c160b2 != c160b) {
            C23250099c.LIZLLL(this.LL, null, null, new C710090RtH(this, null), 3);
        }
        LIZJ(null, true);
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        this.LLIZ = null;
        C23250099c.LIZLLL(this.LL, C1699690uKd.LIZ(), null, new C710060RtE(this, null), 2);
    }

    public final void LIZ(C0Q69 c0q69) {
        Integer numValueOf;
        boolean z;
        Aweme aweme;
        CaptionItemModel captionItemModelLJIIIIZZ;
        VideoItemParams videoItemParams = this.LLILLJJLI.getVideoItemParams();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) != null) {
            numValueOf = Integer.valueOf(captionItemModelLJIIIIZZ.subId);
        } else {
            numValueOf = null;
        }
        Integer num = c0q69.LIZLLL;
        String str = c0q69.LIZJ;
        boolean z2 = false;
        if (Intrinsics.LJFF(num, numValueOf) || (((Boolean) C0BJ7.LIZ.getValue()).booleanValue() && num != null && num.intValue() == -1)) {
            z = true;
        } else {
            z = false;
        }
        C710680RuE c710680RuE = new C710680RuE(str, z);
        C1485670olR.LIZ().LJIILIIL(c0q69, true);
        C710680RuE c710680RuE2 = this.LLIZ;
        if (c710680RuE2 != null && z == c710680RuE2.LIZIZ) {
            z2 = true;
        }
        this.LLIZ = c710680RuE;
        LIZJ(c0q69, !z2);
    }

    @Override // X.C160K
    public final void PU1(Context context) {
        Aweme aweme;
        C161N c161n = C161N.LIZIZ;
        VideoItemParams videoItemParams = this.LLILLJJLI.getVideoItemParams();
        Aweme aweme2 = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (c161n.LJJIIZI(aweme, C0SXF.LJIL(context))) {
            VideoItemParams videoItemParams2 = this.LLILLJJLI.getVideoItemParams();
            if (videoItemParams2 != null) {
                aweme2 = videoItemParams2.getAweme();
            }
            c161n.LJIJJLI(aweme2, C0SXF.LJIL(context));
        }
    }

    @Override // X.C160K
    public final void cL2(boolean z) {
        if (!z) {
            this.LLIZ = null;
            C710840RuU c710840RuU = new C710840RuU("", this.LLILZLL, false, null);
            if (!Intrinsics.LJFF(c710840RuU, this.LLIZLLLIL)) {
                this.LLIZLLLIL = c710840RuU;
                this.LLILZ.invoke(c710840RuU);
            }
        }
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) {
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams = this.LLILLJJLI.getVideoItemParams();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, c0q69.LIZ)) {
            return;
        }
        if (C295300Bho.LIZ()) {
            LIZ(c0q69);
        } else {
            C23250099c.LIZLLL(this.LL, C1699690uKd.LIZ(), null, new C710070RtF(this, c0q69, null), 2);
        }
    }

    public final void LIZJ(C0Q69 c0q69, boolean z) {
        C160B c160b;
        String str;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        Boolean boolValueOf;
        String aid2;
        Boolean boolValueOf2;
        String str2;
        Aweme aweme3;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculating UI display state.  ");
            VideoItemParams videoItemParams = this.LLILLJJLI.getVideoItemParams();
            if (videoItemParams != null && (aweme3 = videoItemParams.getAweme()) != null) {
                aid = aweme3.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            VideoItemParams videoItemParams2 = this.LLILLJJLI.getVideoItemParams();
            if (videoItemParams2 != null) {
                aweme2 = videoItemParams2.getAweme();
            } else {
                aweme2 = null;
            }
            C20703515zt c20703515zt = C20703515zt.LIZ;
            C710680RuE c710680RuE = this.LLIZ;
            if (c710680RuE != null) {
                boolValueOf = Boolean.valueOf(c710680RuE.LIZIZ);
            } else {
                boolValueOf = null;
            }
            c20703515zt.getClass();
            boolean zLJJIJ = C20703515zt.LJJIJ(aweme2, boolValueOf);
            if (aweme2 != null && (aid2 = aweme2.getAid()) != null && aid2.length() != 0 && aweme2 != null) {
                if (zLJJIJ && this.LLILZIL == C160B.EXPANDED) {
                    str2 = "foreign_original_hidden";
                } else {
                    if (C20703515zt.LJJIJIIJIL(aweme2, true)) {
                        C710680RuE c710680RuE2 = this.LLIZ;
                        if (c710680RuE2 != null) {
                            boolValueOf2 = Boolean.valueOf(c710680RuE2.LIZIZ);
                        } else {
                            boolValueOf2 = null;
                        }
                        if (this.LLILZIL == C160B.EXPANDED && C20703515zt.LJJIIZI(aweme2, boolValueOf2)) {
                            str2 = "burned_in_dup_hidden";
                        } else if (this.LLILZIL == C160B.HIDDEN && C746760TRa.LIZ().LJJIL(aweme2.getAid())) {
                            str2 = "pending_removal";
                        }
                    }
                    C1485670olR.LIZ().LJIIJJI(aid2);
                }
                C1485670olR.LIZ().LJ(aid2, str2);
            }
            if (zLJJIJ) {
                c160b = C160B.HIDDEN;
            } else {
                c160b = this.LLILZIL;
            }
        } else {
            c160b = this.LLILZLL;
        }
        this.LLILZLL = c160b;
        C710680RuE c710680RuE3 = this.LLIZ;
        if (c710680RuE3 == null || (str = c710680RuE3.LIZ) == null) {
            str = "";
        }
        C161N c161n = C161N.LIZIZ;
        VideoItemParams videoItemParams3 = this.LLILLJJLI.getVideoItemParams();
        if (videoItemParams3 != null) {
            aweme = videoItemParams3.getAweme();
        } else {
            aweme = null;
        }
        C710840RuU c710840RuU = new C710840RuU(str, c160b, c161n.LJIJJ(aweme), c0q69);
        if (!Intrinsics.LJFF(c710840RuU, this.LLIZLLLIL)) {
            this.LLIZLLLIL = c710840RuU;
            if (C295300Bho.LIZ() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                this.LLILZ.invoke(this.LLIZLLLIL);
            } else {
                C23250099c.LIZLLL(this.LL, null, null, new C710100RtI(this, null), 3);
            }
        }
    }

    public C710670RuD(InterfaceC497601wk interfaceC497601wk, InterfaceC20703115zp interfaceC20703115zp, C160J c160j, C160M c160m) {
        Aweme aweme;
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = interfaceC20703115zp;
        this.LLILLL = c160j;
        this.LLILZ = c160m;
        C160B c160b = C160B.HIDDEN;
        this.LLILZIL = c160b;
        this.LLILZLL = c160b;
        C710680RuE c710680RuE = this.LLIZ;
        String str = (c710680RuE == null || (str = c710680RuE.LIZ) == null) ? "" : str;
        C161N c161n = C161N.LIZIZ;
        VideoItemParams videoItemParams = interfaceC20703115zp.getVideoItemParams();
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        this.LLIZLLLIL = new C710840RuU(str, c160b, c161n.LJIJJ(aweme), null);
        C23250099c.LIZLLL(interfaceC497601wk, C1699690uKd.LIZ(), null, new C710080RtG(this, null), 2);
        if (C305370By3.LIZ) {
            C23250099c.LIZLLL(interfaceC497601wk, C1699690uKd.LIZ(), null, new C710050RtD(this, null), 2);
        }
        C23250099c.LIZLLL(interfaceC497601wk, C1699690uKd.LIZ(), null, new C710700RuG(this, null), 2);
    }
}
