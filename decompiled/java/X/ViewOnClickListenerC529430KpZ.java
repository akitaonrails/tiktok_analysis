package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimplyAlbumModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC529430KpZ extends AbstractC21673619ry<C529460Kpc> implements View.OnClickListener {
    public final ArrayList<SimplyAlbumModel> LL = new ArrayList<>();
    public final ArrayList<C529500Kpg> LLILLJJLI = new ArrayList<>();
    public final ArrayList<C523930Kgh> LLILLL;
    public final HashMap<String, C523930Kgh> LLILZ;
    public final C20066713fN<TikTokMediaModel> LLILZIL;
    public int LLILZLL;
    public final Context LLIZ;
    public final LayoutInflater LLIZLLLIL;
    public final InterfaceC529070Koz LLJ;
    public final InterfaceC524610Khn LLJI;
    public C523930Kgh LLJIJIL;
    public C529050Kox LLJILJIL;
    public final String LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;
    public final boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final C523930Kgh LLLIILIL() {
        if (this.LLILLL.size() > 0) {
            return (C523930Kgh) ListProtector.get(this.LLILLL, 0);
        }
        return null;
    }

    public final C523930Kgh LLLIL() {
        if (this.LLILLL.size() <= 1 || ((C523930Kgh) ListProtector.get(this.LLILLL, 1)).LIZ != this.LLJJ) {
            return null;
        }
        return (C523930Kgh) ListProtector.get(this.LLILLL, 1);
    }

    public final void LLLILZLLLI() {
        final ArrayList arrayList = new ArrayList(this.LLILLJJLI);
        final ArrayList<C523930Kgh> arrayList2 = this.LLILLL;
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(arrayList, arrayList2) { // from class: X.0Kpd
            public final List<C529500Kpg> LIZ;
            public final List<C523930Kgh> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = arrayList;
                this.LIZIZ = arrayList2;
            }

            public static boolean LJFF(C529500Kpg c529500Kpg, C523930Kgh c523930Kgh) {
                if (c529500Kpg == null) {
                    if (c523930Kgh == null) {
                        return true;
                    }
                    return false;
                }
                if (c523930Kgh != null) {
                    return Intrinsics.LJFF(c529500Kpg.LIZ, c523930Kgh.LIZ);
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                C529500Kpg c529500Kpg = (C529500Kpg) ListProtector.get(this.LIZ, i);
                C523930Kgh c523930Kgh = (C523930Kgh) ListProtector.get(this.LIZIZ, i2);
                if (!LJFF(c529500Kpg, c523930Kgh)) {
                    return false;
                }
                if (c529500Kpg == null) {
                    if (c523930Kgh != null) {
                        return false;
                    }
                } else if (c523930Kgh == null || c529500Kpg.LIZIZ != c523930Kgh.LIZJ()) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return LJFF((C529500Kpg) ListProtector.get(this.LIZ, i), (C523930Kgh) ListProtector.get(this.LIZIZ, i2));
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                C529500Kpg c529500Kpg = (C529500Kpg) ListProtector.get(this.LIZ, i);
                C523930Kgh c523930Kgh = (C523930Kgh) ListProtector.get(this.LIZIZ, i2);
                Bundle bundle = new Bundle();
                if (!LJFF(c529500Kpg, c523930Kgh)) {
                    bundle.putBoolean("payload_key_album_name", true);
                }
                if (c529500Kpg != null ? c529500Kpg == null || c523930Kgh == null || c529500Kpg.LIZIZ != c523930Kgh.LIZJ() : c523930Kgh != null) {
                    bundle.putBoolean("payload_key_album_size", true);
                }
                if (bundle.isEmpty()) {
                    return null;
                }
                return bundle;
            }
        }, true);
        ArrayList<C523930Kgh> arrayList3 = this.LLILLL;
        this.LLILLJJLI.clear();
        for (C523930Kgh c523930Kgh : arrayList3) {
            this.LLILLJJLI.add(new C529500Kpg(c523930Kgh.LIZ, c523930Kgh.LIZJ()));
        }
        c21341918fZLIZ.LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public final void LLLFZ() {
        if (C0BYL.LIZ()) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MvImageAlbumAdapter#addFromAlbumListForFirstFrameIfNeed, dataList.size = ");
            sbLIZ.append(this.LLILLL.size());
            sbLIZ.append(", albumTotalListForFirstFrame.size = ");
            sbLIZ.append(this.LL.size());
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            for (SimplyAlbumModel simplyAlbumModel : this.LL) {
                if (this.LLILZ.get(simplyAlbumModel.name) == null) {
                    C523930Kgh c523930Kgh = new C523930Kgh();
                    String str = simplyAlbumModel.name;
                    c523930Kgh.LIZ = str;
                    c523930Kgh.LIZIZ = simplyAlbumModel.firstCoverUri;
                    this.LLILZ.put(str, c523930Kgh);
                    this.LLILLL.add(c523930Kgh);
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C523930Kgh c523930Kgh = (C523930Kgh) view.getTag();
        InterfaceC529070Koz interfaceC529070Koz = this.LLJ;
        if (interfaceC529070Koz != null) {
            interfaceC529070Koz.LJJIJ(c523930Kgh, true, this.LLILZLL, true, false, false, this.LLJJIII);
            this.LLJIJIL = c523930Kgh;
        }
    }

    public static final void LLLILZ(int i, C523930Kgh c523930Kgh) {
        if (c523930Kgh == null) {
            return;
        }
        if (i == 4) {
            c523930Kgh.LIZLLL.clear();
        } else if (i == 3) {
            c523930Kgh.LIZJ.clear();
        } else {
            if (i != 1) {
                return;
            }
            c523930Kgh.LIZJ.clear();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((C529460Kpc) viewHolder).I5((C523930Kgh) ListProtector.get(this.LLILLL, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(this.LLIZLLLIL, R.layout.cxi, viewGroup, false);
        C1325000kaI c1325000kaI = (C1325000kaI) viewTd.findViewById(R.id.lkw);
        TextView textView = (TextView) viewTd.findViewById(R.id.kdl);
        TextView textView2 = (TextView) viewTd.findViewById(R.id.kc8);
        C529460Kpc c529460Kpc = new C529460Kpc(viewTd, c1325000kaI, textView, textView2);
        C786410Ut5.I7(this, viewTd);
        if (this.LLJILLL) {
            Integer numLIZ = C1308910kAL.LIZ(R.attr.bm, this.LLIZ);
            if (numLIZ != null) {
                viewTd.setBackgroundColor(numLIZ.intValue());
            }
            Integer numLIZ2 = C1308910kAL.LIZ(R.attr.ee, this.LLIZ);
            if (numLIZ2 != null) {
                textView.setTextColor(numLIZ2.intValue());
            }
            Integer numLIZ3 = C1308910kAL.LIZ(R.attr.eg, this.LLIZ);
            if (numLIZ3 != null) {
                textView2.setTextColor(numLIZ3.intValue());
            }
        }
        c1325000kaI.getHierarchy().LJJIII(C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(10)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c1325000kaI.setBackground(c384050F3z.LIZ(this.LLIZ));
        try {
            View view = c529460Kpc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529460Kpc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529460Kpc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529460Kpc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529460Kpc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529460Kpc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529460Kpc.class.getName();
        return c529460Kpc;
    }

    public static final void LLLI(C523930Kgh c523930Kgh, TikTokMediaModel tikTokMediaModel, int i) {
        if (tikTokMediaModel == null) {
            return;
        }
        if (i == 4) {
            c523930Kgh.LIZLLL.add(tikTokMediaModel);
        } else if (i == 3) {
            c523930Kgh.LIZJ.add(tikTokMediaModel);
        } else {
            if (i != 1) {
                return;
            }
            c523930Kgh.LIZJ.add(tikTokMediaModel);
        }
    }

    public static final void LLLII(C523930Kgh c523930Kgh, List<TikTokMediaModel> list, int i) {
        if (C2401009ay.LIZ(list)) {
            return;
        }
        if (i == 4) {
            c523930Kgh.LIZLLL.addAll(list);
        } else if (i == 3) {
            c523930Kgh.LIZJ.addAll(list);
        } else {
            if (i != 1) {
                return;
            }
            c523930Kgh.LIZJ.addAll(list);
        }
    }

    public final void LLLIIIIL(List list, int i, C530380Kr6 c530380Kr6) {
        TikTokMediaModel tikTokMediaModelLJ;
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : (ArrayList) list) {
            try {
                if (c530380Kr6 == C530370Kr5.LIZ) {
                    this.LLILZIL.LJIIIZ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id), tikTokMediaModel);
                } else if (this.LLILZIL.LJIIJJI() > 0 && (tikTokMediaModelLJ = this.LLILZIL.LJ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id))) != null) {
                    this.LLILZIL.LJIIJ(CastLongProtector.parseLong(((MediaModel) tikTokMediaModel).id));
                    tikTokMediaModel = tikTokMediaModelLJ;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (this.LLJJI) {
                tikTokMediaModel.LJIIJJI();
            }
            String str = tikTokMediaModel.albumClass;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            C523930Kgh c523930Kgh = this.LLILZ.get(str);
            if (c523930Kgh == null) {
                c523930Kgh = new C523930Kgh();
                c523930Kgh.LIZ = str;
                arrayList.add(c523930Kgh);
                this.LLILZ.put(str, c523930Kgh);
            }
            LLLI(c523930Kgh, tikTokMediaModel, i);
        }
        this.LLILLL.addAll(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C529460Kpc c529460Kpc = (C529460Kpc) viewHolder;
        C523930Kgh c523930Kgh = (C523930Kgh) ListProtector.get(this.LLILLL, i);
        if (list.size() == 0) {
            c529460Kpc.I5(c523930Kgh);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) it2.next();
            if (baseBundle != null && !baseBundle.isEmpty()) {
                c529460Kpc.LL.setTag(c523930Kgh);
                for (String str : baseBundle.keySet()) {
                    str.getClass();
                    if (!str.equals("payload_key_album_name")) {
                        if (str.equals("payload_key_album_size")) {
                            c529460Kpc.LLILZ.setText(String.valueOf(c523930Kgh.LIZJ.size() + c523930Kgh.LIZLLL.size()));
                        }
                    } else {
                        c529460Kpc.LLILLL.setText(c523930Kgh.LIZ);
                    }
                }
            } else {
                c529460Kpc.I5(c523930Kgh);
            }
        }
    }

    public ViewOnClickListenerC529430KpZ(Context context, InterfaceC529070Koz interfaceC529070Koz, InterfaceC524610Khn interfaceC524610Khn, boolean z, boolean z2, List list) {
        ArrayList<C523930Kgh> arrayList = new ArrayList<>();
        this.LLILLL = arrayList;
        this.LLILZIL = new C20066713fN<>();
        this.LLJIJIL = null;
        boolean z3 = false;
        this.LLJILLL = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = true;
        this.LLIZ = context;
        this.LLIZLLLIL = C786410Ut5.ne(context);
        this.LLJ = interfaceC529070Koz;
        if (z2) {
            C523290Kff.LIZ.getClass();
            if (C523290Kff.LIZ().getBoolean("has_live_photo_scanned", true)) {
                z3 = true;
            }
        }
        this.LLJJI = z3;
        this.LLJI = interfaceC524610Khn;
        C523930Kgh c523930Kgh = new C523930Kgh();
        String strLIZJ = C540060LGa.LIZJ(context);
        this.LLJILJILJ = strLIZJ;
        c523930Kgh.LIZ = strLIZJ;
        arrayList.add(c523930Kgh);
        c523930Kgh.LJ.addAll(list);
        String string = context.getResources().getString(2131836580);
        this.LLJJ = string;
        if (z3) {
            C523930Kgh c523930Kgh2 = new C523930Kgh();
            c523930Kgh2.LIZ = string;
            C523290Kff.LIZ.getClass();
            String string2 = C523290Kff.LIZ().getString("first_live_photo_item_uri_str", "");
            if (!TextUtils.isEmpty(string2)) {
                c523930Kgh2.LIZIZ = C2471909mP.LJIILIIL(string2);
            }
            arrayList.add(c523930Kgh2);
        }
        this.LLILZ = new HashMap<>();
        for (C523930Kgh c523930Kgh3 : arrayList) {
            this.LLILZ.put(c523930Kgh3.LIZ, c523930Kgh3);
        }
        this.LLJILLL = z;
    }
}
