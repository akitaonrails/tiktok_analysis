package X;

import Y.ALAdapterS9S0100000_12;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143800fs2 extends C09AY implements Function2<File, String, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C942410adD LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Rect LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143800fs2(long j, C942410adD c942410adD, String str, Rect rect, C942390adB c942390adB) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = c942410adD;
        this.LLILLL = str;
        this.LLILZ = rect;
        this.LLILZIL = c942390adB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(File file, String str) {
        String str2;
        C1322110kVd c1322110kVd;
        C1295960jpS c1295960jpS;
        File file2 = file;
        if (this.LL != this.LLILLJJLI.LJIIIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drop stale emoji resource, msgId: ");
            sbLIZ.append(this.LL);
            sbLIZ.append(", currentMsgId: ");
            sbLIZ.append(this.LLILLJJLI.LJIIIZ);
            sbLIZ.append(", resourceId: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LJIIIZ("MultiGuestMicSeatEmojiPlayer", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            if (!u.LJIIZILJ(file2.getName(), ".png", true) && u.LJIIZILJ(file2.getName(), ".zip", true)) {
                str2 = "single_lottie";
            } else {
                str2 = "single_image";
            }
            int i = 0;
            if (Intrinsics.LJFF(str2, "single_lottie")) {
                C942410adD c942410adD = this.LLILLJJLI;
                View c1295960jpS2 = c942410adD.LJ;
                if (c1295960jpS2 == null || !(c1295960jpS2 instanceof C1295960jpS)) {
                    c942410adD.LIZLLL(false);
                    c1295960jpS2 = new C1295960jpS(this.LLILLJJLI.LIZJ.getContext());
                }
                c942410adD.LJ = c1295960jpS2;
                this.LLILLJJLI.LIZ(this.LLILZ, this.LL, this.LLILLL);
                View view = this.LLILLJJLI.LJ;
                if ((view instanceof C1295960jpS) && (c1295960jpS = (C1295960jpS) view) != null) {
                    Function0<Unit> function0 = this.LLILZIL;
                    if (Intrinsics.LJFF(str, "loop")) {
                        i = -1;
                    }
                    c1295960jpS.setRepeatCount(i);
                    c1295960jpS.removeAllAnimatorListeners();
                    c1295960jpS.addAnimatorListener(new ALAdapterS9S0100000_12(function0, 47));
                    try {
                        C1292030jj7<C1294720jnS> c1292030jj7LJIILIIL = C1294250jmh.LJIILIIL(null, new ZipInputStream(new C0VSP(file2)), file2.getAbsolutePath());
                        c1292030jj7LJIILIIL.LIZIZ(new C2502109rH(c1295960jpS, 3));
                        c1292030jj7LJIILIIL.LIZ(new C2502109rH(function0, 4));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("load lottie file fail, e: ");
                        sbLIZ2.append(e.getMessage());
                        C20441214yg.LJ("MultiGuestMicSeatEmojiPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } else {
                C942410adD c942410adD2 = this.LLILLJJLI;
                View c1324720kZq = c942410adD2.LJ;
                if (c1324720kZq == null || !(c1324720kZq instanceof C1324720kZq)) {
                    c942410adD2.LIZLLL(false);
                    c1324720kZq = new C1324720kZq(this.LLILLJJLI.LIZJ.getContext());
                }
                c942410adD2.LJ = c1324720kZq;
                View view2 = this.LLILLJJLI.LJ;
                if ((view2 instanceof C1324720kZq) && (c1322110kVd = (C1322110kVd) view2) != null) {
                    c1322110kVd.setImageURI(Uri.fromFile(file2));
                }
                this.LLILLJJLI.LIZ(this.LLILZ, this.LL, this.LLILLL);
                this.LLILZIL.invoke();
            }
        }
        return Unit.LIZ;
    }
}
