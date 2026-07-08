package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel;

import X.AnonymousClass0950;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09IR;
import X.C0PEM;
import X.C0U3O;
import X.C0UO0;
import X.C11JF;
import X.C1946707jt;
import X.C19490011Na;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2252331DDr;
import X.C23250099c;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C930540aK4;
import X.C936270aTJ;
import X.C939000aXi;
import X.C942930ae3;
import X.C943100aeK;
import X.C945350ahx;
import X.C956680b0E;
import X.InterfaceC497601wk;
import X.InterfaceC954180awC;
import Y.AfS184S0100000_15;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import com.bytedance.android.livesdkapi.util.file.FileDownloadTaskController;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS36S1101000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.WallpaperContent;
import webcast.data.multi_guest_play.WallpaperContext;
import webcast.im.WallpaperMessage;
import webcast.im.WallpaperReviewMessage;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseAigcWallpaperViewModel extends ViewModel {
    public static final /* synthetic */ int LLJILLL = 0;
    public final DataChannel LL;
    public final C2252331DDr LLILLJJLI;
    public final AnonymousClass0950 LLILLL;
    public final MutableLiveData<Pair<List<WallpaperContext>, List<WallpaperContext>>> LLILZ;
    public final MutableLiveData LLILZIL;
    public C11JF LLILZLL;
    public String LLIZ;
    public final C945350ahx LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public AnonymousClass0956 LLJI;
    public long LLJIJIL;
    public FileDownloadTaskController LLJILJIL;
    public boolean LLJILJILJ;

    public final void DQ2() {
        this.LLILZLL = (C11JF) C19490011Na.LIZLLL(1L, MultiGuestAigcWallpaperConfigSetting.INSTANCE.getCreateTimeout(), 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 63), new AfS184S0100000_15(this, 64));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJ = null;
        this.LLJI = null;
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        super.onCleared();
    }

    public final void wQ2() {
        FileDownloadTaskController fileDownloadTaskController = this.LLJILJIL;
        if (fileDownloadTaskController != null) {
            fileDownloadTaskController.cancel(true);
        }
        this.LLJILJILJ = false;
    }

    public final void xQ2() {
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZLL = null;
    }

    public BaseAigcWallpaperViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILLJJLI = c2252331DDrLIZIZ;
        this.LLILLL = C09IC.LIZ(c2252331DDrLIZIZ);
        MutableLiveData<Pair<List<WallpaperContext>, List<WallpaperContext>>> mutableLiveData = new MutableLiveData<>();
        this.LLILZ = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        this.LLIZ = "";
        this.LLIZLLLIL = new C945350ahx(dataChannel);
    }

    public static boolean AQ2(WallpaperMessage wallpaperMessage) {
        Long lValueOf;
        Long lValueOf2;
        String strU3;
        WallpaperContent wallpaperContent = wallpaperMessage.wallpaperContent;
        Long lLIZIZ = null;
        if (wallpaperContent != null) {
            lValueOf = Long.valueOf(wallpaperContent.roomId);
        } else {
            lValueOf = null;
        }
        if (Intrinsics.LJFF(lValueOf, C930540aK4.LJIIJ())) {
            WallpaperContent wallpaperContent2 = wallpaperMessage.wallpaperContent;
            if (wallpaperContent2 != null) {
                lValueOf2 = Long.valueOf(wallpaperContent2.channelId);
            } else {
                lValueOf2 = null;
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                lLIZIZ = C1946707jt.LIZIZ(strU3);
            }
            if (Intrinsics.LJFF(lValueOf2, lLIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void CQ2(String str) {
        C939000aXi c939000aXi = C939000aXi.LIZ;
        DataChannel dataChannel = this.LL;
        c939000aXi.getClass();
        C500260Jjc.LJJLIIIJJIZ(new AwS36S1101000_15(2, dataChannel, str, false, 1));
        this.LL.zW(AigcWallpaperStatus.class, Boolean.FALSE);
        this.LL.SX0(C956680b0E.class, -1L);
        C20441214yg.LJIIIZ("BaseAigcWallpaperViewModel", "resetAigcStatuData success");
    }

    public final void yQ2(final WallpaperReviewMessage wallpaperReviewMessage) {
        C20441214yg.LJIIIZ("BaseAigcWallpaperViewModel", "received result im, start download image");
        this.LLJILJILJ = true;
        this.LLJIJIL = System.currentTimeMillis();
        this.LLJILJIL = C936270aTJ.LIZIZ(MD5Utils.getMD5String(wallpaperReviewMessage.aiPicUrl), wallpaperReviewMessage.aiPicUrl, new Function1<C0U3O, Unit>(this) { // from class: X.0aeP
            public final /* synthetic */ BaseAigcWallpaperViewModel LLILLJJLI;

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C0U3O c0u3o) {
                C0U3O c0u3o2 = c0u3o;
                c0u3o2.LIZLLL(new AwS594S0100000_15(wallpaperReviewMessage, 417));
                c0u3o2.LIZJ(new AwS381S0200000_15(this.LLILLJJLI, wallpaperReviewMessage, 44));
                c0u3o2.LJFF(new AwS381S0200000_15(this.LLILLJJLI, wallpaperReviewMessage, 45));
                c0u3o2.LIZIZ(new AwS629S0100000_15(this.LLILLJJLI, 26));
                c0u3o2.LJ(AFwS250S0000000_15.get$arr$(56));
                return Unit.LIZ;
            }

            {
                this.LLILLJJLI = this;
            }
        });
    }

    public final boolean zQ2(WallpaperReviewMessage wallpaperReviewMessage) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        String strU3;
        long j = wallpaperReviewMessage.roomId;
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ == null || j != lLJIIJ.longValue() || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            return false;
        }
        long j2 = wallpaperReviewMessage.channelId;
        Long lLIZIZ = C1946707jt.LIZIZ(strU3);
        if (lLIZIZ == null || j2 != lLIZIZ.longValue()) {
            return false;
        }
        long j3 = wallpaperReviewMessage.wallpaperId;
        Long l = (Long) this.LL.gg0(C956680b0E.class);
        if (l == null || j3 != l.longValue()) {
            return false;
        }
        return true;
    }

    public final void BQ2(WallpaperReviewMessage wallpaperReviewMessage, long j, String str) {
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C943100aeK(this, wallpaperReviewMessage, j, str, null), 2);
    }

    public static void vQ2(BaseAigcWallpaperViewModel baseAigcWallpaperViewModel, String str, String str2, String str3, String str4, int i, boolean z, Function0 function0, Function0 function02, boolean z2, int i2) {
        boolean z3 = z2;
        Function0 function03 = function0;
        boolean z4 = z;
        Function0 function04 = function02;
        String str5 = str3;
        if ((i2 & 4) != 0) {
            str5 = null;
        }
        if ((i2 & 32) != 0) {
            z4 = false;
        }
        if ((i2 & 64) != 0) {
            function03 = null;
        }
        if ((i2 & 128) != 0) {
            function04 = null;
        }
        if ((i2 & 256) != 0) {
            z3 = false;
        }
        baseAigcWallpaperViewModel.LLJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseAigcWallpaperViewModel), C0PEM.LIZJ, null, new C942930ae3(z3, baseAigcWallpaperViewModel, function04, str2, function03, z4, str, i, str4, str5, null), 2);
    }
}
