package X;

import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0IlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475870IlN extends AbstractC21673619ry<C475880IlO> {
    public final Function1<C475860IlM, Unit> LL;
    public final LinkedList<C475860IlM> LLILLJJLI = new LinkedList<>();
    public final ArrayList<C475860IlM> LLILLL = new ArrayList<>();
    public int LLILZ;
    public C475860IlM LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C475870IlN(AwS586S0100000_7 awS586S0100000_7) {
        this.LL = awS586S0100000_7;
    }

    public static final void LLLFZ(C475860IlM c475860IlM) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_click");
        c474500IjALIZ.LJJIIZI(c475860IlM.LJFF);
        String str = CardStruct.IStatusCode.DEFAULT;
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_in_more_list");
        if (c475860IlM.LIZLLL) {
            str = "1";
        }
        c474500IjALIZ.LJJII(str, "is_select");
        c474500IjALIZ.LIZ();
    }

    public final void LLLI(int i) {
        this.LLILZ = i;
        this.LLILZIL = this.LLILLJJLI.get(i);
        Iterator<C475860IlM> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL = false;
        }
        this.LLILLJJLI.get(i).LIZLLL = true;
        notifyDataSetChanged();
    }

    public final void LLLII(List<C475860IlM> list) {
        ArrayList<C475860IlM> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        this.LLILLL.clear();
        this.LLILLL.addAll(arrayList);
        this.LLILLJJLI.clear();
        if (arrayList.size() > 0) {
            if (arrayList.size() <= 5) {
                for (C475860IlM c475860IlM : arrayList) {
                    HashMap map = new HashMap();
                    for (Map.Entry<String, String> entry : c475860IlM.LJFF.entrySet()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                    map.put("extra_list_flag", c475860IlM.LIZIZ);
                    this.LLILLJJLI.add(new C475860IlM(c475860IlM.LIZ, c475860IlM.LIZIZ, c475860IlM.LIZJ, false, false, c475860IlM.LJFF));
                }
                this.LLILLJJLI.get(0).LIZLLL = true;
            } else {
                for (C475860IlM c475860IlM2 : C13LP.LL(arrayList, 4)) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry<String, String> entry2 : c475860IlM2.LJFF.entrySet()) {
                        map2.put(entry2.getKey(), entry2.getValue());
                    }
                    map2.put("extra_list_flag", c475860IlM2.LIZIZ);
                    this.LLILLJJLI.add(new C475860IlM(c475860IlM2.LIZ, c475860IlM2.LIZIZ, c475860IlM2.LIZJ, false, false, map2));
                }
                this.LLILLJJLI.get(0).LIZLLL = true;
                HashMap map3 = new HashMap();
                for (Map.Entry<String, String> entry3 : this.LLILLJJLI.get(0).LJFF.entrySet()) {
                    map3.put(entry3.getKey(), entry3.getValue());
                }
                map3.put("btn_name", "more");
                map3.put("bottombar_content_tag", "more");
                map3.put("extra_list_flag", "more");
                this.LLILLJJLI.add(new C475860IlM(-1L, ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).mM1(), "", false, true, map3));
                this.LLILZ = 0;
                this.LLILZIL = this.LLILLJJLI.get(0);
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return this.LLILLJJLI.get(i).LJ ? 1 : 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < this.LLILLJJLI.size()) {
            C475860IlM c475860IlM = this.LLILLJJLI.get(bindingAdapterPosition);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_show");
            c474500IjALIZ.LJJIIZI(c475860IlM.LJFF);
            String str = CardStruct.IStatusCode.DEFAULT;
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_in_more_list");
            if (c475860IlM.LIZLLL) {
                str = "1";
            }
            c474500IjALIZ.LJJII(str, "is_select");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C475880IlO c475880IlO = (C475880IlO) viewHolder;
        C475860IlM c475860IlM = this.LLILLJJLI.get(i);
        c475880IlO.LLILLL.setText(c475860IlM.LIZIZ);
        c475880IlO.LLILZ.setText(c475860IlM.LIZIZ);
        C475870IlN c475870IlN = c475880IlO.LLIZLLLIL;
        String str = c475860IlM.LIZJ;
        ImageView imageView = c475880IlO.LLILLJJLI;
        c475870IlN.getClass();
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIL = true;
        url.LJJI(imageView);
        if (c475860IlM.LIZLLL) {
            C786410Ut5.LJLLLLLL(0, c475880IlO.LLIZ);
            C786410Ut5.LJLLLLLL(0, c475880IlO.LLILZLL);
            C786410Ut5.LLIL(c475880IlO.LLILLL, 4);
            C786410Ut5.LLIL(c475880IlO.LLILZ, 0);
        } else {
            C786410Ut5.LJLLLLLL(4, c475880IlO.LLIZ);
            C786410Ut5.LJLLLLLL(4, c475880IlO.LLILZLL);
            C786410Ut5.LLIL(c475880IlO.LLILLL, 0);
            C786410Ut5.LLIL(c475880IlO.LLILZ, 4);
        }
        if (c475880IlO.LL == 1) {
            C786410Ut5.LLJJIJIL(c475880IlO.LLILZIL, 0);
            C786410Ut5.I7(new AbS324S0300000_7(c475880IlO.LLIZLLLIL, c475880IlO, c475860IlM, 10), c475880IlO.itemView);
        } else {
            C786410Ut5.LLJJIJIL(c475880IlO.LLILZIL, 4);
            C786410Ut5.I7(new ACListenerS74S0300000_7(c475880IlO, c475880IlO.LLIZLLLIL, c475860IlM, 14), c475880IlO.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C475880IlO c475880IlO = new C475880IlO(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gmo, viewGroup, false), i);
        try {
            View view = c475880IlO.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c475880IlO.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c475880IlO.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C475880IlO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c475880IlO.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c475880IlO.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C475880IlO.class.getName();
        return c475880IlO;
    }
}
