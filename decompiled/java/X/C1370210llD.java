package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0llD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370210llD extends AbstractC1370150ll7 {
    public final InterfaceC1369750lkT LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final BaseSharePackage LLILZIL;
    public final boolean LLILZLL;
    public final EnumC1369720lkQ LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;
    public final C1370200llC LLJILJIL;
    public List<? extends InterfaceC1370310llN> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final boolean LLJJI;

    public final int LLLI() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJILJ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        C1370250llH c1370250llH = (C1370250llH) viewHolder;
        int adapterPosition = c1370250llH.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((InterfaceC1370310llN) ListProtector.get(this.LLJILJILJ, adapterPosition)).LJJIJ(c1370250llH.LL, c1370250llH.itemView, adapterPosition);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1370250llH c1370250llH = (C1370250llH) viewHolder;
        Animation animation = c1370250llH.LL.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(c1370250llH);
    }

    @Override // X.AbstractC1370150ll7
    public final void setData(List<? extends InterfaceC1370310llN> list) {
        this.LLJILJILJ = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1370210llD.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num;
        int i2;
        boolean z2 = false;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d88, viewGroup, false);
        C1370250llH c1370250llH = new C1370250llH(viewTd);
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null && interfaceC1370110ll3.LIZLLL(this.LLILZIL)) {
            z = true;
        } else {
            z = false;
        }
        int iIntValue = R.dimen.afy;
        if (z) {
            ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
            Resources resources = viewTd.getContext().getResources();
            Integer num2 = (Integer) ((Map) C01BR.LIZIZ.getValue()).get(Integer.valueOf(this.LLJ));
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            layoutParams.width = resources.getDimensionPixelOffset(iIntValue);
            C426750GoL.LJIIIZ(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
            c1370250llH.LLILLJJLI.getLayoutParams().width = -1;
            C1370200llC c1370200llC = this.LLJILJIL;
            if (c1370200llC != null && (i2 = c1370200llC.LIZLLL) != 0) {
                this.LLILLJJLI = i2;
            }
            c1370250llH.LLILZ.getLayoutParams().width = LLLI();
            c1370250llH.LLILZ.getLayoutParams().height = LLLI();
        } else {
            InterfaceC1370110ll3 interfaceC1370110ll32 = C1370370llT.LIZ;
            if (interfaceC1370110ll32 != null && interfaceC1370110ll32.LIZJ(this.LLILZIL)) {
                ViewGroup.LayoutParams layoutParams2 = viewTd.getLayoutParams();
                Resources resources2 = viewTd.getContext().getResources();
                Integer num3 = (Integer) ((Map) C01BR.LIZIZ.getValue()).get(Integer.valueOf(this.LLJ));
                if (num3 != null) {
                    iIntValue = num3.intValue();
                }
                layoutParams2.width = resources2.getDimensionPixelOffset(iIntValue);
                C426750GoL.LJIIIZ(viewTd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
            }
        }
        C1370200llC c1370200llC2 = this.LLJILJIL;
        if (c1370200llC2 != null && c1370200llC2.LJ && (num = (Integer) this.LLJJ.getValue()) != null) {
            viewTd.getLayoutParams().width = num.intValue();
        }
        InterfaceC1370360llS interfaceC1370360llS = C1370370llT.LJFF;
        if (interfaceC1370360llS != null) {
            interfaceC1370360llS.LIZ();
        }
        C1370200llC c1370200llC3 = this.LLJILJIL;
        if (c1370200llC3 != null && c1370200llC3.LJFF > 0) {
            viewTd.getLayoutParams().width = c1370200llC3.LJFF;
        }
        if (this.LLJIJIL) {
            c1370250llH.LLILLJJLI.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        }
        if (this.LLJJI) {
            C426750GoL.LJIIIZ(c1370250llH.LLILLJJLI, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
        }
        C1370200llC c1370200llC4 = this.LLJILJIL;
        if (c1370200llC4 != null && c1370200llC4.LJ) {
            z2 = true;
        }
        if (z2) {
            ViewGroup.LayoutParams layoutParams3 = c1370250llH.LLILZIL.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            }
        }
        InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
        if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZJ() != null) {
            C1369900lki.LIZIZ(c1370250llH, null);
        }
        try {
            View view = c1370250llH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1370250llH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1370250llH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1370250llH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1370250llH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1370250llH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1370250llH.class.getName();
        return c1370250llH;
    }

    public C1370210llD(InterfaceC1369750lkT interfaceC1369750lkT, int i, int i2, String str, BaseSharePackage baseSharePackage, boolean z, EnumC1369720lkQ enumC1369720lkQ, boolean z2, int i3, int i4, boolean z3, C1370200llC c1370200llC, int i5) {
        Bundle bundle;
        boolean z4 = false;
        i = (i5 & 2) != 0 ? 0 : i;
        i2 = (i5 & 4) != 0 ? 0 : i2;
        baseSharePackage = (i5 & 16) != 0 ? null : baseSharePackage;
        z = (i5 & 32) != 0 ? false : z;
        enumC1369720lkQ = (i5 & 64) != 0 ? EnumC1369720lkQ.HORIZONTAL : enumC1369720lkQ;
        z2 = (i5 & 128) != 0 ? false : z2;
        i3 = (i5 & 256) != 0 ? 0 : i3;
        i4 = (i5 & 512) != 0 ? 0 : i4;
        z3 = (i5 & 1024) != 0 ? false : z3;
        C1370200llC c1370200llC2 = (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? c1370200llC : null;
        this.LL = interfaceC1369750lkT;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = baseSharePackage;
        this.LLILZLL = z;
        this.LLIZ = enumC1369720lkQ;
        this.LLIZLLLIL = z2;
        this.LLJ = i3;
        this.LLJI = i4;
        this.LLJIJIL = z3;
        this.LLJILJIL = c1370200llC2;
        this.LLJILJILJ = C13BV.INSTANCE;
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 767));
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1283));
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && bundle.getBoolean("use_enhance_share_panel_use_square_icon", false)) {
            z4 = true;
        }
        this.LLJJI = z4;
    }
}
