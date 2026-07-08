package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OKN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$startVoiceUploadPipeline$1$onUploadSuccess$1", f = "BulletinPublishManager.kt", l = {833}, m = "invokeSuspend")
public final class C0OKN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BulletinVoiceItem LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OKN(String str, BulletinVoiceItem bulletinVoiceItem, boolean z, Map<String, String> map, InterfaceC1364105Vn<? super C0OKN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = bulletinVoiceItem;
        this.LLILZ = z;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OKN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPublishManager@9c10.startVoiceUploadPipeline$1$onUploadSuccess$1");
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
            C0OOY c0ooy = C0OOY.LIZ;
            String str = this.LLILLJJLI;
            BulletinVoiceItem bulletinVoiceItem = this.LLILLL;
            boolean z = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            this.LL = 1;
            if (c0ooy.LJIILLIIL(str, bulletinVoiceItem, z, map, C0OP0.DEFAULT, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinPublishManager@9c10.startVoiceUploadPipeline$1$onUploadSuccess$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPublishManager@9c10.startVoiceUploadPipeline$1$onUploadSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
