package X;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.112W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C112W extends C112T<C112X> {
    public C194355112b LLILZ;
    public boolean LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C112W(EffectDownloadController effectDownloadController) {
        super(effectDownloadController);
        this.LLILZIL = true;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (C113I.LJ(((EffectModel) ListProtector.get(this.LLILLJJLI, i)).category)) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1325710kbR[] c1325710kbRArrLIZIZ;
        C112X c112x = (C112X) viewHolder;
        EffectModel effectModel = (EffectModel) ListProtector.get(this.LLILLJJLI, i);
        int iIntValue = ((Number) ListProtector.get(this.LLILLL, i)).intValue();
        if (effectModel == null) {
            c112x.getClass();
        } else {
            c112x.LLILLJJLI.setText(effectModel.name);
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(c112x.LLILLL.getTag())) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (CastIntegerProtector.parseInt(effectModel.key) >= 0) {
                    C1324800kZy c1324800kZy = c112x.LLILLL;
                    String str = effectModel.iconUrl;
                    Bitmap.Config config = Bitmap.Config.RGB_565;
                    c1324800kZy.getClass();
                    if (!TextUtils.isEmpty(str)) {
                        c1325710kbRArrLIZIZ = C1324780kZw.LIZIZ(config, str);
                    } else {
                        c1325710kbRArrLIZIZ = null;
                    }
                    C1324780kZw.LIZ(c1324800kZy, c1325710kbRArrLIZIZ, null, true, null);
                } else {
                    int iN3 = C786410Ut5.n3(C0CHQ.LIZ.getResources(), effectModel.iconUrl, "drawable", C0CHQ.LIZ.getPackageName());
                    C1324800kZy c1324800kZy2 = c112x.LLILLL;
                    c1324800kZy2.setImageDrawable(c1324800kZy2.getResources().getDrawable(iN3));
                }
                c112x.LLILLL.setTag(effectModel.iconUrl);
            }
            if (c112x.LLILZLL != iIntValue) {
                c112x.LLILZLL = iIntValue;
                if (iIntValue != 2) {
                    if (iIntValue != 4) {
                        if (iIntValue != 8) {
                            if (iIntValue != 16) {
                                if (iIntValue == 32) {
                                    C1627000sRO.LIZIZ(c112x.LL.getContext(), false);
                                    C786410Ut5.e1(c112x.LL, 0);
                                    c112x.I5();
                                }
                            } else {
                                c112x.I5();
                                C786410Ut5.e1(c112x.LL, 8);
                            }
                        } else {
                            C786410Ut5.e1(c112x.LL, 0);
                            c112x.LL.setImageResource(R.drawable.aa0);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c112x.LL, "rotation", 0.0f, 360.0f);
                            c112x.LLILZIL = objectAnimatorOfFloat;
                            objectAnimatorOfFloat.setDuration(800L);
                            c112x.LLILZIL.setRepeatMode(1);
                            c112x.LLILZIL.setRepeatCount(-1);
                            c112x.LLILZIL.setInterpolator(new LinearInterpolator());
                            C786410Ut5.Pd(c112x.LLILZIL);
                        }
                    } else {
                        C786410Ut5.e1(c112x.LL, 8);
                    }
                } else {
                    c112x.I5();
                    C786410Ut5.e1(c112x.LL, 0);
                }
            }
            if (effectModel.isGoToCapCutEffect) {
                C786410Ut5.LJZI(0, c112x.LLILZ);
            } else {
                C786410Ut5.LJZI(8, c112x.LLILZ);
            }
        }
        c112x.L5(this.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C112X c112x = new C112X(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw4, viewGroup, false));
        if (i == 2) {
            C1324800kZy c1324800kZy = c112x.LLILLL;
            c1324800kZy.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.2f, 100L, c1324800kZy));
        }
        try {
            View view = c112x.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c112x.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c112x.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C112X.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c112x.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c112x.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C112X.class.getName();
        return c112x;
    }
}
