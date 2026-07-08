package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.layout.UploadLayoutRouter$goVideoEditPage$3", f = "UploadLayoutChooseResultImpl.kt", l = {607}, m = "invokeSuspend")
public final class C534020Kwy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C534030Kwz LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ ArrayList<VideoSegment> LLILZ;
    public final /* synthetic */ ArrayList<ImportVideoInfo> LLILZIL;
    public final /* synthetic */ Cut2EditTransferModel LLILZLL;
    public final /* synthetic */ List<MediaModel> LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C534020Kwy(C534030Kwz c534030Kwz, Intent intent, ArrayList<VideoSegment> arrayList, ArrayList<ImportVideoInfo> arrayList2, Cut2EditTransferModel cut2EditTransferModel, List<? extends MediaModel> list, C013C c013c, InterfaceC1364105Vn<? super C534020Kwy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c534030Kwz;
        this.LLILLL = intent;
        this.LLILZ = arrayList;
        this.LLILZIL = arrayList2;
        this.LLILZLL = cut2EditTransferModel;
        this.LLIZ = list;
        this.LLIZLLLIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534020Kwy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJJJJL = obj;
        C1C7U.LIZ("UploadLayoutRouter@3b0c.goVideoEditPage$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJJJL);
            C534030Kwz c534030Kwz = this.LLILLJJLI;
            Intent intent = this.LLILLL;
            ArrayList<VideoSegment> arrayList = this.LLILZ;
            ArrayList<ImportVideoInfo> arrayList2 = this.LLILZIL;
            Cut2EditTransferModel cut2EditTransferModel = this.LLILZLL;
            List<MediaModel> list = this.LLIZ;
            boolean z = this.LLIZLLLIL.element;
            Iterator<MediaModel> it2 = list.iterator();
            long j = 0;
            while (it2.hasNext()) {
                j += it2.next().duration;
            }
            this.LL = 1;
            objLJJJJL = c534030Kwz.LJJJJL(intent, arrayList, null, arrayList2, cut2EditTransferModel, false, list, z, false, (int) j, null, this);
            if (objLJJJJL == objLJFF) {
                C1C7U.LIZIZ("UploadLayoutRouter@3b0c.goVideoEditPage$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadLayoutRouter@3b0c.goVideoEditPage$3");
        return objLJJJJL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
