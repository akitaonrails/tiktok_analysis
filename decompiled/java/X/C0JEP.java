package X;

import Y.AObjectS526S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0JEP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JEP extends AbstractC21673619ry<RecyclerView.ViewHolder> implements C0JEN {
    public final C0JEQ LL;
    public final ShortVideoContext LLILLJJLI;
    public final Scene LLILLL;
    public final ChooseMediaViewModel LLILZ;
    public final List<ForwardMedia> LLILZIL;
    public final Function1<Boolean, Unit> LLILZLL;
    public final String LLJ;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final List<OnThisDayTiktokMediaModel> LLIZ = new ArrayList();
    public List<OnThisDayTiktokMediaModel> LLIZLLLIL = new ArrayList();
    public final AObjectS526S0100000_7 LLJI = new AObjectS526S0100000_7(this, 3);
    public final AObjectS526S0100000_7 LLJIJIL = new AObjectS526S0100000_7(this, 2);

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.C0JEN
    public final void LLJJL() {
        boolean z;
        if (((ArrayList) this.LLIZ).size() >= this.LL.LIZ || ((ArrayList) this.LLIZ).size() >= this.LLIZLLLIL.size()) {
            z = false;
            List listLLIIII = C13LP.LLIIII(this.LLIZ);
            int size = listLLIIII.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    LLLII((OnThisDayTiktokMediaModel) ListProtector.get(listLLIIII, size), false);
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
        } else {
            z = true;
            Iterator<OnThisDayTiktokMediaModel> it2 = this.LLIZLLLIL.iterator();
            while (((ArrayList) this.LLIZ).size() < this.LL.LIZ && it2.hasNext()) {
                OnThisDayTiktokMediaModel next = it2.next();
                if (next.selectIndex <= 0) {
                    LLLII(next, true);
                }
            }
        }
        this.LLILZLL.invoke(Boolean.valueOf(((ArrayList) this.LLIZ).size() == LLLFZ()));
        if (z) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            CreativeModel creativeModel = this.LLILLJJLI.creativeModel;
            List<ForwardMedia> list = this.LLILZIL;
            c0ml7.getClass();
            C0ML7.LJIILL(creativeModel, true, false, false, "select_all", list);
        }
    }

    public final int LLLFZ() {
        int i = this.LL.LIZ;
        int size = this.LLIZLLLIL.size();
        return i > size ? size : i;
    }

    public final void LLLIL() {
        if (this.LLIZ.isEmpty()) {
            this.LLILZ.ER2(this.LLJILJILJ, false);
        } else {
            this.LLILZ.ER2(C786410Ut5.j4(this.LLJILJIL, Arrays.copyOf(new Object[]{Integer.valueOf(this.LLIZ.size())}, 1)), true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.LIZJ ? this.LLIZLLLIL.size() + 1 : this.LLIZLLLIL.size();
    }

    @Override // X.C0JEN
    public final List<Object> LJJLIIIJLLLLLLLZ() {
        return this.LLIZLLLIL;
    }

    public final boolean LLLI(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        if (onThisDayTiktokMediaModel.selectIndex <= 0 && ((ArrayList) this.LLIZ).size() >= this.LL.LIZ) {
            return true;
        }
        return false;
    }

    public final int LLLIILIL(List<OnThisDayTiktokMediaModel> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.LLIZLLLIL.size();
        for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : list) {
            this.LLIZLLLIL.add(onThisDayTiktokMediaModel);
            ((ArrayList) this.LLIZ).add(onThisDayTiktokMediaModel);
            onThisDayTiktokMediaModel.selectIndex = ((ArrayList) this.LLIZ).size();
        }
        notifyDataSetChanged();
        LLLIL();
        this.LLILZ.AR2(new ArrayList(this.LLIZLLLIL), true);
        return size;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (!this.LL.LIZJ || i != getItemCount() - 1) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return 1001;
    }

    public final void setData(List<OnThisDayTiktokMediaModel> list) {
        this.LLIZLLLIL = list;
        notifyDataSetChanged();
        this.LLILZ.AR2(C19719512Dh.LIZIZ(list), true);
    }

    public final void LLLII(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, boolean z) {
        if (z && !C530690Krb.LIZJ(onThisDayTiktokMediaModel) && C0L0K.LIZIZ(this.LLILLL.requireSceneContext(), C2471909mP.LJIJ(onThisDayTiktokMediaModel), "on_this_day_page", false, 24)) {
            return;
        }
        if (z) {
            ((ArrayList) this.LLIZ).add(onThisDayTiktokMediaModel);
            onThisDayTiktokMediaModel.selectIndex = ((ArrayList) this.LLIZ).size();
            int i = onThisDayTiktokMediaModel.originIndex;
            if (i != -1) {
                notifyItemChanged(i, "update_select_state");
            }
            this.LLILZ.sR2(onThisDayTiktokMediaModel);
        } else {
            int i2 = onThisDayTiktokMediaModel.selectIndex;
            if (i2 > 0) {
                int size = ((ArrayList) this.LLIZ).size();
                while (i2 < size) {
                    TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LLIZ, i2);
                    tikTokMediaModel.selectIndex--;
                    int i3 = tikTokMediaModel.originIndex;
                    if (i3 != -1) {
                        notifyItemChanged(i3, "update_select_state");
                    }
                    i2++;
                }
                ((ArrayList) this.LLIZ).remove(onThisDayTiktokMediaModel);
                onThisDayTiktokMediaModel.selectIndex = -1;
                int i4 = onThisDayTiktokMediaModel.originIndex;
                if (i4 != -1) {
                    notifyItemChanged(i4, "update_select_state");
                }
            }
            this.LLILZ.tR2(onThisDayTiktokMediaModel);
        }
        this.LLILZ.rR2();
        LLLIL();
        if (z) {
            if (((ArrayList) this.LLIZ).size() == LLLFZ()) {
                this.LLILZLL.invoke(Boolean.TRUE);
                notifyItemRangeChanged(0, getItemCount(), "update_gray_item");
                return;
            }
            return;
        }
        if (((ArrayList) this.LLIZ).size() != LLLFZ() - 1) {
            return;
        }
        this.LLILZLL.invoke(Boolean.FALSE);
        notifyItemRangeChanged(0, getItemCount(), "update_gray_item");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c531290KsZ;
        if (i == 1001) {
            int i2 = C0JEM.LLILLL;
            c531290KsZ = new C0JEM(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cww, viewGroup, false), this.LLILLL.mActivity, this.LLILLJJLI, new AwS551S0100000_7(this, 419));
        } else {
            int i3 = C531290KsZ.LLJILLL;
            c531290KsZ = new C531290KsZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwx, viewGroup, false), new AwS586S0100000_7(this, 271), this.LLJIJIL, false);
        }
        try {
            View view = c531290KsZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c531290KsZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c531290KsZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c531290KsZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c531290KsZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c531290KsZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c531290KsZ.getClass().getName();
        return c531290KsZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        OnThisDayTiktokMediaModel onThisDayTiktokMediaModel;
        if (!(viewHolder instanceof C531290KsZ) || (onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) C13LP.LJJJLZIJ(i, this.LLIZLLLIL)) == null) {
            return;
        }
        onThisDayTiktokMediaModel.originIndex = i;
        ((C531290KsZ) viewHolder).I5(onThisDayTiktokMediaModel, list, LLLI(onThisDayTiktokMediaModel));
    }

    public final void LLLIIIIL(boolean z, OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, boolean z2, boolean z3) {
        LLLII(onThisDayTiktokMediaModel, z);
        if (z) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            CreativeModel creativeModel = this.LLILLJJLI.creativeModel;
            String str = onThisDayTiktokMediaModel.selectType;
            List<ForwardMedia> list = this.LLILZIL;
            c0ml7.getClass();
            C0ML7.LJIILL(creativeModel, false, z2, z3, str, list);
        }
    }

    public C0JEP(C0JEQ c0jeq, ShortVideoContext shortVideoContext, Scene scene, ChooseMediaViewModel chooseMediaViewModel, List list, AwS586S0100000_7 awS586S0100000_7) {
        this.LL = c0jeq;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = scene;
        this.LLILZ = chooseMediaViewModel;
        this.LLILZIL = list;
        this.LLILZLL = awS586S0100000_7;
        this.LLJ = C786410Ut5.j4(scene.requireSceneContext().getString(c0jeq.LIZIZ), Arrays.copyOf(new Object[]{Integer.valueOf(c0jeq.LIZ)}, 1));
        this.LLJILJIL = scene.requireSceneContext().getResources().getString(c0jeq.LJFF);
        this.LLJILJILJ = scene.requireSceneContext().getResources().getString(c0jeq.LJ);
        BaseJediViewModel.iR2(chooseMediaViewModel, scene, new C2217381BqS() { // from class: X.0KfV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getSelectMediaState();
            }
        }, new AwS586S0100000_7(this, 543));
        BaseJediViewModel.iR2(chooseMediaViewModel, scene, new C2217381BqS() { // from class: X.0KfY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getUnSelectMediaState();
            }
        }, new AwS586S0100000_7(this, 544));
        LLLIL();
    }
}
