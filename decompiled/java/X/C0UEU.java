package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0UEU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEU extends AbstractC21673619ry<C0UEV> {
    public final List<LiveEffect> LL;
    public final C0UEW LLILLJJLI;
    public String LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final DataChannel LLIZ;
    public final ACListenerS147S0100000_12 LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<LiveEffect> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static String LLLFZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return "";
        }
        return liveEffect.LLJI();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C0UEV c0uev = (C0UEV) viewHolder;
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LL, i);
        if (!TextUtils.equals(LLLFZ(liveEffect), "") && !liveEffect.LJJIJIIJI()) {
            C1121670fIL.LJI(liveEffect.getIcon().LIZ(), c0uev.LLILZ);
            c0uev.LLILZ.setPadding(0, 0, 0, 0);
        } else {
            c0uev.LLILZ.setImageResource(R.drawable.emj);
            c0uev.LLILZ.getLayoutParams();
            int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            c0uev.LLILZ.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        }
        if (TextUtils.equals(this.LLILLL, LLLFZ(liveEffect))) {
            C786410Ut5.LJLLLLLL(0, c0uev.LLILLL);
        } else {
            C786410Ut5.LJLLLLLL(8, c0uev.LLILLL);
        }
        c0uev.LLILZ.setTag(R.id.kb6, liveEffect);
        C786410Ut5.e8(c0uev.LLILZ, this.LLIZLLLIL);
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        ViewGroup.MarginLayoutParams c19me = (ViewGroup.MarginLayoutParams) c0uev.LL.getLayoutParams();
        if (c19me == null) {
            c19me = new C19ME(-2, -1);
        }
        ViewGroup.MarginLayoutParams c19me2 = (ViewGroup.MarginLayoutParams) c0uev.LLILLJJLI.getLayoutParams();
        if (c19me2 == null) {
            c19me2 = new C19ME(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams = c0uev.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            int i2 = this.LLILZ;
            c19me.width = i2;
            c19me2.width = i2 / 2;
        } else if (z2) {
            int i3 = this.LLILZ;
            c19me.width = i3 / 2;
            c19me2.width = i3;
        } else {
            int i4 = this.LLILZ / 2;
            c19me.width = i4;
            c19me2.width = i4;
        }
        layoutParams.width = c19me.width + c19me2.width + this.LLILZIL;
        C786410Ut5.W5(c0uev.itemView, layoutParams);
        C786410Ut5.W5(c0uev.LL, c19me);
        C786410Ut5.W5(c0uev.LLILLJJLI, c19me2);
        if (liveEffect.LIZLLL()) {
            C786410Ut5.LJLLLLLL(0, c0uev.LLILZIL);
        } else {
            C786410Ut5.LJLLLLLL(8, c0uev.LLILZIL);
        }
        if (!this.LLILLJJLI.LIZ(liveEffect) && !TextUtils.equals(LLLFZ(liveEffect), "")) {
            C786410Ut5.LJLLLLLL(0, c0uev.LLILZLL);
        } else {
            C786410Ut5.LJLLLLLL(8, c0uev.LLILZLL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0UEV c0uev = new C0UEV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hsc, viewGroup, false));
        try {
            View view = c0uev.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0uev.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0uev.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0UEV.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0uev.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0uev.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0UEV.class.getName();
        return c0uev;
    }

    public final void LLLI(int i, LiveEffect liveEffect, String str) {
        if (!C0UD4.LJ.equals(str)) {
            return;
        }
        String strLLLFZ = LLLFZ(liveEffect);
        for (LiveEffect liveEffect2 : this.LL) {
            if (TextUtils.equals(strLLLFZ, LLLFZ(liveEffect2))) {
                if (liveEffect2 != null) {
                    if (i == 2) {
                        liveEffect2.LJLILLLLZI(false);
                        liveEffect2.LJJLIL(true);
                        if (TextUtils.equals(LLLFZ(liveEffect2), this.LLILLL)) {
                            this.LLILLJJLI.LIZJ(liveEffect2);
                            DataChannel dataChannel = this.LLIZ;
                            C0UEY liveMultiGuestStickerLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager();
                            if (liveMultiGuestStickerLogManager != null) {
                                liveMultiGuestStickerLogManager.LIZJ(liveEffect2, dataChannel, 0, false, null);
                            }
                        }
                    } else if (i == 3) {
                        liveEffect2.LJLILLLLZI(false);
                    } else if (i == 1) {
                        liveEffect2.LJLILLLLZI(true);
                    }
                    try {
                        notifyItemChanged(this.LL.indexOf(liveEffect2));
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("notifyItemChanged failed:");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LJ("LinkStickerAdapter", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                }
                return;
            }
        }
    }

    public C0UEU(Context context, List<LiveEffect> list, C0UEW c0uew, boolean z, DataChannel dataChannel) {
        String strLLLFZ;
        if (C924790aAn.LIZLLL().LJFF == null) {
            strLLLFZ = "";
        } else {
            strLLLFZ = LLLFZ(C924790aAn.LIZLLL().LJFF);
        }
        this.LLILLL = strLLLFZ;
        this.LLIZLLLIL = new ACListenerS147S0100000_12(this, 62);
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                LiveEffect liveEffect = (LiveEffect) ListProtector.get(list, i);
                if (liveEffect != null) {
                    liveEffect.LJZ(Integer.valueOf(i));
                    liveEffect.LJJLI(Integer.valueOf(i));
                    liveEffect.LJIIJJI("props");
                }
            }
        }
        this.LL = list;
        this.LLILLJJLI = c0uew;
        int iLJIIJ = C12ES.LJIIJ(context);
        int iLIZIZ = (int) C497740JfY.LIZIZ(56.0f);
        this.LLILZIL = iLIZIZ;
        this.LLILZ = (iLJIIJ - (iLIZIZ * 5)) / 6;
        this.LLILZLL = z;
        this.LLIZ = dataChannel;
    }
}
