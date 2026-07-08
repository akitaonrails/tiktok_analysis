package X;

import android.graphics.Bitmap;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.aigcresult.list.VideoFileFrameExtraction$extractAccurateFileFrame$2", f = "VideoFileFrameExtraction.kt", l = {157}, m = "invokeSuspend")
public final class C353390DtJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C370780EgG> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Size LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353390DtJ(Size size, String str, String str2, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = size;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<C370780EgG> list = this.LLILLL;
        return new C353390DtJ(this.LLILZIL, this.LLILZ, this.LLILZLL, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        C1C7U.LIZ("VideoFileFrameExtraction@e0b3.extractAccurateFileFrame$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Iterable iterable2 = (Iterable) this.LL;
                C155000ia.LIZIZ(obj);
                iterable = iterable2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final List listSynchronizedList = Collections.synchronizedList(new ArrayList());
            InterfaceC370850EgN interfaceC370850EgN = new InterfaceC370850EgN() { // from class: X.0DtK
                @Override // X.InterfaceC370850EgN
                public final void LIZ(C370820EgK c370820EgK, Bitmap bitmap) {
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("extractAccurateFileFrame on Get frame: ");
                    sbLIZ.append(c370820EgK);
                    C201955140j.LIZLLL(c563650M8t, "VideoFileFrameExtraction", C2188811AlT.LIZIZ(sbLIZ));
                    listSynchronizedList.add(bitmap);
                }
            };
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("extractAccurateFileFrame start: ");
            sbLIZ.append(this.LLILLL);
            C201955140j.LIZLLL(c563650M8t, "VideoFileFrameExtraction", C2188811AlT.LIZIZ(sbLIZ));
            C370720EgA c370720EgA = C370720EgA.LIZ;
            String str = this.LLILZ;
            List<C370780EgG> list = this.LLILLL;
            Size size = this.LLILZIL;
            String str2 = this.LLILZLL;
            this.LL = listSynchronizedList;
            this.LLILLJJLI = 1;
            iterable = listSynchronizedList;
            if (c370720EgA.LIZJ(str, "", list, size, interfaceC370850EgN, str2, true, null, this) == objLJFF) {
                C1C7U.LIZIZ("VideoFileFrameExtraction@e0b3.extractAccurateFileFrame$2");
                return objLJFF;
            }
        }
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "VideoFileFrameExtraction", "extractAccurateFileFrame finish");
        List listLLIIII = C13LP.LLIIII(iterable);
        C1C7U.LIZIZ("VideoFileFrameExtraction@e0b3.extractAccurateFileFrame$2");
        return listLLIIII;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
