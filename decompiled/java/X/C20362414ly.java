package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS150S0201000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20362414ly extends AbstractC960470b6L<C1868330yid> {
    public final InterfaceC19411910x3 LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public PlayRule LLILZLL;
    public boolean LLIZ;
    public final C20362514lz LLIZLLLIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        PlayRule playRule = this.LLILZLL;
        if (playRule != null) {
            playRule.LJJIJIIJIL(this.LLIZLLLIL);
        }
        this.LLILZLL = null;
    }

    public final void L5(C1868330yid c1868330yid) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        float f;
        C20361314ln c20361314ln = c1868330yid.LIZ.LIZJ;
        if (c20361314ln.LJII == EnumC1779270wOz.ATTR) {
            this.LLILLJJLI.setIconAttr(c20361314ln.LIZJ);
        } else {
            this.LLILLJJLI.setIcon(c20361314ln.LIZJ);
        }
        C16F5 c16f5 = this.LLILLL;
        String str = c20361314ln.LIZIZ;
        if (str == null) {
            str = c20361314ln.LIZ;
        }
        c16f5.setText(str);
        int i = c20361314ln.LJI;
        int i2 = 0;
        if (i == 0 && !c1868330yid.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        LiveIconView liveIconView = this.LLILLJJLI;
        if (z) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext());
        } else {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezy, this.itemView.getContext());
        }
        liveIconView.setIconTint(iLIZIZ);
        C16F5 c16f52 = this.LLILLL;
        if (z) {
            iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext());
        } else {
            iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezy, this.itemView.getContext());
        }
        c16f52.setTextColor(iLIZIZ2);
        C16F5 c16f53 = this.LLILZIL;
        if (!c1868330yid.LIZJ) {
            i2 = 8;
        }
        C786410Ut5.LLJJJJ(c16f53, i2);
        View view = this.itemView;
        if (c1868330yid.LIZJ) {
            f = 0.6f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
        C786410Ut5.I7(new ACListenerS131S0200000_29(c1868330yid, this, 61), this.itemView);
        PlayRule playRule = c1868330yid.LIZ.LIZLLL;
        if (playRule == null) {
            return;
        }
        this.LLIZ = c1868330yid.LIZJ;
        N5(playRule.getConfig().LJ, c1868330yid.LIZJ);
        if (!Intrinsics.LJFF(this.LLILZLL, c1868330yid.LIZ.LIZLLL)) {
            PlayRule playRule2 = this.LLILZLL;
            if (playRule2 != null) {
                playRule2.LJJIJIIJIL(this.LLIZLLLIL);
            }
            playRule.LJJIFFI(this.LLIZLLLIL);
            this.LLILZLL = playRule;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.14lz] */
    public C20362414ly(View view, InterfaceC19411910x3 interfaceC19411910x3) {
        super(view);
        this.LL = interfaceC19411910x3;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.ll7);
        this.LLILLL = (C16F5) view.findViewById(R.id.tv_title);
        this.LLILZ = (C16F5) view.findViewById(R.id.zvv);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tv_selected);
        this.LLIZLLLIL = new InterfaceC20357514lB() { // from class: X.14lz
            @Override // X.InterfaceC20357514lB
            public final void LIZ(int i, AbstractC20356314kz abstractC20356314kz) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS150S0201000_31(this.LIZ, abstractC20356314kz, i, 3));
            }
        };
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868330yid) obj);
    }

    public final void N5(int i, boolean z) {
        int i2 = 0;
        if (i == 1 && !z) {
            C786410Ut5.LLJJJJ(this.LLILZ, 0);
            C786410Ut5.LLJJJJ(this.LLILZIL, 8);
            return;
        }
        C786410Ut5.LLJJJJ(this.LLILZ, 8);
        C16F5 c16f5 = this.LLILZIL;
        if (!z) {
            i2 = 8;
        }
        C786410Ut5.LLJJJJ(c16f5, i2);
    }
}
