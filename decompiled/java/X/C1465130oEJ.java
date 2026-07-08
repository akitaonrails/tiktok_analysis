package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.music.logic.EditorProAIMusicPanelHelper$initMusicViewAndShow$2$1$result$1$1", f = "EditorProAIMusicPanelHelper.kt", l = {398}, m = "invokeSuspend")
public final class C1465130oEJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C204607154j>, Object> {
    public int LL;
    public final /* synthetic */ C1465110oEH LLILLJJLI;
    public final /* synthetic */ C991110btl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465130oEJ(C1465110oEH c1465110oEH, C991110btl c991110btl, InterfaceC1364105Vn<? super C1465130oEJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1465110oEH;
        this.LLILLL = c991110btl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1465130oEJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProAIMusicPanelHelper@a844.initMusicViewAndShow$2$1$result$1$1");
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
            InterfaceC1465140oEK interfaceC1465140oEK = this.LLILLJJLI.LJIIIIZZ;
            if (interfaceC1465140oEK != null) {
                String str = this.LLILLL.LIZIZ;
                this.LL = 1;
                obj = interfaceC1465140oEK.TC0(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EditorProAIMusicPanelHelper@a844.initMusicViewAndShow$2$1$result$1$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("EditorProAIMusicPanelHelper@a844.initMusicViewAndShow$2$1$result$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C204607154j> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
