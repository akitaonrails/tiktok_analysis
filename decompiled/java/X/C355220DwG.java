package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$generateMusicBeats$1", f = "MusicBeatGenerator.kt", l = {93, 108, 119, 121, 123, 132, 134, 136, 137}, m = "invokeSuspend")
public final class C355220DwG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AVMusic LL;
    public Object LLILLJJLI;
    public EnumC356040Dxa LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ C355240DwI LLIZ;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, Boolean, List<BeatInfo>, Unit> LLIZLLLIL;
    public final /* synthetic */ EnumC355940DxQ LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function1<List<BeatInfo>, List<BeatInfo>> LLJIJIL;
    public final /* synthetic */ NLESegmentAudio LLJILJIL;
    public final /* synthetic */ Function1<List<BeatInfo>, List<BeatInfo>> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C355220DwG(Function0<Unit> function0, C355240DwI c355240DwI, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super List<BeatInfo>, Unit> interfaceC1631620sYq, EnumC355940DxQ enumC355940DxQ, Function0<Unit> function02, Function1<? super List<BeatInfo>, ? extends List<BeatInfo>> function1, NLESegmentAudio nLESegmentAudio, Function1<? super List<BeatInfo>, ? extends List<BeatInfo>> function12, InterfaceC1364105Vn<? super C355220DwG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = function0;
        this.LLIZ = c355240DwI;
        this.LLIZLLLIL = interfaceC1631620sYq;
        this.LLJ = enumC355940DxQ;
        this.LLJI = function02;
        this.LLJIJIL = function1;
        this.LLJILJIL = nLESegmentAudio;
        this.LLJILJILJ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355220DwG(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355220DwG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
