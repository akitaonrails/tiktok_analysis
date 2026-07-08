package X;

import Y.ACListenerS50S0201000_25;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0sX2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630500sX2 extends AbstractC21673619ry<C1630560sX8> {
    public final Function2<Integer, InterfaceC1626470sQX, Unit> LL;
    public final Function2<Integer, InterfaceC1626470sQX, Unit> LLILLJJLI;
    public final Function2<C1322110kVd, String, Unit> LLILLL;
    public final Function0<Boolean> LLILZ;
    public int LLIZ;
    public final List<InterfaceC1626470sQX> LLILZIL = new ArrayList();
    public final List<InterfaceC1630520sX4> LLILZLL = new ArrayList();
    public final Map<Integer, Integer> LLIZLLLIL = new LinkedHashMap();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZIL).size() + this.LLIZ;
    }

    public final InterfaceC1626470sQX LLLFZ(int i) {
        if (i >= ((ArrayList) this.LLILZIL).size()) {
            InterfaceC1630520sX4 interfaceC1630520sX4 = (InterfaceC1630520sX4) C13LP.LJJJLZIJ(i - ((ArrayList) this.LLILZIL).size(), this.LLILZLL);
            if (interfaceC1630520sX4 != null) {
                interfaceC1630520sX4.LIZ();
                return C1629810sVv.LIZ;
            }
            return null;
        }
        return (InterfaceC1626470sQX) C13LP.LJJJLZIJ(i, this.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= ((ArrayList) this.LLILZIL).size() && (!this.LLILZLL.isEmpty())) {
            int i2 = i + 1002;
            this.LLIZLLLIL.put(Integer.valueOf(i2), Integer.valueOf(((InterfaceC1630520sX4) ListProtector.get(this.LLILZLL, i - ((ArrayList) this.LLILZIL).size())).layoutRes()));
            return i2;
        }
        return 1001;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(viewHolder.getBindingAdapterPosition(), this.LLILZIL);
        if (objLJJJLZIJ != null) {
            this.LLILLJJLI.invoke(Integer.valueOf(viewHolder.getBindingAdapterPosition()), (InterfaceC1626470sQX) objLJJJLZIJ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        MobileEffect mobileEffect;
        boolean z;
        MobileEffect mobileEffect2;
        C1630560sX8 c1630560sX8 = (C1630560sX8) viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder: position=");
        sbLIZ.append(i);
        C1628270sTR.LIZIZ("CarouselRecyclerViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
        View view = c1630560sX8.itemView;
        C337180DJs.LIZJ(view);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.Jc(view, 0.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (i >= ((ArrayList) this.LLILZIL).size()) {
            final int size = i - ((ArrayList) this.LLILZIL).size();
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0sX3
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        ((InterfaceC1630520sX4) ListProtector.get(this.LLILZ.LLILZLL, size)).getClickListener().invoke(Integer.valueOf(i));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c1630560sX8.itemView);
            c1630560sX8.itemView.setTag(Integer.valueOf(i));
            return;
        }
        InterfaceC1626470sQX interfaceC1626470sQX = (InterfaceC1626470sQX) ListProtector.get(this.LLILZIL, i);
        boolean z2 = true;
        if (interfaceC1626470sQX instanceof InterfaceC1627120sRa) {
            C786410Ut5.LLZZLLIL((C1322110kVd) c1630560sX8.LLILLJJLI.getValue(), 0);
            Object objLJJJLL = C13LP.LJJJLL(C1629110sUn.LIZ(interfaceC1626470sQX).getIconUrl().getUrlList());
            if (objLJJJLL != null) {
                c1630560sX8.LLILZLL.LLILLL.invoke((C1322110kVd) c1630560sX8.LLILLJJLI.getValue(), (String) objLJJJLL);
            }
            if (C097T.LIZ() && C1656550tD3.LIZIZ()) {
                MutableLiveData<Boolean> mutableLiveData = c1630560sX8.LLILZ;
                Effect effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQX);
                C01GW c01gw = C342540Dbo.LIZ;
                if (C1656550tD3.LIZ() && (effectLIZ instanceof MobileEffect) && (mobileEffect2 = (MobileEffect) effectLIZ) != null && mobileEffect2.getModerationStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData.setValue(Boolean.valueOf(z));
            }
        } else if (interfaceC1626470sQX instanceof C1626260sQC) {
            C786410Ut5.LLZZLLIL((C1322110kVd) c1630560sX8.LLILLJJLI.getValue(), 4);
        } else {
            C786410Ut5.LLZZLLIL((C1322110kVd) c1630560sX8.LLILLJJLI.getValue(), 0);
            ((C1322110kVd) c1630560sX8.LLILLJJLI.getValue()).setActualImageResource(R.color.transparent);
        }
        if (!C097T.LIZ() && C1656550tD3.LIZIZ()) {
            MutableLiveData<Boolean> mutableLiveData2 = c1630560sX8.LLILZ;
            Effect effectLIZ2 = C1629110sUn.LIZ(interfaceC1626470sQX);
            C01GW c01gw2 = C342540Dbo.LIZ;
            if (!C1656550tD3.LIZ() || !(effectLIZ2 instanceof MobileEffect) || (mobileEffect = (MobileEffect) effectLIZ2) == null || mobileEffect.getModerationStatus() != 2) {
                z2 = false;
            }
            mutableLiveData2.setValue(Boolean.valueOf(z2));
        }
        C786410Ut5.I7(new ACListenerS50S0201000_25(i, this, interfaceC1626470sQX, 1), c1630560sX8.itemView);
        c1630560sX8.itemView.setTag(Integer.valueOf(i));
        if (this.LLILZ.invoke().booleanValue()) {
            C786410Ut5.T4(c1630560sX8.itemView, 0.45f);
        } else {
            C786410Ut5.T4(c1630560sX8.itemView, 1.0f);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1630560sX8 c1630560sX8;
        int iIntValue = com.zhiliaoapp.musically.R.layout.acw;
        if (i != 1001) {
            Integer num = (Integer) ((LinkedHashMap) this.LLIZLLLIL).get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            }
            c1630560sX8 = new C1630560sX8(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), iIntValue, viewGroup, false));
        } else {
            c1630560sX8 = new C1630560sX8(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), com.zhiliaoapp.musically.R.layout.acw, viewGroup, false));
        }
        try {
            View view = c1630560sX8.itemView;
            if (view != null) {
                view.setTag(com.zhiliaoapp.musically.R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1630560sX8.itemView.setTag(com.zhiliaoapp.musically.R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1630560sX8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1630560sX8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1630560sX8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1630560sX8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1630560sX8.class.getName();
        return c1630560sX8;
    }

    public C1630500sX2(AwS569S0100000_25 awS569S0100000_25, AwS639S0100000_25 awS639S0100000_25, AwS630S0100000_16 awS630S0100000_16, C1324900ka8 c1324900ka8) {
        this.LL = awS639S0100000_25;
        this.LLILLJJLI = awS630S0100000_16;
        this.LLILLL = c1324900ka8;
        this.LLILZ = awS569S0100000_25;
    }
}
