package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817010xNr extends AbstractC1817020xNs {
    public C11JF LLJJIJIIJIL;
    public SceneryContent LLJJIJIL;
    public boolean LLJJJ;
    public final C394501g7 LLJJJIL;
    public C0GZW LLJJJJ;

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public int getLayoutId() {
        return R.layout.g25;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIILJJIL() {
        ImageContent imageContent;
        List urls;
        SceneryContent sceneryContent = this.LLJJIJIL;
        if (sceneryContent == null || (imageContent = sceneryContent.imageContent) == null) {
            return;
        }
        this.LLJJJ = false;
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        C0GZW c0gzw = this.LLJJJJ;
        if (c0gzw != null) {
            C500260Jjc.LJLJLLL(iLJIIZILJ, c0gzw);
        }
        int i = sceneryContent.sceneryType;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C0GZW c0gzw2 = this.LLJJJJ;
                if (c0gzw2 != null) {
                    c0gzw2.setMaskEnabled(true);
                }
                C0GZW c0gzw3 = this.LLJJJJ;
                if (c0gzw3 != null) {
                    c0gzw3.setFadeStartPercent(0.5f);
                }
                int iLIZIZ = (int) C497740JfY.LIZIZ(227.0f);
                C0GZW c0gzw4 = this.LLJJJJ;
                if (c0gzw4 != null) {
                    C500260Jjc.LJJZ(iLIZIZ, c0gzw4);
                }
            } else if (i == 3) {
                C0GZW c0gzw5 = this.LLJJJJ;
                if (c0gzw5 != null) {
                    c0gzw5.setMaskEnabled(false);
                }
                int iLJIILLIIL = C497740JfY.LJIILLIIL();
                C0GZW c0gzw6 = this.LLJJJJ;
                if (c0gzw6 != null) {
                    C500260Jjc.LJJZ(iLJIILLIIL, c0gzw6);
                }
            }
            C1817230xOD c1817230xOD = new C1817230xOD(this);
            Bitmap bitmap = imageContent.LIZ;
            if (bitmap != null) {
                C0GZW c0gzw7 = this.LLJJJJ;
                if (c0gzw7 != null) {
                    c0gzw7.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
                }
                c1817230xOD.invoke();
                return;
            }
            ImageModel imageModel = imageContent.image;
            String str = (imageModel == null || (urls = imageModel.getUrls()) == null) ? null : (String) C13LP.LJJJLL(urls);
            boolean zLIZJ = C1819620xS4.LIZJ(str);
            if (zLIZJ || str == null || str.length() == 0) {
                LJIILL(imageContent, zLIZJ, c1817230xOD);
            } else {
                C1819620xS4.LIZIZ(str, new C1817160xO6(this, imageContent, c1817230xOD));
            }
        }
    }

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public final void LJFF() {
        getConfig().LJII = 0.0f;
        getConfig().LJIIIIZZ = 0.0f;
        C397101gX.LIZ(this);
        float f = getConfig().LJIJJLI;
        float f2 = getConfig().LJIL;
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        if (f2 <= 0.8f) {
            getConfig().LJIJJLI = 1.0f;
            getConfig().LJIL = f2 * (1.0f / f);
            getConfig().LJIJI = 0.5f;
            getConfig().LJIJJ = getConfig().LJIL / 2.0f;
            return;
        }
        float fMax = Math.max(1.0f / f, 1.0f / f2);
        getConfig().LJIJJLI = f * fMax;
        getConfig().LJIL = f2 * fMax;
        getConfig().LJIJI = 0.5f;
        getConfig().LJIJJ = 0.5f;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIIZ() {
        View contentView = getContentView();
        this.LLJJJJ = contentView != null ? (C0GZW) contentView.findViewById(R.id.u1f) : null;
    }

    @Override // X.AbstractC1817020xNs
    public long getCurrentBoardIdentifier() {
        return getBoardId();
    }

    @Override // X.AbstractC1817020xNs
    public boolean getAutoNotifyViewUpdated() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1817020xNs, X.InterfaceC395901gL
    public C394501g7 getConfig() {
        return this.LLJJJIL;
    }

    public final SceneryContent getSceneryContent() {
        return this.LLJJIJIL;
    }

    public C1817010xNr(Context context) {
        super(context, null);
        this.LLJJJIL = new C394501g7(EnumC389301fH.WIDGET, false, false, true, 0.0f, 1073741722);
    }

    public final void setSceneryContent(SceneryContent sceneryContent) {
        this.LLJJIJIL = sceneryContent;
    }

    @Override // X.AbstractC1817020xNs
    public final void LJIIJ(C1816930xNj c1816930xNj, DataChannel dataChannel) {
        C394501g7 config = getConfig();
        config.LJJI = c1816930xNj.LIZIZ;
        config.LJFF = c1816930xNj.LIZJ;
        BoardItem boardItem = c1816930xNj.LIZ;
        config.LJJII = boardItem.boardItemLayout;
        config.LJJIII = c1816930xNj.LIZLLL;
        boolean z = true;
        if (!boardItem.matting) {
            z = false;
        }
        config.LJI = z;
        this.LLJJIJIL = boardItem.sceneryContent;
        super.LJIIJ(c1816930xNj, dataChannel);
        getConfig().LJJIIZ = 1.0f;
        setPositionState(new C1817350xOP(new BoardItemPosition()));
    }

    public final void LJIILL(final ImageContent imageContent, final boolean z, final Function0<Unit> function0) {
        final String uri;
        final String str;
        Integer numValueOf;
        final long hostRoomId = getHostRoomId();
        final long groupId = getGroupId();
        final long boardId = getBoardId();
        ImageModel imageModel = imageContent.image;
        if (imageModel == null || (uri = imageModel.getUri()) == null) {
            uri = "";
        }
        if (!z) {
            EnumC1145540fuq enumC1145540fuq = EnumC1145540fuq.IMAGE;
            try {
                C1145500fum c1145500fumLJI = C1145410fud.LJI(hostRoomId, groupId);
                if (c1145500fumLJI != null) {
                    c1145500fumLJI.LJIILL(boardId, enumC1145540fuq, uri);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        SceneryContent sceneryContent = this.LLJJIJIL;
        if (sceneryContent != null && (numValueOf = Integer.valueOf(sceneryContent.sceneryType)) != null && numValueOf.intValue() == 3) {
            str = "image_background";
        } else {
            str = "scenery";
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final String str2 = uri;
        final String str3 = str;
        this.LLJJIJIIJIL = (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xNw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1325710kbR[] c1325710kbRArrLIZ;
                C1325710kbR c1325710kbR;
                BitmapDrawable bitmapDrawable;
                ImageContent imageContent2;
                C1C7U.LIZ("SceneryBoard@5203.loadBackgroundImage$2");
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    C1145410fud.LIZLLL(hostRoomId, groupId, boardId, EnumC1145540fuq.IMAGE, -51, "image_fetch_fail:null_bitmap", uri);
                } else {
                    SceneryContent sceneryContent2 = this.getSceneryContent();
                    if (sceneryContent2 != null && (imageContent2 = sceneryContent2.imageContent) != null) {
                        imageContent2.LIZ = bitmap;
                    }
                    C1817010xNr c1817010xNr = this;
                    C0GZW c0gzw = c1817010xNr.LLJJJJ;
                    if (c0gzw != null) {
                        Bitmap bitmap2 = imageContent.LIZ;
                        if (bitmap2 != null) {
                            bitmapDrawable = new BitmapDrawable(c1817010xNr.getResources(), bitmap2);
                        } else {
                            bitmapDrawable = null;
                        }
                        c0gzw.setImageDrawable(bitmapDrawable);
                    }
                    if (z) {
                        long j = hostRoomId;
                        long j2 = groupId;
                        long j3 = boardId;
                        EnumC1145540fuq enumC1145540fuq2 = EnumC1145540fuq.IMAGE;
                        String str4 = uri;
                        try {
                            C1145500fum c1145500fumLJI2 = C1145410fud.LJI(j, j2);
                            if (c1145500fumLJI2 != null) {
                                c1145500fumLJI2.LJIILIIL(j3, enumC1145540fuq2, str4);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    } else {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 < 0) {
                            jCurrentTimeMillis2 = 0;
                        }
                        ImageModel imageModel2 = imageContent.image;
                        final C1145560fus c1145560fus = new C1145560fus(hostRoomId, groupId, boardId, jCurrentTimeMillis2, uri);
                        if (imageModel2 != null && (c1325710kbRArrLIZ = C1121670fIL.LIZ(imageModel2)) != null && (c1325710kbR = (C1325710kbR) C13LQ.LJJIFFI(c1325710kbRArrLIZ)) != null) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                            final AbstractC1321260kUG abstractC1321260kUGLJIIIIZZ = C1322200kVm.LIZ().LJIIIIZZ(c1325710kbR, null);
                            C786410Ut5.LJLIIL(3000L, bPEAHandler, new Runnable() { // from class: X.0NAl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("BoardImageSizeFetcher@bb0f.fetch$1");
                                    try {
                                        C589560NAk.LIZ(atomicBoolean, bPEAHandler, abstractC1321260kUGLJIIIIZZ, c1145560fus, null);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("BoardImageSizeFetcher@bb0f.fetch$1");
                                }
                            });
                            abstractC1321260kUGLJIIIIZZ.LIZJ(new C0HWE<C1323050kX9<InterfaceC1327060kdc>>() { // from class: X.0kTA
                                @Override // X.C0HWE
                                public final void LJ(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
                                    C589560NAk.LIZ(atomicBoolean, bPEAHandler, abstractC1321260kUGLJIIIIZZ, c1145560fus, null);
                                }

                                @Override // X.C0HWE
                                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
                                    Integer numValueOf2;
                                    InterfaceC1327060kdc interfaceC1327060kdc;
                                    if (!interfaceC1320200kSY.LIZ()) {
                                        return;
                                    }
                                    C1323050kX9<InterfaceC1327060kdc> result = interfaceC1320200kSY.getResult();
                                    if (result != null && (interfaceC1327060kdc = result.get()) != null) {
                                        numValueOf2 = Integer.valueOf(interfaceC1327060kdc.size());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    C1323050kX9.LJII(result);
                                    C589560NAk.LIZ(atomicBoolean, bPEAHandler, abstractC1321260kUGLJIIIIZZ, c1145560fus, numValueOf2);
                                }
                            }, C822700WPc.LL);
                        } else {
                            c1145560fus.invoke(null);
                        }
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    C1817010xNr c1817010xNr2 = this;
                    C0GZW c0gzw2 = c1817010xNr2.LLJJJJ;
                    if (c0gzw2 != null) {
                        c0gzw2.setImageDrawable(new BitmapDrawable(c1817010xNr2.getResources(), bitmap));
                    }
                    this.LJIIJJI(jElapsedRealtime2, str, null);
                }
                function0.invoke();
                C1C7U.LIZIZ("SceneryBoard@5203.loadBackgroundImage$2");
            }
        }, new C09JN() { // from class: X.0xNv
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("SceneryBoard@5203.loadBackgroundImage$3");
                Throwable th2 = (Throwable) obj;
                long j = hostRoomId;
                long j2 = groupId;
                long j3 = boardId;
                EnumC1145540fuq enumC1145540fuq2 = EnumC1145540fuq.IMAGE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image_fetch_fail:");
                if (th2 == null || (message = th2.getMessage()) == null) {
                    message = "unknown";
                }
                sbLIZ.append(message);
                C1145410fud.LIZLLL(j, j2, j3, enumC1145540fuq2, -51, C2188811AlT.LIZIZ(sbLIZ), str2);
                this.LJIIJJI(SystemClock.elapsedRealtime() - jElapsedRealtime, str3, th2);
                C1C7U.LIZIZ("SceneryBoard@5203.loadBackgroundImage$3");
            }
        });
    }
}
