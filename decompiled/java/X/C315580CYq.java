package X;

import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter$setMultiSelectMode$2", f = "SubtitleAdapter.kt", l = {271}, m = "invokeSuspend")
public final class C315580CYq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C384570F5z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315580CYq(C384570F5z c384570F5z, InterfaceC1364105Vn<? super C315580CYq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c384570F5z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315580CYq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubtitleAdapter@e35a.setMultiSelectMode$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("SubtitleAdapter@e35a.setMultiSelectMode$2");
                return objLJFF;
            }
        }
        Iterator<CaptionUtterance> it2 = this.LLILLJJLI.LL.iterator();
        while (it2.hasNext()) {
            it2.next().needAnim = false;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubtitleAdapter@e35a.setMultiSelectMode$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
