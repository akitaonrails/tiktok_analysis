package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixLiveAutoPlaySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885170z9n extends RecyclerView.ViewHolder {
    public final View LL;
    public int LLILLJJLI;
    public final C01GW LLILLL;
    public final FrameLayout LLILZ;
    public final ImageView LLILZIL;
    public final TextView LLILZLL;
    public final ImageView LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;
    public final View LLJI;
    public final TuxIconView LLJIJIL;
    public final View LLJILJIL;
    public final View LLJILJILJ;
    public final View LLJILLL;
    public final /* synthetic */ C1885160z9m LLJJ;

    public final InterfaceC1885180z9o I5() {
        return (InterfaceC1885180z9o) this.LLILLL.getValue();
    }

    public final void L5() {
        C1885170z9n c1885170z9n;
        InterfaceC1885180z9o interfaceC1885180z9oI5;
        FrameLayout frameLayout;
        InterfaceC1885180z9o interfaceC1885180z9oI52;
        InterfaceC1885180z9o interfaceC1885180z9oI53;
        InterfaceC1885180z9o interfaceC1885180z9oI54;
        C1885170z9n c1885170z9n2;
        if (GameLivePartnershipMixLiveAutoPlaySetting.INSTANCE.getLiveAutoPlay()) {
            C1885170z9n c1885170z9n3 = this.LLJJ.LLILLJJLI;
            if (c1885170z9n3 == null || (interfaceC1885180z9oI54 = c1885170z9n3.I5()) == null || !interfaceC1885180z9oI54.isPlaying() || (c1885170z9n2 = this.LLJJ.LLILLJJLI) == null || c1885170z9n2.LLILLJJLI != this.LLILLJJLI) {
                Room room = (Room) C13LP.LJJJLZIJ(this.LLILLJJLI, this.LLJJ.LLILZ.LLJJJ);
                if (room == null) {
                    return;
                }
                if (this.LLILZ != null && (interfaceC1885180z9oI53 = I5()) != null) {
                    interfaceC1885180z9oI53.LJ(getAbsoluteAdapterPosition(), room);
                }
                if (this.LLJJ.LLILZ.LLJZIJLIL && (frameLayout = this.LLILZ) != null && (interfaceC1885180z9oI52 = I5()) != null) {
                    interfaceC1885180z9oI52.LIZLLL(frameLayout);
                }
                InterfaceC1885180z9o interfaceC1885180z9oI55 = I5();
                if (interfaceC1885180z9oI55 != null) {
                    interfaceC1885180z9oI55.LIZ(InterfaceC1106030et7.v4.LIZIZ().booleanValue());
                }
                if (!Intrinsics.LJFF(this.LLJJ.LLILLJJLI, this) && (c1885170z9n = this.LLJJ.LLILLJJLI) != null && (interfaceC1885180z9oI5 = c1885170z9n.I5()) != null) {
                    interfaceC1885180z9oI5.LIZIZ();
                }
                this.LLJJ.LLILLJJLI = this;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885170z9n(C1885160z9m c1885160z9m, View view) {
        super(view);
        this.LLJJ = c1885160z9m;
        this.LL = view;
        this.LLILLJJLI = -1;
        this.LLILLL = C452501pT.LIZIZ(new C1885190z9p(c1885160z9m));
        this.LLILZ = (FrameLayout) view.findViewById(R.id.n3x);
        this.LLILZIL = (ImageView) view.findViewById(R.id.ir4);
        this.LLILZLL = (TextView) view.findViewById(R.id.zgf);
        this.LLIZ = (ImageView) view.findViewById(R.id.l8e);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.z9o);
        this.LLJ = (TextView) view.findViewById(R.id.n9_);
        this.LLJI = view.findViewById(R.id.irg);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.n0q);
        this.LLJILJIL = view.findViewById(R.id.ir6);
        this.LLJILJILJ = view.findViewById(R.id.iry);
        this.LLJILLL = view.findViewById(R.id.tjf);
    }
}
