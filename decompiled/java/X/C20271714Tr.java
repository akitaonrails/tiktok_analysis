package X;

import Y.ACListenerS164S0100000_30;
import Y.ACListenerS94S0300000_30;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.14Tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20271714Tr extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final int LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final double LLILZIL = 1.0d;
    public final ArrayList<MediaModel> LLILZLL = new ArrayList<>();
    public List<Integer> LLIZ;
    public List<Integer> LLIZLLLIL;
    public List<C20272214Tw> LLJ;
    public final int LLJI;
    public boolean LLJIJIL;
    public C09AY LLJILJIL;
    public C09AY LLJILJILJ;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public final void LLLFZ(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int i = layoutParams.width;
            int i2 = this.LLJI;
            if (i != i2) {
                int i3 = layoutParams.height;
                double d = this.LLILZIL;
                if (i3 != ((int) (((double) i2) * d))) {
                    layoutParams.width = i2;
                    layoutParams.height = (int) (((double) i2) * d);
                }
            }
        }
    }

    public final void LLLI(Collection<? extends MediaModel> collection) {
        this.LLILZLL.clear();
        this.LLILZLL.addAll(collection);
        int size = this.LLILZLL.size();
        List<Integer> list = this.LLIZLLLIL;
        if (list == null) {
            this.LLIZLLLIL = new ArrayList();
        } else {
            ((ArrayList) list).clear();
        }
        List<Integer> list2 = this.LLIZ;
        if (list2 == null) {
            this.LLIZ = new ArrayList();
        } else {
            ((ArrayList) list2).clear();
        }
        for (int i = 0; i < size; i++) {
            List<Integer> list3 = this.LLIZ;
            if (list3 != null) {
                ((ArrayList) list3).add(-1);
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size;
        float f;
        final C20272014Tu c20272014Tu = (C20272014Tu) viewHolder;
        LLLFZ(c20272014Tu.LL);
        LLLFZ(c20272014Tu.LLILZ);
        MediaModel mediaModel = (MediaModel) ListProtector.get(this.LLILZLL, i);
        final int iIntValue = ((Number) ListProtector.get(this.LLIZ, i)).intValue();
        float f2 = 1.0f;
        if (iIntValue >= 0) {
            TextView textView = c20272014Tu.LLILLJJLI;
            if (textView != null) {
                textView.setText(String.valueOf(iIntValue + 1));
            }
            TextView textView2 = c20272014Tu.LLILLJJLI;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.cf6);
            }
            View view = c20272014Tu.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            f = 1.1f;
        } else {
            TextView textView3 = c20272014Tu.LLILLJJLI;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = c20272014Tu.LLILLJJLI;
            if (textView4 != null) {
                textView4.setBackgroundResource(R.drawable.cf5);
            }
            View view2 = c20272014Tu.LLILZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            List<Integer> list = this.LLIZLLLIL;
            if (list != null) {
                size = ((ArrayList) list).size();
            } else {
                size = 0;
            }
            if (size >= this.LLILLJJLI) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            f = 1.0f;
        }
        RemoteImageView remoteImageView = c20272014Tu.LL;
        if (remoteImageView != null) {
            if (remoteImageView.getAlpha() != f2) {
                C786410Ut5.I5(remoteImageView, f2);
            }
            if (remoteImageView.getScaleX() != f) {
                C786410Ut5.kc(remoteImageView, f);
                C786410Ut5.Fc(remoteImageView, f);
            }
        }
        if (!TextUtils.equals(c20272014Tu.LLILZIL, mediaModel.LJFF())) {
            String strLJFF = mediaModel.LJFF();
            c20272014Tu.LLILZIL = strLJFF;
            RemoteImageView remoteImageView2 = c20272014Tu.LL;
            String string = C2471909mP.LJIILIIL(strLJFF).toString();
            int i2 = this.LLJI;
            C1324840ka2.LJIIJ(remoteImageView2, string, i2, i2);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14Tt
            /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function2] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ?? r1;
                C20271714Tr c20271714Tr = this.LL;
                if (c20271714Tr.LLJIJIL) {
                    return;
                }
                if ((iIntValue < 0 && ((ArrayList) c20271714Tr.LLIZLLLIL).size() >= this.LL.LLILLJJLI) || (r1 = this.LL.LLJILJIL) == 0) {
                    return;
                }
                r1.invoke(view3, C2471909mP.LJIILIIL(c20272014Tu.LLILZIL).toString());
            }
        }, c20272014Tu.itemView);
        FrameLayout frameLayout = c20272014Tu.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS94S0300000_30(c20272014Tu, mediaModel, this, 2));
        }
        TextView textView5 = c20272014Tu.LLILLJJLI;
        if (textView5 != null) {
            C786410Ut5.T7(textView5, new ACListenerS164S0100000_30(c20272014Tu, 25));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.biq, viewGroup, false);
        C20272014Tu c20272014Tu = new C20272014Tu(viewTd);
        c20272014Tu.LL = (RemoteImageView) viewTd.findViewById(R.id.o5h);
        c20272014Tu.LLILLJJLI = (TextView) viewTd.findViewById(R.id.kel);
        c20272014Tu.LLILLL = (FrameLayout) viewTd.findViewById(R.id.i6h);
        c20272014Tu.LLILZ = viewTd.findViewById(R.id.uy1);
        try {
            View view = c20272014Tu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c20272014Tu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c20272014Tu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C20272014Tu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c20272014Tu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c20272014Tu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C20272014Tu.class.getName();
        return c20272014Tu;
    }

    public C20271714Tr(Context context, int i, int i2, long j, boolean z) {
        this.LL = context;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
        this.LLILZ = z;
        context.getResources().getDimensionPixelOffset(R.dimen.px);
        this.LLJI = (C12ES.LJIIJ(context) - ((i - 1) * ((int) C12ES.LIZJ(1.5f, context)))) / i;
    }
}
