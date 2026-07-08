package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import duk.p;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1636160sgA extends AbstractViewOnClickListenerC1636290sgN implements InterfaceC1625560sP4 {
    public final boolean LLJI;

    @Override // X.InterfaceC1625560sP4
    public final void m2() {
        this.LLILZIL.LJIILLIIL();
    }

    public final void a6(int i) {
        AbstractViewOnClickListenerC1636290sgN abstractViewOnClickListenerC1636290sgN;
        boolean zBooleanValue;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
        try {
            ViewParent parent = this.itemView.getParent();
            if (parent instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) parent;
                if (recyclerView != null) {
                    AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
                    if (bindingAdapter != null && i < bindingAdapter.getItemCount()) {
                        viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                    }
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof C1636160sgA) && (abstractViewOnClickListenerC1636290sgN = (AbstractViewOnClickListenerC1636290sgN) viewHolderFindViewHolderForAdapterPosition) != null) {
                        C1662850tND c1662850tND = abstractViewOnClickListenerC1636290sgN.LLILZIL;
                        Boolean value = this.LLIZ.LLLIIIL().getValue();
                        if (value != null) {
                            zBooleanValue = value.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        C1637440siE.LJ(c1662850tND, false, zBooleanValue);
                        AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter2 = getBindingAdapter();
                        if (bindingAdapter2 != null) {
                            bindingAdapter2.notifyItemChanged(i);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1636160sgA.onClick(android.view.View):void");
    }

    public static final void c6(RecyclerView recyclerView, int i) {
        AbstractC21673619ry adapter;
        if (i != -1 && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(i);
        }
    }

    @Override // X.C1636260sgK
    /* JADX INFO: renamed from: W5, reason: merged with bridge method [inline-methods] */
    public void L5(int i, Effect effect) {
        p pVarLJJJJIZL;
        String name = effect.getName();
        if (name != null) {
            this.LLILZIL.setText(name);
        }
        if (C2281551ESb.LIZIZ.LJJIJIIJI()) {
            List<String> urlList = effect.getIconUrl().getUrlList();
            if (this.LLILZLL.LJJIJIL() == -1 && this.LLILZLL.LJJJJL() == -1) {
                C1637440siE.LIZLLL(this.LLILZIL, effect, urlList, null, null);
            } else {
                C1637440siE.LIZLLL(this.LLILZIL, effect, urlList, new C1636110sg5(), new C1636090sg3(this.LLILZLL, this.LLILLL));
            }
        } else {
            String str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
            if (str != null) {
                if (this.LLILZLL.LJJIJIL() == -1 && this.LLILZLL.LJJJJL() == -1) {
                    C1637440siE.LIZ(this.LLILZIL, effect, str, null, null);
                } else {
                    C1637440siE.LIZ(this.LLILZIL, effect, str, new C1636110sg5(), new C1636090sg3(this.LLILZLL, this.LLILLL));
                }
            }
        }
        this.itemView.setContentDescription(effect.getName());
        if (C1624570sNT.LJIILLIIL(effect)) {
            this.LLILZIL.getImageView().setPadding((int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f));
        } else {
            this.LLILZIL.getImageView().setPadding(0, 0, 0, 0);
        }
        if (this.LLJI && (pVarLJJJJIZL = this.LLILZLL.LJJJJIZL()) != null && !pVarLJJJJIZL.LJ(effect, null)) {
            C786410Ut5.T4(this.itemView, 0.45f);
        } else {
            C786410Ut5.T4(this.itemView, 1.0f);
        }
    }

    public C1629840sVy X5(int i, Effect effect) {
        String key;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLILZLL;
        EffectCategoryModel effectCategoryModelLJIIIIZZ = C1625940sPg.LJIIIIZZ(interfaceC1624480sNK, this.LLILLJJLI);
        if (effectCategoryModelLJIIIIZZ != null) {
            key = effectCategoryModelLJIIIIZZ.getKey();
        } else {
            key = null;
        }
        int iLIZ = C1629100sUm.LIZ(interfaceC1624480sNK, effect, i, key);
        int i2 = this.LLILLJJLI;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("tab_type", "main_panel", bundle);
        this.LLILZLL.LJJJIL().LIZ = "click_main_panel";
        C786410Ut5.LJJJI("prop_launch_ui_point", "effect_panel", bundle);
        C786410Ut5.LJJJI("enter_method", "click_main_panel", bundle);
        return new C1629840sVy(effect, iLIZ, i2, false, true, bundle, this, null, new AwS569S0100000_25(this, 1169), 280);
    }

    public static final void b6(RecyclerView recyclerView, C1636160sgA c1636160sgA, int i) {
        AbstractViewOnClickListenerC1636290sgN abstractViewOnClickListenerC1636290sgN;
        C1662850tND c1662850tND;
        boolean zBooleanValue;
        if (i != -1) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1636160sgA) && (abstractViewOnClickListenerC1636290sgN = (AbstractViewOnClickListenerC1636290sgN) viewHolderFindViewHolderForAdapterPosition) != null && (c1662850tND = abstractViewOnClickListenerC1636290sgN.LLILZIL) != null) {
                c1662850tND.LJIILLIIL();
                Boolean value = c1636160sgA.LLIZ.LLLIIIL().getValue();
                if (value != null) {
                    zBooleanValue = value.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C1637440siE.LJ(c1662850tND, false, zBooleanValue);
            }
        }
        c6(recyclerView, i);
    }

    @Override // X.AbstractViewOnClickListenerC1636290sgN, X.C1636260sgK
    public /* bridge */ /* synthetic */ void N5(int i, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
        N5((Effect) obj, enumC1641420soe, num, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    @Override // X.AbstractViewOnClickListenerC1636290sgN
    /* JADX INFO: renamed from: T5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N5(com.ss.android.ugc.effectmanager.effect.model.Effect r6, X.EnumC1641420soe r7, java.lang.Integer r8, int r9) {
        /*
            r5 = this;
            java.lang.String r1 = r6.getEffectId()
            DATA r0 = r5.LL
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getEffectId()
        Le:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L17
            return
        L15:
            r0 = 0
            goto Le
        L17:
            X.0sgG r1 = r5.LLJ
            r4 = 1
            r2 = 0
            if (r1 == 0) goto L87
            boolean r0 = X.C1635900sfk.LIZ()
            if (r0 == 0) goto L80
            X.0sNK r0 = r5.LLILZLL
            X.0sOv r0 = r0.LJII()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJI()
        L2d:
            boolean r0 = r1.LIZ(r0, r6)
            if (r0 != r4) goto L87
            r3 = 1
            X.0sYi<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r5.LLIZ
            androidx.lifecycle.MutableLiveData r1 = r0.sk0()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.setValue(r0)
            X.0tND r1 = r5.LLILZIL
            X.0sYi<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r5.LLIZ
            androidx.lifecycle.MutableLiveData r0 = r0.LLLIIIL()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L7e
            boolean r0 = r0.booleanValue()
        L55:
            X.C1637440siE.LJ(r1, r4, r0)
        L58:
            r5.V5(r7, r8)
            if (r3 == 0) goto L7d
            X.0sNK r0 = r5.LLILZLL
            boolean r0 = r0.LJJIL()
            if (r0 == 0) goto L7d
            X.0sNK r0 = r5.LLILZLL
            r0.LJJIIJZLJL(r2)
            DATA r2 = r5.LL
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
            if (r2 == 0) goto L7d
            X.0sYi<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r5.LLIZ
            int r0 = r5.getPosition()
            X.0sVy r0 = r5.X5(r0, r2)
            r1.IF0(r0)
        L7d:
            return
        L7e:
            r0 = 0
            goto L55
        L80:
            X.0sNK r0 = r5.LLILZLL
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LLILIL()
            goto L2d
        L87:
            r3 = 0
            X.0tND r1 = r5.LLILZIL
            X.0sYi<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r5.LLIZ
            androidx.lifecycle.MutableLiveData r0 = r0.LLLIIIL()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto La0
            boolean r0 = r0.booleanValue()
        L9c:
            X.C1637440siE.LJ(r1, r2, r0)
            goto L58
        La0:
            r0 = 0
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1636160sgA.N5(com.ss.android.ugc.effectmanager.effect.model.Effect, X.0soe, java.lang.Integer, int):void");
    }

    public /* synthetic */ C1636160sgA(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi interfaceC1631540sYi) {
        this(view, c1662850tND, interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1631540sYi, false);
    }

    public C1636160sgA(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi, boolean z) {
        super(view, c1662850tND, interfaceC1624480sNK, interfaceC1631540sYi);
        this.LLJI = z;
    }
}
