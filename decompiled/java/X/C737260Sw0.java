package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.social.sticker.service.secretreplies.SecretRepliesApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Sw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.service.SecretRepliesManager$postSecretReply$1", f = "SecretRepliesManager.kt", l = {42}, m = "invokeSuspend")
public final class C737260Sw0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C737240Svy LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C737260Sw0(Aweme aweme, C737240Svy c737240Svy, String str, View view, InterfaceC1364105Vn<? super C737260Sw0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c737240Svy;
        this.LLILZ = str;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C737260Sw0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int errorCode;
        C1C1Q c1c1q;
        C1518210pbv c1518210pbv;
        C1C7U.LIZ("SecretRepliesManager@ff73.postSecretReply$1");
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
            C1C1T c1c1t = C2203191BKr.LIZ(this.LLILLJJLI).socialBlob;
            if (c1c1t == null || (c1c1q = c1c1t.secret_reply_blob) == null || (c1518210pbv = c1c1q.secret_reply_sticker_blob) == null || (str = c1518210pbv.prompt_text) == null) {
                str = "";
            }
            C737280Sw2 c737280Sw2LJFF = this.LLILLL.LJFF();
            String aid = this.LLILLJJLI.getAid();
            String str2 = this.LLILZ;
            c737280Sw2LJFF.getClass();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"reply_text\": \"");
                sbLIZ.append(str2);
                sbLIZ.append("\", \"prompt_text\": \"");
                sbLIZ.append(str);
                sbLIZ.append("\"}");
                errorCode = SecretRepliesApi.LIZIZ.postSecretRepliesReply(aid, 3, C2188811AlT.LIZIZ(sbLIZ)).execute().LIZIZ.status_code;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (e instanceof C0XIR) {
                    errorCode = ((C23112093u) e).getErrorCode();
                } else {
                    errorCode = -1;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C783750Uon c783750Uon = new C783750Uon(errorCode, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c783750Uon) == objLJFF) {
                C1C7U.LIZIZ("SecretRepliesManager@ff73.postSecretReply$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecretRepliesManager@ff73.postSecretReply$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
