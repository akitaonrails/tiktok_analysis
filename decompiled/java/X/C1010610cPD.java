package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010610cPD implements InterfaceC657480Pqc, InterfaceC1010660cPI, InterfaceC1010650cPH {
    public final InterfaceC657490Pqd LL;
    public C1010790cPV LLILLL;
    public final SearchAdEventLogger LLILZ;
    public long LLILZLL;
    public Integer LLIZ;
    public final InterfaceC657510Pqf LLILLJJLI = C655610Pnb.LIZIZ.LIZLLL();
    public final C1010750cPR LLILZIL = new C1010750cPR();
    public final C1004580cFU LLIZLLLIL = new C1004580cFU(0);

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.C0PPF
    public final void onDestroy() {
    }

    @Override // X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return null;
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJIJI() {
        Set<EnumC1010840cPa> linkedHashSet;
        C1004580cFU c1004580cFU = this.LLIZLLLIL;
        C1010790cPV c1010790cPV = this.LLILLL;
        if (c1010790cPV == null || (linkedHashSet = c1010790cPV.OG0()) == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        c1004580cFU.LIZJ = linkedHashSet;
        C1010790cPV c1010790cPV2 = this.LLILLL;
        c1004580cFU.LIZIZ = c1010790cPV2 != null ? c1010790cPV2.LLJIJIL : 0;
    }

    @Override // X.InterfaceC1010660cPI
    public final void LLLLLLJ() {
        Video video;
        VideoUrlModel playAddr;
        C1010790cPV c1010790cPV = this.LLILLL;
        this.LLILZLL = c1010790cPV != null ? c1010790cPV.getCurrentPosition() : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoPause called, currentPosition=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", vid=");
        Aweme aweme = this.LL.getAweme();
        sbLIZ.append((aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null) ? null : playAddr.getUri());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0PPF
    public final void bind() {
        InterfaceC657510Pqf interfaceC657510Pqf = this.LLILLJJLI;
        if (interfaceC657510Pqf != null) {
            interfaceC657510Pqf.LJIJJ(this);
        }
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        C1010790cPV c1010790cPV = this.LLILLL;
        if (c1010790cPV != null) {
            c1010790cPV.onViewAttachedToWindow();
        }
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        C1010790cPV c1010790cPV = this.LLILLL;
        if (c1010790cPV != null) {
            c1010790cPV.onViewDetachedFromWindow();
        }
        C1010120cOQ.LJJIL(this.LLIZLLLIL);
        this.LLILZIL.LIZ(this.LL.getAweme());
    }

    @Override // X.InterfaceC1002870cCj
    public final Integer LJIIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1010530cP5
    public final InterfaceC1010250cOd Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC1002830cCf
    public final C1004580cFU getShareInfo() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ne() {
        return this.LLILLL;
    }

    public C1010610cPD(InterfaceC657490Pqd interfaceC657490Pqd) {
        this.LL = interfaceC657490Pqd;
        this.LLILZ = new SearchAdEventLogger(interfaceC657490Pqd.getAweme());
    }

    @Override // X.InterfaceC658610PsR
    public final void LIZIZ(InterfaceC1010860cPc interfaceC1010860cPc) {
        Ms(ik(interfaceC1010860cPc));
    }

    @Override // X.InterfaceC1010650cPH
    public final void LIZJ(C1023640ckE c1023640ckE) {
        String uri;
        Video video;
        VideoUrlModel playAddr;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJJJL, Long.valueOf(this.LLILZLL));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appendToAdLogExtra currentPosition=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", vid=");
        Aweme aweme = this.LL.getAweme();
        if (aweme != null && (video = aweme.getVideo()) != null && (playAddr = video.getPlayAddr()) != null) {
            uri = playAddr.getUri();
        } else {
            uri = null;
        }
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1002830cCf
    public final void LJFF(String str) {
        InterfaceC988260bpA interfaceC988260bpALIZLLL;
        C1004580cFU shareInfo;
        Set<EnumC1010840cPa> setOG0;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (interfaceC988260bpALIZLLL = interfaceC657510PqfLIZLLL.LIZLLL(this.LL.getAweme())) != null && (shareInfo = interfaceC988260bpALIZLLL.getShareInfo()) != null) {
            C1010120cOQ.LJJJJI(this.LLIZLLLIL, shareInfo);
            C1010790cPV c1010790cPV = this.LLILLL;
            if (c1010790cPV != null && (setOG0 = c1010790cPV.OG0()) != null) {
                setOG0.addAll(this.LLIZLLLIL.LIZJ);
            }
            C1010790cPV c1010790cPV2 = this.LLILLL;
            if (c1010790cPV2 != null) {
                c1010790cPV2.BJ1(shareInfo.LIZIZ);
            }
        }
    }

    @Override // X.InterfaceC1002870cCj
    public final void LJIJJ(Integer num) {
        this.LLIZ = null;
    }

    @Override // X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        C19EG c19egLIZIZ;
        Context context;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = interfaceC1010450cOx.Mh().getView();
        InterfaceC657490Pqd interfaceC657490Pqd = this.LL;
        if (interfaceC657490Pqd != null && (context = interfaceC657490Pqd.getContext()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        C1009940cO8.LIZIZ(interfaceC1010450cOx, SAFHelper.LJIJI(view, c19egLIZIZ), C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 35)), new Pair(C1010900cPg.LIZ, AFwS204S0000000_16.get$arr$(69))));
        this.LLILZ.withContext(interfaceC1010450cOx);
    }

    @Override // X.InterfaceC658610PsR
    public final InterfaceC1010450cOx ik(InterfaceC1010860cPc interfaceC1010860cPc) {
        C1010790cPV c1010790cPVLIZ = C1010810cPX.LIZ(interfaceC1010860cPc);
        c1010790cPVLIZ.LIZ(new C1010640cPG(null, new C1010630cPF(true, C2097908Jt.LIZJ(new Pair(EnumC1010840cPa.BREAK, Boolean.FALSE)), this, this)));
        this.LLILLL = c1010790cPVLIZ;
        return c1010790cPVLIZ;
    }
}
