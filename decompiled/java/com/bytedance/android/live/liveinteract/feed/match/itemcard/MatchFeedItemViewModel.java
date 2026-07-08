package com.bytedance.android.live.liveinteract.feed.match.itemcard;

import X.C1144720ftW;
import X.C20441214yg;
import X.C500260Jjc;
import X.EnumC964170bCJ;
import X.InterfaceC969600bL4;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchFeedItemViewModel extends ViewModel {
    public long LL;
    public DataChannel LLILLJJLI;
    public final C1144720ftW LLILLL = new C1144720ftW(0);
    public final MutableLiveData<C1144720ftW> LLILZ = new MutableLiveData<>();
    public EnumC964170bCJ LLILZIL = EnumC964170bCJ.NONE;
    public InterfaceC969600bL4 LLILZLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C20441214yg.LJ("MatchFeedItemViewModel", "onClear");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILLJJLI = null;
        C500260Jjc.LJJIJIIJIL(null);
        super.onCleared();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r18) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.feed.match.itemcard.MatchFeedItemViewModel.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE vQ2(com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.feed.match.itemcard.MatchFeedItemViewModel.vQ2(com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }
}
