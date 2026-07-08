package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21350418gw extends i<InterfaceC557440Lte, C21348618ge, C21348918gh, C21350218gu> implements InterfaceC379610EuV, InterfaceC557440Lte {
    public final C553840Lnq LLJILJILJ;
    public final C1DRG LLJILLL;
    public final MutableLiveData<AbstractC551420Ljw> LLJJ;
    public final MutableLiveData<C00YB> LLJJI;

    @Override // X.AbstractC1664470tPp
    public Function0<C21348918gh> o2() {
        return new AwS576S0100000_32(this, 597);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21350218gu> w2() {
        return new AwS576S0100000_32(this, 598);
    }

    public MutableLiveData<AbstractC551420Ljw> F4() {
        return this.LLJJ;
    }

    public MutableLiveData<C00YB> H4() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC557440Lte
    public /* bridge */ /* synthetic */ LiveData ez() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC557440Lte
    public /* bridge */ /* synthetic */ LiveData i6() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC557440Lte
    public void Ab(boolean z) {
        i3(new AwS44S0010000_32(z, 25));
    }

    @Override // X.InterfaceC557440Lte
    public void Ik(MediaModel mediaModel) {
        i3(new AwS611S0100000_32(mediaModel, 294));
    }

    @Override // X.InterfaceC557440Lte
    public void OQ0(boolean z) {
        i3(new AwS44S0010000_32(z, 24));
    }

    @Override // X.InterfaceC557440Lte
    public void di1(boolean z) {
        i3(new AwS44S0010000_32(z, 22));
    }

    @Override // X.InterfaceC557440Lte
    public void ka(boolean z) {
        i3(new AwS44S0010000_32(z, 28));
    }

    @Override // X.InterfaceC557440Lte
    public void ko(boolean z) {
        i3(new AwS44S0010000_32(z, 23));
    }

    @Override // X.InterfaceC557440Lte
    public void mw(boolean z) {
        i3(new AwS44S0010000_32(z, 26));
    }

    @Override // X.InterfaceC557440Lte
    public void zb(boolean z) {
        i3(new AwS44S0010000_32(z, 27));
    }

    public C21350418gw(C19A3 c19a3, C553840Lnq c553840Lnq, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c553840Lnq;
        this.LLJILLL = c1drg;
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new MutableLiveData<>();
    }
}
