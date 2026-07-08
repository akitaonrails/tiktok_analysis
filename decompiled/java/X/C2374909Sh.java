package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$downloadAudio$1", f = "TTSFragment.kt", l = {1093, 1101}, m = "invokeSuspend")
public final class C2374909Sh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374909Sh(TTSFragment tTSFragment, int i, int i2, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C2374909Sh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSFragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2374909Sh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        File file;
        Object objLJI = obj;
        C1C7U.LIZ("TTSFragment@b180.downloadAudio$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    file = (File) objLJI;
                    if (file == null && file.exists()) {
                        int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                        int i2 = this.LLILZ;
                        TTSFragment tTSFragment = this.LLILLJJLI;
                        if (i2 != tTSFragment.LLLLLLL) {
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                            return unit;
                        }
                        int i3 = tTSFragment.LLLLIIL;
                        int i4 = this.LLILLL;
                        if (i3 != i4) {
                            C19416910xr c19416910xr = tTSFragment.LLLLILI;
                            if (c19416910xr != null) {
                                c19416910xr.LLLFZ(i4, 1, false);
                            }
                            Unit unit2 = Unit.LIZ;
                            C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                            return unit2;
                        }
                        String str3 = tTSFragment.LLLII;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        tTSFragment.kT(str2, this.LLILZIL, file, iLIZIZ);
                        ((C386320FCs) this.LLILLJJLI.LLLFZ.getValue()).LIZ.add(file.getAbsolutePath());
                        this.LLILLJJLI.nT(0, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, file, iLIZIZ, false);
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                        return unit3;
                    }
                    this.LLILLJJLI.mT(this.LLILLL, this.LLILZ, "");
                    Unit unit4 = Unit.LIZ;
                    C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                    return unit4;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C2374709Sf c2374709Sf = new C2374709Sf(this.LLIZ, this.LLILZIL, this.LLIZLLLIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c2374709Sf);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                return objLJFF;
            }
        }
        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = (TextToSpeechApi.FetchTextAudioResponse) objLJI;
        TextToSpeechApi.TextAudioData data = fetchTextAudioResponse.getData();
        if (data != null) {
            str = data.audio;
        } else {
            str = null;
        }
        if (fetchTextAudioResponse.status_code == 0 && str != null) {
            C1DFB c1dfb2 = C0PEM.LIZJ;
            C2374809Sg c2374809Sg = new C2374809Sg(this.LLILLJJLI, str, null);
            this.LL = 2;
            objLJI = C23250099c.LJI(this, c1dfb2, c2374809Sg);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
                return objLJFF;
            }
            file = (File) objLJI;
            if (file == null) {
            }
            this.LLILLJJLI.mT(this.LLILLL, this.LLILZ, "");
            Unit unit42 = Unit.LIZ;
            C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
            return unit42;
        }
        this.LLILLJJLI.mT(this.LLILLL, this.LLILZ, fetchTextAudioResponse.message);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
