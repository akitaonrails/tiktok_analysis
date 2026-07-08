package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS400S0200000_34;
import njp.a;

/* JADX INFO: renamed from: X.1Bmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler$uploadWithoutCheckValid$1", f = "AIGCPictureUploadHandler.kt", l = {151}, m = "invokeSuspend")
public final class C2215211Bmx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public DialogC1390150mHN LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCPictureUploadHandler LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ float LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215211Bmx(AIGCPictureUploadHandler aIGCPictureUploadHandler, Activity activity, long j, Function0<Unit> function0, String str, float f, int i, InterfaceC1364105Vn<? super C2215211Bmx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = aIGCPictureUploadHandler;
        this.LLILZLL = activity;
        this.LLIZ = j;
        this.LLIZLLLIL = function0;
        this.LLJ = str;
        this.LLJI = f;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2215211Bmx c2215211Bmx = new C2215211Bmx(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c2215211Bmx.LLILZ = obj;
        return c2215211Bmx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        DialogC1390150mHN dialogC1390150mHNLIZ;
        long jElapsedRealtime;
        boolean zBooleanValue;
        C20175213ws c20175213ws;
        EnumC20175313wt enumC20175313wt;
        boolean z;
        Object objLJII = obj;
        C1C7U.LIZ("AIGCPictureUploadHandler@a7fd.uploadWithoutCheckValid$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    jElapsedRealtime = this.LLILLJJLI;
                    dialogC1390150mHNLIZ = this.LL;
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                    C155000ia.LIZIZ(objLJII);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJII);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                dialogC1390150mHNLIZ = this.LLILZIL.LIZ(this.LLILZLL, interfaceC497601wk, this.LLIZ, 1, this.LLIZLLLIL);
                C786410Ut5.K4(dialogC1390150mHNLIZ);
                this.LLILZIL.LJIIL = 0.0f;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                C20175213ws c20175213ws2 = C20175213ws.LIZ;
                EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.UPLOAD;
                EnumC20175313wt enumC20175313wt2 = EnumC20175313wt.START;
                this.LLILZIL.getClass();
                C20175213ws.LIZ(c20175213ws2, enumC2215301Bn6, enumC20175313wt2, null, "slow", null, null, 52);
                AIGCPictureUploadHandler aIGCPictureUploadHandler = this.LLILZIL;
                List<String> listSingletonList = Collections.singletonList(this.LLJ);
                AIGCPictureUploadHandler aIGCPictureUploadHandler2 = this.LLILZIL;
                Map<String, String> map = aIGCPictureUploadHandler2.LJIIIIZZ;
                AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(aIGCPictureUploadHandler2, dialogC1390150mHNLIZ, 0);
                this.LLILZ = interfaceC497601wk;
                this.LL = dialogC1390150mHNLIZ;
                this.LLILLJJLI = jElapsedRealtime;
                this.LLILLL = 1;
                objLJII = aIGCPictureUploadHandler.LJII(listSingletonList, map, awS400S0200000_34, this);
                if (objLJII == objLJFF) {
                    C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.uploadWithoutCheckValid$1");
                    return objLJFF;
                }
            }
            zBooleanValue = ((Boolean) objLJII).booleanValue();
            c20175213ws = C20175213ws.LIZ;
            EnumC2215301Bn6 enumC2215301Bn62 = EnumC2215301Bn6.UPLOAD;
            if (zBooleanValue) {
                enumC20175313wt = EnumC20175313wt.SUCCESS;
            } else {
                enumC20175313wt = EnumC20175313wt.FAIL;
            }
            this.LLILZIL.getClass();
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn62, enumC20175313wt, C2286608xc.LJFF(SystemClock.elapsedRealtime() - jElapsedRealtime), "slow", null, null, 48);
            if (!zBooleanValue) {
                this.LLILZIL.LJFF(1, "uploading_failure", false);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJFF("lzw", "Coroutine cancelled");
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.uploadWithoutCheckValid$1");
            return unit;
        }
        if (zBooleanValue && (!this.LLILZIL.LJIIIIZZ.isEmpty())) {
            EnumC2215301Bn6 enumC2215301Bn63 = EnumC2215301Bn6.TOTAL;
            EnumC20175313wt enumC20175313wt3 = EnumC20175313wt.SUCCESS;
            this.LLILZIL.getClass();
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn63, enumC20175313wt3, null, "slow", null, null, 52);
            this.LLILZIL.LJFF(1, null, true);
            AIGCPictureUploadHandler aIGCPictureUploadHandler3 = this.LLILZIL;
            InterfaceC2215281Bn4 interfaceC2215281Bn4 = aIGCPictureUploadHandler3.LIZJ;
            String str = this.LLJ;
            float f = this.LLJI;
            int i2 = this.LLJIJIL;
            ArrayList arrayList = new ArrayList();
            String str2 = (String) ((LinkedHashMap) aIGCPictureUploadHandler3.LJIIIIZZ).get(str);
            if (str2 != null) {
                arrayList.add(AIGCPictureUploadHandler.LIZIZ(f, str, i2, str2));
            }
            interfaceC2215281Bn4.LIZIZ(arrayList);
            C786410Ut5.LJIIJJI(dialogC1390150mHNLIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.uploadWithoutCheckValid$1");
            return unit2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPhotoCaptured: .uploadResult");
        if (zBooleanValue) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" tokenmapsize");
        sbLIZ.append(this.LLILZIL.LJIIIIZZ.size());
        C201955140j.LIZIZ("jaden-aiself", C2188811AlT.LIZIZ(sbLIZ));
        EnumC2215301Bn6 enumC2215301Bn64 = EnumC2215301Bn6.TOTAL;
        EnumC20175313wt enumC20175313wt4 = EnumC20175313wt.FAIL;
        this.LLILZIL.getClass();
        C20175213ws.LIZ(c20175213ws, enumC2215301Bn64, enumC20175313wt4, C2286608xc.LJFF(SystemClock.elapsedRealtime() - this.LLIZ), "slow", null, null, 48);
        this.LLILZIL.LJFF(1, "other", false);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZLL);
        c1389890mGx.LJIIIZ(2131825962);
        c1389890mGx.LJIIJJI();
        C786410Ut5.LJIIJJI(dialogC1390150mHNLIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.uploadWithoutCheckValid$1");
        return unit3;
    }
}
