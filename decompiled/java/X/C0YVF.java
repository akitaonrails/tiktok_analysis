package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YVF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamDataRepositoryImpl$markFinished$2", f = "StreamDataRepositoryImpl.kt", l = {130}, m = "invokeSuspend")
public final class C0YVF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YVE LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YVF(C0YVE c0yve, String str, String str2, InterfaceC1364105Vn<? super C0YVF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0yve;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0YVF c0yvf = new C0YVF(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0yvf.LLILLJJLI = obj;
        return c0yvf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        byte[] bArrLLJ;
        C906250Zgt c098200Yq;
        C1C7U.LIZ("StreamDataRepositoryImpl@36bb.markFinished$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Boolean boolValueOf = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLL.getClass();
            InterfaceC870590YDh interfaceC870590YDhLJIIJ = C0YVE.LJIIJ();
            if (interfaceC870590YDhLJIIJ != null) {
                bArrLLJ = interfaceC870590YDhLJIIJ.LLJ(this.LLILZ);
            } else {
                bArrLLJ = null;
            }
            if (bArrLLJ != null) {
                try {
                    c098200Yq = C906250Zgt.ADAPTER.decode(bArrLLJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C906250Zgt c906250Zgt = (C906250Zgt) c098200Yq;
                if (c906250Zgt != null) {
                    StreamingResponseData streamingResponseDataLJ = C906350Zh3.LJ(c906250Zgt, null);
                    List<C906290Zgx> list = c906250Zgt.blocks;
                    ArrayList<StreamBlockComponent> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C906290Zgx> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C906350Zh3.LIZ(it2.next()));
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (StreamBlockComponent streamBlockComponent : arrayList) {
                        BlockUIData.Companion.getClass();
                        arrayList2.add(C906150Zgj.LIZ(streamBlockComponent));
                    }
                    StreamingResponseData streamingResponseDataLIZ = StreamingResponseData.LIZ(streamingResponseDataLJ, null, true, 32639);
                    C0YVE c0yve = this.LLILLL;
                    String str = this.LLILZIL;
                    this.LL = 1;
                    c0yve.getClass();
                    if (C23250099c.LJI(this, C0PEM.LIZJ, new C906170Zgl(streamingResponseDataLIZ, arrayList2, c0yve, str, null)) == objLJFF) {
                        C1C7U.LIZIZ("StreamDataRepositoryImpl@36bb.markFinished$2");
                        return objLJFF;
                    }
                }
            }
        }
        this.LLILLL.getClass();
        InterfaceC870590YDh interfaceC870590YDhLJIIJ2 = C0YVE.LJIIJ();
        if (interfaceC870590YDhLJIIJ2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC870590YDhLJIIJ2.LLII(this.LLILZ, this.LLILZIL, "im_streaming_cancelled", "1"));
        }
        C1C7U.LIZIZ("StreamDataRepositoryImpl@36bb.markFinished$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
