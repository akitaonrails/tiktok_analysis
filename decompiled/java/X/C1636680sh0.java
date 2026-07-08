package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636680sh0 extends C1636160sgA {
    public final ShortVideoContext LLJIJIL;
    public final InterfaceC1631620sYq<Effect, Integer, Integer, Unit> LLJILJIL;
    public final C1698050uHz LLJILJILJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1636160sgA, android.view.View.OnClickListener
    public final void onClick(View view) {
        Effect effect = (Effect) this.LL;
        if (effect == null || -1 == getAdapterPosition()) {
            return;
        }
        if (!C1446840nko.LJ(effect)) {
            super.onClick(view);
        }
        if (C1656550tD3.LIZ()) {
            super.onClick(view);
        } else {
            this.LLJILJILJ.onClick(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1636680sh0(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi, ShortVideoContext shortVideoContext, InterfaceC1631620sYq<? super Effect, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq) {
        super(view, c1662850tND, interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1631540sYi);
        this.LLJIJIL = shortVideoContext;
        this.LLJILJIL = interfaceC1631620sYq;
        this.LLJILJILJ = new C1698050uHz(this, interfaceC1624480sNK, 1);
    }
}
