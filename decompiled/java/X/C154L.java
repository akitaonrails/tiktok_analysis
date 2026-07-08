package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C154L extends C154N {
    public final MusicThemeTag LLJJI;
    public final C154J LLJJIII;

    @Override // X.C154N
    public final void LJIILL() {
        C155H c155hLJIIJJI;
        AbstractC204621154x abstractC204621154xLJIILJJIL;
        C155W c155wLJIIL = LJIIL();
        if (c155wLJIIL == null || (c155hLJIIJJI = LJIIJJI()) == null || (abstractC204621154xLJIILJJIL = LJIILJJIL()) == null) {
            return;
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.LLILLJJLI, 1);
        C155N c155n = new C155N(c155hLJIIJJI, EnumC1654750tA9.TAB_COLLECT, abstractC204621154xLJIILJJIL, c155wLJIIL, this, this.LLJJI);
        C129L c129l = new C129L(this.LL, c155n, c155wLJIIL.zt(), c155hLJIIJJI.LIZ, new AwS575S0100000_31(c155hLJIIJJI, 1312));
        c129l.LLLIL(new InterfaceC19413110xF() { // from class: X.154K
            @Override // X.InterfaceC19413110xF
            public final void LJJIFFI() {
                C154L c154l = this.LIZ;
                if (c154l.LLJJIII.LIZLLL) {
                    c154l.LJJIIJZLJL();
                }
            }
        });
        this.LLJI = c129l;
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            c425240Glu.setLayoutManager(wrapLinearLayoutManager);
        }
        C425240Glu c425240Glu2 = this.LLJ;
        if (c425240Glu2 != null) {
            c425240Glu2.setAdapter(c129l);
        }
        C425240Glu c425240Glu3 = this.LLJ;
        if (c425240Glu3 != null) {
            c425240Glu3.addItemDecoration(new C115Z(this.LLILLJJLI, 0));
        }
        c155n.LJI = c129l;
    }

    @Override // X.C154N
    public final void LJIJJ() {
        C154M.LIZ = "-1";
        C154M.LIZIZ = 0;
        C129L c129l = this.LLJI;
        if (c129l != null) {
            c129l.LLLIILIL(-1);
        }
    }

    public final void LJJIII() {
        C129L c129l;
        C154J c154j = this.LLJJIII;
        if (!c154j.LJFF) {
            LJJIIJ();
            return;
        }
        if (!Intrinsics.LJFF(c154j.LJI, Boolean.TRUE)) {
            LJJI();
        } else if (this.LLJJIII.LIZ.isEmpty()) {
            LJJ();
        } else {
            this.LLJILJILJ.clear();
            this.LLJILJILJ.addAll(this.LLJJIII.LIZ);
            C129L c129l2 = this.LLJI;
            if (c129l2 != null) {
                c129l2.setData(this.LLJJIII.LIZ);
            }
            if (!this.LLJJIII.LIZLLL && (c129l = this.LLJI) != null) {
                c129l.setShowFooter(false);
            }
            LJIL();
        }
        this.LLJILJIL = true;
    }

    @Override // X.C154N
    public final void LJIJI() {
        C155P c155p;
        String str;
        C155H c155hLJIIJJI = LJIIJJI();
        if (c155hLJIIJJI != null && (c155p = c155hLJIIJJI.LJIILIIL) != null) {
            MusicThemeTag musicThemeTag = this.LLJJI;
            if (musicThemeTag == null || (str = musicThemeTag.key) == null) {
                str = "";
            }
            c155p.LJIIJJI(str);
        }
        if (!this.LLJILJIL) {
            LJJIII();
            return;
        }
        C129L c129l = this.LLJI;
        if (c129l != null) {
            c129l.notifyDataSetChanged();
        }
    }

    public void LJJIIJ() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        IMusicRequestParam iMusicRequestParamLJIILIIL = LJIILIIL();
        if (iMusicRequestParamLJIILIIL != null) {
            int soundPageScene = iMusicRequestParamLJIILIIL.getSoundPageScene();
            AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
            if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154I(soundPageScene, this, null), 3);
        }
    }

    public void LJJIIJZLJL() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        IMusicRequestParam iMusicRequestParamLJIILIIL = LJIILIIL();
        if (iMusicRequestParamLJIILIIL != null) {
            int soundPageScene = iMusicRequestParamLJIILIIL.getSoundPageScene();
            AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
            if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154F(soundPageScene, this, null), 3);
        }
    }

    @Override // X.C154N
    public final void LJIJJLI() {
        LJJIIJ();
    }

    public C154L(C1DRG c1drg, Context context, MusicThemeTag musicThemeTag, C154J c154j) {
        super(context, c1drg);
        this.LLJJI = musicThemeTag;
        this.LLJJIII = c154j;
    }
}
