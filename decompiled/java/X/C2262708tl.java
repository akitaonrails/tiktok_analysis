package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getBitmap$2", f = "MixEditingFeatureExtractionTask.kt", l = {600}, m = "invokeSuspend")
public final class C2262708tl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2262608tk LLILLL;
    public final /* synthetic */ C2277408w8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262708tl(C2262608tk c2262608tk, C2277408w8 c2277408w8, InterfaceC1364105Vn<? super C2262708tl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2262608tk;
        this.LLILZ = c2277408w8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2262708tl c2262708tl = new C2262708tl(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2262708tl.LLILLJJLI = obj;
        return c2262708tl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2");
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
            C2262608tk c2262608tk = this.LLILLL;
            List<String> listSingletonList = c2262608tk.LIZLLL;
            if (listSingletonList == null) {
                listSingletonList = Collections.singletonList(c2262608tk.LIZ);
            }
            C2277408w8 c2277408w8 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
            Iterator<String> it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2262808tm(c2277408w8, it2.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2");
                return objLJFF;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
        C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$2");
        return listLJJJJLI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
