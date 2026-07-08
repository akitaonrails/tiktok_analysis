package X;

import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.AdTopicsActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TQ2 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final C0TQ5 LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public List<AbstractC746450TPv> LLILZIL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i)).LIZ();
    }

    public final void LLLFZ(int i, C0TQ4 c0tq4) {
        Integer numValueOf = Integer.valueOf(R.attr.zq);
        if (i > 0) {
            if (((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i - 1)).LIZ() == 0 && i < this.LLILZIL.size() - 1 && ((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i + 1)).LIZ() != 0) {
                RelativeLayout relativeLayout = c0tq4.LLILZ;
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = numValueOf;
                c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                relativeLayout.setBackground(c384050F3z.LIZ(this.LL));
                return;
            }
            if (i < this.LLILZIL.size() - 1) {
                int i2 = i - 1;
                if (((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i2)).LIZ() == 2 || ((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i2)).LIZ() == 4) {
                    c0tq4.LLILZ.setBackground(C1308910kAL.LJ(R.attr.zq, this.LL));
                    return;
                }
            }
        }
        if (i == this.LLILZIL.size() - 1 && i > 0 && ((AbstractC746450TPv) ListProtector.get(this.LLILZIL, i - 1)).LIZ() != 0) {
            RelativeLayout relativeLayout2 = c0tq4.LLILZ;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LJIIJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c384050F3z2.LJIIJJI = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            relativeLayout2.setBackground(c384050F3z2.LIZ(this.LL));
            return;
        }
        c0tq4.LLILZ.setBackground(this.LL.getDrawable(R.drawable.aw4));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TQ4 c0tq4 = (C0TQ4) viewHolder;
        AbstractC746450TPv abstractC746450TPv = (AbstractC746450TPv) ListProtector.get(this.LLILZIL, i);
        if (abstractC746450TPv instanceof C0TPD) {
            C786410Ut5.LLLLZLL(c0tq4.LL, 0);
            C786410Ut5.LLIIL(c0tq4.LLILZ, 8);
            c0tq4.LL.setText(((C0TPD) abstractC746450TPv).LIZ);
            C786410Ut5.LLLLZLL(c0tq4.LLILZLL, 8);
            if (i == 0) {
                TuxTextView tuxTextView = c0tq4.LL;
                tuxTextView.setPadding(tuxTextView.getPaddingLeft(), 0, tuxTextView.getPaddingRight(), tuxTextView.getPaddingBottom());
            }
        } else {
            String string = "";
            if (abstractC746450TPv instanceof C746390TPp) {
                C786410Ut5.LLLLZLL(c0tq4.LL, 8);
                C746390TPp c746390TPp = (C746390TPp) abstractC746450TPv;
                c0tq4.LLILLL.setText(c746390TPp.LIZ.sensitiveTopicName);
                TuxTextView tuxTextView2 = c0tq4.LLILLJJLI;
                Integer num = c746390TPp.LIZ.choice;
                if (num != null) {
                    if (num.intValue() == 1) {
                        string = this.LL.getString(2131822109);
                    } else if (num.intValue() == 2) {
                        string = this.LL.getString(2131822110);
                    }
                }
                tuxTextView2.setText(string);
                C786410Ut5.LLLLZLL(c0tq4.LLILLJJLI, 0);
                C786410Ut5.LLLLZLL(c0tq4.LLILZLL, 8);
                LLLFZ(i, c0tq4);
            } else if (abstractC746450TPv instanceof C746430TPt) {
                C786410Ut5.LLLLZLL(c0tq4.LL, 8);
                C786410Ut5.LLLLZLL(c0tq4.LLILZLL, 8);
                C746430TPt c746430TPt = (C746430TPt) abstractC746450TPv;
                c0tq4.LLILLL.setText(c746430TPt.LIZ.adTopicName);
                if (!this.LLILLL && this.LLILZ == 1) {
                    TuxTextView tuxTextView3 = c0tq4.LLILLJJLI;
                    Integer num2 = c746430TPt.LIZ.choice;
                    if (num2 != null) {
                        if (num2.intValue() == 1) {
                            string = this.LL.getString(2131821859);
                        } else if (num2.intValue() == 2) {
                            string = this.LL.getString(2131821860);
                        }
                    }
                    tuxTextView3.setText(string);
                    C786410Ut5.LLLLZLL(c0tq4.LLILLJJLI, 0);
                } else {
                    C786410Ut5.LLLLZLL(c0tq4.LLILLJJLI, 8);
                }
                if (!this.LLILLL && Intrinsics.LJFF(c746430TPt.LIZ.isInferredByTikTok(), Boolean.TRUE) && this.LLILZ == 0) {
                    C786410Ut5.LLLLZLL(c0tq4.LLILZIL, 0);
                    c0tq4.LLILZIL.setText(this.LL.getString(2131824756));
                } else {
                    C786410Ut5.LLLLZLL(c0tq4.LLILZIL, 8);
                }
                LLLFZ(i, c0tq4);
            } else if (abstractC746450TPv instanceof C746460TPw) {
                C786410Ut5.LLLLZLL(c0tq4.LL, 8);
                C786410Ut5.LLLLZLL(c0tq4.LLILLJJLI, 8);
                C786410Ut5.LLLLZLL(c0tq4.LLILLL, 0);
                c0tq4.LLILLL.setText(((C746460TPw) abstractC746450TPv).LIZ);
                C786410Ut5.LLLLZLL(c0tq4.LLILZLL, 8);
            } else if (abstractC746450TPv instanceof C0TPC) {
                C786410Ut5.LLLLZLL(c0tq4.LL, 8);
                C786410Ut5.LLIIL(c0tq4.LLILZ, 8);
                C786410Ut5.LLLLZLL(c0tq4.LLILZLL, 0);
                c0tq4.LLILZLL.setText(((C0TPC) abstractC746450TPv).LIZ);
            }
        }
        C786410Ut5.S7(c0tq4.LLILZ, new ACListenerS52S0101000_12(this, i, 11));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TQ4 c0tq4 = new C0TQ4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cux, viewGroup, false));
        try {
            View view = c0tq4.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tq4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tq4.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TQ4.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tq4.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tq4.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TQ4.class.getName();
        return c0tq4;
    }

    public C0TQ2(AdTopicsActivity adTopicsActivity, AdTopicsActivity adTopicsActivity2, boolean z, int i) {
        this.LL = adTopicsActivity;
        this.LLILLJJLI = adTopicsActivity2;
        this.LLILLL = z;
        this.LLILZ = i;
    }
}
