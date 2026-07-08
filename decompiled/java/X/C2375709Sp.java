package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.09Sp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$fetchMultiAudio$2", f = "TTSFragment.kt", l = {746}, m = "invokeSuspend")
public final class C2375709Sp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ ArrayList<NLETrackSlot> LLIZ;
    public final /* synthetic */ NLETrackSlot LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ ArrayList<C386290FCp> LLJI;
    public final /* synthetic */ CoroutineExceptionHandler LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2375709Sp(TTSFragment tTSFragment, String str, String str2, String str3, String str4, ArrayList<NLETrackSlot> arrayList, NLETrackSlot nLETrackSlot, int i, ArrayList<C386290FCp> arrayList2, CoroutineExceptionHandler coroutineExceptionHandler, InterfaceC1364105Vn<? super C2375709Sp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSFragment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = arrayList;
        this.LLIZLLLIL = nLETrackSlot;
        this.LLJ = i;
        this.LLJI = arrayList2;
        this.LLJIJIL = coroutineExceptionHandler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2375709Sp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.fetchMultiAudio$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C2375609So c2375609So = new C2375609So(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c2375609So) == objLJFF) {
                C1C7U.LIZIZ("TTSFragment@b180.fetchMultiAudio$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.fetchMultiAudio$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
