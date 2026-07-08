package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem;

import X.AnonymousClass0206;
import X.C01ET;
import X.C01GW;
import X.C09R9;
import X.C0PEM;
import X.C0QSJ;
import X.C13LE;
import X.C1618350sDR;
import X.C1816080xMM;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class DistributeStatusViewModel extends AssemViewModel<C1816080xMM> implements IDistributeStateAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final String LL;
    public final C09R9 LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LinkMicScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2007555203) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1816080xMM(0);
    }

    public DistributeStatusViewModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistributeStatusViewModel");
        sbLIZ.append(hashCode());
        this.LL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = new C09R9(this, C13LE.LIZ(C01ET.class));
        this.LLILLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(45));
    }

    public final void vQ2(int i, int i2) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateState open = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1618350sDR(this, i, i2, null), 2);
    }
}
