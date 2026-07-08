package X;

import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl$fetchBatchTtsAudio$1", f = "TtsReuseServiceImpl.kt", l = {125}, m = "invokeSuspend")
public final class C1364905Vv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<TtsReuseModel> LLILLL;
    public final /* synthetic */ TtsReuseServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364905Vv(List<TtsReuseModel> list, TtsReuseServiceImpl ttsReuseServiceImpl, InterfaceC1364105Vn<? super C1364905Vv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = ttsReuseServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1364905Vv c1364905Vv = new C1364905Vv(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1364905Vv.LLILLJJLI = obj;
        return c1364905Vv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<TtsReuseModel> it3 = this.LLILLL.iterator();
            while (it3.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1365005Vw(it3.next(), this.LLILZ, null), 3));
            }
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
