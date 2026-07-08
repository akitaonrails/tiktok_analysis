package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530080Kqc extends C09AY implements Function2<Integer, Integer, Unit> {
    public final /* synthetic */ C530070Kqb LL;
    public final /* synthetic */ MediaModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<C529210KpD, Unit> LLIZ;
    public final /* synthetic */ Function1<C529210KpD, Unit> LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C530080Kqc(C530070Kqb c530070Kqb, MediaModel mediaModel, boolean z, long j, long j2, boolean z2, Function1<? super C529210KpD, Unit> function1, Function1<? super C529210KpD, Unit> function12, long j3, String str, String str2) {
        super(2);
        this.LL = c530070Kqb;
        this.LLILLJJLI = mediaModel;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = z2;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        this.LLJ = j3;
        this.LLJI = str;
        this.LLJIJIL = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        int i;
        int i2;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (iIntValue != 0) {
            C530070Kqb c530070Kqb = this.LL;
            C530110Kqf c530110Kqf = new C530110Kqf(c530070Kqb.LIZ);
            c530110Kqf.LIZIZ = c530070Kqb.LIZJ;
            c530110Kqf.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, true, false, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        } else {
            MediaModel mediaModel = this.LLILLJJLI;
            int i3 = mediaModel.width;
            int i4 = mediaModel.height;
            if (i3 < i4) {
                i = i4;
            } else {
                i = i3;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            boolean z = false;
            if (i3 > 1100) {
                if (C2495709qF.LIZ()) {
                    if (TextUtils.equals(this.LL.LIZLLL, "enter_from_multi")) {
                        i2 = -8;
                    } else {
                        if (i3 > 2160 || i > 4096) {
                            i2 = -10;
                        }
                        C530070Kqb.LIZJ(this.LL, this.LLILLJJLI, this.LLIZ, this.LLJ, this.LLJI, this.LLIZLLLIL);
                    }
                    if (i2 != 0) {
                        Function1<C529210KpD, Unit> function1 = this.LLIZLLLIL;
                        this.LL.getClass();
                        function1.invoke(new C529210KpD(i2, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LLJ, this.LLJI, "", false));
                    } else {
                        C530070Kqb.LIZJ(this.LL, this.LLILLJJLI, this.LLIZ, this.LLJ, this.LLJI, this.LLIZLLLIL);
                    }
                } else {
                    Function1<C529210KpD, Unit> function12 = this.LLIZLLLIL;
                    this.LL.getClass();
                    function12.invoke(new C529210KpD(-5, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LLJ, this.LLJI, "", false));
                }
            } else {
                if (TextUtils.equals("video/mp4", this.LLJIJIL) || TextUtils.equals("video/quicktime", this.LLJIJIL)) {
                    z = true;
                }
                if (iIntValue2 == C005W.CdcType_H264.ordinal() && z) {
                    Function1<C529210KpD, Unit> function13 = this.LLIZ;
                    this.LL.getClass();
                    function13.invoke(new C529210KpD(0, "LocalVideoLegalChecker", System.currentTimeMillis() - this.LLJ, this.LLJI, "", true));
                } else {
                    C530070Kqb.LIZJ(this.LL, this.LLILLJJLI, this.LLIZ, this.LLJ, this.LLJI, this.LLIZLLLIL);
                }
            }
        }
        return Unit.LIZ;
    }
}
