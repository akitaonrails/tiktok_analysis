package X;

import Y.ACListenerS155S0100000_21;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399230mW1 extends RecyclerView.ViewHolder implements C0Z37<C112400bi>, InterfaceC1508640pMU {
    public final View LL;
    public final ImageView LLILLJJLI;
    public final SmartImageView LLILLL;
    public C112400bi LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "";
    }

    public final IAILiveService I5() {
        return (IAILiveService) this.LLILZLL.getValue();
    }

    public C1399230mW1(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.e1y);
        this.LLILLL = (SmartImageView) view.findViewById(R.id.f58);
        view.findViewById(R.id.yle);
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1442));
        this.LLILZLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(449));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        this.LLILZ = (C112400bi) interfaceC1891350zJl;
        C786410Ut5.Q7(this.LLILLJJLI, new ACListenerS155S0100000_21(this, 232));
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 233), this.LL);
        SmartImageView smartImageView = this.LLILLL;
        smartImageView.setClipToOutline(true);
        smartImageView.setOutlineProvider(new C0ID9(25));
        C1331670kl3 c1331670kl3 = new C1331670kl3(I5().getAILivePhotoEntranceDynamicCoverUrl());
        c1331670kl3.LJIILL = (Drawable) this.LLILZIL.getValue();
        c1331670kl3.LJIJ = (Drawable) this.LLILZIL.getValue();
        c1331670kl3.LIZLLL = true;
        smartImageView.LIZ(c1331670kl3.LIZJ());
    }
}
