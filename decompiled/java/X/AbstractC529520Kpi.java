package X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC529520Kpi extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final ArrayList<TikTokMediaModel> LL = new ArrayList<>();
    public ArrayList<CutSameVideoImageExtraData> LLILLJJLI = new ArrayList<>();
    public int LLILLL = -1;
    public int LLILZ = -1;
    public boolean LLILZIL;
    public InterfaceC528100KnQ LLILZLL;
    public Function0<Boolean> LLIZ;
    public boolean LLIZLLLIL;
    public AwS409S0200000_8 LLJ;
    public Map<String, LivePhotoInfo> LLJI;

    public void LLLIIIIL(C528030KnJ c528030KnJ) {
    }

    public abstract void LLLIILIL(int i, int i2);

    public abstract int LLLILZ();

    public abstract int LLLILZLLLI();

    public abstract CutSameVideoImageExtraData LLLJIL();

    public void LLLLIILL() {
    }

    public abstract void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList);

    public Integer LLLLJ(TikTokMediaModel tikTokMediaModel) {
        return null;
    }

    public void LLLLJI(int i) {
    }

    public abstract void LLLLLIL(TikTokMediaModel tikTokMediaModel);

    public float LLLJ() {
        return 8;
    }

    public final List<TikTokMediaModel> LLLL() {
        ArrayList<TikTokMediaModel> arrayList = this.LL;
        ArrayList arrayList2 = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : arrayList) {
            if (!LLLLIIIILLL(tikTokMediaModel)) {
                arrayList2.add(tikTokMediaModel);
            }
        }
        return arrayList2;
    }

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LL.size() + (this.LLIZLLLIL ? 1 : 0);
    }

    public int LLLLIILLL() {
        return C23214097s.LIZ() ? R.drawable.aie : R.drawable.aif;
    }

    public void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int size = this.LL.size();
        this.LL.add(tikTokMediaModel);
        notifyItemInserted(size);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoImageMixedBaseAdapter addMediaData originIndex ");
        sbLIZ.append(tikTokMediaModel.originIndex);
        sbLIZ.append(" selectIndex ");
        sbLIZ.append(tikTokMediaModel.selectIndex);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LLLI(List<? extends TikTokMediaModel> list) {
        this.LL.addAll(list);
        notifyDataSetChanged();
    }

    public void LLLIL(TikTokMediaModel tikTokMediaModel) {
        int iLLLJL;
        if (tikTokMediaModel == null || (iLLLJL = LLLJL(tikTokMediaModel)) == -1) {
            return;
        }
        notifyItemRemoved(iLLLJL);
        this.LL.remove(tikTokMediaModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoImageMixedBaseAdapter deleteMediaData originIndex ");
        sbLIZ.append(tikTokMediaModel.originIndex);
        sbLIZ.append(" selectIndex ");
        sbLIZ.append(tikTokMediaModel.selectIndex);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLJL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r5) {
        /*
            r4 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            int r3 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r3) goto Lb0
            boolean r0 = r5.LJIIL()
            if (r0 == 0) goto L3c
            boolean r0 = r4.LLILZIL
            if (r0 == 0) goto L99
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            java.lang.String r1 = r0.onlineVideoUrl
            java.lang.String r0 = r5.onlineVideoUrl
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lac
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) r0
            java.lang.String r1 = r0.LJIILLIIL()
            java.lang.String r0 = r5.LJIILLIIL()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lac
            return r2
        L3c:
            boolean r0 = r4.LLILZIL
            if (r0 == 0) goto L6d
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            java.lang.String r1 = r0.LJFF()
            java.lang.String r0 = r5.LJFF()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lac
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel) r0
            java.lang.String r1 = r0.LJIILLIIL()
            java.lang.String r0 = r5.LJIILLIIL()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lac
            return r2
        L6d:
            boolean r0 = X.C530690Krb.LIZIZ(r5)
            if (r0 == 0) goto L84
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            java.lang.String r1 = r0.id
            java.lang.String r0 = r5.id
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            goto La9
        L84:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            java.lang.String r1 = r0.LJFF()
            java.lang.String r0 = r5.LJFF()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            goto La9
        L99:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r4.LL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            java.lang.String r1 = r0.onlineVideoUrl
            java.lang.String r0 = r5.onlineVideoUrl
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        La9:
            if (r0 == 0) goto Lac
            return r2
        Lac:
            int r2 = r2 + 1
            goto L7
        Lb0:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC529520Kpi.LLLJL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel):int");
    }

    public final boolean LLLLII(int i) {
        if (this.LLIZLLLIL && i == getItemCount() - 1) {
            return true;
        }
        return false;
    }

    public boolean LLLLIIIILLL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return true;
        }
        if (!C530690Krb.LIZIZ(tikTokMediaModel) && !tikTokMediaModel.LJIIL() && TextUtils.isEmpty(tikTokMediaModel.LJFF()) && TextUtils.isEmpty(tikTokMediaModel.thumbnail)) {
            return true;
        }
        return false;
    }

    public final void LLLLIIL(List<? extends TikTokMediaModel> list) {
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (tikTokMediaModel.LJIILJJIL() || tikTokMediaModel.LJIIJJI()) {
                Iterator<TikTokMediaModel> it2 = this.LL.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i3 = i2 + 1;
                    TikTokMediaModel next = it2.next();
                    if ((next.LJIILJJIL() || next.LJIIJJI()) && Intrinsics.LJFF(tikTokMediaModel, next)) {
                        if (i2 == -1) {
                            break;
                        }
                    } else {
                        i2 = i3;
                    }
                }
                for (TikTokMediaModel tikTokMediaModel2 : this.LL) {
                    int i4 = i + 1;
                    if ((tikTokMediaModel2.LJIILJJIL() || tikTokMediaModel2.LJIIJJI()) && Intrinsics.LJFF(((MediaModel) tikTokMediaModel).id, ((MediaModel) tikTokMediaModel2).id)) {
                        i2 = i;
                        if (i2 > -1) {
                            notifyItemChanged(i2);
                        }
                    } else {
                        i = i4;
                    }
                }
            }
        }
    }

    public void LLLLILI(List<? extends TikTokMediaModel> list) {
        this.LL.clear();
        C19719612Di.LJJI(list, this.LL);
        notifyDataSetChanged();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoImageMixedBaseAdapter setMediaList size ");
        sbLIZ.append(list.size());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (LLLLII(i)) {
            return 30481;
        }
        return super.getItemViewType(i);
    }

    public void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        LLLLL(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public final void LLLII(C529620Kps c529620Kps, Uri uri) {
        InterfaceC1320850kTb controller;
        C1331070kk5 hierarchy;
        if (uri == null) {
            uri = UriProtector.parse("file://");
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJ = C1324670kZl.LJ;
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(C366700EZg.LIZ(56.0d), C366700EZg.LIZ(56.0d));
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        C1322110kVd c1322110kVd = c529620Kps.LLILLL;
        if (c1322110kVd != null) {
            controller = c1322110kVd.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        c1320810kTXLIZJ.LIZLLL = LIZ;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1322110kVd c1322110kVd2 = c529620Kps.LLILLL;
        if (c1322110kVd2 != null) {
            c1322110kVd2.setController(abstractC1320710kTNLIZ);
        }
        C1322110kVd c1322110kVd3 = c529620Kps.LLILLL;
        if (c1322110kVd3 != null && (hierarchy = c1322110kVd3.getHierarchy()) != null) {
            hierarchy.LJIJ(C800330VaR.LIZIZ(c529620Kps.itemView.getContext(), LLLLIILLL()), 1);
        }
    }

    public final void LLLLL(int i, int i2) {
        if (i >= 0 && i < this.LL.size() && i2 >= 0 && i2 < this.LL.size()) {
            notifyItemMoved(i, i2);
            ListProtector.add(this.LL, i2, ListProtector.remove(this.LL, i));
        }
    }

    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C529570Kpn) {
            return;
        }
        C529620Kps c529620Kps = (C529620Kps) viewHolder;
        c529620Kps.I5((TikTokMediaModel) ListProtector.get(this.LL, i), c529620Kps, i);
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c529620Kps;
        if (i == 30481) {
            c529620Kps = new RecyclerView.ViewHolder(this, viewGroup) { // from class: X.0Kpn
                {
                    RoundedFrameLayout roundedFrameLayout;
                    super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyz, viewGroup, false));
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_music_stick_point", true, false) && !C0CHQ.LIZ().getAccountService().LIZ()) {
                        int iLIZIZ = (int) C11VU.LIZIZ(64.0f, viewGroup.getContext());
                        View view = this.itemView;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.width = iLIZIZ;
                        layoutParams.height = iLIZIZ;
                        C786410Ut5.W5(view, layoutParams);
                    }
                    View view2 = this.itemView;
                    if ((view2 instanceof RoundedFrameLayout) && (roundedFrameLayout = (RoundedFrameLayout) view2) != null) {
                        roundedFrameLayout.setRadius((int) C418440Gaw.LIZIZ(Float.valueOf(this.LLLJ())));
                    }
                    C786410Ut5.I7(new AkS80S0100000_8(this, 1), this.itemView);
                }
            };
        } else {
            c529620Kps = new C529620Kps(this, viewGroup);
        }
        try {
            View view = c529620Kps.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529620Kps.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529620Kps.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c529620Kps.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529620Kps.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529620Kps.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c529620Kps.getClass().getName();
        return c529620Kps;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (viewHolder instanceof C529570Kpn) {
            return;
        }
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            C529620Kps c529620Kps = (C529620Kps) viewHolder;
            c529620Kps.S5((TikTokMediaModel) ListProtector.get(this.LL, i), c529620Kps, i);
        }
    }
}
