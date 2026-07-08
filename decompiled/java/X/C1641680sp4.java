package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641680sp4 extends AbstractC1622390sJx implements InterfaceC1159800gHq {
    public final Function0<String> LLILLJJLI;
    public final C19GS LLILLL;
    public final InterfaceC1624480sNK LLILZ;
    public final InterfaceC1661400tKs LLILZIL;
    public final C1641120soA LLILZLL;
    public final List<ComposerNode> LLIZ = new ArrayList();
    public final C1641710sp7 LLIZLLLIL;
    public final MutableLiveData<List<ComposerNode>> LLJ;
    public C01GW<? extends InterfaceC1638010sj9> LLJI;

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        C01GW<? extends InterfaceC1638010sj9> c01gw;
        InterfaceC1638010sj9 value;
        C01GW<? extends InterfaceC1638010sj9> c01gw2 = this.LLJI;
        if (c01gw2 != null && c01gw2.isInitialized() && (c01gw = this.LLJI) != null && (value = c01gw.getValue()) != null) {
            value.hideStickerView();
        }
        LJJIIJ();
    }

    public final void LJJIIJ() {
        C01GW<? extends InterfaceC1638010sj9> c01gw;
        InterfaceC1638010sj9 value;
        C01GW<? extends InterfaceC1638010sj9> c01gw2 = this.LLJI;
        if (c01gw2 != null && c01gw2.isInitialized() && (c01gw = this.LLJI) != null && (value = c01gw.getValue()) != null) {
            value.LIZ();
        }
        this.LLIZLLLIL.clear();
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        if (this.LLJI != null) {
            return;
        }
        this.LLJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS426S0200000_25(this, view, 199));
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624570sNT.LJIILIIL(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        InterfaceC1638010sj9 value;
        InterfaceC1638010sj9 value2;
        C01GW<? extends InterfaceC1638010sj9> c01gw = this.LLJI;
        if (c01gw != null && (value2 = c01gw.getValue()) != null) {
            value2.LIZIZ();
        }
        Effect effect = c1627370sRz.LIZ;
        ComposerNode composerMaterial = ComposerHelper.parseComposerMaterial(effect.getUnzipPath(), this.LLILLJJLI.invoke(), new C0VSJ(effect.getUnzipPath()).getParent());
        C01GW<? extends InterfaceC1638010sj9> c01gw2 = this.LLJI;
        if (c01gw2 != null && (value = c01gw2.getValue()) != null) {
            value.LIZLLL(composerMaterial);
        }
    }

    public C1641680sp4(C1642350sq9 c1642350sq9, C19GS c19gs, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1645720sva interfaceC1645720sva, C1641120soA c1641120soA) {
        this.LLILLJJLI = c1642350sq9;
        this.LLILLL = c19gs;
        this.LLILZ = interfaceC1624480sNK;
        this.LLILZIL = interfaceC1645720sva;
        this.LLILZLL = c1641120soA;
        C1641710sp7 c1641710sp7 = new C1641710sp7(this);
        this.LLIZLLLIL = c1641710sp7;
        MutableLiveData<List<ComposerNode>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(c1641710sp7);
        this.LLJ = mutableLiveData;
    }
}
