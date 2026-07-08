package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0o1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457070o1J {
    public final VideoPublishEditModel LIZ;
    public InterfaceC1452170ntP LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public int LJFF;
    public final int LJI;
    public final int LJII;
    public final Bitmap.CompressFormat LJIIIIZZ;
    public final boolean LJIIIZ;
    public C2292908yd LJIIJ;
    public InterfaceC1447630nm5 LJIIJJI;
    public Integer LJIIL;
    public final boolean LJIILIIL;
    public final Function1<Bitmap, Bitmap> LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final EffectTextModel LJIIZILJ;
    public final Function0<Unit> LJIJ;
    public final Function1<? super Bitmap, Unit> LJIJI;
    public final C0MBV LJIJJ;
    public final InterfaceC1457180o1U LJIJJLI;
    public final Function2<? super Bitmap, ? super Boolean, Unit> LJIL;

    public C1457070o1J() {
        throw null;
    }

    public final String toString() {
        return "CoverExtractionRequest(model=" + this.LIZ + ", veEditor=" + this.LIZIZ + ", scene=" + this.LIZJ + ", savePath=" + this.LIZLLL + ", timeStamp=" + this.LJ + ", width=" + this.LJFF + ", height=" + this.LJI + ", quality=" + this.LJII + ", format=" + this.LJIIIIZZ + ", useAI=" + this.LJIIIZ + ", bachTask=" + this.LJIIJ + ", bitmapGenerator=" + this.LJIIJJI + ", smartCoverCount=" + this.LJIIL + ", getCoverWithoutSeek=" + this.LJIILIIL + ", converter=" + this.LJIILJJIL + ", extractFromVideoFile=" + this.LJIILL + ", fromDraftList=" + this.LJIILLIIL + ", effectTextModel=" + this.LJIIZILJ + ", onStart=" + this.LJIJ + ", bitmapListener=" + this.LJIJI + ", successListener=" + this.LJIJJ + ", errorListener=" + this.LJIJJLI + ", onImageCoverFinish=" + this.LJIL + ')';
    }

    public C1457070o1J(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, int i, String str, int i2, int i3, int i4, int i5, Bitmap.CompressFormat compressFormat, boolean z, boolean z2, Function1 function1, boolean z3, boolean z4, EffectTextModel effectTextModel, Function0 function0, Function1 function12, C0MBV c0mbv, InterfaceC1457180o1U interfaceC1457180o1U, Function2 function2, int i6) {
        String str2 = str;
        int i7 = i;
        Function1 function13 = function1;
        boolean z5 = z2;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        int i8 = i5;
        int i9 = i3;
        boolean z6 = z;
        int videoCoverStartTm = i2;
        Function2 function22 = function2;
        InterfaceC1457180o1U interfaceC1457180o1U2 = interfaceC1457180o1U;
        Function1 function14 = function12;
        Function0 function02 = function0;
        EffectTextModel effectTextModel2 = effectTextModel;
        C0MBV c0mbv2 = c0mbv;
        boolean z7 = z3;
        InterfaceC1452170ntP interfaceC1452170ntP2 = (i6 & 2) != 0 ? null : interfaceC1452170ntP;
        i7 = (i6 & 4) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i7;
        str2 = (i6 & 8) != 0 ? null : str2;
        videoCoverStartTm = (i6 & 16) != 0 ? (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT) : videoCoverStartTm;
        i9 = (i6 & 32) != 0 ? -1 : i9;
        int i10 = (i6 & 64) == 0 ? i4 : -1;
        i8 = (i6 & 128) != 0 ? 60 : i8;
        compressFormat2 = (i6 & 256) != 0 ? Bitmap.CompressFormat.PNG : compressFormat2;
        z6 = (i6 & 512) != 0 ? false : z6;
        z5 = (i6 & 8192) != 0 ? false : z5;
        function13 = (i6 & 16384) != 0 ? null : function13;
        z7 = (32768 & i6) != 0 ? false : z7;
        boolean z8 = (65536 & i6) == 0 ? z4 : false;
        effectTextModel2 = (131072 & i6) != 0 ? null : effectTextModel2;
        function02 = (262144 & i6) != 0 ? null : function02;
        function14 = (524288 & i6) != 0 ? null : function14;
        c0mbv2 = (1048576 & i6) != 0 ? null : c0mbv2;
        interfaceC1457180o1U2 = (2097152 & i6) != 0 ? null : interfaceC1457180o1U2;
        function22 = (i6 & 4194304) != 0 ? null : function22;
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC1452170ntP2;
        this.LIZJ = i7;
        this.LIZLLL = str2;
        this.LJ = videoCoverStartTm;
        this.LJFF = i9;
        this.LJI = i10;
        this.LJII = i8;
        this.LJIIIIZZ = compressFormat2;
        this.LJIIIZ = z6;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = z5;
        this.LJIILJJIL = function13;
        this.LJIILL = z7;
        this.LJIILLIIL = z8;
        this.LJIIZILJ = effectTextModel2;
        this.LJIJ = function02;
        this.LJIJI = function14;
        this.LJIJJ = c0mbv2;
        this.LJIJJLI = interfaceC1457180o1U2;
        this.LJIL = function22;
    }
}
