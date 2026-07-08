package X;

import Y.ACListenerS142S0100000_7;
import Y.AObjectS526S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J19, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J19 extends C1A6D<Object, C0J1A> implements C0JEN {
    public static final C0J1G LLJ = new AbstractC339510DSr<Object>() { // from class: X.0J1G
        @Override // X.AbstractC339510DSr
        public final boolean LIZ(Object obj, Object obj2) {
            if ((obj instanceof C0J1F) && (obj2 instanceof C0J1F)) {
                C0J1F c0j1f = (C0J1F) obj;
                C0J1F c0j1f2 = (C0J1F) obj2;
                if (Intrinsics.LJFF(c0j1f.LIZIZ, c0j1f2.LIZIZ) && c0j1f.LIZJ == c0j1f2.LIZJ) {
                    return true;
                }
                return false;
            }
            if ((obj instanceof OnThisDayTiktokMediaModel) && (obj2 instanceof OnThisDayTiktokMediaModel)) {
                TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
                TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) obj2;
                if (tikTokMediaModel.selectIndex == tikTokMediaModel2.selectIndex && Intrinsics.LJFF(tikTokMediaModel.thumbnail, tikTokMediaModel2.thumbnail) && tikTokMediaModel.duration == tikTokMediaModel2.duration) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // X.AbstractC339510DSr
        public final boolean LIZIZ(Object obj, Object obj2) {
            if ((obj instanceof C0J1F) && (obj2 instanceof C0J1F)) {
                return Intrinsics.LJFF(((C0J1F) obj).LIZ, ((C0J1F) obj2).LIZ);
            }
            if ((obj instanceof OnThisDayTiktokMediaModel) && (obj2 instanceof OnThisDayTiktokMediaModel)) {
                return Intrinsics.LJFF(((MediaModel) obj).id, ((MediaModel) obj2).id);
            }
            return false;
        }

        @Override // X.AbstractC339510DSr
        public final Object LIZJ(Object obj, Object obj2) {
            if ((obj instanceof OnThisDayTiktokMediaModel) && (obj2 instanceof OnThisDayTiktokMediaModel) && ((TikTokMediaModel) obj).selectIndex != ((TikTokMediaModel) obj2).selectIndex) {
                return "update_select_state";
            }
            return null;
        }
    };
    public final CombinedMaterialListViewModel LLILLJJLI;
    public final C0J1E LLILLL;
    public final Function2<OnThisDayTiktokMediaModel, Boolean, Unit> LLILZ;
    public final InterfaceC1631630sYr<Boolean, OnThisDayTiktokMediaModel, Boolean, Boolean, Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public EnumC485010J0h LLIZ;
    public final AObjectS526S0100000_7 LLIZLLLIL;

    @Override // X.C0JEN
    public final void LLJJL() {
    }

    @Override // X.C0JEN
    public final List<Object> LJJLIIIJLLLLLLLZ() {
        C1A6B<T> c1a6b = this.LL;
        C1A6I c1a6i = c1a6b.LJI;
        return (c1a6i == null && (c1a6i = c1a6b.LJFF) == null) ? C13BV.INSTANCE : !c1a6i.LJIILJJIL() ? new C1A6N(c1a6i) : c1a6i;
    }

    @Override // X.C1A6D, X.AbstractC21673619ry
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        EnumC485010J0h enumC485010J0h = this.LLIZ;
        return itemCount + ((enumC485010J0h == null || enumC485010J0h == EnumC485010J0h.SUCCESS) ? 0 : 1);
    }

    public final void LLLIIIIL(EnumC485010J0h enumC485010J0h) {
        boolean z;
        EnumC485010J0h enumC485010J0h2 = this.LLIZ;
        boolean z2 = true;
        if (enumC485010J0h2 != null && enumC485010J0h2 != EnumC485010J0h.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = enumC485010J0h;
        if (enumC485010J0h == null || enumC485010J0h == EnumC485010J0h.SUCCESS) {
            z2 = false;
        }
        if (z != z2) {
            if (z) {
                notifyItemRemoved(super.getItemCount());
                return;
            } else {
                notifyItemInserted(super.getItemCount());
                return;
            }
        }
        if (!z2 || enumC485010J0h2 == enumC485010J0h) {
            return;
        }
        notifyItemChanged(getItemCount() - 1);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC485010J0h enumC485010J0h = this.LLIZ;
        if (enumC485010J0h != null && enumC485010J0h != EnumC485010J0h.SUCCESS && i == getItemCount() - 1) {
            return LivePreCreateNextRoomPlayer.ENABLE;
        }
        int i2 = C0J1A.LL;
        Object objLLLFZ = LLLFZ(i);
        if (!(objLLLFZ instanceof C0J1F) && (objLLLFZ instanceof OnThisDayTiktokMediaModel)) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return 2000;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0J1A c0j1a = (C0J1A) viewHolder;
        if (getItemViewType(i) == 3000) {
            ((C0J13) c0j1a).I5(this.LLIZ);
            return;
        }
        Object objLLLFZ = LLLFZ(i);
        if (objLLLFZ == null) {
            return;
        }
        LLLII(c0j1a, objLLLFZ, new ArrayList());
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ;
        if (i == 3000) {
            int i2 = C0J13.LLILZIL;
            Function0<Unit> function0 = this.LLILZLL;
            LinearLayout linearLayout = (LinearLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d6z, viewGroup, false);
            C1390410mHn c1390410mHn = (C1390410mHn) linearLayout.findViewById(R.id.pyw);
            C786410Ut5.U8((C197039127h) linearLayout.findViewById(R.id.pyx), new ACListenerS142S0100000_7(function0, 143));
            viewHolderLIZ = new C0J13(linearLayout, c1390410mHn);
        } else {
            int i3 = C0J1A.LL;
            viewHolderLIZ = C0J1C.LIZ(viewGroup, i, new AwS586S0100000_7(this, 542), this.LLIZLLLIL);
        }
        try {
            View view = viewHolderLIZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZ.getClass().getName();
        return viewHolderLIZ;
    }

    public final void LLLII(C0J1A c0j1a, Object obj, List<Object> list) {
        if (c0j1a instanceof C0J1B) {
            if (obj instanceof C0J1F) {
                ((C0J1B) c0j1a).LLILLL.setText(((C0J1F) obj).LIZIZ);
            }
        } else {
            if (!(c0j1a instanceof C531290KsZ) || !(obj instanceof OnThisDayTiktokMediaModel)) {
                return;
            }
            int iIndexOf = ((ArrayList) this.LLILLJJLI.LLJ).indexOf(obj);
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) obj;
            onThisDayTiktokMediaModel.originIndex = iIndexOf;
            ((C531290KsZ) c0j1a).I5(onThisDayTiktokMediaModel, list, this.LLILLL.LIZJ(onThisDayTiktokMediaModel));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C0J1A c0j1a = (C0J1A) viewHolder;
        if (getItemViewType(i) == 3000) {
            ((C0J13) c0j1a).I5(this.LLIZ);
            return;
        }
        Object objLLLFZ = LLLFZ(i);
        if (objLLLFZ == null) {
            return;
        }
        LLLII(c0j1a, objLLLFZ, list);
    }

    public C0J19(CombinedMaterialListViewModel combinedMaterialListViewModel, C0JES c0jes, AObjectS526S0100000_7 aObjectS526S0100000_7, C0JEG c0jeg, AwS551S0100000_7 awS551S0100000_7) {
        super(LLJ);
        this.LLILLJJLI = combinedMaterialListViewModel;
        this.LLILLL = c0jes;
        this.LLILZ = aObjectS526S0100000_7;
        this.LLILZIL = c0jeg;
        this.LLILZLL = awS551S0100000_7;
        this.LLIZLLLIL = new AObjectS526S0100000_7(this, 5);
    }
}
