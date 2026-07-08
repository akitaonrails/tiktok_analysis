package X;

import Y.ACListenerS22S0301000_16;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import com.ss.android.ugc.aweme.model.AnoleVideoDataModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012920cSw extends AbstractC683590Qrd<AnoleProductModel> implements InterfaceC1010530cP5, InterfaceC1013160cTK, InterfaceC497601wk {
    public final /* synthetic */ C054G LL;
    public final InterfaceC1012840cSo LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final AnonymousClass0950 LLILZ;
    public final C369801c8 LLILZIL;
    public final C1012900cSu LLILZLL;
    public final C1012930cSx LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LLILLJJLI;
    }

    public C1012920cSw(C1012380cS4 c1012380cS4) {
        int size;
        List<AnoleProductModel> productList;
        super(false);
        this.LL = C2296808zG.LIZIZ();
        this.LLILLJJLI = c1012380cS4;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LLILZIL = new C369801c8(250L);
        this.LLILZLL = new C1012900cSu(c1012380cS4.LIZ.LLJLLIL);
        this.LLIZ = new C1012930cSx(new C1012880cSs(this));
        AnoleAdCardModel anoleAdCardModel = c1012380cS4.LIZ.LLJLIL;
        if (anoleAdCardModel != null && (productList = anoleAdCardModel.getProductList()) != null) {
            size = productList.size();
        } else {
            size = 4;
        }
        this.LLJ = size;
    }

    @Override // X.InterfaceC1013160cTK
    public final void LJJIZ(int i, AbstractC1013000cT4 abstractC1013000cT4) {
        List<AbstractC1013020cT6> arrayList;
        Integer numValueOf;
        if (Intrinsics.LJFF(abstractC1013000cT4, C1013110cTF.LIZ)) {
            C1012930cSx c1012930cSx = this.LLIZ;
            C1012890cSt c1012890cSt = (C1012890cSt) C13LP.LJJJLZIJ(i, c1012930cSx.LL.getStats());
            if (c1012890cSt != null && (numValueOf = Integer.valueOf(c1012890cSt.LIZIZ)) != null) {
                final int iIntValue = numValueOf.intValue();
                final int iIntValue2 = numValueOf.intValue();
                final int iIntValue3 = numValueOf.intValue();
                arrayList = C1697810uHb.LJIILJJIL(C1013140cTI.LIZIZ, C1013150cTJ.LIZIZ, new AbstractC1013020cT6(iIntValue) { // from class: X.0cTB
                    {
                        super((int) (iIntValue * 0.25f));
                    }
                }, new AbstractC1013020cT6(iIntValue2) { // from class: X.0cTC
                    {
                        super((int) (iIntValue2 * 0.5f));
                    }
                }, new AbstractC1013020cT6(iIntValue3) { // from class: X.0cTD
                    {
                        super((int) (iIntValue3 * 0.75f));
                    }
                });
            } else {
                arrayList = new ArrayList<>(C13BV.INSTANCE);
            }
            c1012930cSx.LLIZLLLIL = arrayList;
            if (i == 0) {
                c1012930cSx.LLILZIL++;
                c1012930cSx.LLIZ = new ArrayList(c1012930cSx.LLILLL);
                c1012930cSx.LL.yc().LIZLLL(c1012930cSx.LLILZIL);
            }
            c1012930cSx.LL.LIZ().LJIIIZ(c1012930cSx.LLILZIL, i);
            c1012930cSx.LIZ(i, 0);
            LLLFZ((i + 1) % this.LLJ, C1013240cTS.LIZ);
            return;
        }
        if (abstractC1013000cT4 instanceof C1012990cT3) {
            int i2 = ((C1012990cT3) abstractC1013000cT4).LIZ;
            this.LLIZ.LIZ(i, i2);
            C1012930cSx c1012930cSx2 = this.LLIZ;
            int i3 = c1012930cSx2.LLILZIL;
            int i4 = c1012930cSx2.LLILZLL;
            C1012900cSu c1012900cSu = this.LLILZLL;
            c1012900cSu.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("whole break: playOrder is ");
            sbLIZ.append(i3);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ));
            C1012860cSq c1012860cSq = c1012900cSu.LIZ;
            C1012830cSn.LIZ.getClass();
            c1012860cSq.logAd(C1012830cSn.LIZLLL, new AwS30S0001000_16(i4, 33));
            C1012900cSu c1012900cSu2 = this.LLILZLL;
            c1012900cSu2.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("product break: playOrder is ");
            sbLIZ2.append(i3);
            sbLIZ2.append(", duration is ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", videoIndex is ");
            sbLIZ2.append(i);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ2));
            c1012900cSu2.LIZ.logAd(C1012830cSn.LJIILJJIL, new AwS30S0001000_16(i2, 36));
            C1012930cSx c1012930cSx3 = this.LLIZ;
            c1012930cSx3.LLILZIL = 0;
            c1012930cSx3.LLILZ = 0;
            c1012930cSx3.LLILZLL = 0;
            ((ArrayList) c1012930cSx3.LLIZ).clear();
            c1012930cSx3.LLIZLLLIL.clear();
            return;
        }
        if (Intrinsics.LJFF(abstractC1013000cT4, C1013100cTE.LIZ)) {
            C1012930cSx c1012930cSx4 = this.LLIZ;
            if (i >= 0) {
                if (i < c1012930cSx4.LL.getStats().size()) {
                    c1012930cSx4.LIZ(i, ((C1012890cSt) ListProtector.get(c1012930cSx4.LL.getStats(), i)).LIZIZ);
                    c1012930cSx4.LL.LIZ().LJIIIIZZ(c1012930cSx4.LLILZIL, i, ((C1012890cSt) ListProtector.get(c1012930cSx4.LL.getStats(), i)).LIZIZ);
                    if (i + 1 == c1012930cSx4.LL.getStats().size()) {
                        c1012930cSx4.LL.yc().LIZJ(c1012930cSx4.LLILZIL, c1012930cSx4.LLILLJJLI);
                        c1012930cSx4.LLIZ = new ArrayList(c1012930cSx4.LLILLL);
                    }
                }
            } else {
                c1012930cSx4.getClass();
            }
            int i5 = i + 1;
            LLLFZ(i5 % this.LLJ, C1013270cTV.LIZ);
            this.LLIZLLLIL = i5 % this.LLJ;
            return;
        }
        if (abstractC1013000cT4 instanceof C1012960cT0) {
            int i6 = ((C1012960cT0) abstractC1013000cT4).LIZ;
            this.LLIZ.LIZ(i, i6);
            C1012930cSx c1012930cSx5 = this.LLIZ;
            int i7 = c1012930cSx5.LLILZIL;
            int i8 = c1012930cSx5.LLILZLL;
            C1012900cSu c1012900cSu3 = this.LLILZLL;
            c1012900cSu3.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("whole pause: playOrder is ");
            sbLIZ3.append(i7);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ3));
            C1022620cia.LIZ("playback", Log.getStackTraceString(new Throwable("onPause")));
            C1012860cSq c1012860cSq2 = c1012900cSu3.LIZ;
            C1012830cSn.LIZ.getClass();
            c1012860cSq2.logAd(C1012830cSn.LJ, new AwS30S0001000_16(i8, 34));
            C1012900cSu c1012900cSu4 = this.LLILZLL;
            c1012900cSu4.getClass();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("product pause: playOrder is ");
            sbLIZ4.append(i7);
            sbLIZ4.append(", duration is ");
            sbLIZ4.append(i6);
            sbLIZ4.append(", videoIndex is ");
            sbLIZ4.append(i);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ4));
            c1012900cSu4.LIZ.logAd(C1012830cSn.LJIILL, new AwS30S0001000_16(i6, 37));
            return;
        }
        if (abstractC1013000cT4 instanceof C1012970cT1) {
            int i9 = ((C1012970cT1) abstractC1013000cT4).LIZ;
            this.LLIZ.LIZ(i, i9);
            C1012930cSx c1012930cSx6 = this.LLIZ;
            int i10 = c1012930cSx6.LLILZIL;
            int i11 = c1012930cSx6.LLILZLL;
            C1012900cSu c1012900cSu5 = this.LLILZLL;
            c1012900cSu5.getClass();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("whole resume: playOrder is ");
            sbLIZ5.append(i10);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ5));
            C1022620cia.LIZ("playback", Log.getStackTraceString(new Throwable("onResume")));
            C1012860cSq c1012860cSq3 = c1012900cSu5.LIZ;
            C1012830cSn.LIZ.getClass();
            c1012860cSq3.logAd(C1012830cSn.LJFF, new AwS30S0001000_16(i11, 40));
            C1012900cSu c1012900cSu6 = this.LLILZLL;
            c1012900cSu6.getClass();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("product resume: playOrder is ");
            sbLIZ6.append(i10);
            sbLIZ6.append(", duration is ");
            sbLIZ6.append(i9);
            sbLIZ6.append(", videoIndex is ");
            sbLIZ6.append(i);
            C1022620cia.LIZ("playback", C2188811AlT.LIZIZ(sbLIZ6));
            c1012900cSu6.LIZ.logAd(C1012830cSn.LJIILLIIL, new AwS30S0001000_16(i9, 39));
            return;
        }
        if (abstractC1013000cT4 instanceof C1012980cT2) {
            this.LLIZ.LIZ(i, ((C1012980cT2) abstractC1013000cT4).LIZ);
            return;
        }
        throw new C1954807lC();
    }

    public final void LLLFZ(int i, AbstractC1013190cTN abstractC1013190cTN) {
        C23250099c.LIZLLL(this, null, null, new C1012940cSy(this, i, abstractC1013190cTN, null), 3);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1013300cTY c1013300cTY;
        AnoleProductModel anoleProductModel;
        int i2;
        int width;
        int i3;
        String videoUrl;
        C1013460cTo c1013460cTo = null;
        if (viewHolder instanceof C1013300cTY) {
            c1013300cTY = (C1013300cTY) viewHolder;
        } else {
            c1013300cTY = null;
        }
        List<T> list = this.mmItems;
        if (list != 0) {
            anoleProductModel = (AnoleProductModel) C13LP.LJJJLZIJ(i, list);
        } else {
            anoleProductModel = null;
        }
        if (c1013300cTY != null && anoleProductModel != null) {
            C1012860cSq logger = this.LLILLJJLI.getLogger();
            logger.getClass();
            C1012830cSn.LIZ.getClass();
            logger.logAd(C1012830cSn.LJIIJJI, new AwS124S0101000_16(i, anoleProductModel, 21));
            Bitmap bitmap = this.LLILLJJLI.LIZJ().get(Integer.valueOf(i));
            c1013300cTY.LLJ = null;
            c1013300cTY.LLIZLLLIL = i;
            String dynamicCover = anoleProductModel.getDynamicCover();
            if (bitmap != null) {
                c1013300cTY.LLILZ.setImageBitmap(bitmap);
            } else if (dynamicCover != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZG(dynamicCover, c1013300cTY, null), 3);
            }
            c1013300cTY.LLILZLL.setText(anoleProductModel.getProductTitle());
            TuxIconView tuxIconView = c1013300cTY.LLIZ;
            Integer buttonType = anoleProductModel.getButtonType();
            int height = 0;
            if (buttonType != null && buttonType.intValue() == 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i2);
            AnoleVideoDataModel videoData = anoleProductModel.getVideoData();
            if (videoData != null) {
                width = videoData.getWidth();
                height = videoData.getHeight();
            } else {
                width = 0;
            }
            FrameLayout frameLayout = c1013300cTY.LLILZIL;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C1697930uHn.LIZIZ(c1013300cTY.LLJI))));
            if (width != 0 && height != 0) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((C1697930uHn.LIZIZ(c1013300cTY.LLJI) / width) * height)));
            } else {
                if (c1013300cTY.LLJI) {
                    i3 = 142;
                } else {
                    i3 = 207;
                }
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            }
            C786410Ut5.a6(frameLayout, layoutParams);
            String itemId = anoleProductModel.getItemId();
            AnoleVideoDataModel videoData2 = anoleProductModel.getVideoData();
            if (videoData2 != null) {
                videoUrl = videoData2.getVideoUrl();
            } else {
                videoUrl = null;
            }
            if (itemId != null && videoUrl != null) {
                c1013460cTo = new C1013460cTo(new C1012950cSz(itemId, videoUrl, c1013300cTY, i));
            }
            c1013300cTY.LLJ = c1013460cTo;
            if (i == 0 && c1013460cTo != null) {
                c1013460cTo.LIZLLL();
            }
            C786410Ut5.I7(new ACListenerS22S0301000_16(c1013300cTY, anoleProductModel, i, this, 1), c1013300cTY.itemView);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C1013300cTY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.qv, viewGroup, false), this, this.LLILZ);
    }
}
