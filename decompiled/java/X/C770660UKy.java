package X;

import Y.AComparatorS31S0000000_12;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.game.BannerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770660UKy {
    public final int LIZ;
    public final LinkedList<BannerInfo> LIZIZ;
    public LinkedHashSet<C770670UKz> LIZJ = new LinkedHashSet<>();
    public LinkedHashSet<C770670UKz> LIZLLL = new LinkedHashSet<>();
    public final Set<BannerWidget> LJ = new LinkedHashSet();
    public final C0JT6<String> LJFF = InterfaceC772190UQv.D3;
    public final C0JT6<String> LJI = InterfaceC772190UQv.C3;
    public boolean LJII;
    public final String LJIIIIZZ;

    public final C770670UKz LIZ(BannerWidget bannerWidget) {
        for (BannerInfo bannerInfo : this.LIZIZ) {
            if (Intrinsics.LJFF(bannerWidget.H1(), bannerInfo.name)) {
                return new C770670UKz(bannerInfo, bannerWidget);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bannerWidget not found");
        sbLIZ.append(bannerWidget.H1());
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public final void LIZIZ(boolean z) throws Exception {
        Iterator<C770670UKz> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            LIZJ(it2.next().LIZIZ, z);
        }
        this.LIZJ.clear();
        this.LIZLLL.clear();
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable() && z) {
            this.LJ.clear();
        }
    }

    public final void LIZLLL(boolean z) {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS31S0000000_12(19), this.LIZJ);
        ArrayList<C770670UKz> arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listLJLLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                if (i < this.LIZ) {
                    arrayList.add(obj);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LinkedHashSet<C770670UKz> linkedHashSet = new LinkedHashSet<>();
        for (C770670UKz c770670UKz : arrayList) {
            linkedHashSet.add(c770670UKz);
            if (!c770670UKz.LIZ.compatible) {
                break;
            }
        }
        if (z) {
            for (C770670UKz c770670UKz2 : this.LIZLLL) {
                if (!linkedHashSet.contains(c770670UKz2)) {
                    c770670UKz2.LIZIZ.I1(false);
                }
            }
        }
        this.LIZLLL = linkedHashSet;
    }

    public final void LIZJ(BannerWidget bannerWidget, boolean z) throws Exception {
        if (Intrinsics.LJFF(this.LJIIIIZZ, bannerWidget.LLILZIL) && !Intrinsics.LJFF(this.LJIIIIZZ, "else")) {
            bannerWidget.J1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJIIIIZZ);
            sbLIZ.append(bannerWidget.H1());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (bannerWidget.LLIZ) {
                this.LJI.LIZLLL(String.valueOf(System.currentTimeMillis()), strLIZIZ);
            }
            if (z) {
                bannerWidget.M1();
                if (bannerWidget.LLILZLL != Integer.MAX_VALUE) {
                    String strLIZIZ2 = this.LJFF.LIZIZ(strLIZIZ);
                    if (strLIZIZ2 == null) {
                        strLIZIZ2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    this.LJFF.LIZLLL(String.valueOf(CastIntegerProtector.parseInt(strLIZIZ2) + 1), strLIZIZ);
                }
            }
        }
    }

    public C770660UKy(LiveMode liveMode, int i, LinkedList<BannerInfo> linkedList) {
        String str;
        this.LIZ = i;
        this.LIZIZ = linkedList;
        int i2 = C200300pt.LIZ[liveMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "else";
                } else {
                    str = LiveMode.LIVE_STUDIO.logStreamingType;
                }
            } else {
                str = LiveMode.THIRD_PARTY.logStreamingType;
            }
        } else {
            str = LiveMode.SCREEN_RECORD.logStreamingType;
        }
        this.LJIIIIZZ = str;
    }
}
