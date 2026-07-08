package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel;

import X.AbstractC301401Eu;
import X.AnonymousClass0206;
import X.C01GW;
import X.C01NB;
import X.C01Z7;
import X.C01Z8;
import X.C01ZA;
import X.C09JN;
import X.C0UO0;
import X.C11NJ;
import X.C13LQ;
import X.C19487311Lz;
import X.C2188811AlT;
import X.C452501pT;
import X.C480460Ism;
import X.C513601zK;
import X.C515801zg;
import X.C516201zk;
import X.C5183020f;
import X.C917810ZzX;
import X.C940770aaZ;
import X.C972080bP4;
import X.InterfaceC301801Ey;
import X.InterfaceC940760aaY;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.LinkerModeChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderLayoutAvailableChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api.ITextHeaderApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestSupportTextHeaderPanelLayoutStyleListSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestTextHeaderFixLinkerModeSetting;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordGetParams;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicSceneChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextHeaderViewModel extends ViewModel {
    public final DataChannel LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(59));
    public final MutableLiveData<C01ZA> LLILLL;
    public final MutableLiveData LLILZ;
    public final MutableLiveData<C01ZA> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Long> LLIZ;
    public final MutableLiveData<Integer> LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final C01Z8 LLJI;
    public final C01Z7 LLJIJIL;

    public abstract String AQ2();

    public abstract AbstractC301401Eu wQ2();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DQ2() {
        C01ZA c01za;
        return (this.LLILZ.getValue() == 0 || (c01za = (C01ZA) this.LLILZ.getValue()) == null || c01za.LIZIZ != 2) ? false : true;
    }

    public final C11NJ vQ2() {
        return (C11NJ) this.LLILLJJLI.getValue();
    }

    public final boolean CQ2() {
        boolean z = C940770aaZ.LIZ().getDataSource().LJIIIZ().size() > 1 && C13LQ.LJIILJJIL(C940770aaZ.LIZ().getDataSource().getPanelLayoutType(), MultiGuestSupportTextHeaderPanelLayoutStyleListSetting.INSTANCE.getValue());
        boolean zLJIIL = C917810ZzX.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInMultiGuestScene:");
        sbLIZ.append(zLJIIL);
        sbLIZ.append(" isInAvailablePanelLayoutStyle:");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), AQ2(), 2);
        return zLJIIL && z;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        vQ2().LJ();
        AbstractC301401Eu abstractC301401EuWQ2 = wQ2();
        C01Z7 c01z7 = this.LLJIJIL;
        if (abstractC301401EuWQ2.LIZJ.contains(c01z7)) {
            abstractC301401EuWQ2.LIZJ.remove(c01z7);
        }
        abstractC301401EuWQ2.LJI();
    }

    public void onDestroy() {
        C940770aaZ.LIZ().LJJ(this.LLJI);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public void onInit() {
        DataChannel dataChannel;
        C940770aaZ.LIZ().LJIIZILJ(this.LLJI);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(LinkMicSceneChangeChannel.class, this, new C5183020f(this, 76));
        }
        if (MultiGuestTextHeaderFixLinkerModeSetting.INSTANCE.getValue() && (dataChannel = this.LL) != null) {
            dataChannel.CQ2(LinkerModeChangeChannel.class, this, new C5183020f(this, 77));
        }
        this.LLILZ.observeForever(new C513601zK(this, 33));
        AbstractC301401Eu abstractC301401EuWQ2 = wQ2();
        C01Z7 c01z7 = this.LLJIJIL;
        if (!abstractC301401EuWQ2.LIZJ.contains(c01z7)) {
            abstractC301401EuWQ2.LIZJ.add(c01z7);
        }
        abstractC301401EuWQ2.LJFF();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.01Z7] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.01Z8] */
    public BaseTextHeaderViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
        MutableLiveData<C01ZA> mutableLiveData = new MutableLiveData<>(null);
        this.LLILLL = mutableLiveData;
        this.LLILZ = mutableLiveData;
        MutableLiveData<C01ZA> mutableLiveData2 = new MutableLiveData<>(null);
        this.LLILZIL = mutableLiveData2;
        this.LLILZLL = mutableLiveData2;
        this.LLIZ = new MutableLiveData<>(null);
        this.LLIZLLLIL = new MutableLiveData<>(0);
        this.LLJ = new MutableLiveData<>(Boolean.FALSE);
        this.LLJI = new InterfaceC940760aaY() { // from class: X.01Z8
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                C972080bP4.LIZLLL("onLayoutRenderSuccessEnd ", this.LIZ.AQ2(), 2);
                this.LIZ.EQ2("onLayoutRenderSuccessEnd");
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
                C972080bP4.LIZLLL("onLayoutDidEnd ", this.LIZ.AQ2(), 2);
                this.LIZ.EQ2("onLayoutDidEnd");
            }
        };
        this.LLJIJIL = new InterfaceC301801Ey() { // from class: X.01Z7
            @Override // X.InterfaceC301801Ey
            public final void LIZ(TextHeaderPlayContent textHeaderPlayContent) {
                C176600m4.LIZJ(new C020Y(this.LIZ, textHeaderPlayContent, 18));
            }
        };
    }

    public static Long BQ2(TextHeaderPlayContent textHeaderPlayContent) {
        int i = textHeaderPlayContent.status;
        if (i != 3 && i != 0) {
            return Long.valueOf(textHeaderPlayContent.textHeaderId);
        }
        return null;
    }

    public static TextHeaderRecordInfo yQ2(TextHeaderPlayContent textHeaderPlayContent) {
        int i = textHeaderPlayContent.status;
        if (i != 3 && i != 0) {
            return textHeaderPlayContent.runningTextHeaderInfo;
        }
        return null;
    }

    public static TextHeaderRecordInfo zQ2(TextHeaderPlayContent textHeaderPlayContent) {
        int i = textHeaderPlayContent.status;
        if (i != 3 && i != 0) {
            return textHeaderPlayContent.selectedTextHeaderInfo;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void EQ2(String str) {
        GQ2((C01ZA) this.LLILZ.getValue(), str);
        boolean zCQ2 = CQ2();
        if (!Intrinsics.LJFF(this.LLJ.getValue(), Boolean.valueOf(zCQ2))) {
            this.LLJ.setValue(Boolean.valueOf(zCQ2));
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.FQ2(TextHeaderLayoutAvailableChangeEvent.class);
            }
        }
    }

    public final void FQ2(C01ZA c01za) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRunningSelectedRecordInfo recordInfo:");
        sbLIZ.append(c01za);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), AQ2(), 2);
        this.LLILLL.postValue(c01za);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(X.C01ZA r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isAvailableShowTextHeader value:"
            r1.append(r0)
            r0 = 0
            if (r6 == 0) goto L14
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L14:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = r5.AQ2()
            r4 = 2
            X.C972080bP4.LIZLLL(r1, r0, r4)
            if (r6 == 0) goto L69
            X.01F5 r0 = r6.LIZ
            if (r0 == 0) goto L69
            boolean r0 = r5.CQ2()
            if (r0 == 0) goto L69
            r3 = 1
            if (r6 == 0) goto L36
            X.01F5 r2 = r6.LIZ
            if (r2 != 0) goto L38
        L36:
            X.01F5 r2 = X.C01F5.LJIIIIZZ
        L38:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateTextHeader source:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " canShowTextHeader:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " richTextStyle:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = r5.AQ2()
            X.C972080bP4.LIZLLL(r1, r0, r4)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LL
            if (r1 == 0) goto L68
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel.class
            r1.zW(r0, r2)
        L68:
            return
        L69:
            r3 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel.GQ2(X.01ZA, java.lang.String):void");
    }

    public static void xQ2(BaseTextHeaderViewModel baseTextHeaderViewModel, String str, Function1 function1, Function1 function12) {
        baseTextHeaderViewModel.getClass();
        if (str.length() == 0) {
            if (function12 != null) {
                function12.invoke(new Throwable("invalid parameter"));
                return;
            }
            return;
        }
        AbstractC301401Eu abstractC301401EuWQ2 = baseTextHeaderViewModel.wQ2();
        TextHeaderRecordGetParams textHeaderRecordGetParams = new TextHeaderRecordGetParams();
        textHeaderRecordGetParams.recordId = 0L;
        textHeaderRecordGetParams.mediaNodeId = str;
        abstractC301401EuWQ2.getClass();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).getRecord(textHeaderRecordGetParams), abstractC301401EuWQ2.LJ(), "getRecord").LJIILL(new C09JN() { // from class: X.00SN
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BaseTextHeaderModel@7171.getRecord$1");
                C930480aJy.LIZ.getClass();
                C1C7U.LIZIZ("BaseTextHeaderModel@7171.getRecord$1");
            }
        })).LJFF(new C0UO0()), baseTextHeaderViewModel.vQ2(), new C515801zg(function1, function12, 62), new C516201zk(function12, 295), 24);
    }
}
