package X;

import Y.ACListenerS112S0200000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Kpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC529440Kpa extends AbstractC21673619ry<C529490Kpf> implements View.OnClickListener {
    public int LL;
    public final ArrayList<C523930Kgh> LLILLJJLI;
    public final HashMap<String, C523930Kgh> LLILLL;
    public final C20066713fN<TikTokMediaModel> LLILZ;
    public int LLILZIL;
    public final Context LLILZLL;
    public InterfaceC529070Koz LLIZ;
    public C523930Kgh LLIZLLLIL;
    public C529050Kox LLJ;
    public final String LLJI;
    public boolean LLJIJIL;

    public final void LLLII() {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            C523930Kgh c523930Kgh = (C523930Kgh) ListProtector.get(this.LLILLJJLI, 0);
            ArrayList arrayList = new ArrayList(c523930Kgh.LIZJ);
            C530380Kr6 c530380Kr6 = C530380Kr6.LIZ;
            LLLI(arrayList, 3, c530380Kr6);
            LLLI(new ArrayList(c523930Kgh.LIZLLL), 4, c530380Kr6);
        }
    }

    public final C523930Kgh LLLIIIIL() {
        if (this.LLILLJJLI.size() > 0) {
            return (C523930Kgh) ListProtector.get(this.LLILLJJLI, 0);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public ViewOnClickListenerC529440Kpa(Context context) {
        ArrayList<C523930Kgh> arrayList = new ArrayList<>();
        this.LLILLJJLI = arrayList;
        this.LLILZ = new C20066713fN<>((Object) null);
        this.LLILZLL = context;
        C786410Ut5.ne(context);
        C523930Kgh c523930Kgh = new C523930Kgh();
        String strLIZJ = C540060LGa.LIZJ(context);
        this.LLJI = strLIZJ;
        c523930Kgh.LIZ = strLIZJ;
        arrayList.add(c523930Kgh);
        this.LLILLL = new HashMap<>();
        for (C523930Kgh c523930Kgh2 : arrayList) {
            HashMap<String, C523930Kgh> map = this.LLILLL;
            if (map != null) {
                map.put(c523930Kgh2.LIZ, c523930Kgh2);
            }
        }
        this.LLJIJIL = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C523930Kgh c523930Kgh = (C523930Kgh) view.getTag();
        InterfaceC529070Koz interfaceC529070Koz = this.LLIZ;
        if (interfaceC529070Koz != null) {
            interfaceC529070Koz.LJJIJ(c523930Kgh, true, this.LLILZIL, true, true, true, true);
            this.LLIZLLLIL = c523930Kgh;
        }
    }

    public static final void LLLIILIL(int i, C523930Kgh c523930Kgh) {
        if (c523930Kgh == null) {
            return;
        }
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    c523930Kgh.LIZLLL.clear();
                    return;
                }
                return;
            }
            c523930Kgh.LIZJ.clear();
            return;
        }
        c523930Kgh.LIZJ.clear();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        C529490Kpf c529490Kpf = (C529490Kpf) viewHolder;
        C523930Kgh c523930Kgh = (C523930Kgh) ListProtector.get(this.LLILLJJLI, i);
        c529490Kpf.itemView.setTag(c523930Kgh);
        TextView textView = c529490Kpf.LL;
        if (textView != null) {
            textView.setText(c523930Kgh.LIZ);
        }
        Integer numLIZJ3 = null;
        if (this.LL == i) {
            LinearLayout linearLayout = c529490Kpf.LLILLJJLI;
            if (linearLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                Context context3 = linearLayout.getContext();
                if (context3 != null) {
                    numLIZJ3 = C1308910kAL.LIZJ(R.attr.a00, context3);
                }
                c384050F3z.LIZ = numLIZJ3;
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
            }
            TextView textView2 = c529490Kpf.LL;
            if (textView2 != null && (context2 = textView2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, context2)) != null) {
                textView2.setTextColor(numLIZJ2.intValue());
            }
        } else {
            LinearLayout linearLayout2 = c529490Kpf.LLILLJJLI;
            if (linearLayout2 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                Context context4 = linearLayout2.getContext();
                if (context4 != null) {
                    numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, context4);
                }
                c384050F3z2.LIZ = numLIZJ3;
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                linearLayout2.setBackground(c384050F3z2.LIZ(linearLayout2.getContext()));
            }
            TextView textView3 = c529490Kpf.LL;
            if (textView3 != null && (context = textView3.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                textView3.setTextColor(numLIZJ.intValue());
            }
        }
        C786410Ut5.I7(new ACListenerS112S0200000_8(this, c529490Kpf, 6), c529490Kpf.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer numLIZJ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZLL), R.layout.bnb, viewGroup, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.xrk);
        LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.l1n);
        C384050F3z c384050F3z = new C384050F3z();
        Context context = linearLayout.getContext();
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        } else {
            numLIZJ = null;
        }
        c384050F3z.LIZ = numLIZJ;
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        C529490Kpf c529490Kpf = new C529490Kpf(viewTd, linearLayout, textView);
        try {
            View view = c529490Kpf.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529490Kpf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529490Kpf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529490Kpf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529490Kpf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529490Kpf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529490Kpf.class.getName();
        return c529490Kpf;
    }

    public static final void LLLFZ(C523930Kgh c523930Kgh, TikTokMediaModel tikTokMediaModel, int i) {
        if (tikTokMediaModel == null) {
            return;
        }
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    c523930Kgh.LIZLLL.add(tikTokMediaModel);
                    return;
                }
                return;
            }
            c523930Kgh.LIZJ.add(tikTokMediaModel);
            return;
        }
        c523930Kgh.LIZJ.add(tikTokMediaModel);
    }

    public final void LLLI(List list, int i, C530380Kr6 c530380Kr6) {
        C523930Kgh c523930Kgh;
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : (ArrayList) list) {
            try {
                if (c530380Kr6 == C530370Kr5.LIZ) {
                    this.LLILZ.LJIIIZ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id), tikTokMediaModel);
                } else if (this.LLILZ.LJIIJJI() > 0) {
                    TikTokMediaModel tikTokMediaModelLJ = this.LLILZ.LJ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id));
                    TikTokMediaModel tikTokMediaModel2 = tikTokMediaModelLJ;
                    if (tikTokMediaModelLJ != null) {
                        this.LLILZ.LJIIJ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id));
                        if (tikTokMediaModel2 != null) {
                            tikTokMediaModel = tikTokMediaModel2;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String str = tikTokMediaModel.albumClass;
            if (str == null || str.length() == 0) {
                str = "";
            }
            HashMap<String, C523930Kgh> map = this.LLILLL;
            if (map == null || (c523930Kgh = map.get(str)) == null) {
                c523930Kgh = new C523930Kgh();
                c523930Kgh.LIZ = str;
                arrayList.add(c523930Kgh);
                HashMap<String, C523930Kgh> map2 = this.LLILLL;
                if (map2 != null) {
                    map2.put(str, c523930Kgh);
                }
            }
            LLLFZ(c523930Kgh, tikTokMediaModel, i);
        }
        this.LLILLJJLI.addAll(arrayList);
        notifyDataSetChanged();
    }
}
