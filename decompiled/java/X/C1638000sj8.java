package X;

import Y.AObserverS227S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0sj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638000sj8 implements InterfaceC1638010sj9 {
    public final InterfaceC1624480sNK LIZ;
    public final ViewGroup LIZIZ;
    public final LiveData<List<ComposerNode>> LIZJ;
    public final C1641120soA LIZLLL;
    public final Function1<ComposerNode, Unit> LJ;
    public final RecyclerView LJFF;
    public final C12ME LJI;
    public final C1637980sj6 LJII;

    @Override // X.InterfaceC1641700sp6
    public final void LIZ() {
        this.LJFF.getAdapter().notifyDataSetChanged();
    }

    @Override // X.InterfaceC1641700sp6
    public final void LIZIZ() {
        C786410Ut5.LLIZLLLIL(this.LJFF, 0);
    }

    @Override // X.InterfaceC1641700sp6
    public final void hideStickerView() {
        C12ME c12me = this.LJI;
        int visibility = c12me.getVisibility();
        c12me.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c12me);
        C786410Ut5.LLIZLLLIL(this.LJFF, 8);
    }

    @Override // X.InterfaceC1638010sj9
    public final void LIZJ(AwS391S0200000_25 awS391S0200000_25) {
        C12ME c12me = this.LJI;
        int visibility = c12me.getVisibility();
        c12me.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c12me);
        C12ME c12me2 = this.LJI;
        SeekBar.OnSeekBarChangeListener c1698120uI6 = new C1698120uI6(awS391S0200000_25, 2);
        if (C1848410yCV.LIZ) {
            c1698120uI6 = new C786820Utk(c1698120uI6);
        }
        c12me2.setOnSeekBarChangeListener(c1698120uI6);
    }

    @Override // X.InterfaceC1638010sj9
    public final void LIZLLL(ComposerNode composerNode) {
        List<? extends ComposerNode> listLLLFZ;
        C1637980sj6 c1637980sj6 = this.LJII;
        c1637980sj6.LL = composerNode;
        if (composerNode != null) {
            listLLLFZ = C1637980sj6.LLLFZ(composerNode);
        } else {
            listLLLFZ = null;
        }
        c1637980sj6.LLILLJJLI = listLLLFZ;
        this.LJII.notifyDataSetChanged();
    }

    public C1638000sj8(C19GS c19gs, InterfaceC1624480sNK interfaceC1624480sNK, ViewGroup viewGroup, MutableLiveData mutableLiveData, C1641120soA c1641120soA, C1641690sp5 c1641690sp5) {
        this.LIZ = interfaceC1624480sNK;
        this.LIZIZ = viewGroup;
        this.LIZJ = mutableLiveData;
        this.LIZLLL = c1641120soA;
        this.LJ = c1641690sp5;
        C1637980sj6 c1637980sj6 = new C1637980sj6(this);
        this.LJII = c1637980sj6;
        View viewLIZ = ((ViewStubCompat) q0.LJIILLIIL(R.id.wbr, viewGroup)).LIZ();
        RecyclerView recyclerView = (RecyclerView) q0.LJIILLIIL(R.id.mel, viewLIZ);
        this.LJFF = recyclerView;
        recyclerView.setAdapter(c1637980sj6);
        recyclerView.setLayoutManager(new LinearLayoutManager(c19gs, 0, false));
        this.LJI = (C12ME) q0.LJIILLIIL(R.id.eoe, viewLIZ);
        LiveData<List<ComposerNode>> liveData = this.LIZJ;
        AbstractC214814194y abstractC214814194yLIZ = C535690Kzf.LIZ(viewGroup);
        liveData.observe(abstractC214814194yLIZ != null ? abstractC214814194yLIZ : c19gs, new AObserverS227S0100000_25(this, 149));
    }
}
