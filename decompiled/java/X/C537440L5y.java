package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.template.TemplateOperationData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.TemplateOperation$updateTemplateOperationResource$1$autoCutDeferred$1", f = "TemplateOperation.kt", l = {227}, m = "invokeSuspend")
public final class C537440L5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Object>>, Object> {
    public int LL;
    public final /* synthetic */ TemplateOperationData LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537440L5y(TemplateOperationData templateOperationData, List<String> list, InterfaceC1364105Vn<? super C537440L5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateOperationData;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537440L5y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLIZ;
        Object obj2;
        C1C7U.LIZ("TemplateOperation@6730.updateTemplateOperationResource$1$autoCutDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.autocutLottie.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(unit);
                C1C7U.LIZIZ("TemplateOperation@6730.updateTemplateOperationResource$1$autoCutDeferred$1");
                return c189200o6M1boximpl;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = (String) C13LP.LJJJLL(this.LLILLL);
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(this.LLILLJJLI.autocutLottie);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List listLJJJJLI = C13LP.LJJJJLI(C13LP.LJJJJIZL(this.LLILLL, 1));
            TemplateOperationData templateOperationData = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (String str2 : (ArrayList) listLJJJJLI) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(templateOperationData.autocutLottie);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C0L62 c0l62 = C0L62.LIZ;
            this.LL = 1;
            objLIZ = c0l62.LIZ(arrayList, strLIZIZ, "temp_auto_cut_album_button_lottie.json", this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TemplateOperation@6730.updateTemplateOperationResource$1$autoCutDeferred$1");
                return objLJFF;
            }
        }
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            obj2 = null;
        } else {
            obj2 = objLIZ;
        }
        DownloadInfo downloadInfo = (DownloadInfo) obj2;
        if (downloadInfo != null) {
            C0L62.LIZ.getClass();
            ReentrantLock reentrantLock = C0L62.LIZJ;
            reentrantLock.lock();
            try {
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                c2137908Zd.LIZLLL(C0L62.LIZLLL("auto_cut_album_button_lottie.json"));
                c2137908Zd.LJIIIZ(downloadInfo.getTargetFilePath(), C0L62.LIZLLL("auto_cut_album_button_lottie.json"));
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0L62.LIZ.getClass();
                C0L62.LIZJ.unlock();
                throw th;
            }
        }
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("TemplateOperation@6730.updateTemplateOperationResource$1$autoCutDeferred$1");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
