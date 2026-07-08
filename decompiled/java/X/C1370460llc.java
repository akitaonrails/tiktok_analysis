package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0llc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370460llc extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final C01GW<Integer> LLJJIII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(545));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final C01GW<Integer> LLJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(319));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390));
    public static final C01GW<Boolean> LLJJJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(318));
    public final Context LL;
    public final InterfaceC1368050lhj LLILLJJLI;
    public final InterfaceC1369750lkT LLILLL;
    public final int LLIZ;
    public final BaseSharePackage LLIZLLLIL;
    public final C1371590lnR LLJ;
    public final boolean LLILZ = false;
    public final int LLILZIL = 0;
    public final int LLILZLL = 8;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1282));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, StrategyCenter.ENABLE_SMART_SERVICE));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1281));
    public List<? extends InterfaceC1370450llb> LLJILJILJ = C13BV.INSTANCE;
    public final ArrayList<InterfaceC1369790lkX> LLJILLL = new ArrayList<>();
    public final ArrayList<InterfaceC1370310llN> LLJJ = new ArrayList<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJILJ.size();
    }

    public final void LLLFZ(List<? extends InterfaceC1370450llb> list) {
        this.LLJILJILJ = list;
        for (InterfaceC1370450llb interfaceC1370450llb : list) {
            if (interfaceC1370450llb instanceof InterfaceC1369790lkX) {
                this.LLJILLL.add((InterfaceC1369790lkX) interfaceC1370450llb);
                this.LLJJ.add(new InterfaceC1370310llN() { // from class: X.0M7d
                    @Override // X.InterfaceC1370310llN
                    public final float LIZLLL() {
                        return -1.0f;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJII() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIIIZZ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJIILJJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIJJLI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJIJ(ImageView imageView, View view, int i) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJIJIIJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJIL() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String LJJIZ() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJI(BaseSharePackage baseSharePackage) {
                    }

                    @Override // X.InterfaceC1370310llN
                    public final Integer LJJJJIZL() {
                        return null;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 100;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJJLZIJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJLIIIJJIZ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean LJJLIIIJL() {
                        return false;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final boolean enable() {
                        return true;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String key() {
                        return "fake";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final String label() {
                        return "";
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJIIJJI() {
                        return !enable() ? 1 : 0;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final C0M7Z LJIIJ() {
                        return C0M7Z.ShareButton;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final EnumC1216710hld LJJJZ() {
                        return EnumC1216710hld.NORMAL;
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJIJJ(TextView textView) {
                        C1370320llO.LJ(this, textView);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                        return C1370320llO.LIZJ(enumC1369720lkQ);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZIZ(this, view, baseSharePackage);
                    }

                    @Override // X.InterfaceC1370310llN
                    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                        C1370320llO.LIZLLL(context, baseSharePackage, this);
                    }
                });
            } else if (interfaceC1370450llb instanceof InterfaceC1370310llN) {
                this.LLJILLL.add(new InterfaceC1369790lkX() { // from class: X.0lld
                    @Override // X.InterfaceC1369790lkX
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJIIZILJ(Context context) {
                        return true;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final void LJIL() {
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final void LJJI() {
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final Drawable LJJII(Context context, boolean z) {
                        return null;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJIII() {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final void LJJIIJZLJL(int i) {
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final void LJJIJIL(View view, boolean z) {
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                        return false;
                    }

                    @Override // X.InterfaceC1370450llb
                    public final int LJJJJLI() {
                        return 101;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJJLIIL() {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final float LJJL() {
                        return 0.34f;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJLI() {
                        return true;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final boolean LJJLIIIJJI() {
                        return false;
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final String key() {
                        return "fake";
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final String label() {
                        return "fake";
                    }

                    @Override // X.InterfaceC1369790lkX
                    public final void LJIJI(C424540Gkm c424540Gkm, boolean z) {
                        c424540Gkm.getContext();
                        c424540Gkm.setImageDrawable(null);
                    }
                });
                this.LLJJ.add((InterfaceC1370310llN) interfaceC1370450llb);
            }
        }
        ((AbstractC1366540lfI) this.LLJILJIL.getValue()).setData(this.LLJILLL);
        ((AbstractC1370150ll7) this.LLJIJIL.getValue()).setData(this.LLJJ);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, i)).LJJJJLI() == 101) {
            return ((AbstractC21673619ry) this.LLJILJIL.getValue()).getItemViewType(i);
        }
        return 100;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount() && ((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJJJLI() != 101 && ((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJJJLI() == 100) {
            C1370250llH c1370250llH = (C1370250llH) viewHolder;
            ((InterfaceC1370310llN) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJIJ(c1370250llH.LL, c1370250llH.itemView, adapterPosition);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Animation animation;
        super.onViewDetachedFromWindow(viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount() && ((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJJJLI() != 101 && ((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJJJLI() == 100 && (animation = ((C1370250llH) viewHolder).LL.getAnimation()) != null) {
            animation.cancel();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (((InterfaceC1370450llb) ListProtector.get(this.LLJILJILJ, i)).LJJJJLI() == 101) {
            ((AbstractC21673619ry) this.LLJILJIL.getValue()).onBindViewHolder(viewHolder, i);
        } else {
            ((AbstractC21673619ry) this.LLJIJIL.getValue()).onBindViewHolder(viewHolder, i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLII;
        if (i == 100) {
            viewHolderLLLII = ((AbstractC21673619ry) this.LLJIJIL.getValue()).onCreateViewHolder(viewGroup, i);
        } else {
            viewHolderLLLII = ((C1369780lkW) this.LLJILJIL.getValue()).LLLII(i, viewGroup);
        }
        try {
            View view = viewHolderLLLII.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLLLII.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLII.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLII.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLII.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLII.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLII.getClass().getName();
        return viewHolderLLLII;
    }

    public C1370460llc(Context context, InterfaceC1368050lhj interfaceC1368050lhj, InterfaceC1369750lkT interfaceC1369750lkT, int i, BaseSharePackage baseSharePackage, C1371590lnR c1371590lnR) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1368050lhj;
        this.LLILLL = interfaceC1369750lkT;
        this.LLIZ = i;
        this.LLIZLLLIL = baseSharePackage;
        this.LLJ = c1371590lnR;
    }
}
