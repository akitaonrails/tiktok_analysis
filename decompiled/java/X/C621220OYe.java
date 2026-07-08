package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0OYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinVoiceContentWidget$onPlayClicked$2", f = "BulletinVoiceContentWidget.kt", l = {838}, m = "invokeSuspend")
public final class C621220OYe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C621210OYd LLILLJJLI;
    public final /* synthetic */ C2231808om LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ BulletinVoiceItem LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C621220OYe(C621210OYd c621210OYd, C2231808om c2231808om, String str, BulletinVoiceItem bulletinVoiceItem, String str2, String str3, InterfaceC1364105Vn<? super C621220OYe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c621210OYd;
        this.LLILLL = c2231808om;
        this.LLILZ = str;
        this.LLILZIL = bulletinVoiceItem;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C621220OYe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinVoiceContentWidget@e67c.onPlayClicked$2");
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
            this.LLILLJJLI.LJJ(true);
            C2231808om c2231808om = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL.LLJIJIL;
            String str4 = this.LLILZLL;
            this.LL = 1;
            obj = c2231808om.LIZ(str2, str3, str4, "click").LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinVoiceContentWidget@e67c.onPlayClicked$2");
                return objLJFF;
            }
        }
        String str5 = (String) obj;
        this.LLILLJJLI.LJJ(false);
        if (str5 != null) {
            BulletinVoiceItem bulletinVoiceItem = this.LLILLJJLI.LJIILIIL;
            if (bulletinVoiceItem != null) {
                str = bulletinVoiceItem.LLILZLL;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, this.LLILZ)) {
                this.LLILLJJLI.LJIILLIIL(this.LLIZ, str5);
            }
        } else {
            C2233808p6 c2233808p6 = C2233808p6.LIZ;
            String str6 = this.LLILZ;
            c2233808p6.getClass();
            C2233808p6.LJ(str6, "download_failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceContentWidget@e67c.onPlayClicked$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
