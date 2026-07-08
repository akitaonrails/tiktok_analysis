package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper$parallelDownloadTasks$2$musicDeferred$1", f = "ReplaceDownloadHelper.kt", l = {188}, m = "invokeSuspend")
public final class C1402805eM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MusicBuzModel>, Object> {
    public int LL;
    public final /* synthetic */ C14DL LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C1510705vl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402805eM(C14DL c14dl, Aweme aweme, Context context, C1510705vl c1510705vl, InterfaceC1364105Vn<? super C1402805eM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c14dl;
        this.LLILLL = aweme;
        this.LLILZ = context;
        this.LLILZIL = c1510705vl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1402805eM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$musicDeferred$1");
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
            C14DL c14dl = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            Context context = this.LLILZ;
            C1510705vl c1510705vl = this.LLILZIL;
            this.LL = 1;
            c14dl.getClass();
            C201955140j.LJIILL(C201962140q.LIZIZ, "MusicStripV2", "start download music");
            if (c1510705vl != null) {
                obj = c14dl.LJIIIZ(aweme, context, c1510705vl, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$musicDeferred$1");
                    return objLJFF;
                }
            } else {
                throw new RuntimeException("config is null");
            }
        }
        C1C7U.LIZIZ("ReplaceDownloadHelper@3470.parallelDownloadTasks$2$musicDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MusicBuzModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
