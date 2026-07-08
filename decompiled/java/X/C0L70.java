package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L70, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.draft.AILiveDraftHelper$saveDraftWithNewCreationIdBeforePublish$1", f = "AILiveDraftHelper.kt", l = {144}, m = "invokeSuspend")
public final class C0L70 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L70(String str, VideoPublishEditModel videoPublishEditModel, String str2, int i, String str3, Context context, long j, InterfaceC1364105Vn<? super C0L70> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
        this.LLIZ = context;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L70(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        C1C7U.LIZ("AILiveDraftHelper@dc9c.saveDraftWithNewCreationIdBeforePublish$1");
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
            new C1438570nXT(this.LLILLJJLI);
            AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(this.LLILLL);
            String str = this.LLILLL.creativeModel.nleInfoModel.nleDataPath;
            if (C123100dR.LIZ(str) && C123100dR.LIZ(this.LLILLL.getNleData())) {
                String nleData = this.LLILLL.getNleData();
                if (nleData == null) {
                    nleData = "";
                }
                C2350209Iu.LIZ(str, nleData);
            }
            C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILLJJLI;
            this.LL = 1;
            obj = c0m6fLJI.LJII(videoPublishEditModel, awemeDraftLIZLLL, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILiveDraftHelper@dc9c.saveDraftWithNewCreationIdBeforePublish$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            C0L76 c0l76 = C0L76.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveDraftWithNewCreationIdBeforePublish success，from=");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(", copy fail");
            C201955140j.LJIIIIZZ(c0l76, "AILiveDraftHelper", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                iCreationAsyncTaskManagerLIZ.LJJIJIIJI(this.LLILZLL, this.LLILZ);
            }
            Context contextLIZIZ = this.LLIZ;
            C19EG c19egLIZIZ = null;
            if (contextLIZIZ != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (contextLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null)) {
                c19egLIZIZ = C1388190mED.LIZIZ(contextLIZIZ);
            }
            C537710L6z c537710L6z = C537710L6z.LIZ;
            int i2 = this.LLILZIL;
            c537710L6z.getClass();
            C537710L6z.LIZLLL(i2, c19egLIZIZ);
            C0L76 c0l762 = C0L76.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveDraftWithNewCreationIdBeforePublish success，from=");
            sbLIZ2.append(this.LLILZIL);
            sbLIZ2.append(", duration=");
            sbLIZ2.append(System.currentTimeMillis() - this.LLIZLLLIL);
            C201955140j.LJIIIIZZ(c0l762, "AILiveDraftHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILiveDraftHelper@dc9c.saveDraftWithNewCreationIdBeforePublish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
