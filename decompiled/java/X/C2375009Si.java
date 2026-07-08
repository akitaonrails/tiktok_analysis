package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$processTtsSucResult$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2375009Si extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375009Si(File file, TTSFragment tTSFragment, int i, int i2, String str, String str2, int i3, String str3, InterfaceC1364105Vn<? super C2375009Si> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
        this.LLILLJJLI = tTSFragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = i3;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375009Si(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.processTtsSucResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        File file = this.LL;
        if (file != null && file.exists()) {
            int iLIZIZ = C141Q.LIZIZ(-1, this.LL.getAbsolutePath());
            TTSFragment tTSFragment = this.LLILLJJLI;
            String str = tTSFragment.LLLII;
            if (str == null) {
                str = null;
            }
            tTSFragment.kT(str, this.LLILZIL, this.LL, iLIZIZ);
            C386320FCs c386320FCs = (C386320FCs) this.LLILLJJLI.LLLFZ.getValue();
            c386320FCs.LIZ.add(this.LL.getAbsolutePath());
            Keva keva = SpeakerCenter.LIZ;
            SpeakerCenter.LJIIIIZZ(this.LLILZIL, this.LLILZLL);
            this.LLILLJJLI.nT(this.LLIZ, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, this.LLILLL, this.LL, iLIZIZ, false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TTSFragment@b180.processTtsSucResult$1");
            return unit;
        }
        this.LLILLJJLI.mT(this.LLILLL, this.LLILZ, "");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.processTtsSucResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
