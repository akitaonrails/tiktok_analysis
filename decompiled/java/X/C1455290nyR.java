package X;

import Y.ARunnableS122S0100000_22;
import Y.AkS483S0100000_22;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0nyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455290nyR implements InterfaceC1455590nyv {
    public static final int LLILLJJLI = 8;
    public final ConcurrentHashMap<AbstractC1456460o0K, Runnable> LL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1455590nyv
    public void zv2(AbstractC1456460o0K abstractC1456460o0K, Runnable runnable) {
        if (!C286510BKv.LIZ()) {
            C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ().LJFF(new ARunnableS122S0100000_22(runnable, 117));
        } else {
            this.LL.put(abstractC1456460o0K, runnable);
            C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ().LJFF(new ARunnableS122S0100000_22(this, 118));
        }
    }

    @Override // X.InterfaceC1455590nyv
    public void TA(InterfaceC1452170ntP interfaceC1452170ntP, final VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0, final Function0<Unit> function02) {
        String extra;
        Float fLJIIIIZZ;
        boolean z;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        C856570Xix c856570XixLJIIJ = C0CHQ.LIZ().getPublishService().LJIIJ();
        final C1455340nyW c1455340nyWLIZJ = c856570XixLJIIJ.LIZJ();
        c1455340nyWLIZJ.LIZJ();
        function0.invoke();
        if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
            extra = mainTrack.getExtra("biz_ugc_template_cover_time");
        } else {
            extra = null;
        }
        if (C298990Bnl.LIZ() && C123100dR.LIZ(extra) && extra != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra);
        } else {
            fLJIIIIZZ = null;
        }
        Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel, false, fLJIIIIZZ, true, 2);
        if (C860050XoZ.LIZ(videoPublishEditModel, false)) {
            c856570XixLJIIJ.LIZ = true;
            c856570XixLJIIJ.LIZ().LIZJ();
            z = true;
        } else {
            z = false;
        }
        if (pairLJJIIJZLJL != null) {
            C0MH8 c0mh8 = C0MH8.LIZ;
            c0mh8.getClass();
            c0mh8.LIZ(videoPublishEditModel, new CoverNewItem(C0MH8.LJIIIIZZ(videoPublishEditModel), pairLJJIIJZLJL.getFirst(), 2, null, 0L, Boolean.TRUE, null, 88, null), false);
            C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel);
            c1456230nzx.LIZ.LJIIIIZZ = interfaceC1452170ntP;
            c1456230nzx.LIZ.LJFF = pairLJJIIJZLJL.getSecond().intValue();
            String first = pairLJJIIJZLJL.getFirst();
            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
            c1457050o1H.LIZIZ = first;
            c1457050o1H.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nyw
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str) {
                    c1455340nyWLIZJ.LIZLLL(null);
                    function02.invoke();
                    C201955140j.LJ(str);
                }
            };
            c1457050o1H.LIZJ = new C0MBV() { // from class: X.0nyg
                @Override // X.C0MBV
                public final void LIZLLL() {
                    CopyOnWriteArrayList<CoverNewItem> newCoverList;
                    InterfaceC1456360o0A interfaceC1456360o0A = c1455340nyWLIZJ;
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    interfaceC1456360o0A.LIZLLL((coverPublishModel == null || (newCoverList = coverPublishModel.getNewCoverList()) == null) ? null : (CoverNewItem) C13LP.LJJLIIIJL(newCoverList));
                    function02.invoke();
                }
            };
            if (z) {
                c1457050o1H.LJIIJJI = false;
                c1457050o1H.LJIJJ = true;
                c1457050o1H.LJII = new AwS388S0200000_22(c1457050o1H, (C1457050o1H) pairLJJIIJZLJL, (Pair<String, Integer>) c856570XixLJIIJ, (InterfaceC856560Xiw) 274);
            }
            C1457060o1I.LIZIZ(c1457050o1H);
            return;
        }
        c1455340nyWLIZJ.LIZLLL(null);
        function02.invoke();
    }

    @Override // X.InterfaceC1455590nyv
    public void gy0(final InterfaceC1452170ntP interfaceC1452170ntP, final C1456350o09 c1456350o09, Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function1<? super Bitmap, Bitmap> function12) {
        Executor executor;
        final String str = c1456350o09.LIZ;
        final int i = c1456350o09.LIZIZ;
        if (interfaceC1452170ntP != null && str.length() != 0) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            function0.invoke();
            Callable callable = new Callable() { // from class: X.0nyc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("ExtraCoverFrameServiceImpl@b4d4.asyncExtractCover$1");
                    InterfaceC1452170ntP interfaceC1452170ntP2 = interfaceC1452170ntP;
                    final String str2 = str;
                    int i2 = i;
                    Function1<Bitmap, Bitmap> function13 = function12;
                    AkS483S0100000_22 akS483S0100000_22 = function13 != null ? new AkS483S0100000_22(function13, 6) : null;
                    final Function1<String, Unit> function14 = function1;
                    MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator(interfaceC1452170ntP2, str2, i2, akS483S0100000_22, new InterfaceC1457180o1U() { // from class: X.0nzB
                        @Override // X.InterfaceC1457180o1U
                        public final void onError(int i3, String str3) {
                            C2354709Kn.LJIJJLI(str2);
                            function14.invoke(null);
                            C201955140j.LJ(str3);
                        }
                    }, new C0MBV() { // from class: X.0o07
                        @Override // X.C0MBV
                        public final void LIZLLL() {
                            function14.invoke(str2);
                        }
                    }, c1456350o09.LIZJ, false, true, jCurrentTimeMillis);
                    C1C7U.LIZIZ("ExtraCoverFrameServiceImpl@b4d4.asyncExtractCover$1");
                    return mvChooseCoverBitmapCreator;
                }
            };
            if (c1456350o09.LIZLLL) {
                executor = C15O7.LJI;
            } else {
                executor = C15O7.LJIIIIZZ;
            }
            C15O7.LIZIZ(callable, executor, null);
            return;
        }
        function1.invoke(null);
    }
}
