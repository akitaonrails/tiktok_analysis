package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdPhotoCardContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656770PpT implements InterfaceC1011400cQU, InterfaceC1011350cQP {
    public final /* synthetic */ C656760PpS LIZ;
    public final EnumC658790Psj LIZIZ = EnumC658790Psj.NORMAL_CAROUSEL;
    public final /* synthetic */ SearchAdPhotoCardContentAssem LIZJ;

    @Override // X.InterfaceC1011400cQU
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1011350cQP
    public final Function0<Unit> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // X.InterfaceC589020N8i
    public final C622570ObP LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1010250cOd
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup getItemView() {
        return this.LIZ.getItemView();
    }

    @Override // X.InterfaceC1011350cQP
    public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ() {
        return this.LIZ.LIZ;
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup LJFF() {
        return this.LIZ.LIZIZ.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup LJIIJJI() {
        return this.LIZ.LIZIZ.LLJLLIL;
    }

    @Override // X.InterfaceC1010250cOd
    public final Aweme getAweme() {
        return this.LIZ.LIZJ.LLILLJJLI;
    }

    @Override // X.InterfaceC1011400cQU
    public final int LJII() {
        C659080PtC.LJFF();
        return C659080PtC.LIZIZ;
    }

    @Override // X.InterfaceC1011400cQU
    public final boolean LJIIIZ() {
        return C07P0.LIZIZ();
    }

    @Override // X.InterfaceC1011400cQU
    public final boolean isMute() {
        return C659080PtC.LIZIZ();
    }

    @Override // X.InterfaceC1011400cQU
    public final EnumC658790Psj getSubType() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1011400cQU
    public final void LIZJ(boolean z) {
        if (z) {
            this.LIZJ.op(Lifecycle.State.STARTED);
        } else {
            this.LIZJ.op(Lifecycle.State.RESUMED);
        }
    }

    @Override // X.InterfaceC1011400cQU
    public final void LJI(boolean z) {
        C659080PtC.LIZJ(z ? 1 : 0);
    }

    public C656770PpT(C656760PpS c656760PpS, SearchAdPhotoCardContentAssem searchAdPhotoCardContentAssem) {
        this.LIZJ = searchAdPhotoCardContentAssem;
        this.LIZ = c656760PpS;
    }
}
