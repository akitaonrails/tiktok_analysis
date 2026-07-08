package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive;

import X.AbstractC948140amS;
import X.AbstractC948200amY;
import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C01KE;
import X.C09IC;
import X.C09IR;
import X.C09JN;
import X.C0H79;
import X.C0UO0;
import X.C11NJ;
import X.C1813460xI8;
import X.C1954807lC;
import X.C1BNE;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C480460Ism;
import X.C500260Jjc;
import X.C515501zd;
import X.C515801zg;
import X.C516101zj;
import X.C925650aCB;
import X.C942210act;
import X.C948030amH;
import X.C948040amI;
import X.C948070amL;
import X.C948080amM;
import X.C948090amN;
import X.C948100amO;
import X.C948110amP;
import X.C948120amQ;
import X.C948130amR;
import X.C948150amT;
import X.C948400ams;
import X.InterfaceC934710aQn;
import Y.AfS184S0100000_15;
import Y.AfS82S0101000_15;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.api.ILayoutSettingApi;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAddAutoAcceptInGoLivePageSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AwS13S0002000_15;
import kotlin.jvm.internal.AwS29S0001000_15;
import kotlin.jvm.internal.AwS30S0010000_15;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsParams;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateParams;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPreviewLiveSettingViewModel extends ViewModel {
    public final String LL;
    public final DataChannel LLILLJJLI;
    public String LLILLL = "";
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252331DDr LLILZLL;
    public final AnonymousClass0950 LLIZ;
    public final C948030amH LLIZLLLIL;
    public final C11NJ LLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJ.LJ();
    }

    public final void vQ2(AbstractC948200amY abstractC948200amY) {
        boolean z = false;
        if (abstractC948200amY instanceof AbstractC948140amS) {
            AbstractC948140amS abstractC948140amS = (AbstractC948140amS) abstractC948200amY;
            if (abstractC948140amS instanceof C948110amP) {
                yQ2(((C948110amP) abstractC948140amS).LIZ, null);
                return;
            }
            if (abstractC948140amS instanceof C948090amN) {
                boolean z2 = ((C948090amN) abstractC948140amS).LIZ;
                int i = 3;
                if (this.LLIZLLLIL.LIZLLL == 3) {
                    z = true;
                }
                C1813460xI8.LIZIZ(this.LLILZ, new AwS30S0010000_15(z2, 4));
                C948030amH c948030amH = this.LLIZLLLIL;
                if (!z2) {
                    i = 4;
                }
                c948030amH.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateShowAvailableSpot: ");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJ.LIZ(C948030amH.LIZIZ(c948030amH, 1, null, Integer.valueOf(i), null, null, null, null, 122).LJJIIZ(new C515501zd(this, z, 9), new C515501zd(this, z, 10)));
                return;
            }
            if (abstractC948140amS instanceof C948070amL) {
                int i2 = ((C948070amL) abstractC948140amS).LIZ.LIZIZ;
                final int i3 = this.LLIZLLLIL.LIZIZ;
                int iWQ2 = wQ2(i2);
                C942210act.LIZ.getClass();
                List listLJI = C942210act.LJI(i2);
                if (true ^ listLJI.isEmpty()) {
                    ((Number) ListProtector.get(listLJI, listLJI.size() - 1)).intValue();
                }
                int i4 = this.LLIZLLLIL.LIZ(i2).maxPosition - 1;
                C948030amH c948030amH2 = this.LLIZLLLIL;
                final String str = c948030amH2.LJFF;
                final String str2 = c948030amH2.LJ;
                C1813460xI8.LIZIZ(this.LLILZ, new AwS13S0002000_15(iWQ2, i4, 0));
                this.LLJ.LIZ(this.LLIZLLLIL.LIZJ(i2, null, null, null).LJJIIZ(new C09JN() { // from class: X.0amG
                    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[PHI: r13
                      0x003e: PHI (r13v6 java.lang.String) = (r13v1 java.lang.String), (r13v7 java.lang.String) binds: [B:11:0x003c, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[PHI: r13
                      0x0080: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String), (r13v6 java.lang.String) binds: [B:11:0x003c, B:13:0x0040, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[PHI: r13 r14
                      0x0083: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String) binds: [B:28:0x0080, B:18:0x0049, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
                      0x0083: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String), (r14v4 java.lang.String) binds: [B:28:0x0080, B:18:0x0049, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r21) {
                        /*
                            Method dump skipped, instruction units count: 397
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C948020amG.accept(java.lang.Object):void");
                    }
                }, new AfS82S0101000_15(i3, this, 3)));
                return;
            }
            if (abstractC948140amS instanceof C948080amM) {
                Context context = ((C948080amM) abstractC948140amS).LIZ;
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null && dataChannel.gg0(PanelLayoutTypeChangeEvent.class) != null) {
                    xQ2(context);
                    return;
                }
                C948030amH c948030amH3 = this.LLIZLLLIL;
                c948030amH3.getClass();
                C20441214yg.LJIIIZ("LayoutSettingRepository", "initGuideLayoutSetting");
                GuideLayoutDetailsParams guideLayoutDetailsParams = new GuideLayoutDetailsParams();
                guideLayoutDetailsParams.frameSetting = 1L;
                guideLayoutDetailsParams.includeAnchorSetting = MultiGuestAddAutoAcceptInGoLivePageSetting.INSTANCE.enable();
                C480460Ism.LIZ().getClass();
                this.LLJ.LIZ(((ILayoutSettingApi) C480460Ism.LIZLLL(ILayoutSettingApi.class)).getGuideLayoutSetting(guideLayoutDetailsParams).LJFF(new C0UO0()).LJIILL(new AfS184S0100000_15(c948030amH3, 164)).LJIIL(new AfS184S0100000_15(c948030amH3, 165)).LJJIIZ(new C515801zg(this, context, 50), new C515801zg(this, context, 51)));
                return;
            }
            throw new C1954807lC();
        }
        if (abstractC948200amY instanceof C948150amT) {
            int i5 = ((C948130amR) this.LLILZ.getValue()).LIZIZ;
            C948150amT c948150amT = (C948150amT) abstractC948200amY;
            if (c948150amT.LIZ != 0 && i5 == 0) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Ob;
                if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                    c20337914i1.LJFF(Boolean.TRUE);
                    C01KE.LIZIZ(ViewModelKt.getViewModelScope(this), new C948040amI(this, abstractC948200amY, null));
                    return;
                }
            }
            int i6 = c948150amT.LIZ;
            int i7 = ((C948130amR) this.LLILZ.getValue()).LIZIZ;
            if (i7 <= 0 ? !(i7 != 0 || i6 <= 0) : i6 == 0) {
                if (i6 > 0) {
                    z = true;
                }
                C925650aCB.LIZLLL(this.LL, z);
            }
            C1813460xI8.LIZIZ(this.LLILZ, new AwS29S0001000_15(i6, 10));
            C948030amH c948030amH4 = this.LLIZLLLIL;
            c948030amH4.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateMultiGuestApplyAutoApprove: ");
            sbLIZ2.append(i6);
            C20441214yg.LJIIIZ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ2));
            GuideLayoutUpdateParams guideLayoutUpdateParams = new GuideLayoutUpdateParams();
            guideLayoutUpdateParams.guideLayoutUpdateScene = 101;
            guideLayoutUpdateParams.multiGuestApplyAutoApprove = i6;
            C480460Ism.LIZ().getClass();
            this.LLJ.LIZ(((ILayoutSettingApi) C480460Ism.LIZLLL(ILayoutSettingApi.class)).updateGuideLayout(guideLayoutUpdateParams).LJFF(new C0UO0()).LJIILL(new AfS82S0101000_15(i6, c948030amH4, 4)).LJJIIZ(new C516101zj(i7, this, 11), new C516101zj(i7, this, 12)));
            return;
        }
        throw new C1954807lC();
    }

    public final int wQ2(int i) {
        return ((Number) C500260Jjc.LJI(this.LLIZLLLIL.LIZ, new AwS29S0001000_15(i, 1)).getSecond()).intValue();
    }

    public final void xQ2(Context context) {
        int iIntValue;
        Integer num;
        C948030amH c948030amH = this.LLIZLLLIL;
        c948030amH.getClass();
        List<C948400ams> listLJII = C942210act.LIZ.LJII(context, false);
        c948030amH.LIZ = listLJII;
        C1813460xI8.LIZIZ(this.LLILZ, new C948120amQ(wQ2(this.LLIZLLLIL.LIZIZ), listLJII, this.LLIZLLLIL.LIZLLL, r1.LIZ(r1.LIZIZ).maxPosition - 1, this.LLIZLLLIL.LJI));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            C948100amO c948100amOLIZ = C0H79.LIZ();
            if (c948100amOLIZ != null && (num = c948100amOLIZ.LIZIZ) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            dataChannel.zW(PanelLayoutTypeChangeEvent.class, Integer.valueOf(iIntValue));
        }
    }

    public MultiGuestPreviewLiveSettingViewModel(DataChannel dataChannel, String str) {
        this.LL = str;
        this.LLILLJJLI = dataChannel;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C948130amR(0));
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZLL = c2252331DDrLIZIZ;
        this.LLIZ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLIZLLLIL = new C948030amH();
        this.LLJ = new C11NJ();
    }

    public final void yQ2(int i, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LLIZLLLIL.LIZIZ;
        }
        int i2 = this.LLIZLLLIL.LIZ(iIntValue).maxPosition;
        C1813460xI8.LIZIZ(this.LLILZ, new AwS29S0001000_15(i, 2));
        C948030amH c948030amH = this.LLIZLLLIL;
        long j = i;
        c948030amH.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAvailableSpotForGuest: ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ.LIZ(C948030amH.LIZIZ(c948030amH, 2, Integer.valueOf(iIntValue), null, Long.valueOf(j + 1), null, null, null, 116).LJJIIZ(new C516101zj(i2, this, 1), new C516101zj(i2, this, 2)));
    }
}
