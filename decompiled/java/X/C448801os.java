package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$resizePictures$2", f = "AutoPickFrameUploadTask.kt", l = {348}, m = "invokeSuspend")
public final class C448801os extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0LKL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448801os(List<String> list, String str, C0LKL c0lkl, InterfaceC1364105Vn<? super C448801os> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = c0lkl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C448801os c448801os = new C448801os(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c448801os.LLILLJJLI = obj;
        return c448801os;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2");
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
            String str = this.LLILZ;
            C0LKL c0lkl = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (String str2 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C448901ot(str2, str, i2, c0lkl, null), 3));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2");
                return objLJFF;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.resizePictures$2");
        return listLJJJJLI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
