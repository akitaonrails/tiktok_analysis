package X;

import Y.ARunnableS127S0100000_27;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.sfv.special.LiveHighlightSpecialCardConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838900xxA extends AbstractC683590Qrd<LiveFragmentDetail> {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final RecyclerView LL;
    public final Function1<LiveFragmentDetail, Unit> LLILLJJLI;
    public final C054G LLILLL;
    public int LLILZ;
    public C1838930xxD LLILZIL;
    public final C01GW LLILZLL;
    public final SparseArray<Bitmap> LLIZ;
    public final AwS641S0100000_27 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C1836630xtV LLJIJIL;

    public final void onDestroy() {
        this.LLJ = false;
        C1836630xtV c1836630xtV = this.LLJIJIL;
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1836630xtV.LJI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = c1836630xtV.LJI;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.release();
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = c1836630xtV.LJI;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.LJJIIZ(c1836630xtV.LJFF);
        }
        c1836630xtV.LJI = null;
        c1836630xtV.LJII.clear();
        c1836630xtV.LJFF = null;
        c1836630xtV.LIZJ = null;
        C2296808zG.LIZJ(this.LLILLL, null);
        C20441214yg.LIZIZ("LiveSfvPostCardListAdapter", "onDestroy");
    }

    public final long LLLFZ() {
        C1836630xtV c1836630xtV = this.LLJIJIL;
        c1836630xtV.getClass();
        LiveFragmentDetail liveFragmentDetail = c1836630xtV.LJ;
        C1838930xxD c1838930xxD = c1836630xtV.LIZJ;
        c1836630xtV.getClass();
        C1836640xtW c1836640xtW = c1836630xtV.LJII.get(C1836630xtV.LIZIZ(liveFragmentDetail, c1838930xxD, 0));
        if (c1836640xtW != null) {
            return c1836640xtW.LIZ();
        }
        return 0L;
    }

    public final void LLLIILIL() {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LL.smoothScrollToPosition(this.LLILZ >= getItemCount() + (-1) ? 0 : this.LLILZ + 1);
        } else {
            HandlerHook.viewPost(this.LL, new ARunnableS127S0100000_27(this, 42));
        }
    }

    public final void LLLI(boolean z) {
        this.LLJ = false;
        C1836630xtV c1836630xtV = this.LLJIJIL;
        if (z) {
            c1836630xtV.LIZIZ = true;
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1836630xtV.LJI;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
        C20441214yg.LIZIZ("LiveSfvPostCardListAdapter", "onPause");
    }

    public final void LLLII(boolean z) {
        C1838930xxD c1838930xxD;
        LiveFragmentDetail liveFragmentDetail;
        InterfaceC1483850oiV playState;
        this.LLJ = true;
        C20441214yg.LIZIZ("LiveSfvPostCardListAdapter", "onResume");
        C1836630xtV c1836630xtV = this.LLJIJIL;
        if (z) {
            c1836630xtV.LIZIZ = false;
        }
        if (!c1836630xtV.LIZIZ) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = c1836630xtV.LJI;
            if (interfaceC1484830ok5 != null && (playState = interfaceC1484830ok5.getPlayState()) != null && playState.isPaused() && Intrinsics.LJFF(c1836630xtV.LIZLLL, c1836630xtV.LJ)) {
                InterfaceC1484830ok5 interfaceC1484830ok52 = c1836630xtV.LJI;
                if (interfaceC1484830ok52 != null) {
                    interfaceC1484830ok52.resume();
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(c1836630xtV.LIZLLL, c1836630xtV.LJ) || (c1838930xxD = c1836630xtV.LIZJ) == null || (liveFragmentDetail = c1836630xtV.LJ) == null) {
                return;
            }
            c1836630xtV.LIZLLL(c1838930xxD, liveFragmentDetail);
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        boolean z = viewHolder instanceof C1838930xxD;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        boolean z = viewHolder instanceof C1838930xxD;
    }

    public C1838900xxA(RecyclerView recyclerView, AwS610S0100000_31 awS610S0100000_31) {
        super(false);
        this.LL = recyclerView;
        this.LLILLJJLI = awS610S0100000_31;
        this.LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLILZLL = C292401Bi.LIZ(AFwS189S0000000_3.get$arr$(800));
        this.LLIZ = new SparseArray<>();
        this.LLIZLLLIL = new AwS641S0100000_27(this, 91);
        this.LLJI = true;
        this.LLJIJIL = new C1836630xtV(new AwS606S0100000_27(this, 361));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLIIIIL(int i, C1838930xxD c1838930xxD) {
        int i2;
        List<T> list;
        LiveFragmentDetail liveFragmentDetail;
        LiveFragmentDetail liveFragmentDetail2;
        String str;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        View childAt;
        InterfaceC1482610ogV interfaceC1482610ogV;
        InterfaceC1483990oij relatedSurfaceHolder;
        Surface surface;
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelectedViewHolder position: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveSfvPostCardListAdapter", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = i;
        this.LLILZIL = c1838930xxD;
        List<T> list2 = this.mmItems;
        if (list2 != 0 && (liveFragmentDetail2 = (LiveFragmentDetail) ListProtector.get(list2, i)) != null) {
            C1836630xtV c1836630xtV = this.LLJIJIL;
            c1836630xtV.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateCurrentVideo, viewHolder: ");
            sbLIZ2.append(c1838930xxD);
            C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            if (c1838930xxD != null) {
                if (Intrinsics.LJFF(c1838930xxD, c1836630xtV.LIZJ) && Intrinsics.LJFF(liveFragmentDetail2, c1836630xtV.LJ)) {
                    C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", "updateCurrentVideo, same item, return");
                } else {
                    InterfaceC1484830ok5 interfaceC1484830ok52 = c1836630xtV.LJI;
                    if (interfaceC1484830ok52 != null) {
                        interfaceC1484830ok52.stop();
                    }
                    C1838930xxD c1838930xxD2 = c1836630xtV.LIZJ;
                    final Function0 function0 = null;
                    if (c1838930xxD2 != null) {
                        LiveFragmentDetail liveFragmentDetail3 = c1838930xxD2.LLIZLLLIL;
                        if (liveFragmentDetail3 != null) {
                            if (LiveHighlightSpecialCardConfig.LIZ().enableScreenShot && c1838930xxD2.LLJI) {
                                LiveFragmentDetail liveFragmentDetail4 = c1838930xxD2.LLIZLLLIL;
                                if (liveFragmentDetail4 != null && Build.VERSION.SDK_INT >= 24 && (childAt = c1838930xxD2.LLILZ.getChildAt(0)) != 0 && childAt.getWidth() > 0 && (childAt instanceof InterfaceC1482610ogV) && (interfaceC1482610ogV = (InterfaceC1482610ogV) childAt) != null && (relatedSurfaceHolder = interfaceC1482610ogV.getRelatedSurfaceHolder()) != null && (surface = relatedSurfaceHolder.getSurface()) != null) {
                                    VideoMetaInfo videoMetaInfo = liveFragmentDetail4.mp4VideoMetaInfo;
                                    if (videoMetaInfo != null) {
                                        j = videoMetaInfo.width;
                                    } else {
                                        j = liveFragmentDetail4.witdh;
                                    }
                                    if (j != 0) {
                                        int iMin = (int) Math.min(720L, j);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, (int) (iMin * (childAt.getHeight() / childAt.getWidth())), Bitmap.Config.RGB_565);
                                        try {
                                            PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0xxB
                                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                                public final void onPixelCopyFinished(int i3) {
                                                    Function0<Unit> function02 = function0;
                                                    if (function02 != null) {
                                                        function02.invoke();
                                                    }
                                                }
                                            };
                                            final Looper mainLooper = Looper.getMainLooper();
                                            C1322890kWt.LIZIZ(surface, bitmapCreateBitmap, onPixelCopyFinishedListener, new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostRecyclerViewHolder$saveScreenShot$2
                                                @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                                                public final boolean sendMessageAtTime(Message message, long j2) {
                                                    Runnable callback = message.getCallback();
                                                    if (callback != null) {
                                                        callback.run();
                                                        return true;
                                                    }
                                                    return true;
                                                }
                                            }, CertProviderManagerKt.findCert("bpea-live_preview_surface_view", 1476435973));
                                            if (bitmapCreateBitmap != null) {
                                                VideoMetaInfo videoMetaInfo2 = liveFragmentDetail3.mp4VideoMetaInfo;
                                                if (videoMetaInfo2 != null && videoMetaInfo2.url != null) {
                                                    c1838930xxD2.LLILLJJLI.invoke(Integer.valueOf(c1838930xxD2.getLayoutPosition()), bitmapCreateBitmap);
                                                }
                                                SmartImageView smartImageView = c1838930xxD2.LLILZIL;
                                                smartImageView.setImageDrawable(new BitmapDrawable(smartImageView.getContext().getResources(), bitmapCreateBitmap));
                                                C339190DRl.LIZLLL(c1838930xxD2.LLILZIL);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                }
                            } else {
                                c1838930xxD2.I5(liveFragmentDetail3);
                            }
                        }
                        c1838930xxD2.LLJI = false;
                    }
                    if (c1836630xtV.LJI == null) {
                        C1478410oZj c1478410oZj = new C1478410oZj();
                        c1478410oZj.LIZIZ = true;
                        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
                        interfaceC1484830ok5LIZJ.LJIILIIL().mute();
                        c1836630xtV.LJI = interfaceC1484830ok5LIZJ;
                    }
                    Intrinsics.LJFF(c1836630xtV.LIZJ, c1838930xxD);
                    C1836620xtU c1836620xtU = c1836630xtV.LJFF;
                    if (c1836620xtU != null && (interfaceC1484830ok5 = c1836630xtV.LJI) != null) {
                        interfaceC1484830ok5.LJJIIZ(c1836620xtU);
                    }
                    c1836630xtV.LIZJ = c1838930xxD;
                    c1836630xtV.LJ = liveFragmentDetail2;
                    VideoMetaInfo videoMetaInfo3 = liveFragmentDetail2.mp4VideoMetaInfo;
                    if (videoMetaInfo3 != null && (str = videoMetaInfo3.url) != null && str.length() > 0 && !c1836630xtV.LIZIZ) {
                        c1836630xtV.LIZLLL(c1838930xxD, liveFragmentDetail2);
                    }
                }
            }
        }
        if (this.LLILZ >= getItemCount() - 1) {
            i2 = 0;
        } else {
            i2 = this.LLILZ + 1;
        }
        if (LiveHighlightSpecialCardConfig.LIZ().enablePreload && (list = this.mmItems) != 0 && (liveFragmentDetail = (LiveFragmentDetail) ListProtector.get(list, i2)) != null) {
            this.LLJIJIL.getClass();
            C1482560ogQ c1482560ogQLIZ = C1836630xtV.LIZ(liveFragmentDetail, i2, 0);
            C582130MsN.LIZ().LJ().getClass();
            C1014030cUj.LIZ.LJIILLIIL(LiveHighlightSpecialCardConfig.LIZ().preloadVideoSize, Collections.singletonList(c1482560ogQLIZ));
        }
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LiveFragmentDetail liveFragmentDetail;
        C1838930xxD c1838930xxD;
        long j;
        long j2;
        List<T> list = this.mmItems;
        C1838930xxD c1838930xxD2 = null;
        if (list != 0 && (liveFragmentDetail = (LiveFragmentDetail) ListProtector.get(list, i)) != null && (viewHolder instanceof C1838930xxD) && (c1838930xxD = (C1838930xxD) viewHolder) != null) {
            Bitmap bitmap = this.LLIZ.get(i);
            c1838930xxD.LLIZLLLIL = liveFragmentDetail;
            VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
            if (videoMetaInfo != null) {
                j = videoMetaInfo.height;
                j2 = videoMetaInfo.width;
            } else {
                j = liveFragmentDetail.height;
                j2 = liveFragmentDetail.witdh;
            }
            C1056680dbW.LIZ.getClass();
            int i2 = C1056680dbW.LJIIIZ;
            if (i2 > 0 && j > 0) {
                int iMin = Math.min((int) (i2 / (j2 / j)), C1056680dbW.LJIIJ);
                ViewGroup.LayoutParams layoutParams = c1838930xxD.itemView.getLayoutParams();
                layoutParams.width = C1056680dbW.LJIIIZ;
                layoutParams.height = C1056680dbW.LJIIJ;
                ViewGroup.LayoutParams layoutParams2 = c1838930xxD.LLIZ.getLayoutParams();
                layoutParams2.width = C1056680dbW.LJIIIZ;
                layoutParams2.height = C1056680dbW.LJIIJ;
                c1838930xxD.LLIZ.setBackgroundColor(-16777216);
                ViewGroup.LayoutParams layoutParams3 = c1838930xxD.LLILZ.getLayoutParams();
                layoutParams3.width = C1056680dbW.LJIIIZ;
                layoutParams3.height = C1056680dbW.LJIIJ;
                ViewGroup.LayoutParams layoutParams4 = c1838930xxD.LLILZIL.getLayoutParams();
                layoutParams4.width = C1056680dbW.LJIIIZ;
                layoutParams4.height = iMin;
                if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams4).gravity = 17;
                }
                if (c1838930xxD.LLILZ.getChildCount() != 0) {
                    View childAt = c1838930xxD.LLILZ.getChildAt(0);
                    ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                    layoutParams5.width = C1056680dbW.LJIIIZ;
                    layoutParams5.height = iMin;
                    if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams5).gravity = 17;
                    }
                    C786410Ut5.W5(childAt, layoutParams5);
                }
            } else {
                Map<String, Object> map = C1338270kvh.LIZ;
            }
            if (bitmap != null) {
                SmartImageView smartImageView = c1838930xxD.LLILZIL;
                smartImageView.setImageDrawable(new BitmapDrawable(smartImageView.getContext().getResources(), bitmap));
                C339190DRl.LIZLLL(c1838930xxD.LLILZIL);
            } else {
                c1838930xxD.I5(liveFragmentDetail);
            }
        }
        if (this.LLILZ == i && !Intrinsics.LJFF(this.LLILZIL, viewHolder) && this.LLJ) {
            if (viewHolder instanceof C1838930xxD) {
                c1838930xxD2 = (C1838930xxD) viewHolder;
            }
            LLLIIIIL(i, c1838930xxD2);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dhf, viewGroup, false);
        viewGroup.findViewById(R.id.wsa);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        C1056680dbW.LIZ.getClass();
        layoutParams.width = C1056680dbW.LJIIIZ;
        layoutParams.height = C1056680dbW.LJIIJ;
        C786410Ut5.W5(viewTd, layoutParams);
        return new C1838930xxD(viewTd, this.LLILLL, this.LLIZLLLIL, this.LLILLJJLI);
    }
}
