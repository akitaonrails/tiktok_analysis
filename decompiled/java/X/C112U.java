package X;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.112U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C112U extends C112T<C112V> {
    public C112Y LLILZ;
    public int LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<EffectModel> list = this.LLILLJJLI;
        if (list == null) {
            return 0;
        }
        return ((ArrayList) list).size();
    }

    public C112U(EffectDownloadController effectDownloadController) {
        super(effectDownloadController);
        this.LLILZIL = -1;
    }

    public final void LLLII(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            int i = this.LLILZIL;
            if (i != -1) {
                this.LLILZIL = -1;
                notifyItemChanged(i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ((ArrayList) this.LLILLJJLI).size()) {
                break;
            }
            if (((EffectModel) ListProtector.get(this.LLILLJJLI, i2)).key.equals(effectPointModel.getKey())) {
                this.LLILZIL = i2;
                break;
            }
            i2++;
        }
        notifyItemChanged(this.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C112V c112v = (C112V) viewHolder;
        int iIntValue = ((Number) ListProtector.get(this.LLILLL, i)).intValue();
        EffectModel effectModel = (EffectModel) ListProtector.get(c112v.LLILZLL.LLILLJJLI, i);
        if (effectModel != null) {
            c112v.LL.LJ(effectModel.iconUrl);
            c112v.LL.setText(effectModel.name);
            C19470511Fn c19470511Fn = c112v.LL;
            if (i == c112v.LLILZLL.LLILZIL) {
                z = true;
            } else {
                z = false;
            }
            c19470511Fn.LJFF(z);
            if (c112v.LLILZIL != iIntValue) {
                c112v.LLILZIL = iIntValue;
                if (iIntValue != 2) {
                    if (iIntValue != 4) {
                        if (iIntValue != 8) {
                            if (iIntValue != 16) {
                                if (iIntValue == 32) {
                                    C786410Ut5.e1(c112v.LLILLJJLI, 0);
                                    c112v.I5();
                                }
                            } else {
                                c112v.I5();
                                C786410Ut5.e1(c112v.LLILLJJLI, 8);
                            }
                        } else {
                            C786410Ut5.e1(c112v.LLILLJJLI, 0);
                            c112v.LLILLJJLI.setImageResource(R.drawable.aa0);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c112v.LLILLJJLI, "rotation", 0.0f, 360.0f);
                            c112v.LLILLL = objectAnimatorOfFloat;
                            objectAnimatorOfFloat.setDuration(800L);
                            c112v.LLILLL.setRepeatMode(1);
                            c112v.LLILLL.setRepeatCount(-1);
                            c112v.LLILLL.setInterpolator(new LinearInterpolator());
                            C786410Ut5.Pd(c112v.LLILLL);
                        }
                    } else {
                        C786410Ut5.e1(c112v.LLILLJJLI, 8);
                    }
                } else {
                    c112v.I5();
                    C786410Ut5.e1(c112v.LLILLJJLI, 0);
                }
            }
            if (effectModel.isGoToCapCutEffect) {
                C786410Ut5.LJZI(0, c112v.LLILZ);
            } else {
                C786410Ut5.LJZI(8, c112v.LLILZ);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C112V c112v = new C112V(this, C786410Ut5.Td((LayoutInflater) C786410Ut5.H2(viewGroup.getContext(), "layout_inflater"), R.layout.cyb, viewGroup, false));
        try {
            View view = c112v.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c112v.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c112v.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C112V.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c112v.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c112v.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C112V.class.getName();
        return c112v;
    }
}
