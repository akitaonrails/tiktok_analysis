package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554020Lo8 implements InterfaceC551310Ljl {
    public C553990Lo5 LIZ = new C553990Lo5();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 804));

    public final C554080LoE LIZ() {
        return (C554080LoE) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC551310Ljl
    public final MutableLiveData Ao() {
        return LIZ().LLJJIJI;
    }

    @Override // X.InterfaceC551310Ljl
    public final MutableLiveData Po() {
        return LIZ().LLJJIII;
    }

    @Override // X.InterfaceC551310Ljl
    public final MutableLiveData Yb() {
        return LIZ().LLJJIJIIJIL;
    }

    @Override // X.InterfaceC551310Ljl
    public final List<Pair<MentionDataItem, MentionDataItem>> de() {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            return c554100LoG.de();
        }
        return null;
    }

    @Override // X.InterfaceC551310Ljl
    public final MutableLiveData nn() {
        return LIZ().LLJJIJIL;
    }

    @Override // X.InterfaceC551310Ljl
    public final MutableLiveData rg() {
        return LIZ().LLJJI;
    }

    @Override // X.InterfaceC551310Ljl
    public final void Bc(List<MentionDataItem> list) {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            c554100LoG.Bc(list);
        }
    }

    @Override // X.InterfaceC551310Ljl
    public final void Qo(InterfaceC549270LgT interfaceC549270LgT, MentionDataItem mentionDataItem) {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            c554100LoG.Y1(interfaceC549270LgT, mentionDataItem);
        }
    }

    @Override // X.InterfaceC551310Ljl
    public final void R9(boolean z, List<MentionDataItem> list) {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            c554100LoG.R9(z, list);
        }
    }

    @Override // X.InterfaceC551310Ljl
    public final void r9(int i, MentionDataItem mentionDataItem) {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            c554100LoG.r9(i, mentionDataItem);
        }
    }

    @Override // X.InterfaceC551310Ljl
    public final void t2(List<MentionDataItem> list, boolean z) {
        C554100LoG c554100LoG = LIZ().LLJJ;
        if (c554100LoG != null) {
            c554100LoG.t2(list, z);
        }
    }
}
