package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20449314zz implements InterfaceC379610EuV, InterfaceC204601154d {
    public final C1DRG LL;
    public final Context LLILLJJLI;
    public final List<MusicThemeTag> LLILLL;
    public final C154J LLILZ;
    public final C154W LLILZIL;
    public C1203130hPj LLILZLL;
    public C20632315oP LLIZ;
    public C154N LLJI;
    public final List<C154N> LLIZLLLIL = new ArrayList();
    public final List<C1203140hPk> LLJ = new ArrayList();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1311));

    @Override // X.InterfaceC204601154d
    public final void LIZ() {
    }

    @Override // X.InterfaceC204601154d
    public final void LIZLLL() {
        C154N c154n = this.LLJI;
        if (c154n != null) {
            c154n.LJIJI();
        }
    }

    @Override // X.InterfaceC204601154d
    public final C129G LJ() {
        C154N c154n = this.LLJI;
        if (c154n != null) {
            return c154n.LLJI;
        }
        return null;
    }

    @Override // X.InterfaceC204601154d
    public final boolean LJII() {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            if (((C154N) it2.next()).LJIIZILJ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC204601154d
    public final View LJIIIIZZ() {
        return (View) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC204601154d
    public final void LJJLIIIIJ() {
        C129L c129l;
        for (C154N c154n : (ArrayList) this.LLIZLLLIL) {
            if (c154n instanceof C154Q) {
                C154Q c154q = (C154Q) c154n;
                if (Intrinsics.LJFF(c154q.LLJJIII.LJ, Boolean.TRUE) && (!((ArrayList) c154q.LLJJIII.LIZ).isEmpty()) && (c129l = c154q.LLJI) != null) {
                    c129l.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC204601154d
    public final boolean LIZIZ(String str) {
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            if (((C154N) it2.next()).LJIILLIIL(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC204601154d
    public final void LJI(boolean z) {
        C154N c154n = this.LLJI;
        if (c154n != null) {
            c154n.LJIJ(z);
        }
    }

    @Override // X.InterfaceC204601154d
    public final void LIZJ(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        boolean z2;
        for (C154N c154n : (ArrayList) this.LLIZLLLIL) {
            if (z && Intrinsics.LJFF(c154n, this.LLJI)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c154n.LJJII(musicModel, collectionType, z2);
        }
    }

    public C20449314zz(C1DRG c1drg, Context context, List<MusicThemeTag> list, C154J c154j, C154W c154w) {
        this.LL = c1drg;
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = c154j;
        this.LLILZIL = c154w;
    }
}
