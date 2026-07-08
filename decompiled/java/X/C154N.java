package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C154N implements InterfaceC379610EuV, InterfaceC1867560yhO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final Context LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public View LLILZLL;
    public C1749280vcc LLIZ;
    public C1630570sX9 LLIZLLLIL;
    public C425240Glu LLJ;
    public C129L LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final CopyOnWriteArrayList<MusicModel> LLJILJILJ = new CopyOnWriteArrayList<>();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1314));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C154N.class, "initParams", "getInitParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C154N.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C154N.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public abstract void LJIILL();

    public void LJIJ(boolean z) {
    }

    public void LJIJI() {
    }

    public void LJIJJ() {
    }

    public void LJIJJLI() {
    }

    public final C155H LJIIJJI() {
        return (C155H) this.LLILLL.getValue(this, LLJJ[0]);
    }

    public final C155W LJIIL() {
        return (C155W) this.LLILZIL.getValue(this, LLJJ[2]);
    }

    public final AbstractC204621154x LJIILJJIL() {
        return (AbstractC204621154x) this.LLILZ.getValue(this, LLJJ[1]);
    }

    public boolean LJIIZILJ() {
        List data;
        C129L c129l = this.LLJI;
        if (c129l == null || (data = c129l.getData()) == null) {
            data = C13BV.INSTANCE;
        }
        if (this.LLJILJILJ.size() != data.size()) {
            return true;
        }
        int size = this.LLJILJILJ.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(this.LLJILJILJ.get(i).getMusicId(), ((MusicModel) ListProtector.get(data, i)).getMusicId())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIL() {
        View view = this.LLILZLL;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc != null) {
            C337180DJs.LIZ(c1749280vcc);
        }
        C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
        if (c1630570sX9 != null) {
            C337180DJs.LIZ(c1630570sX9);
        }
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            C337180DJs.LIZJ(c425240Glu);
        }
    }

    public final void LJJ() {
        View view = this.LLILZLL;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
        if (c1630570sX9 != null) {
            C337180DJs.LIZ(c1630570sX9);
        }
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            C337180DJs.LIZ(c425240Glu);
        }
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJFF = 2131838196;
            c1722300uv6.LJII = 2131838195;
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc2 = this.LLIZ;
        if (c1749280vcc2 != null) {
            C337180DJs.LIZJ(c1749280vcc2);
        }
    }

    public final void LJJI() {
        View view = this.LLILZLL;
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            C337180DJs.LIZ(c425240Glu);
        }
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc != null) {
            C337180DJs.LIZ(c1749280vcc);
        }
        C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
        if (c1630570sX9 != null) {
            C337180DJs.LIZJ(c1630570sX9);
        }
    }

    public final void LJJIFFI() {
        C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
        if (c1630570sX9 != null) {
            C337180DJs.LIZ(c1630570sX9);
        }
        C1749280vcc c1749280vcc = this.LLIZ;
        if (c1749280vcc != null) {
            C337180DJs.LIZ(c1749280vcc);
        }
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            C337180DJs.LIZ(c425240Glu);
        }
        View view = this.LLILZLL;
        if (view != null) {
            C337180DJs.LIZJ(view);
        }
    }

    public final IMusicRequestParam LJIILIIL() {
        Function0<IMusicRequestParam> function0;
        C155H c155hLJIIJJI = LJIIJJI();
        if (c155hLJIIJJI == null || (function0 = c155hLJIIJJI.LIZJ) == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public void LJIIJ(View view) {
        ViewGroup viewGroup;
        C03BJ c03bj = new C03BJ(this.LLILLJJLI, null, 6);
        c03bj.setOrientation(1);
        this.LLILZLL = c03bj;
        if (c03bj.getParent() == null && (view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(c03bj, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final boolean LJIILLIIL(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Iterator<MusicModel> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getMusicId(), str)) {
                return true;
            }
        }
        return false;
    }

    public C154N(Context context, C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = context;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C155H.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, AbstractC204621154x.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C155W.class, null);
    }

    @Override // X.InterfaceC1867560yhO
    public void LJFF(MusicModel musicModel, boolean z) {
        if (z) {
            CopyOnWriteArrayList<MusicModel> copyOnWriteArrayList = this.LLJILJILJ;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<MusicModel> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getMusicId(), musicModel.getMusicId())) {
                        return;
                    }
                }
            }
            CopyOnWriteArrayList<MusicModel> copyOnWriteArrayList2 = this.LLJILJILJ;
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
            copyOnWriteArrayList2.add(musicModel);
            return;
        }
        CopyOnWriteArrayList<MusicModel> copyOnWriteArrayList3 = this.LLJILJILJ;
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel2 : copyOnWriteArrayList3) {
            if (Intrinsics.LJFF(musicModel2.getMusicId(), musicModel.getMusicId())) {
                arrayList.add(musicModel2);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.LLJILJILJ.remove(it3.next());
        }
    }

    @Override // X.InterfaceC1867560yhO
    public final void LJIIIZ(boolean z, List<? extends MusicModel> list, MusicModel musicModel) {
        if (z) {
            int i = 0;
            for (MusicModel musicModel2 : this.LLJILJILJ) {
                if (musicModel2.getMusicId() != null && Intrinsics.LJFF(musicModel2.getMusicId(), musicModel.getMusicId())) {
                    if (i >= 0 && this.LLJILJILJ.size() > i) {
                        try {
                            this.LLJILJILJ.addAll(i + 1, list);
                            return;
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C201955140j.LJIIJ(C201962140q.LIZIZ, "newcollect updateSimilarMusic IndexOutOfBoundsException", e);
                            return;
                        }
                    }
                    return;
                }
                i++;
            }
            return;
        }
        this.LLJILJILJ.removeAll(list);
    }

    public void LJJII(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        List<MusicModel> data;
        IMusicRequestParam iMusicRequestParamLJIILIIL;
        C129L c129l = this.LLJI;
        if (c129l != null && (data = c129l.getData()) != null) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            for (MusicModel musicModel2 : data) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (Intrinsics.LJFF(musicModel.getMusicId(), musicModel2.getMusicId())) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i2 == -1) {
                if (collectionType == MusicModel.CollectionType.COLLECTED) {
                    if (data.size() > 0 && (iMusicRequestParamLJIILIIL = LJIILIIL()) != null && iMusicRequestParamLJIILIIL.getUnlimitedOnly()) {
                        i = 1;
                    }
                    musicModel.setCollectionType(collectionType);
                    ListProtector.add(data, i, musicModel);
                }
            } else if (collectionType == MusicModel.CollectionType.NOT_COLLECTED) {
                if (!z) {
                    ListProtector.remove(data, i2);
                } else {
                    ((MusicModel) ListProtector.get(data, i2)).setCollectionType(collectionType);
                }
            }
            C129L c129l2 = this.LLJI;
            if (c129l2 != null) {
                c129l2.notifyDataSetChanged();
            }
        }
    }
}
