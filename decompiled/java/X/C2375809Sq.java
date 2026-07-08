package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.09Sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$downloadMultiAudio$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2375809Sq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TTSFragment LL;
    public final /* synthetic */ ArrayList<NLETrackSlot> LLILLJJLI;
    public final /* synthetic */ ArrayList<C386290FCp> LLILLL;
    public final /* synthetic */ CoroutineExceptionHandler LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375809Sq(TTSFragment tTSFragment, ArrayList<NLETrackSlot> arrayList, ArrayList<C386290FCp> arrayList2, CoroutineExceptionHandler coroutineExceptionHandler, String str, String str2, String str3, InterfaceC1364105Vn<? super C2375809Sq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTSFragment;
        this.LLILLJJLI = arrayList;
        this.LLILLL = arrayList2;
        this.LLILZ = coroutineExceptionHandler;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375809Sq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.downloadMultiAudio$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TTSFragment tTSFragment = this.LL;
        tTSFragment.LLLLLILLIL = false;
        tTSFragment.LLLLLJIL = false;
        this.LL.pT(this.LLILLJJLI, this.LLILLJJLI.size(), this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.downloadMultiAudio$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
