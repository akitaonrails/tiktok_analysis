package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204615154r extends AbstractC204610154m {
    public final Context LJ;
    public boolean LJI;
    public FrameLayout LJIIIZ;
    public int LJIIJ;
    public final C204657156h LJFF = new C204657156h();
    public final List<TuxTextView> LJII = new ArrayList();
    public final List<C12NP> LJIIIIZZ = new ArrayList();
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1521));

    @Override // X.InterfaceC204626155c
    public final int LLZLLIL() {
        return 2131850780;
    }

    @Override // X.InterfaceC204626155c
    public final boolean LLZLLLL() {
        return false;
    }

    @Override // X.InterfaceC204626155c
    public final String getEnterMethod() {
        return "edit_page_hot";
    }

    @Override // X.InterfaceC204626155c
    public final void z3() {
        this.LJI = false;
    }

    @Override // X.InterfaceC204626155c
    public final AbstractC21673619ry<?> LJJLIIIJL() {
        C12NP c12npLJIIIIZZ = LJIIIIZZ(this.LJIIJ);
        if (c12npLJIIIIZZ != null) {
            return c12npLJIIIIZZ.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC204626155c
    public final View getView() {
        return (View) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC204626155c
    public final EnumC1654750tA9 getTabKey() {
        return EnumC1654750tA9.TAB_HOT;
    }

    public C204615154r(C1361400lX0 c1361400lX0) {
        this.LJ = c1361400lX0;
    }

    public final C12NP LJII(String str) {
        Context context = this.LJ;
        C1DRG c1drg = this.LIZIZ;
        if (c1drg != null) {
            C12NP c12np = new C12NP(str, context, c1drg);
            c12np.LLJ = new AwS575S0100000_31(this, 1520);
            return c12np;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C12NP LJIIIIZZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LJIIIIZZ).size()) {
            return (C12NP) ListProtector.get(this.LJIIIIZZ, i);
        }
        return null;
    }

    public final void LJIIIZ(int i) {
        FrameLayout frameLayout;
        String str;
        String str2;
        String str3;
        List<MusicModel> data;
        C129G c129g;
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        int i2 = 0;
        while (true) {
            int iIntValue = -1;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) next;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    try {
                        gradientDrawable.setCornerRadius(this.LJ.getResources().getDimension(R.dimen.b_));
                    } catch (Resources.NotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    gradientDrawable.setShape(0);
                    if (i == i2) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, this.LJ);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        gradientDrawable.setColor(iIntValue);
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, this.LJ);
                        if (numLIZJ2 != null) {
                            appCompatTextView.setTextColor(numLIZJ2.intValue());
                        }
                    } else {
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, this.LJ);
                        if (numLIZJ3 != null) {
                            iIntValue = numLIZJ3.intValue();
                        }
                        gradientDrawable.setColor(iIntValue);
                        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1j, this.LJ);
                        if (numLIZJ4 != null) {
                            appCompatTextView.setTextColor(numLIZJ4.intValue());
                        }
                    }
                    appCompatTextView.setBackgroundDrawable(gradientDrawable);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                LJIIIIZZ(this.LJIIJ);
                C12NP c12npLJIIIIZZ = LJIIIIZZ(i);
                if (c12npLJIIIIZZ != null) {
                    C129G c129g2 = c12npLJIIIIZZ.LLIZLLLIL;
                    if (c129g2 != null && (data = c129g2.getData()) != null && !data.isEmpty() && (c129g = c12npLJIIIIZZ.LLIZLLLIL) != null) {
                        c129g.notifyDataSetChanged();
                    }
                    c12npLJIIIIZZ.LIZLLL();
                    C0LAB c0lab = new C0LAB();
                    if (c12npLJIIIIZZ.LIZIZ().LJIILJJIL == C00IV.RECORDPAGE) {
                        str3 = "video_shoot_page";
                    } else {
                        str3 = "video_edit_page";
                    }
                    c0lab.LJ("enter_from", str3);
                    c0lab.LJ("chart_region", c12npLJIIIIZZ.LL);
                    C20684815ws.LJIILLIIL("show_hot_tab_chart", c0lab.LIZ);
                }
                if (this.LJIIJ != i) {
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("enter_from", "hot_tab_music_chart");
                    C12NP c12npLJIIIIZZ2 = LJIIIIZZ(this.LJIIJ);
                    if (c12npLJIIIIZZ2 != null) {
                        str = c12npLJIIIIZZ2.LL;
                    } else {
                        str = null;
                    }
                    c0lab2.LJ("prev_chart_region", str);
                    C12NP c12npLJIIIIZZ3 = LJIIIIZZ(i);
                    if (c12npLJIIIIZZ3 != null) {
                        str2 = c12npLJIIIIZZ3.LL;
                    } else {
                        str2 = null;
                    }
                    c0lab2.LJ("chart_region", str2);
                    C20684815ws.LJIILLIIL("click_chart_region_button", c0lab2.LIZ);
                }
                int i4 = 0;
                for (Object obj : (ArrayList) this.LJIIIIZZ) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C12NP c12np = (C12NP) obj;
                        if (i4 == i) {
                            if (c12np.LLJJ.getParent() == null && (frameLayout = this.LJIIIZ) != null) {
                                frameLayout.addView(c12np.LLJJ, new FrameLayout.LayoutParams(-1, -1));
                            }
                            C786410Ut5.LJLLLLLL(0, c12np.LLJJ);
                        } else if (c12np.LLJJ.getParent() != null) {
                            C786410Ut5.LJLLLLLL(8, c12np.LLJJ);
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                this.LJIIJ = i;
                C12NP c12npLJIIIIZZ4 = LJIIIIZZ(i);
                if (c12npLJIIIIZZ4 != null) {
                    RecyclerView recyclerView = c12npLJIIIIZZ4.LLILZIL;
                    C129G c129g3 = c12npLJIIIIZZ4.LLIZLLLIL;
                    if (recyclerView != null && c129g3 != null) {
                        this.LJFF.LIZ(recyclerView, c129g3, new AwS168S0101000_31(this, i, 3), true);
                        C204657156h c204657156h = this.LJFF;
                        if (c204657156h.LIZIZ) {
                            c204657156h.LJI();
                            return;
                        } else {
                            c204657156h.LJII();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC204626155c
    public final void LLZILL(boolean z) {
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        this.LJI = true;
        C155H c155hLIZJ = LIZJ();
        if (c155hLIZJ == null) {
            return;
        }
        c155hLIZJ.LIZ.LIZJ = false;
        C155P c155p = c155hLIZJ.LJIILIIL;
        EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_HOT;
        c155p.LIZLLL(enumC1654750tA9.getStringValue(), z, false);
        if (c155hLIZJ.LJJIJIL == enumC1654750tA9) {
            this.LJIIJJI.getValue();
        }
        LJIIIZ(this.LJIIJ);
        C204657156h c204657156h = this.LJFF;
        if (c204657156h.LIZIZ) {
            c204657156h.LJI();
        } else {
            c204657156h.LJII();
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isInOnThisDayPreviewPage()) {
            onThisDayData.setMusicSelectedFromV2("on_this_day_page_hot_music");
        }
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZLI(MusicModel musicModel, MusicModel.CollectionType collectionType) {
        List<MusicModel> data;
        MusicModel next;
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            C129G c129g = ((C12NP) it2.next()).LLIZLLLIL;
            if (c129g != null && (data = c129g.getData()) != null) {
                Iterator<MusicModel> it3 = data.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.getMusicId(), musicModel.getMusicId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                MusicModel musicModel2 = next;
                if (musicModel2 != null) {
                    musicModel2.setCollectionType(collectionType);
                }
            }
        }
    }
}
