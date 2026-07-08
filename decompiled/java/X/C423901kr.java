package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$resizePicturesForAIWithoutSaveFile$2", f = "BaseAIMusicUploadFrameTask.kt", l = {210}, m = "invokeSuspend")
public final class C423901kr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ AbstractC2289508y5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C423901kr(List<String> list, AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C423901kr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C423901kr c423901kr = new C423901kr(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c423901kr.LLILLJJLI = obj;
        return c423901kr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<String> list = this.LLILLL;
            AbstractC2289508y5 abstractC2289508y5 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (String str : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C424001ks(str, abstractC2289508y5, null), 3));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2");
                return objLJFF;
            }
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJJJJLI((Iterable) obj));
        C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.resizePicturesForAIWithoutSaveFile$2");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
