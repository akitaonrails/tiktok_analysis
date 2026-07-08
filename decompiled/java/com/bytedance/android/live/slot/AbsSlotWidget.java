package com.bytedance.android.live.slot;

import X.C21212117zj;
import X.EnumC742820TBw;
import X.InterfaceC1124060fMC;
import X.InterfaceC21213717zz;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public abstract class AbsSlotWidget<W, VM extends ViewModel, T extends Enum<T>> implements InterfaceC1124060fMC<W, VM, T> {
    public ViewModel LL;
    public InterfaceC21213717zz LLILLJJLI;

    @Override // X.InterfaceC1124060fMC
    public List<EnumC742820TBw> LJLI() {
        return null;
    }

    @Override // X.InterfaceC1124060fMC
    public /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceC1124060fMC
    public /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceC1124060fMC
    public /* synthetic */ String LLILZIL() {
        return null;
    }

    @Override // X.InterfaceC1124060fMC
    public boolean LLIZLLLIL() {
        return this instanceof C21212117zj;
    }

    @Override // X.InterfaceC1124060fMC
    public List<Integer> getMessageType() {
        return null;
    }

    public void onAggregateClick() {
    }

    public void onAggregateExposure(String str) {
    }

    @Override // X.InterfaceC1124060fMC
    public void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC1124060fMC
    public void onDestroy() {
    }

    @Override // X.InterfaceC1124060fMC
    public void onDispose() {
    }

    @Override // X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
    }

    @Override // X.InterfaceC1124060fMC
    public void onExposure(String str) {
    }

    @Override // X.InterfaceC1124060fMC
    public void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC1124060fMC
    public void onPause() {
    }

    @Override // X.InterfaceC1124060fMC
    public void onResume() {
    }

    @Override // X.InterfaceC1124060fMC
    public void onStart() {
    }

    @Override // X.InterfaceC1124060fMC
    public void onStop() {
    }

    @Override // X.InterfaceC1124060fMC
    public void LLIZ(VM vm, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = vm;
        this.LLILLJJLI = interfaceC21213717zz;
    }
}
