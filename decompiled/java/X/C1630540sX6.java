package X;

import Y.ARunnableS106S0100000_6;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630540sX6 extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC1625960sPi {
    public List<Effect> LL = new ArrayList();
    public InterfaceC1625220sOW LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final InterfaceC1635560sfC LLILZLL;
    public final InterfaceC1624480sNK LLIZ;
    public final InterfaceC1631540sYi<Effect> LLIZLLLIL;
    public final C1641120soA LLJ;
    public final CreativeModel LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<Effect> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj;
        if (i >= 0 && i < getItemCount()) {
            obj = ListProtector.get(this.LL, i);
        } else {
            obj = null;
        }
        Pair<EnumC1641420soe, Integer> pairNl0 = this.LLIZLLLIL.Nl0((Effect) obj, false);
        ((C1636260sgK) viewHolder).I5(obj, pairNl0.getFirst(), pairNl0.getSecond(), i, -1);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Pair pairLIZ = C1641100so8.LIZ(this.LLJ, viewGroup.getContext(), 54.0f, 54.0f, -2.0f, -2.0f, -2.0f, 58.0f, null, 384);
        AbstractViewOnClickListenerC1636290sgN abstractViewOnClickListenerC1636290sgN = new AbstractViewOnClickListenerC1636290sgN((View) pairLIZ.getFirst(), (C1662850tND) pairLIZ.getSecond(), this.LLIZ, this.LLILZLL, this.LLIZLLLIL, this.LLILLL) { // from class: X.0sgB
            public final InterfaceC1635560sfC LLJI;
            public final int LLJIJIL;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DATA data = this.LL;
                if (data == 0) {
                    return;
                }
                int adapterPosition = getAdapterPosition();
                int i2 = -1;
                if (-1 == adapterPosition) {
                    return;
                }
                C1448480nnS c1448480nnS = (C1448480nnS) this.LLILZLL.LJII().LJIILL().getValue();
                if (c1448480nnS != null) {
                    i2 = c1448480nnS.LIZ;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("order", adapterPosition + 1);
                this.LLIZ.ax0(new C1629840sVy<>(data, this.LLJIJIL, i2, true, true, bundle, null, null, null, 896));
            }

            @Override // X.C1636260sgK
            public final void L5(int i2, Object obj) {
                String str;
                Effect effect = (Effect) obj;
                C1662850tND c1662850tND = this.LLILZIL;
                List<String> urlList = effect.getIconUrl().getUrlList();
                if (urlList != null) {
                    str = (String) C13LP.LJJJLL(urlList);
                } else {
                    str = null;
                }
                C1637440siE.LIZ(c1662850tND, effect, str, null, null);
                this.LLJI.LIZ(effect, new IIsTagNeedUpdatedListener() { // from class: X.0sgH
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                    public final void onTagNeedNotUpdate() {
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                    public final void onTagNeedUpdate() {
                    }
                });
                InterfaceC1625960sPi interfaceC1625960sPi = this.LLIZLLLIL;
                if (interfaceC1625960sPi != null && interfaceC1625960sPi.LLIIIL(this.LLILLJJLI, i2, effect)) {
                    HandlerHook.viewPost(this.itemView, new ARunnableS106S0100000_6(this, 134));
                }
            }

            @Override // X.AbstractViewOnClickListenerC1636290sgN, X.C1636260sgK
            public final /* bridge */ /* synthetic */ void N5(int i2, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
                N5((Effect) obj, enumC1641420soe, num, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractViewOnClickListenerC1636290sgN
            /* JADX INFO: renamed from: T5 */
            public final void N5(Effect effect, EnumC1641420soe enumC1641420soe, Integer num, int i2) {
                String effectId;
                String effectId2 = effect.getEffectId();
                Effect effect2 = (Effect) this.LL;
                if (effect2 != null) {
                    effectId = effect2.getEffectId();
                } else {
                    effectId = null;
                }
                if (!Intrinsics.LJFF(effectId2, effectId)) {
                    return;
                }
                V5(enumC1641420soe, num);
                if (C1625940sPg.LJIIJJI(this.LLILZLL, effect)) {
                    U5(true);
                } else {
                    U5(false);
                }
            }

            {
                this.LLJI = interfaceC1635560sfC;
                this.LLJIJIL = i;
            }
        };
        abstractViewOnClickListenerC1636290sgN.LLIZLLLIL = this;
        try {
            View view = abstractViewOnClickListenerC1636290sgN.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractViewOnClickListenerC1636290sgN.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (abstractViewOnClickListenerC1636290sgN.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1636170sgB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) abstractViewOnClickListenerC1636290sgN.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(abstractViewOnClickListenerC1636290sgN.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1636170sgB.class.getName();
        return abstractViewOnClickListenerC1636290sgN;
    }

    @Override // X.InterfaceC1625960sPi
    public final boolean LLIIIL(int i, int i2, Effect effect) {
        int i3 = this.LLILZ;
        boolean z = false;
        if (i3 >= 0 && C1624570sNT.LJJIFFI((Effect) ListProtector.get(this.LL, i3))) {
            boolean z2 = !C1624570sNT.LJJIFFI((Effect) ListProtector.get(this.LL, i2));
            if (this.LLILZIL || !z2) {
                return false;
            }
            this.LLILZIL = true;
            return true;
        }
        if (this.LLILZ == i2) {
            z = true;
        }
        if (!this.LLILZIL && z) {
            this.LLILZIL = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [DATA, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        ?? LJJJLL = C13LP.LJJJLL(list);
        if (LJJJLL instanceof Effect) {
            Pair<EnumC1641420soe, Integer> pairNl0 = this.LLIZLLLIL.Nl0(LJJJLL, false);
            C1636260sgK c1636260sgK = (C1636260sgK) viewHolder;
            EnumC1641420soe first = pairNl0.getFirst();
            Integer second = pairNl0.getSecond();
            c1636260sgK.LL = LJJJLL;
            c1636260sgK.N5(c1636260sgK.getPosition(), first, second, LJJJLL);
            return;
        }
        if (LJJJLL instanceof Boolean) {
            ((C1636260sgK) viewHolder).S5(((Boolean) LJJJLL).booleanValue());
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }

    public C1630540sX6(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1629870sW1 interfaceC1629870sW1, C1641120soA c1641120soA, CreativeModel creativeModel) {
        this.LLIZ = interfaceC1624480sNK;
        this.LLIZLLLIL = interfaceC1629870sW1;
        this.LLILZLL = interfaceC1635560sfC;
        this.LLJ = c1641120soA;
        this.LLJI = creativeModel;
    }
}
