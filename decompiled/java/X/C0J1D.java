package X;

import Y.AObjectS526S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J1D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1D extends AbstractC21673619ry<C0J1A> implements C0JEN {
    public final CombinedMaterialListViewModel LL;
    public final C0J1E LLILLJJLI;
    public final Function2<OnThisDayTiktokMediaModel, Boolean, Unit> LLILLL;
    public final InterfaceC1631630sYr<Boolean, OnThisDayTiktokMediaModel, Boolean, Boolean, Unit> LLILZ;
    public final AObjectS526S0100000_7 LLILZIL = new AObjectS526S0100000_7(this, 4);
    public final List<Object> LLILZLL = new ArrayList();

    @Override // X.C0JEN
    public final void LLJJL() {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    @Override // X.C0JEN
    public final List<Object> LJJLIIIJLLLLLLLZ() {
        return this.LLILZLL;
    }

    public final int LLLI(List<OnThisDayTiktokMediaModel> list) {
        if (list != null) {
            ((ArrayList) this.LLILZLL).clear();
            C844470XAv.LIZ.getClass();
            String string = C844470XAv.LIZ().getString(R.string.jsn);
            ((ArrayList) this.LLILZLL).add(new C0J1F(Long.MAX_VALUE, string, string));
            ((ArrayList) this.LLILZLL).addAll(list);
            notifyDataSetChanged();
            return 0;
        }
        return 0;
    }

    public final void LLLII(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        String str;
        ForwardMedia forwardMedia;
        Iterator it2 = ((ArrayList) this.LL.LLIZLLLIL).iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ForwardMedia forwardMedia2 = ((OnThisDayTiktokMediaModel) next).forwardMedia;
            if (forwardMedia2 != null) {
                str = forwardMedia2.sourceId;
            } else {
                str = null;
            }
            ForwardMedia forwardMedia3 = onThisDayTiktokMediaModel.forwardMedia;
            if (forwardMedia3 != null) {
                str2 = forwardMedia3.sourceId;
            }
            if (Intrinsics.LJFF(str, str2) && (forwardMedia = onThisDayTiktokMediaModel.forwardMedia) != null && forwardMedia.sourceId != null) {
                if (next != null) {
                    return;
                }
            }
        }
        if (((ArrayList) this.LL.LLIZLLLIL).size() < this.LLILLJJLI.getConfig().LIZ && onThisDayTiktokMediaModel.selectIndex <= 0) {
            InterfaceC1631630sYr<Boolean, OnThisDayTiktokMediaModel, Boolean, Boolean, Unit> interfaceC1631630sYr = this.LLILZ;
            Boolean bool = Boolean.TRUE;
            interfaceC1631630sYr.invoke(bool, onThisDayTiktokMediaModel, bool, Boolean.FALSE);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int i2 = C0J1A.LL;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILZLL);
        if (!(objLJJJLZIJ instanceof C0J1F) && (objLJJJLZIJ instanceof OnThisDayTiktokMediaModel)) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return 2000;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0J1A c0j1a = (C0J1A) viewHolder;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILZLL);
        if (objLJJJLZIJ != null) {
            LLLFZ(c0j1a, objLJJJLZIJ, new ArrayList());
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C0J1A.LL;
        C0J1A c0j1aLIZ = C0J1C.LIZ(viewGroup, i, new AwS586S0100000_7(this, 541), this.LLILZIL);
        try {
            View view = c0j1aLIZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0j1aLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0j1aLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0j1aLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0j1aLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0j1aLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0j1aLIZ.getClass().getName();
        return c0j1aLIZ;
    }

    public final void LLLFZ(C0J1A c0j1a, Object obj, List<Object> list) {
        if (c0j1a instanceof C0J1B) {
            if (obj instanceof C0J1F) {
                ((C0J1B) c0j1a).LLILLL.setText(((C0J1F) obj).LIZIZ);
            }
        } else {
            if (!(c0j1a instanceof C531290KsZ) || !(obj instanceof OnThisDayTiktokMediaModel)) {
                return;
            }
            int iIndexOf = ((ArrayList) this.LL.LLJ).indexOf(obj);
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) obj;
            onThisDayTiktokMediaModel.originIndex = iIndexOf;
            ((C531290KsZ) c0j1a).I5(onThisDayTiktokMediaModel, list, this.LLILLJJLI.LIZJ(onThisDayTiktokMediaModel));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C0J1A c0j1a = (C0J1A) viewHolder;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILZLL);
        if (objLJJJLZIJ != null) {
            LLLFZ(c0j1a, objLJJJLZIJ, list);
        }
    }

    public C0J1D(CombinedMaterialListViewModel combinedMaterialListViewModel, C0JES c0jes, AObjectS526S0100000_7 aObjectS526S0100000_7, C0JEG c0jeg) {
        this.LL = combinedMaterialListViewModel;
        this.LLILLJJLI = c0jes;
        this.LLILLL = aObjectS526S0100000_7;
        this.LLILZ = c0jeg;
    }
}
