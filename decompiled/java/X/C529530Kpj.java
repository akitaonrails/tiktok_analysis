package X;

import Y.AfS172S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529530Kpj extends AbstractC529520Kpi implements InterfaceC528130KnT {
    public final C0L9H LLJIJIL;
    public final Function0<Boolean> LLJILJIL;
    public int LLJILJILJ = -1;
    public InterfaceC529190KpB LLJILLL;
    public C0P0T LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC529520Kpi
    public final int LLLILZLLLI() {
        int i = 0;
        for (TikTokMediaModel tikTokMediaModel : this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (LLLLIIIILLL(tikTokMediaModel)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIILL() {
        InterfaceC529190KpB interfaceC529190KpB;
        int i = this.LLJILJILJ;
        if (i < 0 || i >= this.LLILLJJLI.size() || (interfaceC529190KpB = this.LLJILLL) == null) {
            return;
        }
        interfaceC529190KpB.LIZ((CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, this.LLJILJILJ));
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLLIILLL() {
        return this.LLJIJIL == C0L9H.LIGHT ? R.drawable.a_i : R.drawable.a_h;
    }

    public final int LLLLLJLJLL() {
        int itemCount = getItemCount();
        for (int i = this.LLJILJILJ + 1; i < itemCount; i++) {
            if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i))) {
                return i;
            }
        }
        int i2 = this.LLJILJILJ;
        for (int i3 = 0; i3 < i2; i3++) {
            if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i3))) {
                return i3;
            }
        }
        return -1;
    }

    public final void LLLLLLL() {
        int i = this.LLJILJILJ;
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        LLLLIILL();
        notifyItemChanged(this.LLJILJILJ);
    }

    public static final TikTokMediaModel LLLLLJIL() {
        TikTokMediaModel tikTokMediaModelLIZ = C527250Km3.LIZ().LIZ(UUID.randomUUID().toString(), EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL("");
        tikTokMediaModelLIZ.thumbnail = "";
        tikTokMediaModelLIZ.duration = 0L;
        tikTokMediaModelLIZ.type = 4;
        return tikTokMediaModelLIZ;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        int itemCount = getItemCount();
        int i = this.LLJILJILJ;
        return (i < 0 || i >= itemCount) ? LLLILZLLLI() : i;
    }

    @Override // X.AbstractC529520Kpi
    public final CutSameVideoImageExtraData LLLJIL() {
        int iLLLILZLLLI = LLLILZLLLI();
        if (iLLLILZLLLI < 0 || iLLLILZLLLI >= this.LLILLJJLI.size()) {
            return null;
        }
        return (CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, iLLLILZLLLI);
    }

    @Override // X.InterfaceC528130KnT
    public final void LLJIJIL(C528070KnN c528070KnN) {
        this.LLJILLL = c528070KnN;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int i = this.LLJILJILJ;
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.LLJILJILJ;
            ListProtector.remove(this.LL, i2);
            ListProtector.add(this.LL, i2, tikTokMediaModel);
            this.LLJILJILJ = LLLLLJLJLL();
            notifyItemChanged(i2);
            LLLLLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLI(List<? extends TikTokMediaModel> list) {
        int iLLLILZLLLI = LLLILZLLLI();
        int itemCount = getItemCount();
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < itemCount) {
            ArrayList arrayList = (ArrayList) list;
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = i + iLLLILZLLLI;
                    if (i3 < itemCount) {
                        ListProtector.remove(this.LL, i3);
                        ListProtector.add(this.LL, i3, obj);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJILJILJ = LLLILZLLLI();
            notifyItemRangeChanged(iLLLILZLLLI, arrayList.size() + 1);
            LLLLLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIIIIL(C528030KnJ c528030KnJ) {
        TuxTextView tuxTextView = new TuxTextView(c528030KnJ.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(72);
        c528030KnJ.addView(tuxTextView);
        Iterator<CutSameVideoImageExtraData> it2 = this.LLILLJJLI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            float fFloatValue = new BigDecimal(it2.next().extraDuration / 1000.0f).setScale(1, 1).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.1f;
            }
            tuxTextView.setText(c528030KnJ.getContext().getResources().getString(2131837857, Float.valueOf(fFloatValue)));
            tuxTextView.measure(0, 0);
            if (tuxTextView.getMeasuredWidth() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) {
                C786410Ut5.LJJJLZIJ(tuxTextView, c528030KnJ);
                this.LLJJI = true;
                break;
            }
        }
        C786410Ut5.LJJJLZIJ(tuxTextView, c528030KnJ);
        this.LLJJI = false;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LL, i)).LJFF(), tikTokMediaModel.LJFF()) && TextUtils.equals(((TikTokMediaModel) ListProtector.get(this.LL, i)).LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                if (i >= 0) {
                    int i2 = this.LLJILJILJ;
                    this.LLJILJILJ = i;
                    LLLLIILL();
                    this.LL.remove(tikTokMediaModel);
                    ListProtector.add(this.LL, i, LLLLLJIL());
                    notifyItemChanged(i);
                    if (i2 >= 0 && i2 < getItemCount()) {
                        notifyItemChanged(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLILI(List<? extends TikTokMediaModel> list) {
        super.LLLLILI(list);
        this.LLJILJILJ = LLLILZLLLI();
        LLLLLLL();
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        int i = 0;
        while (true) {
            if (i < size) {
                String str = ((MediaModel) ListProtector.get(this.LL, i)).id;
                str.toString();
                String str2 = ((MediaModel) tikTokMediaModel).id;
                str2.toString();
                if (TextUtils.equals(str, str2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LLJILJILJ;
        if (i2 == i) {
            return;
        }
        if (i2 < 0 || i2 >= size) {
            i2 = -1;
        }
        if (i != -1) {
            this.LLJILJILJ = i;
            notifyItemChanged(i);
            LLLLIILL();
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
        }
    }

    public final long LLLLLL(int i) {
        if (!LLLLLLIL(i)) {
            return 0L;
        }
        return ((CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, i)).extraDuration;
    }

    public final boolean LLLLLLIL(int i) {
        if (C580130Mp9.LIZ(this.LLILLJJLI) || i < 0 || i >= this.LLILLJJLI.size() || ListProtector.get(this.LLILLJJLI, i) == null) {
            return false;
        }
        return true;
    }

    public C529530Kpj(C0L9H c0l9h, Function0 function0) {
        this.LLJIJIL = c0l9h;
        this.LLJILJIL = function0;
    }

    @Override // X.AbstractC529520Kpi
    public final void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.LL.size() && adapterPosition2 < this.LL.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            ListProtector.add(this.LL, adapterPosition2, ListProtector.remove(this.LL, adapterPosition));
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIILIL(int i, int i2) {
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                this.LL.add(LLLLLJIL());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 >= 0 && i2 < i) {
            this.LLJILJILJ = i2;
        }
        LLLLIILL();
        notifyDataSetChanged();
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C529600Kpq c529600Kpq;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        String str = null;
        if ((viewHolder instanceof C529600Kpq) && (c529600Kpq = (C529600Kpq) viewHolder) != null) {
            final TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LL, i);
            C529620Kps c529620Kps = (C529620Kps) viewHolder;
            c529600Kpq.I5(tikTokMediaModel, c529620Kps, i);
            Context context = c529620Kps.itemView.getContext();
            int i2 = 8;
            C786410Ut5.LJLLLLLL(8, c529600Kpq.LLJJIII);
            C786410Ut5.LLLLZLL(c529600Kpq.LLILZIL, 0);
            if (tikTokMediaModel != null) {
                tikTokMediaModel.clipDuration = c529600Kpq.LLJJJ.LLLLLL(i);
            }
            int iIntValue = -1;
            if (c529600Kpq.LLJJJ.LLLLIIIILLL(tikTokMediaModel)) {
                if (tikTokMediaModel != null) {
                    tikTokMediaModel.canClip = false;
                }
                C786410Ut5.LJLLLLLL(8, c529600Kpq.LLIZ);
                C786410Ut5.LJLLLLLL(8, c529600Kpq.LLIZLLLIL);
                ViewGroup.LayoutParams layoutParams5 = c529600Kpq.LLILZIL.getLayoutParams();
                if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                    layoutParams4.gravity = 17;
                }
                C529530Kpj c529530Kpj = c529600Kpq.LLJJJ;
                if (c529530Kpj.LLLLLLIL(i)) {
                    str = ((CutSameVideoImageExtraData) ListProtector.get(c529530Kpj.LLILLJJLI, i)).materialType;
                }
                if (Intrinsics.LJFF(str, "video")) {
                    c529600Kpq.LLJIJIL.setIconRes(R.raw.icon_video_fill);
                    C339190DRl.LIZLLL(c529600Kpq.LLJIJIL);
                } else if (Intrinsics.LJFF(str, "image")) {
                    c529600Kpq.LLJIJIL.setIconRes(R.raw.icon_image_alt_1_fill);
                    C339190DRl.LIZLLL(c529600Kpq.LLJIJIL);
                } else {
                    C339190DRl.LIZIZ(c529600Kpq.LLJIJIL);
                }
                TuxTextView tuxTextView = c529600Kpq.LLILZIL;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxTextView.setTextColor(iIntValue);
                View view = c529600Kpq.LLJ;
                if (i == c529600Kpq.LLJJJ.LLJILJILJ) {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view);
            } else {
                C786410Ut5.LJLLLLLL(0, c529600Kpq.LLIZ);
                C339190DRl.LIZIZ(c529600Kpq.LLJIJIL);
                TuxTextView tuxTextView2 = c529600Kpq.LLILZIL;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                tuxTextView2.setTextColor(iIntValue);
                if (tikTokMediaModel != null) {
                    if (tikTokMediaModel.isFromRecord) {
                        final float f = (tikTokMediaModel.height / tikTokMediaModel.width) * c529600Kpq.LLJJIJIIJIL;
                        AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kqj
                            @Override // X.InterfaceC300801Eo
                            public final void subscribe(InterfaceC2329309At<Bitmap> interfaceC2329309At) {
                                final C11KT c11kt = (C11KT) interfaceC2329309At;
                                VEUtils.getVideoFrames(tikTokMediaModel.LJFF(), new int[]{0}, c529600Kpq.LLJJIJIIJIL, (int) f, false, new InterfaceC1286300jZs() { // from class: X.0LC3
                                    @Override // X.InterfaceC1286300jZs
                                    public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                                        if (!bitmapCreateBitmap.isRecycled()) {
                                            c11kt.onSuccess(bitmapCreateBitmap);
                                            return false;
                                        }
                                        c11kt.tryOnError(new NullPointerException());
                                        return false;
                                    }
                                });
                            }
                        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS172S0100000_3(c529600Kpq.LLILLL, 14), new C09JN() { // from class: X.00QT
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("UnifiedTemplateVideoImageMixedAdapter$UnifiedTemplateVideoImageMixedViewHolder@1132.loadRecordCover$3");
                                C1C7U.LIZIZ("UnifiedTemplateVideoImageMixedAdapter$UnifiedTemplateVideoImageMixedViewHolder@1132.loadRecordCover$3");
                            }
                        });
                    }
                    if (!tikTokMediaModel.LJIIJ() && !tikTokMediaModel.isFromRecord && tikTokMediaModel.duration > tikTokMediaModel.clipDuration) {
                        C786410Ut5.LJLLLLLL(0, c529600Kpq.LLIZLLLIL);
                        ViewGroup.LayoutParams layoutParams6 = c529600Kpq.LLILZIL.getLayoutParams();
                        if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                            layoutParams3.gravity = 80;
                        }
                        tikTokMediaModel.canClip = true;
                    } else {
                        C786410Ut5.LJLLLLLL(8, c529600Kpq.LLIZLLLIL);
                        ViewGroup.LayoutParams layoutParams7 = c529600Kpq.LLILZIL.getLayoutParams();
                        if ((layoutParams7 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams7) != null) {
                            layoutParams2.gravity = 17;
                        }
                        tikTokMediaModel.canClip = false;
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, c529600Kpq.LLIZLLLIL);
                    ViewGroup.LayoutParams layoutParams8 = c529600Kpq.LLILZIL.getLayoutParams();
                    if ((layoutParams8 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams8) != null) {
                        layoutParams.gravity = 17;
                    }
                }
                C786410Ut5.LJLLLLLL(8, c529600Kpq.LLJ);
            }
            float fLJ = C529980KqS.LJ(c529600Kpq.LLJJJ.LLLLLL(i));
            if (c529600Kpq.LLJJJ.LLJJI) {
                c529600Kpq.LLILZIL.setText(String.valueOf(fLJ));
            } else {
                c529600Kpq.LLILZIL.setText(context.getResources().getString(2131837857, Float.valueOf(fLJ)));
            }
        }
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C529600Kpq c529600Kpq = new C529600Kpq(this, viewGroup);
        try {
            View view = c529600Kpq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529600Kpq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529600Kpq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529600Kpq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529600Kpq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529600Kpq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529600Kpq.class.getName();
        return c529600Kpq;
    }
}
