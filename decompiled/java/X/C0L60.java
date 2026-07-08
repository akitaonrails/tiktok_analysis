package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L60, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.TemplateOperation$downTabLottie$1", f = "TemplateOperation.kt", l = {123}, m = "invokeSuspend")
public final class C0L60 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0L65 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L60(List<String> list, String str, C0L65 c0l65, String str2, String str3, InterfaceC1364105Vn<? super C0L60> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = c0l65;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L60(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        Object obj2;
        C1C7U.LIZ("TemplateOperation@6730.downTabLottie$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = (String) C13LP.LJJJLL(this.LLILLJJLI);
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(this.LLILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List<String> listLJJJJIZL = C13LP.LJJJJIZL(this.LLILLJJLI, 1);
            String str2 = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJIZL, 10));
            for (String str3 : listLJJJJIZL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str3);
                sbLIZ2.append(str2);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C0L62 c0l62 = C0L62.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("temp_");
            sbLIZ3.append(this.LLILZ.LIZ());
            sbLIZ3.append('_');
            sbLIZ3.append(this.LLILZIL);
            sbLIZ3.append("_tab_lottie.json");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            this.LL = 1;
            objLIZ = c0l62.LIZ(arrayList, strLIZIZ, strLIZIZ2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TemplateOperation@6730.downTabLottie$1");
                return objLJFF;
            }
        }
        C0L65 c0l65 = this.LLILZ;
        String str4 = this.LLILZIL;
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            obj2 = null;
        } else {
            obj2 = objLIZ;
        }
        DownloadInfo downloadInfo = (DownloadInfo) obj2;
        if (downloadInfo != null) {
            C0L62.LIZ.getClass();
            ReentrantLock reentrantLockLJI = C0L62.LJI(c0l65, str4);
            reentrantLockLJI.lock();
            try {
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                c2137908Zd.LIZLLL(C0L62.LJII(c0l65, str4));
                c2137908Zd.LJIIIZ(downloadInfo.getTargetFilePath(), C0L62.LJII(c0l65, str4));
                reentrantLockLJI.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLockLJI.unlock();
                throw th;
            }
        }
        C0L65 c0l652 = this.LLILZ;
        String str5 = this.LLILZIL;
        String str6 = this.LLILLL;
        String str7 = this.LLILZLL;
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            Keva repo = Keva.getRepo("template_operation");
            C0L62.LIZ.getClass();
            repo.storeString(C0L62.LJIIIIZZ(c0l652, str5), str6);
            Keva.getRepo("template_operation").storeString(C0L62.LJFF(c0l652, str5), str7);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateOperation@6730.downTabLottie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
